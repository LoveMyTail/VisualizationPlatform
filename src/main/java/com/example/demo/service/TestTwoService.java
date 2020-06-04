package com.example.demo.service;

import com.example.demo.entity.TestTwo;

import java.util.List;

public interface TestTwoService {

    List<TestTwo> findTaxBidByCompany();
    List<List<TestTwo>> findTaxBidByPlant();
}
