package com.example.demo.dao;

import com.example.demo.entity.V_HEAD_RJK_RCBD;
import com.example.demo.entity.V_SJGT_HEAD_RMJGRB_CSB;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public interface DailyDao {
    // 根据日期查询当月每日的日进耗存-日均入厂标单
    List<V_HEAD_RJK_RCBD> findByMonth(String now,String early);

    //获取日监控相关数据
    String getDailyInfo(Map<String,Object> map);

    //库存煤结构和采购信息
    String getCoalAndPurchaseInfo(Map<String,Object> map);

    // 日累计价格明细数据
    List<V_SJGT_HEAD_RMJGRB_CSB> getRMJGRB_CSB(String date);
}
