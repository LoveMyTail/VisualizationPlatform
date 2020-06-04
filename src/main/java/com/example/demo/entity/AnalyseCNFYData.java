package com.example.demo.entity;

import java.io.Serializable;

public class AnalyseCNFYData implements Serializable {
    private String YF;
    private Double FY;

    public AnalyseCNFYData() {
    }

    public AnalyseCNFYData(String YF, Double FY) {
        this.YF = YF;
        this.FY = FY;
    }

    public String getYF() {
        return YF;
    }

    public void setYF(String YF) {
        this.YF = YF;
    }

    public Double getFY() {
        return FY;
    }

    public void setFY(Double FY) {
        this.FY = FY;
    }
}
