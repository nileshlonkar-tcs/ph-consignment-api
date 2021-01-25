package no.posten.ph.template.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VasItem {

    @JsonProperty("discPct")
    private Double discountPercent;

    @JsonProperty("vasCd")
    private String VASCode;

    @JsonProperty("svcReqs")
    private String serviceRequirements;

    @JsonProperty("modSvcId")
    private String modifiedProgramId;

    @JsonProperty("crtdSvcId")
    private String createProgramId;

    @JsonProperty("modTs")
    private String modifiedTimestamp;

    @JsonProperty("crtdTs")
    private String createTimestamp;

    public Double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getVASCode() {
        return VASCode;
    }

    public void setVASCode(String VASCode) {
        this.VASCode = VASCode;
    }

    public String getServiceRequirements() {
        return serviceRequirements;
    }

    public void setServiceRequirements(String serviceRequirements) {
        this.serviceRequirements = serviceRequirements;
    }

    public String getModifiedProgramId() {
        return modifiedProgramId;
    }

    public void setModifiedProgramId(String modifiedProgramId) {
        this.modifiedProgramId = modifiedProgramId;
    }

    public String getCreateProgramId() {
        return createProgramId;
    }

    public void setCreateProgramId(String createProgramId) {
        this.createProgramId = createProgramId;
    }

    public String getModifiedTimestamp() {
        return modifiedTimestamp;
    }

    public void setModifiedTimestamp(String modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
    }

    public String getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
}