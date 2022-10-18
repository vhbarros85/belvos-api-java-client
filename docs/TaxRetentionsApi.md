# TaxRetentionsApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**destroyTaxRetention**](TaxRetentionsApi.md#destroyTaxRetention) | **DELETE** /api/tax-retentions/{id}/ | Delete a tax retention |
| [**detailTaxRetentions**](TaxRetentionsApi.md#detailTaxRetentions) | **GET** /api/tax-retentions/{id}/ | Get a tax retention&#39;s details |
| [**listTaxRetentions**](TaxRetentionsApi.md#listTaxRetentions) | **GET** /api/tax-retentions/ | List all tax retentions |
| [**retrieveTaxRetentions**](TaxRetentionsApi.md#retrieveTaxRetentions) | **POST** /api/tax-retentions/ | Retrieve tax retentions for a link |



## destroyTaxRetention

> destroyTaxRetention(id)

Delete a tax retention

Delete a specific tax retention from your Belvo account.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.TaxRetentionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TaxRetentionsApi apiInstance = new TaxRetentionsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `tax-retention.id` that you want to delete.
        try {
            apiInstance.destroyTaxRetention(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxRetentionsApi#destroyTaxRetention");
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
| **id** | **UUID**| The &#x60;tax-retention.id&#x60; that you want to delete. | |

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


## detailTaxRetentions

> TaxRetentions detailTaxRetentions(id)

Get a tax retention&#39;s details

Get the details of a specific tax retention.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.TaxRetentionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TaxRetentionsApi apiInstance = new TaxRetentionsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `tax-retention.id` you want to get detailed information about.
        try {
            TaxRetentions result = apiInstance.detailTaxRetentions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxRetentionsApi#detailTaxRetentions");
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
| **id** | **UUID**| The &#x60;tax-retention.id&#x60; you want to get detailed information about. | |

### Return type

[**TaxRetentions**](TaxRetentions.md)

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


## listTaxRetentions

> TaxRetentionsPaginatedResponse listTaxRetentions(page, link, filters)

List all tax retentions

Get a paginated list of all existing tax retentions in your Belvo account. We return up to 100 results per page.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.TaxRetentionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TaxRetentionsApi apiInstance = new TaxRetentionsApi(defaultClient);
        Integer page = 1; // Integer | A page number within the paginated result set.
        UUID link = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // UUID | The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `link.id` filter in order to improve your performance. 
        InvestmentTransactionFilters filters = new HashMap(); // InvestmentTransactionFilters | List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although `filters` is an object, any filter you use is automatically serialized as a query string.
        try {
            TaxRetentionsPaginatedResponse result = apiInstance.listTaxRetentions(page, link, filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxRetentionsApi#listTaxRetentions");
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
| **link** | **UUID**| The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;link.id&#x60; filter in order to improve your performance.  | [optional] |
| **filters** | [**InvestmentTransactionFilters**](.md)| List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. | [optional] |

### Return type

[**TaxRetentionsPaginatedResponse**](TaxRetentionsPaginatedResponse.md)

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


## retrieveTaxRetentions

> List&lt;TaxRetentions&gt; retrieveTaxRetentions(taxRetentionsRequest)

Retrieve tax retentions for a link

Retrieve tax retention information from a specific link. The maximum number of tax retentions that can be returned for a period is 500.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.TaxRetentionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TaxRetentionsApi apiInstance = new TaxRetentionsApi(defaultClient);
        TaxRetentionsRequest taxRetentionsRequest = new TaxRetentionsRequest(); // TaxRetentionsRequest | 
        try {
            List<TaxRetentions> result = apiInstance.retrieveTaxRetentions(taxRetentionsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxRetentionsApi#retrieveTaxRetentions");
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
| **taxRetentionsRequest** | [**TaxRetentionsRequest**](TaxRetentionsRequest.md)|  | |

### Return type

[**List&lt;TaxRetentions&gt;**](TaxRetentions.md)

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

