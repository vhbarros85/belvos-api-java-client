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
 * BalanceFilters
 */
@JsonPropertyOrder({
  BalanceFilters.JSON_PROPERTY_ACCOUNT,
  BalanceFilters.JSON_PROPERTY_ACCOUNT_IN,
  BalanceFilters.JSON_PROPERTY_ACCOUNT_TYPE,
  BalanceFilters.JSON_PROPERTY_ACCOUNT_TYPE_IN,
  BalanceFilters.JSON_PROPERTY_BALANCE,
  BalanceFilters.JSON_PROPERTY_BALANCE_LT,
  BalanceFilters.JSON_PROPERTY_BALANCE_LTE,
  BalanceFilters.JSON_PROPERTY_BALANCE_GT,
  BalanceFilters.JSON_PROPERTY_BALANCE_GTE,
  BalanceFilters.JSON_PROPERTY_BALANCE_RANGE,
  BalanceFilters.JSON_PROPERTY_CURRENCY,
  BalanceFilters.JSON_PROPERTY_CURRENCY_IN,
  BalanceFilters.JSON_PROPERTY_CURRENT_BALANCE,
  BalanceFilters.JSON_PROPERTY_CURRENT_BALANCE_LT,
  BalanceFilters.JSON_PROPERTY_CURRENT_BALANCE_LTE,
  BalanceFilters.JSON_PROPERTY_CURRENT_BALANCE_GT,
  BalanceFilters.JSON_PROPERTY_CURRENT_BALANCE_GTE,
  BalanceFilters.JSON_PROPERTY_CURRENT_BALANCE_RANGE,
  BalanceFilters.JSON_PROPERTY_ID,
  BalanceFilters.JSON_PROPERTY_ID_IN,
  BalanceFilters.JSON_PROPERTY_INSTITUTION,
  BalanceFilters.JSON_PROPERTY_INSTITUTION_IN,
  BalanceFilters.JSON_PROPERTY_LINK,
  BalanceFilters.JSON_PROPERTY_LINK_IN,
  BalanceFilters.JSON_PROPERTY_VALUE_DATE,
  BalanceFilters.JSON_PROPERTY_VALUE_DATE_GT,
  BalanceFilters.JSON_PROPERTY_VALUE_DATE_LT,
  BalanceFilters.JSON_PROPERTY_VALUE_DATE_GTE,
  BalanceFilters.JSON_PROPERTY_VALUE_DATE_LTE,
  BalanceFilters.JSON_PROPERTY_VALUE_DATE_RANGE
})
@JsonTypeName("balanceFilters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class BalanceFilters {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private String account;

  public static final String JSON_PROPERTY_ACCOUNT_IN = "account__in";
  private String accountIn;

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "account__type";
  private String accountType;

  public static final String JSON_PROPERTY_ACCOUNT_TYPE_IN = "account__type__in";
  private String accountTypeIn;

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private String balance;

  public static final String JSON_PROPERTY_BALANCE_LT = "balance__lt";
  private String balanceLt;

  public static final String JSON_PROPERTY_BALANCE_LTE = "balance__lte";
  private String balanceLte;

  public static final String JSON_PROPERTY_BALANCE_GT = "balance__gt";
  private String balanceGt;

  public static final String JSON_PROPERTY_BALANCE_GTE = "balance__gte";
  private String balanceGte;

  public static final String JSON_PROPERTY_BALANCE_RANGE = "balance__range";
  private String balanceRange;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_CURRENCY_IN = "currency__in";
  private String currencyIn;

  public static final String JSON_PROPERTY_CURRENT_BALANCE = "current_balance";
  private String currentBalance;

  public static final String JSON_PROPERTY_CURRENT_BALANCE_LT = "current_balance__lt";
  private String currentBalanceLt;

  public static final String JSON_PROPERTY_CURRENT_BALANCE_LTE = "current_balance__lte";
  private String currentBalanceLte;

  public static final String JSON_PROPERTY_CURRENT_BALANCE_GT = "current_balance__gt";
  private String currentBalanceGt;

  public static final String JSON_PROPERTY_CURRENT_BALANCE_GTE = "current_balance__gte";
  private String currentBalanceGte;

  public static final String JSON_PROPERTY_CURRENT_BALANCE_RANGE = "current_balance__range";
  private String currentBalanceRange;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ID_IN = "id__in";
  private String idIn;

  public static final String JSON_PROPERTY_INSTITUTION = "institution";
  private String institution;

  public static final String JSON_PROPERTY_INSTITUTION_IN = "institution__in";
  private String institutionIn;

  public static final String JSON_PROPERTY_LINK = "link";
  private String link;

  public static final String JSON_PROPERTY_LINK_IN = "link__in";
  private String linkIn;

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

  public BalanceFilters() {
  }

  public BalanceFilters account(String account) {
    
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


  public BalanceFilters accountIn(String accountIn) {
    
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


  public BalanceFilters accountType(String accountType) {
    
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


  public BalanceFilters accountTypeIn(String accountTypeIn) {
    
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


  public BalanceFilters balance(String balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalance() {
    return balance;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalance(String balance) {
    this.balance = balance;
  }


  public BalanceFilters balanceLt(String balanceLt) {
    
    this.balanceLt = balanceLt;
    return this;
  }

   /**
   * Get balanceLt
   * @return balanceLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceLt() {
    return balanceLt;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceLt(String balanceLt) {
    this.balanceLt = balanceLt;
  }


  public BalanceFilters balanceLte(String balanceLte) {
    
    this.balanceLte = balanceLte;
    return this;
  }

   /**
   * Get balanceLte
   * @return balanceLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceLte() {
    return balanceLte;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceLte(String balanceLte) {
    this.balanceLte = balanceLte;
  }


  public BalanceFilters balanceGt(String balanceGt) {
    
    this.balanceGt = balanceGt;
    return this;
  }

   /**
   * Get balanceGt
   * @return balanceGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceGt() {
    return balanceGt;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceGt(String balanceGt) {
    this.balanceGt = balanceGt;
  }


  public BalanceFilters balanceGte(String balanceGte) {
    
    this.balanceGte = balanceGte;
    return this;
  }

   /**
   * Get balanceGte
   * @return balanceGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceGte() {
    return balanceGte;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceGte(String balanceGte) {
    this.balanceGte = balanceGte;
  }


  public BalanceFilters balanceRange(String balanceRange) {
    
    this.balanceRange = balanceRange;
    return this;
  }

   /**
   * Get balanceRange
   * @return balanceRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceRange() {
    return balanceRange;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceRange(String balanceRange) {
    this.balanceRange = balanceRange;
  }


  public BalanceFilters currency(String currency) {
    
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


  public BalanceFilters currencyIn(String currencyIn) {
    
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


  public BalanceFilters currentBalance(String currentBalance) {
    
    this.currentBalance = currentBalance;
    return this;
  }

   /**
   * Get currentBalance
   * @return currentBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentBalance() {
    return currentBalance;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentBalance(String currentBalance) {
    this.currentBalance = currentBalance;
  }


  public BalanceFilters currentBalanceLt(String currentBalanceLt) {
    
    this.currentBalanceLt = currentBalanceLt;
    return this;
  }

   /**
   * Get currentBalanceLt
   * @return currentBalanceLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentBalanceLt() {
    return currentBalanceLt;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentBalanceLt(String currentBalanceLt) {
    this.currentBalanceLt = currentBalanceLt;
  }


  public BalanceFilters currentBalanceLte(String currentBalanceLte) {
    
    this.currentBalanceLte = currentBalanceLte;
    return this;
  }

   /**
   * Get currentBalanceLte
   * @return currentBalanceLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentBalanceLte() {
    return currentBalanceLte;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentBalanceLte(String currentBalanceLte) {
    this.currentBalanceLte = currentBalanceLte;
  }


  public BalanceFilters currentBalanceGt(String currentBalanceGt) {
    
    this.currentBalanceGt = currentBalanceGt;
    return this;
  }

   /**
   * Get currentBalanceGt
   * @return currentBalanceGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentBalanceGt() {
    return currentBalanceGt;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentBalanceGt(String currentBalanceGt) {
    this.currentBalanceGt = currentBalanceGt;
  }


  public BalanceFilters currentBalanceGte(String currentBalanceGte) {
    
    this.currentBalanceGte = currentBalanceGte;
    return this;
  }

   /**
   * Get currentBalanceGte
   * @return currentBalanceGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentBalanceGte() {
    return currentBalanceGte;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentBalanceGte(String currentBalanceGte) {
    this.currentBalanceGte = currentBalanceGte;
  }


  public BalanceFilters currentBalanceRange(String currentBalanceRange) {
    
    this.currentBalanceRange = currentBalanceRange;
    return this;
  }

   /**
   * Get currentBalanceRange
   * @return currentBalanceRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentBalanceRange() {
    return currentBalanceRange;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentBalanceRange(String currentBalanceRange) {
    this.currentBalanceRange = currentBalanceRange;
  }


  public BalanceFilters id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public BalanceFilters idIn(String idIn) {
    
    this.idIn = idIn;
    return this;
  }

   /**
   * Get idIn
   * @return idIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdIn() {
    return idIn;
  }


  @JsonProperty(JSON_PROPERTY_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdIn(String idIn) {
    this.idIn = idIn;
  }


  public BalanceFilters institution(String institution) {
    
    this.institution = institution;
    return this;
  }

   /**
   * Get institution
   * @return institution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTITUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstitution() {
    return institution;
  }


  @JsonProperty(JSON_PROPERTY_INSTITUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstitution(String institution) {
    this.institution = institution;
  }


  public BalanceFilters institutionIn(String institutionIn) {
    
    this.institutionIn = institutionIn;
    return this;
  }

   /**
   * Get institutionIn
   * @return institutionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTITUTION_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstitutionIn() {
    return institutionIn;
  }


  @JsonProperty(JSON_PROPERTY_INSTITUTION_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstitutionIn(String institutionIn) {
    this.institutionIn = institutionIn;
  }


  public BalanceFilters link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(String link) {
    this.link = link;
  }


  public BalanceFilters linkIn(String linkIn) {
    
    this.linkIn = linkIn;
    return this;
  }

   /**
   * Get linkIn
   * @return linkIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINK_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkIn() {
    return linkIn;
  }


  @JsonProperty(JSON_PROPERTY_LINK_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkIn(String linkIn) {
    this.linkIn = linkIn;
  }


  public BalanceFilters valueDate(String valueDate) {
    
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


  public BalanceFilters valueDateGt(String valueDateGt) {
    
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


  public BalanceFilters valueDateLt(String valueDateLt) {
    
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


  public BalanceFilters valueDateGte(String valueDateGte) {
    
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


  public BalanceFilters valueDateLte(String valueDateLte) {
    
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


  public BalanceFilters valueDateRange(String valueDateRange) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceFilters balanceFilters = (BalanceFilters) o;
    return Objects.equals(this.account, balanceFilters.account) &&
        Objects.equals(this.accountIn, balanceFilters.accountIn) &&
        Objects.equals(this.accountType, balanceFilters.accountType) &&
        Objects.equals(this.accountTypeIn, balanceFilters.accountTypeIn) &&
        Objects.equals(this.balance, balanceFilters.balance) &&
        Objects.equals(this.balanceLt, balanceFilters.balanceLt) &&
        Objects.equals(this.balanceLte, balanceFilters.balanceLte) &&
        Objects.equals(this.balanceGt, balanceFilters.balanceGt) &&
        Objects.equals(this.balanceGte, balanceFilters.balanceGte) &&
        Objects.equals(this.balanceRange, balanceFilters.balanceRange) &&
        Objects.equals(this.currency, balanceFilters.currency) &&
        Objects.equals(this.currencyIn, balanceFilters.currencyIn) &&
        Objects.equals(this.currentBalance, balanceFilters.currentBalance) &&
        Objects.equals(this.currentBalanceLt, balanceFilters.currentBalanceLt) &&
        Objects.equals(this.currentBalanceLte, balanceFilters.currentBalanceLte) &&
        Objects.equals(this.currentBalanceGt, balanceFilters.currentBalanceGt) &&
        Objects.equals(this.currentBalanceGte, balanceFilters.currentBalanceGte) &&
        Objects.equals(this.currentBalanceRange, balanceFilters.currentBalanceRange) &&
        Objects.equals(this.id, balanceFilters.id) &&
        Objects.equals(this.idIn, balanceFilters.idIn) &&
        Objects.equals(this.institution, balanceFilters.institution) &&
        Objects.equals(this.institutionIn, balanceFilters.institutionIn) &&
        Objects.equals(this.link, balanceFilters.link) &&
        Objects.equals(this.linkIn, balanceFilters.linkIn) &&
        Objects.equals(this.valueDate, balanceFilters.valueDate) &&
        Objects.equals(this.valueDateGt, balanceFilters.valueDateGt) &&
        Objects.equals(this.valueDateLt, balanceFilters.valueDateLt) &&
        Objects.equals(this.valueDateGte, balanceFilters.valueDateGte) &&
        Objects.equals(this.valueDateLte, balanceFilters.valueDateLte) &&
        Objects.equals(this.valueDateRange, balanceFilters.valueDateRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountIn, accountType, accountTypeIn, balance, balanceLt, balanceLte, balanceGt, balanceGte, balanceRange, currency, currencyIn, currentBalance, currentBalanceLt, currentBalanceLte, currentBalanceGt, currentBalanceGte, currentBalanceRange, id, idIn, institution, institutionIn, link, linkIn, valueDate, valueDateGt, valueDateLt, valueDateGte, valueDateLte, valueDateRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceFilters {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountIn: ").append(toIndentedString(accountIn)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountTypeIn: ").append(toIndentedString(accountTypeIn)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    balanceLt: ").append(toIndentedString(balanceLt)).append("\n");
    sb.append("    balanceLte: ").append(toIndentedString(balanceLte)).append("\n");
    sb.append("    balanceGt: ").append(toIndentedString(balanceGt)).append("\n");
    sb.append("    balanceGte: ").append(toIndentedString(balanceGte)).append("\n");
    sb.append("    balanceRange: ").append(toIndentedString(balanceRange)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currencyIn: ").append(toIndentedString(currencyIn)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    currentBalanceLt: ").append(toIndentedString(currentBalanceLt)).append("\n");
    sb.append("    currentBalanceLte: ").append(toIndentedString(currentBalanceLte)).append("\n");
    sb.append("    currentBalanceGt: ").append(toIndentedString(currentBalanceGt)).append("\n");
    sb.append("    currentBalanceGte: ").append(toIndentedString(currentBalanceGte)).append("\n");
    sb.append("    currentBalanceRange: ").append(toIndentedString(currentBalanceRange)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    institutionIn: ").append(toIndentedString(institutionIn)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    linkIn: ").append(toIndentedString(linkIn)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    valueDateGt: ").append(toIndentedString(valueDateGt)).append("\n");
    sb.append("    valueDateLt: ").append(toIndentedString(valueDateLt)).append("\n");
    sb.append("    valueDateGte: ").append(toIndentedString(valueDateGte)).append("\n");
    sb.append("    valueDateLte: ").append(toIndentedString(valueDateLte)).append("\n");
    sb.append("    valueDateRange: ").append(toIndentedString(valueDateRange)).append("\n");
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

