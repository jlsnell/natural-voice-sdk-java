/*
 * GeoJSON geometry
 * An example of swagger file for a geographic API. It contains the geometry definitions
 *
 * OpenAPI spec version: 1.0.0
 * Contact: daniele.andreis@gmail.com
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
import io.swagger.client.model.Geometry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GeoJSon geometry collection
 */
@ApiModel(description = "GeoJSon geometry collection")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-16T10:51:27.582-07:00")
public class GeometryCollection {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    GEOMETRYCOLLECTION("GeometryCollection");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("geometries")
  private List<Geometry> geometries = new ArrayList<Geometry>();

  public GeometryCollection type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public GeometryCollection geometries(List<Geometry> geometries) {
    this.geometries = geometries;
    return this;
  }

  public GeometryCollection addGeometriesItem(Geometry geometriesItem) {
    this.geometries.add(geometriesItem);
    return this;
  }

   /**
   * Get geometries
   * @return geometries
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Geometry> getGeometries() {
    return geometries;
  }

  public void setGeometries(List<Geometry> geometries) {
    this.geometries = geometries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeometryCollection geometryCollection = (GeometryCollection) o;
    return Objects.equals(this.type, geometryCollection.type) &&
        Objects.equals(this.geometries, geometryCollection.geometries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, geometries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeometryCollection {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    geometries: ").append(toIndentedString(geometries)).append("\n");
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

