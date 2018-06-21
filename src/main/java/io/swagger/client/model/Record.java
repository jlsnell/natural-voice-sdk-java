/*
 * AimMatic API
 * APIs for Natural Voice and placeNext
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Record
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T12:12:43.391-07:00")
public class Record {
  @SerializedName("confidence")
  private Double confidence = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("textpercentage")
  private Double textpercentage = null;

  public Record confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(value = "")
  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  public Record name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Record textpercentage(Double textpercentage) {
    this.textpercentage = textpercentage;
    return this;
  }

   /**
   * Get textpercentage
   * @return textpercentage
  **/
  @ApiModelProperty(value = "")
  public Double getTextpercentage() {
    return textpercentage;
  }

  public void setTextpercentage(Double textpercentage) {
    this.textpercentage = textpercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Record record = (Record) o;
    return Objects.equals(this.confidence, record.confidence) &&
        Objects.equals(this.name, record.name) &&
        Objects.equals(this.textpercentage, record.textpercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, name, textpercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Record {\n");
    
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    textpercentage: ").append(toIndentedString(textpercentage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

