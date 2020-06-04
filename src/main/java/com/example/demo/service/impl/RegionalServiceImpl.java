package com.example.demo.service.impl;

import com.example.demo.dao.RegionalDao;
import com.example.demo.dao.V_CY_WDJT_DBSJ_DC_Dao;
import com.example.demo.dao.V_CY_WDJT_DBSJ_QY_Dao;
import com.example.demo.entity.TestThree;
import com.example.demo.entity.V_CY_WDJT_DBSJ_DC;
import com.example.demo.entity.V_CY_WDJT_DBSJ_QY;
import com.example.demo.service.RegionalService;
import com.example.demo.utils.JedisPoolUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class RegionalServiceImpl implements RegionalService {

    @Autowired
    RegionalDao regionalDao;
    @Autowired
    RedisServiceImpl redisService;
    @Autowired
    JedisPoolUtils jedisPoolUtils;

    String typeName = "regional";

    /**
     * 根据月份获取前一年的数据
     * @param date
     * @return
     */
    @Override
    public List<List<V_CY_WDJT_DBSJ_QY>> findDataByQY(String date) {
        String early = getEarlyDate(date, 12);
        List<V_CY_WDJT_DBSJ_QY> list = regionalDao.findDataByQY(early,date);
        List<List<V_CY_WDJT_DBSJ_QY>> listByJT = new ArrayList<>();
        listByJT.add(new ArrayList<V_CY_WDJT_DBSJ_QY>());
        int cur = 0;
        int flag = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                listByJT.get(cur).add(list.get(i));
            }
            // 首先判断当前前后两条数据是否是同一集团
            if (i > 0 && list.get(i).getSS_JT().equals(list.get(i - 1).getSS_JT())) {
                // 当前日期是否与前一条数据的日期连贯
                if (list.get(i).getYF().equals(DateUtils.addMonths(listByJT.get(cur).get(flag).getYF(), 1))) {
                    // 当前一条数据的日期与前一条数据的日期是连贯的，则将该数据插入
                    listByJT.get(cur).add(list.get(i));
                    flag++;
                } else {
                    // 日期不连贯，考虑数据重复的情况以及数据缺失的情况
                    // 判断当前日期是否与前一条数据的日期相同，如果相同，则表示数据重复，否则则为数据缺失
                    if (list.get(i).getYF().equals(listByJT.get(cur).get(flag).getYF())) {
                        // 数据重复
                        continue;
                    } else {
                        // 数据缺失
                        V_CY_WDJT_DBSJ_QY newOne = new V_CY_WDJT_DBSJ_QY(DateUtils.addMonths(listByJT.get(cur).get(flag).getYF(), 1),
                                listByJT.get(cur).get(flag).getSS_JT(), null, null, null);
                        listByJT.get(cur).add(newOne);
                        flag++;
                        i--;
                    }
                }
            } else if (i > 0 && !list.get(i).getSS_JT().equals(list.get(i - 1).getSS_JT())) {
                listByJT.add(new ArrayList<V_CY_WDJT_DBSJ_QY>());
                flag = 0;
                cur++;
                listByJT.get(cur).add(list.get(i));
            }
        }
        return listByJT;
    }

    /**
     * 获取当前月份的电厂数据
     * @param date
     * @return
     */
    @Override
    public List<V_CY_WDJT_DBSJ_DC> findDataByDC(String date) {
        Object obj = redisService.get(typeName + "findDataByDC" + date);
        if (obj!=null){
            return (List<V_CY_WDJT_DBSJ_DC>)obj;
        }else{
            List<V_CY_WDJT_DBSJ_DC> all = regionalDao.findDataByDC(date);
            // 对于数据进行去重处理
            for (int i = 1; i < all.size();) {
                if (all.get(i).getSS_DC().equals(all.get(i-1).getSS_DC())){
                    all.remove(i);
                }else{
                    i++;
                }
            }
            redisService.set("regional" + "findDataByDC" + date,all,60*60*12);
            return all;
        }

    }

    /**
     * 根据当前月份获取当前月往前i个月的月份
     *
     * @param month
     * @param i
     * @return
     */
    private String getEarlyDate(String month, int i) {
        String earlyDate = null;
        SimpleDateFormat simpleDateFormatOne = new SimpleDateFormat("yyyy-MM");
        try {
            Date now = simpleDateFormatOne.parse(month);
            Date early = DateUtils.addMonths(now, -i);
            earlyDate = simpleDateFormatOne.format(early);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return earlyDate;
    }

}


