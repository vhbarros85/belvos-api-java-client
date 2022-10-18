# InvestmentTransactionsBetaApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**destroyInvestmentTransaction**](InvestmentTransactionsBetaApi.md#destroyInvestmentTransaction) | **DELETE** /investments/transactions/{id}/ | Delete an investment transaction |
| [**detailInvestmentTransaction**](InvestmentTransactionsBetaApi.md#detailInvestmentTransaction) | **GET** /investments/transactions/{id}/ | Get an investment transaction&#39;s details |
| [**listInvestmentTransactions**](InvestmentTransactionsBetaApi.md#listInvestmentTransactions) | **GET** /investments/transactions/ | List all investment transactions |
| [**patchInvestmentsTransactions**](InvestmentTransactionsBetaApi.md#patchInvestmentsTransactions) | **PATCH** /investments/transactions/ | Complete a investment transactions request |
| [**retrieveInstrumentTransaction**](InvestmentTransactionsBetaApi.md#retrieveInstrumentTransaction) | **POST** /investments/transactions/ | Retrieve investment transactions for a link |



## destroyInvestmentTransaction

> destroyInvestmentTransaction(id)

Delete an investment transaction

Delete a specific instrument transaction from your Belvo account.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.InvestmentTransactionsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InvestmentTransactionsBetaApi apiInstance = new InvestmentTransactionsBetaApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `transaction.id` that you want to delete.
        try {
            apiInstance.destroyInvestmentTransaction(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestmentTransactionsBetaApi#destroyInvestmentTransaction");
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


## detailInvestmentTransaction

> InvestmentsInstrumentTransaction detailInvestmentTransaction(id)

Get an investment transaction&#39;s details

Get the details of a specific instrument&#39;s transaction.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.InvestmentTransactionsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InvestmentTransactionsBetaApi apiInstance = new InvestmentTransactionsBetaApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `transaction.id` you want to get detailed information about.
        try {
            InvestmentsInstrumentTransaction result = apiInstance.detailInvestmentTransaction(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestmentTransactionsBetaApi#detailInvestmentTransaction");
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

[**InvestmentsInstrumentTransaction**](InvestmentsInstrumentTransaction.md)

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


## listInvestmentTransactions

> InvestmentsTransactionsPaginatedResponse listInvestmentTransactions(page, pageSize, link, portfolio, filters)

List all investment transactions

Get a paginated list of all the existing transactions for an instrument in your Belvo account. By default, we return up to 100 results per page.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.InvestmentTransactionsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InvestmentTransactionsBetaApi apiInstance = new InvestmentTransactionsBetaApi(defaultClient);
        Integer page = 1; // Integer | A page number within the paginated result set.
        Integer pageSize = 100; // Integer | Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
        UUID link = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // UUID | The `link.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `portfolio.id` filters in order to improve your performance. 
        UUID portfolio = UUID.fromString("d979df3a-5d0f-4cc9-9bd4-b75c28b45963"); // UUID | The `portfolio.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `portfolio.id` filters in order to improve your performance. 
        InvestmentTransactionFilters filters = new HashMap(); // InvestmentTransactionFilters | List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although `filters` is an object, any filter you use is automatically serialized as a query string.
        try {
            InvestmentsTransactionsPaginatedResponse result = apiInstance.listInvestmentTransactions(page, pageSize, link, portfolio, filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestmentTransactionsBetaApi#listInvestmentTransactions");
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
| **link** | **UUID**| The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;portfolio.id&#x60; filters in order to improve your performance.  | [optional] |
| **portfolio** | **UUID**| The &#x60;portfolio.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;portfolio.id&#x60; filters in order to improve your performance.  | [optional] |
| **filters** | [**InvestmentTransactionFilters**](.md)| List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. | [optional] |

### Return type

[**InvestmentsTransactionsPaginatedResponse**](InvestmentsTransactionsPaginatedResponse.md)

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


## patchInvestmentsTransactions

> InvestmentsInstrumentTransaction patchInvestmentsTransactions(patchBodyWithoutSaveData)

Complete a investment transactions request

Used to resume a Investment retrieve session that was paused because an MFA token was required by the institution.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.InvestmentTransactionsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InvestmentTransactionsBetaApi apiInstance = new InvestmentTransactionsBetaApi(defaultClient);
        PatchBodyWithoutSaveData patchBodyWithoutSaveData = new PatchBodyWithoutSaveData(); // PatchBodyWithoutSaveData | 
        try {
            InvestmentsInstrumentTransaction result = apiInstance.patchInvestmentsTransactions(patchBodyWithoutSaveData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestmentTransactionsBetaApi#patchInvestmentsTransactions");
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
| **patchBodyWithoutSaveData** | [**PatchBodyWithoutSaveData**](PatchBodyWithoutSaveData.md)|  | |

### Return type

[**InvestmentsInstrumentTransaction**](InvestmentsInstrumentTransaction.md)

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


## retrieveInstrumentTransaction

> InvestmentsInstrumentTransaction retrieveInstrumentTransaction(instrumentTransactionRequest)

Retrieve investment transactions for a link

Retrieve all instrument transactions for an existing link.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.InvestmentTransactionsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InvestmentTransactionsBetaApi apiInstance = new InvestmentTransactionsBetaApi(defaultClient);
        InstrumentTransactionRequest instrumentTransactionRequest = new InstrumentTransactionRequest(); // InstrumentTransactionRequest | 
        try {
            InvestmentsInstrumentTransaction result = apiInstance.retrieveInstrumentTransaction(instrumentTransactionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestmentTransactionsBetaApi#retrieveInstrumentTransaction");
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
| **instrumentTransactionRequest** | [**InstrumentTransactionRequest**](InstrumentTransactionRequest.md)|  | |

### Return type

[**InvestmentsInstrumentTransaction**](InvestmentsInstrumentTransaction.md)

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

