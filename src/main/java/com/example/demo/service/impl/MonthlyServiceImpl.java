package com.example.demo.service.impl;

import com.example.demo.utils.JedisPoolUtils;
import com.example.demo.dao.MonthlyDao;
import com.example.demo.entity.V_SJGT_HEAD_RMJGYBB_MXB;
import com.example.demo.entity.V_SJGT_HEAD_YDKCQX;
import com.example.demo.entity.V_SJGT_RMGHCYB_MXB;
import com.example.demo.service.MonthlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;

@Service
public class MonthlyServiceImpl implements MonthlyService {
    @Autowired
    MonthlyDao monthlyDao;
    @Autowired
    JedisPoolUtils jedisPoolUtils;
    @Autowired
    RedisServiceImpl redisService;

    String typeName = "monthly";

    /**
     * 前端返回的是年份-月份的数据，此处需要返回的是该数据所对应一整年的数据
     * 先对字符串进行切割，查询后将排好序的数据返回
     * 月进耗存-入厂标单和 月度指标完成曲线
     *
     * @param month
     * @return
     */
    @Override
    public List<V_SJGT_HEAD_YDKCQX> findAllYearByMonth(String month) {
        String s = month.substring(0, 4);
        //Jedis jedis = jedisPoolUtils.getJedis();
        //System.out.println("从缓存中查找");
        //System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Object obj = redisService.get(typeName + "findAllYearByMonth" + s);
        if (obj != null) {
            return (List<V_SJGT_HEAD_YDKCQX>) obj;
        } else {
            List<V_SJGT_HEAD_YDKCQX> allYearByMonth = monthlyDao.findAllYearByMonth(s);
            // 此处是否需要对数据进行处理？数据存在缺失的可能？
            // 数据在缓存中默认保存12小时
            redisService.set("monthly" + "findAllYearByMonth" + s,allYearByMonth,60*60*12);
            return allYearByMonth;
        }
    }

    @Override
    public String[] getMonthlyCompletion(String str) {
        Object obj = redisService.getKey(typeName + "getMonthlyCompletion" + str);
        if (obj!=null){
            String s = (String)obj;
            return s.split(",");
        }else{
            HashMap<String, Object> map = new HashMap<>();
            map.put("c_info", str);
            monthlyDao.getMonthlyCompletion(map);
            String result = (String) map.get("result");
            redisService.setStr(typeName + "getMonthlyCompletion" + str,result,60*60*24l);
            String[] split = result.split(",");
            return split;
        }

    }

    @Override
    public String[] getLFStructure(String str) {
        Object obj = redisService.getKey(typeName + "getLFStructure" + str);
        if (obj!=null){
            String s = (String)obj;
            return s.split(",");
        }else{
            HashMap<String, Object> map = new HashMap<>();
            map.put("c_info", str);
            monthlyDao.getLFStructure(map);
            String result = (String) map.get("result");
            redisService.setStr( typeName + "getLFStructure" + str,result,60*60*24l);
            return result.split(",");
        }

    }

    /**
     * 此处根据月份获取数据
     *
     * @param month 获取的数据类似‘2018-01’
     * @return 返回的是去除重复后的数据
     */
    @Override
    public HashMap<String, HashMap<String, Double>> getRMGHCYBTotalMonth(String month) {
        List<V_SJGT_RMGHCYB_MXB> data = monthlyDao.getRMGHCYBTotalMonth(month);
        // 此处获取的是根据SID排序的数据，先对数据进行处理，去除重复数据
        for (int i = 0; i < data.size() - 1; ) {
            if (data.get(i).getSID().equals(data.get(i + 1).getSID())) {
                data.remove(i);
            } else {
                i++;
            }
        }
        HashMap<String, HashMap<String, Double>> hashMap = getDataFromListToHashMap(data);
        /*HashMap<String, HashMap<String, Double>> map = new HashMap<>();
        HashMap<String, Double> CGLX = new HashMap<>();        // 采购类型
        HashMap<String, Double> MZ = new HashMap<>();          // 煤种
        HashMap<String, Double> YSFS = new HashMap<>();        // 运输方式
        for (int i = 0; i < data.size() - 1;i++) {
            // 当前一条数据的 矿发数量（入厂）
            Double num = data.get(i).getKFSLRC();
            // 判断采购类型中是否存在当前的采购类型，如果存在，则在该采购类型的煤量上累加，否则就新加入该种采购类型
            if (CGLX.containsKey(data.get(i).getCGLX())) {
                Double cur = CGLX.get(data.get(i).getCGLX());
                cur += num;
                CGLX.put(data.get(i).getCGLX(),cur);
            } else {
                CGLX.put(data.get(i).getCGLX(), num);
            }
            if (MZ.containsKey(data.get(i).getMZ())) {
                Double cur = MZ.get(data.get(i).getMZ());
                cur += num;
                MZ.put(data.get(i).getMZ(),cur);
            }else{
                MZ.put(data.get(i).getMZ(),num);
            }
            if (YSFS.containsKey(data.get(i).getYSFS())){
                Double cur = YSFS.get(data.get(i).getYSFS());
                cur+=num;
                YSFS.put(data.get(i).getYSFS(),cur);
            }else{
                YSFS.put(data.get(i).getYSFS(),num);
            }
            System.out.println(CGLX);
            System.out.println(MZ);
            System.out.println(YSFS);
        }
        map.put("采购类型", CGLX);
        map.put("煤种", MZ);
        map.put("运输方式", YSFS);*/
        return hashMap;
    }


    /**
     * 此处根据年份获取数据
     *
     * @param year 传入的参数为年份的字符串，类似‘2018’
     * @return
     */
    @Override
    public HashMap<String, HashMap<String, Double>> getRMGHCYBTotalYear(String year) {
        List<V_SJGT_RMGHCYB_MXB> data = monthlyDao.getRMGHCYBTotalYear(year);
        // 此处获取的是根据SID排序的数据，先对数据进行处理，去除重复数据
        for (int i = 0; i < data.size() - 1; ) {
            if (data.get(i).getSID().equals(data.get(i + 1).getSID())) {
                data.remove(i);
            } else {
                i++;
            }
        }
        HashMap<String, HashMap<String, Double>> hashMap = getDataFromListToHashMap(data);
        return hashMap;
    }

    /**
     * 根据月份获取价格明细数据
     *
     * @param month 获取的数据类似‘2018-01’
     * @return
     */
    @Override
    public List<V_SJGT_HEAD_RMJGYBB_MXB> getDataByMonth(String month) {
        Object obj = redisService.get(typeName + "getDataByMonth" + month);
        if (obj!=null){
            System.out.println("从缓存中查找");
            return (List<V_SJGT_HEAD_RMJGYBB_MXB>)(obj);
        }else{
            List<V_SJGT_HEAD_RMJGYBB_MXB> data = monthlyDao.getDataByMonth(month);
            // 此处获取的是根据SID排序的数据，先对数据进行处理，去除重复数据
            for (int i = 0; i < data.size() - 1; ) {
                if (data.get(i).getSID().equals(data.get(i + 1).getSID())) {
                    data.remove(i);
                } else {
                    i++;
                }
            }
            redisService.set(typeName + "getDataByMonth" + month,data,60*60*24);
            return data;
        }

    }


    // 将原本List中的关键数据存入HashMap中
    public HashMap<String, HashMap<String, Double>> getDataFromListToHashMap(List<V_SJGT_RMGHCYB_MXB> data) {
        HashMap<String, HashMap<String, Double>> map = new HashMap<>();
        HashMap<String, Double> CGLX = new HashMap<>();        // 采购类型
        HashMap<String, Double> MZ = new HashMap<>();          // 煤种
        HashMap<String, Double> YSFS = new HashMap<>();        // 运输方式
        for (int i = 0; i < data.size() - 1; i++) {
            // 当前一条数据的 矿发数量（入厂）
            Double num = data.get(i).getKFSLRC();
            // 判断采购类型中是否存在当前的采购类型，如果存在，则在该采购类型的煤量上累加，否则就新加入该种采购类型
            if (CGLX.containsKey(data.get(i).getCGLX())) {
                Double cur = CGLX.get(data.get(i).getCGLX());
                cur += num;
                CGLX.put(data.get(i).getCGLX(), cur);
            } else {
                CGLX.put(data.get(i).getCGLX(), num);
            }
            if (MZ.containsKey(data.get(i).getMZ())) {
                Double cur = MZ.get(data.get(i).getMZ());
                cur += num;
                MZ.put(data.get(i).getMZ(), cur);
            } else {
                MZ.put(data.get(i).getMZ(), num);
            }
            if (YSFS.containsKey(data.get(i).getYSFS())) {
                Double cur = YSFS.get(data.get(i).getYSFS());
                cur += num;
                YSFS.put(data.get(i).getYSFS(), cur);
            } else {
                YSFS.put(data.get(i).getYSFS(), num);
            }
        }
        map.put("采购类型", CGLX);
        map.put("煤种", MZ);
        map.put("运输方式", YSFS);
        return map;
    }
}
