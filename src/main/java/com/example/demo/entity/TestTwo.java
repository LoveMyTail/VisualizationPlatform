package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

// 原Excel表名为月度区域电厂对标测试数据
public class TestTwo implements Serializable {
    private Integer id;
    private Date datetime;
    private String belongs;
    private String powerPlant;
    private Float coalComing;
    private Float calorificValue;
    private Float taxBid;
    private Float DY_RCBMDJ_BHS;
    private Integer regionalRanking;
    private Float DY_RCBMDJ_QYPJ_HS;
    private Float coalComingTotal;
    private Float calorificValueTotal;
    private Float taxBidTotal;
    private Float LJ_RCBMDJ_BHS;
    private Integer regionalRankingForTaxBid;
    private Float LJ_RCBMDJ_QYPJ_HS;
    private Float consumption;
    private Float calorificValueInStove;
    private Float bidInStove;
    private Float consumptionTotal;
    private Float calorificValueTotalInStove;
    private Float bidTotalInStove;
    private Float coalInventory;

    public TestTwo() {
    }

    public TestTwo(Integer id, Date datetime, String belongs, Float taxBid) {
        this.id = id;
        this.datetime = datetime;
        this.belongs = belongs;
        this.taxBid = taxBid;
    }

    @Override
    public String toString() {
        return "TestTwo{" +
                "id=" + id +
                ", datetime=" + datetime +
                ", belongs='" + belongs + '\'' +
                ", powerPlant='" + powerPlant + '\'' +
                ", coalComing=" + coalComing +
                ", calorificValue=" + calorificValue +
                ", taxBid=" + taxBid +
                ", DY_RCBMDJ_BHS=" + DY_RCBMDJ_BHS +
                ", regionalRanking=" + regionalRanking +
                ", DY_RCBMDJ_QYPJ_HS=" + DY_RCBMDJ_QYPJ_HS +
                ", coalComingTotal=" + coalComingTotal +
                ", calorificValueTotal=" + calorificValueTotal +
                ", taxBidTotal=" + taxBidTotal +
                ", LJ_RCBMDJ_BHS=" + LJ_RCBMDJ_BHS +
                ", regionalRankingForTaxBid=" + regionalRankingForTaxBid +
                ", LJ_RCBMDJ_QYPJ_HS=" + LJ_RCBMDJ_QYPJ_HS +
                ", consumption=" + consumption +
                ", calorificValueInStove=" + calorificValueInStove +
                ", bidInStove=" + bidInStove +
                ", consumptionTotal=" + consumptionTotal +
                ", calorificValueTotalInStove=" + calorificValueTotalInStove +
                ", bidTotalInStove=" + bidTotalInStove +
                ", coalInventory=" + coalInventory +
                '}';
    }

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

    public String getBelongs() {
        return belongs;
    }

    public void setBelongs(String belongs) {
        this.belongs = belongs;
    }

    public String getPowerPlant() {
        return powerPlant;
    }

    public void setPowerPlant(String powerPlant) {
        this.powerPlant = powerPlant;
    }

    public Float getCoalComing() {
        return coalComing;
    }

    public void setCoalComing(Float coalComing) {
        this.coalComing = coalComing;
    }

    public Float getCalorificValue() {
        return calorificValue;
    }

    public void setCalorificValue(Float calorificValue) {
        this.calorificValue = calorificValue;
    }

    public Float getTaxBid() {
        return taxBid;
    }

    public void setTaxBid(Float taxBid) {
        this.taxBid = taxBid;
    }

    public Float getDY_RCBMDJ_BHS() {
        return DY_RCBMDJ_BHS;
    }

    public void setDY_RCBMDJ_BHS(Float DY_RCBMDJ_BHS) {
        this.DY_RCBMDJ_BHS = DY_RCBMDJ_BHS;
    }

    public Integer getRegionalRanking() {
        return regionalRanking;
    }

    public void setRegionalRanking(Integer regionalRanking) {
        this.regionalRanking = regionalRanking;
    }

    public Float getDY_RCBMDJ_QYPJ_HS() {
        return DY_RCBMDJ_QYPJ_HS;
    }

    public void setDY_RCBMDJ_QYPJ_HS(Float DY_RCBMDJ_QYPJ_HS) {
        this.DY_RCBMDJ_QYPJ_HS = DY_RCBMDJ_QYPJ_HS;
    }

    public Float getCoalComingTotal() {
        return coalComingTotal;
    }

    public void setCoalComingTotal(Float coalComingTotal) {
        this.coalComingTotal = coalComingTotal;
    }

    public Float getCalorificValueTotal() {
        return calorificValueTotal;
    }

    public void setCalorificValueTotal(Float calorificValueTotal) {
        this.calorificValueTotal = calorificValueTotal;
    }

    public Float getTaxBidTotal() {
        return taxBidTotal;
    }

    public void setTaxBidTotal(Float taxBidTotal) {
        this.taxBidTotal = taxBidTotal;
    }

    public Float getLJ_RCBMDJ_BHS() {
        return LJ_RCBMDJ_BHS;
    }

    public void setLJ_RCBMDJ_BHS(Float LJ_RCBMDJ_BHS) {
        this.LJ_RCBMDJ_BHS = LJ_RCBMDJ_BHS;
    }

    public Integer getRegionalRankingForTaxBid() {
        return regionalRankingForTaxBid;
    }

    public void setRegionalRankingForTaxBid(Integer regionalRankingForTaxBid) {
        this.regionalRankingForTaxBid = regionalRankingForTaxBid;
    }

    public Float getLJ_RCBMDJ_QYPJ_HS() {
        return LJ_RCBMDJ_QYPJ_HS;
    }

    public void setLJ_RCBMDJ_QYPJ_HS(Float LJ_RCBMDJ_QYPJ_HS) {
        this.LJ_RCBMDJ_QYPJ_HS = LJ_RCBMDJ_QYPJ_HS;
    }

    public Float getConsumption() {
        return consumption;
    }

    public void setConsumption(Float consumption) {
        this.consumption = consumption;
    }

    public Float getCalorificValueInStove() {
        return calorificValueInStove;
    }

    public void setCalorificValueInStove(Float calorificValueInStove) {
        this.calorificValueInStove = calorificValueInStove;
    }

    public Float getBidInStove() {
        return bidInStove;
    }

    public void setBidInStove(Float bidInStove) {
        this.bidInStove = bidInStove;
    }

    public Float getConsumptionTotal() {
        return consumptionTotal;
    }

    public void setConsumptionTotal(Float consumptionTotal) {
        this.consumptionTotal = consumptionTotal;
    }

    public Float getCalorificValueTotalInStove() {
        return calorificValueTotalInStove;
    }

    public void setCalorificValueTotalInStove(Float calorificValueTotalInStove) {
        this.calorificValueTotalInStove = calorificValueTotalInStove;
    }

    public Float getBidTotalInStove() {
        return bidTotalInStove;
    }

    public void setBidTotalInStove(Float bidTotalInStove) {
        this.bidTotalInStove = bidTotalInStove;
    }

    public Float getCoalInventory() {
        return coalInventory;
    }

    public void setCoalInventory(Float coalInventory) {
        this.coalInventory = coalInventory;
    }
}
