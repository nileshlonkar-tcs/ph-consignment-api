/*
 * Consignment Service
 * Consignment service API.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package no.posten.ph.consignment.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Attributes
 */
@JsonPropertyOrder({
  Attributes.JSON_PROPERTY_ACTOR_NO_SOURCE,
  Attributes.JSON_PROPERTY_EVENT_CODE_SOURCE,
  Attributes.JSON_PROPERTY_ACTION_CODE_SOURCE,
  Attributes.JSON_PROPERTY_REASON_CODE_SOURCE,
  Attributes.JSON_PROPERTY_EVENT_SOURCE,
  Attributes.JSON_PROPERTY_STATUS_MASS_REGISTRATION,
  Attributes.JSON_PROPERTY_TIMESTAMP_U_T_C,
  Attributes.JSON_PROPERTY_TIMEZONE_U_T_C,
  Attributes.JSON_PROPERTY_TOTAL_REGISTERED,
  Attributes.JSON_PROPERTY_VOLUME_REGISTERED,
  Attributes.JSON_PROPERTY_AMOUNT_PAID,
  Attributes.JSON_PROPERTY_CHARGE_ID,
  Attributes.JSON_PROPERTY_EMS_STATUS,
  Attributes.JSON_PROPERTY_FULL_MAKT_CODE,
  Attributes.JSON_PROPERTY_DAMAGE_TYPE_CODE
})
@JsonTypeName("attributes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-19T14:59:14.427251100+05:30[Asia/Calcutta]")
public class Attributes {
  public static final String JSON_PROPERTY_ACTOR_NO_SOURCE = "actorNoSource";
  private String actorNoSource;

  public static final String JSON_PROPERTY_EVENT_CODE_SOURCE = "eventCodeSource";
  private String eventCodeSource;

  public static final String JSON_PROPERTY_ACTION_CODE_SOURCE = "actionCodeSource";
  private String actionCodeSource;

  public static final String JSON_PROPERTY_REASON_CODE_SOURCE = "reasonCodeSource";
  private String reasonCodeSource;

  public static final String JSON_PROPERTY_EVENT_SOURCE = "eventSource";
  private String eventSource;

  public static final String JSON_PROPERTY_STATUS_MASS_REGISTRATION = "statusMassRegistration";
  private String statusMassRegistration;

  public static final String JSON_PROPERTY_TIMESTAMP_U_T_C = "timestampUTC";
  private String timestampUTC;

  public static final String JSON_PROPERTY_TIMEZONE_U_T_C = "timezoneUTC";
  private BigDecimal timezoneUTC;

  public static final String JSON_PROPERTY_TOTAL_REGISTERED = "totalRegistered";
  private BigDecimal totalRegistered;

  public static final String JSON_PROPERTY_VOLUME_REGISTERED = "volumeRegistered";
  private BigDecimal volumeRegistered;

  public static final String JSON_PROPERTY_AMOUNT_PAID = "amountPaid";
  private BigDecimal amountPaid;

  public static final String JSON_PROPERTY_CHARGE_ID = "chargeId";
  private String chargeId;

  public static final String JSON_PROPERTY_EMS_STATUS = "emsStatus";
  private String emsStatus;

  public static final String JSON_PROPERTY_FULL_MAKT_CODE = "fullMaktCode";
  private String fullMaktCode;

  public static final String JSON_PROPERTY_DAMAGE_TYPE_CODE = "damageTypeCode";
  private String damageTypeCode;


  public Attributes actorNoSource(String actorNoSource) {
    
    this.actorNoSource = actorNoSource;
    return this;
  }

   /**
   * Get actorNoSource
   * @return actorNoSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTOR_NO_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActorNoSource() {
    return actorNoSource;
  }


  public void setActorNoSource(String actorNoSource) {
    this.actorNoSource = actorNoSource;
  }


  public Attributes eventCodeSource(String eventCodeSource) {
    
    this.eventCodeSource = eventCodeSource;
    return this;
  }

   /**
   * Get eventCodeSource
   * @return eventCodeSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENT_CODE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventCodeSource() {
    return eventCodeSource;
  }


  public void setEventCodeSource(String eventCodeSource) {
    this.eventCodeSource = eventCodeSource;
  }


  public Attributes actionCodeSource(String actionCodeSource) {
    
    this.actionCodeSource = actionCodeSource;
    return this;
  }

   /**
   * Get actionCodeSource
   * @return actionCodeSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTION_CODE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActionCodeSource() {
    return actionCodeSource;
  }


  public void setActionCodeSource(String actionCodeSource) {
    this.actionCodeSource = actionCodeSource;
  }


  public Attributes reasonCodeSource(String reasonCodeSource) {
    
    this.reasonCodeSource = reasonCodeSource;
    return this;
  }

   /**
   * Get reasonCodeSource
   * @return reasonCodeSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REASON_CODE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReasonCodeSource() {
    return reasonCodeSource;
  }


  public void setReasonCodeSource(String reasonCodeSource) {
    this.reasonCodeSource = reasonCodeSource;
  }


  public Attributes eventSource(String eventSource) {
    
    this.eventSource = eventSource;
    return this;
  }

   /**
   * Get eventSource
   * @return eventSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENT_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventSource() {
    return eventSource;
  }


  public void setEventSource(String eventSource) {
    this.eventSource = eventSource;
  }


  public Attributes statusMassRegistration(String statusMassRegistration) {
    
    this.statusMassRegistration = statusMassRegistration;
    return this;
  }

   /**
   * Get statusMassRegistration
   * @return statusMassRegistration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS_MASS_REGISTRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatusMassRegistration() {
    return statusMassRegistration;
  }


  public void setStatusMassRegistration(String statusMassRegistration) {
    this.statusMassRegistration = statusMassRegistration;
  }


  public Attributes timestampUTC(String timestampUTC) {
    
    this.timestampUTC = timestampUTC;
    return this;
  }

   /**
   * Get timestampUTC
   * @return timestampUTC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_U_T_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimestampUTC() {
    return timestampUTC;
  }


  public void setTimestampUTC(String timestampUTC) {
    this.timestampUTC = timestampUTC;
  }


  public Attributes timezoneUTC(BigDecimal timezoneUTC) {
    
    this.timezoneUTC = timezoneUTC;
    return this;
  }

   /**
   * Get timezoneUTC
   * @return timezoneUTC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMEZONE_U_T_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTimezoneUTC() {
    return timezoneUTC;
  }


  public void setTimezoneUTC(BigDecimal timezoneUTC) {
    this.timezoneUTC = timezoneUTC;
  }


  public Attributes totalRegistered(BigDecimal totalRegistered) {
    
    this.totalRegistered = totalRegistered;
    return this;
  }

   /**
   * Get totalRegistered
   * @return totalRegistered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_REGISTERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalRegistered() {
    return totalRegistered;
  }


  public void setTotalRegistered(BigDecimal totalRegistered) {
    this.totalRegistered = totalRegistered;
  }


  public Attributes volumeRegistered(BigDecimal volumeRegistered) {
    
    this.volumeRegistered = volumeRegistered;
    return this;
  }

   /**
   * Get volumeRegistered
   * @return volumeRegistered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOLUME_REGISTERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getVolumeRegistered() {
    return volumeRegistered;
  }


  public void setVolumeRegistered(BigDecimal volumeRegistered) {
    this.volumeRegistered = volumeRegistered;
  }


  public Attributes amountPaid(BigDecimal amountPaid) {
    
    this.amountPaid = amountPaid;
    return this;
  }

   /**
   * Get amountPaid
   * @return amountPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT_PAID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmountPaid() {
    return amountPaid;
  }


  public void setAmountPaid(BigDecimal amountPaid) {
    this.amountPaid = amountPaid;
  }


  public Attributes chargeId(String chargeId) {
    
    this.chargeId = chargeId;
    return this;
  }

   /**
   * Get chargeId
   * @return chargeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHARGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChargeId() {
    return chargeId;
  }


  public void setChargeId(String chargeId) {
    this.chargeId = chargeId;
  }


  public Attributes emsStatus(String emsStatus) {
    
    this.emsStatus = emsStatus;
    return this;
  }

   /**
   * Get emsStatus
   * @return emsStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmsStatus() {
    return emsStatus;
  }


  public void setEmsStatus(String emsStatus) {
    this.emsStatus = emsStatus;
  }


  public Attributes fullMaktCode(String fullMaktCode) {
    
    this.fullMaktCode = fullMaktCode;
    return this;
  }

   /**
   * Get fullMaktCode
   * @return fullMaktCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FULL_MAKT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullMaktCode() {
    return fullMaktCode;
  }


  public void setFullMaktCode(String fullMaktCode) {
    this.fullMaktCode = fullMaktCode;
  }


  public Attributes damageTypeCode(String damageTypeCode) {
    
    this.damageTypeCode = damageTypeCode;
    return this;
  }

   /**
   * Get damageTypeCode
   * @return damageTypeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAMAGE_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDamageTypeCode() {
    return damageTypeCode;
  }


  public void setDamageTypeCode(String damageTypeCode) {
    this.damageTypeCode = damageTypeCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attributes attributes = (Attributes) o;
    return Objects.equals(this.actorNoSource, attributes.actorNoSource) &&
        Objects.equals(this.eventCodeSource, attributes.eventCodeSource) &&
        Objects.equals(this.actionCodeSource, attributes.actionCodeSource) &&
        Objects.equals(this.reasonCodeSource, attributes.reasonCodeSource) &&
        Objects.equals(this.eventSource, attributes.eventSource) &&
        Objects.equals(this.statusMassRegistration, attributes.statusMassRegistration) &&
        Objects.equals(this.timestampUTC, attributes.timestampUTC) &&
        Objects.equals(this.timezoneUTC, attributes.timezoneUTC) &&
        Objects.equals(this.totalRegistered, attributes.totalRegistered) &&
        Objects.equals(this.volumeRegistered, attributes.volumeRegistered) &&
        Objects.equals(this.amountPaid, attributes.amountPaid) &&
        Objects.equals(this.chargeId, attributes.chargeId) &&
        Objects.equals(this.emsStatus, attributes.emsStatus) &&
        Objects.equals(this.fullMaktCode, attributes.fullMaktCode) &&
        Objects.equals(this.damageTypeCode, attributes.damageTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actorNoSource, eventCodeSource, actionCodeSource, reasonCodeSource, eventSource, statusMassRegistration, timestampUTC, timezoneUTC, totalRegistered, volumeRegistered, amountPaid, chargeId, emsStatus, fullMaktCode, damageTypeCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attributes {\n");
    sb.append("    actorNoSource: ").append(toIndentedString(actorNoSource)).append("\n");
    sb.append("    eventCodeSource: ").append(toIndentedString(eventCodeSource)).append("\n");
    sb.append("    actionCodeSource: ").append(toIndentedString(actionCodeSource)).append("\n");
    sb.append("    reasonCodeSource: ").append(toIndentedString(reasonCodeSource)).append("\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    statusMassRegistration: ").append(toIndentedString(statusMassRegistration)).append("\n");
    sb.append("    timestampUTC: ").append(toIndentedString(timestampUTC)).append("\n");
    sb.append("    timezoneUTC: ").append(toIndentedString(timezoneUTC)).append("\n");
    sb.append("    totalRegistered: ").append(toIndentedString(totalRegistered)).append("\n");
    sb.append("    volumeRegistered: ").append(toIndentedString(volumeRegistered)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    chargeId: ").append(toIndentedString(chargeId)).append("\n");
    sb.append("    emsStatus: ").append(toIndentedString(emsStatus)).append("\n");
    sb.append("    fullMaktCode: ").append(toIndentedString(fullMaktCode)).append("\n");
    sb.append("    damageTypeCode: ").append(toIndentedString(damageTypeCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
