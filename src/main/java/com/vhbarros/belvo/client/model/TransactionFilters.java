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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TransactionFilters
 */
@JsonPropertyOrder({
  TransactionFilters.JSON_PROPERTY_ACCOUNT,
  TransactionFilters.JSON_PROPERTY_ACCOUNT_IN,
  TransactionFilters.JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE,
  TransactionFilters.JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE_LT,
  TransactionFilters.JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE_LTE,
  TransactionFilters.JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE_RANGE,
  TransactionFilters.JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT,
  TransactionFilters.JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_LT,
  TransactionFilters.JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_LTE,
  TransactionFilters.JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_GT,
  TransactionFilters.JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_GTE,
  TransactionFilters.JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_RANGE,
  TransactionFilters.JSON_PROPERTY_ACCOUNT_TYPE,
  TransactionFilters.JSON_PROPERTY_ACCOUNT_TYPE_IN,
  TransactionFilters.JSON_PROPERTY_COLLECTED_AT,
  TransactionFilters.JSON_PROPERTY_COLLECTED_AT_GT,
  TransactionFilters.JSON_PROPERTY_COLLECTED_AT_LT,
  TransactionFilters.JSON_PROPERTY_COLLECTED_AT_GTE,
  TransactionFilters.JSON_PROPERTY_COLLECTED_AT_LTE,
  TransactionFilters.JSON_PROPERTY_COLLECTED_AT_RANGE,
  TransactionFilters.JSON_PROPERTY_ACCOUNTING_DATE,
  TransactionFilters.JSON_PROPERTY_ACCOUNTING_DATE_GT,
  TransactionFilters.JSON_PROPERTY_ACCOUNTING_DATE_LT,
  TransactionFilters.JSON_PROPERTY_ACCOUNTING_DATE_GTE,
  TransactionFilters.JSON_PROPERTY_ACCOUNTING_DATE_LTE,
  TransactionFilters.JSON_PROPERTY_ACCOUNTING_DATE_RANGE,
  TransactionFilters.JSON_PROPERTY_VALUE_DATE,
  TransactionFilters.JSON_PROPERTY_VALUE_DATE_GT,
  TransactionFilters.JSON_PROPERTY_VALUE_DATE_LT,
  TransactionFilters.JSON_PROPERTY_VALUE_DATE_GTE,
  TransactionFilters.JSON_PROPERTY_VALUE_DATE_LTE,
  TransactionFilters.JSON_PROPERTY_VALUE_DATE_RANGE,
  TransactionFilters.JSON_PROPERTY_AMOUNT,
  TransactionFilters.JSON_PROPERTY_AMOUNT_GT,
  TransactionFilters.JSON_PROPERTY_AMOUNT_GTE,
  TransactionFilters.JSON_PROPERTY_AMOUNT_LT,
  TransactionFilters.JSON_PROPERTY_AMOUNT_LTE,
  TransactionFilters.JSON_PROPERTY_AMOUNT_RANGE,
  TransactionFilters.JSON_PROPERTY_REFERENCE,
  TransactionFilters.JSON_PROPERTY_REFERENCE_IN,
  TransactionFilters.JSON_PROPERTY_TYPE,
  TransactionFilters.JSON_PROPERTY_TYPE_IN,
  TransactionFilters.JSON_PROPERTY_STATUS,
  TransactionFilters.JSON_PROPERTY_STATUS_IN,
  TransactionFilters.JSON_PROPERTY_CURRENCY,
  TransactionFilters.JSON_PROPERTY_CURRENCY_IN,
  TransactionFilters.JSON_PROPERTY_CREDIT_CARD_DATA_BILL_NAME_IN,
  TransactionFilters.JSON_PROPERTY_CREATED_AT,
  TransactionFilters.JSON_PROPERTY_CREATED_AT_GT,
  TransactionFilters.JSON_PROPERTY_CREATED_AT_LT,
  TransactionFilters.JSON_PROPERTY_CREATED_AT_GTE,
  TransactionFilters.JSON_PROPERTY_CREATED_AT_LTE,
  TransactionFilters.JSON_PROPERTY_CREATED_AT_RANGE
})
@JsonTypeName("transactionFilters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class TransactionFilters {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private String account;

  public static final String JSON_PROPERTY_ACCOUNT_IN = "account__in";
  private String accountIn;

  public static final String JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE = "account__balance__available";
  private String accountBalanceAvailable;

  public static final String JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE_LT = "account__balance__available__lt";
  private String accountBalanceAvailableLt;

  public static final String JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE_LTE = "account__balance__available__lte";
  private String accountBalanceAvailableLte;

  public static final String JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE_RANGE = "account__balance__available__range";
  private String accountBalanceAvailableRange;

  public static final String JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT = "account__balance__current";
  private String accountBalanceCurrent;

  public static final String JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_LT = "account__balance__current__lt";
  private String accountBalanceCurrentLt;

  public static final String JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_LTE = "account__balance__current__lte";
  private String accountBalanceCurrentLte;

  public static final String JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_GT = "account__balance__current__gt";
  private String accountBalanceCurrentGt;

  public static final String JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_GTE = "account__balance__current__gte";
  private String accountBalanceCurrentGte;

  public static final String JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_RANGE = "account__balance__current__range";
  private String accountBalanceCurrentRange;

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "account_type";
  private String accountType;

  public static final String JSON_PROPERTY_ACCOUNT_TYPE_IN = "account_type__in";
  private String accountTypeIn;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private String collectedAt;

  public static final String JSON_PROPERTY_COLLECTED_AT_GT = "collected_at__gt";
  private String collectedAtGt;

  public static final String JSON_PROPERTY_COLLECTED_AT_LT = "collected_at__lt";
  private String collectedAtLt;

  public static final String JSON_PROPERTY_COLLECTED_AT_GTE = "collected_at__gte";
  private String collectedAtGte;

  public static final String JSON_PROPERTY_COLLECTED_AT_LTE = "collected_at__lte";
  private String collectedAtLte;

  public static final String JSON_PROPERTY_COLLECTED_AT_RANGE = "collected_at__range";
  private String collectedAtRange;

  public static final String JSON_PROPERTY_ACCOUNTING_DATE = "accounting_date";
  private String accountingDate;

  public static final String JSON_PROPERTY_ACCOUNTING_DATE_GT = "accounting_date__gt";
  private String accountingDateGt;

  public static final String JSON_PROPERTY_ACCOUNTING_DATE_LT = "accounting_date__lt";
  private String accountingDateLt;

  public static final String JSON_PROPERTY_ACCOUNTING_DATE_GTE = "accounting_date__gte";
  private String accountingDateGte;

  public static final String JSON_PROPERTY_ACCOUNTING_DATE_LTE = "accounting_date__lte";
  private String accountingDateLte;

  public static final String JSON_PROPERTY_ACCOUNTING_DATE_RANGE = "accounting_date__range";
  private String accountingDateRange;

  public static final String JSON_PROPERTY_VALUE_DATE = "value_date";
  private String valueDate;

  public static final String JSON_PROPERTY_VALUE_DATE_GT = "value_date__gt";
  private String valueDateGt;

  public static final String JSON_PROPERTY_VALUE_DATE_LT = "value_date__lt";
  private String valueDateLt;

  public static final String JSON_PROPERTY_VALUE_DATE_GTE = "value_date__gte";
  private String valueDateGte;

  public static final String JSON_PROPERTY_VALUE_DATE_LTE = "value_date__lte";
  private String valueDateLte;

  public static final String JSON_PROPERTY_VALUE_DATE_RANGE = "value_date__range";
  private String valueDateRange;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_AMOUNT_GT = "amount__gt";
  private String amountGt;

  public static final String JSON_PROPERTY_AMOUNT_GTE = "amount__gte";
  private String amountGte;

  public static final String JSON_PROPERTY_AMOUNT_LT = "amount__lt";
  private String amountLt;

  public static final String JSON_PROPERTY_AMOUNT_LTE = "amount__lte";
  private String amountLte;

  public static final String JSON_PROPERTY_AMOUNT_RANGE = "amount__range";
  private String amountRange;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_REFERENCE_IN = "reference__in";
  private String referenceIn;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_TYPE_IN = "type__in";
  private String typeIn;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STATUS_IN = "status__in";
  private String statusIn;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_CURRENCY_IN = "currency__in";
  private String currencyIn;

  public static final String JSON_PROPERTY_CREDIT_CARD_DATA_BILL_NAME_IN = "credit_card_data__bill_name__in";
  private String creditCardDataBillNameIn;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_CREATED_AT_GT = "created_at__gt";
  private String createdAtGt;

  public static final String JSON_PROPERTY_CREATED_AT_LT = "created_at__lt";
  private String createdAtLt;

  public static final String JSON_PROPERTY_CREATED_AT_GTE = "created_at__gte";
  private String createdAtGte;

  public static final String JSON_PROPERTY_CREATED_AT_LTE = "created_at__lte";
  private String createdAtLte;

  public static final String JSON_PROPERTY_CREATED_AT_RANGE = "created_at__range";
  private String createdAtRange;

  public TransactionFilters() {
  }

  public TransactionFilters account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccount(String account) {
    this.account = account;
  }


  public TransactionFilters accountIn(String accountIn) {
    
    this.accountIn = accountIn;
    return this;
  }

   /**
   * Get accountIn
   * @return accountIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountIn() {
    return accountIn;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountIn(String accountIn) {
    this.accountIn = accountIn;
  }


  public TransactionFilters accountBalanceAvailable(String accountBalanceAvailable) {
    
    this.accountBalanceAvailable = accountBalanceAvailable;
    return this;
  }

   /**
   * Get accountBalanceAvailable
   * @return accountBalanceAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountBalanceAvailable() {
    return accountBalanceAvailable;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountBalanceAvailable(String accountBalanceAvailable) {
    this.accountBalanceAvailable = accountBalanceAvailable;
  }


  public TransactionFilters accountBalanceAvailableLt(String accountBalanceAvailableLt) {
    
    this.accountBalanceAvailableLt = accountBalanceAvailableLt;
    return this;
  }

   /**
   * Get accountBalanceAvailableLt
   * @return accountBalanceAvailableLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountBalanceAvailableLt() {
    return accountBalanceAvailableLt;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountBalanceAvailableLt(String accountBalanceAvailableLt) {
    this.accountBalanceAvailableLt = accountBalanceAvailableLt;
  }


  public TransactionFilters accountBalanceAvailableLte(String accountBalanceAvailableLte) {
    
    this.accountBalanceAvailableLte = accountBalanceAvailableLte;
    return this;
  }

   /**
   * Get accountBalanceAvailableLte
   * @return accountBalanceAvailableLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountBalanceAvailableLte() {
    return accountBalanceAvailableLte;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountBalanceAvailableLte(String accountBalanceAvailableLte) {
    this.accountBalanceAvailableLte = accountBalanceAvailableLte;
  }


  public TransactionFilters accountBalanceAvailableRange(String accountBalanceAvailableRange) {
    
    this.accountBalanceAvailableRange = accountBalanceAvailableRange;
    return this;
  }

   /**
   * Get accountBalanceAvailableRange
   * @return accountBalanceAvailableRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountBalanceAvailableRange() {
    return accountBalanceAvailableRange;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_AVAILABLE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountBalanceAvailableRange(String accountBalanceAvailableRange) {
    this.accountBalanceAvailableRange = accountBalanceAvailableRange;
  }


  public TransactionFilters accountBalanceCurrent(String accountBalanceCurrent) {
    
    this.accountBalanceCurrent = accountBalanceCurrent;
    return this;
  }

   /**
   * Get accountBalanceCurrent
   * @return accountBalanceCurrent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountBalanceCurrent() {
    return accountBalanceCurrent;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountBalanceCurrent(String accountBalanceCurrent) {
    this.accountBalanceCurrent = accountBalanceCurrent;
  }


  public TransactionFilters accountBalanceCurrentLt(String accountBalanceCurrentLt) {
    
    this.accountBalanceCurrentLt = accountBalanceCurrentLt;
    return this;
  }

   /**
   * Get accountBalanceCurrentLt
   * @return accountBalanceCurrentLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountBalanceCurrentLt() {
    return accountBalanceCurrentLt;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountBalanceCurrentLt(String accountBalanceCurrentLt) {
    this.accountBalanceCurrentLt = accountBalanceCurrentLt;
  }


  public TransactionFilters accountBalanceCurrentLte(String accountBalanceCurrentLte) {
    
    this.accountBalanceCurrentLte = accountBalanceCurrentLte;
    return this;
  }

   /**
   * Get accountBalanceCurrentLte
   * @return accountBalanceCurrentLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountBalanceCurrentLte() {
    return accountBalanceCurrentLte;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountBalanceCurrentLte(String accountBalanceCurrentLte) {
    this.accountBalanceCurrentLte = accountBalanceCurrentLte;
  }


  public TransactionFilters accountBalanceCurrentGt(String accountBalanceCurrentGt) {
    
    this.accountBalanceCurrentGt = accountBalanceCurrentGt;
    return this;
  }

   /**
   * Get accountBalanceCurrentGt
   * @return accountBalanceCurrentGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountBalanceCurrentGt() {
    return accountBalanceCurrentGt;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountBalanceCurrentGt(String accountBalanceCurrentGt) {
    this.accountBalanceCurrentGt = accountBalanceCurrentGt;
  }


  public TransactionFilters accountBalanceCurrentGte(String accountBalanceCurrentGte) {
    
    this.accountBalanceCurrentGte = accountBalanceCurrentGte;
    return this;
  }

   /**
   * Get accountBalanceCurrentGte
   * @return accountBalanceCurrentGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountBalanceCurrentGte() {
    return accountBalanceCurrentGte;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountBalanceCurrentGte(String accountBalanceCurrentGte) {
    this.accountBalanceCurrentGte = accountBalanceCurrentGte;
  }


  public TransactionFilters accountBalanceCurrentRange(String accountBalanceCurrentRange) {
    
    this.accountBalanceCurrentRange = accountBalanceCurrentRange;
    return this;
  }

   /**
   * Get accountBalanceCurrentRange
   * @return accountBalanceCurrentRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountBalanceCurrentRange() {
    return accountBalanceCurrentRange;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_BALANCE_CURRENT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountBalanceCurrentRange(String accountBalanceCurrentRange) {
    this.accountBalanceCurrentRange = accountBalanceCurrentRange;
  }


  public TransactionFilters accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountType() {
    return accountType;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public TransactionFilters accountTypeIn(String accountTypeIn) {
    
    this.accountTypeIn = accountTypeIn;
    return this;
  }

   /**
   * Get accountTypeIn
   * @return accountTypeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountTypeIn() {
    return accountTypeIn;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountTypeIn(String accountTypeIn) {
    this.accountTypeIn = accountTypeIn;
  }


  public TransactionFilters collectedAt(String collectedAt) {
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * Get collectedAt
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLLECTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCollectedAt() {
    return collectedAt;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectedAt(String collectedAt) {
    this.collectedAt = collectedAt;
  }


  public TransactionFilters collectedAtGt(String collectedAtGt) {
    
    this.collectedAtGt = collectedAtGt;
    return this;
  }

   /**
   * Get collectedAtGt
   * @return collectedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLLECTED_AT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCollectedAtGt() {
    return collectedAtGt;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTED_AT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectedAtGt(String collectedAtGt) {
    this.collectedAtGt = collectedAtGt;
  }


  public TransactionFilters collectedAtLt(String collectedAtLt) {
    
    this.collectedAtLt = collectedAtLt;
    return this;
  }

   /**
   * Get collectedAtLt
   * @return collectedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLLECTED_AT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCollectedAtLt() {
    return collectedAtLt;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTED_AT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectedAtLt(String collectedAtLt) {
    this.collectedAtLt = collectedAtLt;
  }


  public TransactionFilters collectedAtGte(String collectedAtGte) {
    
    this.collectedAtGte = collectedAtGte;
    return this;
  }

   /**
   * Get collectedAtGte
   * @return collectedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLLECTED_AT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCollectedAtGte() {
    return collectedAtGte;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTED_AT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectedAtGte(String collectedAtGte) {
    this.collectedAtGte = collectedAtGte;
  }


  public TransactionFilters collectedAtLte(String collectedAtLte) {
    
    this.collectedAtLte = collectedAtLte;
    return this;
  }

   /**
   * Get collectedAtLte
   * @return collectedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLLECTED_AT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCollectedAtLte() {
    return collectedAtLte;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTED_AT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectedAtLte(String collectedAtLte) {
    this.collectedAtLte = collectedAtLte;
  }


  public TransactionFilters collectedAtRange(String collectedAtRange) {
    
    this.collectedAtRange = collectedAtRange;
    return this;
  }

   /**
   * Get collectedAtRange
   * @return collectedAtRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLLECTED_AT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCollectedAtRange() {
    return collectedAtRange;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTED_AT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectedAtRange(String collectedAtRange) {
    this.collectedAtRange = collectedAtRange;
  }


  public TransactionFilters accountingDate(String accountingDate) {
    
    this.accountingDate = accountingDate;
    return this;
  }

   /**
   * Get accountingDate
   * @return accountingDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNTING_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountingDate() {
    return accountingDate;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNTING_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountingDate(String accountingDate) {
    this.accountingDate = accountingDate;
  }


  public TransactionFilters accountingDateGt(String accountingDateGt) {
    
    this.accountingDateGt = accountingDateGt;
    return this;
  }

   /**
   * Get accountingDateGt
   * @return accountingDateGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNTING_DATE_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountingDateGt() {
    return accountingDateGt;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNTING_DATE_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountingDateGt(String accountingDateGt) {
    this.accountingDateGt = accountingDateGt;
  }


  public TransactionFilters accountingDateLt(String accountingDateLt) {
    
    this.accountingDateLt = accountingDateLt;
    return this;
  }

   /**
   * Get accountingDateLt
   * @return accountingDateLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNTING_DATE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountingDateLt() {
    return accountingDateLt;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNTING_DATE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountingDateLt(String accountingDateLt) {
    this.accountingDateLt = accountingDateLt;
  }


  public TransactionFilters accountingDateGte(String accountingDateGte) {
    
    this.accountingDateGte = accountingDateGte;
    return this;
  }

   /**
   * Get accountingDateGte
   * @return accountingDateGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNTING_DATE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountingDateGte() {
    return accountingDateGte;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNTING_DATE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountingDateGte(String accountingDateGte) {
    this.accountingDateGte = accountingDateGte;
  }


  public TransactionFilters accountingDateLte(String accountingDateLte) {
    
    this.accountingDateLte = accountingDateLte;
    return this;
  }

   /**
   * Get accountingDateLte
   * @return accountingDateLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNTING_DATE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountingDateLte() {
    return accountingDateLte;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNTING_DATE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountingDateLte(String accountingDateLte) {
    this.accountingDateLte = accountingDateLte;
  }


  public TransactionFilters accountingDateRange(String accountingDateRange) {
    
    this.accountingDateRange = accountingDateRange;
    return this;
  }

   /**
   * Get accountingDateRange
   * @return accountingDateRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNTING_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountingDateRange() {
    return accountingDateRange;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNTING_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountingDateRange(String accountingDateRange) {
    this.accountingDateRange = accountingDateRange;
  }


  public TransactionFilters valueDate(String valueDate) {
    
    this.valueDate = valueDate;
    return this;
  }

   /**
   * Get valueDate
   * @return valueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueDate() {
    return valueDate;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }


  public TransactionFilters valueDateGt(String valueDateGt) {
    
    this.valueDateGt = valueDateGt;
    return this;
  }

   /**
   * Get valueDateGt
   * @return valueDateGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueDateGt() {
    return valueDateGt;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_DATE_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueDateGt(String valueDateGt) {
    this.valueDateGt = valueDateGt;
  }


  public TransactionFilters valueDateLt(String valueDateLt) {
    
    this.valueDateLt = valueDateLt;
    return this;
  }

   /**
   * Get valueDateLt
   * @return valueDateLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueDateLt() {
    return valueDateLt;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_DATE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueDateLt(String valueDateLt) {
    this.valueDateLt = valueDateLt;
  }


  public TransactionFilters valueDateGte(String valueDateGte) {
    
    this.valueDateGte = valueDateGte;
    return this;
  }

   /**
   * Get valueDateGte
   * @return valueDateGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueDateGte() {
    return valueDateGte;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_DATE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueDateGte(String valueDateGte) {
    this.valueDateGte = valueDateGte;
  }


  public TransactionFilters valueDateLte(String valueDateLte) {
    
    this.valueDateLte = valueDateLte;
    return this;
  }

   /**
   * Get valueDateLte
   * @return valueDateLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueDateLte() {
    return valueDateLte;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_DATE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueDateLte(String valueDateLte) {
    this.valueDateLte = valueDateLte;
  }


  public TransactionFilters valueDateRange(String valueDateRange) {
    
    this.valueDateRange = valueDateRange;
    return this;
  }

   /**
   * Get valueDateRange
   * @return valueDateRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueDateRange() {
    return valueDateRange;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueDateRange(String valueDateRange) {
    this.valueDateRange = valueDateRange;
  }


  public TransactionFilters amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransactionFilters amountGt(String amountGt) {
    
    this.amountGt = amountGt;
    return this;
  }

   /**
   * Get amountGt
   * @return amountGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmountGt() {
    return amountGt;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountGt(String amountGt) {
    this.amountGt = amountGt;
  }


  public TransactionFilters amountGte(String amountGte) {
    
    this.amountGte = amountGte;
    return this;
  }

   /**
   * Get amountGte
   * @return amountGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmountGte() {
    return amountGte;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountGte(String amountGte) {
    this.amountGte = amountGte;
  }


  public TransactionFilters amountLt(String amountLt) {
    
    this.amountLt = amountLt;
    return this;
  }

   /**
   * Get amountLt
   * @return amountLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmountLt() {
    return amountLt;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountLt(String amountLt) {
    this.amountLt = amountLt;
  }


  public TransactionFilters amountLte(String amountLte) {
    
    this.amountLte = amountLte;
    return this;
  }

   /**
   * Get amountLte
   * @return amountLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmountLte() {
    return amountLte;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountLte(String amountLte) {
    this.amountLte = amountLte;
  }


  public TransactionFilters amountRange(String amountRange) {
    
    this.amountRange = amountRange;
    return this;
  }

   /**
   * Get amountRange
   * @return amountRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmountRange() {
    return amountRange;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountRange(String amountRange) {
    this.amountRange = amountRange;
  }


  public TransactionFilters reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public TransactionFilters referenceIn(String referenceIn) {
    
    this.referenceIn = referenceIn;
    return this;
  }

   /**
   * Get referenceIn
   * @return referenceIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFERENCE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferenceIn() {
    return referenceIn;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceIn(String referenceIn) {
    this.referenceIn = referenceIn;
  }


  public TransactionFilters type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public TransactionFilters typeIn(String typeIn) {
    
    this.typeIn = typeIn;
    return this;
  }

   /**
   * Get typeIn
   * @return typeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypeIn() {
    return typeIn;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeIn(String typeIn) {
    this.typeIn = typeIn;
  }


  public TransactionFilters status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public TransactionFilters statusIn(String statusIn) {
    
    this.statusIn = statusIn;
    return this;
  }

   /**
   * Get statusIn
   * @return statusIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatusIn() {
    return statusIn;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusIn(String statusIn) {
    this.statusIn = statusIn;
  }


  public TransactionFilters currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public TransactionFilters currencyIn(String currencyIn) {
    
    this.currencyIn = currencyIn;
    return this;
  }

   /**
   * Get currencyIn
   * @return currencyIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyIn() {
    return currencyIn;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyIn(String currencyIn) {
    this.currencyIn = currencyIn;
  }


  public TransactionFilters creditCardDataBillNameIn(String creditCardDataBillNameIn) {
    
    this.creditCardDataBillNameIn = creditCardDataBillNameIn;
    return this;
  }

   /**
   * Get creditCardDataBillNameIn
   * @return creditCardDataBillNameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREDIT_CARD_DATA_BILL_NAME_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreditCardDataBillNameIn() {
    return creditCardDataBillNameIn;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_CARD_DATA_BILL_NAME_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreditCardDataBillNameIn(String creditCardDataBillNameIn) {
    this.creditCardDataBillNameIn = creditCardDataBillNameIn;
  }


  public TransactionFilters createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public TransactionFilters createdAtGt(String createdAtGt) {
    
    this.createdAtGt = createdAtGt;
    return this;
  }

   /**
   * Get createdAtGt
   * @return createdAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAtGt() {
    return createdAtGt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtGt(String createdAtGt) {
    this.createdAtGt = createdAtGt;
  }


  public TransactionFilters createdAtLt(String createdAtLt) {
    
    this.createdAtLt = createdAtLt;
    return this;
  }

   /**
   * Get createdAtLt
   * @return createdAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAtLt() {
    return createdAtLt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtLt(String createdAtLt) {
    this.createdAtLt = createdAtLt;
  }


  public TransactionFilters createdAtGte(String createdAtGte) {
    
    this.createdAtGte = createdAtGte;
    return this;
  }

   /**
   * Get createdAtGte
   * @return createdAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAtGte() {
    return createdAtGte;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtGte(String createdAtGte) {
    this.createdAtGte = createdAtGte;
  }


  public TransactionFilters createdAtLte(String createdAtLte) {
    
    this.createdAtLte = createdAtLte;
    return this;
  }

   /**
   * Get createdAtLte
   * @return createdAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAtLte() {
    return createdAtLte;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtLte(String createdAtLte) {
    this.createdAtLte = createdAtLte;
  }


  public TransactionFilters createdAtRange(String createdAtRange) {
    
    this.createdAtRange = createdAtRange;
    return this;
  }

   /**
   * Get createdAtRange
   * @return createdAtRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAtRange() {
    return createdAtRange;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtRange(String createdAtRange) {
    this.createdAtRange = createdAtRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionFilters transactionFilters = (TransactionFilters) o;
    return Objects.equals(this.account, transactionFilters.account) &&
        Objects.equals(this.accountIn, transactionFilters.accountIn) &&
        Objects.equals(this.accountBalanceAvailable, transactionFilters.accountBalanceAvailable) &&
        Objects.equals(this.accountBalanceAvailableLt, transactionFilters.accountBalanceAvailableLt) &&
        Objects.equals(this.accountBalanceAvailableLte, transactionFilters.accountBalanceAvailableLte) &&
        Objects.equals(this.accountBalanceAvailableRange, transactionFilters.accountBalanceAvailableRange) &&
        Objects.equals(this.accountBalanceCurrent, transactionFilters.accountBalanceCurrent) &&
        Objects.equals(this.accountBalanceCurrentLt, transactionFilters.accountBalanceCurrentLt) &&
        Objects.equals(this.accountBalanceCurrentLte, transactionFilters.accountBalanceCurrentLte) &&
        Objects.equals(this.accountBalanceCurrentGt, transactionFilters.accountBalanceCurrentGt) &&
        Objects.equals(this.accountBalanceCurrentGte, transactionFilters.accountBalanceCurrentGte) &&
        Objects.equals(this.accountBalanceCurrentRange, transactionFilters.accountBalanceCurrentRange) &&
        Objects.equals(this.accountType, transactionFilters.accountType) &&
        Objects.equals(this.accountTypeIn, transactionFilters.accountTypeIn) &&
        Objects.equals(this.collectedAt, transactionFilters.collectedAt) &&
        Objects.equals(this.collectedAtGt, transactionFilters.collectedAtGt) &&
        Objects.equals(this.collectedAtLt, transactionFilters.collectedAtLt) &&
        Objects.equals(this.collectedAtGte, transactionFilters.collectedAtGte) &&
        Objects.equals(this.collectedAtLte, transactionFilters.collectedAtLte) &&
        Objects.equals(this.collectedAtRange, transactionFilters.collectedAtRange) &&
        Objects.equals(this.accountingDate, transactionFilters.accountingDate) &&
        Objects.equals(this.accountingDateGt, transactionFilters.accountingDateGt) &&
        Objects.equals(this.accountingDateLt, transactionFilters.accountingDateLt) &&
        Objects.equals(this.accountingDateGte, transactionFilters.accountingDateGte) &&
        Objects.equals(this.accountingDateLte, transactionFilters.accountingDateLte) &&
        Objects.equals(this.accountingDateRange, transactionFilters.accountingDateRange) &&
        Objects.equals(this.valueDate, transactionFilters.valueDate) &&
        Objects.equals(this.valueDateGt, transactionFilters.valueDateGt) &&
        Objects.equals(this.valueDateLt, transactionFilters.valueDateLt) &&
        Objects.equals(this.valueDateGte, transactionFilters.valueDateGte) &&
        Objects.equals(this.valueDateLte, transactionFilters.valueDateLte) &&
        Objects.equals(this.valueDateRange, transactionFilters.valueDateRange) &&
        Objects.equals(this.amount, transactionFilters.amount) &&
        Objects.equals(this.amountGt, transactionFilters.amountGt) &&
        Objects.equals(this.amountGte, transactionFilters.amountGte) &&
        Objects.equals(this.amountLt, transactionFilters.amountLt) &&
        Objects.equals(this.amountLte, transactionFilters.amountLte) &&
        Objects.equals(this.amountRange, transactionFilters.amountRange) &&
        Objects.equals(this.reference, transactionFilters.reference) &&
        Objects.equals(this.referenceIn, transactionFilters.referenceIn) &&
        Objects.equals(this.type, transactionFilters.type) &&
        Objects.equals(this.typeIn, transactionFilters.typeIn) &&
        Objects.equals(this.status, transactionFilters.status) &&
        Objects.equals(this.statusIn, transactionFilters.statusIn) &&
        Objects.equals(this.currency, transactionFilters.currency) &&
        Objects.equals(this.currencyIn, transactionFilters.currencyIn) &&
        Objects.equals(this.creditCardDataBillNameIn, transactionFilters.creditCardDataBillNameIn) &&
        Objects.equals(this.createdAt, transactionFilters.createdAt) &&
        Objects.equals(this.createdAtGt, transactionFilters.createdAtGt) &&
        Objects.equals(this.createdAtLt, transactionFilters.createdAtLt) &&
        Objects.equals(this.createdAtGte, transactionFilters.createdAtGte) &&
        Objects.equals(this.createdAtLte, transactionFilters.createdAtLte) &&
        Objects.equals(this.createdAtRange, transactionFilters.createdAtRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountIn, accountBalanceAvailable, accountBalanceAvailableLt, accountBalanceAvailableLte, accountBalanceAvailableRange, accountBalanceCurrent, accountBalanceCurrentLt, accountBalanceCurrentLte, accountBalanceCurrentGt, accountBalanceCurrentGte, accountBalanceCurrentRange, accountType, accountTypeIn, collectedAt, collectedAtGt, collectedAtLt, collectedAtGte, collectedAtLte, collectedAtRange, accountingDate, accountingDateGt, accountingDateLt, accountingDateGte, accountingDateLte, accountingDateRange, valueDate, valueDateGt, valueDateLt, valueDateGte, valueDateLte, valueDateRange, amount, amountGt, amountGte, amountLt, amountLte, amountRange, reference, referenceIn, type, typeIn, status, statusIn, currency, currencyIn, creditCardDataBillNameIn, createdAt, createdAtGt, createdAtLt, createdAtGte, createdAtLte, createdAtRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionFilters {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountIn: ").append(toIndentedString(accountIn)).append("\n");
    sb.append("    accountBalanceAvailable: ").append(toIndentedString(accountBalanceAvailable)).append("\n");
    sb.append("    accountBalanceAvailableLt: ").append(toIndentedString(accountBalanceAvailableLt)).append("\n");
    sb.append("    accountBalanceAvailableLte: ").append(toIndentedString(accountBalanceAvailableLte)).append("\n");
    sb.append("    accountBalanceAvailableRange: ").append(toIndentedString(accountBalanceAvailableRange)).append("\n");
    sb.append("    accountBalanceCurrent: ").append(toIndentedString(accountBalanceCurrent)).append("\n");
    sb.append("    accountBalanceCurrentLt: ").append(toIndentedString(accountBalanceCurrentLt)).append("\n");
    sb.append("    accountBalanceCurrentLte: ").append(toIndentedString(accountBalanceCurrentLte)).append("\n");
    sb.append("    accountBalanceCurrentGt: ").append(toIndentedString(accountBalanceCurrentGt)).append("\n");
    sb.append("    accountBalanceCurrentGte: ").append(toIndentedString(accountBalanceCurrentGte)).append("\n");
    sb.append("    accountBalanceCurrentRange: ").append(toIndentedString(accountBalanceCurrentRange)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountTypeIn: ").append(toIndentedString(accountTypeIn)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    collectedAtGt: ").append(toIndentedString(collectedAtGt)).append("\n");
    sb.append("    collectedAtLt: ").append(toIndentedString(collectedAtLt)).append("\n");
    sb.append("    collectedAtGte: ").append(toIndentedString(collectedAtGte)).append("\n");
    sb.append("    collectedAtLte: ").append(toIndentedString(collectedAtLte)).append("\n");
    sb.append("    collectedAtRange: ").append(toIndentedString(collectedAtRange)).append("\n");
    sb.append("    accountingDate: ").append(toIndentedString(accountingDate)).append("\n");
    sb.append("    accountingDateGt: ").append(toIndentedString(accountingDateGt)).append("\n");
    sb.append("    accountingDateLt: ").append(toIndentedString(accountingDateLt)).append("\n");
    sb.append("    accountingDateGte: ").append(toIndentedString(accountingDateGte)).append("\n");
    sb.append("    accountingDateLte: ").append(toIndentedString(accountingDateLte)).append("\n");
    sb.append("    accountingDateRange: ").append(toIndentedString(accountingDateRange)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    valueDateGt: ").append(toIndentedString(valueDateGt)).append("\n");
    sb.append("    valueDateLt: ").append(toIndentedString(valueDateLt)).append("\n");
    sb.append("    valueDateGte: ").append(toIndentedString(valueDateGte)).append("\n");
    sb.append("    valueDateLte: ").append(toIndentedString(valueDateLte)).append("\n");
    sb.append("    valueDateRange: ").append(toIndentedString(valueDateRange)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountGt: ").append(toIndentedString(amountGt)).append("\n");
    sb.append("    amountGte: ").append(toIndentedString(amountGte)).append("\n");
    sb.append("    amountLt: ").append(toIndentedString(amountLt)).append("\n");
    sb.append("    amountLte: ").append(toIndentedString(amountLte)).append("\n");
    sb.append("    amountRange: ").append(toIndentedString(amountRange)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    referenceIn: ").append(toIndentedString(referenceIn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currencyIn: ").append(toIndentedString(currencyIn)).append("\n");
    sb.append("    creditCardDataBillNameIn: ").append(toIndentedString(creditCardDataBillNameIn)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
    sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    createdAtRange: ").append(toIndentedString(createdAtRange)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

