/*
 * Belvo API Docs
 * # Introduction  Belvo is an open banking API for Latin America that allows companies to access banking and fiscal information in a secure as well as agile way.  Through our API, you can access:   - **Bank and Gig information** such as account information, real-time balance, historical transactions, and account owner identification.  - **Fiscal information** such as received and sent invoices and tax returns.   <img src=\"https://files.readme.io/acf27d3-belvo_pipes.png\" alt=\"fiscal-endpoints\">   In this API reference you'll find all the information you need about each  endpoint and resource.   <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\">  <strong>Tip: </strong> Make sure that you also check out our Developer Portal for guides on <a href=\"https://developers.belvo.com/docs/get-started-in-5-minutes\" target=\"_blank\">how to get started</a>, using our <a href=\"https://developers.belvo.com/docs/test-in-sandbox\" target=\"_blank\">Sandbox environment</a>, as well as how to <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">integrate the widget</a> or use our <a href=\"https://developers.belvo.com/docs/quickstart-application\" target=\"_blank\">quickstart application</a>.  </div>   ## Environment  We currently offer three environments: sandbox, development, and production.   When using our SDKs, make sure to use the **Alias** (and not the Base URL).   | Environment | Purpose | Access | |-----------|-------|-------| | **Sandbox** | The [Sandbox environment](https://developers.belvo.com/docs/test-in-sandbox) is dedicated for your testing and development phases. In this environment, you can create links without real credentials and you can pull test data from all endpoints. **⚠️The sandbox environment is refreshed frequently and your test data can be updated or deleted.** | Base URL (cURL): https://sandbox.belvo.com/ <br><br>Alias (SDKs): sandbox| |**Development**|The Development environment is dedicated for testing with real credentials and institutions with real-world institutions. You can create up to 25 links for free in this environment.| Base URL (cURL): https://development.belvo.com/ <br><br>Alias (SDKs): development | | **Production** | The Production environment is dedicated for live applications with real connections to institutions. In this environment, you will need real credentials to create links and you will pull real data from the institutions.| Base URL (cURL): https://api.belvo.com/ <br><br>Alias (SDKs): production|   For each environment, you'll need to [generate separate API keys](https://developers.belvo.com/docs/get-your-belvo-api-keys).   ## Response codes   We use the following HTTP status code in the response depending on the success or failure:   | Status Code | Description | |-----------|-------| | `200` | ✅ **Success** - The content is available in the response body. | | `201` | ✅ **Success** - The content was created successfully on Belvo. | | `204` | ✅ **Success** - No content to return. | | `400` | ❌ **Bad Request Error** - Request returned an error, detail in content.| | `401` | ❌ **Unauthorized** - The Belvo credentials provided are not valid.| | `404` | ❌ **Not Found** - The resource you try to access cannot be found.| | `405` | ❌ **Method Not Allowed** - The HTTP method you are using is not accepted for this resource.| | `408` | ❌ **Request Timeout** - The request timed out and was terminated by the server.| | `428` | ❌ **MFA Token Required** - MFA token was required by the institution to connect. | | `500` | ❌ **Internal Server Error** - The detail of the error is available in the response body.|   ## Error handling   ### Error messages   Belvo API errors are returned in JSON format. For example, an error might look like this:   ```json  [     {       \"request_id\": \"a6e1c493d7a29d91aed4338e6fcf077d\",       \"message\": \"This field is required.\",       \"code\": \"required\",       \"field\": \"link\"     } ]  ```   Typically, an error response will have the following parameters:  - `request_id`: a unique ID for the request, you should share it with the Belvo support team for investigations.  - `message`: human-readable description of the error.  - `code`: a unique code for the error. Check the table below to see how to handle each error code.  - `field` *(optional)*: The specific field in the request body that has an issue.    ### Request identifier  When you need help with a specific error, add the request identifier (`request_id`) in your message to the Belvo support team. This will speed up investigations and get you back up and running in no time at all.   ### Error codes and troubleshooting   For a full list of errors and how to troubleshoot them, please see our dedicated [Error handling articles](https://developers.belvo.com/docs/integration-overview#error-handling) in our DevPortal.    ### Retry policy   Please see our recommended [retry policies](https://developers.belvo.com/docs/integration-overview#error-retry-policy) in the DevPortal. 
 *
 * The version of the OpenAPI document: 1.20.1
 * Contact: support@belvo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.vhbarros.belvo.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for TransactionFilters
 */
public class TransactionFiltersTest {
    private final TransactionFilters model = new TransactionFilters();

    /**
     * Model tests for TransactionFilters
     */
    @Test
    public void testTransactionFilters() {
        // TODO: test TransactionFilters
    }

    /**
     * Test the property 'account'
     */
    @Test
    public void accountTest() {
        // TODO: test account
    }

    /**
     * Test the property 'accountIn'
     */
    @Test
    public void accountInTest() {
        // TODO: test accountIn
    }

    /**
     * Test the property 'accountBalanceAvailable'
     */
    @Test
    public void accountBalanceAvailableTest() {
        // TODO: test accountBalanceAvailable
    }

    /**
     * Test the property 'accountBalanceAvailableLt'
     */
    @Test
    public void accountBalanceAvailableLtTest() {
        // TODO: test accountBalanceAvailableLt
    }

    /**
     * Test the property 'accountBalanceAvailableLte'
     */
    @Test
    public void accountBalanceAvailableLteTest() {
        // TODO: test accountBalanceAvailableLte
    }

    /**
     * Test the property 'accountBalanceAvailableRange'
     */
    @Test
    public void accountBalanceAvailableRangeTest() {
        // TODO: test accountBalanceAvailableRange
    }

    /**
     * Test the property 'accountBalanceCurrent'
     */
    @Test
    public void accountBalanceCurrentTest() {
        // TODO: test accountBalanceCurrent
    }

    /**
     * Test the property 'accountBalanceCurrentLt'
     */
    @Test
    public void accountBalanceCurrentLtTest() {
        // TODO: test accountBalanceCurrentLt
    }

    /**
     * Test the property 'accountBalanceCurrentLte'
     */
    @Test
    public void accountBalanceCurrentLteTest() {
        // TODO: test accountBalanceCurrentLte
    }

    /**
     * Test the property 'accountBalanceCurrentGt'
     */
    @Test
    public void accountBalanceCurrentGtTest() {
        // TODO: test accountBalanceCurrentGt
    }

    /**
     * Test the property 'accountBalanceCurrentGte'
     */
    @Test
    public void accountBalanceCurrentGteTest() {
        // TODO: test accountBalanceCurrentGte
    }

    /**
     * Test the property 'accountBalanceCurrentRange'
     */
    @Test
    public void accountBalanceCurrentRangeTest() {
        // TODO: test accountBalanceCurrentRange
    }

    /**
     * Test the property 'accountType'
     */
    @Test
    public void accountTypeTest() {
        // TODO: test accountType
    }

    /**
     * Test the property 'accountTypeIn'
     */
    @Test
    public void accountTypeInTest() {
        // TODO: test accountTypeIn
    }

    /**
     * Test the property 'collectedAt'
     */
    @Test
    public void collectedAtTest() {
        // TODO: test collectedAt
    }

    /**
     * Test the property 'collectedAtGt'
     */
    @Test
    public void collectedAtGtTest() {
        // TODO: test collectedAtGt
    }

    /**
     * Test the property 'collectedAtLt'
     */
    @Test
    public void collectedAtLtTest() {
        // TODO: test collectedAtLt
    }

    /**
     * Test the property 'collectedAtGte'
     */
    @Test
    public void collectedAtGteTest() {
        // TODO: test collectedAtGte
    }

    /**
     * Test the property 'collectedAtLte'
     */
    @Test
    public void collectedAtLteTest() {
        // TODO: test collectedAtLte
    }

    /**
     * Test the property 'collectedAtRange'
     */
    @Test
    public void collectedAtRangeTest() {
        // TODO: test collectedAtRange
    }

    /**
     * Test the property 'accountingDate'
     */
    @Test
    public void accountingDateTest() {
        // TODO: test accountingDate
    }

    /**
     * Test the property 'accountingDateGt'
     */
    @Test
    public void accountingDateGtTest() {
        // TODO: test accountingDateGt
    }

    /**
     * Test the property 'accountingDateLt'
     */
    @Test
    public void accountingDateLtTest() {
        // TODO: test accountingDateLt
    }

    /**
     * Test the property 'accountingDateGte'
     */
    @Test
    public void accountingDateGteTest() {
        // TODO: test accountingDateGte
    }

    /**
     * Test the property 'accountingDateLte'
     */
    @Test
    public void accountingDateLteTest() {
        // TODO: test accountingDateLte
    }

    /**
     * Test the property 'accountingDateRange'
     */
    @Test
    public void accountingDateRangeTest() {
        // TODO: test accountingDateRange
    }

    /**
     * Test the property 'valueDate'
     */
    @Test
    public void valueDateTest() {
        // TODO: test valueDate
    }

    /**
     * Test the property 'valueDateGt'
     */
    @Test
    public void valueDateGtTest() {
        // TODO: test valueDateGt
    }

    /**
     * Test the property 'valueDateLt'
     */
    @Test
    public void valueDateLtTest() {
        // TODO: test valueDateLt
    }

    /**
     * Test the property 'valueDateGte'
     */
    @Test
    public void valueDateGteTest() {
        // TODO: test valueDateGte
    }

    /**
     * Test the property 'valueDateLte'
     */
    @Test
    public void valueDateLteTest() {
        // TODO: test valueDateLte
    }

    /**
     * Test the property 'valueDateRange'
     */
    @Test
    public void valueDateRangeTest() {
        // TODO: test valueDateRange
    }

    /**
     * Test the property 'amount'
     */
    @Test
    public void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'amountGt'
     */
    @Test
    public void amountGtTest() {
        // TODO: test amountGt
    }

    /**
     * Test the property 'amountGte'
     */
    @Test
    public void amountGteTest() {
        // TODO: test amountGte
    }

    /**
     * Test the property 'amountLt'
     */
    @Test
    public void amountLtTest() {
        // TODO: test amountLt
    }

    /**
     * Test the property 'amountLte'
     */
    @Test
    public void amountLteTest() {
        // TODO: test amountLte
    }

    /**
     * Test the property 'amountRange'
     */
    @Test
    public void amountRangeTest() {
        // TODO: test amountRange
    }

    /**
     * Test the property 'reference'
     */
    @Test
    public void referenceTest() {
        // TODO: test reference
    }

    /**
     * Test the property 'referenceIn'
     */
    @Test
    public void referenceInTest() {
        // TODO: test referenceIn
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'typeIn'
     */
    @Test
    public void typeInTest() {
        // TODO: test typeIn
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'statusIn'
     */
    @Test
    public void statusInTest() {
        // TODO: test statusIn
    }

    /**
     * Test the property 'currency'
     */
    @Test
    public void currencyTest() {
        // TODO: test currency
    }

    /**
     * Test the property 'currencyIn'
     */
    @Test
    public void currencyInTest() {
        // TODO: test currencyIn
    }

    /**
     * Test the property 'creditCardDataBillNameIn'
     */
    @Test
    public void creditCardDataBillNameInTest() {
        // TODO: test creditCardDataBillNameIn
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'createdAtGt'
     */
    @Test
    public void createdAtGtTest() {
        // TODO: test createdAtGt
    }

    /**
     * Test the property 'createdAtLt'
     */
    @Test
    public void createdAtLtTest() {
        // TODO: test createdAtLt
    }

    /**
     * Test the property 'createdAtGte'
     */
    @Test
    public void createdAtGteTest() {
        // TODO: test createdAtGte
    }

    /**
     * Test the property 'createdAtLte'
     */
    @Test
    public void createdAtLteTest() {
        // TODO: test createdAtLte
    }

    /**
     * Test the property 'createdAtRange'
     */
    @Test
    public void createdAtRangeTest() {
        // TODO: test createdAtRange
    }

}
