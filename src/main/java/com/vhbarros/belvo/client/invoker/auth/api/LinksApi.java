package com.vhbarros.belvo.client.invoker.auth.api;

import com.vhbarros.belvo.client.invoker.ApiClient;

import com.vhbarros.belvo.client.model.Link;
import com.vhbarros.belvo.client.model.LinkFilters;
import com.vhbarros.belvo.client.model.LinksPutRequest;
import com.vhbarros.belvo.client.model.LinksRequest;
import com.vhbarros.belvo.client.model.NotFoundError;
import com.vhbarros.belvo.client.model.PaginatedResponseLink;
import com.vhbarros.belvo.client.model.PatchBodyWithoutSaveData;
import com.vhbarros.belvo.client.model.RegisterLink400ResponseInner;
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
@Component("com.vhbarros.belvo.client.api.LinksApi")
public class LinksApi {
    private ApiClient apiClient;

    public LinksApi() {
        this(new ApiClient());
    }

    @Autowired
    public LinksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete a link
     * Delete a specific link and all associated accounts, transactions, and owners from your Belvo account.
     * <p><b>204</b> - No content
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;link.id&#x60; that you want to delete. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void destroyLink(UUID id) throws RestClientException {
        destroyLinkWithHttpInfo(id);
    }

    /**
     * Delete a link
     * Delete a specific link and all associated accounts, transactions, and owners from your Belvo account.
     * <p><b>204</b> - No content
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;link.id&#x60; that you want to delete. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> destroyLinkWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling destroyLink");
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
        return apiClient.invokeAPI("/api/links/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a link&#39;s details
     * Get the details of a specific link.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;link.id&#x60; you want to get detailed information about. (required)
     * @return Link
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Link detailLink(UUID id) throws RestClientException {
        return detailLinkWithHttpInfo(id).getBody();
    }

    /**
     * Get a link&#39;s details
     * Get the details of a specific link.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;link.id&#x60; you want to get detailed information about. (required)
     * @return ResponseEntity&lt;Link&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Link> detailLinkWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling detailLink");
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

        ParameterizedTypeReference<Link> localReturnType = new ParameterizedTypeReference<Link>() {};
        return apiClient.invokeAPI("/api/links/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List all links
     * Get a paginated list of all the existing links in your Belvo account. By default, we return up to 100 results per page.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
     * @param filters List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. (optional)
     * @return PaginatedResponseLink
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedResponseLink listLinks(Integer page, Integer pageSize, LinkFilters filters) throws RestClientException {
        return listLinksWithHttpInfo(page, pageSize, filters).getBody();
    }

    /**
     * List all links
     * Get a paginated list of all the existing links in your Belvo account. By default, we return up to 100 results per page.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
     * @param filters List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. (optional)
     * @return ResponseEntity&lt;PaginatedResponseLink&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaginatedResponseLink> listLinksWithHttpInfo(Integer page, Integer pageSize, LinkFilters filters) throws RestClientException {
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

        ParameterizedTypeReference<PaginatedResponseLink> localReturnType = new ParameterizedTypeReference<PaginatedResponseLink>() {};
        return apiClient.invokeAPI("/api/links/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Complete a links request
     * Used to resume a Link register session that was paused because an MFA token was required by the institution.
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param patchBodyWithoutSaveData  (required)
     * @return Link
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Link patchLinks(PatchBodyWithoutSaveData patchBodyWithoutSaveData) throws RestClientException {
        return patchLinksWithHttpInfo(patchBodyWithoutSaveData).getBody();
    }

    /**
     * Complete a links request
     * Used to resume a Link register session that was paused because an MFA token was required by the institution.
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param patchBodyWithoutSaveData  (required)
     * @return ResponseEntity&lt;Link&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Link> patchLinksWithHttpInfo(PatchBodyWithoutSaveData patchBodyWithoutSaveData) throws RestClientException {
        Object localVarPostBody = patchBodyWithoutSaveData;
        
        // verify the required parameter 'patchBodyWithoutSaveData' is set
        if (patchBodyWithoutSaveData == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patchBodyWithoutSaveData' when calling patchLinks");
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

        ParameterizedTypeReference<Link> localReturnType = new ParameterizedTypeReference<Link>() {};
        return apiClient.invokeAPI("/api/links/", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Register a new link
     * Register a new link with your Belvo account.  &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Note: &lt;/strong&gt; We recommend using our &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/connect-widget\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Connect Widget&lt;/a&gt; to handle link creation and link status updates. &lt;/div&gt; 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param linksRequest  (required)
     * @return Link
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Link registerLink(LinksRequest linksRequest) throws RestClientException {
        return registerLinkWithHttpInfo(linksRequest).getBody();
    }

    /**
     * Register a new link
     * Register a new link with your Belvo account.  &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Note: &lt;/strong&gt; We recommend using our &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/connect-widget\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Connect Widget&lt;/a&gt; to handle link creation and link status updates. &lt;/div&gt; 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param linksRequest  (required)
     * @return ResponseEntity&lt;Link&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Link> registerLinkWithHttpInfo(LinksRequest linksRequest) throws RestClientException {
        Object localVarPostBody = linksRequest;
        
        // verify the required parameter 'linksRequest' is set
        if (linksRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'linksRequest' when calling registerLink");
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

        ParameterizedTypeReference<Link> localReturnType = new ParameterizedTypeReference<Link>() {};
        return apiClient.invokeAPI("/api/links/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a link&#39;s credentials
     * Update the credentials of a specific link. If the successfully updated link is a recurrent one, we automatically trigger an update of the link. If we find fresh data, you&#39;ll [receive historical update](https://developers.belvo.com/docs/webhooks) webhooks. &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Note: &lt;/strong&gt; We recommend using our &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/connect-widget\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Connect Widget&lt;/a&gt; to handle updating &lt;code&gt;invalid&lt;/code&gt; or &lt;code&gt;token_required&lt;/code&gt; links. &lt;/div&gt; 
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param id The &#x60;link.id&#x60; you want to update. (required)
     * @param linksPutRequest  (required)
     * @return Link
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Link updateLink(UUID id, LinksPutRequest linksPutRequest) throws RestClientException {
        return updateLinkWithHttpInfo(id, linksPutRequest).getBody();
    }

    /**
     * Update a link&#39;s credentials
     * Update the credentials of a specific link. If the successfully updated link is a recurrent one, we automatically trigger an update of the link. If we find fresh data, you&#39;ll [receive historical update](https://developers.belvo.com/docs/webhooks) webhooks. &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Note: &lt;/strong&gt; We recommend using our &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/connect-widget\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Connect Widget&lt;/a&gt; to handle updating &lt;code&gt;invalid&lt;/code&gt; or &lt;code&gt;token_required&lt;/code&gt; links. &lt;/div&gt; 
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param id The &#x60;link.id&#x60; you want to update. (required)
     * @param linksPutRequest  (required)
     * @return ResponseEntity&lt;Link&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Link> updateLinkWithHttpInfo(UUID id, LinksPutRequest linksPutRequest) throws RestClientException {
        Object localVarPostBody = linksPutRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateLink");
        }
        
        // verify the required parameter 'linksPutRequest' is set
        if (linksPutRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'linksPutRequest' when calling updateLink");
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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Link> localReturnType = new ParameterizedTypeReference<Link>() {};
        return apiClient.invokeAPI("/api/links/{id}/", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
