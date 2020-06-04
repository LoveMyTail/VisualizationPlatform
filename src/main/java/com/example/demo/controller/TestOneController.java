package com.example.demo.controller;

import com.example.demo.entity.TestOne;
import com.example.demo.service.TestOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin   //防止后端报错 No 'Access-Control-Allow-Origin' header is present on the requested resource
@RestController
@RequestMapping(value = "/api")
public class TestOneController {
    @Autowired
    TestOneService testOneService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<TestOne> findAll(){
        return testOneService.findAll();
    }
}
