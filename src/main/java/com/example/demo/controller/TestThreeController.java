package com.example.demo.controller;

import com.example.demo.entity.TestThree;
import com.example.demo.service.TestThreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class TestThreeController {
    @Autowired
    TestThreeService testThreeService;

    // 返回的是根据企业分组的数据，其中补齐了缺失的数据
    @RequestMapping(value = "/findTaxBidByCompany",method = RequestMethod.GET)
    public List<List<TestThree>> findTaxBidByCompany(){
        return testThreeService.findTaxBidByCompany();
    }
}
