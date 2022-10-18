# TaxReturnsApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**destroyTaxReturn**](TaxReturnsApi.md#destroyTaxReturn) | **DELETE** /api/tax-returns/{id}/ | Delete a tax return |
| [**detailTaxReturn**](TaxReturnsApi.md#detailTaxReturn) | **GET** /api/tax-returns/{id}/ | Get a tax return&#39;s details |
| [**listTaxReturns**](TaxReturnsApi.md#listTaxReturns) | **GET** /api/tax-returns/ | List all tax returns |
| [**retrieveTaxReturns**](TaxReturnsApi.md#retrieveTaxReturns) | **POST** /api/tax-returns/ | Retrieve tax returns for a link |



## destroyTaxReturn

> destroyTaxReturn(id)

Delete a tax return

Delete a specific tax return from your Belvo account.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.TaxReturnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TaxReturnsApi apiInstance = new TaxReturnsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the tax return you want to delete.
        try {
            apiInstance.destroyTaxReturn(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxReturnsApi#destroyTaxReturn");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| The ID of the tax return you want to delete. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Authentication to Belvo API failed |  -  |
| **404** | Not Found |  -  |


## detailTaxReturn

> RetrieveTaxReturns200ResponseInner detailTaxReturn(id)

Get a tax return&#39;s details

Get the details of a specific tax return.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.TaxReturnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TaxReturnsApi apiInstance = new TaxReturnsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `tax-return.id` you want to get detailed information about.
        try {
            RetrieveTaxReturns200ResponseInner result = apiInstance.detailTaxReturn(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxReturnsApi#detailTaxReturn");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| The &#x60;tax-return.id&#x60; you want to get detailed information about. | |

### Return type

[**RetrieveTaxReturns200ResponseInner**](RetrieveTaxReturns200ResponseInner.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** | Authentication to Belvo API failed |  -  |
| **404** | Not Found |  -  |


## listTaxReturns

> ListTaxReturns200Response listTaxReturns(page, pageSize, link, filters)

List all tax returns

Get a paginated list of all existing tax returns in your Belvo account. By default, we return up to 100 results per page. The results will include a mix of both monthly and yearly tax returns.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.TaxReturnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TaxReturnsApi apiInstance = new TaxReturnsApi(defaultClient);
        Integer page = 1; // Integer | A page number within the paginated result set.
        Integer pageSize = 100; // Integer | Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
        UUID link = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // UUID | The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `link.id` filter in order to improve your performance. 
        TaxReturnFilters filters = new HashMap(); // TaxReturnFilters | List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although `filters` is an object, any filter you use is automatically serialized as a query string.
        try {
            ListTaxReturns200Response result = apiInstance.listTaxReturns(page, pageSize, link, filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxReturnsApi#listTaxReturns");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  | [optional] [default to 100] |
| **link** | **UUID**| The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;link.id&#x60; filter in order to improve your performance.  | [optional] |
| **filters** | [**TaxReturnFilters**](.md)| List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. | [optional] |

### Return type

[**ListTaxReturns200Response**](ListTaxReturns200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** | Authentication to Belvo API failed |  -  |


## retrieveTaxReturns

> List&lt;RetrieveTaxReturns200ResponseInner&gt; retrieveTaxReturns(retrieveTaxReturnsRequest)

Retrieve tax returns for a link

Retrieve tax return information for a specific fiscal link.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.TaxReturnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TaxReturnsApi apiInstance = new TaxReturnsApi(defaultClient);
        RetrieveTaxReturnsRequest retrieveTaxReturnsRequest = new RetrieveTaxReturnsRequest(); // RetrieveTaxReturnsRequest | 
        try {
            List<RetrieveTaxReturns200ResponseInner> result = apiInstance.retrieveTaxReturns(retrieveTaxReturnsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxReturnsApi#retrieveTaxReturns");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **retrieveTaxReturnsRequest** | [**RetrieveTaxReturnsRequest**](RetrieveTaxReturnsRequest.md)|  | |

### Return type

[**List&lt;RetrieveTaxReturns200ResponseInner&gt;**](RetrieveTaxReturns200ResponseInner.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok (when &#x60;save_data&#x3D;false&#x60;) |  -  |
| **201** | Created (when &#x60;save_data&#x3D;true&#x60;) |  -  |
| **400** | Bad request error |  -  |
| **401** | Authentication to Belvo API failed |  -  |
| **408** | Request Timeout |  -  |
| **500** | Unexpected Error |  -  |

