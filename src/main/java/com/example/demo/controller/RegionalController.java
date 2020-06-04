package com.example.demo.controller;

import com.example.demo.entity.V_CY_WDJT_DBSJ_DC;
import com.example.demo.entity.V_CY_WDJT_DBSJ_QY;
import com.example.demo.service.RegionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class RegionalController {
    @Autowired
    RegionalService regionalService;

    // 用于展示具体电厂的数据 根据当前获取日期，获取当前月份数据，并且对其进行排序
    @RequestMapping(value = "/dataByDC",method = RequestMethod.GET)
    public List<V_CY_WDJT_DBSJ_DC>  findDataByDC(@RequestParam String date){
        return regionalService.findDataByDC(date);
    }

    // 用于展示整体区域的数据 根据当前获取的日期，获取当前月份前一整年的数据
    @RequestMapping(value = "/dataByQY",method = RequestMethod.GET)
    public List<List<V_CY_WDJT_DBSJ_QY>> findDataByQY(@RequestParam String date){
        return regionalService.findDataByQY(date);
    }
}
