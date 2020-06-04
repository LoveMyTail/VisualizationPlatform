package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 获取燃煤统计日报的供耗存当日和累计数据
 */
public class V_HEAD_DRSJ implements Serializable {
    private Date YWRQ;          // 日期
    private String FCMC;        // 所属单位
    private Double BRKCML;      // 当日库存煤量
    private Double BRRCML;      // 当日入厂煤量
    private Double BRHML;       // 当日耗煤量
    private Double LJRCML;      // 累计入厂煤量
    private Double LJHML;       // 累计耗煤量
    private Double DRFDL;       // 当日发电量
    private Double JLFDL;       // 累计发电量
    private Double DRGRL;       // 当日供热量
    private Double LJGRL;       // 累计供热量

    @Override
    public String toString() {
        return "V_HEAD_DRSJ{" +
                "YWRQ=" + YWRQ +
                ", FCMC='" + FCMC + '\'' +
                ", BRKCML=" + BRKCML +
                ", BRRCML=" + BRRCML +
                ", BRHML=" + BRHML +
                ", LJRCML=" + LJRCML +
                ", LJHML=" + LJHML +
                ", DRFDL=" + DRFDL +
                ", JLFDL=" + JLFDL +
                ", DRGRL=" + DRGRL +
                ", LJGRL=" + LJGRL +
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

    public Double getBRRCML() {
        return BRRCML;
    }

    public void setBRRCML(Double BRRCML) {
        this.BRRCML = BRRCML;
    }

    public Double getBRHML() {
        return BRHML;
    }

    public void setBRHML(Double BRHML) {
        this.BRHML = BRHML;
    }

    public Double getLJRCML() {
        return LJRCML;
    }

    public void setLJRCML(Double LJRCML) {
        this.LJRCML = LJRCML;
    }

    public Double getLJHML() {
        return LJHML;
    }

    public void setLJHML(Double LJHML) {
        this.LJHML = LJHML;
    }

    public Double getDRFDL() {
        return DRFDL;
    }

    public void setDRFDL(Double DRFDL) {
        this.DRFDL = DRFDL;
    }

    public Double getJLFDL() {
        return JLFDL;
    }

    public void setJLFDL(Double JLFDL) {
        this.JLFDL = JLFDL;
    }

    public Double getDRGRL() {
        return DRGRL;
    }

    public void setDRGRL(Double DRGRL) {
        this.DRGRL = DRGRL;
    }

    public Double getLJGRL() {
        return LJGRL;
    }

    public void setLJGRL(Double LJGRL) {
        this.LJGRL = LJGRL;
    }
}
