package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 日累计价格明细数据
 */
public class V_SJGT_HEAD_RMJGRB_CSB implements Serializable {
    private Integer LXXH;   // 11表示长协明细，10表示长协合计，21表示现货明细，20表示现货合计，00表示合计
    private String DJBH;    // 单据编号
    private Date YWRQ;      // 日期
    private String FCMC;    // 所属单位
    private Integer CSZT;   // 传输的状态，默认为0
    private Double SID;     // 唯一标识
    private String ZBBM;    // 主表编码
    private String SSSF;    // 所属省份
    private String GMDW;    // 供煤单位
    private String HTBH;    // 合同编号
    private Double HTML;    // 合同煤量
    private Double DML;     // 到煤量
    private Double HTLF;    // 合同硫份
    private Double SJLF;    // 实际硫份
    private Double HTRZ;    // 合同热值
    private Double SJRZ;    // 实际热值
    private Double BML;     // 标煤量
    private Double HTCBJ;   // 合同车板价
    private Double SJCBJ;   // 实际车板价
    private Double YZF;     // 运杂费
    private Double SJDCHJ;  // 实际到厂价
    private Double DKDJ;    // 大卡单价
    private Double HSBMDJ;  // 含税标煤单价
    private Double BHSBMDJ; // 不含税标煤单价
    private String LMTJMC;  // 来煤途径名称
    private String CGLX;    // 采购类型
    private String GMDWDM;  // 供煤单位代码
    private String LMTJDM;  // 来煤途径代码
    private String FZ;      // 发站
    private String SSSFDM;  // 所属省份代码
    private String FZDM;    // 发站代码
    private String LX;      // 来煤类别
    private Double BDRZ;    // 标单热值
    private String FHDW;    // 发货单位
    private Double DRDML;   // 当日到煤量

    public V_SJGT_HEAD_RMJGRB_CSB() {
    }

    public V_SJGT_HEAD_RMJGRB_CSB(Integer LXXH, String DJBH, Date YWRQ, String FCMC, Integer CSZT, Double SID, String ZBBM, String SSSF, String GMDW, String HTBH, Double HTML, Double DML, Double HTLF, Double SJLF, Double HTRZ, Double SJRZ, Double BML, Double HTCBJ, Double SJCBJ, Double YZF, Double SJDCHJ, Double DKDJ, Double HSBMDJ, Double BHSBMDJ, String LMTJMC, String CGLX, String GMDWDM, String LMTJDM, String FZ, String SSSFDM, String FZDM, String LX, Double BDRZ, String FHDW, Double DRDML) {
        this.LXXH = LXXH;
        this.DJBH = DJBH;
        this.YWRQ = YWRQ;
        this.FCMC = FCMC;
        this.CSZT = CSZT;
        this.SID = SID;
        this.ZBBM = ZBBM;
        this.SSSF = SSSF;
        this.GMDW = GMDW;
        this.HTBH = HTBH;
        this.HTML = HTML;
        this.DML = DML;
        this.HTLF = HTLF;
        this.SJLF = SJLF;
        this.HTRZ = HTRZ;
        this.SJRZ = SJRZ;
        this.BML = BML;
        this.HTCBJ = HTCBJ;
        this.SJCBJ = SJCBJ;
        this.YZF = YZF;
        this.SJDCHJ = SJDCHJ;
        this.DKDJ = DKDJ;
        this.HSBMDJ = HSBMDJ;
        this.BHSBMDJ = BHSBMDJ;
        this.LMTJMC = LMTJMC;
        this.CGLX = CGLX;
        this.GMDWDM = GMDWDM;
        this.LMTJDM = LMTJDM;
        this.FZ = FZ;
        this.SSSFDM = SSSFDM;
        this.FZDM = FZDM;
        this.LX = LX;
        this.BDRZ = BDRZ;
        this.FHDW = FHDW;
        this.DRDML = DRDML;
    }

    @Override
    public String toString() {
        return "V_SJGT_HEAD_RMJGRB_CSB{" +
                "LXXH=" + LXXH +
                ", DJBH='" + DJBH + '\'' +
                ", YWRQ=" + YWRQ +
                ", FCMC='" + FCMC + '\'' +
                ", CSZT=" + CSZT +
                ", SID=" + SID +
                ", ZBBM='" + ZBBM + '\'' +
                ", SSSF='" + SSSF + '\'' +
                ", GMDW='" + GMDW + '\'' +
                ", HTBH='" + HTBH + '\'' +
                ", HTML=" + HTML +
                ", DML=" + DML +
                ", HTLF=" + HTLF +
                ", SJLF=" + SJLF +
                ", HTRZ=" + HTRZ +
                ", SJRZ=" + SJRZ +
                ", BML=" + BML +
                ", HTCBJ=" + HTCBJ +
                ", SJCBJ=" + SJCBJ +
                ", YZF=" + YZF +
                ", SJDCHJ=" + SJDCHJ +
                ", DKDJ=" + DKDJ +
                ", HSBMDJ=" + HSBMDJ +
                ", BHSBMDJ=" + BHSBMDJ +
                ", LMTJMC='" + LMTJMC + '\'' +
                ", CGLX='" + CGLX + '\'' +
                ", GMDWDM='" + GMDWDM + '\'' +
                ", LMTJDM='" + LMTJDM + '\'' +
                ", FZ='" + FZ + '\'' +
                ", SSSFDM='" + SSSFDM + '\'' +
                ", FZDM='" + FZDM + '\'' +
                ", LX='" + LX + '\'' +
                ", BDRZ=" + BDRZ +
                ", FHDW='" + FHDW + '\'' +
                ", DRDML=" + DRDML +
                '}';
    }

    public Integer getLXXH() {
        return LXXH;
    }

    public void setLXXH(Integer LXXH) {
        this.LXXH = LXXH;
    }

    public String getDJBH() {
        return DJBH;
    }

    public void setDJBH(String DJBH) {
        this.DJBH = DJBH;
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

    public Integer getCSZT() {
        return CSZT;
    }

    public void setCSZT(Integer CSZT) {
        this.CSZT = CSZT;
    }

    public Double getSID() {
        return SID;
    }

    public void setSID(Double SID) {
        this.SID = SID;
    }

    public String getZBBM() {
        return ZBBM;
    }

    public void setZBBM(String ZBBM) {
        this.ZBBM = ZBBM;
    }

    public String getSSSF() {
        return SSSF;
    }

    public void setSSSF(String SSSF) {
        this.SSSF = SSSF;
    }

    public String getGMDW() {
        return GMDW;
    }

    public void setGMDW(String GMDW) {
        this.GMDW = GMDW;
    }

    public String getHTBH() {
        return HTBH;
    }

    public void setHTBH(String HTBH) {
        this.HTBH = HTBH;
    }

    public Double getHTML() {
        return HTML;
    }

    public void setHTML(Double HTML) {
        this.HTML = HTML;
    }

    public Double getDML() {
        return DML;
    }

    public void setDML(Double DML) {
        this.DML = DML;
    }

    public Double getHTLF() {
        return HTLF;
    }

    public void setHTLF(Double HTLF) {
        this.HTLF = HTLF;
    }

    public Double getSJLF() {
        return SJLF;
    }

    public void setSJLF(Double SJLF) {
        this.SJLF = SJLF;
    }

    public Double getHTRZ() {
        return HTRZ;
    }

    public void setHTRZ(Double HTRZ) {
        this.HTRZ = HTRZ;
    }

    public Double getSJRZ() {
        return SJRZ;
    }

    public void setSJRZ(Double SJRZ) {
        this.SJRZ = SJRZ;
    }

    public Double getBML() {
        return BML;
    }

    public void setBML(Double BML) {
        this.BML = BML;
    }

    public Double getHTCBJ() {
        return HTCBJ;
    }

    public void setHTCBJ(Double HTCBJ) {
        this.HTCBJ = HTCBJ;
    }

    public Double getSJCBJ() {
        return SJCBJ;
    }

    public void setSJCBJ(Double SJCBJ) {
        this.SJCBJ = SJCBJ;
    }

    public Double getYZF() {
        return YZF;
    }

    public void setYZF(Double YZF) {
        this.YZF = YZF;
    }

    public Double getSJDCHJ() {
        return SJDCHJ;
    }

    public void setSJDCHJ(Double SJDCHJ) {
        this.SJDCHJ = SJDCHJ;
    }

    public Double getDKDJ() {
        return DKDJ;
    }

    public void setDKDJ(Double DKDJ) {
        this.DKDJ = DKDJ;
    }

    public Double getHSBMDJ() {
        return HSBMDJ;
    }

    public void setHSBMDJ(Double HSBMDJ) {
        this.HSBMDJ = HSBMDJ;
    }

    public Double getBHSBMDJ() {
        return BHSBMDJ;
    }

    public void setBHSBMDJ(Double BHSBMDJ) {
        this.BHSBMDJ = BHSBMDJ;
    }

    public String getLMTJMC() {
        return LMTJMC;
    }

    public void setLMTJMC(String LMTJMC) {
        this.LMTJMC = LMTJMC;
    }

    public String getCGLX() {
        return CGLX;
    }

    public void setCGLX(String CGLX) {
        this.CGLX = CGLX;
    }

    public String getGMDWDM() {
        return GMDWDM;
    }

    public void setGMDWDM(String GMDWDM) {
        this.GMDWDM = GMDWDM;
    }

    public String getLMTJDM() {
        return LMTJDM;
    }

    public void setLMTJDM(String LMTJDM) {
        this.LMTJDM = LMTJDM;
    }

    public String getFZ() {
        return FZ;
    }

    public void setFZ(String FZ) {
        this.FZ = FZ;
    }

    public String getSSSFDM() {
        return SSSFDM;
    }

    public void setSSSFDM(String SSSFDM) {
        this.SSSFDM = SSSFDM;
    }

    public String getFZDM() {
        return FZDM;
    }

    public void setFZDM(String FZDM) {
        this.FZDM = FZDM;
    }

    public String getLX() {
        return LX;
    }

    public void setLX(String LX) {
        this.LX = LX;
    }

    public Double getBDRZ() {
        return BDRZ;
    }

    public void setBDRZ(Double BDRZ) {
        this.BDRZ = BDRZ;
    }

    public String getFHDW() {
        return FHDW;
    }

    public void setFHDW(String FHDW) {
        this.FHDW = FHDW;
    }

    public Double getDRDML() {
        return DRDML;
    }

    public void setDRDML(Double DRDML) {
        this.DRDML = DRDML;
    }
}
