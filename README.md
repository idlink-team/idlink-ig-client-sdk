# idlink-ig-client

ID LINK
- API version: 1.0
  - Build date: 2020-04-02T17:00:14.341+08:00[Asia/Shanghai]

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
        AdminAddUserAttributeRequest body = new AdminAddUserAttributeRequest(); // AdminAddUserAttributeRequest | User to add attribute
        String X_API_CLIENT_ID = "X_API_CLIENT_ID_example"; // String | X-API-CLIENT-ID, Get form ID.LINK team.
        Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
        String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
        try {
            AdminAddUserAttributeResponse result = apiInstance.adminAddUserAttribute(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminAddUserAttribute");
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
        AdminDeleteUserAttributeRequest body = new AdminDeleteUserAttributeRequest(); // AdminDeleteUserAttributeRequest | User to delete attribute
        String X_API_CLIENT_ID = "X_API_CLIENT_ID_example"; // String | X-API-CLIENT-ID, Get form ID.LINK team.
        Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
        String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
        try {
            AdminDeleteUserAttributeResponse result = apiInstance.adminDeleteUserAttribute(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminDeleteUserAttribute");
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
            String result = apiInstance.adminExchangeAccessToken(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN);
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
            String result = apiInstance.adminInitialLogin(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN);
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
        AdminListUserAttributesRequest body = new AdminListUserAttributesRequest(); // AdminListUserAttributesRequest | User to list attributes
        String X_API_CLIENT_ID = "X_API_CLIENT_ID_example"; // String | X-API-CLIENT-ID, Get form ID.LINK team.
        Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
        String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
        try {
            AdminListUserAttributesResponse result = apiInstance.adminListUserAttributes(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminListUserAttributes");
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

All URIs are relative to *https://authdemo.id.link:1443*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**adminAddUserAttribute**](docs/AdminApi.md#adminAddUserAttribute) | **POST** /api/adminAddUserAttribute | Add the attribute for a user type as an administrator
*AdminApi* | [**adminChangePassword**](docs/AdminApi.md#adminChangePassword) | **POST** /api/adminChangePassword | Changes a user&#x27;s password as an administrator
*AdminApi* | [**adminCheckUserExist**](docs/AdminApi.md#adminCheckUserExist) | **POST** /api/adminCheckUserExist | Check whether the user exists as an administrator
*AdminApi* | [**adminCreateUser**](docs/AdminApi.md#adminCreateUser) | **POST** /api/adminCreateUser | Creates a new User as an administrator
*AdminApi* | [**adminDeleteUser**](docs/AdminApi.md#adminDeleteUser) | **POST** /api/adminDeleteUser | Deletes a user as an administrator
*AdminApi* | [**adminDeleteUserAttribute**](docs/AdminApi.md#adminDeleteUserAttribute) | **POST** /api/adminDeleteUserAttribute | Deletes the attribute from a user type as an administrator
*AdminApi* | [**adminDisableUser**](docs/AdminApi.md#adminDisableUser) | **POST** /api/adminDisableUser | Disables a user as an administrator
*AdminApi* | [**adminEnableUser**](docs/AdminApi.md#adminEnableUser) | **POST** /api/adminEnableUser | Enables a user as an administrator
*AdminApi* | [**adminExchangeAccessToken**](docs/AdminApi.md#adminExchangeAccessToken) | **POST** /api/adminExchangeAccessToken | admin Exchange AccessToken
*AdminApi* | [**adminInitialLogin**](docs/AdminApi.md#adminInitialLogin) | **POST** /api/adminInitialLogin | Log in and return the tokens as an administrator
*AdminApi* | [**adminListUserAttributes**](docs/AdminApi.md#adminListUserAttributes) | **POST** /api/adminListUserAttributes | List the attribute from a user type as an administrator
*AdminApi* | [**adminUpdateUser**](docs/AdminApi.md#adminUpdateUser) | **POST** /api/adminUpdateUser | Updates the attribute of a User as an administrator
*AuthenticationApi* | [**deviceLogin**](docs/AuthenticationApi.md#deviceLogin) | **POST** /oauth2/device/token | oauth2 device&#x27;s token
*AuthenticationApi* | [**jwkList**](docs/AuthenticationApi.md#jwkList) | **GET** /jwk | jwt list
*AuthenticationApi* | [**oauth2UserInfo**](docs/AuthenticationApi.md#oauth2UserInfo) | **GET** /oauth2/userInfo | oauth2 userInfo
*AuthenticationApi* | [**openidConfiguration**](docs/AuthenticationApi.md#openidConfiguration) | **GET** /.well-known/openid-configuration | openid configuration
*AuthenticationApi* | [**personLogin**](docs/AuthenticationApi.md#personLogin) | **POST** /oauth2/person/token | oauth2 user&#x27;s token
*AuthenticationApi* | [**verifyAccessToken**](docs/AuthenticationApi.md#verifyAccessToken) | **POST** /verify/access_token | verify access_token
*AuthenticationApi* | [**verifyJWT**](docs/AuthenticationApi.md#verifyJWT) | **POST** /verify/jwt | verify jwt token

## Documentation for Models

 - [AdminAddUserAttributeRequest](docs/AdminAddUserAttributeRequest.md)
 - [AdminAddUserAttributeResponse](docs/AdminAddUserAttributeResponse.md)
 - [AdminChangePasswordRequest](docs/AdminChangePasswordRequest.md)
 - [AdminChangePasswordResponse](docs/AdminChangePasswordResponse.md)
 - [AdminCheckUserRequest](docs/AdminCheckUserRequest.md)
 - [AdminCheckUserResponse](docs/AdminCheckUserResponse.md)
 - [AdminCreateUserRequest](docs/AdminCreateUserRequest.md)
 - [AdminCreateUserResponse](docs/AdminCreateUserResponse.md)
 - [AdminDeleteUserAttributeRequest](docs/AdminDeleteUserAttributeRequest.md)
 - [AdminDeleteUserAttributeResponse](docs/AdminDeleteUserAttributeResponse.md)
 - [AdminDeleteUserRequest](docs/AdminDeleteUserRequest.md)
 - [AdminDeleteUserResponse](docs/AdminDeleteUserResponse.md)
 - [AdminDisableUserRequest](docs/AdminDisableUserRequest.md)
 - [AdminDisableUserResponse](docs/AdminDisableUserResponse.md)
 - [AdminEnableUserRequest](docs/AdminEnableUserRequest.md)
 - [AdminEnableUserResponse](docs/AdminEnableUserResponse.md)
 - [AdminExchangeAccessTokenRequest](docs/AdminExchangeAccessTokenRequest.md)
 - [AdminInitialLoginRequest](docs/AdminInitialLoginRequest.md)
 - [AdminListUserAttributesRequest](docs/AdminListUserAttributesRequest.md)
 - [AdminListUserAttributesResponse](docs/AdminListUserAttributesResponse.md)
 - [AdminUpdateUserRequest](docs/AdminUpdateUserRequest.md)
 - [AdminUpdateUserResponse](docs/AdminUpdateUserResponse.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


