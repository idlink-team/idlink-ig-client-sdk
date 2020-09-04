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
/**
 * AdminDisableUserRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-04T17:05:14.246+08:00[Asia/Shanghai]")
public class AdminDisableUserRequest {
  @SerializedName("username")
  private String username = null;

  public AdminDisableUserRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username of data which you are going to disable
   * @return username
  **/
  @Schema(example = "Jack", required = true, description = "The username of data which you are going to disable")
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
    AdminDisableUserRequest adminDisableUserRequest = (AdminDisableUserRequest) o;
    return ObjectUtils.equals(this.username, adminDisableUserRequest.username);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminDisableUserRequest {\n");
    
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
