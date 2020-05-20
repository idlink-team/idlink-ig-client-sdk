# OAuth2Api

All URIs are relative to *https://authdemo.id.link:1443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jwkList**](OAuth2Api.md#jwkList) | **GET** /jwk | jwt list
[**oAuth2GetUserInfo**](OAuth2Api.md#oAuth2GetUserInfo) | **POST** /oauth2/userInfo | OAuth2 get user info
[**oAuth2Token**](OAuth2Api.md#oAuth2Token) | **POST** /oauth2/token | oauth2 user&#x27;s token
[**oAuth2VerifyAccessToken**](OAuth2Api.md#oAuth2VerifyAccessToken) | **POST** /oauth2/verify/access_token | OAuth2 verify Access Token
[**openidConfiguration**](OAuth2Api.md#openidConfiguration) | **GET** /.well-known/openid-configuration | openid configuration
[**verifyJWT**](OAuth2Api.md#verifyJWT) | **POST** /verify/jwt | verify jwt token

<a name="jwkList"></a>
# **jwkList**
> Map&lt;String, Object&gt; jwkList()

jwt list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.OAuth2Api;


OAuth2Api apiInstance = new OAuth2Api();
try {
    Map<String, Object> result = apiInstance.jwkList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuth2Api#jwkList");
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

<a name="oAuth2GetUserInfo"></a>
# **oAuth2GetUserInfo**
> OAuth2GetUserInfoResponse oAuth2GetUserInfo(token, authorization)

OAuth2 get user info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.OAuth2Api;


OAuth2Api apiInstance = new OAuth2Api();
String token = "token_example"; // String | 
String authorization = "authorization_example"; // String | Authorization, Get form ID.LINK team.
try {
    OAuth2GetUserInfoResponse result = apiInstance.oAuth2GetUserInfo(token, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuth2Api#oAuth2GetUserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |
 **authorization** | **String**| Authorization, Get form ID.LINK team. |

### Return type

[**OAuth2GetUserInfoResponse**](OAuth2GetUserInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: */*

<a name="oAuth2Token"></a>
# **oAuth2Token**
> OAuth2LoginResponse oAuth2Token(grantType, password, refreshToken, username, authorization)

oauth2 user&#x27;s token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.OAuth2Api;


OAuth2Api apiInstance = new OAuth2Api();
String grantType = "grantType_example"; // String | 
String password = "password_example"; // String | 
String refreshToken = "refreshToken_example"; // String | 
String username = "username_example"; // String | 
String authorization = "authorization_example"; // String | Authorization, Get form ID.LINK team.
try {
    OAuth2LoginResponse result = apiInstance.oAuth2Token(grantType, password, refreshToken, username, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuth2Api#oAuth2Token");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**|  |
 **password** | **String**|  |
 **refreshToken** | **String**|  |
 **username** | **String**|  |
 **authorization** | **String**| Authorization, Get form ID.LINK team. |

### Return type

[**OAuth2LoginResponse**](OAuth2LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: */*

<a name="oAuth2VerifyAccessToken"></a>
# **oAuth2VerifyAccessToken**
> OAuth2VerifyAccessTokenResponse oAuth2VerifyAccessToken(token, authorization)

OAuth2 verify Access Token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.OAuth2Api;


OAuth2Api apiInstance = new OAuth2Api();
String token = "token_example"; // String | 
String authorization = "authorization_example"; // String | Authorization, Get form ID.LINK team.
try {
    OAuth2VerifyAccessTokenResponse result = apiInstance.oAuth2VerifyAccessToken(token, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuth2Api#oAuth2VerifyAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |
 **authorization** | **String**| Authorization, Get form ID.LINK team. |

### Return type

[**OAuth2VerifyAccessTokenResponse**](OAuth2VerifyAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: */*

<a name="openidConfiguration"></a>
# **openidConfiguration**
> Object openidConfiguration()

openid configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.OAuth2Api;


OAuth2Api apiInstance = new OAuth2Api();
try {
    Object result = apiInstance.openidConfiguration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuth2Api#openidConfiguration");
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

<a name="verifyJWT"></a>
# **verifyJWT**
> Boolean verifyJWT(authorization, token)

verify jwt token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.OAuth2Api;


OAuth2Api apiInstance = new OAuth2Api();
String authorization = "authorization_example"; // String | Authorization, Get form ID.LINK team.
String token = "token_example"; // String | token
try {
    Boolean result = apiInstance.verifyJWT(authorization, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuth2Api#verifyJWT");
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
 - **Accept**: application/x-www-form-urlencoded

