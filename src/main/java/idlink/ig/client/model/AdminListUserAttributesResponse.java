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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-09T19:51:54.787+08:00[Asia/Shanghai]")
public class AdminListUserAttributesResponse {
  @SerializedName("data")
  private Object data = null;

  @SerializedName("detail")
  private String detail = null;

  @SerializedName("httpStatus")
  private String httpStatus = null;

  public AdminListUserAttributesResponse data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Response data
   * @return data
  **/
  @Schema(description = "Response data")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public AdminListUserAttributesResponse detail(String detail) {
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

  public AdminListUserAttributesResponse httpStatus(String httpStatus) {
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
    AdminListUserAttributesResponse adminListUserAttributesResponse = (AdminListUserAttributesResponse) o;
    return ObjectUtils.equals(this.data, adminListUserAttributesResponse.data) &&
    ObjectUtils.equals(this.detail, adminListUserAttributesResponse.detail) &&
    ObjectUtils.equals(this.httpStatus, adminListUserAttributesResponse.httpStatus);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(data, detail, httpStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminListUserAttributesResponse {\n");
    
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
