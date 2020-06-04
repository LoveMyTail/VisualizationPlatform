package com.example.demo.dao;

import com.example.demo.entity.V_SJGT_HEAD_YDWCQK;
import com.example.demo.entity.V_SJGT_RMJGYBB_CNFY;
import com.example.demo.entity.V_SJGT_SJFX_KCLZJ;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AnalyseDao {

    // 入炉入厂标单对比数据  now为当前月份 early为当前月的十二月之前的月份
    List<V_SJGT_HEAD_YDWCQK> getRLRCBDByMonth(@Param("early") String early, @Param("now") String now, @Param("table") String table);

    // 库存量质价  now为当前月份 early为当前月的十二月之前的月份
    List<V_SJGT_SJFX_KCLZJ> getKCLZJByMonth(@Param("early") String early, @Param("now") String now, @Param("area") String area);

    // 厂内费用
    List<V_SJGT_RMJGYBB_CNFY> getCNFYData(@Param("early") String early, @Param("now") String now, @Param("area") String area);

    // 当期厂内费用构成
    List<V_SJGT_RMJGYBB_CNFY> getCNFYDataForTable(@Param("month") String month, @Param("areaName") String areaName);

    // 入炉综合标单构成情况
    String getRLBD(Map<String, Object> map);

    // 累计库存数据
    String getLJKC(Map<String, Object> map);


}
