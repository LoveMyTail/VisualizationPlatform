package com.example.demo.controller;

import com.example.demo.entity.V_HEAD_RJK_RCBD;
import com.example.demo.entity.V_SJGT_HEAD_RMJGRB_CSB;
import com.example.demo.service.DailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class DailyController {
    @Autowired
    DailyService dailyService;

    /**
     * 日进耗存-日均入厂标单
     * @param date 传来的是指定的某个日期，返回的是当前日期前一个月的数据
     * @return
     */
    @RequestMapping(value = "/getByMonth",method = RequestMethod.GET)
    public List<V_HEAD_RJK_RCBD> findByMonth(@RequestParam String date){
        List<V_HEAD_RJK_RCBD> data = dailyService.findByMonth(date);
        return data;
    }

    /**
     * 日统计信息
     * 需要由前端传来的日期+区域拼接为字符串
     * @return
     */
    @RequestMapping(value = "/getDailyInfo",method = RequestMethod.GET)
    public String[] getDailyInfo(@RequestParam String str){
        String[] info = dailyService.getDailyInfo(str);
        return info;
    }

    /**
     * 库存煤结构和采购信息
     * 需要由前端传来的日期+区域拼接为字符串
     * @return
     */
    @RequestMapping(value = "/getCoalAndPurchaseInfo",method = RequestMethod.GET)
    public String[] getCoalAndPurchaseInfo(@RequestParam String str){
        String[] info = dailyService.getCoalAndPurchaseInfo(str);
        return info;
    }

    /**
     * 日累计价格明细
     * @param str 传来的是类似‘2018-06-30’的日期格式
     * @return
     */
    @RequestMapping(value = "/getRMJGRB_CSB")
    public List<V_SJGT_HEAD_RMJGRB_CSB> getRMJGRB_CSB(@RequestParam String str){
        return dailyService.getRMJGRB_CSB(str);
    }

}
