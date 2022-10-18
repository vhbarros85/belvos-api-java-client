package com.vhbarros.belvo.client.invoker.auth.api;

import com.vhbarros.belvo.client.invoker.ApiClient;

import com.vhbarros.belvo.client.model.NotFoundError;
import com.vhbarros.belvo.client.model.RegisterLink400ResponseInner;
import com.vhbarros.belvo.client.model.RequestTimeoutError;
import com.vhbarros.belvo.client.model.TaxStatus;
import com.vhbarros.belvo.client.model.TaxStatusFilters;
import com.vhbarros.belvo.client.model.TaxStatusPaginatedResponse;
import com.vhbarros.belvo.client.model.TaxStatusRequest;
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
@Component("com.vhbarros.belvo.client.api.TaxStatusApi")
public class TaxStatusApi {
    private ApiClient apiClient;

    public TaxStatusApi() {
        this(new ApiClient());
    }

    @Autowired
    public TaxStatusApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete a tax status
     * Delete a specific tax status from your Belvo account.
     * <p><b>204</b> - No content
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id the &#x60;tax-status.id&#x60; that you want to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void destroyTaxStatus(UUID id) throws RestClientException {
        destroyTaxStatusWithHttpInfo(id);
    }

    /**
     * Delete a tax status
     * Delete a specific tax status from your Belvo account.
     * <p><b>204</b> - No content
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id the &#x60;tax-status.id&#x60; that you want to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> destroyTaxStatusWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling destroyTaxStatus");
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
        return apiClient.invokeAPI("/api/tax-status/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a tax status&#39;s details
     * Get the details of a specific tax status.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;tax-status.id&#x60; you want to get detailed information about. (required)
     * @return TaxStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaxStatus detailTaxStatus(UUID id) throws RestClientException {
        return detailTaxStatusWithHttpInfo(id).getBody();
    }

    /**
     * Get a tax status&#39;s details
     * Get the details of a specific tax status.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;tax-status.id&#x60; you want to get detailed information about. (required)
     * @return ResponseEntity&lt;TaxStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaxStatus> detailTaxStatusWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling detailTaxStatus");
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

        ParameterizedTypeReference<TaxStatus> localReturnType = new ParameterizedTypeReference<TaxStatus>() {};
        return apiClient.invokeAPI("/api/tax-status/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List all tax statuses
     * Get a paginated list of all existing tax status in your Belvo account. By default, we return up to 100 results per page.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
     * @param link The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;link.id&#x60; filter in order to improve your performance.  (optional)
     * @param filters List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. (optional)
     * @return TaxStatusPaginatedResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaxStatusPaginatedResponse listTaxStatus(Integer page, Integer pageSize, UUID link, TaxStatusFilters filters) throws RestClientException {
        return listTaxStatusWithHttpInfo(page, pageSize, link, filters).getBody();
    }

    /**
     * List all tax statuses
     * Get a paginated list of all existing tax status in your Belvo account. By default, we return up to 100 results per page.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
     * @param link The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;link.id&#x60; filter in order to improve your performance.  (optional)
     * @param filters List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. (optional)
     * @return ResponseEntity&lt;TaxStatusPaginatedResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaxStatusPaginatedResponse> listTaxStatusWithHttpInfo(Integer page, Integer pageSize, UUID link, TaxStatusFilters filters) throws RestClientException {
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

        ParameterizedTypeReference<TaxStatusPaginatedResponse> localReturnType = new ParameterizedTypeReference<TaxStatusPaginatedResponse>() {};
        return apiClient.invokeAPI("/api/tax-status/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve tax statuses for a link
     * Retrieve tax status information for a specific fiscal link.
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>500</b> - Unexpected Error
     * @param taxStatusRequest  (required)
     * @return TaxStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaxStatus retrieveTaxStatus(TaxStatusRequest taxStatusRequest) throws RestClientException {
        return retrieveTaxStatusWithHttpInfo(taxStatusRequest).getBody();
    }

    /**
     * Retrieve tax statuses for a link
     * Retrieve tax status information for a specific fiscal link.
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>500</b> - Unexpected Error
     * @param taxStatusRequest  (required)
     * @return ResponseEntity&lt;TaxStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaxStatus> retrieveTaxStatusWithHttpInfo(TaxStatusRequest taxStatusRequest) throws RestClientException {
        Object localVarPostBody = taxStatusRequest;
        
        // verify the required parameter 'taxStatusRequest' is set
        if (taxStatusRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taxStatusRequest' when calling retrieveTaxStatus");
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

        ParameterizedTypeReference<TaxStatus> localReturnType = new ParameterizedTypeReference<TaxStatus>() {};
        return apiClient.invokeAPI("/api/tax-status/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
