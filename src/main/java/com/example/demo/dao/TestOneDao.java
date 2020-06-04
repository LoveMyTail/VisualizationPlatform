package com.example.demo.dao;

import com.example.demo.entity.TestOne;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestOneDao {
    List<TestOne> findAll();
}
