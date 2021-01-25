package no.posten.ph.template.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuditFields {

    @JsonProperty("crtdUser")
    private String createdUserId;

    @JsonProperty("crtdTs")
    private String createdTimestamp;

    @JsonProperty("modUser")
    private String modifiedUserId;

    @JsonProperty("modTs")
    private String modifiedTimestamp;

    @JsonProperty("modSvcId")
    private String modifiedProgramId;

    @JsonProperty("crtdSvcId")
    private String createdProgramId;

    @JsonProperty("modCompCd")
    private String modifiedCompanyCode;

    @JsonProperty("crtdCompCd")
    private String createdCompanyCode;

    @JsonProperty("wkNo")
    private String weekNr;

    @JsonProperty("msgId")
    private String messageID;

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public String getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public String getModifiedTimestamp() {
        return modifiedTimestamp;
    }

    public void setModifiedTimestamp(String modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
    }

    public String getModifiedProgramId() {
        return modifiedProgramId;
    }

    public void setModifiedProgramId(String modifiedProgramId) {
        this.modifiedProgramId = modifiedProgramId;
    }

    public String getCreatedProgramId() {
        return createdProgramId;
    }

    public void setCreatedProgramId(String createdProgramId) {
        this.createdProgramId = createdProgramId;
    }

    public String getModifiedCompanyCode() {
        return modifiedCompanyCode;
    }

    public void setModifiedCompanyCode(String modifiedCompanyCode) {
        this.modifiedCompanyCode = modifiedCompanyCode;
    }

    public String getWeekNr() {
        return weekNr;
    }

    public void setWeekNr(String weekNr) {
        this.weekNr = weekNr;
    }

    public String getCreatedCompanyCode() {
        return createdCompanyCode;
    }

    public void setCreatedCompanyCode(String createdCompanyCode) {
        this.createdCompanyCode = createdCompanyCode;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }
}