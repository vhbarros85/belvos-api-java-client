# RiskInsightsApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**destroyRiskInsights**](RiskInsightsApi.md#destroyRiskInsights) | **DELETE** /api/risk-insights/{id}/ | Delete a risk insight |
| [**detailRiskInsights**](RiskInsightsApi.md#detailRiskInsights) | **GET** /api/risk-insights/{id}/ | Get a risk insight&#39;s details |
| [**listRiskInsights**](RiskInsightsApi.md#listRiskInsights) | **GET** /api/risk-insights/ | List all risk insights |
| [**patchRiskInsights**](RiskInsightsApi.md#patchRiskInsights) | **PATCH** /api/risk-insights/ | Complete a risk insights request |
| [**retrieveRiskInsights**](RiskInsightsApi.md#retrieveRiskInsights) | **POST** /api/risk-insights/ | Retrieve risk insights for a link |



## destroyRiskInsights

> destroyRiskInsights(id)

Delete a risk insight

Delete a specific risk insight from your Belvo account.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.RiskInsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        RiskInsightsApi apiInstance = new RiskInsightsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `risk-insights.id` that you want to delete
        try {
            apiInstance.destroyRiskInsights(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling RiskInsightsApi#destroyRiskInsights");
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
| **id** | **UUID**| The &#x60;risk-insights.id&#x60; that you want to delete | |

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


## detailRiskInsights

> List&lt;RiskInsights&gt; detailRiskInsights(id)

Get a risk insight&#39;s details

Get the details of a specific risk insight.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.RiskInsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        RiskInsightsApi apiInstance = new RiskInsightsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `risk-insights.id` you want to get detailed information about.
        try {
            List<RiskInsights> result = apiInstance.detailRiskInsights(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RiskInsightsApi#detailRiskInsights");
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
| **id** | **UUID**| The &#x60;risk-insights.id&#x60; you want to get detailed information about. | |

### Return type

[**List&lt;RiskInsights&gt;**](RiskInsights.md)

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


## listRiskInsights

> RiskInsightsPaginatedResponse listRiskInsights(page, pageSize, link, filters)

List all risk insights

Get a paginated list of all risk insight analyses in your Belvo account. By default, we return up to 100 results per page.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.RiskInsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        RiskInsightsApi apiInstance = new RiskInsightsApi(defaultClient);
        Integer page = 1; // Integer | A page number within the paginated result set.
        Integer pageSize = 100; // Integer | Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
        UUID link = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // UUID | The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `link.id` filter in order to improve your performance. 
        RiskInsightFilters filters = new HashMap(); // RiskInsightFilters | List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although `filters` is an object, any filter you use is automatically serialized as a query string.
        try {
            RiskInsightsPaginatedResponse result = apiInstance.listRiskInsights(page, pageSize, link, filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RiskInsightsApi#listRiskInsights");
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
| **filters** | [**RiskInsightFilters**](.md)| List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. | [optional] |

### Return type

[**RiskInsightsPaginatedResponse**](RiskInsightsPaginatedResponse.md)

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


## patchRiskInsights

> List&lt;RiskInsights&gt; patchRiskInsights(patchBody)

Complete a risk insights request

Used to resume an Risk insights retrieve session that was paused because an MFA token was required by the institution.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.RiskInsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        RiskInsightsApi apiInstance = new RiskInsightsApi(defaultClient);
        PatchBody patchBody = new PatchBody(); // PatchBody | 
        try {
            List<RiskInsights> result = apiInstance.patchRiskInsights(patchBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RiskInsightsApi#patchRiskInsights");
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

[**List&lt;RiskInsights&gt;**](RiskInsights.md)

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


## retrieveRiskInsights

> List&lt;RiskInsights&gt; retrieveRiskInsights(standardRequest)

Retrieve risk insights for a link

Request the risk insights for a given link ID.  If you need to know the currency of the account, just do a GET Details to the accounts endpoint (using the ID you receive from the accounts response).

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.RiskInsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        RiskInsightsApi apiInstance = new RiskInsightsApi(defaultClient);
        StandardRequest standardRequest = new StandardRequest(); // StandardRequest | 
        try {
            List<RiskInsights> result = apiInstance.retrieveRiskInsights(standardRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RiskInsightsApi#retrieveRiskInsights");
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

[**List&lt;RiskInsights&gt;**](RiskInsights.md)

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

