package com.example.demo;

import com.example.demo.dao.*;
import com.example.demo.service.impl.RedisServiceImpl;
import com.example.demo.utils.JedisPoolUtils;
import com.example.demo.entity.*;
import com.example.demo.service.TestTwoService;
import com.example.demo.utils.SerializeUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    RegionalDao regionalDao;
    @Autowired
    TestTwoService testTwoService;
    @Autowired
    HomePageDao homePageDao;
    @Autowired
    DailyDao dailyDao;
    @Autowired
    MonthlyDao monthlyDao;
    @Autowired
    AnalyseDao analyseDao;
    @Autowired
    JedisPoolUtils jedisPoolUtils;
    @Autowired
    RedisServiceImpl redisService;
    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
    }


    @Test
    public void test(){
        List<V_CY_WDJT_DBSJ_DC> list = regionalDao.findDataByDC("2019-1");
        List<V_CY_WDJT_DBSJ_QY> data = regionalDao.findDataByQY("2018-1", "2019-1");
        System.out.println(list);
    }
}
