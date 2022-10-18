package com.vhbarros.belvo.client.invoker.auth.api;

import com.vhbarros.belvo.client.invoker.ApiClient;

import com.vhbarros.belvo.client.model.NotFoundError;
import com.vhbarros.belvo.client.model.PatchBody;
import com.vhbarros.belvo.client.model.RecurringExpenseFilters;
import com.vhbarros.belvo.client.model.RecurringExpenses;
import com.vhbarros.belvo.client.model.RecurringExpensesPaginatedResponse;
import com.vhbarros.belvo.client.model.RegisterLink400ResponseInner;
import com.vhbarros.belvo.client.model.RequestTimeoutError;
import com.vhbarros.belvo.client.model.RetrieveIncome400ResponseInner;
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
@Component("com.vhbarros.belvo.client.api.RecurringExpensesApi")
public class RecurringExpensesApi {
    private ApiClient apiClient;

    public RecurringExpensesApi() {
        this(new ApiClient());
    }

    @Autowired
    public RecurringExpensesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete a recurring expense
     * Delete a specific recurring expense from your Belvo account.
     * <p><b>204</b> - No content
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;recurring-expenses.id&#x60; that you want to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void destroyRecurringExpense(String id) throws RestClientException {
        destroyRecurringExpenseWithHttpInfo(id);
    }

    /**
     * Delete a recurring expense
     * Delete a specific recurring expense from your Belvo account.
     * <p><b>204</b> - No content
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;recurring-expenses.id&#x60; that you want to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> destroyRecurringExpenseWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling destroyRecurringExpense");
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
        return apiClient.invokeAPI("/api/recurring-expenses/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a recurring expense&#39;s details
     * Get the details of a specific recurring expense.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;recurring-expenses.id&#x60; you want to get detailed information about. (required)
     * @return List&lt;RecurringExpenses&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<RecurringExpenses> detailRecurringExpense(String id) throws RestClientException {
        return detailRecurringExpenseWithHttpInfo(id).getBody();
    }

    /**
     * Get a recurring expense&#39;s details
     * Get the details of a specific recurring expense.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>404</b> - Not Found
     * @param id The &#x60;recurring-expenses.id&#x60; you want to get detailed information about. (required)
     * @return ResponseEntity&lt;List&lt;RecurringExpenses&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<RecurringExpenses>> detailRecurringExpenseWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling detailRecurringExpense");
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

        ParameterizedTypeReference<List<RecurringExpenses>> localReturnType = new ParameterizedTypeReference<List<RecurringExpenses>>() {};
        return apiClient.invokeAPI("/api/recurring-expenses/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List all recurring expenses
     * Get a paginated list of all recurring expenses in your Belvo account. By default, we return up to 100 results per page.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
     * @param link The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance.  (optional)
     * @param account The &#x60;account.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance.  (optional)
     * @param filters List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. (optional)
     * @return RecurringExpensesPaginatedResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RecurringExpensesPaginatedResponse listRecurringExpenses(Integer page, Integer pageSize, UUID link, UUID account, RecurringExpenseFilters filters) throws RestClientException {
        return listRecurringExpensesWithHttpInfo(page, pageSize, link, account, filters).getBody();
    }

    /**
     * List all recurring expenses
     * Get a paginated list of all recurring expenses in your Belvo account. By default, we return up to 100 results per page.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Authentication to Belvo API failed
     * @param page A page number within the paginated result set. (optional)
     * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
     * @param link The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance.  (optional)
     * @param account The &#x60;account.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance.  (optional)
     * @param filters List of additional fields you can filter your responses by. For more information on how to use filters, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) article. ℹ️ **Note**: Although &#x60;filters&#x60; is an object, any filter you use is automatically serialized as a query string. (optional)
     * @return ResponseEntity&lt;RecurringExpensesPaginatedResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RecurringExpensesPaginatedResponse> listRecurringExpensesWithHttpInfo(Integer page, Integer pageSize, UUID link, UUID account, RecurringExpenseFilters filters) throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<RecurringExpensesPaginatedResponse> localReturnType = new ParameterizedTypeReference<RecurringExpensesPaginatedResponse>() {};
        return apiClient.invokeAPI("/api/recurring-expenses/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Complete a recurring expenses request
     * Used to resume an Recurring Expenses retrieve session that was paused because an MFA token was required by the institution.
     * <p><b>200</b> - Ok (when save_data&#x3D;false)
     * <p><b>201</b> - Created (when save_data&#x3D;true)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param patchBody  (required)
     * @return List&lt;RecurringExpenses&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<RecurringExpenses> patchRecurringExpenses(PatchBody patchBody) throws RestClientException {
        return patchRecurringExpensesWithHttpInfo(patchBody).getBody();
    }

    /**
     * Complete a recurring expenses request
     * Used to resume an Recurring Expenses retrieve session that was paused because an MFA token was required by the institution.
     * <p><b>200</b> - Ok (when save_data&#x3D;false)
     * <p><b>201</b> - Created (when save_data&#x3D;true)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param patchBody  (required)
     * @return ResponseEntity&lt;List&lt;RecurringExpenses&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<RecurringExpenses>> patchRecurringExpensesWithHttpInfo(PatchBody patchBody) throws RestClientException {
        Object localVarPostBody = patchBody;
        
        // verify the required parameter 'patchBody' is set
        if (patchBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patchBody' when calling patchRecurringExpenses");
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

        ParameterizedTypeReference<List<RecurringExpenses>> localReturnType = new ParameterizedTypeReference<List<RecurringExpenses>>() {};
        return apiClient.invokeAPI("/api/recurring-expenses/", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve recurring expenses for a link
     * Retrieve recurring expense insights for &lt;b&gt;checking and savings accounts&lt;/b&gt; from a specific link. You can receive insights for a period of up to 365 days, depending on the transaction history available for each [bank](https://developers.belvo.com/docs/institution).
     * <p><b>200</b> - Ok (when save_data&#x3D;false)
     * <p><b>201</b> - Created (when save_data&#x3D;true)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param standardRequest  (required)
     * @return List&lt;RecurringExpenses&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<RecurringExpenses> retrieveRecurringExpenses(StandardRequest standardRequest) throws RestClientException {
        return retrieveRecurringExpensesWithHttpInfo(standardRequest).getBody();
    }

    /**
     * Retrieve recurring expenses for a link
     * Retrieve recurring expense insights for &lt;b&gt;checking and savings accounts&lt;/b&gt; from a specific link. You can receive insights for a period of up to 365 days, depending on the transaction history available for each [bank](https://developers.belvo.com/docs/institution).
     * <p><b>200</b> - Ok (when save_data&#x3D;false)
     * <p><b>201</b> - Created (when save_data&#x3D;true)
     * <p><b>400</b> - Bad request error
     * <p><b>401</b> - Authentication to Belvo API failed
     * <p><b>408</b> - Request Timeout
     * <p><b>428</b> - MFA Token Required
     * <p><b>500</b> - Unexpected Error
     * @param standardRequest  (required)
     * @return ResponseEntity&lt;List&lt;RecurringExpenses&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<RecurringExpenses>> retrieveRecurringExpensesWithHttpInfo(StandardRequest standardRequest) throws RestClientException {
        Object localVarPostBody = standardRequest;
        
        // verify the required parameter 'standardRequest' is set
        if (standardRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'standardRequest' when calling retrieveRecurringExpenses");
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

        ParameterizedTypeReference<List<RecurringExpenses>> localReturnType = new ParameterizedTypeReference<List<RecurringExpenses>>() {};
        return apiClient.invokeAPI("/api/recurring-expenses/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
