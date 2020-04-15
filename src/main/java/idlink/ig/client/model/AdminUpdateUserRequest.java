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
 * AdminUpdateUserRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-15T13:55:16.094+08:00[Asia/Shanghai]")
public class AdminUpdateUserRequest {
  @SerializedName("attributes")
  private Map<String, Object> attributes = new HashMap<String, Object>();

  @SerializedName("username")
  private String username = null;

  public AdminUpdateUserRequest attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public AdminUpdateUserRequest putAttributesItem(String key, Object attributesItem) {
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * The attributes of current identity. Key is the attribute name and value is the attribute value. And the key cannot be either password or enable
   * @return attributes
  **/
  @Schema(example = "{\"username\":\"Jack\"}", required = true, description = "The attributes of current identity. Key is the attribute name and value is the attribute value. And the key cannot be either password or enable")
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public AdminUpdateUserRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The old username of data which you are going to modify
   * @return username
  **/
  @Schema(example = "Jack2", required = true, description = "The old username of data which you are going to modify")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AdminUpdateUserRequest adminUpdateUserRequest = (AdminUpdateUserRequest) o;
    return ObjectUtils.equals(this.attributes, adminUpdateUserRequest.attributes) &&
    ObjectUtils.equals(this.username, adminUpdateUserRequest.username);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(attributes, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminUpdateUserRequest {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
