# CountriesApi

All URIs are relative to *http://api.debitoor.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCountriesTranslatedByLanguageCode**](CountriesApi.md#getCountriesTranslatedByLanguageCode) | **GET** /countries/{languagecode}/v1 | 


<a name="getCountriesTranslatedByLanguageCode"></a>
# **getCountriesTranslatedByLanguageCode**
> List&lt;CountryDto&gt; getCountriesTranslatedByLanguageCode(languagecode)



Get sorted list of countries translated to the specified language 

### Example
```java
// Import classes:
//import com.mallorcasoftware.debitoorapiclient.ApiException;
//import com.mallorcasoftware.debitoorapiclient.api.CountriesApi;


CountriesApi apiInstance = new CountriesApi();
String languagecode = "languagecode_example"; // String | Given language code
try {
    List<CountryDto> result = apiInstance.getCountriesTranslatedByLanguageCode(languagecode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountriesApi#getCountriesTranslatedByLanguageCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **languagecode** | **String**| Given language code |

### Return type

[**List&lt;CountryDto&gt;**](CountryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

