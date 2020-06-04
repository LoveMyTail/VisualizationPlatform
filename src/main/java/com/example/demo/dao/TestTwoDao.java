package com.example.demo.dao;

import com.example.demo.entity.TestThree;
import com.example.demo.entity.TestTwo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestTwoDao {

    // 要获得各个电厂的单月的入厂标单（含税）排名
    List<TestTwo> findTaxBidByCompany();

    // 要获得各个电厂的单月入厂表单（含税）排名
    List<TestTwo> findTaxBidByPlant();

}
