package com.example.demo.service.impl;

import com.example.demo.dao.TestOneDao;
import com.example.demo.entity.TestOne;
import com.example.demo.service.TestOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestOneServiceImpl implements TestOneService {
    @Autowired
    private TestOneDao testOneDao;

    @Override
    public List<TestOne> findAll() {
        return testOneDao.findAll();
    }
}
