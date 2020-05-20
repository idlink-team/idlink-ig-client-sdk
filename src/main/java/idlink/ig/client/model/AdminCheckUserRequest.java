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
 * AdminCheckUserRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-05-20T14:36:13.595+08:00[Asia/Shanghai]")
public class AdminCheckUserRequest {
  @SerializedName("attributes")
  private Map<String, Object> attributes = new HashMap<String, Object>();

  public AdminCheckUserRequest attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public AdminCheckUserRequest putAttributesItem(String key, Object attributesItem) {
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * The value of user&#x27;s Attributes, the key is user&#x27;s attribute code which you are going to confirm, and the value is the corresponding factual data
   * @return attributes
  **/
  @Schema(example = "{\"username\":\"Jack\",\"phone\":123788}", required = true, description = "The value of user's Attributes, the key is user's attribute code which you are going to confirm, and the value is the corresponding factual data")
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
    AdminCheckUserRequest adminCheckUserRequest = (AdminCheckUserRequest) o;
    return ObjectUtils.equals(this.attributes, adminCheckUserRequest.attributes);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminCheckUserRequest {\n");
    
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
