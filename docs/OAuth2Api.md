# OAuth2Api

All URIs are relative to *https://api.ig.id.link:1443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jwkList**](OAuth2Api.md#jwkList) | **GET** /jwk | jwt list
[**oAuth2AuthorizeGetCode**](OAuth2Api.md#oAuth2AuthorizeGetCode) | **POST** /oauth2/authorize/codeOnly | oauth2 user&#x27;s getCode
[**oAuth2GetUserInfo**](OAuth2Api.md#oAuth2GetUserInfo) | **POST** /oauth2/userInfo | OAuth2 get user info
[**oAuth2OAuth2LoginGetCode**](OAuth2Api.md#oAuth2OAuth2LoginGetCode) | **POST** /oauth2/login/codeOnly | oauth2 user&#x27;s login getCode
[**oAuth2TmallToken**](OAuth2Api.md#oAuth2TmallToken) | **POST** /oauth2/tmall/token | oauth2 user&#x27;s token for tmall
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

<a name="oAuth2AuthorizeGetCode"></a>
# **oAuth2AuthorizeGetCode**
> OAuth2GetReqCodeResponse oAuth2AuthorizeGetCode(redirectUri, state, authorization)

oauth2 user&#x27;s getCode

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.OAuth2Api;


OAuth2Api apiInstance = new OAuth2Api();
String redirectUri = "redirectUri_example"; // String | 
String state = "state_example"; // String | 
String authorization = "authorization_example"; // String | Authorization, Get form ID.LINK team.
try {
    OAuth2GetReqCodeResponse result = apiInstance.oAuth2AuthorizeGetCode(redirectUri, state, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuth2Api#oAuth2AuthorizeGetCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **redirectUri** | **String**|  | [optional]
 **state** | **String**|  | [optional]
 **authorization** | **String**| Authorization, Get form ID.LINK team. | [optional]

### Return type

[**OAuth2GetReqCodeResponse**](OAuth2GetReqCodeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
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

<a name="oAuth2OAuth2LoginGetCode"></a>
# **oAuth2OAuth2LoginGetCode**
> OAuth2GetAuthCodeResponse oAuth2OAuth2LoginGetCode(password, reqcode, userName, authorization)

oauth2 user&#x27;s login getCode

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.OAuth2Api;


OAuth2Api apiInstance = new OAuth2Api();
String password = "password_example"; // String | 
String reqcode = "reqcode_example"; // String | 
String userName = "userName_example"; // String | 
String authorization = "authorization_example"; // String | Authorization, Get form ID.LINK team.
try {
    OAuth2GetAuthCodeResponse result = apiInstance.oAuth2OAuth2LoginGetCode(password, reqcode, userName, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuth2Api#oAuth2OAuth2LoginGetCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **password** | **String**|  |
 **reqcode** | **String**|  |
 **userName** | **String**|  |
 **authorization** | **String**| Authorization, Get form ID.LINK team. |

### Return type

[**OAuth2GetAuthCodeResponse**](OAuth2GetAuthCodeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: */*

<a name="oAuth2TmallToken"></a>
# **oAuth2TmallToken**
> OAuth2TmallResponse oAuth2TmallToken(code, grantType, refreshToken, authorization)

oauth2 user&#x27;s token for tmall

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.OAuth2Api;


OAuth2Api apiInstance = new OAuth2Api();
String code = "code_example"; // String | 
String grantType = "grantType_example"; // String | 
String refreshToken = "refreshToken_example"; // String | 
String authorization = "authorization_example"; // String | Authorization, Get form ID.LINK team.
try {
    OAuth2TmallResponse result = apiInstance.oAuth2TmallToken(code, grantType, refreshToken, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuth2Api#oAuth2TmallToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**|  |
 **grantType** | **String**|  |
 **refreshToken** | **String**|  |
 **authorization** | **String**| Authorization, Get form ID.LINK team. | [optional]

### Return type

[**OAuth2TmallResponse**](OAuth2TmallResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: */*

<a name="oAuth2Token"></a>
# **oAuth2Token**
> OAuth2LoginResponse oAuth2Token(clientId, clientSecret, code, grantType, password, redirectUri, refreshToken, username, authorization)

oauth2 user&#x27;s token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.OAuth2Api;


OAuth2Api apiInstance = new OAuth2Api();
String clientId = "clientId_example"; // String | 
String clientSecret = "clientSecret_example"; // String | 
String code = "code_example"; // String | 
String grantType = "grantType_example"; // String | 
String password = "password_example"; // String | 
String redirectUri = "redirectUri_example"; // String | 
String refreshToken = "refreshToken_example"; // String | 
String username = "username_example"; // String | 
String authorization = "authorization_example"; // String | Authorization, Get form ID.LINK team.
try {
    OAuth2LoginResponse result = apiInstance.oAuth2Token(clientId, clientSecret, code, grantType, password, redirectUri, refreshToken, username, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuth2Api#oAuth2Token");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**|  |
 **clientSecret** | **String**|  |
 **code** | **String**|  |
 **grantType** | **String**|  |
 **password** | **String**|  |
 **redirectUri** | **String**|  |
 **refreshToken** | **String**|  |
 **username** | **String**|  |
 **authorization** | **String**| Authorization, Get form ID.LINK team. | [optional]

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
> Map&lt;String, Object&gt; openidConfiguration()

openid configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.OAuth2Api;


OAuth2Api apiInstance = new OAuth2Api();
try {
    Map<String, Object> result = apiInstance.openidConfiguration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuth2Api#openidConfiguration");
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

