# InvestmentPortfoliosBetaApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**destroyPortfolio**](InvestmentPortfoliosBetaApi.md#destroyPortfolio) | **DELETE** /investments/portfolios/{id}/ | Delete a portfolio |
| [**detailPortfolio**](InvestmentPortfoliosBetaApi.md#detailPortfolio) | **GET** /investments/portfolios/{id}/ | Get a portfolio&#39;s details |
| [**listPortfolio**](InvestmentPortfoliosBetaApi.md#listPortfolio) | **GET** /investments/portfolios/ | List all portfolios |
| [**patchPortfolio**](InvestmentPortfoliosBetaApi.md#patchPortfolio) | **PATCH** /investments/portfolios/ | Complete a portfolios request |
| [**retrievePortfolio**](InvestmentPortfoliosBetaApi.md#retrievePortfolio) | **POST** /investments/portfolios/ | Retrieve portfolios for a link |



## destroyPortfolio

> destroyPortfolio(id)

Delete a portfolio

Delete a specific investment portfolio and all associated instruments, transactions, and owners from your Belvo account.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.InvestmentPortfoliosBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InvestmentPortfoliosBetaApi apiInstance = new InvestmentPortfoliosBetaApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `portfolio.id` that you want to delete.
        try {
            apiInstance.destroyPortfolio(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestmentPortfoliosBetaApi#destroyPortfolio");
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
| **id** | **UUID**| The &#x60;portfolio.id&#x60; that you want to delete. | |

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


## detailPortfolio

> InvestmentsPortfolio detailPortfolio(id)

Get a portfolio&#39;s details

Get the details of a specific portfolio.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.InvestmentPortfoliosBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InvestmentPortfoliosBetaApi apiInstance = new InvestmentPortfoliosBetaApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `portfolio.id` you want to get detailed information about.
        try {
            InvestmentsPortfolio result = apiInstance.detailPortfolio(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestmentPortfoliosBetaApi#detailPortfolio");
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
| **id** | **UUID**| The &#x60;portfolio.id&#x60; you want to get detailed information about. | |

### Return type

[**InvestmentsPortfolio**](InvestmentsPortfolio.md)

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


## listPortfolio

> InvestmentsPortfoliosPaginatedResponse listPortfolio(page, pageSize, link, filters)

List all portfolios

Get a paginated list of all the existing portfolios (and their instruments) in your Belvo account. By default, we return up to 100 results per page.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.InvestmentPortfoliosBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InvestmentPortfoliosBetaApi apiInstance = new InvestmentPortfoliosBetaApi(defaultClient);
        Integer page = 1; // Integer | A page number within the paginated result set.
        Integer pageSize = 100; // Integer | Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
        UUID link = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // UUID | The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `link.id` filter in order to improve your performance. 
        InvestmentPortfolioFilters filters = new HashMap(); // InvestmentPortfolioFilters | List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although `filters` is an object, any filter you use is automatically serialized as a query string.
        try {
            InvestmentsPortfoliosPaginatedResponse result = apiInstance.listPortfolio(page, pageSize, link, filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestmentPortfoliosBetaApi#listPortfolio");
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
| **filters** | [**InvestmentPortfolioFilters**](.md)| List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. | [optional] |

### Return type

[**InvestmentsPortfoliosPaginatedResponse**](InvestmentsPortfoliosPaginatedResponse.md)

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


## patchPortfolio

> InvestmentsPortfolio patchPortfolio(patchBodyWithoutSaveData)

Complete a portfolios request

Used to resume a portfolio retrieve session that was paused because an MFA token was required by the institution.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.InvestmentPortfoliosBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InvestmentPortfoliosBetaApi apiInstance = new InvestmentPortfoliosBetaApi(defaultClient);
        PatchBodyWithoutSaveData patchBodyWithoutSaveData = new PatchBodyWithoutSaveData(); // PatchBodyWithoutSaveData | 
        try {
            InvestmentsPortfolio result = apiInstance.patchPortfolio(patchBodyWithoutSaveData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestmentPortfoliosBetaApi#patchPortfolio");
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

[**InvestmentsPortfolio**](InvestmentsPortfolio.md)

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


## retrievePortfolio

> InvestmentsPortfolio retrievePortfolio(standardRequest)

Retrieve portfolios for a link

Retrieve all portfolios for an existing link.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.InvestmentPortfoliosBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        InvestmentPortfoliosBetaApi apiInstance = new InvestmentPortfoliosBetaApi(defaultClient);
        StandardRequest standardRequest = new StandardRequest(); // StandardRequest | 
        try {
            InvestmentsPortfolio result = apiInstance.retrievePortfolio(standardRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestmentPortfoliosBetaApi#retrievePortfolio");
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

[**InvestmentsPortfolio**](InvestmentsPortfolio.md)

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

