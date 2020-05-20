# AdminApi

All URIs are relative to *https://api.ig.id.link:1443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminChangePassword**](AdminApi.md#adminChangePassword) | **POST** /api/adminChangePassword | Changes a user&#x27;s password as an administrator
[**adminCheckUserExist**](AdminApi.md#adminCheckUserExist) | **POST** /api/adminCheckUserExist | Check whether the user exists as an administrator
[**adminCreateUser**](AdminApi.md#adminCreateUser) | **POST** /api/adminCreateUser | Creates a new User as an administrator
[**adminDeleteUser**](AdminApi.md#adminDeleteUser) | **POST** /api/adminDeleteUser | Deletes a user as an administrator
[**adminDisableUser**](AdminApi.md#adminDisableUser) | **POST** /api/adminDisableUser | Disables a user as an administrator
[**adminEnableUser**](AdminApi.md#adminEnableUser) | **POST** /api/adminEnableUser | Enables a user as an administrator
[**adminExchangeAccessToken**](AdminApi.md#adminExchangeAccessToken) | **POST** /api/adminExchangeAccessToken | admin Exchange AccessToken
[**adminInitialLogin**](AdminApi.md#adminInitialLogin) | **POST** /api/adminInitialLogin | Log in and return the tokens as an administrator
[**adminUpdateUser**](AdminApi.md#adminUpdateUser) | **POST** /api/adminUpdateUser | Updates the attribute of a User as an administrator

<a name="adminChangePassword"></a>
# **adminChangePassword**
> AdminChangePasswordResponse adminChangePassword(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN)

Changes a user&#x27;s password as an administrator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AdminApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminChangePasswordRequest**](AdminChangePasswordRequest.md)| User to change password |
 **X_API_CLIENT_ID** | **String**| X-API-CLIENT-ID, Get form ID.LINK team. |
 **X_API_TIMESTAMP** | **Long**| X-API-TIMESTAMP, The timestamp of calling this api |
 **X_API_TOKEN** | **String**| X-API-TOKEN, Generate it by AdminClientTool |

### Return type

[**AdminChangePasswordResponse**](AdminChangePasswordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="adminCheckUserExist"></a>
# **adminCheckUserExist**
> AdminCheckUserResponse adminCheckUserExist(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN)

Check whether the user exists as an administrator

When the user can be confirmed according to the condition map, return true, else return false

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AdminApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminCheckUserRequest**](AdminCheckUserRequest.md)| User to check exist |
 **X_API_CLIENT_ID** | **String**| X-API-CLIENT-ID, Get form ID.LINK team. |
 **X_API_TIMESTAMP** | **Long**| X-API-TIMESTAMP, The timestamp of calling this api |
 **X_API_TOKEN** | **String**| X-API-TOKEN, Generate it by AdminClientTool |

### Return type

[**AdminCheckUserResponse**](AdminCheckUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="adminCreateUser"></a>
# **adminCreateUser**
> AdminCreateUserResponse adminCreateUser(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN)

Creates a new User as an administrator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AdminApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminCreateUserRequest**](AdminCreateUserRequest.md)| User to create |
 **X_API_CLIENT_ID** | **String**| X-API-CLIENT-ID, Get form ID.LINK team. |
 **X_API_TIMESTAMP** | **Long**| X-API-TIMESTAMP, The timestamp of calling this api |
 **X_API_TOKEN** | **String**| X-API-TOKEN, Generate it by AdminClientTool |

### Return type

[**AdminCreateUserResponse**](AdminCreateUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="adminDeleteUser"></a>
# **adminDeleteUser**
> AdminDeleteUserResponse adminDeleteUser(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN)

Deletes a user as an administrator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AdminApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminDeleteUserRequest**](AdminDeleteUserRequest.md)| User to delete |
 **X_API_CLIENT_ID** | **String**| X-API-CLIENT-ID, Get form ID.LINK team. |
 **X_API_TIMESTAMP** | **Long**| X-API-TIMESTAMP, The timestamp of calling this api |
 **X_API_TOKEN** | **String**| X-API-TOKEN, Generate it by AdminClientTool |

### Return type

[**AdminDeleteUserResponse**](AdminDeleteUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="adminDisableUser"></a>
# **adminDisableUser**
> AdminDisableUserResponse adminDisableUser(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN)

Disables a user as an administrator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AdminApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminDisableUserRequest**](AdminDisableUserRequest.md)| User to disable |
 **X_API_CLIENT_ID** | **String**| X-API-CLIENT-ID, Get form ID.LINK team. |
 **X_API_TIMESTAMP** | **Long**| X-API-TIMESTAMP, The timestamp of calling this api |
 **X_API_TOKEN** | **String**| X-API-TOKEN, Generate it by AdminClientTool |

### Return type

[**AdminDisableUserResponse**](AdminDisableUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="adminEnableUser"></a>
# **adminEnableUser**
> AdminEnableUserResponse adminEnableUser(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN)

Enables a user as an administrator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AdminApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminEnableUserRequest**](AdminEnableUserRequest.md)| User to enable |
 **X_API_CLIENT_ID** | **String**| X-API-CLIENT-ID, Get form ID.LINK team. |
 **X_API_TIMESTAMP** | **Long**| X-API-TIMESTAMP, The timestamp of calling this api |
 **X_API_TOKEN** | **String**| X-API-TOKEN, Generate it by AdminClientTool |

### Return type

[**AdminEnableUserResponse**](AdminEnableUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="adminExchangeAccessToken"></a>
# **adminExchangeAccessToken**
> AdminExchangeAccessTokenResponse adminExchangeAccessToken(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN)

admin Exchange AccessToken

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AdminApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminExchangeAccessTokenRequest**](AdminExchangeAccessTokenRequest.md)| User to login |
 **X_API_CLIENT_ID** | **String**| X-API-CLIENT-ID, Get form ID.LINK team. |
 **X_API_TIMESTAMP** | **Long**| X-API-TIMESTAMP, The timestamp of calling this api |
 **X_API_TOKEN** | **String**| X-API-TOKEN, Generate it by AdminClientTool |

### Return type

[**AdminExchangeAccessTokenResponse**](AdminExchangeAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="adminInitialLogin"></a>
# **adminInitialLogin**
> AdminInitialLoginResponse adminInitialLogin(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN)

Log in and return the tokens as an administrator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AdminApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminInitialLoginRequest**](AdminInitialLoginRequest.md)| User to login |
 **X_API_CLIENT_ID** | **String**| X-API-CLIENT-ID, Get form ID.LINK team. |
 **X_API_TIMESTAMP** | **Long**| X-API-TIMESTAMP, The timestamp of calling this api |
 **X_API_TOKEN** | **String**| X-API-TOKEN, Generate it by AdminClientTool |

### Return type

[**AdminInitialLoginResponse**](AdminInitialLoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="adminUpdateUser"></a>
# **adminUpdateUser**
> AdminUpdateUserResponse adminUpdateUser(body, X_API_CLIENT_ID, X_API_TIMESTAMP, X_API_TOKEN)

Updates the attribute of a User as an administrator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AdminApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminUpdateUserRequest**](AdminUpdateUserRequest.md)| User to update |
 **X_API_CLIENT_ID** | **String**| X-API-CLIENT-ID, Get form ID.LINK team. |
 **X_API_TIMESTAMP** | **Long**| X-API-TIMESTAMP, The timestamp of calling this api |
 **X_API_TOKEN** | **String**| X-API-TOKEN, Generate it by AdminClientTool |

### Return type

[**AdminUpdateUserResponse**](AdminUpdateUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

