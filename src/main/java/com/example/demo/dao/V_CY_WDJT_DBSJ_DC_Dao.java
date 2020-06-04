package com.example.demo.dao;

import com.example.demo.entity.V_CY_WDJT_DBSJ_DC;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface V_CY_WDJT_DBSJ_DC_Dao {

    //要获得各个电厂的单月的入厂标单（含税）排名
    List<V_CY_WDJT_DBSJ_DC> findDY_RCBMDJ_HSByDC();
}
