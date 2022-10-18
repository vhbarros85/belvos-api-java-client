# LinksApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**destroyLink**](LinksApi.md#destroyLink) | **DELETE** /api/links/{id}/ | Delete a link |
| [**detailLink**](LinksApi.md#detailLink) | **GET** /api/links/{id}/ | Get a link&#39;s details |
| [**listLinks**](LinksApi.md#listLinks) | **GET** /api/links/ | List all links |
| [**patchLinks**](LinksApi.md#patchLinks) | **PATCH** /api/links/ | Complete a links request |
| [**registerLink**](LinksApi.md#registerLink) | **POST** /api/links/ | Register a new link |
| [**updateLink**](LinksApi.md#updateLink) | **PUT** /api/links/{id}/ | Update a link&#39;s credentials |



## destroyLink

> destroyLink(id)

Delete a link

Delete a specific link and all associated accounts, transactions, and owners from your Belvo account.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.LinksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        LinksApi apiInstance = new LinksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `link.id` that you want to delete.
        try {
            apiInstance.destroyLink(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling LinksApi#destroyLink");
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
| **id** | **UUID**| The &#x60;link.id&#x60; that you want to delete. | |

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


## detailLink

> Link detailLink(id)

Get a link&#39;s details

Get the details of a specific link.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.LinksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        LinksApi apiInstance = new LinksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `link.id` you want to get detailed information about.
        try {
            Link result = apiInstance.detailLink(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LinksApi#detailLink");
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
| **id** | **UUID**| The &#x60;link.id&#x60; you want to get detailed information about. | |

### Return type

[**Link**](Link.md)

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


## listLinks

> PaginatedResponseLink listLinks(page, pageSize, filters)

List all links

Get a paginated list of all the existing links in your Belvo account. By default, we return up to 100 results per page.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.LinksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        LinksApi apiInstance = new LinksApi(defaultClient);
        Integer page = 1; // Integer | A page number within the paginated result set.
        Integer pageSize = 100; // Integer | Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
        LinkFilters filters = new HashMap(); // LinkFilters | List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although `filters` is an object, any filter you use is automatically serialized as a query string.
        try {
            PaginatedResponseLink result = apiInstance.listLinks(page, pageSize, filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LinksApi#listLinks");
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
| **filters** | [**LinkFilters**](.md)| List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. | [optional] |

### Return type

[**PaginatedResponseLink**](PaginatedResponseLink.md)

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


## patchLinks

> Link patchLinks(patchBodyWithoutSaveData)

Complete a links request

Used to resume a Link register session that was paused because an MFA token was required by the institution.

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.LinksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        LinksApi apiInstance = new LinksApi(defaultClient);
        PatchBodyWithoutSaveData patchBodyWithoutSaveData = new PatchBodyWithoutSaveData(); // PatchBodyWithoutSaveData | 
        try {
            Link result = apiInstance.patchLinks(patchBodyWithoutSaveData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LinksApi#patchLinks");
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

[**Link**](Link.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** | Bad request error |  -  |
| **401** | Authentication to Belvo API failed |  -  |
| **428** | MFA Token Required |  -  |
| **500** | Unexpected Error |  -  |


## registerLink

> Link registerLink(linksRequest)

Register a new link

Register a new link with your Belvo account.  &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Note: &lt;/strong&gt; We recommend using our &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/connect-widget\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Connect Widget&lt;/a&gt; to handle link creation and link status updates. &lt;/div&gt; 

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.LinksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        LinksApi apiInstance = new LinksApi(defaultClient);
        LinksRequest linksRequest = new LinksRequest(); // LinksRequest | 
        try {
            Link result = apiInstance.registerLink(linksRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LinksApi#registerLink");
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
| **linksRequest** | [**LinksRequest**](LinksRequest.md)|  | |

### Return type

[**Link**](Link.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request error |  -  |
| **401** | Authentication to Belvo API failed |  -  |
| **428** | MFA Token Required |  -  |
| **500** | Unexpected Error |  -  |


## updateLink

> Link updateLink(id, linksPutRequest)

Update a link&#39;s credentials

Update the credentials of a specific link. If the successfully updated link is a recurrent one, we automatically trigger an update of the link. If we find fresh data, you&#39;ll [receive historical update](https://developers.belvo.com/docs/webhooks) webhooks. &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Note: &lt;/strong&gt; We recommend using our &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/connect-widget\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Connect Widget&lt;/a&gt; to handle updating &lt;code&gt;invalid&lt;/code&gt; or &lt;code&gt;token_required&lt;/code&gt; links. &lt;/div&gt; 

### Example

```java
// Import classes:

import com.vhbarros.belvo.client.invoker.ApiClient;
import com.vhbarros.belvo.client.invoker.ApiException;
import com.vhbarros.belvo.client.invoker.Configuration;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.models.*;
import com.vhbarros.belvo.client.invoker.auth.api.LinksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        LinksApi apiInstance = new LinksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `link.id` you want to update.
        LinksPutRequest linksPutRequest = new LinksPutRequest(); // LinksPutRequest | 
        try {
            Link result = apiInstance.updateLink(id, linksPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LinksApi#updateLink");
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
| **id** | **UUID**| The &#x60;link.id&#x60; you want to update. | |
| **linksPutRequest** | [**LinksPutRequest**](LinksPutRequest.md)|  | |

### Return type

[**Link**](Link.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** | Bad request error |  -  |
| **401** | Authentication to Belvo API failed |  -  |
| **404** | Not Found |  -  |
| **428** | MFA Token Required |  -  |
| **500** | Unexpected Error |  -  |

