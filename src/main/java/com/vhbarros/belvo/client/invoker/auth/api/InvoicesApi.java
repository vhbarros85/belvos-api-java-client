package com.vhbarros.belvo.client.invoker.auth.api;

import com.vhbarros.belvo.client.invoker.ApiClient;

import com.vhbarros.belvo.client.model.InvoiceFilters;
import com.vhbarros.belvo.client.model.InvoiceWithId;
import com.vhbarros.belvo.client.model.InvoicesRequest;
import com.vhbarros.belvo.client.model.InvoicesResponsePaginatedResponse;
import com.vhbarros.belvo.client.model.NotFoundError;
import com.vhbarros.belvo.client.model.RegisterLink400ResponseInner;
import com.vhbarros.belvo.client.model.RequestTimeoutError;
import java.util.UUID;
import com.vhbarros.belvo.client.model.UnauthorizedError;
import com.vhbarros.belvo.client.model.UnexpectedError;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
@Component("com.vhbarros.belvo.client.api.InvoicesApi")
public class InvoicesApi {
    private ApiClient apiClient;

    public InvoicesApi() {
        this(new ApiClient());
    }

    @Autowired
    public InvoicesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete an invoice
     * Delete a specific invoice from your Belvo account.
     * <p><b>204</b> - No content
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;invoice.id&#x60; that you want to delete. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void destroyInvoice(UUID id) throws RestClientException {
        destroyInvoiceWithHttpInfo(id);
    }

    /**
     * Delete an invoice
     * Delete a specific invoice from your Belvo account.
     * <p><b>204</b> - No content
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;invoice.id&#x60; that you want to delete. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> destroyInvoiceWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling destroyInvoice");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/invoices/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get an invoice&#39;s details
     * Get the details of a specific invoice.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;invoice.id&#x60; you want to get detailed information about. (required)
     * @return InvoiceWithId
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoiceWithId detailInvoice(UUID id) throws RestClientException {
        return detailInvoiceWithHttpInfo(id).getBody();
    }

    /**
     * Get an invoice&#39;s details
     * Get the details of a specific invoice.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;invoice.id&#x60; you want to get detailed information about. (required)
     * @return ResponseEntity&lt;InvoiceWithId&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvoiceWithId> detailInvoiceWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling detailInvoice");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<InvoiceWithId> localReturnType = new ParameterizedTypeReference<InvoiceWithId>() {};
        return apiClient.invokeAPI("/api/invoices/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List all invoices
     * Get a paginated list of all existing invoices in your Belvo account. We return up to 100 results per page.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
     * @param link The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;link.id&#x60; filter in order to improve your performance.  (optional)
     * @param filters List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. (optional)
     * @return InvoicesResponsePaginatedResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoicesResponsePaginatedResponse listInvoices(Integer page, Integer pageSize, UUID link, InvoiceFilters filters) throws RestClientException {
        return listInvoicesWithHttpInfo(page, pageSize, link, filters).getBody();
    }

    /**
     * List all invoices
     * Get a paginated list of all existing invoices in your Belvo account. We return up to 100 results per page.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
     * @param link The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;link.id&#x60; filter in order to improve your performance.  (optional)
     * @param filters List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. (optional)
     * @return ResponseEntity&lt;InvoicesResponsePaginatedResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvoicesResponsePaginatedResponse> listInvoicesWithHttpInfo(Integer page, Integer pageSize, UUID link, InvoiceFilters filters) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "link", link));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filters", filters));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<InvoicesResponsePaginatedResponse> localReturnType = new ParameterizedTypeReference<InvoicesResponsePaginatedResponse>() {};
        return apiClient.invokeAPI("/api/invoices/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve invoices for a link
     * Retrieve invoice information from a specific fiscal link. &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Info: &lt;/strong&gt; You can ask for up to **one** year (365 days) of invoices per request. If you need invoices for more than one year, just make another request. &lt;/div&gt; 
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>500</b> - Unexpected Error
     * @param invoicesRequest  (required)
     * @return List&lt;InvoiceWithId&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<InvoiceWithId> retrieveInvoices(InvoicesRequest invoicesRequest) throws RestClientException {
        return retrieveInvoicesWithHttpInfo(invoicesRequest).getBody();
    }

    /**
     * Retrieve invoices for a link
     * Retrieve invoice information from a specific fiscal link. &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Info: &lt;/strong&gt; You can ask for up to **one** year (365 days) of invoices per request. If you need invoices for more than one year, just make another request. &lt;/div&gt; 
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>500</b> - Unexpected Error
     * @param invoicesRequest  (required)
     * @return ResponseEntity&lt;List&lt;InvoiceWithId&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<InvoiceWithId>> retrieveInvoicesWithHttpInfo(InvoicesRequest invoicesRequest) throws RestClientException {
        Object localVarPostBody = invoicesRequest;
        
        // verify the required parameter 'invoicesRequest' is set
        if (invoicesRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'invoicesRequest' when calling retrieveInvoices");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<List<InvoiceWithId>> localReturnType = new ParameterizedTypeReference<List<InvoiceWithId>>() {};
        return apiClient.invokeAPI("/api/invoices/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
