package com.example.demo.entity;

import java.io.Serializable;

/**
 * 厂内费用数据取自三级贯通价格月报的厂内费用明细表
 * 厂内费用
 */
public class V_SJGT_RMJGYBB_CNFY implements Serializable {
    private String DJBH;        // 单据编号
    private String YF;          // 月份
    private String FCMC;        // 所属单位
    private String CSZT;        // 传输的状态，默认为0
    private String SID;
    private String TBYZF;       // 填报月份
    private String FYXMZ;       // 一级费用项目        --费用名称
    private String FYSJ;        // 费用时间
    private String FYMXXM;      // 二级费用明细项目
    private Double FYMXJE;      // 费用明细金额        --费用金额
    private String FYHT;        // 费用合同
    private Double FYDJ;        // 费用单价
    private String FYYT;        // 费用用途
    private String FYBZ;        // 费用备注
    private String FYXMZ_DM;
    private String ZBBM;        // 主表编码


    public V_SJGT_RMJGYBB_CNFY() {
    }

    public V_SJGT_RMJGYBB_CNFY(String DJBH, String YF, String FCMC, String CSZT, String SID, String TBYZF, String FYXMZ, String FYSJ, String FYMXXM, Double FYMXJE, String FYHT, Double FYDJ, String FYYT, String FYBZ, String FYXMZ_DM, String ZBBM) {
        this.DJBH = DJBH;
        this.YF = YF;
        this.FCMC = FCMC;
        this.CSZT = CSZT;
        this.SID = SID;
        this.TBYZF = TBYZF;
        this.FYXMZ = FYXMZ;
        this.FYSJ = FYSJ;
        this.FYMXXM = FYMXXM;
        this.FYMXJE = FYMXJE;
        this.FYHT = FYHT;
        this.FYDJ = FYDJ;
        this.FYYT = FYYT;
        this.FYBZ = FYBZ;
        this.FYXMZ_DM = FYXMZ_DM;
        this.ZBBM = ZBBM;
    }

    @Override
    public String toString() {
        return "V_SJGT_RMJGYBB_CNFY{" +
                "DJBH='" + DJBH + '\'' +
                ", YF='" + YF + '\'' +
                ", FCMC='" + FCMC + '\'' +
                ", CSZT='" + CSZT + '\'' +
                ", SID='" + SID + '\'' +
                ", TBYZF='" + TBYZF + '\'' +
                ", FYXMZ='" + FYXMZ + '\'' +
                ", FYSJ='" + FYSJ + '\'' +
                ", FYMXXM='" + FYMXXM + '\'' +
                ", FYMXJE=" + FYMXJE +
                ", FYHT='" + FYHT + '\'' +
                ", FYDJ=" + FYDJ +
                ", FYYT='" + FYYT + '\'' +
                ", FYBZ='" + FYBZ + '\'' +
                ", FYXMZ_DM='" + FYXMZ_DM + '\'' +
                ", ZBBM='" + ZBBM + '\'' +
                '}';
    }

    public String getDJBH() {
        return DJBH;
    }

    public void setDJBH(String DJBH) {
        this.DJBH = DJBH;
    }

    public String getYF() {
        return YF;
    }

    public void setYF(String YF) {
        this.YF = YF;
    }

    public String getFCMC() {
        return FCMC;
    }

    public void setFCMC(String FCMC) {
        this.FCMC = FCMC;
    }

    public String getCSZT() {
        return CSZT;
    }

    public void setCSZT(String CSZT) {
        this.CSZT = CSZT;
    }

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getTBYZF() {
        return TBYZF;
    }

    public void setTBYZF(String TBYZF) {
        this.TBYZF = TBYZF;
    }

    public String getFYXMZ() {
        return FYXMZ;
    }

    public void setFYXMZ(String FYXMZ) {
        this.FYXMZ = FYXMZ;
    }

    public String getFYSJ() {
        return FYSJ;
    }

    public void setFYSJ(String FYSJ) {
        this.FYSJ = FYSJ;
    }

    public String getFYMXXM() {
        return FYMXXM;
    }

    public void setFYMXXM(String FYMXXM) {
        this.FYMXXM = FYMXXM;
    }

    public Double getFYMXJE() {
        return FYMXJE;
    }

    public void setFYMXJE(Double FYMXJE) {
        this.FYMXJE = FYMXJE;
    }

    public String getFYHT() {
        return FYHT;
    }

    public void setFYHT(String FYHT) {
        this.FYHT = FYHT;
    }

    public Double getFYDJ() {
        return FYDJ;
    }

    public void setFYDJ(Double FYDJ) {
        this.FYDJ = FYDJ;
    }

    public String getFYYT() {
        return FYYT;
    }

    public void setFYYT(String FYYT) {
        this.FYYT = FYYT;
    }

    public String getFYBZ() {
        return FYBZ;
    }

    public void setFYBZ(String FYBZ) {
        this.FYBZ = FYBZ;
    }

    public String getFYXMZ_DM() {
        return FYXMZ_DM;
    }

    public void setFYXMZ_DM(String FYXMZ_DM) {
        this.FYXMZ_DM = FYXMZ_DM;
    }

    public String getZBBM() {
        return ZBBM;
    }

    public void setZBBM(String ZBBM) {
        this.ZBBM = ZBBM;
    }
}
