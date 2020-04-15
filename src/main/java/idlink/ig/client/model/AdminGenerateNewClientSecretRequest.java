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
 * AdminGenerateNewClientSecretRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-15T13:55:16.094+08:00[Asia/Shanghai]")
public class AdminGenerateNewClientSecretRequest {
  @SerializedName("identityId")
  private String identityId = null;

  public AdminGenerateNewClientSecretRequest identityId(String identityId) {
    this.identityId = identityId;
    return this;
  }

   /**
   * The id of identity
   * @return identityId
  **/
  @Schema(required = true, description = "The id of identity")
  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AdminGenerateNewClientSecretRequest adminGenerateNewClientSecretRequest = (AdminGenerateNewClientSecretRequest) o;
    return ObjectUtils.equals(this.identityId, adminGenerateNewClientSecretRequest.identityId);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(identityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminGenerateNewClientSecretRequest {\n");
    
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
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
