package com.vhbarros.belvo.client.invoker.auth.api;

import com.vhbarros.belvo.client.invoker.ApiClient;

import com.vhbarros.belvo.client.model.NotFoundError;
import com.vhbarros.belvo.client.model.PatchBody;
import com.vhbarros.belvo.client.model.RegisterLink400ResponseInner;
import com.vhbarros.belvo.client.model.RequestTimeoutError;
import com.vhbarros.belvo.client.model.TokenRequiredResponse;
import com.vhbarros.belvo.client.model.Transaction;
import com.vhbarros.belvo.client.model.TransactionFilters;
import com.vhbarros.belvo.client.model.TransactionsPaginatedResponse;
import com.vhbarros.belvo.client.model.TransactionsRequest;
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
@Component("com.vhbarros.belvo.client.api.TransactionsApi")
public class TransactionsApi {
    private ApiClient apiClient;

    public TransactionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public TransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete a transaction
     * Delete a specific transaction from your Belvo account.
     * <p><b>204</b> - No content
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;transaction.id&#x60; that you want to delete. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void destroyTransaction(UUID id) throws RestClientException {
        destroyTransactionWithHttpInfo(id);
    }

    /**
     * Delete a transaction
     * Delete a specific transaction from your Belvo account.
     * <p><b>204</b> - No content
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;transaction.id&#x60; that you want to delete. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> destroyTransactionWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling destroyTransaction");
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
        return apiClient.invokeAPI("/api/transactions/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a transaction&#39;s details
     * Get the details of a specific transaction.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;transaction.id&#x60; you want to get detailed information about. (required)
     * @return Transaction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Transaction detailTransaction(UUID id) throws RestClientException {
        return detailTransactionWithHttpInfo(id).getBody();
    }

    /**
     * Get a transaction&#39;s details
     * Get the details of a specific transaction.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;transaction.id&#x60; you want to get detailed information about. (required)
     * @return ResponseEntity&lt;Transaction&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Transaction> detailTransactionWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling detailTransaction");
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

        ParameterizedTypeReference<Transaction> localReturnType = new ParameterizedTypeReference<Transaction>() {};
        return apiClient.invokeAPI("/api/transactions/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List all transactions
     * Get a paginated list of all existing transactions in your Belvo account. By default, we return up to 100 results per page.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * @param link The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;account.id&#x60; filter as well in order to improve your performance.  (required)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.  ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
     * @param account The &#x60;account.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;account.id&#x60; filter in order to improve your performance.  (optional)
     * @param filters List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. (optional)
     * @return TransactionsPaginatedResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TransactionsPaginatedResponse listTransactions(UUID link, Integer page, Integer pageSize, UUID account, TransactionFilters filters) throws RestClientException {
        return listTransactionsWithHttpInfo(link, page, pageSize, account, filters).getBody();
    }

    /**
     * List all transactions
     * Get a paginated list of all existing transactions in your Belvo account. By default, we return up to 100 results per page.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * @param link The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;account.id&#x60; filter as well in order to improve your performance.  (required)
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.  ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
     * @param account The &#x60;account.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;account.id&#x60; filter in order to improve your performance.  (optional)
     * @param filters List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. (optional)
     * @return ResponseEntity&lt;TransactionsPaginatedResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TransactionsPaginatedResponse> listTransactionsWithHttpInfo(UUID link, Integer page, Integer pageSize, UUID account, TransactionFilters filters) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'link' is set
        if (link == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'link' when calling listTransactions");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "link", link));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "account", account));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filters", filters));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<TransactionsPaginatedResponse> localReturnType = new ParameterizedTypeReference<TransactionsPaginatedResponse>() {};
        return apiClient.invokeAPI("/api/transactions/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Complete a transactions request
     * Used to resume a Transaction retrieve session that was paused because an MFA token was required by the institution.
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param patchBody  (required)
     * @return List&lt;Transaction&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Transaction> patchTransactions(PatchBody patchBody) throws RestClientException {
        return patchTransactionsWithHttpInfo(patchBody).getBody();
    }

    /**
     * Complete a transactions request
     * Used to resume a Transaction retrieve session that was paused because an MFA token was required by the institution.
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param patchBody  (required)
     * @return ResponseEntity&lt;List&lt;Transaction&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Transaction>> patchTransactionsWithHttpInfo(PatchBody patchBody) throws RestClientException {
        Object localVarPostBody = patchBody;
        
        // verify the required parameter 'patchBody' is set
        if (patchBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patchBody' when calling patchTransactions");
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

        ParameterizedTypeReference<List<Transaction>> localReturnType = new ParameterizedTypeReference<List<Transaction>>() {};
        return apiClient.invokeAPI("/api/transactions/", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve transactions for a link
     * Retrieve transactions for one or more accounts from a specific link. &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Info: &lt;/strong&gt; When retrieving transactions, it is important to understand that the available transaction data ranges depend on each institution. &lt;br&gt;&lt;br&gt; If you try to access older information than what we can access, we will return all the data we can read within that date range. For example, if you request transactions for the last year and we can only access the last six months, we will return the information corresponding to these six months of data. &lt;/div&gt; 
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param transactionsRequest  (required)
     * @return List&lt;Transaction&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Transaction> retrieveTransactions(TransactionsRequest transactionsRequest) throws RestClientException {
        return retrieveTransactionsWithHttpInfo(transactionsRequest).getBody();
    }

    /**
     * Retrieve transactions for a link
     * Retrieve transactions for one or more accounts from a specific link. &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Info: &lt;/strong&gt; When retrieving transactions, it is important to understand that the available transaction data ranges depend on each institution. &lt;br&gt;&lt;br&gt; If you try to access older information than what we can access, we will return all the data we can read within that date range. For example, if you request transactions for the last year and we can only access the last six months, we will return the information corresponding to these six months of data. &lt;/div&gt; 
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param transactionsRequest  (required)
     * @return ResponseEntity&lt;List&lt;Transaction&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Transaction>> retrieveTransactionsWithHttpInfo(TransactionsRequest transactionsRequest) throws RestClientException {
        Object localVarPostBody = transactionsRequest;
        
        // verify the required parameter 'transactionsRequest' is set
        if (transactionsRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'transactionsRequest' when calling retrieveTransactions");
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

        ParameterizedTypeReference<List<Transaction>> localReturnType = new ParameterizedTypeReference<List<Transaction>>() {};
        return apiClient.invokeAPI("/api/transactions/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
