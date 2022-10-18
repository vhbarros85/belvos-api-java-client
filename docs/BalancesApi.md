# BalancesApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**destroyBalance**](BalancesApi.md#destroyBalance) | **DELETE** /api/balances/{id}/ | Delete a balance |
| [**detailBalance**](BalancesApi.md#detailBalance) | **GET** /api/balances/{id}/ | Get a balance&#39;s details |
| [**listBalances**](BalancesApi.md#listBalances) | **GET** /api/balances/ | List all balances |
| [**patchBalances**](BalancesApi.md#patchBalances) | **PATCH** /api/balances/ | Complete a balances request |
| [**retrieveBalances**](BalancesApi.md#retrieveBalances) | **POST** /api/balances/ | Retrieve balances for a link |



## destroyBalance

> destroyBalance(id)

Delete a balance

Delete a specific balance from your Belvo account.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.BalancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        BalancesApi apiInstance = new BalancesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `balance.id` that you want to delete.
        try {
            apiInstance.destroyBalance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalancesApi#destroyBalance");
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
| **id** | **UUID**| The &#x60;balance.id&#x60; that you want to delete. | |

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


## detailBalance

> Balance detailBalance(id)

Get a balance&#39;s details

Get the details of a specific balance.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.BalancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        BalancesApi apiInstance = new BalancesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `balance.id` you want to get detailed information about.
        try {
            Balance result = apiInstance.detailBalance(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalancesApi#detailBalance");
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
| **id** | **UUID**| The &#x60;balance.id&#x60; you want to get detailed information about. | |

### Return type

[**Balance**](Balance.md)

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


## listBalances

> BalancesPaginatedResponse listBalances(page, pageSize, link, account, filters)

List all balances

Get a paginated list of all existing balances in your Belvo account. By default, we return up to 100 results per page.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.BalancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        BalancesApi apiInstance = new BalancesApi(defaultClient);
        Integer page = 1; // Integer | A page number within the paginated result set.
        Integer pageSize = 100; // Integer | Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
        UUID link = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // UUID | The `link.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `account.id` filters in order to improve your performance. 
        UUID account = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // UUID | The `account.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `account.id` filters in order to improve your performance. 
        BalanceFilters filters = new HashMap(); // BalanceFilters | List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although `filters` is an object, any filter you use is automatically serialized as a query string.
        try {
            BalancesPaginatedResponse result = apiInstance.listBalances(page, pageSize, link, account, filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalancesApi#listBalances");
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
| **link** | **UUID**| The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance.  | [optional] |
| **account** | **UUID**| The &#x60;account.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance.  | [optional] |
| **filters** | [**BalanceFilters**](.md)| List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. | [optional] |

### Return type

[**BalancesPaginatedResponse**](BalancesPaginatedResponse.md)

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


## patchBalances

> List&lt;Balance&gt; patchBalances(patchBody)

Complete a balances request

Used to resume a Balance retrieve session that was paused because an MFA token was required by the institution.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.BalancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        BalancesApi apiInstance = new BalancesApi(defaultClient);
        PatchBody patchBody = new PatchBody(); // PatchBody | 
        try {
            List<Balance> result = apiInstance.patchBalances(patchBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalancesApi#patchBalances");
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
| **patchBody** | [**PatchBody**](PatchBody.md)|  | |

### Return type

[**List&lt;Balance&gt;**](Balance.md)

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
| **428** | MFA Token Required |  -  |
| **500** | Unexpected Error |  -  |


## retrieveBalances

> List&lt;Balance&gt; retrieveBalances(balancesRequest)

Retrieve balances for a link

Retrieve balances from one or more accounts for a specific link within a specified date range.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.BalancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        BalancesApi apiInstance = new BalancesApi(defaultClient);
        BalancesRequest balancesRequest = new BalancesRequest(); // BalancesRequest | 
        try {
            List<Balance> result = apiInstance.retrieveBalances(balancesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalancesApi#retrieveBalances");
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
| **balancesRequest** | [**BalancesRequest**](BalancesRequest.md)|  | |

### Return type

[**List&lt;Balance&gt;**](Balance.md)

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
| **428** | MFA Token Required |  -  |
| **500** | Unexpected Error |  -  |

