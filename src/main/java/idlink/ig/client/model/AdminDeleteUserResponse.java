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
 * Response data model
 */
@Schema(description = "Response data model")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-09T12:01:47.809+08:00[Asia/Shanghai]")
public class AdminDeleteUserResponse {
  @SerializedName("data")
  private String data = null;

  @SerializedName("detail")
  private String detail = null;

  @SerializedName("httpStatus")
  private String httpStatus = null;

  public AdminDeleteUserResponse data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Response data
   * @return data
  **/
  @Schema(description = "Response data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public AdminDeleteUserResponse detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Response message
   * @return detail
  **/
  @Schema(example = "Operation success", description = "Response message")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public AdminDeleteUserResponse httpStatus(String httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

   /**
   * Response status
   * @return httpStatus
  **/
  @Schema(example = "OK", required = true, description = "Response status")
  public String getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(String httpStatus) {
    this.httpStatus = httpStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AdminDeleteUserResponse adminDeleteUserResponse = (AdminDeleteUserResponse) o;
    return ObjectUtils.equals(this.data, adminDeleteUserResponse.data) &&
    ObjectUtils.equals(this.detail, adminDeleteUserResponse.detail) &&
    ObjectUtils.equals(this.httpStatus, adminDeleteUserResponse.httpStatus);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(data, detail, httpStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminDeleteUserResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
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
