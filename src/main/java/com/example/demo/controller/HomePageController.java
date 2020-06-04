package com.example.demo.controller;

import com.example.demo.entity.V_CYGS_RBXX;
import com.example.demo.entity.V_HEAD_DRSJ;
import com.example.demo.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class HomePageController {
    @Autowired
    HomePageService homePageService;

    /**
     * 从视图v_cygs_rbxx中获取日报相关数据
     * 包括库存量，入厂煤量，入厂标单的
     * @return
     */
    @RequestMapping(value = "/getRBInfo", method = RequestMethod.GET)
    public List<V_CYGS_RBXX> getRBInfo() {
        //System.out.println(homePageService.getRBInfo());
        return homePageService.getRBInfo();
    }

    @RequestMapping(value = "/getDCInfo",method = RequestMethod.GET)
    public String[] getDCInfo(){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("c_info","青山电厂");
        return homePageService.getDCInfo(hashMap);
    }

    @RequestMapping(value = "/getHeadZHBTInfo",method = RequestMethod.GET)
    public String[] getHeadZHBTInfo(@RequestParam String str){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("c_info",str);
        return homePageService.getHeadZHBTInfo(hashMap);
    }

    @RequestMapping(value = "/getDRSJ",method = RequestMethod.GET)
    public List<V_HEAD_DRSJ> getDRSJ(){
        return homePageService.getDRSJ();
    }
}
