/*
 * ID LINK
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package idlink.ig.client.model;

import org.apache.commons.lang3.ObjectUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * AdminCreateUserRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-14T18:48:52.841+08:00[Asia/Shanghai]")
public class AdminCreateUserRequest {
  @SerializedName("attributes")
  private Map<String, Object> attributes = new HashMap<String, Object>();

  public AdminCreateUserRequest attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public AdminCreateUserRequest putAttributesItem(String key, Object attributesItem) {
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * The attributes of current identity. Key is the attribute name and value is the attribute value.
   * @return attributes
  **/
  @Schema(example = "{\"username\":\"Jack\",\"password\":\"password\",\"enable\":true}", required = true, description = "The attributes of current identity. Key is the attribute name and value is the attribute value.")
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AdminCreateUserRequest adminCreateUserRequest = (AdminCreateUserRequest) o;
    return ObjectUtils.equals(this.attributes, adminCreateUserRequest.attributes);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminCreateUserRequest {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
