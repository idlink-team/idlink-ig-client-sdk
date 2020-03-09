# AuthenticationApi

All URIs are relative to *https://authdemo.id.link:1443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deviceLogin**](AuthenticationApi.md#deviceLogin) | **POST** /oauth2/device/token | oauth2 device&#x27;s token
[**jwkList**](AuthenticationApi.md#jwkList) | **GET** /jwk | jwt list
[**oauth2UserInfo**](AuthenticationApi.md#oauth2UserInfo) | **GET** /oauth2/userInfo | oauth2 userInfo
[**openidConfiguration**](AuthenticationApi.md#openidConfiguration) | **GET** /.well-known/openid-configuration | openid configuration
[**personLogin**](AuthenticationApi.md#personLogin) | **POST** /oauth2/person/token | oauth2 user&#x27;s token
[**verifyAccessToken**](AuthenticationApi.md#verifyAccessToken) | **POST** /verify/access_token | verify access_token
[**verifyJWT**](AuthenticationApi.md#verifyJWT) | **POST** /verify/jwt | verify jwt token

<a name="deviceLogin"></a>
# **deviceLogin**
> String deviceLogin(authorization, grantType, password, refreshToken, scope, username)

oauth2 device&#x27;s token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
String authorization = "authorization_example"; // String | Authorization, Get form ID.LINK team.
String grantType = "grantType_example"; // String | Grant type
String password = "password_example"; // String | password
String refreshToken = "refreshToken_example"; // String | Refresh token
String scope = "scope_example"; // String | scope
String username = "username_example"; // String | username
try {
    String result = apiInstance.deviceLogin(authorization, grantType, password, refreshToken, scope, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#deviceLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization, Get form ID.LINK team. |
 **grantType** | **String**| Grant type |
 **password** | **String**| password | [optional]
 **refreshToken** | **String**| Refresh token | [optional]
 **scope** | **String**| scope | [optional]
 **username** | **String**| username | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="jwkList"></a>
# **jwkList**
> Map&lt;String, Object&gt; jwkList()

jwt list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
try {
    Map<String, Object> result = apiInstance.jwkList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#jwkList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="oauth2UserInfo"></a>
# **oauth2UserInfo**
> String oauth2UserInfo(authorization)

oauth2 userInfo

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
String authorization = "authorization_example"; // String | Authorization, Get form ID.LINK team.
try {
    String result = apiInstance.oauth2UserInfo(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#oauth2UserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization, Get form ID.LINK team. |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="openidConfiguration"></a>
# **openidConfiguration**
> Object openidConfiguration()

openid configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
try {
    Object result = apiInstance.openidConfiguration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#openidConfiguration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="personLogin"></a>
# **personLogin**
> String personLogin(authorization, grantType, password, refreshToken, scope, username)

oauth2 user&#x27;s token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
String authorization = "authorization_example"; // String | Authorization, Get form ID.LINK team.
String grantType = "grantType_example"; // String | Grant type
String password = "password_example"; // String | password
String refreshToken = "refreshToken_example"; // String | Refresh token
String scope = "scope_example"; // String | scope
String username = "username_example"; // String | username
try {
    String result = apiInstance.personLogin(authorization, grantType, password, refreshToken, scope, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#personLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization, Get form ID.LINK team. |
 **grantType** | **String**| Grant type |
 **password** | **String**| password | [optional]
 **refreshToken** | **String**| Refresh token | [optional]
 **scope** | **String**| scope | [optional]
 **username** | **String**| username | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="verifyAccessToken"></a>
# **verifyAccessToken**
> Boolean verifyAccessToken(authorization, token)

verify access_token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
String authorization = "authorization_example"; // String | Authorization, Get form ID.LINK team.
String token = "token_example"; // String | token
try {
    Boolean result = apiInstance.verifyAccessToken(authorization, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#verifyAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization, Get form ID.LINK team. |
 **token** | **String**| token |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="verifyJWT"></a>
# **verifyJWT**
> Boolean verifyJWT(authorization, token)

verify jwt token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
String authorization = "authorization_example"; // String | Authorization, Get form ID.LINK team.
String token = "token_example"; // String | token
try {
    Boolean result = apiInstance.verifyJWT(authorization, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#verifyJWT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization, Get form ID.LINK team. |
 **token** | **String**| token |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

