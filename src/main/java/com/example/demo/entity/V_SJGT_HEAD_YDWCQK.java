package com.example.demo.entity;

import java.io.Serializable;

/**
 * 入炉入厂标单数据
 * 不同的电厂结构相同，所以只需构建一个实体类
 * 在插取所需数据时，只需要根据不同电厂名称在SQL语句部分进行区分即可
 */
public class V_SJGT_HEAD_YDWCQK implements Serializable {
    private String YF;          // 月份
    private Double RCML;        // 入厂煤量
    private Double RLML;        // 入炉煤量
    private Double KC;          // 月末库存
    private Double RCBD;        // 入厂标单
    private Double RLBD;        // 入炉标单
    private Double RCBML;       // 入厂标煤量
    private Double RLZHBZML;    // 入炉综合标煤量

    public V_SJGT_HEAD_YDWCQK() {
    }

    public V_SJGT_HEAD_YDWCQK(String YF) {
        this.YF = YF;
    }

    @Override
    public String toString() {
        return "V_SJGT_HEAD_YDWCQK{" +
                "YF='" + YF + '\'' +
                ", RCML=" + RCML +
                ", RLML=" + RLML +
                ", KC=" + KC +
                ", RCBD=" + RCBD +
                ", RLBD=" + RLBD +
                ", RCBML=" + RCBML +
                ", RLZHBZML=" + RLZHBZML +
                '}';
    }

    public String getYF() {
        return YF;
    }

    public void setYF(String YF) {
        this.YF = YF;
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

    public Double getRCBD() {
        return RCBD;
    }

    public void setRCBD(Double RCBD) {
        this.RCBD = RCBD;
    }

    public Double getRLBD() {
        return RLBD;
    }

    public void setRLBD(Double RLBD) {
        this.RLBD = RLBD;
    }

    public Double getRCBML() {
        return RCBML;
    }

    public void setRCBML(Double RCBML) {
        this.RCBML = RCBML;
    }

    public Double getRLZHBZML() {
        return RLZHBZML;
    }

    public void setRLZHBZML(Double RLZHBZML) {
        this.RLZHBZML = RLZHBZML;
    }
}
