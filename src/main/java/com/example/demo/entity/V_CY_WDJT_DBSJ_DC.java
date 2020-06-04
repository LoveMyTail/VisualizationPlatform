package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 该实体用于展示区域对标部分数据
 * 该数据来自视图 V_CY_WDJT_DBSJ_DC
 * 月度各电厂的对标数据
 */
public class V_CY_WDJT_DBSJ_DC implements Serializable {
    private Date YF;                    //月度，每月1日
    private String SS_JT;               //所属集团
    private String SS_DC;               //电厂
    private Double DY_LML;              //当月来煤量
    private Double DY_RCRZ;             //当月入厂热值（MJ/Kg）
    private Double DY_RCBMDJ_HS;        //当月入厂标煤单价含税
    private Double DY_RCBMDJ_BHS;       //当月入厂标煤单价不含税
    private Double DY_RCBMDJ_QYPM_HS;   //当月区域排名（含税）
    private Double DY_RCBMDJ_QYPJ_HS;   //当月区域平均数（含税）
    private Double LJ_LML;              //累计来煤量
    private Double LJ_RCRZ;             //累计入厂热值
    private Double LJ_RCBMDJ_HS;        //累计标煤单价（含税）
    private Double LJ_RCBMDJ_BHS;       //累计标煤单价（不含税）
    private Double LJ_RCBMDJ_QYPM_HS;   //累计区域排名
    private Double LJ_RCBMDJ_QYPJ_HS;   //累计区域平均数
    private Double DY_HML;              //当月-耗煤量
    private Double DY_RLRZ;             //当月入炉热值
    private Double DY_RLBMDJ;           //当月入炉标煤单价
    private Double LJ_HML;              //累计-耗煤量
    private Double LJ_RLRZ;             //累计入炉热值
    private Double LJ_RLBMDJ;           //累计入炉标煤单价
    private Double KCML;                //库存煤量

    public V_CY_WDJT_DBSJ_DC() {
    }

    public V_CY_WDJT_DBSJ_DC(Date YF, String SS_JT, Double DY_RCBMDJ_HS) {
        this.YF = YF;
        this.SS_JT = SS_JT;
        this.DY_RCBMDJ_HS = DY_RCBMDJ_HS;
    }

    public V_CY_WDJT_DBSJ_DC(Date YF, String SS_DC, Double DY_LML, Double DY_RCRZ, Double DY_RCBMDJ_HS) {
        this.YF = YF;
        this.SS_DC = SS_DC;
        this.DY_LML = DY_LML;
        this.DY_RCRZ = DY_RCRZ;
        this.DY_RCBMDJ_HS = DY_RCBMDJ_HS;
    }

    @Override
    public String toString() {
        return "V_CY_WDJT_DBSJ_DC{" +
                "YF=" + YF +
                ", SS_JT='" + SS_JT + '\'' +
                ", SS_DC='" + SS_DC + '\'' +
                ", DY_LML=" + DY_LML +
                ", DY_RCRZ=" + DY_RCRZ +
                ", DY_RCBMDJ_HS=" + DY_RCBMDJ_HS +
                ", DY_RCBMDJ_BHS=" + DY_RCBMDJ_BHS +
                ", DY_RCBMDJ_QYPM_HS=" + DY_RCBMDJ_QYPM_HS +
                ", DY_RCBMDJ_QYPJ_HS=" + DY_RCBMDJ_QYPJ_HS +
                ", LJ_LML=" + LJ_LML +
                ", LJ_RCRZ=" + LJ_RCRZ +
                ", LJ_RCBMDJ_HS=" + LJ_RCBMDJ_HS +
                ", LJ_RCBMDJ_BHS=" + LJ_RCBMDJ_BHS +
                ", LJ_RCBMDJ_QYPM_HS=" + LJ_RCBMDJ_QYPM_HS +
                ", LJ_RCBMDJ_QYPJ_HS=" + LJ_RCBMDJ_QYPJ_HS +
                ", DY_HML=" + DY_HML +
                ", DY_RLRZ=" + DY_RLRZ +
                ", DY_RLBMDJ=" + DY_RLBMDJ +
                ", LJ_HML=" + LJ_HML +
                ", LJ_RLRZ=" + LJ_RLRZ +
                ", LJ_RLBMDJ=" + LJ_RLBMDJ +
                ", KCML=" + KCML +
                '}';
    }

    public Date getYF() {
        return YF;
    }

    public void setYF(Date YF) {
        this.YF = YF;
    }

    public String getSS_JT() {
        return SS_JT;
    }

    public void setSS_JT(String SS_JT) {
        this.SS_JT = SS_JT;
    }

    public String getSS_DC() {
        return SS_DC;
    }

    public void setSS_DC(String SS_DC) {
        this.SS_DC = SS_DC;
    }

    public Double getDY_LML() {
        return DY_LML;
    }

    public void setDY_LML(Double DY_LML) {
        this.DY_LML = DY_LML;
    }

    public Double getDY_RCRZ() {
        return DY_RCRZ;
    }

    public void setDY_RCRZ(Double DY_RCRZ) {
        this.DY_RCRZ = DY_RCRZ;
    }

    public Double getDY_RCBMDJ_HS() {
        return DY_RCBMDJ_HS;
    }

    public void setDY_RCBMDJ_HS(Double DY_RCBMDJ_HS) {
        this.DY_RCBMDJ_HS = DY_RCBMDJ_HS;
    }

    public Double getDY_RCBMDJ_BHS() {
        return DY_RCBMDJ_BHS;
    }

    public void setDY_RCBMDJ_BHS(Double DY_RCBMDJ_BHS) {
        this.DY_RCBMDJ_BHS = DY_RCBMDJ_BHS;
    }

    public Double getDY_RCBMDJ_QYPM_HS() {
        return DY_RCBMDJ_QYPM_HS;
    }

    public void setDY_RCBMDJ_QYPM_HS(Double DY_RCBMDJ_QYPM_HS) {
        this.DY_RCBMDJ_QYPM_HS = DY_RCBMDJ_QYPM_HS;
    }

    public Double getDY_RCBMDJ_QYPJ_HS() {
        return DY_RCBMDJ_QYPJ_HS;
    }

    public void setDY_RCBMDJ_QYPJ_HS(Double DY_RCBMDJ_QYPJ_HS) {
        this.DY_RCBMDJ_QYPJ_HS = DY_RCBMDJ_QYPJ_HS;
    }

    public Double getLJ_LML() {
        return LJ_LML;
    }

    public void setLJ_LML(Double LJ_LML) {
        this.LJ_LML = LJ_LML;
    }

    public Double getLJ_RCRZ() {
        return LJ_RCRZ;
    }

    public void setLJ_RCRZ(Double LJ_RCRZ) {
        this.LJ_RCRZ = LJ_RCRZ;
    }

    public Double getLJ_RCBMDJ_HS() {
        return LJ_RCBMDJ_HS;
    }

    public void setLJ_RCBMDJ_HS(Double LJ_RCBMDJ_HS) {
        this.LJ_RCBMDJ_HS = LJ_RCBMDJ_HS;
    }

    public Double getLJ_RCBMDJ_BHS() {
        return LJ_RCBMDJ_BHS;
    }

    public void setLJ_RCBMDJ_BHS(Double LJ_RCBMDJ_BHS) {
        this.LJ_RCBMDJ_BHS = LJ_RCBMDJ_BHS;
    }

    public Double getLJ_RCBMDJ_QYPM_HS() {
        return LJ_RCBMDJ_QYPM_HS;
    }

    public void setLJ_RCBMDJ_QYPM_HS(Double LJ_RCBMDJ_QYPM_HS) {
        this.LJ_RCBMDJ_QYPM_HS = LJ_RCBMDJ_QYPM_HS;
    }

    public Double getLJ_RCBMDJ_QYPJ_HS() {
        return LJ_RCBMDJ_QYPJ_HS;
    }

    public void setLJ_RCBMDJ_QYPJ_HS(Double LJ_RCBMDJ_QYPJ_HS) {
        this.LJ_RCBMDJ_QYPJ_HS = LJ_RCBMDJ_QYPJ_HS;
    }

    public Double getDY_HML() {
        return DY_HML;
    }

    public void setDY_HML(Double DY_HML) {
        this.DY_HML = DY_HML;
    }

    public Double getDY_RLRZ() {
        return DY_RLRZ;
    }

    public void setDY_RLRZ(Double DY_RLRZ) {
        this.DY_RLRZ = DY_RLRZ;
    }

    public Double getDY_RLBMDJ() {
        return DY_RLBMDJ;
    }

    public void setDY_RLBMDJ(Double DY_RLBMDJ) {
        this.DY_RLBMDJ = DY_RLBMDJ;
    }

    public Double getLJ_HML() {
        return LJ_HML;
    }

    public void setLJ_HML(Double LJ_HML) {
        this.LJ_HML = LJ_HML;
    }

    public Double getLJ_RLRZ() {
        return LJ_RLRZ;
    }

    public void setLJ_RLRZ(Double LJ_RLRZ) {
        this.LJ_RLRZ = LJ_RLRZ;
    }

    public Double getLJ_RLBMDJ() {
        return LJ_RLBMDJ;
    }

    public void setLJ_RLBMDJ(Double LJ_RLBMDJ) {
        this.LJ_RLBMDJ = LJ_RLBMDJ;
    }

    public Double getKCML() {
        return KCML;
    }

    public void setKCML(Double KCML) {
        this.KCML = KCML;
    }
}
