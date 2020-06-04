package com.example.demo.entity;

import java.util.Date;

/**
 * 日进耗存-日均入厂标单和计划完成情况
 */
public class V_HEAD_RJK_RCBD {
    private String YWRQ;      // 日期
    private String FCMC;    // 所属单位
    private Double BRKCML;  // 当日库存煤量
    private Double BRRCML;  // 当日入厂煤量
    private Double RXHML;   // 当日耗用库存
    private Double RCBD;    // 当日入厂标单
    private Double BML;     // 当日入厂标煤量
    private Double HYZB;    // 计划耗用
    private Double JMZB;    // 计划进煤
    private Double KCZB;    // 计划库存
    private Double BDZB;    // 计划入厂标单
    private Double RCBMLZB; //
    private Double RLBMLZB; //

    public V_HEAD_RJK_RCBD() {
    }

    public V_HEAD_RJK_RCBD(String YWRQ, String FCMC, Double BRKCML, Double BRRCML, Double RXHML, Double RCBD, Double BML, Double HYZB, Double JMZB, Double KCZB, Double BDZB, Double RCBMLZB, Double RLBMLZB) {
        this.YWRQ = YWRQ;
        this.FCMC = FCMC;
        this.BRKCML = BRKCML;
        this.BRRCML = BRRCML;
        this.RXHML = RXHML;
        this.RCBD = RCBD;
        this.BML = BML;
        this.HYZB = HYZB;
        this.JMZB = JMZB;
        this.KCZB = KCZB;
        this.BDZB = BDZB;
        this.RCBMLZB = RCBMLZB;
        this.RLBMLZB = RLBMLZB;
    }

    @Override
    public String toString() {
        return "V_HEAD_RJK_RCBD{" +
                "YWRQ=" + YWRQ +
                ", FCMC='" + FCMC + '\'' +
                ", BRKCML=" + BRKCML +
                ", BRRCML=" + BRRCML +
                ", RXHML=" + RXHML +
                ", RCBD=" + RCBD +
                ", BML=" + BML +
                ", HYZB=" + HYZB +
                ", JMZB=" + JMZB +
                ", KCZB=" + KCZB +
                ", BDZB=" + BDZB +
                ", RCBMLZB=" + RCBMLZB +
                ", RLBMLZB=" + RLBMLZB +
                '}';
    }

    public String getYWRQ() {
        return YWRQ;
    }

    public void setYWRQ(String YWRQ) {
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

    public Double getBRRCML() {
        return BRRCML;
    }

    public void setBRRCML(Double BRRCML) {
        this.BRRCML = BRRCML;
    }

    public Double getRXHML() {
        return RXHML;
    }

    public void setRXHML(Double RXHML) {
        this.RXHML = RXHML;
    }

    public Double getRCBD() {
        return RCBD;
    }

    public void setRCBD(Double RCBD) {
        this.RCBD = RCBD;
    }

    public Double getBML() {
        return BML;
    }

    public void setBML(Double BML) {
        this.BML = BML;
    }

    public Double getHYZB() {
        return HYZB;
    }

    public void setHYZB(Double HYZB) {
        this.HYZB = HYZB;
    }

    public Double getJMZB() {
        return JMZB;
    }

    public void setJMZB(Double JMZB) {
        this.JMZB = JMZB;
    }

    public Double getKCZB() {
        return KCZB;
    }

    public void setKCZB(Double KCZB) {
        this.KCZB = KCZB;
    }

    public Double getBDZB() {
        return BDZB;
    }

    public void setBDZB(Double BDZB) {
        this.BDZB = BDZB;
    }

    public Double getRCBMLZB() {
        return RCBMLZB;
    }

    public void setRCBMLZB(Double RCBMLZB) {
        this.RCBMLZB = RCBMLZB;
    }

    public Double getRLBMLZB() {
        return RLBMLZB;
    }

    public void setRLBMLZB(Double RLBMLZB) {
        this.RLBMLZB = RLBMLZB;
    }
}
