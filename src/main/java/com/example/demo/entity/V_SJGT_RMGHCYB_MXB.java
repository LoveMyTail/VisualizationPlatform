package com.example.demo.entity;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.io.Serializable;

/**
 * 三级贯通燃煤供耗存月报明细表
 * 采购方式、煤种、运输方式
 */
public class V_SJGT_RMGHCYB_MXB implements Serializable {
    private String DJBH;        // 单据编号
    private String YF;          // 月份
    private String FCMC;        // 所属单位
    private String CSZT;        // 传输的状态，默认为0
    private String ZZBM;        // 主表编码
    private String HTBH;        // 合同（系统编号）或补充协议
    private String SFYGCG;      // 是否阳光采购
    private String CGLX;        // 采购类型编码
    private String GHDW;        // 供货单位编码
    private String FHDW;        // 发货单位编码
    private String YSFS;        // 运输方式编码
    private String MZ;          // 煤种编码
    private Double KFSLRC;      // 矿发数量（入厂）
    private Double SSSLRC;      // 实收数量（入厂）
    private Double YSSLRC;      // 运损数量（入厂）
    private Double YKDSLRC;     // 盈亏吨数量（入厂）
    private Double QSRC;        // 全水Mt Mar(入厂)   %
    private Double KQGZJHFRC;   // 空气干燥基灰分Aad(入厂) %
    private Double GZWHJHFFRC;  // 干燥无灰基挥发分Vdaf(入厂)  %
    private Double SDJDWRZRC;   // 收到基低位热值Qnet,ar(入厂)  MJ/KG
    private Double GZJQLRC;     // 干燥无灰基挥发分Vdaf(入厂)  %
    private Double SID;         // 序号
    private Double SDJDWRZRCKA; // 收到基低位热值Qnet,ar(入厂) Kcal/KG
    private String FZ;          //
    private String HTBH_ZZ;     // 电厂合同编号
    private Double FZ_DM;       //
    private Double GHDW_DM;     //
    private Double YSFS_DM;     //
    private Double MZ_DM;       //

    @Override
    public String toString() {
        return "V_SJGT_RMGHCYB_MXB{" +
                "DJBH='" + DJBH + '\'' +
                ", YF='" + YF + '\'' +
                ", FCMC='" + FCMC + '\'' +
                ", CSZT='" + CSZT + '\'' +
                ", ZZBM='" + ZZBM + '\'' +
                ", HTBH='" + HTBH + '\'' +
                ", SFYGCG='" + SFYGCG + '\'' +
                ", CGLX='" + CGLX + '\'' +
                ", GHDW='" + GHDW + '\'' +
                ", FHDW='" + FHDW + '\'' +
                ", YSFS='" + YSFS + '\'' +
                ", MZ='" + MZ + '\'' +
                ", KFSLRC=" + KFSLRC +
                ", SSSLRC=" + SSSLRC +
                ", YSSLRC=" + YSSLRC +
                ", YKDSLRC=" + YKDSLRC +
                ", QSRC=" + QSRC +
                ", KQGZJHFRC=" + KQGZJHFRC +
                ", GZWHJHFFRC=" + GZWHJHFFRC +
                ", SDJDWRZRC=" + SDJDWRZRC +
                ", GZJQLRC=" + GZJQLRC +
                ", SID=" + SID +
                ", SDJDWRZRCKA=" + SDJDWRZRCKA +
                ", FZ='" + FZ + '\'' +
                ", HTBH_ZZ='" + HTBH_ZZ + '\'' +
                ", FZ_DM=" + FZ_DM +
                ", GHDW_DM=" + GHDW_DM +
                ", YSFS_DM=" + YSFS_DM +
                ", MZ_DM=" + MZ_DM +
                '}';
    }

    public V_SJGT_RMGHCYB_MXB() {
    }

    public V_SJGT_RMGHCYB_MXB(String DJBH, String YF, String FCMC, String CSZT, String ZZBM, String HTBH, String SFYGCG, String CGLX, String GHDW, String FHDW, String YSFS, String MZ, Double KFSLRC, Double SSSLRC, Double YSSLRC, Double YKDSLRC, Double QSRC, Double KQGZJHFRC, Double GZWHJHFFRC, Double SDJDWRZRC, Double GZJQLRC, Double SID, Double SDJDWRZRCKA, String FZ, String HTBH_ZZ, Double FZ_DM, Double GHDW_DM, Double YSFS_DM, Double MZ_DM) {
        this.DJBH = DJBH;
        this.YF = YF;
        this.FCMC = FCMC;
        this.CSZT = CSZT;
        this.ZZBM = ZZBM;
        this.HTBH = HTBH;
        this.SFYGCG = SFYGCG;
        this.CGLX = CGLX;
        this.GHDW = GHDW;
        this.FHDW = FHDW;
        this.YSFS = YSFS;
        this.MZ = MZ;
        this.KFSLRC = KFSLRC;
        this.SSSLRC = SSSLRC;
        this.YSSLRC = YSSLRC;
        this.YKDSLRC = YKDSLRC;
        this.QSRC = QSRC;
        this.KQGZJHFRC = KQGZJHFRC;
        this.GZWHJHFFRC = GZWHJHFFRC;
        this.SDJDWRZRC = SDJDWRZRC;
        this.GZJQLRC = GZJQLRC;
        this.SID = SID;
        this.SDJDWRZRCKA = SDJDWRZRCKA;
        this.FZ = FZ;
        this.HTBH_ZZ = HTBH_ZZ;
        this.FZ_DM = FZ_DM;
        this.GHDW_DM = GHDW_DM;
        this.YSFS_DM = YSFS_DM;
        this.MZ_DM = MZ_DM;
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

    public String getZZBM() {
        return ZZBM;
    }

    public void setZZBM(String ZZBM) {
        this.ZZBM = ZZBM;
    }

    public String getHTBH() {
        return HTBH;
    }

    public void setHTBH(String HTBH) {
        this.HTBH = HTBH;
    }

    public String getSFYGCG() {
        return SFYGCG;
    }

    public void setSFYGCG(String SFYGCG) {
        this.SFYGCG = SFYGCG;
    }

    public String getCGLX() {
        return CGLX;
    }

    public void setCGLX(String CGLX) {
        this.CGLX = CGLX;
    }

    public String getGHDW() {
        return GHDW;
    }

    public void setGHDW(String GHDW) {
        this.GHDW = GHDW;
    }

    public String getFHDW() {
        return FHDW;
    }

    public void setFHDW(String FHDW) {
        this.FHDW = FHDW;
    }

    public String getYSFS() {
        return YSFS;
    }

    public void setYSFS(String YSFS) {
        this.YSFS = YSFS;
    }

    public String getMZ() {
        return MZ;
    }

    public void setMZ(String MZ) {
        this.MZ = MZ;
    }

    public Double getKFSLRC() {
        return KFSLRC;
    }

    public void setKFSLRC(Double KFSLRC) {
        this.KFSLRC = KFSLRC;
    }

    public Double getSSSLRC() {
        return SSSLRC;
    }

    public void setSSSLRC(Double SSSLRC) {
        this.SSSLRC = SSSLRC;
    }

    public Double getYSSLRC() {
        return YSSLRC;
    }

    public void setYSSLRC(Double YSSLRC) {
        this.YSSLRC = YSSLRC;
    }

    public Double getYKDSLRC() {
        return YKDSLRC;
    }

    public void setYKDSLRC(Double YKDSLRC) {
        this.YKDSLRC = YKDSLRC;
    }

    public Double getQSRC() {
        return QSRC;
    }

    public void setQSRC(Double QSRC) {
        this.QSRC = QSRC;
    }

    public Double getKQGZJHFRC() {
        return KQGZJHFRC;
    }

    public void setKQGZJHFRC(Double KQGZJHFRC) {
        this.KQGZJHFRC = KQGZJHFRC;
    }

    public Double getGZWHJHFFRC() {
        return GZWHJHFFRC;
    }

    public void setGZWHJHFFRC(Double GZWHJHFFRC) {
        this.GZWHJHFFRC = GZWHJHFFRC;
    }

    public Double getSDJDWRZRC() {
        return SDJDWRZRC;
    }

    public void setSDJDWRZRC(Double SDJDWRZRC) {
        this.SDJDWRZRC = SDJDWRZRC;
    }

    public Double getGZJQLRC() {
        return GZJQLRC;
    }

    public void setGZJQLRC(Double GZJQLRC) {
        this.GZJQLRC = GZJQLRC;
    }

    public Double getSID() {
        return SID;
    }

    public void setSID(Double SID) {
        this.SID = SID;
    }

    public Double getSDJDWRZRCKA() {
        return SDJDWRZRCKA;
    }

    public void setSDJDWRZRCKA(Double SDJDWRZRCKA) {
        this.SDJDWRZRCKA = SDJDWRZRCKA;
    }

    public String getFZ() {
        return FZ;
    }

    public void setFZ(String FZ) {
        this.FZ = FZ;
    }

    public String getHTBH_ZZ() {
        return HTBH_ZZ;
    }

    public void setHTBH_ZZ(String HTBH_ZZ) {
        this.HTBH_ZZ = HTBH_ZZ;
    }

    public Double getFZ_DM() {
        return FZ_DM;
    }

    public void setFZ_DM(Double FZ_DM) {
        this.FZ_DM = FZ_DM;
    }

    public Double getGHDW_DM() {
        return GHDW_DM;
    }

    public void setGHDW_DM(Double GHDW_DM) {
        this.GHDW_DM = GHDW_DM;
    }

    public Double getYSFS_DM() {
        return YSFS_DM;
    }

    public void setYSFS_DM(Double YSFS_DM) {
        this.YSFS_DM = YSFS_DM;
    }

    public Double getMZ_DM() {
        return MZ_DM;
    }

    public void setMZ_DM(Double MZ_DM) {
        this.MZ_DM = MZ_DM;
    }
}
