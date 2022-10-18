# TaxComplianceStatusApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**destroyTaxComplianceStatus**](TaxComplianceStatusApi.md#destroyTaxComplianceStatus) | **DELETE** /api/tax-compliance-status/{id}/ | Delete a tax compliance status |
| [**detailTaxComplianceStatus**](TaxComplianceStatusApi.md#detailTaxComplianceStatus) | **GET** /api/tax-compliance-status/{id}/ | Get a tax compliance status&#39;s details |
| [**listTaxComplianceStatus**](TaxComplianceStatusApi.md#listTaxComplianceStatus) | **GET** /api/tax-compliance-status/ | List all tax compliance statuses |
| [**retrieveTaxComplianceStatus**](TaxComplianceStatusApi.md#retrieveTaxComplianceStatus) | **POST** /api/tax-compliance-status/ | Retrieve tax compliance statuses for a link |



## destroyTaxComplianceStatus

> destroyTaxComplianceStatus(id)

Delete a tax compliance status

Delete a specific Tax compliance status from your Belvo account.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.TaxComplianceStatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TaxComplianceStatusApi apiInstance = new TaxComplianceStatusApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `tax-compliance-status.id` that you want to delete.
        try {
            apiInstance.destroyTaxComplianceStatus(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxComplianceStatusApi#destroyTaxComplianceStatus");
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
| **id** | **UUID**| The &#x60;tax-compliance-status.id&#x60; that you want to delete. | |

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


## detailTaxComplianceStatus

> TaxComplianceStatus detailTaxComplianceStatus(id)

Get a tax compliance status&#39;s details

Get the details of a specific Tax compliance status.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.TaxComplianceStatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TaxComplianceStatusApi apiInstance = new TaxComplianceStatusApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `tax-compliance-status.id` you want to get detailed information about.
        try {
            TaxComplianceStatus result = apiInstance.detailTaxComplianceStatus(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxComplianceStatusApi#detailTaxComplianceStatus");
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
| **id** | **UUID**| The &#x60;tax-compliance-status.id&#x60; you want to get detailed information about. | |

### Return type

[**TaxComplianceStatus**](TaxComplianceStatus.md)

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


## listTaxComplianceStatus

> TaxComplianceStatusPaginatedResponse listTaxComplianceStatus(page, pageSize, link, filters)

List all tax compliance statuses

Get a paginated list of all existing Tax compliance statuses in your Belvo account. By default, we return up to 100 results per page.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.TaxComplianceStatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TaxComplianceStatusApi apiInstance = new TaxComplianceStatusApi(defaultClient);
        Integer page = 1; // Integer | A page number within the paginated result set.
        Integer pageSize = 100; // Integer | Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
        UUID link = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // UUID | The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `link.id` filter in order to improve your performance. 
        TaxComplianceStatusFilters filters = new HashMap(); // TaxComplianceStatusFilters | List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although `filters` is an object, any filter you use is automatically serialized as a query string.
        try {
            TaxComplianceStatusPaginatedResponse result = apiInstance.listTaxComplianceStatus(page, pageSize, link, filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxComplianceStatusApi#listTaxComplianceStatus");
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
| **filters** | [**TaxComplianceStatusFilters**](.md)| List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. | [optional] |

### Return type

[**TaxComplianceStatusPaginatedResponse**](TaxComplianceStatusPaginatedResponse.md)

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


## retrieveTaxComplianceStatus

> TaxComplianceStatus retrieveTaxComplianceStatus(taxComplianceStatusRequest)

Retrieve tax compliance statuses for a link

Retrieve the Tax compliance status information for a specific fiscal link.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.TaxComplianceStatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TaxComplianceStatusApi apiInstance = new TaxComplianceStatusApi(defaultClient);
        TaxComplianceStatusRequest taxComplianceStatusRequest = new TaxComplianceStatusRequest(); // TaxComplianceStatusRequest | 
        try {
            TaxComplianceStatus result = apiInstance.retrieveTaxComplianceStatus(taxComplianceStatusRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxComplianceStatusApi#retrieveTaxComplianceStatus");
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
| **taxComplianceStatusRequest** | [**TaxComplianceStatusRequest**](TaxComplianceStatusRequest.md)|  | |

### Return type

[**TaxComplianceStatus**](TaxComplianceStatus.md)

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

