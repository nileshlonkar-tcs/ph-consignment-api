package no.posten.ph.template.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Insurance {

    @JsonProperty("amtCur")
    private String insuredAmountCurrency;

    @JsonProperty("amt")
    private Double insuredAmount;

    @JsonProperty("goodsDesc")
    private String goodsDescription;

    public Insurance() {
    }

    public Insurance(String insuredAmountCurrency, Double insuredAmount, String goodsDescription) {
        this.insuredAmountCurrency = insuredAmountCurrency;
        this.insuredAmount = insuredAmount;
        this.goodsDescription = goodsDescription;
    }

    public void setInsuredAmountCurrency(String insuredAmountCurrency) {
        this.insuredAmountCurrency = insuredAmountCurrency;
    }

    public String getInsuredAmountCurrency() {
        return insuredAmountCurrency;
    }

    public void setInsuredAmount(Double insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public Double getInsuredAmount() {
        return insuredAmount;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    public String getGoodsDescription() {
        return goodsDescription;
    }
}