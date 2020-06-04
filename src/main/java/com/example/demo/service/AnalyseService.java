package com.example.demo.service;

import com.example.demo.entity.AnalyseCNFYData;
import com.example.demo.entity.V_SJGT_HEAD_YDWCQK;
import com.example.demo.entity.V_SJGT_RMJGYBB_CNFY;
import com.example.demo.entity.V_SJGT_SJFX_KCLZJ;
import javafx.beans.binding.DoubleExpression;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AnalyseService {
    // 入炉入厂标单对比数据
    List<V_SJGT_HEAD_YDWCQK> getRLRCBDByMonth(String month, String area) throws ParseException;

    // 库存量质价
    List<V_SJGT_SJFX_KCLZJ> getKCLZJByMonth(String month, String area) throws ParseException;

    // 厂内费用 - 折线图用
    List<AnalyseCNFYData> getCNFYData(String month, String area) throws ParseException;

    // 当期厂内费用构成
    HashMap<String, Double> getCNFYForTable(String month,String area);

    // 入炉综合标单构成情况
    String[] getRLBD(String month, String area);

    // 累计库存数据
    String[] getLJKC(String month, String area);


}
