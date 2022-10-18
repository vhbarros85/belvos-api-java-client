# IncomesApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**destroyIncomes**](IncomesApi.md#destroyIncomes) | **DELETE** /api/incomes/{id}/ | Delete an income |
| [**detailIncome**](IncomesApi.md#detailIncome) | **GET** /api/incomes/{id}/ | Get an income&#39;s details |
| [**listIncomes**](IncomesApi.md#listIncomes) | **GET** /api/incomes/ | List all incomes |
| [**patchIncomes**](IncomesApi.md#patchIncomes) | **PATCH** /api/incomes/ | Complete an incomes request |
| [**retrieveIncome**](IncomesApi.md#retrieveIncome) | **POST** /api/incomes/ | Retrieve incomes for a link |



## destroyIncomes

> destroyIncomes(id)

Delete an income

Delete a specific income from your Belvo account.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.IncomesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        IncomesApi apiInstance = new IncomesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | the `income.id` that you want to delete
        try {
            apiInstance.destroyIncomes(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncomesApi#destroyIncomes");
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
| **id** | **UUID**| the &#x60;income.id&#x60; that you want to delete | |

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


## detailIncome

> List&lt;Income&gt; detailIncome(id)

Get an income&#39;s details

Get the details of a specific income.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.IncomesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        IncomesApi apiInstance = new IncomesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `income.id` you want to get detailed information about.
        try {
            List<Income> result = apiInstance.detailIncome(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncomesApi#detailIncome");
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
| **id** | **UUID**| The &#x60;income.id&#x60; you want to get detailed information about. | |

### Return type

[**List&lt;Income&gt;**](Income.md)

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


## listIncomes

> IncomesPaginatedResponse listIncomes(page, pageSize, account, filters)

List all incomes

Get a paginated list of all incomes in your Belvo account. By default, we return up to 100 results per page.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.IncomesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        IncomesApi apiInstance = new IncomesApi(defaultClient);
        Integer page = 1; // Integer | A page number within the paginated result set.
        Integer pageSize = 100; // Integer | Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
        UUID account = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // UUID | The `account.id` you want to filter by.  ℹ️ We highly recommend adding the `account.id` filter in order to improve your performance. 
        IncomeFilters filters = new HashMap(); // IncomeFilters | List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although `filters` is an object, any filter you use is automatically serialized as a query string.
        try {
            IncomesPaginatedResponse result = apiInstance.listIncomes(page, pageSize, account, filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncomesApi#listIncomes");
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
| **account** | **UUID**| The &#x60;account.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;account.id&#x60; filter in order to improve your performance.  | [optional] |
| **filters** | [**IncomeFilters**](.md)| List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. | [optional] |

### Return type

[**IncomesPaginatedResponse**](IncomesPaginatedResponse.md)

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


## patchIncomes

> List&lt;Income&gt; patchIncomes(patchBody)

Complete an incomes request

Used to resume an Income retrieve session that was paused because an MFA token was required by the institution.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.IncomesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        IncomesApi apiInstance = new IncomesApi(defaultClient);
        PatchBody patchBody = new PatchBody(); // PatchBody | 
        try {
            List<Income> result = apiInstance.patchIncomes(patchBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncomesApi#patchIncomes");
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

[**List&lt;Income&gt;**](Income.md)

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


## retrieveIncome

> List&lt;Income&gt; retrieveIncome(incomesRequest)

Retrieve incomes for a link

Retrieve income insights for &lt;b&gt;checking and savings accounts&lt;/b&gt; from a specific link. You can receive insights for a period of up to 365 days, depending on the transaction history available for each [bank](https://developers.belvo.com/docs/institution).

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.IncomesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        IncomesApi apiInstance = new IncomesApi(defaultClient);
        IncomesRequest incomesRequest = new IncomesRequest(); // IncomesRequest | 
        try {
            List<Income> result = apiInstance.retrieveIncome(incomesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncomesApi#retrieveIncome");
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
| **incomesRequest** | [**IncomesRequest**](IncomesRequest.md)|  | |

### Return type

[**List&lt;Income&gt;**](Income.md)

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

