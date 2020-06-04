package com.example.demo.controller;

import com.example.demo.entity.AnalyseCNFYData;
import com.example.demo.entity.V_SJGT_HEAD_YDWCQK;
import com.example.demo.entity.V_SJGT_RMJGYBB_CNFY;
import com.example.demo.entity.V_SJGT_SJFX_KCLZJ;
import com.example.demo.service.AnalyseService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.ResponseWrapper;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class AnalyseController {
    @Autowired
    AnalyseService analyseService;

    // 入炉入厂煤量
    @RequestMapping(value = "/getRLRCBDByMonth", method = RequestMethod.GET)
    public List<V_SJGT_HEAD_YDWCQK> getRLRCBDByMonth(@RequestParam String month, @RequestParam String area) throws ParseException {
        List<V_SJGT_HEAD_YDWCQK> data = analyseService.getRLRCBDByMonth(month, area);
        return data;
    }

    // 库存量质价
    @RequestMapping(value = "/getKCLZJByMonth", method = RequestMethod.GET)
    public List<V_SJGT_SJFX_KCLZJ> getKCLZJByMonth(@RequestParam String month, @RequestParam String area) throws ParseException {
        List<V_SJGT_SJFX_KCLZJ> data = analyseService.getKCLZJByMonth(month, area);
        return data;
    }

    // 厂内费用
    @RequestMapping(value = "/getCNFYData", method = RequestMethod.GET)
    public List<AnalyseCNFYData> getCNFYData(@RequestParam String month, @RequestParam String area) throws ParseException {
        List<AnalyseCNFYData> data = analyseService.getCNFYData(month, area);
        return data;
    }

    // 厂内费用-表格以及饼状图
    @RequestMapping(value = "/getCNFYDataForTable", method = RequestMethod.GET)
    public HashMap<String, Double> getCNFYDataForTable(@RequestParam String month, @RequestParam String area) {
        HashMap<String, Double> map = analyseService.getCNFYForTable(month, area);
        return map;
    }

    // 入炉综合标单构成分析
    @RequestMapping(value = "/getRLBD",method = RequestMethod.GET)
    public String[] getRLBD(@RequestParam String month, @RequestParam String area){
        String[] rlbd = analyseService.getRLBD(month, area);
        return rlbd;
    }

    // 累计库存数据-库存量质价表格以及饼状图
    @RequestMapping(value = "/getLJKC",method = RequestMethod.GET)
    public String[] getLJKC(@RequestParam String month, @RequestParam String area){
        return analyseService.getLJKC(month, area);
    }

}
