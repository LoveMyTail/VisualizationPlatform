package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class TestOne implements Serializable {
    private Integer id;
    private Date datetime;
    private Integer inventoryCoal;
    private Integer inventoryCalorificValue;
    private Float unitPrice;
    private String fcmc;
    private Float inventorySulfur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Integer getInventoryCoal() {
        return inventoryCoal;
    }

    public void setInventoryCoal(Integer inventoryCoal) {
        this.inventoryCoal = inventoryCoal;
    }

    public Integer getInventoryCalorificValue() {
        return inventoryCalorificValue;
    }

    public void setInventoryCalorificValue(Integer inventoryCalorificValue) {
        this.inventoryCalorificValue = inventoryCalorificValue;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getFcmc() {
        return fcmc;
    }

    public void setFcmc(String fcmc) {
        this.fcmc = fcmc;
    }

    public Float getInventorySulfur() {
        return inventorySulfur;
    }

    public void setInventorySulfur(Float inventorySulfur) {
        this.inventorySulfur = inventorySulfur;
    }
}
