# RecurringExpensesApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**destroyRecurringExpense**](RecurringExpensesApi.md#destroyRecurringExpense) | **DELETE** /api/recurring-expenses/{id}/ | Delete a recurring expense |
| [**detailRecurringExpense**](RecurringExpensesApi.md#detailRecurringExpense) | **GET** /api/recurring-expenses/{id}/ | Get a recurring expense&#39;s details |
| [**listRecurringExpenses**](RecurringExpensesApi.md#listRecurringExpenses) | **GET** /api/recurring-expenses/ | List all recurring expenses |
| [**patchRecurringExpenses**](RecurringExpensesApi.md#patchRecurringExpenses) | **PATCH** /api/recurring-expenses/ | Complete a recurring expenses request |
| [**retrieveRecurringExpenses**](RecurringExpensesApi.md#retrieveRecurringExpenses) | **POST** /api/recurring-expenses/ | Retrieve recurring expenses for a link |



## destroyRecurringExpense

> destroyRecurringExpense(id)

Delete a recurring expense

Delete a specific recurring expense from your Belvo account.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.RecurringExpensesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        RecurringExpensesApi apiInstance = new RecurringExpensesApi(defaultClient);
        String id = "id_example"; // String | The `recurring-expenses.id` that you want to delete
        try {
            apiInstance.destroyRecurringExpense(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecurringExpensesApi#destroyRecurringExpense");
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
| **id** | **String**| The &#x60;recurring-expenses.id&#x60; that you want to delete | |

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


## detailRecurringExpense

> List&lt;RecurringExpenses&gt; detailRecurringExpense(id)

Get a recurring expense&#39;s details

Get the details of a specific recurring expense.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.RecurringExpensesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        RecurringExpensesApi apiInstance = new RecurringExpensesApi(defaultClient);
        String id = "id_example"; // String | The `recurring-expenses.id` you want to get detailed information about.
        try {
            List<RecurringExpenses> result = apiInstance.detailRecurringExpense(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecurringExpensesApi#detailRecurringExpense");
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
| **id** | **String**| The &#x60;recurring-expenses.id&#x60; you want to get detailed information about. | |

### Return type

[**List&lt;RecurringExpenses&gt;**](RecurringExpenses.md)

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


## listRecurringExpenses

> RecurringExpensesPaginatedResponse listRecurringExpenses(page, pageSize, link, account, filters)

List all recurring expenses

Get a paginated list of all recurring expenses in your Belvo account. By default, we return up to 100 results per page.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.RecurringExpensesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        RecurringExpensesApi apiInstance = new RecurringExpensesApi(defaultClient);
        Integer page = 1; // Integer | A page number within the paginated result set.
        Integer pageSize = 100; // Integer | Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
        UUID link = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // UUID | The `link.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `account.id` filters in order to improve your performance. 
        UUID account = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // UUID | The `account.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `account.id` filters in order to improve your performance. 
        RecurringExpenseFilters filters = new HashMap(); // RecurringExpenseFilters | List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although `filters` is an object, any filter you use is automatically serialized as a query string.
        try {
            RecurringExpensesPaginatedResponse result = apiInstance.listRecurringExpenses(page, pageSize, link, account, filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecurringExpensesApi#listRecurringExpenses");
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
| **filters** | [**RecurringExpenseFilters**](.md)| List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. | [optional] |

### Return type

[**RecurringExpensesPaginatedResponse**](RecurringExpensesPaginatedResponse.md)

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


## patchRecurringExpenses

> List&lt;RecurringExpenses&gt; patchRecurringExpenses(patchBody)

Complete a recurring expenses request

Used to resume an Recurring Expenses retrieve session that was paused because an MFA token was required by the institution.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.RecurringExpensesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        RecurringExpensesApi apiInstance = new RecurringExpensesApi(defaultClient);
        PatchBody patchBody = new PatchBody(); // PatchBody | 
        try {
            List<RecurringExpenses> result = apiInstance.patchRecurringExpenses(patchBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecurringExpensesApi#patchRecurringExpenses");
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

[**List&lt;RecurringExpenses&gt;**](RecurringExpenses.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok (when save_data&#x3D;false) |  -  |
| **201** | Created (when save_data&#x3D;true) |  -  |
| **400** | Bad request error |  -  |
| **401** | Authentication to Belvo API failed |  -  |
| **408** | Request Timeout |  -  |
| **428** | MFA Token Required |  -  |
| **500** | Unexpected Error |  -  |


## retrieveRecurringExpenses

> List&lt;RecurringExpenses&gt; retrieveRecurringExpenses(standardRequest)

Retrieve recurring expenses for a link

Retrieve recurring expense insights for &lt;b&gt;checking and savings accounts&lt;/b&gt; from a specific link. You can receive insights for a period of up to 365 days, depending on the transaction history available for each [bank](https://developers.belvo.com/docs/institution).

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.RecurringExpensesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        RecurringExpensesApi apiInstance = new RecurringExpensesApi(defaultClient);
        StandardRequest standardRequest = new StandardRequest(); // StandardRequest | 
        try {
            List<RecurringExpenses> result = apiInstance.retrieveRecurringExpenses(standardRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecurringExpensesApi#retrieveRecurringExpenses");
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
| **standardRequest** | [**StandardRequest**](StandardRequest.md)|  | |

### Return type

[**List&lt;RecurringExpenses&gt;**](RecurringExpenses.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok (when save_data&#x3D;false) |  -  |
| **201** | Created (when save_data&#x3D;true) |  -  |
| **400** | Bad request error |  -  |
| **401** | Authentication to Belvo API failed |  -  |
| **408** | Request Timeout |  -  |
| **428** | MFA Token Required |  -  |
| **500** | Unexpected Error |  -  |

