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
import java.io.IOException;

/**
 * Lang
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-26T21:43:31.240-07:00")
public class Lang {
  @SerializedName("name")
  private String name = null;

  @SerializedName("fullname")
  private String fullname = null;

  @SerializedName("speechlang")
  private String speechlang = null;

  @SerializedName("nlplang")
  private String nlplang = null;

  public Lang name(String name) {
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

  public Lang fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * Get fullname
   * @return fullname
  **/
  @ApiModelProperty(value = "")
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public Lang speechlang(String speechlang) {
    this.speechlang = speechlang;
    return this;
  }

   /**
   * Get speechlang
   * @return speechlang
  **/
  @ApiModelProperty(value = "")
  public String getSpeechlang() {
    return speechlang;
  }

  public void setSpeechlang(String speechlang) {
    this.speechlang = speechlang;
  }

  public Lang nlplang(String nlplang) {
    this.nlplang = nlplang;
    return this;
  }

   /**
   * Get nlplang
   * @return nlplang
  **/
  @ApiModelProperty(value = "")
  public String getNlplang() {
    return nlplang;
  }

  public void setNlplang(String nlplang) {
    this.nlplang = nlplang;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lang lang = (Lang) o;
    return Objects.equals(this.name, lang.name) &&
        Objects.equals(this.fullname, lang.fullname) &&
        Objects.equals(this.speechlang, lang.speechlang) &&
        Objects.equals(this.nlplang, lang.nlplang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fullname, speechlang, nlplang);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lang {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    speechlang: ").append(toIndentedString(speechlang)).append("\n");
    sb.append("    nlplang: ").append(toIndentedString(nlplang)).append("\n");
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

