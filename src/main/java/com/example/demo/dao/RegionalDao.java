package com.example.demo.dao;


import com.example.demo.entity.V_CY_WDJT_DBSJ_DC;
import com.example.demo.entity.V_CY_WDJT_DBSJ_QY;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionalDao {

    List<V_CY_WDJT_DBSJ_QY> findDataByQY(@Param("early") String early, @Param("now") String now);

    List<V_CY_WDJT_DBSJ_DC> findDataByDC(@Param("month") String early);
}
