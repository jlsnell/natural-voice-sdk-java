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
 * UploadAudioResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-20T11:03:43.164-07:00")
public class UploadAudioResponseData {
  @SerializedName("audioid")
  private String audioid = null;

  @SerializedName("confidence")
  private Float confidence = null;

  public UploadAudioResponseData audioid(String audioid) {
    this.audioid = audioid;
    return this;
  }

   /**
   * Get audioid
   * @return audioid
  **/
  @ApiModelProperty(value = "")
  public String getAudioid() {
    return audioid;
  }

  public void setAudioid(String audioid) {
    this.audioid = audioid;
  }

  public UploadAudioResponseData confidence(Float confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(value = "")
  public Float getConfidence() {
    return confidence;
  }

  public void setConfidence(Float confidence) {
    this.confidence = confidence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadAudioResponseData uploadAudioResponseData = (UploadAudioResponseData) o;
    return Objects.equals(this.audioid, uploadAudioResponseData.audioid) &&
        Objects.equals(this.confidence, uploadAudioResponseData.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioid, confidence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadAudioResponseData {\n");
    
    sb.append("    audioid: ").append(toIndentedString(audioid)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

