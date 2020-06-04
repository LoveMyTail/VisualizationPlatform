package com.example.demo.service.impl;

import com.example.demo.dao.AnalyseDao;
import com.example.demo.entity.*;
import com.example.demo.service.AnalyseService;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class AnalyseServiceImpl implements AnalyseService {

    @Autowired
    AnalyseDao analyseDao;
    @Autowired
    RedisServiceImpl redisService;

    String typeName = "analyse";

    /**
     * 入炉入厂标单对比数据
     * 获取当前月前一年的数据
     * 由于数据来自于不同的表，所以根据area选择不同的 tableName
     *
     * @param month 当前被选择的月份
     * @param area  当前被选择区域
     * @return
     */
    @Override
    public List<V_SJGT_HEAD_YDWCQK> getRLRCBDByMonth(String month, String area) throws ParseException {
        // 获取12月以内的数据
        String early = getEarlyDate(month, 23);
        // 根据区域名获取需要查找的表明
        String table = getTableName(area);
        List<V_SJGT_HEAD_YDWCQK> data = analyseDao.getRLRCBDByMonth(early, month, table);
        // 数据存在缺失的情况，还需对数据进行处理，如果数据为空，则根据空参构造方法补一个
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        String curDate = early;
        for (int i = 0; i < data.size(); ) {
            if (data.get(i).getYF().equals(curDate)) {
                i++;
                curDate = simpleDateFormat.format(DateUtils.addMonths(simpleDateFormat.parse(curDate), 1));
            } else {
                data.add(i, new V_SJGT_HEAD_YDWCQK(curDate));
                i++;
                curDate = simpleDateFormat.format(DateUtils.addMonths(simpleDateFormat.parse(curDate), 1));
            }
        }
        return data;
    }

    /**
     * 库存量质价数据
     * 获取当前月一年前的数据
     *
     * @param month
     * @param area
     * @return
     */
    @Override
    public List<V_SJGT_SJFX_KCLZJ> getKCLZJByMonth(String month, String area) throws ParseException {
        String early = getEarlyDate(month, 11);
        String areaName = getAreaName(area);
        List<V_SJGT_SJFX_KCLZJ> data = analyseDao.getKCLZJByMonth(early, month, areaName);
        // 数据存在缺失的情况，还需对数据进行处理，如果数据为空，则根据空参构造方法补一个
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        String curDate = early;
        for (int i = 0; i < data.size(); ) {
            if (data.get(i).getYF().equals(curDate)) {
                i++;
                curDate = simpleDateFormat.format(DateUtils.addMonths(simpleDateFormat.parse(curDate), 1));
            } else {
                data.add(i, new V_SJGT_SJFX_KCLZJ(curDate));
                i++;
                curDate = simpleDateFormat.format(DateUtils.addMonths(simpleDateFormat.parse(curDate), 1));
            }
        }

        return data;
    }

    /**
     * 厂内费用
     * 获取12个月以内的数据
     * 如果所需月份的数据不存在，则为设置为null，返回的结果集需要12条数据
     * 用于作为当前厂内费用以及上年厂内费用
     *
     * @param month
     * @param area
     * @return
     */
    @Override
    public List<AnalyseCNFYData> getCNFYData(String month, String area) throws ParseException {
        List<AnalyseCNFYData> list = new ArrayList<>();
        String earlyDate = getEarlyDate(month, 23);
        String areaName = getAreaName(area);
        List<V_SJGT_RMJGYBB_CNFY> data = analyseDao.getCNFYData(earlyDate, month, areaName);
        // 存在数据重复的情况
        List<V_SJGT_RMJGYBB_CNFY> cur = removeDuplicationBySID(data);
        // 数据取过去12个月的数据，则需要对数据进行合并，不需要对不同的费用类型进行区分
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        String curDate = earlyDate;
        for (int i = 0; i < cur.size() - 1; ) {
            if (cur.get(i).getYF().substring(0, 7).equals(curDate)) {
                double temp = cur.get(i).getFYMXJE();
                while (cur.get(i).getYF().equals(cur.get(i + 1).getYF())) {
                    if (cur.get(i + 1).getFYMXJE() != null) {
                        temp += cur.get(i + 1).getFYMXJE();
                    }
                    i++;
                    if (i == cur.size() - 1) {
                        break;
                    }
                }
                list.add(new AnalyseCNFYData(curDate, temp));
                i++;
                curDate = simpleDateFormat.format(DateUtils.addMonths(simpleDateFormat.parse(curDate), 1));
            } else {
                list.add(new AnalyseCNFYData(curDate, null));
                curDate = simpleDateFormat.format(DateUtils.addMonths(simpleDateFormat.parse(curDate), 1));
            }
        }
        return list;
    }

    /**
     * 当期厂内费用构成，返回值为HashMap
     * 返回的键值对为：费用名称-金额
     *
     * @param month
     * @param area
     * @return
     */
    @Override
    public HashMap<String, Double> getCNFYForTable(String month, String area) {
        HashMap<String, Double> map = new HashMap<>();
        List<V_SJGT_RMJGYBB_CNFY> data;
        String areaName = getAreaName(area);
        Object obj = redisService.get(typeName + "getCNFYForTable" + month + areaName);
        if (obj!=null){
            data = (List<V_SJGT_RMJGYBB_CNFY>) obj;
        }else{
            data = removeDuplicationBySID(analyseDao.getCNFYDataForTable(month, areaName));
        }
        for (int i = 0; i < data.size(); i++) {
            if (map.containsKey(data.get(i).getFYXMZ())) {
                map.put(data.get(i).getFYXMZ(), data.get(i).getFYMXJE() + map.get(data.get(i).getFYXMZ()));
            } else {
                map.put(data.get(i).getFYXMZ(), data.get(i).getFYMXJE());
            }
        }
        return map;
    }


    /**
     * 入炉综合标单构成情况
     *
     * @param month
     * @param area
     * @return
     */
    @Override
    public String[] getRLBD(String month, String area) {
        Object obj = redisService.getKey(typeName + "getRLBD" + month + area);
        if (obj!=null){
            String s = (String)obj;
            return s.split(",");
        }else{
            HashMap<String, Object> map = new HashMap<>();
            map.put("c_info", month + area);
            analyseDao.getRLBD(map);
            String result = (String) map.get("result");
            redisService.setStr(typeName + "getRLBD" + month + area,result,60*60*24l);
            return result.split(",");
        }

    }

    /**
     * 累计库存数据-库存量质价表格以及饼状图
     *
     * @param month
     * @param area
     * @return
     */
    @Override
    public String[] getLJKC(String month, String area) {
        Object obj = redisService.getKey(typeName + "getLJKC" + month + area);
        if (obj!=null){
            String s = (String)obj;
            return s.split(",");
        }else{
            HashMap<String, Object> map = new HashMap<>();
            map.put("c_info", month + area);
            analyseDao.getLJKC(map);
            String result = (String) map.get("result");
            redisService.setStr(typeName + "getLJKC" + month + area,result,60*60*24l);
            return  result.split(",");
        }
    }


    /**
     * 根据区域名称获取表名
     *
     * @param area
     * @return
     */
    private String getTableName(String area) {
        String cur = "V_SJGT_HEAD_YDWCQK_";
        if (area.equals("长源公司")) {
            return cur + "CYGS";
        } else if (area.equals("荆门电厂")) {
            return cur + "JMDC";
        } else if (area.equals("青山电厂")) {
            return cur + "QSDC";
        } else if (area.equals("荆州热电")) {
            return cur + "JZDC";
        } else if (area.equals("汉川一发")) {
            return cur + "HCYF";
        } else if (area.equals("国电汉川")) {
            return cur + "GDHC";
        } else if (area.equals("汉川小计")) {
            return cur + "HCDC";
        } else {
            return cur + "QSDC";
        }
    }

    /**
     * 根据当前月份获取当前月往前i个月的月份
     *
     * @param month
     * @param i
     * @return
     */
    private String getEarlyDate(String month, int i) {
        String earlyDate = null;
        SimpleDateFormat simpleDateFormatOne = new SimpleDateFormat("yyyy-MM");
        try {
            Date now = simpleDateFormatOne.parse(month);
            Date early = DateUtils.addMonths(now, -i);
            earlyDate = simpleDateFormatOne.format(early);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return earlyDate;
    }

    /**
     * 获取全称
     *
     * @param area
     * @return
     */
    private String getAreaName(String area) {
        if (area.equals("青山电厂")) {
            return "国电青山热电有限公司";
        }
        return "国电青山热电有限公司";
    }

    /**
     * 根据SID去除数据重复
     *
     * @param data
     * @return
     */
    private List<V_SJGT_RMJGYBB_CNFY> removeDuplicationBySID(List<V_SJGT_RMJGYBB_CNFY> data) {
        for (int i = 0; i < data.size() - 1; ) {
            if (data.get(i).getSID().equals(data.get(i + 1).getSID())) {
                data.remove(i);
            } else {
                i++;
            }
        }
        return data;
    }

}
