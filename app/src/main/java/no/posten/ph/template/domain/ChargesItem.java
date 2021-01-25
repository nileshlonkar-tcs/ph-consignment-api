package no.posten.ph.template.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChargesItem {

    @JsonProperty("netAmount")
    private Double netAmount;

    @JsonProperty("type")
    private String chargeType;

    @JsonProperty("netCur")
    private String netCurrency;

    @JsonProperty("grossAmt")
    private Double grossAmount;

    @JsonProperty("grossCur")
    private String grossCurrency;

    @JsonProperty("code")
    private String chargeCode;

    public ChargesItem() {
    }

    public ChargesItem(Double netAmount, String chargeType, String netCurrency, Double grossAmount, String grossCurrency, String chargeCode) {
        this.netAmount = netAmount;
        this.chargeType = chargeType;
        this.netCurrency = netCurrency;
        this.grossAmount = grossAmount;
        this.grossCurrency = grossCurrency;
        this.chargeCode = chargeCode;
    }

    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setNetCurrency(String netCurrency) {
        this.netCurrency = netCurrency;
    }

    public String getNetCurrency() {
        return netCurrency;
    }

    public void setGrossAmount(Double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public Double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossCurrency(String grossCurrency) {
        this.grossCurrency = grossCurrency;
    }

    public String getGrossCurrency() {
        return grossCurrency;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public String getChargeCode() {
        return chargeCode;
    }
}