package com.example.demo.dao;

import com.example.demo.entity.V_SJGT_HEAD_RMJGYBB_MXB;
import com.example.demo.entity.V_SJGT_HEAD_YDKCQX;
import com.example.demo.entity.V_SJGT_RMGHCYB_MXB;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MonthlyDao {
    // 根据当前月份查询当前一整年的数据
    List<V_SJGT_HEAD_YDKCQX> findAllYearByMonth(@Param("month") String month);

    // 获取月度指标完成情况表
    String getMonthlyCompletion(Map<String, Object> map);

    // 月度采购-年度采购结构  硫份结构数据
    String getLFStructure(Map<String, Object> map);

    // 月度采购结构 按照采购类型，煤种和运输方式 此处获取的是类似‘2018-01’
    List<V_SJGT_RMGHCYB_MXB> getRMGHCYBTotalMonth(@Param("month") String month);

    // 年度采购结构 按照采购类型，煤种和运输方式 此处获取的是单纯的年份
    List<V_SJGT_RMGHCYB_MXB> getRMGHCYBTotalYear(@Param("year") String year);

    // 价格明细数据 根据月份查询数据
    List<V_SJGT_HEAD_RMJGYBB_MXB> getDataByMonth(@Param("month") String month);
}
