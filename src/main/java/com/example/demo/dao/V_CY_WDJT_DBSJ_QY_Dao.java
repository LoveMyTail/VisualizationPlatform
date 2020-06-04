package com.example.demo.dao;

import com.example.demo.entity.V_CY_WDJT_DBSJ_QY;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface V_CY_WDJT_DBSJ_QY_Dao {
    // 各月各个集团的数据，该部分数据用于区域对标
    List<V_CY_WDJT_DBSJ_QY> findDataByQy();
}
