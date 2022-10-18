# ReceivableTransactionsBetaApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**destroyReceivableTransaction**](ReceivableTransactionsBetaApi.md#destroyReceivableTransaction) | **DELETE** /receivables/transactions/{id}/ | Delete a receivable transaction |
| [**detailReceivableTransaction**](ReceivableTransactionsBetaApi.md#detailReceivableTransaction) | **GET** /receivables/transactions/{id}/ | Get a receivable transaction&#39;s details |
| [**listReceivableTransactions**](ReceivableTransactionsBetaApi.md#listReceivableTransactions) | **GET** /receivables/transactions/ | List all receivable transactions |
| [**retrieveReceivableTransactions**](ReceivableTransactionsBetaApi.md#retrieveReceivableTransactions) | **POST** /receivables/transactions/ | Retrieve receivable transactions for a link |



## destroyReceivableTransaction

> destroyReceivableTransaction(id)

Delete a receivable transaction

Delete a specific receivable transaction from your Belvo account.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.ReceivableTransactionsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReceivableTransactionsBetaApi apiInstance = new ReceivableTransactionsBetaApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `transaction.id` that you want to delete.
        try {
            apiInstance.destroyReceivableTransaction(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceivableTransactionsBetaApi#destroyReceivableTransaction");
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
| **id** | **UUID**| The &#x60;transaction.id&#x60; that you want to delete. | |

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


## detailReceivableTransaction

> ReceivablesTransaction detailReceivableTransaction(id)

Get a receivable transaction&#39;s details

Get the details of a specific receivable transaction.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.ReceivableTransactionsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReceivableTransactionsBetaApi apiInstance = new ReceivableTransactionsBetaApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `transaction.id` you want to get detailed information about.
        try {
            ReceivablesTransaction result = apiInstance.detailReceivableTransaction(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceivableTransactionsBetaApi#detailReceivableTransaction");
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
| **id** | **UUID**| The &#x60;transaction.id&#x60; you want to get detailed information about. | |

### Return type

[**ReceivablesTransaction**](ReceivablesTransaction.md)

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


## listReceivableTransactions

> ReceivablesTransactionsPaginatedResponse listReceivableTransactions(page, link, account, filters)

List all receivable transactions

Get a paginated list of all the existing receivable transactions in your Belvo account. We return up to 100 results per page.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.ReceivableTransactionsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReceivableTransactionsBetaApi apiInstance = new ReceivableTransactionsBetaApi(defaultClient);
        Integer page = 1; // Integer | A page number within the paginated result set.
        UUID link = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // UUID | The `link.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `account.id` filters in order to improve your performance. 
        UUID account = UUID.fromString("d979df3a-5d0f-4cc9-9bd4-b75c28b45963"); // UUID | The `account.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `account.id` filters in order to improve your performance. 
        ReceivableTransactionFilters filters = new HashMap(); // ReceivableTransactionFilters | List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although `filters` is an object, any filter you use is automatically serialized as a query string.
        try {
            ReceivablesTransactionsPaginatedResponse result = apiInstance.listReceivableTransactions(page, link, account, filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceivableTransactionsBetaApi#listReceivableTransactions");
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
| **link** | **UUID**| The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance.  | [optional] |
| **account** | **UUID**| The &#x60;account.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance.  | [optional] |
| **filters** | [**ReceivableTransactionFilters**](.md)| List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. | [optional] |

### Return type

[**ReceivablesTransactionsPaginatedResponse**](ReceivablesTransactionsPaginatedResponse.md)

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


## retrieveReceivableTransactions

> ReceivablesTransaction retrieveReceivableTransactions(receivableTransactionRequest)

Retrieve receivable transactions for a link

Retrieve all receivable transactions for an existing link.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.ReceivableTransactionsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ReceivableTransactionsBetaApi apiInstance = new ReceivableTransactionsBetaApi(defaultClient);
        ReceivableTransactionRequest receivableTransactionRequest = new ReceivableTransactionRequest(); // ReceivableTransactionRequest | 
        try {
            ReceivablesTransaction result = apiInstance.retrieveReceivableTransactions(receivableTransactionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReceivableTransactionsBetaApi#retrieveReceivableTransactions");
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
| **receivableTransactionRequest** | [**ReceivableTransactionRequest**](ReceivableTransactionRequest.md)|  | |

### Return type

[**ReceivablesTransaction**](ReceivablesTransaction.md)

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
| **428** | MFA Token Required |  -  |
| **500** | Unexpected Error |  -  |

