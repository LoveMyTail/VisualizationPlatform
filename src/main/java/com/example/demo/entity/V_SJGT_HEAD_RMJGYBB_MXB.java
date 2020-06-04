package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 三级贯通价格月报的明细数据
 */
public class V_SJGT_HEAD_RMJGYBB_MXB implements Serializable {
    private Integer LXXH;   // 11表示长协明细，10表示长协合计，21表示现货明细，20表示现货合计，00表示合计
    private String DJBH;    // 单据编号
    private String YF;        // 日期
    private String FCMC;    // 所属单位
    private Integer CSZT;   // 传输的状态，默认为0
    private String SID;     // 唯一标识
    private String ZBBM;    // 主表编码
    private String CGLX;    // 采购类型
    private String HT;      // 合同
    private String SFYGCG;  // 是否阳光采购
    private String GHDW;    // 供货单位编码
    private String FHDW;    // 发货单位编码
    private String YSFS;    // 运输方式编码
    private Double SSSL;    // 实收数量
    private Double RCRZ;    // 入厂热值
    private Double CBJHS;   // 车板价含税
    private Double CBJBHS;  // 车板价不含税
    private Double CBJSL;   //
    private Double YFHS;    // 运费含税
    private Double YFBHS;   // 运费不含税
    private String MZ;      // 煤种编码
    private Double YFSL;    //
    private Double ZFHS;    //
    private Double ZFBHS;   //
    private Double ZFSL;    //
    private Double QTFYHS;  // 其他费用含税？
    private Double QTFYBHS; // 其他费用不含税？
    private Double ZGSL;    //
    private Double ZGCBJHS; //
    private Double ZGCBJBHS;//
    private Double ZGCBJSL; //
    private Double ZGYFHS;  //
    private Double ZGYFBHS; //
    private Double ZGYFSL;  //
    private Double RCJHS;   // 入厂价含税
    private Double RCJBHS;  // 入厂价不含税
    private String FZ;      // 发站
    private Double RCRZKA;  // 入厂热值大卡
    private String HTBH_ZZ; // 电厂合同编号
    private String SSSF;    // 所属省份

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

    public Integer getCSZT() {
        return CSZT;
    }

    public void setCSZT(Integer CSZT) {
        this.CSZT = CSZT;
    }

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getZBBM() {
        return ZBBM;
    }

    public void setZBBM(String ZBBM) {
        this.ZBBM = ZBBM;
    }

    public String getCGLX() {
        return CGLX;
    }

    public void setCGLX(String CGLX) {
        this.CGLX = CGLX;
    }

    public String getHT() {
        return HT;
    }

    public void setHT(String HT) {
        this.HT = HT;
    }

    public String getSFYGCG() {
        return SFYGCG;
    }

    public void setSFYGCG(String SFYGCG) {
        this.SFYGCG = SFYGCG;
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

    public Double getSSSL() {
        return SSSL;
    }

    public void setSSSL(Double SSSL) {
        this.SSSL = SSSL;
    }

    public Double getRCRZ() {
        return RCRZ;
    }

    public void setRCRZ(Double RCRZ) {
        this.RCRZ = RCRZ;
    }

    public Double getCBJHS() {
        return CBJHS;
    }

    public void setCBJHS(Double CBJHS) {
        this.CBJHS = CBJHS;
    }

    public Double getCBJBHS() {
        return CBJBHS;
    }

    public void setCBJBHS(Double CBJBHS) {
        this.CBJBHS = CBJBHS;
    }

    public Double getCBJSL() {
        return CBJSL;
    }

    public void setCBJSL(Double CBJSL) {
        this.CBJSL = CBJSL;
    }

    public Double getYFHS() {
        return YFHS;
    }

    public void setYFHS(Double YFHS) {
        this.YFHS = YFHS;
    }

    public Double getYFBHS() {
        return YFBHS;
    }

    public void setYFBHS(Double YFBHS) {
        this.YFBHS = YFBHS;
    }

    public String getMZ() {
        return MZ;
    }

    public void setMZ(String MZ) {
        this.MZ = MZ;
    }

    public Double getYFSL() {
        return YFSL;
    }

    public void setYFSL(Double YFSL) {
        this.YFSL = YFSL;
    }

    public Double getZFHS() {
        return ZFHS;
    }

    public void setZFHS(Double ZFHS) {
        this.ZFHS = ZFHS;
    }

    public Double getZFBHS() {
        return ZFBHS;
    }

    public void setZFBHS(Double ZFBHS) {
        this.ZFBHS = ZFBHS;
    }

    public Double getZFSL() {
        return ZFSL;
    }

    public void setZFSL(Double ZFSL) {
        this.ZFSL = ZFSL;
    }

    public Double getQTFYHS() {
        return QTFYHS;
    }

    public void setQTFYHS(Double QTFYHS) {
        this.QTFYHS = QTFYHS;
    }

    public Double getQTFYBHS() {
        return QTFYBHS;
    }

    public void setQTFYBHS(Double QTFYBHS) {
        this.QTFYBHS = QTFYBHS;
    }

    public Double getZGSL() {
        return ZGSL;
    }

    public void setZGSL(Double ZGSL) {
        this.ZGSL = ZGSL;
    }

    public Double getZGCBJHS() {
        return ZGCBJHS;
    }

    public void setZGCBJHS(Double ZGCBJHS) {
        this.ZGCBJHS = ZGCBJHS;
    }

    public Double getZGCBJBHS() {
        return ZGCBJBHS;
    }

    public void setZGCBJBHS(Double ZGCBJBHS) {
        this.ZGCBJBHS = ZGCBJBHS;
    }

    public Double getZGCBJSL() {
        return ZGCBJSL;
    }

    public void setZGCBJSL(Double ZGCBJSL) {
        this.ZGCBJSL = ZGCBJSL;
    }

    public Double getZGYFHS() {
        return ZGYFHS;
    }

    public void setZGYFHS(Double ZGYFHS) {
        this.ZGYFHS = ZGYFHS;
    }

    public Double getZGYFBHS() {
        return ZGYFBHS;
    }

    public void setZGYFBHS(Double ZGYFBHS) {
        this.ZGYFBHS = ZGYFBHS;
    }

    public Double getZGYFSL() {
        return ZGYFSL;
    }

    public void setZGYFSL(Double ZGYFSL) {
        this.ZGYFSL = ZGYFSL;
    }

    public Double getRCJHS() {
        return RCJHS;
    }

    public void setRCJHS(Double RCJHS) {
        this.RCJHS = RCJHS;
    }

    public Double getRCJBHS() {
        return RCJBHS;
    }

    public void setRCJBHS(Double RCJBHS) {
        this.RCJBHS = RCJBHS;
    }

    public String getFZ() {
        return FZ;
    }

    public void setFZ(String FZ) {
        this.FZ = FZ;
    }

    public Double getRCRZKA() {
        return RCRZKA;
    }

    public void setRCRZKA(Double RCRZKA) {
        this.RCRZKA = RCRZKA;
    }

    public String getHTBH_ZZ() {
        return HTBH_ZZ;
    }

    public void setHTBH_ZZ(String HTBH_ZZ) {
        this.HTBH_ZZ = HTBH_ZZ;
    }

    public String getSSSF() {
        return SSSF;
    }

    public void setSSSF(String SSSF) {
        this.SSSF = SSSF;
    }

    @Override
    public String toString() {
        return "V_SJGT_HEAD_RMJGYBB_MXB{" +
                "LXXH=" + LXXH +
                ", DJBH='" + DJBH + '\'' +
                ", YF=" + YF +
                ", FCMC='" + FCMC + '\'' +
                ", CSZT=" + CSZT +
                ", SID=" + SID +
                ", ZBBM='" + ZBBM + '\'' +
                ", CGLX='" + CGLX + '\'' +
                ", HT='" + HT + '\'' +
                ", SFYGCG='" + SFYGCG + '\'' +
                ", GHDW='" + GHDW + '\'' +
                ", FHDW='" + FHDW + '\'' +
                ", YSFS='" + YSFS + '\'' +
                ", SSSL=" + SSSL +
                ", RCRZ=" + RCRZ +
                ", CBJHS=" + CBJHS +
                ", CBJBHS=" + CBJBHS +
                ", CBJSL=" + CBJSL +
                ", YFHS=" + YFHS +
                ", YFBHS=" + YFBHS +
                ", MZ='" + MZ + '\'' +
                ", YFSL=" + YFSL +
                ", ZFHS=" + ZFHS +
                ", ZFBHS=" + ZFBHS +
                ", ZFSL=" + ZFSL +
                ", QTFYHS=" + QTFYHS +
                ", QTFYBHS=" + QTFYBHS +
                ", ZGSL=" + ZGSL +
                ", ZGCBJHS=" + ZGCBJHS +
                ", ZGCBJBHS=" + ZGCBJBHS +
                ", ZGCBJSL=" + ZGCBJSL +
                ", ZGYFHS=" + ZGYFHS +
                ", ZGYFBHS=" + ZGYFBHS +
                ", ZGYFSL=" + ZGYFSL +
                ", RCJHS=" + RCJHS +
                ", RCJBHS=" + RCJBHS +
                ", FZ='" + FZ + '\'' +
                ", RCRZKA=" + RCRZKA +
                ", HTBH_ZZ='" + HTBH_ZZ + '\'' +
                ", SSSF='" + SSSF + '\'' +
                '}';
    }

    public V_SJGT_HEAD_RMJGYBB_MXB() {
    }

    public V_SJGT_HEAD_RMJGYBB_MXB(Integer LXXH, String DJBH, String YF, String FCMC, Integer CSZT, String SID, String ZBBM, String CGLX, String HT, String SFYGCG, String GHDW, String FHDW, String YSFS, Double SSSL, Double RCRZ, Double CBJHS, Double CBJBHS, Double CBJSL, Double YFHS, Double YFBHS, String MZ, Double YFSL, Double ZFHS, Double ZFBHS, Double ZFSL, Double QTFYHS, Double QTFYBHS, Double ZGSL, Double ZGCBJHS, Double ZGCBJBHS, Double ZGCBJSL, Double ZGYFHS, Double ZGYFBHS, Double ZGYFSL, Double RCJHS, Double RCJBHS, String FZ, Double RCRZKA, String HTBH_ZZ, String SSSF) {
        this.LXXH = LXXH;
        this.DJBH = DJBH;
        this.YF = YF;
        this.FCMC = FCMC;
        this.CSZT = CSZT;
        this.SID = SID;
        this.ZBBM = ZBBM;
        this.CGLX = CGLX;
        this.HT = HT;
        this.SFYGCG = SFYGCG;
        this.GHDW = GHDW;
        this.FHDW = FHDW;
        this.YSFS = YSFS;
        this.SSSL = SSSL;
        this.RCRZ = RCRZ;
        this.CBJHS = CBJHS;
        this.CBJBHS = CBJBHS;
        this.CBJSL = CBJSL;
        this.YFHS = YFHS;
        this.YFBHS = YFBHS;
        this.MZ = MZ;
        this.YFSL = YFSL;
        this.ZFHS = ZFHS;
        this.ZFBHS = ZFBHS;
        this.ZFSL = ZFSL;
        this.QTFYHS = QTFYHS;
        this.QTFYBHS = QTFYBHS;
        this.ZGSL = ZGSL;
        this.ZGCBJHS = ZGCBJHS;
        this.ZGCBJBHS = ZGCBJBHS;
        this.ZGCBJSL = ZGCBJSL;
        this.ZGYFHS = ZGYFHS;
        this.ZGYFBHS = ZGYFBHS;
        this.ZGYFSL = ZGYFSL;
        this.RCJHS = RCJHS;
        this.RCJBHS = RCJBHS;
        this.FZ = FZ;
        this.RCRZKA = RCRZKA;
        this.HTBH_ZZ = HTBH_ZZ;
        this.SSSF = SSSF;
    }
}
