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
import io.swagger.client.model.SentimentType;
import java.io.IOException;

/**
 * TranscriptData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-16T10:51:26.266-07:00")
public class TranscriptData {
  @SerializedName("confidence")
  private Float confidence = null;

  @SerializedName("transcript")
  private String transcript = null;

  @SerializedName("sentimentType")
  private SentimentType sentimentType = null;

  public TranscriptData confidence(Float confidence) {
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

  public TranscriptData transcript(String transcript) {
    this.transcript = transcript;
    return this;
  }

   /**
   * Get transcript
   * @return transcript
  **/
  @ApiModelProperty(value = "")
  public String getTranscript() {
    return transcript;
  }

  public void setTranscript(String transcript) {
    this.transcript = transcript;
  }

  public TranscriptData sentimentType(SentimentType sentimentType) {
    this.sentimentType = sentimentType;
    return this;
  }

   /**
   * Get sentimentType
   * @return sentimentType
  **/
  @ApiModelProperty(value = "")
  public SentimentType getSentimentType() {
    return sentimentType;
  }

  public void setSentimentType(SentimentType sentimentType) {
    this.sentimentType = sentimentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptData transcriptData = (TranscriptData) o;
    return Objects.equals(this.confidence, transcriptData.confidence) &&
        Objects.equals(this.transcript, transcriptData.transcript) &&
        Objects.equals(this.sentimentType, transcriptData.sentimentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, transcript, sentimentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptData {\n");
    
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("    sentimentType: ").append(toIndentedString(sentimentType)).append("\n");
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

