package com.vhbarros.belvo.client.invoker.auth.api;

import com.vhbarros.belvo.client.invoker.ApiClient;

import com.vhbarros.belvo.client.model.InstrumentTransactionRequest;
import com.vhbarros.belvo.client.model.InvestmentTransactionFilters;
import com.vhbarros.belvo.client.model.InvestmentsInstrumentTransaction;
import com.vhbarros.belvo.client.model.InvestmentsTransactionsPaginatedResponse;
import com.vhbarros.belvo.client.model.NotFoundError;
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
@Component("com.vhbarros.belvo.client.api.InvestmentTransactionsBetaApi")
public class InvestmentTransactionsBetaApi {
    private ApiClient apiClient;

    public InvestmentTransactionsBetaApi() {
        this(new ApiClient());
    }

    @Autowired
    public InvestmentTransactionsBetaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete an investment transaction
     * Delete a specific instrument transaction from your Belvo account.
     * <p><b>204</b> - No content
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;transaction.id&#x60; that you want to delete. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void destroyInvestmentTransaction(UUID id) throws RestClientException {
        destroyInvestmentTransactionWithHttpInfo(id);
    }

    /**
     * Delete an investment transaction
     * Delete a specific instrument transaction from your Belvo account.
     * <p><b>204</b> - No content
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;transaction.id&#x60; that you want to delete. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> destroyInvestmentTransactionWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling destroyInvestmentTransaction");
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
        return apiClient.invokeAPI("/investments/transactions/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get an investment transaction&#39;s details
     * Get the details of a specific instrument&#39;s transaction.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;transaction.id&#x60; you want to get detailed information about. (required)
     * @return InvestmentsInstrumentTransaction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvestmentsInstrumentTransaction detailInvestmentTransaction(UUID id) throws RestClientException {
        return detailInvestmentTransactionWithHttpInfo(id).getBody();
    }

    /**
     * Get an investment transaction&#39;s details
     * Get the details of a specific instrument&#39;s transaction.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;transaction.id&#x60; you want to get detailed information about. (required)
     * @return ResponseEntity&lt;InvestmentsInstrumentTransaction&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvestmentsInstrumentTransaction> detailInvestmentTransactionWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling detailInvestmentTransaction");
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

        ParameterizedTypeReference<InvestmentsInstrumentTransaction> localReturnType = new ParameterizedTypeReference<InvestmentsInstrumentTransaction>() {};
        return apiClient.invokeAPI("/investments/transactions/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List all investment transactions
     * Get a paginated list of all the existing transactions for an instrument in your Belvo account. By default, we return up to 100 results per page.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
     * @param link The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;portfolio.id&#x60; filters in order to improve your performance.  (optional)
     * @param portfolio The &#x60;portfolio.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;portfolio.id&#x60; filters in order to improve your performance.  (optional)
     * @param filters List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. (optional)
     * @return InvestmentsTransactionsPaginatedResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvestmentsTransactionsPaginatedResponse listInvestmentTransactions(Integer page, Integer pageSize, UUID link, UUID portfolio, InvestmentTransactionFilters filters) throws RestClientException {
        return listInvestmentTransactionsWithHttpInfo(page, pageSize, link, portfolio, filters).getBody();
    }

    /**
     * List all investment transactions
     * Get a paginated list of all the existing transactions for an instrument in your Belvo account. By default, we return up to 100 results per page.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
     * @param link The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;portfolio.id&#x60; filters in order to improve your performance.  (optional)
     * @param portfolio The &#x60;portfolio.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;portfolio.id&#x60; filters in order to improve your performance.  (optional)
     * @param filters List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. (optional)
     * @return ResponseEntity&lt;InvestmentsTransactionsPaginatedResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvestmentsTransactionsPaginatedResponse> listInvestmentTransactionsWithHttpInfo(Integer page, Integer pageSize, UUID link, UUID portfolio, InvestmentTransactionFilters filters) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "link", link));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "portfolio", portfolio));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filters", filters));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<InvestmentsTransactionsPaginatedResponse> localReturnType = new ParameterizedTypeReference<InvestmentsTransactionsPaginatedResponse>() {};
        return apiClient.invokeAPI("/investments/transactions/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Complete a investment transactions request
     * Used to resume a Investment retrieve session that was paused because an MFA token was required by the institution.
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param patchBodyWithoutSaveData  (required)
     * @return InvestmentsInstrumentTransaction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvestmentsInstrumentTransaction patchInvestmentsTransactions(PatchBodyWithoutSaveData patchBodyWithoutSaveData) throws RestClientException {
        return patchInvestmentsTransactionsWithHttpInfo(patchBodyWithoutSaveData).getBody();
    }

    /**
     * Complete a investment transactions request
     * Used to resume a Investment retrieve session that was paused because an MFA token was required by the institution.
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param patchBodyWithoutSaveData  (required)
     * @return ResponseEntity&lt;InvestmentsInstrumentTransaction&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvestmentsInstrumentTransaction> patchInvestmentsTransactionsWithHttpInfo(PatchBodyWithoutSaveData patchBodyWithoutSaveData) throws RestClientException {
        Object localVarPostBody = patchBodyWithoutSaveData;
        
        // verify the required parameter 'patchBodyWithoutSaveData' is set
        if (patchBodyWithoutSaveData == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patchBodyWithoutSaveData' when calling patchInvestmentsTransactions");
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

        ParameterizedTypeReference<InvestmentsInstrumentTransaction> localReturnType = new ParameterizedTypeReference<InvestmentsInstrumentTransaction>() {};
        return apiClient.invokeAPI("/investments/transactions/", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve investment transactions for a link
     * Retrieve all instrument transactions for an existing link.
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param instrumentTransactionRequest  (required)
     * @return InvestmentsInstrumentTransaction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvestmentsInstrumentTransaction retrieveInstrumentTransaction(InstrumentTransactionRequest instrumentTransactionRequest) throws RestClientException {
        return retrieveInstrumentTransactionWithHttpInfo(instrumentTransactionRequest).getBody();
    }

    /**
     * Retrieve investment transactions for a link
     * Retrieve all instrument transactions for an existing link.
     * <p><b>200</b> - Ok (when &#x60;save_data&#x3D;false&#x60;)
     * <p><b>201</b> - Created (when &#x60;save_data&#x3D;true&#x60;)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param instrumentTransactionRequest  (required)
     * @return ResponseEntity&lt;InvestmentsInstrumentTransaction&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvestmentsInstrumentTransaction> retrieveInstrumentTransactionWithHttpInfo(InstrumentTransactionRequest instrumentTransactionRequest) throws RestClientException {
        Object localVarPostBody = instrumentTransactionRequest;
        
        // verify the required parameter 'instrumentTransactionRequest' is set
        if (instrumentTransactionRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'instrumentTransactionRequest' when calling retrieveInstrumentTransaction");
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

        ParameterizedTypeReference<InvestmentsInstrumentTransaction> localReturnType = new ParameterizedTypeReference<InvestmentsInstrumentTransaction>() {};
        return apiClient.invokeAPI("/investments/transactions/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
