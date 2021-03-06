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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DeliveryDetails
 */
@JsonPropertyOrder({
  DeliveryDetails.JSON_PROPERTY_LEGITIMATION_ID_TYPE,
  DeliveryDetails.JSON_PROPERTY_LEGITIMATION_ID,
  DeliveryDetails.JSON_PROPERTY_DELIVERED_BY_ID
})
@JsonTypeName("deliveryDetails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-19T14:59:14.427251100+05:30[Asia/Calcutta]")
public class DeliveryDetails {
  public static final String JSON_PROPERTY_LEGITIMATION_ID_TYPE = "legitimationIdType";
  private String legitimationIdType;

  public static final String JSON_PROPERTY_LEGITIMATION_ID = "legitimationId";
  private String legitimationId;

  public static final String JSON_PROPERTY_DELIVERED_BY_ID = "deliveredById";
  private String deliveredById;


  public DeliveryDetails legitimationIdType(String legitimationIdType) {
    
    this.legitimationIdType = legitimationIdType;
    return this;
  }

   /**
   * Get legitimationIdType
   * @return legitimationIdType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEGITIMATION_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLegitimationIdType() {
    return legitimationIdType;
  }


  public void setLegitimationIdType(String legitimationIdType) {
    this.legitimationIdType = legitimationIdType;
  }


  public DeliveryDetails legitimationId(String legitimationId) {
    
    this.legitimationId = legitimationId;
    return this;
  }

   /**
   * Get legitimationId
   * @return legitimationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEGITIMATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLegitimationId() {
    return legitimationId;
  }


  public void setLegitimationId(String legitimationId) {
    this.legitimationId = legitimationId;
  }


  public DeliveryDetails deliveredById(String deliveredById) {
    
    this.deliveredById = deliveredById;
    return this;
  }

   /**
   * Get deliveredById
   * @return deliveredById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELIVERED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeliveredById() {
    return deliveredById;
  }


  public void setDeliveredById(String deliveredById) {
    this.deliveredById = deliveredById;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryDetails deliveryDetails = (DeliveryDetails) o;
    return Objects.equals(this.legitimationIdType, deliveryDetails.legitimationIdType) &&
        Objects.equals(this.legitimationId, deliveryDetails.legitimationId) &&
        Objects.equals(this.deliveredById, deliveryDetails.deliveredById);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legitimationIdType, legitimationId, deliveredById);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryDetails {\n");
    sb.append("    legitimationIdType: ").append(toIndentedString(legitimationIdType)).append("\n");
    sb.append("    legitimationId: ").append(toIndentedString(legitimationId)).append("\n");
    sb.append("    deliveredById: ").append(toIndentedString(deliveredById)).append("\n");
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

