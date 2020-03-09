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
 * AdminInitialLoginRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-09T19:51:54.787+08:00[Asia/Shanghai]")
public class AdminInitialLoginRequest {
  @SerializedName("clientMetadata")
  private Map<String, Object> clientMetadata = null;

  @SerializedName("password")
  private String password = null;

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

  @SerializedName("username")
  private String username = null;

  public AdminInitialLoginRequest clientMetadata(Map<String, Object> clientMetadata) {
    this.clientMetadata = clientMetadata;
    return this;
  }

  public AdminInitialLoginRequest putClientMetadataItem(String key, Object clientMetadataItem) {
    if (this.clientMetadata == null) {
      this.clientMetadata = new HashMap<String, Object>();
    }
    this.clientMetadata.put(key, clientMetadataItem);
    return this;
  }

   /**
   * Client meta data
   * @return clientMetadata
  **/
  @Schema(example = "{\"param1\":\"value1\",\"param2\":\"value2\"}", description = "Client meta data")
  public Map<String, Object> getClientMetadata() {
    return clientMetadata;
  }

  public void setClientMetadata(Map<String, Object> clientMetadata) {
    this.clientMetadata = clientMetadata;
  }

  public AdminInitialLoginRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * User&#x27; account password
   * @return password
  **/
  @Schema(example = "password", required = true, description = "User' account password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AdminInitialLoginRequest userType(UserTypeEnum userType) {
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

  public AdminInitialLoginRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * User&#x27; account name
   * @return username
  **/
  @Schema(example = "Jack", required = true, description = "User' account name")
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
    AdminInitialLoginRequest adminInitialLoginRequest = (AdminInitialLoginRequest) o;
    return ObjectUtils.equals(this.clientMetadata, adminInitialLoginRequest.clientMetadata) &&
    ObjectUtils.equals(this.password, adminInitialLoginRequest.password) &&
    ObjectUtils.equals(this.userType, adminInitialLoginRequest.userType) &&
    ObjectUtils.equals(this.username, adminInitialLoginRequest.username);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(clientMetadata, password, userType, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminInitialLoginRequest {\n");
    
    sb.append("    clientMetadata: ").append(toIndentedString(clientMetadata)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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
