package com.example.demo.entity;

import java.io.Serializable;

/**
 * 库存量质价
 * 其中的库存煤量取自三级贯通收耗存月报（v_sjgt_rmghcyb_zb）
 * 库存煤热值和库存煤价格取自三级贯通燃料成本月报（sjgt_rlcbyb_zb）
 */
public class V_SJGT_SJFX_KCLZJ implements Serializable {
    private String YF;      // 月份
    private Double KCML;    // 库存煤量
    private Double KCRZ;    // 库存热值
    private Double KCDJ;    // 库存单价
    private String FCMC;    // 所属单位
    private Double KCLF;    // 库存硫份

    public V_SJGT_SJFX_KCLZJ(String YF) {
        this.YF = YF;
    }

    @Override
    public String toString() {
        return "V_SJGT_SJFX_KCLZJ{" +
                "YF='" + YF + '\'' +
                ", KCML=" + KCML +
                ", KCRZ=" + KCRZ +
                ", KCDJ=" + KCDJ +
                ", FCMC='" + FCMC + '\'' +
                ", KCLF=" + KCLF +
                '}';
    }

    public String getYF() {
        return YF;
    }

    public void setYF(String YF) {
        this.YF = YF;
    }

    public Double getKCML() {
        return KCML;
    }

    public void setKCML(Double KCML) {
        this.KCML = KCML;
    }

    public Double getKCRZ() {
        return KCRZ;
    }

    public void setKCRZ(Double KCRZ) {
        this.KCRZ = KCRZ;
    }

    public Double getKCDJ() {
        return KCDJ;
    }

    public void setKCDJ(Double KCDJ) {
        this.KCDJ = KCDJ;
    }

    public String getFCMC() {
        return FCMC;
    }

    public void setFCMC(String FCMC) {
        this.FCMC = FCMC;
    }

    public Double getKCLF() {
        return KCLF;
    }

    public void setKCLF(Double KCLF) {
        this.KCLF = KCLF;
    }
}
