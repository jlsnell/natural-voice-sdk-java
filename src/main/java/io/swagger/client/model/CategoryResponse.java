/*
 * Natural Voice SDK
 * Natural Voice SDKs are easiest and best supported way for most developers to quickly build and iterate Natural Voice applications that integrate with our services programmatically.
 *
 * OpenAPI spec version: 1.2.0
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
import io.swagger.client.model.Account;
import io.swagger.client.model.BaseResponse;
import io.swagger.client.model.Record;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CategoryResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-26T21:43:31.240-07:00")
public class CategoryResponse {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("account")
  private Account account = null;

  @SerializedName("numtexts")
  private Integer numtexts = null;

  @SerializedName("records")
  private List<Record> records = null;

  public CategoryResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public CategoryResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CategoryResponse account(Account account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public CategoryResponse numtexts(Integer numtexts) {
    this.numtexts = numtexts;
    return this;
  }

   /**
   * Get numtexts
   * @return numtexts
  **/
  @ApiModelProperty(value = "")
  public Integer getNumtexts() {
    return numtexts;
  }

  public void setNumtexts(Integer numtexts) {
    this.numtexts = numtexts;
  }

  public CategoryResponse records(List<Record> records) {
    this.records = records;
    return this;
  }

  public CategoryResponse addRecordsItem(Record recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<Record>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @ApiModelProperty(value = "")
  public List<Record> getRecords() {
    return records;
  }

  public void setRecords(List<Record> records) {
    this.records = records;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryResponse categoryResponse = (CategoryResponse) o;
    return Objects.equals(this.code, categoryResponse.code) &&
        Objects.equals(this.message, categoryResponse.message) &&
        Objects.equals(this.account, categoryResponse.account) &&
        Objects.equals(this.numtexts, categoryResponse.numtexts) &&
        Objects.equals(this.records, categoryResponse.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, account, numtexts, records);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    numtexts: ").append(toIndentedString(numtexts)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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

