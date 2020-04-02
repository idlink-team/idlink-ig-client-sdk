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
 * AdminDeleteUserAttributeRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-02T17:08:53.355+08:00[Asia/Shanghai]")
public class AdminDeleteUserAttributeRequest {
  @SerializedName("code")
  private String code = null;

  /**
   * The type of user
   */
  @JsonAdapter(UserTypeEnum.Adapter.class)
  public enum UserTypeEnum {
    DEVICE("DEVICE"),
    PERSON("PERSON");

    private String value;

    UserTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static UserTypeEnum fromValue(String text) {
      for (UserTypeEnum b : UserTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<UserTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UserTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UserTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UserTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("userType")
  private UserTypeEnum userType = null;

  public AdminDeleteUserAttributeRequest code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The attribute&#x27;s code which you are going to delete
   * @return code
  **/
  @Schema(example = "username", required = true, description = "The attribute's code which you are going to delete")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AdminDeleteUserAttributeRequest userType(UserTypeEnum userType) {
    this.userType = userType;
    return this;
  }

   /**
   * The type of user
   * @return userType
  **/
  @Schema(example = "PERSON", required = true, description = "The type of user")
  public UserTypeEnum getUserType() {
    return userType;
  }

  public void setUserType(UserTypeEnum userType) {
    this.userType = userType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AdminDeleteUserAttributeRequest adminDeleteUserAttributeRequest = (AdminDeleteUserAttributeRequest) o;
    return ObjectUtils.equals(this.code, adminDeleteUserAttributeRequest.code) &&
    ObjectUtils.equals(this.userType, adminDeleteUserAttributeRequest.userType);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(code, userType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminDeleteUserAttributeRequest {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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
