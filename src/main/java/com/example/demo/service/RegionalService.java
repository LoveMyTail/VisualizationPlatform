package com.example.demo.service;

import com.example.demo.entity.V_CY_WDJT_DBSJ_DC;
import com.example.demo.entity.V_CY_WDJT_DBSJ_QY;

import java.util.List;

public interface RegionalService {

    //根据月份获取当前一整年的区域数据
    List<List<V_CY_WDJT_DBSJ_QY>> findDataByQY(String date);

    //根据当前月份获取当月的电厂数据
    List<V_CY_WDJT_DBSJ_DC> findDataByDC(String date);

    //要获得各个电厂的单月的入厂标单（含税）排名
    //List<List<V_CY_WDJT_DBSJ_DC>> findDY_RCBMDJ_HSByDC();




}
