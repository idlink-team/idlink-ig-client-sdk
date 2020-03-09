# AdminCreateUserRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Map&lt;String, Object&gt;** |      The attributes of user. Key is the attribute name and value is the attribute value.     Person default attributes: username, password, enable, mobile.     Device default attributes: username, password.     Calling adminAddUserAttribute API to add more attributes.      | 
**userType** | [**UserTypeEnum**](#UserTypeEnum) | The type of user | 

<a name="UserTypeEnum"></a>
## Enum: UserTypeEnum
Name | Value
---- | -----
DEVICE | &quot;DEVICE&quot;
PERSON | &quot;PERSON&quot;
