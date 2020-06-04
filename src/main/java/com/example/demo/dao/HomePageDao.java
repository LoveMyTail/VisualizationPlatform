package com.example.demo.dao;

import com.example.demo.entity.V_CYGS_RBXX;
import com.example.demo.entity.V_HEAD_DRSJ;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface HomePageDao {
    String getDCInfo(Map<String,Object> map);
    List<V_CYGS_RBXX> getRBInfo();
    String getHeadZHBTInfo(Map<String,Object> map);
    // 获取当日数据，用于首页左上角部分
    List<V_HEAD_DRSJ> getDRSJ();
}
