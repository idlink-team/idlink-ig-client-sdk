# TenantApi

All URIs are relative to *https://authdemo.id.link:1443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminAddIdentityPool**](TenantApi.md#adminAddIdentityPool) | **POST** /api/adminAddIdentityPool | Add identity pool as an administrator
[**adminDeleteIdentityPool**](TenantApi.md#adminDeleteIdentityPool) | **POST** /api/adminDeleteIdentityPool | Delete identity pool as an administrator
[**adminGenerateNewClientSecret**](TenantApi.md#adminGenerateNewClientSecret) | **POST** /api/adminGenerateNewClientSecret | Generate new client secret as an administrator
[**adminGetClientByPoolId**](TenantApi.md#adminGetClientByPoolId) | **POST** /api/adminGetClientByPoolId | Get pool secret as an administrator
[**adminListIdentityPools**](TenantApi.md#adminListIdentityPools) | **POST** /api/adminListIdentityPools | List identity pools as an administrator
[**adminResetPoolManagerSecret**](TenantApi.md#adminResetPoolManagerSecret) | **POST** /api/adminResetPoolManagerSecret | Reset pool manager secret as an administrator

<a name="adminAddIdentityPool"></a>
# **adminAddIdentityPool**
> AdminAddIdentityPoolResponse adminAddIdentityPool(body, X_API_TENANT_ID, X_API_TIMESTAMP, X_API_TOKEN)

Add identity pool as an administrator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.TenantApi;


TenantApi apiInstance = new TenantApi();
AdminAddIdentityPoolRequest body = new AdminAddIdentityPoolRequest(); // AdminAddIdentityPoolRequest | Add identity pool request
String X_API_TENANT_ID = "X_API_TENANT_ID_example"; // String | X-API-TENANT-ID, Get form ID.LINK team.
Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
try {
    AdminAddIdentityPoolResponse result = apiInstance.adminAddIdentityPool(body, X_API_TENANT_ID, X_API_TIMESTAMP, X_API_TOKEN);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantApi#adminAddIdentityPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminAddIdentityPoolRequest**](AdminAddIdentityPoolRequest.md)| Add identity pool request |
 **X_API_TENANT_ID** | **String**| X-API-TENANT-ID, Get form ID.LINK team. |
 **X_API_TIMESTAMP** | **Long**| X-API-TIMESTAMP, The timestamp of calling this api |
 **X_API_TOKEN** | **String**| X-API-TOKEN, Generate it by AdminClientTool |

### Return type

[**AdminAddIdentityPoolResponse**](AdminAddIdentityPoolResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="adminDeleteIdentityPool"></a>
# **adminDeleteIdentityPool**
> AdminDeleteIdentityPoolResponse adminDeleteIdentityPool(body, X_API_TENANT_ID, X_API_TIMESTAMP, X_API_TOKEN)

Delete identity pool as an administrator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.TenantApi;


TenantApi apiInstance = new TenantApi();
AdminDeleteIdentityPoolRequest body = new AdminDeleteIdentityPoolRequest(); // AdminDeleteIdentityPoolRequest | Delete identity pool request
String X_API_TENANT_ID = "X_API_TENANT_ID_example"; // String | X-API-TENANT-ID, Get form ID.LINK team.
Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
try {
    AdminDeleteIdentityPoolResponse result = apiInstance.adminDeleteIdentityPool(body, X_API_TENANT_ID, X_API_TIMESTAMP, X_API_TOKEN);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantApi#adminDeleteIdentityPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminDeleteIdentityPoolRequest**](AdminDeleteIdentityPoolRequest.md)| Delete identity pool request |
 **X_API_TENANT_ID** | **String**| X-API-TENANT-ID, Get form ID.LINK team. |
 **X_API_TIMESTAMP** | **Long**| X-API-TIMESTAMP, The timestamp of calling this api |
 **X_API_TOKEN** | **String**| X-API-TOKEN, Generate it by AdminClientTool |

### Return type

[**AdminDeleteIdentityPoolResponse**](AdminDeleteIdentityPoolResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="adminGenerateNewClientSecret"></a>
# **adminGenerateNewClientSecret**
> AdminGenerateNewClientSecretResponse adminGenerateNewClientSecret(body, X_API_TENANT_ID, X_API_TIMESTAMP, X_API_TOKEN)

Generate new client secret as an administrator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.TenantApi;


TenantApi apiInstance = new TenantApi();
AdminGenerateNewClientSecretRequest body = new AdminGenerateNewClientSecretRequest(); // AdminGenerateNewClientSecretRequest | Generate new client secret request
String X_API_TENANT_ID = "X_API_TENANT_ID_example"; // String | X-API-TENANT-ID, Get form ID.LINK team.
Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
try {
    AdminGenerateNewClientSecretResponse result = apiInstance.adminGenerateNewClientSecret(body, X_API_TENANT_ID, X_API_TIMESTAMP, X_API_TOKEN);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantApi#adminGenerateNewClientSecret");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminGenerateNewClientSecretRequest**](AdminGenerateNewClientSecretRequest.md)| Generate new client secret request |
 **X_API_TENANT_ID** | **String**| X-API-TENANT-ID, Get form ID.LINK team. |
 **X_API_TIMESTAMP** | **Long**| X-API-TIMESTAMP, The timestamp of calling this api |
 **X_API_TOKEN** | **String**| X-API-TOKEN, Generate it by AdminClientTool |

### Return type

[**AdminGenerateNewClientSecretResponse**](AdminGenerateNewClientSecretResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="adminGetClientByPoolId"></a>
# **adminGetClientByPoolId**
> AdminGetClientByPoolIdResponse adminGetClientByPoolId(body, X_API_TENANT_ID, X_API_TIMESTAMP, X_API_TOKEN)

Get pool secret as an administrator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.TenantApi;


TenantApi apiInstance = new TenantApi();
AdminGetClientByPoolIdRequest body = new AdminGetClientByPoolIdRequest(); // AdminGetClientByPoolIdRequest | Get pool secret request
String X_API_TENANT_ID = "X_API_TENANT_ID_example"; // String | X-API-TENANT-ID, Get form ID.LINK team.
Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
try {
    AdminGetClientByPoolIdResponse result = apiInstance.adminGetClientByPoolId(body, X_API_TENANT_ID, X_API_TIMESTAMP, X_API_TOKEN);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantApi#adminGetClientByPoolId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminGetClientByPoolIdRequest**](AdminGetClientByPoolIdRequest.md)| Get pool secret request |
 **X_API_TENANT_ID** | **String**| X-API-TENANT-ID, Get form ID.LINK team. |
 **X_API_TIMESTAMP** | **Long**| X-API-TIMESTAMP, The timestamp of calling this api |
 **X_API_TOKEN** | **String**| X-API-TOKEN, Generate it by AdminClientTool |

### Return type

[**AdminGetClientByPoolIdResponse**](AdminGetClientByPoolIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="adminListIdentityPools"></a>
# **adminListIdentityPools**
> AdminListIdentityPoolsResponse adminListIdentityPools(X_API_TENANT_ID, X_API_TIMESTAMP, X_API_TOKEN)

List identity pools as an administrator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.TenantApi;


TenantApi apiInstance = new TenantApi();
String X_API_TENANT_ID = "X_API_TENANT_ID_example"; // String | X-API-TENANT-ID, Get form ID.LINK team.
Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
try {
    AdminListIdentityPoolsResponse result = apiInstance.adminListIdentityPools(X_API_TENANT_ID, X_API_TIMESTAMP, X_API_TOKEN);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantApi#adminListIdentityPools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TENANT_ID** | **String**| X-API-TENANT-ID, Get form ID.LINK team. |
 **X_API_TIMESTAMP** | **Long**| X-API-TIMESTAMP, The timestamp of calling this api |
 **X_API_TOKEN** | **String**| X-API-TOKEN, Generate it by AdminClientTool |

### Return type

[**AdminListIdentityPoolsResponse**](AdminListIdentityPoolsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="adminResetPoolManagerSecret"></a>
# **adminResetPoolManagerSecret**
> AdminResetPoolManagerSecretResponse adminResetPoolManagerSecret(X_API_TENANT_ID, X_API_TIMESTAMP, X_API_TOKEN)

Reset pool manager secret as an administrator

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import idlink.ig.client.api.TenantApi;


TenantApi apiInstance = new TenantApi();
String X_API_TENANT_ID = "X_API_TENANT_ID_example"; // String | X-API-TENANT-ID, Get form ID.LINK team.
Long X_API_TIMESTAMP = 789L; // Long | X-API-TIMESTAMP, The timestamp of calling this api
String X_API_TOKEN = "X_API_TOKEN_example"; // String | X-API-TOKEN, Generate it by AdminClientTool
try {
    AdminResetPoolManagerSecretResponse result = apiInstance.adminResetPoolManagerSecret(X_API_TENANT_ID, X_API_TIMESTAMP, X_API_TOKEN);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantApi#adminResetPoolManagerSecret");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TENANT_ID** | **String**| X-API-TENANT-ID, Get form ID.LINK team. |
 **X_API_TIMESTAMP** | **Long**| X-API-TIMESTAMP, The timestamp of calling this api |
 **X_API_TOKEN** | **String**| X-API-TOKEN, Generate it by AdminClientTool |

### Return type

[**AdminResetPoolManagerSecretResponse**](AdminResetPoolManagerSecretResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

