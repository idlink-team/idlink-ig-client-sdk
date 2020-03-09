# AdminAddUserAttributeRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The attribute&#x27;s code | 
**description** | **String** | The attribute description information |  [optional]
**displayName** | **String** | The attribute&#x27;s display name | 
**type** | [**TypeEnum**](#TypeEnum) | The attribute&#x27;s data type, the value is one of the sets:[String, Boolean, Date, Long, Double] | 
**userType** | [**UserTypeEnum**](#UserTypeEnum) | The type of user | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
STRING | &quot;String&quot;
BOOLEAN | &quot;Boolean&quot;
DATE | &quot;Date&quot;
LONG | &quot;Long&quot;
DOUBLE | &quot;Double&quot;

<a name="UserTypeEnum"></a>
## Enum: UserTypeEnum
Name | Value
---- | -----
DEVICE | &quot;DEVICE&quot;
PERSON | &quot;PERSON&quot;
