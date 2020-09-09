# idlink-ig-client

ID LINK
- API version: 1.0
  - Build date: 2020-09-09T12:01:47.809+08:00[Asia/Shanghai]

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>idlink</groupId>
  <artifactId>idlink-ig-client</artifactId>
  <version>1.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "idlink:idlink-ig-client:1.0.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/idlink-ig-client-1.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import idlink.ig.client.model.*;
import idlink.ig.client.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
        
        AdminApi apiInstance = new AdminApi();
        AdminChangePasswordRequest body = new AdminChangePasswordRequest(); // AdminChangePasswordRequest | User to change password
        String X_API_CLIENT_ID = "X_API_CLIENT_ID_example"; // String | X-API-CLIENT-ID, Get form ID.LINK team.
        Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
        String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
        try {
            AdminChangePasswordResponse result = apiInstance.adminChangePassword(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminChangePassword");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import idlink.ig.client.model.*;
import idlink.ig.client.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
        
        AdminApi apiInstance = new AdminApi();
        AdminCheckUserRequest body = new AdminCheckUserRequest(); // AdminCheckUserRequest | User to check exist
        String X_API_CLIENT_ID = "X_API_CLIENT_ID_example"; // String | X-API-CLIENT-ID, Get form ID.LINK team.
        Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
        String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
        try {
            AdminCheckUserResponse result = apiInstance.adminCheckUserExist(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminCheckUserExist");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import idlink.ig.client.model.*;
import idlink.ig.client.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
        
        AdminApi apiInstance = new AdminApi();
        AdminCreateUserRequest body = new AdminCreateUserRequest(); // AdminCreateUserRequest | User to create
        String X_API_CLIENT_ID = "X_API_CLIENT_ID_example"; // String | X-API-CLIENT-ID, Get form ID.LINK team.
        Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
        String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
        try {
            AdminCreateUserResponse result = apiInstance.adminCreateUser(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminCreateUser");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import idlink.ig.client.model.*;
import idlink.ig.client.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
        
        AdminApi apiInstance = new AdminApi();
        AdminDeleteUserRequest body = new AdminDeleteUserRequest(); // AdminDeleteUserRequest | User to delete
        String X_API_CLIENT_ID = "X_API_CLIENT_ID_example"; // String | X-API-CLIENT-ID, Get form ID.LINK team.
        Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
        String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
        try {
            AdminDeleteUserResponse result = apiInstance.adminDeleteUser(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminDeleteUser");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import idlink.ig.client.model.*;
import idlink.ig.client.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
        
        AdminApi apiInstance = new AdminApi();
        AdminDisableUserRequest body = new AdminDisableUserRequest(); // AdminDisableUserRequest | User to disable
        String X_API_CLIENT_ID = "X_API_CLIENT_ID_example"; // String | X-API-CLIENT-ID, Get form ID.LINK team.
        Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
        String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
        try {
            AdminDisableUserResponse result = apiInstance.adminDisableUser(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminDisableUser");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import idlink.ig.client.model.*;
import idlink.ig.client.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
        
        AdminApi apiInstance = new AdminApi();
        AdminEnableUserRequest body = new AdminEnableUserRequest(); // AdminEnableUserRequest | User to enable
        String X_API_CLIENT_ID = "X_API_CLIENT_ID_example"; // String | X-API-CLIENT-ID, Get form ID.LINK team.
        Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
        String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
        try {
            AdminEnableUserResponse result = apiInstance.adminEnableUser(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminEnableUser");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import idlink.ig.client.model.*;
import idlink.ig.client.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
        
        AdminApi apiInstance = new AdminApi();
        AdminExchangeAccessTokenRequest body = new AdminExchangeAccessTokenRequest(); // AdminExchangeAccessTokenRequest | User to login
        String X_API_CLIENT_ID = "X_API_CLIENT_ID_example"; // String | X-API-CLIENT-ID, Get form ID.LINK team.
        Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
        String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
        try {
            AdminExchangeAccessTokenResponse result = apiInstance.adminExchangeAccessToken(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminExchangeAccessToken");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import idlink.ig.client.model.*;
import idlink.ig.client.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
        
        AdminApi apiInstance = new AdminApi();
        AdminInitialLoginRequest body = new AdminInitialLoginRequest(); // AdminInitialLoginRequest | User to login
        String X_API_CLIENT_ID = "X_API_CLIENT_ID_example"; // String | X-API-CLIENT-ID, Get form ID.LINK team.
        Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
        String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
        try {
            AdminInitialLoginResponse result = apiInstance.adminInitialLogin(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminInitialLogin");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import idlink.ig.client.model.*;
import idlink.ig.client.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
        
        AdminApi apiInstance = new AdminApi();
        AdminUpdateUserRequest body = new AdminUpdateUserRequest(); // AdminUpdateUserRequest | User to update
        String X_API_CLIENT_ID = "X_API_CLIENT_ID_example"; // String | X-API-CLIENT-ID, Get form ID.LINK team.
        Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
        String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
        try {
            AdminUpdateUserResponse result = apiInstance.adminUpdateUser(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminUpdateUser");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.ig.id.link:1443*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**adminChangePassword**](docs/AdminApi.md#adminChangePassword) | **POST** /api/adminChangePassword | Changes a user&#x27;s password as an administrator
*AdminApi* | [**adminCheckUserExist**](docs/AdminApi.md#adminCheckUserExist) | **POST** /api/adminCheckUserExist | Check whether the user exists as an administrator
*AdminApi* | [**adminCreateUser**](docs/AdminApi.md#adminCreateUser) | **POST** /api/adminCreateUser | Creates a new User as an administrator
*AdminApi* | [**adminDeleteUser**](docs/AdminApi.md#adminDeleteUser) | **POST** /api/adminDeleteUser | Deletes a user as an administrator
*AdminApi* | [**adminDisableUser**](docs/AdminApi.md#adminDisableUser) | **POST** /api/adminDisableUser | Disables a user as an administrator
*AdminApi* | [**adminEnableUser**](docs/AdminApi.md#adminEnableUser) | **POST** /api/adminEnableUser | Enables a user as an administrator
*AdminApi* | [**adminExchangeAccessToken**](docs/AdminApi.md#adminExchangeAccessToken) | **POST** /api/adminExchangeAccessToken | admin Exchange AccessToken
*AdminApi* | [**adminInitialLogin**](docs/AdminApi.md#adminInitialLogin) | **POST** /api/adminInitialLogin | Log in and return the tokens as an administrator
*AdminApi* | [**adminUpdateUser**](docs/AdminApi.md#adminUpdateUser) | **POST** /api/adminUpdateUser | Updates the attribute of a User as an administrator
*LoginApi* | [**oAuth2Authorize**](docs/LoginApi.md#oAuth2Authorize) | **GET** /oauth2/authorize | oauth2 authorize
*LoginApi* | [**oAuth2Authorize1**](docs/LoginApi.md#oAuth2Authorize1) | **HEAD** /oauth2/authorize | oauth2 authorize
*LoginApi* | [**oAuth2Authorize2**](docs/LoginApi.md#oAuth2Authorize2) | **POST** /oauth2/authorize | oauth2 authorize
*LoginApi* | [**oAuth2Authorize3**](docs/LoginApi.md#oAuth2Authorize3) | **PUT** /oauth2/authorize | oauth2 authorize
*LoginApi* | [**oAuth2Authorize4**](docs/LoginApi.md#oAuth2Authorize4) | **PATCH** /oauth2/authorize | oauth2 authorize
*LoginApi* | [**oAuth2Authorize5**](docs/LoginApi.md#oAuth2Authorize5) | **DELETE** /oauth2/authorize | oauth2 authorize
*LoginApi* | [**oAuth2Authorize6**](docs/LoginApi.md#oAuth2Authorize6) | **OPTIONS** /oauth2/authorize | oauth2 authorize
*LoginApi* | [**oAuth2Login**](docs/LoginApi.md#oAuth2Login) | **POST** /oauth2/login | oauth2 login
*OAuth2Api* | [**jwkList**](docs/OAuth2Api.md#jwkList) | **GET** /jwk | jwt list
*OAuth2Api* | [**oAuth2AuthorizeGetCode**](docs/OAuth2Api.md#oAuth2AuthorizeGetCode) | **POST** /oauth2/authorize/codeOnly | oauth2 user&#x27;s getCode
*OAuth2Api* | [**oAuth2GetUserInfo**](docs/OAuth2Api.md#oAuth2GetUserInfo) | **POST** /oauth2/userInfo | OAuth2 get user info
*OAuth2Api* | [**oAuth2OAuth2LoginGetCode**](docs/OAuth2Api.md#oAuth2OAuth2LoginGetCode) | **POST** /oauth2/login/codeOnly | oauth2 user&#x27;s login getCode
*OAuth2Api* | [**oAuth2Token**](docs/OAuth2Api.md#oAuth2Token) | **POST** /oauth2/token | oauth2 user&#x27;s token
*OAuth2Api* | [**oAuth2VerifyAccessToken**](docs/OAuth2Api.md#oAuth2VerifyAccessToken) | **POST** /oauth2/verify/access_token | OAuth2 verify Access Token
*OAuth2Api* | [**openidConfiguration**](docs/OAuth2Api.md#openidConfiguration) | **GET** /.well-known/openid-configuration | openid configuration
*OAuth2Api* | [**verifyJWT**](docs/OAuth2Api.md#verifyJWT) | **POST** /verify/jwt | verify jwt token
*TenantApi* | [**adminAddIdentityPool**](docs/TenantApi.md#adminAddIdentityPool) | **POST** /api/adminAddIdentityPool | Add identity pool as an administrator
*TenantApi* | [**adminDeleteIdentityPool**](docs/TenantApi.md#adminDeleteIdentityPool) | **POST** /api/adminDeleteIdentityPool | Delete identity pool as an administrator
*TenantApi* | [**adminGenerateNewClientSecret**](docs/TenantApi.md#adminGenerateNewClientSecret) | **POST** /api/adminGenerateNewClientSecret | Generate new client secret as an administrator
*TenantApi* | [**adminGetClientByPoolId**](docs/TenantApi.md#adminGetClientByPoolId) | **POST** /api/adminGetClientByPoolId | Get pool secret as an administrator
*TenantApi* | [**adminListIdentityPools**](docs/TenantApi.md#adminListIdentityPools) | **POST** /api/adminListIdentityPools | List identity pools as an administrator
*TenantApi* | [**adminResetPoolManagerSecret**](docs/TenantApi.md#adminResetPoolManagerSecret) | **POST** /api/adminResetPoolManagerSecret | Reset pool manager secret as an administrator

## Documentation for Models

 - [AdminAddIdentityPoolRequest](docs/AdminAddIdentityPoolRequest.md)
 - [AdminAddIdentityPoolResponse](docs/AdminAddIdentityPoolResponse.md)
 - [AdminChangePasswordRequest](docs/AdminChangePasswordRequest.md)
 - [AdminChangePasswordResponse](docs/AdminChangePasswordResponse.md)
 - [AdminCheckUserRequest](docs/AdminCheckUserRequest.md)
 - [AdminCheckUserResponse](docs/AdminCheckUserResponse.md)
 - [AdminCreateUserRequest](docs/AdminCreateUserRequest.md)
 - [AdminCreateUserResponse](docs/AdminCreateUserResponse.md)
 - [AdminDeleteIdentityPoolRequest](docs/AdminDeleteIdentityPoolRequest.md)
 - [AdminDeleteIdentityPoolResponse](docs/AdminDeleteIdentityPoolResponse.md)
 - [AdminDeleteUserRequest](docs/AdminDeleteUserRequest.md)
 - [AdminDeleteUserResponse](docs/AdminDeleteUserResponse.md)
 - [AdminDisableUserRequest](docs/AdminDisableUserRequest.md)
 - [AdminDisableUserResponse](docs/AdminDisableUserResponse.md)
 - [AdminEnableUserRequest](docs/AdminEnableUserRequest.md)
 - [AdminEnableUserResponse](docs/AdminEnableUserResponse.md)
 - [AdminExchangeAccessTokenRequest](docs/AdminExchangeAccessTokenRequest.md)
 - [AdminExchangeAccessTokenResponse](docs/AdminExchangeAccessTokenResponse.md)
 - [AdminGenerateNewClientSecretRequest](docs/AdminGenerateNewClientSecretRequest.md)
 - [AdminGenerateNewClientSecretResponse](docs/AdminGenerateNewClientSecretResponse.md)
 - [AdminGetClientByPoolIdRequest](docs/AdminGetClientByPoolIdRequest.md)
 - [AdminGetClientByPoolIdResponse](docs/AdminGetClientByPoolIdResponse.md)
 - [AdminInitialLoginRequest](docs/AdminInitialLoginRequest.md)
 - [AdminInitialLoginResponse](docs/AdminInitialLoginResponse.md)
 - [AdminListIdentityPoolsResponse](docs/AdminListIdentityPoolsResponse.md)
 - [AdminResetPoolManagerSecretResponse](docs/AdminResetPoolManagerSecretResponse.md)
 - [AdminUpdateUserRequest](docs/AdminUpdateUserRequest.md)
 - [AdminUpdateUserResponse](docs/AdminUpdateUserResponse.md)
 - [Map](docs/Map.md)
 - [OAuth2GetAuthCodeResponse](docs/OAuth2GetAuthCodeResponse.md)
 - [OAuth2GetReqCodeResponse](docs/OAuth2GetReqCodeResponse.md)
 - [OAuth2GetUserInfoResponse](docs/OAuth2GetUserInfoResponse.md)
 - [OAuth2LoginResponse](docs/OAuth2LoginResponse.md)
 - [OAuth2VerifyAccessTokenResponse](docs/OAuth2VerifyAccessTokenResponse.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


