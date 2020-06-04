package com.example.demo.service.impl;

import com.example.demo.dao.HomePageDao;
import com.example.demo.entity.V_CYGS_RBXX;
import com.example.demo.entity.V_HEAD_DRSJ;
import com.example.demo.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

@Service
public class HomePageServiceImpl implements HomePageService {
    @Autowired
    HomePageDao homePageDao;
    @Autowired
    RedisServiceImpl redisService;

    String typeName = "homepage";

    /**
     * 调运基本数据，包括对应日期，本日进煤量、本日在运量、本日耗用量、本日发电量等
     * @param map
     * @return
     */
    @Override
    public String[] getDCInfo(Map<String,Object> map) {
        homePageDao.getDCInfo(map);
        String result = (String)map.get("result");
        String[] split = result.split(",");
        return split;
    }

    /**
     * 入厂标单
     * 从视图中获取日报相关数据
     *
     * @return
     */
    @Override
    public List<V_CYGS_RBXX> getRBInfo() {
        Object obj = redisService.get(typeName + "getRBInfo");
        if (obj!=null){
            return (List<V_CYGS_RBXX>)obj;
        }else{
            List<V_CYGS_RBXX> info = homePageDao.getRBInfo();
            redisService.set(typeName + "getRBInfo",info,60*60*24);
            return info;
        }
    }

    /**
     * 其他相关数据
     * @param map
     * @return
     */
    @Override
    public String[] getHeadZHBTInfo(Map<String, Object> map) {
        homePageDao.getHeadZHBTInfo(map);
        String result = (String)map.get("result");
        String[] split = result.split(",");
        return split;
    }

    /**
     * 当日数据，用于首页左上角部分
     * 但是没有在运量与待卸量数据
     * @return
     */
    @Override
    public List<V_HEAD_DRSJ> getDRSJ() {
        Object obj = redisService.get(typeName + "getDRSJ");
        if (obj!=null){
            return (List<V_HEAD_DRSJ>)obj;
        }else{
            List<V_HEAD_DRSJ> data = homePageDao.getDRSJ();
            redisService.set(typeName + "getDRSJ",data,60*60*24);
            return data;
        }
    }


}
