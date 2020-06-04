package com.example.demo.entity;

import java.io.Serializable;

/**
 * 月进耗存-入厂标单和月度指标完成曲线
 * 年度指标完成情况表的数据也来自此处
 */
public class V_SJGT_HEAD_YDKCQX implements Serializable {
    private String YF;      // 月份
    private String FCMC;    // 所属单位
    private Double RCML;    // 当月入厂煤量
    private Double RLML;    // 当月入炉煤量
    private Double KC;      // 当月月末库存
    private Double HYZB;    // 计划耗用
    private Double JMZB;    // 计划进煤
    private Double BDZB ;   // 计划入厂标单
    private Double RCBD;    // 当月入厂标单
    private Double RCBML;   // 当月入厂标煤量
    private Double KCZB;    // 计划库存
    private Double RLBML;   // 当月入炉综合标煤量
    private Double RLBD;    // 当月入炉标单
    private Double FDLZB;   // 计划发电量
    private Double BMLZB;   // 计划入炉标煤量
    private Double RLBDZB;  // 计划入炉标单
    private Double FDL;     // 当月发电量
    private Double GRL;     // 当月供热量
    private Double GRLZB;   // 计划供热量
    private Double RCBMLZB; // 计划入厂综合标煤量

    @Override
    public String toString() {
        return "V_SJGT_HEAD_YDKCQX{" +
                "YF='" + YF + '\'' +
                ", FCMC='" + FCMC + '\'' +
                ", RCML=" + RCML +
                ", RLML=" + RLML +
                ", KC=" + KC +
                ", HYZB=" + HYZB +
                ", JMZB=" + JMZB +
                ", BDZB=" + BDZB +
                ", RCBD=" + RCBD +
                ", RCBML=" + RCBML +
                ", KCZB=" + KCZB +
                ", RLBML=" + RLBML +
                ", RLBD=" + RLBD +
                ", FDLZB=" + FDLZB +
                ", BMLZB=" + BMLZB +
                ", RLBDZB=" + RLBDZB +
                ", FDL=" + FDL +
                ", GRL=" + GRL +
                ", GRLZB=" + GRLZB +
                ", RCBMLZB=" + RCBMLZB +
                '}';
    }

    public V_SJGT_HEAD_YDKCQX() {
    }

    public V_SJGT_HEAD_YDKCQX(String YF, String FCMC, Double RCML, Double RLML, Double KC, Double HYZB, Double JMZB, Double BDZB, Double RCBD, Double RCBML, Double KCZB, Double RLBML, Double RLBD, Double FDLZB, Double BMLZB, Double RLBDZB, Double FDL, Double GRL, Double GRLZB, Double RCBMLZB) {
        this.YF = YF;
        this.FCMC = FCMC;
        this.RCML = RCML;
        this.RLML = RLML;
        this.KC = KC;
        this.HYZB = HYZB;
        this.JMZB = JMZB;
        this.BDZB = BDZB;
        this.RCBD = RCBD;
        this.RCBML = RCBML;
        this.KCZB = KCZB;
        this.RLBML = RLBML;
        this.RLBD = RLBD;
        this.FDLZB = FDLZB;
        this.BMLZB = BMLZB;
        this.RLBDZB = RLBDZB;
        this.FDL = FDL;
        this.GRL = GRL;
        this.GRLZB = GRLZB;
        this.RCBMLZB = RCBMLZB;
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

    public Double getRCML() {
        return RCML;
    }

    public void setRCML(Double RCML) {
        this.RCML = RCML;
    }

    public Double getRLML() {
        return RLML;
    }

    public void setRLML(Double RLML) {
        this.RLML = RLML;
    }

    public Double getKC() {
        return KC;
    }

    public void setKC(Double KC) {
        this.KC = KC;
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

    public Double getBDZB() {
        return BDZB;
    }

    public void setBDZB(Double BDZB) {
        this.BDZB = BDZB;
    }

    public Double getRCBD() {
        return RCBD;
    }

    public void setRCBD(Double RCBD) {
        this.RCBD = RCBD;
    }

    public Double getRCBML() {
        return RCBML;
    }

    public void setRCBML(Double RCBML) {
        this.RCBML = RCBML;
    }

    public Double getKCZB() {
        return KCZB;
    }

    public void setKCZB(Double KCZB) {
        this.KCZB = KCZB;
    }

    public Double getRLBML() {
        return RLBML;
    }

    public void setRLBML(Double RLBML) {
        this.RLBML = RLBML;
    }

    public Double getRLBD() {
        return RLBD;
    }

    public void setRLBD(Double RLBD) {
        this.RLBD = RLBD;
    }

    public Double getFDLZB() {
        return FDLZB;
    }

    public void setFDLZB(Double FDLZB) {
        this.FDLZB = FDLZB;
    }

    public Double getBMLZB() {
        return BMLZB;
    }

    public void setBMLZB(Double BMLZB) {
        this.BMLZB = BMLZB;
    }

    public Double getRLBDZB() {
        return RLBDZB;
    }

    public void setRLBDZB(Double RLBDZB) {
        this.RLBDZB = RLBDZB;
    }

    public Double getFDL() {
        return FDL;
    }

    public void setFDL(Double FDL) {
        this.FDL = FDL;
    }

    public Double getGRL() {
        return GRL;
    }

    public void setGRL(Double GRL) {
        this.GRL = GRL;
    }

    public Double getGRLZB() {
        return GRLZB;
    }

    public void setGRLZB(Double GRLZB) {
        this.GRLZB = GRLZB;
    }

    public Double getRCBMLZB() {
        return RCBMLZB;
    }

    public void setRCBMLZB(Double RCBMLZB) {
        this.RCBMLZB = RCBMLZB;
    }
}
