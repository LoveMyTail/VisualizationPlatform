package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class V_CYGS_RBXX implements Serializable {
    private Date YWRQ;      // 日期
    private String FCMC;    // 所属单位
    private Double BRKCML;  // 当日库存煤量
    private Double BML;     // 当日入厂标煤量
    private Double BHSBMDJ; // 累计入厂标单
    private Double BRRCML;  // 当日入厂标单

    public V_CYGS_RBXX() {
    }

    public V_CYGS_RBXX(Date YWRQ, String FCMC, Double BRKCML, Double BML, Double BHSBMDJ, Double BRRCML) {
        this.YWRQ = YWRQ;
        this.FCMC = FCMC;
        this.BRKCML = BRKCML;
        this.BML = BML;
        this.BHSBMDJ = BHSBMDJ;
        this.BRRCML = BRRCML;
    }

    @Override
    public String toString() {
        return "V_CYGS_RBXX{" +
                "YWRQ=" + YWRQ +
                ", FCMC='" + FCMC + '\'' +
                ", BRKCML=" + BRKCML +
                ", BML=" + BML +
                ", BHSBMDJ=" + BHSBMDJ +
                ", BRRCML=" + BRRCML +
                '}';
    }


    public Date getYWRQ() {
        return YWRQ;
    }

    public void setYWRQ(Date YWRQ) {
        this.YWRQ = YWRQ;
    }

    public String getFCMC() {
        return FCMC;
    }

    public void setFCMC(String FCMC) {
        this.FCMC = FCMC;
    }

    public Double getBRKCML() {
        return BRKCML;
    }

    public void setBRKCML(Double BRKCML) {
        this.BRKCML = BRKCML;
    }

    public Double getBML() {
        return BML;
    }

    public void setBML(Double BML) {
        this.BML = BML;
    }

    public Double getBHSBMDJ() {
        return BHSBMDJ;
    }

    public void setBHSBMDJ(Double BHSBMDJ) {
        this.BHSBMDJ = BHSBMDJ;
    }

    public Double getBRRCML() {
        return BRRCML;
    }

    public void setBRRCML(Double BRRCML) {
        this.BRRCML = BRRCML;
    }
}
