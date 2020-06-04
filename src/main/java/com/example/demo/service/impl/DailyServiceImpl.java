package com.example.demo.service.impl;

import com.example.demo.utils.JedisPoolUtils;
import com.example.demo.dao.DailyDao;
import com.example.demo.entity.V_HEAD_RJK_RCBD;
import com.example.demo.entity.V_SJGT_HEAD_RMJGRB_CSB;
import com.example.demo.service.DailyService;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class DailyServiceImpl implements DailyService {
    @Autowired
    DailyDao dailyDao;
    @Autowired
    RedisServiceImpl redisService;

    String typeName = "daily";

    /**
     * 进耗存-日均入厂标单
     *
     * @param date
     * @return
     */
    @Override
    public List<V_HEAD_RJK_RCBD> findByMonth(String date) {

        SimpleDateFormat simpleDateFormatOne = new SimpleDateFormat("yyyy-MM-dd");
        List<V_HEAD_RJK_RCBD> byMonth = null;
        try {
            // 获取当前的日期
            Date now = simpleDateFormatOne.parse(date);
            // 获取当前日期前一个月的日期
            Date early = DateUtils.addMonths(now, -1);
            String nowDate = simpleDateFormatOne.format(now);
            String earlyDate = simpleDateFormatOne.format(early);
            // 查询当前日期以及其一个月内的数据
            byMonth = dailyDao.findByMonth(nowDate, earlyDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // 获取了数据后需要对数据进行处理，例如去重复，处理数据缺失等

        return byMonth;
    }

    /**
     * 获取日监控相关数据
     *
     * @param str
     * @return
     */
    @Override
    public String[] getDailyInfo(String str) {
        Object obj = redisService.getKey(typeName + "getDailyInfo" + str);
        if (obj!=null){
            String s = (String)obj;
            return s.split(",");
        }else{
            HashMap<String, Object> map = new HashMap<>();
            map.put("c_info", str);
            dailyDao.getDailyInfo(map);
            String result = (String) map.get("result");
            redisService.setStr(typeName + "getDailyInfo" + str,result,60*60*24l);
            return result.split(",");
        }

    }

    /**
     * 获取库存煤结构和采购信息
     *
     * @param str
     * @return
     */
    @Override
    public String[] getCoalAndPurchaseInfo(String str) {
        Object obj = redisService.getKey(typeName + "getCoalAndPurchaseInfo" + str);
        if (obj!=null){
            String s = (String)obj;
            return s.split(",");
        }else{
            HashMap<String, Object> map = new HashMap<>();
            map.put("c_info", str);
            dailyDao.getCoalAndPurchaseInfo(map);
            String result = (String) map.get("result");
            redisService.setStr(typeName+"getCoalAndPurchaseInfo"+str,result,60*60*24l);
            return result.split(",");
        }

    }

    @Override
    public List<V_SJGT_HEAD_RMJGRB_CSB> getRMJGRB_CSB(String str) {
        char[] chars = str.toCharArray();
        // 获取到的日期格式是类似‘2018-06-30’，此处要去掉日期中的‘-’
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '-') {
                stringBuffer.append(chars[i]);
            }
        }
        // 此时的日期格式类似‘20180630’
        String s = stringBuffer.toString();
        Object obj = redisService.get(typeName + "getRMJGRB_CSB" + s);
        if (obj != null) {
            return (List<V_SJGT_HEAD_RMJGRB_CSB>) obj;
        } else {
            List<V_SJGT_HEAD_RMJGRB_CSB> cur = dailyDao.getRMJGRB_CSB(s);
            // 对于数据进行处理-去除重复数据
            for (int i = 0; i < cur.size() - 1; ) {
                //System.out.println(cur.get(i));
                if (cur.get(i).getSID().equals(cur.get(i + 1).getSID())) {
                    cur.remove(i);
                } else {
                    i++;
                }
            }
            redisService.set(typeName + "getRMJGRB_CSB" + s, cur, 60 * 60 * 24);
            return cur;
        }
    }

}
