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
 * Account
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T12:12:43.391-07:00")
public class Account {
  @SerializedName("requestid")
  private String requestid = null;

  @SerializedName("accountid")
  private String accountid = null;

  @SerializedName("modifiedByAccountId")
  private String modifiedByAccountId = null;

  @SerializedName("userid")
  private String userid = null;

  @SerializedName("apikey")
  private String apikey = null;

  @SerializedName("datecreated")
  private Integer datecreated = null;

  public Account requestid(String requestid) {
    this.requestid = requestid;
    return this;
  }

   /**
   * Get requestid
   * @return requestid
  **/
  @ApiModelProperty(value = "")
  public String getRequestid() {
    return requestid;
  }

  public void setRequestid(String requestid) {
    this.requestid = requestid;
  }

  public Account accountid(String accountid) {
    this.accountid = accountid;
    return this;
  }

   /**
   * Get accountid
   * @return accountid
  **/
  @ApiModelProperty(value = "")
  public String getAccountid() {
    return accountid;
  }

  public void setAccountid(String accountid) {
    this.accountid = accountid;
  }

  public Account modifiedByAccountId(String modifiedByAccountId) {
    this.modifiedByAccountId = modifiedByAccountId;
    return this;
  }

   /**
   * Get modifiedByAccountId
   * @return modifiedByAccountId
  **/
  @ApiModelProperty(value = "")
  public String getModifiedByAccountId() {
    return modifiedByAccountId;
  }

  public void setModifiedByAccountId(String modifiedByAccountId) {
    this.modifiedByAccountId = modifiedByAccountId;
  }

  public Account userid(String userid) {
    this.userid = userid;
    return this;
  }

   /**
   * Get userid
   * @return userid
  **/
  @ApiModelProperty(value = "")
  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public Account apikey(String apikey) {
    this.apikey = apikey;
    return this;
  }

   /**
   * Get apikey
   * @return apikey
  **/
  @ApiModelProperty(value = "")
  public String getApikey() {
    return apikey;
  }

  public void setApikey(String apikey) {
    this.apikey = apikey;
  }

  public Account datecreated(Integer datecreated) {
    this.datecreated = datecreated;
    return this;
  }

   /**
   * Get datecreated
   * @return datecreated
  **/
  @ApiModelProperty(value = "")
  public Integer getDatecreated() {
    return datecreated;
  }

  public void setDatecreated(Integer datecreated) {
    this.datecreated = datecreated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.requestid, account.requestid) &&
        Objects.equals(this.accountid, account.accountid) &&
        Objects.equals(this.modifiedByAccountId, account.modifiedByAccountId) &&
        Objects.equals(this.userid, account.userid) &&
        Objects.equals(this.apikey, account.apikey) &&
        Objects.equals(this.datecreated, account.datecreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestid, accountid, modifiedByAccountId, userid, apikey, datecreated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    requestid: ").append(toIndentedString(requestid)).append("\n");
    sb.append("    accountid: ").append(toIndentedString(accountid)).append("\n");
    sb.append("    modifiedByAccountId: ").append(toIndentedString(modifiedByAccountId)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    apikey: ").append(toIndentedString(apikey)).append("\n");
    sb.append("    datecreated: ").append(toIndentedString(datecreated)).append("\n");
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

