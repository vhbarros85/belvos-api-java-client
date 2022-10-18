package com.vhbarros.belvo.client.invoker.auth.api;

import com.vhbarros.belvo.client.invoker.ApiClient;

import com.vhbarros.belvo.client.model.NotFoundError;
import com.vhbarros.belvo.client.model.Owner;
import com.vhbarros.belvo.client.model.OwnerFilters;
import com.vhbarros.belvo.client.model.OwnersPaginatedResponse;
import com.vhbarros.belvo.client.model.PatchBody;
import com.vhbarros.belvo.client.model.RegisterLink400ResponseInner;
import com.vhbarros.belvo.client.model.RequestTimeoutError;
import com.vhbarros.belvo.client.model.StandardRequest;
import com.vhbarros.belvo.client.model.TokenRequiredResponse;
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
@Component("com.vhbarros.belvo.client.api.OwnersApi")
public class OwnersApi {
    private ApiClient apiClient;

    public OwnersApi() {
        this(new ApiClient());
    }

    @Autowired
    public OwnersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete an owner
     * Delete a specific owner from your Belvo account.
     * <p><b>204</b> - No content
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;owner.id&#x60; that you want to delete. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void destroyOwner(UUID id) throws RestClientException {
        destroyOwnerWithHttpInfo(id);
    }

    /**
     * Delete an owner
     * Delete a specific owner from your Belvo account.
     * <p><b>204</b> - No content
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;owner.id&#x60; that you want to delete. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> destroyOwnerWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling destroyOwner");
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
        return apiClient.invokeAPI("/api/owners/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get an owner&#39;s details
     * Get the details of a specific owner.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;owner.id&#x60; you want to get detailed information about. (required)
     * @return Owner
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Owner detailOwner(UUID id) throws RestClientException {
        return detailOwnerWithHttpInfo(id).getBody();
    }

    /**
     * Get an owner&#39;s details
     * Get the details of a specific owner.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;owner.id&#x60; you want to get detailed information about. (required)
     * @return ResponseEntity&lt;Owner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Owner> detailOwnerWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling detailOwner");
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

        ParameterizedTypeReference<Owner> localReturnType = new ParameterizedTypeReference<Owner>() {};
        return apiClient.invokeAPI("/api/owners/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List all owners
     * Get a paginated list of all existing owners in your Belvo account. We return up to 100 results per page.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
     * @param filters List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. (optional)
     * @return OwnersPaginatedResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OwnersPaginatedResponse listOwners(Integer page, Integer pageSize, OwnerFilters filters) throws RestClientException {
        return listOwnersWithHttpInfo(page, pageSize, filters).getBody();
    }

    /**
     * List all owners
     * Get a paginated list of all existing owners in your Belvo account. We return up to 100 results per page.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
     * @param filters List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. (optional)
     * @return ResponseEntity&lt;OwnersPaginatedResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OwnersPaginatedResponse> listOwnersWithHttpInfo(Integer page, Integer pageSize, OwnerFilters filters) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filters", filters));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<OwnersPaginatedResponse> localReturnType = new ParameterizedTypeReference<OwnersPaginatedResponse>() {};
        return apiClient.invokeAPI("/api/owners/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Complete an owners request
     * Used to resume an Owner retrieve session that was paused because an MFA token was required by the institution.
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param patchBody  (required)
     * @return List&lt;Owner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Owner> patchOwners(PatchBody patchBody) throws RestClientException {
        return patchOwnersWithHttpInfo(patchBody).getBody();
    }

    /**
     * Complete an owners request
     * Used to resume an Owner retrieve session that was paused because an MFA token was required by the institution.
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param patchBody  (required)
     * @return ResponseEntity&lt;List&lt;Owner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Owner>> patchOwnersWithHttpInfo(PatchBody patchBody) throws RestClientException {
        Object localVarPostBody = patchBody;
        
        // verify the required parameter 'patchBody' is set
        if (patchBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patchBody' when calling patchOwners");
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

        ParameterizedTypeReference<List<Owner>> localReturnType = new ParameterizedTypeReference<List<Owner>>() {};
        return apiClient.invokeAPI("/api/owners/", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve owners for a link
     * Retrieve owner information from a specific link.
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param standardRequest  (required)
     * @return List&lt;Owner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Owner> retrieveOwners(StandardRequest standardRequest) throws RestClientException {
        return retrieveOwnersWithHttpInfo(standardRequest).getBody();
    }

    /**
     * Retrieve owners for a link
     * Retrieve owner information from a specific link.
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param standardRequest  (required)
     * @return ResponseEntity&lt;List&lt;Owner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Owner>> retrieveOwnersWithHttpInfo(StandardRequest standardRequest) throws RestClientException {
        Object localVarPostBody = standardRequest;
        
        // verify the required parameter 'standardRequest' is set
        if (standardRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'standardRequest' when calling retrieveOwners");
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

        ParameterizedTypeReference<List<Owner>> localReturnType = new ParameterizedTypeReference<List<Owner>>() {};
        return apiClient.invokeAPI("/api/owners/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
