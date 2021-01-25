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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Vas
 */
@JsonPropertyOrder({
  Vas.JSON_PROPERTY_VAS_CODE,
  Vas.JSON_PROPERTY_SERVICE_REQUIREMENTS,
  Vas.JSON_PROPERTY_DISCOUNT_PERCENT,
  Vas.JSON_PROPERTY_CREATED_PROGRAM_ID,
  Vas.JSON_PROPERTY_CREATED_TIMESTAMP,
  Vas.JSON_PROPERTY_MODIFIED_PROGRAM_ID,
  Vas.JSON_PROPERTY_MODIFIED_TIMESTAMP
})
@JsonTypeName("vas")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-19T14:59:14.427251100+05:30[Asia/Calcutta]")
public class Vas {
  public static final String JSON_PROPERTY_VAS_CODE = "vasCode";
  private String vasCode;

  public static final String JSON_PROPERTY_SERVICE_REQUIREMENTS = "serviceRequirements";
  private String serviceRequirements;

  public static final String JSON_PROPERTY_DISCOUNT_PERCENT = "discountPercent";
  private String discountPercent;

  public static final String JSON_PROPERTY_CREATED_PROGRAM_ID = "createdProgramId";
  private String createdProgramId;

  public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "createdTimestamp";
  private OffsetDateTime createdTimestamp;

  public static final String JSON_PROPERTY_MODIFIED_PROGRAM_ID = "modifiedProgramId";
  private String modifiedProgramId;

  public static final String JSON_PROPERTY_MODIFIED_TIMESTAMP = "modifiedTimestamp";
  private OffsetDateTime modifiedTimestamp;


  public Vas vasCode(String vasCode) {
    
    this.vasCode = vasCode;
    return this;
  }

   /**
   * Get vasCode
   * @return vasCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VAS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVasCode() {
    return vasCode;
  }


  public void setVasCode(String vasCode) {
    this.vasCode = vasCode;
  }


  public Vas serviceRequirements(String serviceRequirements) {
    
    this.serviceRequirements = serviceRequirements;
    return this;
  }

   /**
   * Get serviceRequirements
   * @return serviceRequirements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceRequirements() {
    return serviceRequirements;
  }


  public void setServiceRequirements(String serviceRequirements) {
    this.serviceRequirements = serviceRequirements;
  }


  public Vas discountPercent(String discountPercent) {
    
    this.discountPercent = discountPercent;
    return this;
  }

   /**
   * Get discountPercent
   * @return discountPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISCOUNT_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDiscountPercent() {
    return discountPercent;
  }


  public void setDiscountPercent(String discountPercent) {
    this.discountPercent = discountPercent;
  }


  public Vas createdProgramId(String createdProgramId) {
    
    this.createdProgramId = createdProgramId;
    return this;
  }

   /**
   * Get createdProgramId
   * @return createdProgramId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_PROGRAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedProgramId() {
    return createdProgramId;
  }


  public void setCreatedProgramId(String createdProgramId) {
    this.createdProgramId = createdProgramId;
  }


  public Vas createdTimestamp(OffsetDateTime createdTimestamp) {
    
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * Get createdTimestamp
   * @return createdTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedTimestamp() {
    return createdTimestamp;
  }


  public void setCreatedTimestamp(OffsetDateTime createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public Vas modifiedProgramId(String modifiedProgramId) {
    
    this.modifiedProgramId = modifiedProgramId;
    return this;
  }

   /**
   * Get modifiedProgramId
   * @return modifiedProgramId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MODIFIED_PROGRAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModifiedProgramId() {
    return modifiedProgramId;
  }


  public void setModifiedProgramId(String modifiedProgramId) {
    this.modifiedProgramId = modifiedProgramId;
  }


  public Vas modifiedTimestamp(OffsetDateTime modifiedTimestamp) {
    
    this.modifiedTimestamp = modifiedTimestamp;
    return this;
  }

   /**
   * Get modifiedTimestamp
   * @return modifiedTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MODIFIED_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedTimestamp() {
    return modifiedTimestamp;
  }


  public void setModifiedTimestamp(OffsetDateTime modifiedTimestamp) {
    this.modifiedTimestamp = modifiedTimestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vas vas = (Vas) o;
    return Objects.equals(this.vasCode, vas.vasCode) &&
        Objects.equals(this.serviceRequirements, vas.serviceRequirements) &&
        Objects.equals(this.discountPercent, vas.discountPercent) &&
        Objects.equals(this.createdProgramId, vas.createdProgramId) &&
        Objects.equals(this.createdTimestamp, vas.createdTimestamp) &&
        Objects.equals(this.modifiedProgramId, vas.modifiedProgramId) &&
        Objects.equals(this.modifiedTimestamp, vas.modifiedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vasCode, serviceRequirements, discountPercent, createdProgramId, createdTimestamp, modifiedProgramId, modifiedTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vas {\n");
    sb.append("    vasCode: ").append(toIndentedString(vasCode)).append("\n");
    sb.append("    serviceRequirements: ").append(toIndentedString(serviceRequirements)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    createdProgramId: ").append(toIndentedString(createdProgramId)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    modifiedProgramId: ").append(toIndentedString(modifiedProgramId)).append("\n");
    sb.append("    modifiedTimestamp: ").append(toIndentedString(modifiedTimestamp)).append("\n");
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
