package com.example.demo.controller;

import com.example.demo.entity.V_SJGT_HEAD_RMJGYBB_MXB;
import com.example.demo.entity.V_SJGT_HEAD_YDKCQX;
import com.example.demo.service.MonthlyService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class MonthlyController {
    @Autowired
    MonthlyService monthlyService;

    /**
     * 月进耗存-入厂标单和 月度指标完成曲线
     * @param date 传来的是某个月份
     * @return  返回当前一整年的数据
     */
    @RequestMapping(value = "/findYearByMonth",method = RequestMethod.GET)
    public List<V_SJGT_HEAD_YDKCQX> findYearByMonth(@RequestParam String date){
        List<V_SJGT_HEAD_YDKCQX> allYearByMonth = monthlyService.findAllYearByMonth(date);
        return allYearByMonth;
    }

    /**
     * 月度指标完成情况表
     * @param str
     * @return
     */
    @RequestMapping(value = "/getMonthlyCompletion",method = RequestMethod.GET)
    public String[] getMonthlyCompletion(@RequestParam String str){
        String[] completion = monthlyService.getMonthlyCompletion(str);
        return completion;
    }

    /**
     * 月度采购-年度采购结构  硫份结构数据
     * @param str 输入的是类似   2019-01湖北区域
     * @return
     */
    @RequestMapping(value = "/getLFStructure",method = RequestMethod.GET)
    public String[] getLFStructure(@RequestParam String str){
        String[] structure = monthlyService.getLFStructure(str);
        return structure;
    }

    /**
     * 年度采购类型 - 采购结构、煤种、运输方式
     * @param date
     * @return
     */
    @RequestMapping(value = "/getRMGHCYBTotalYear",method = RequestMethod.GET)
    public HashMap<String,HashMap<String,Double>> getRMGHCYBTotalYear(@RequestParam String date){
        HashMap<String, HashMap<String, Double>> hashMap = monthlyService.getRMGHCYBTotalYear(date.substring(0,4));
        return hashMap;
    }

    /**
     * 月度采购结构 - 采购类型、煤种、运输方式
     * @param date
     * @return
     */
    @RequestMapping(value = "/getRMGHCYBTotalMonth", method = RequestMethod.GET)
    public HashMap<String,HashMap<String,Double>> getRMGHCYBTotalMonth(@RequestParam String date){
        return monthlyService.getRMGHCYBTotalMonth(date);
    }

    @RequestMapping(value = "/getDetailDataByMonth", method = RequestMethod.GET)
    public List<V_SJGT_HEAD_RMJGYBB_MXB> getDataByMonth(@RequestParam String date){
        return monthlyService.getDataByMonth(date);
    }

}
