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
 * AccountFilters
 */
@JsonPropertyOrder({
  AccountFilters.JSON_PROPERTY_BALANCE_AVAILABLE,
  AccountFilters.JSON_PROPERTY_BALANCE_AVAILABLE_LT,
  AccountFilters.JSON_PROPERTY_BALANCE_AVAILABLE_LTE,
  AccountFilters.JSON_PROPERTY_BALANCE_AVAILABLE_GT,
  AccountFilters.JSON_PROPERTY_BALANCE_AVAILABLE_GTE,
  AccountFilters.JSON_PROPERTY_BALANCE_AVAILABLE_RANGE,
  AccountFilters.JSON_PROPERTY_BALANCE_CURRENT,
  AccountFilters.JSON_PROPERTY_BALANCE_CURRENT_LT,
  AccountFilters.JSON_PROPERTY_BALANCE_CURRENT_LTE,
  AccountFilters.JSON_PROPERTY_BALANCE_CURRENT_GT,
  AccountFilters.JSON_PROPERTY_BALANCE_CURRENT_GTE,
  AccountFilters.JSON_PROPERTY_BALANCE_CURRENT_RANGE,
  AccountFilters.JSON_PROPERTY_BANK_PRODUCT_ID,
  AccountFilters.JSON_PROPERTY_CATEGORY,
  AccountFilters.JSON_PROPERTY_CATEGORY_IN,
  AccountFilters.JSON_PROPERTY_CREATED_AT_GT,
  AccountFilters.JSON_PROPERTY_CREATED_AT_LT,
  AccountFilters.JSON_PROPERTY_CREATED_AT_GTE,
  AccountFilters.JSON_PROPERTY_CREATED_AT_LTE,
  AccountFilters.JSON_PROPERTY_CREATED_AT_RANGE,
  AccountFilters.JSON_PROPERTY_CURRENCY,
  AccountFilters.JSON_PROPERTY_CURRENCY_IN,
  AccountFilters.JSON_PROPERTY_ID,
  AccountFilters.JSON_PROPERTY_ID_IN,
  AccountFilters.JSON_PROPERTY_INSTITUTION,
  AccountFilters.JSON_PROPERTY_INSTITUTION_IN,
  AccountFilters.JSON_PROPERTY_INTERNAL_IDENTIFICATION,
  AccountFilters.JSON_PROPERTY_LINK,
  AccountFilters.JSON_PROPERTY_LINK_IN,
  AccountFilters.JSON_PROPERTY_NAME,
  AccountFilters.JSON_PROPERTY_NAME_ICONTAINS,
  AccountFilters.JSON_PROPERTY_NUMBER,
  AccountFilters.JSON_PROPERTY_NUMBER_IN,
  AccountFilters.JSON_PROPERTY_PUBLIC_IDENTIFICATION_NAME,
  AccountFilters.JSON_PROPERTY_PUBLIC_IDENTIFICATION_VALUE,
  AccountFilters.JSON_PROPERTY_TYPE
})
@JsonTypeName("accountFilters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class AccountFilters {
  public static final String JSON_PROPERTY_BALANCE_AVAILABLE = "balance__available";
  private String balanceAvailable;

  public static final String JSON_PROPERTY_BALANCE_AVAILABLE_LT = "balance__available__lt";
  private String balanceAvailableLt;

  public static final String JSON_PROPERTY_BALANCE_AVAILABLE_LTE = "balance__available__lte";
  private String balanceAvailableLte;

  public static final String JSON_PROPERTY_BALANCE_AVAILABLE_GT = "balance__available__gt";
  private String balanceAvailableGt;

  public static final String JSON_PROPERTY_BALANCE_AVAILABLE_GTE = "balance__available__gte";
  private String balanceAvailableGte;

  public static final String JSON_PROPERTY_BALANCE_AVAILABLE_RANGE = "balance__available__range";
  private String balanceAvailableRange;

  public static final String JSON_PROPERTY_BALANCE_CURRENT = "balance__current";
  private String balanceCurrent;

  public static final String JSON_PROPERTY_BALANCE_CURRENT_LT = "balance__current__lt";
  private String balanceCurrentLt;

  public static final String JSON_PROPERTY_BALANCE_CURRENT_LTE = "balance__current__lte";
  private String balanceCurrentLte;

  public static final String JSON_PROPERTY_BALANCE_CURRENT_GT = "balance__current__gt";
  private String balanceCurrentGt;

  public static final String JSON_PROPERTY_BALANCE_CURRENT_GTE = "balance__current__gte";
  private String balanceCurrentGte;

  public static final String JSON_PROPERTY_BALANCE_CURRENT_RANGE = "balance__current__range";
  private String balanceCurrentRange;

  public static final String JSON_PROPERTY_BANK_PRODUCT_ID = "bank_product_id";
  private String bankProductId;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CATEGORY_IN = "category__in";
  private String categoryIn;

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

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_CURRENCY_IN = "currency__in";
  private String currencyIn;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ID_IN = "id__in";
  private String idIn;

  public static final String JSON_PROPERTY_INSTITUTION = "institution";
  private String institution;

  public static final String JSON_PROPERTY_INSTITUTION_IN = "institution__in";
  private String institutionIn;

  public static final String JSON_PROPERTY_INTERNAL_IDENTIFICATION = "internal_identification";
  private String internalIdentification;

  public static final String JSON_PROPERTY_LINK = "link";
  private String link;

  public static final String JSON_PROPERTY_LINK_IN = "link__in";
  private String linkIn;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAME_ICONTAINS = "name__icontains";
  private String nameIcontains;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_NUMBER_IN = "number__in";
  private String numberIn;

  public static final String JSON_PROPERTY_PUBLIC_IDENTIFICATION_NAME = "public_identification_name";
  private String publicIdentificationName;

  public static final String JSON_PROPERTY_PUBLIC_IDENTIFICATION_VALUE = "public_identification_value";
  private String publicIdentificationValue;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public AccountFilters() {
  }

  public AccountFilters balanceAvailable(String balanceAvailable) {
    
    this.balanceAvailable = balanceAvailable;
    return this;
  }

   /**
   * Get balanceAvailable
   * @return balanceAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceAvailable() {
    return balanceAvailable;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAvailable(String balanceAvailable) {
    this.balanceAvailable = balanceAvailable;
  }


  public AccountFilters balanceAvailableLt(String balanceAvailableLt) {
    
    this.balanceAvailableLt = balanceAvailableLt;
    return this;
  }

   /**
   * Get balanceAvailableLt
   * @return balanceAvailableLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_AVAILABLE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceAvailableLt() {
    return balanceAvailableLt;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_AVAILABLE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAvailableLt(String balanceAvailableLt) {
    this.balanceAvailableLt = balanceAvailableLt;
  }


  public AccountFilters balanceAvailableLte(String balanceAvailableLte) {
    
    this.balanceAvailableLte = balanceAvailableLte;
    return this;
  }

   /**
   * Get balanceAvailableLte
   * @return balanceAvailableLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_AVAILABLE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceAvailableLte() {
    return balanceAvailableLte;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_AVAILABLE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAvailableLte(String balanceAvailableLte) {
    this.balanceAvailableLte = balanceAvailableLte;
  }


  public AccountFilters balanceAvailableGt(String balanceAvailableGt) {
    
    this.balanceAvailableGt = balanceAvailableGt;
    return this;
  }

   /**
   * Get balanceAvailableGt
   * @return balanceAvailableGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_AVAILABLE_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceAvailableGt() {
    return balanceAvailableGt;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_AVAILABLE_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAvailableGt(String balanceAvailableGt) {
    this.balanceAvailableGt = balanceAvailableGt;
  }


  public AccountFilters balanceAvailableGte(String balanceAvailableGte) {
    
    this.balanceAvailableGte = balanceAvailableGte;
    return this;
  }

   /**
   * Get balanceAvailableGte
   * @return balanceAvailableGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_AVAILABLE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceAvailableGte() {
    return balanceAvailableGte;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_AVAILABLE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAvailableGte(String balanceAvailableGte) {
    this.balanceAvailableGte = balanceAvailableGte;
  }


  public AccountFilters balanceAvailableRange(String balanceAvailableRange) {
    
    this.balanceAvailableRange = balanceAvailableRange;
    return this;
  }

   /**
   * Get balanceAvailableRange
   * @return balanceAvailableRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_AVAILABLE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceAvailableRange() {
    return balanceAvailableRange;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_AVAILABLE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAvailableRange(String balanceAvailableRange) {
    this.balanceAvailableRange = balanceAvailableRange;
  }


  public AccountFilters balanceCurrent(String balanceCurrent) {
    
    this.balanceCurrent = balanceCurrent;
    return this;
  }

   /**
   * Get balanceCurrent
   * @return balanceCurrent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceCurrent() {
    return balanceCurrent;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceCurrent(String balanceCurrent) {
    this.balanceCurrent = balanceCurrent;
  }


  public AccountFilters balanceCurrentLt(String balanceCurrentLt) {
    
    this.balanceCurrentLt = balanceCurrentLt;
    return this;
  }

   /**
   * Get balanceCurrentLt
   * @return balanceCurrentLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_CURRENT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceCurrentLt() {
    return balanceCurrentLt;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_CURRENT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceCurrentLt(String balanceCurrentLt) {
    this.balanceCurrentLt = balanceCurrentLt;
  }


  public AccountFilters balanceCurrentLte(String balanceCurrentLte) {
    
    this.balanceCurrentLte = balanceCurrentLte;
    return this;
  }

   /**
   * Get balanceCurrentLte
   * @return balanceCurrentLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_CURRENT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceCurrentLte() {
    return balanceCurrentLte;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_CURRENT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceCurrentLte(String balanceCurrentLte) {
    this.balanceCurrentLte = balanceCurrentLte;
  }


  public AccountFilters balanceCurrentGt(String balanceCurrentGt) {
    
    this.balanceCurrentGt = balanceCurrentGt;
    return this;
  }

   /**
   * Get balanceCurrentGt
   * @return balanceCurrentGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_CURRENT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceCurrentGt() {
    return balanceCurrentGt;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_CURRENT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceCurrentGt(String balanceCurrentGt) {
    this.balanceCurrentGt = balanceCurrentGt;
  }


  public AccountFilters balanceCurrentGte(String balanceCurrentGte) {
    
    this.balanceCurrentGte = balanceCurrentGte;
    return this;
  }

   /**
   * Get balanceCurrentGte
   * @return balanceCurrentGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_CURRENT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceCurrentGte() {
    return balanceCurrentGte;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_CURRENT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceCurrentGte(String balanceCurrentGte) {
    this.balanceCurrentGte = balanceCurrentGte;
  }


  public AccountFilters balanceCurrentRange(String balanceCurrentRange) {
    
    this.balanceCurrentRange = balanceCurrentRange;
    return this;
  }

   /**
   * Get balanceCurrentRange
   * @return balanceCurrentRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_CURRENT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceCurrentRange() {
    return balanceCurrentRange;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_CURRENT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceCurrentRange(String balanceCurrentRange) {
    this.balanceCurrentRange = balanceCurrentRange;
  }


  public AccountFilters bankProductId(String bankProductId) {
    
    this.bankProductId = bankProductId;
    return this;
  }

   /**
   * Get bankProductId
   * @return bankProductId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANK_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankProductId() {
    return bankProductId;
  }


  @JsonProperty(JSON_PROPERTY_BANK_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankProductId(String bankProductId) {
    this.bankProductId = bankProductId;
  }


  public AccountFilters category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(String category) {
    this.category = category;
  }


  public AccountFilters categoryIn(String categoryIn) {
    
    this.categoryIn = categoryIn;
    return this;
  }

   /**
   * Get categoryIn
   * @return categoryIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategoryIn() {
    return categoryIn;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryIn(String categoryIn) {
    this.categoryIn = categoryIn;
  }


  public AccountFilters createdAtGt(String createdAtGt) {
    
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


  public AccountFilters createdAtLt(String createdAtLt) {
    
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


  public AccountFilters createdAtGte(String createdAtGte) {
    
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


  public AccountFilters createdAtLte(String createdAtLte) {
    
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


  public AccountFilters createdAtRange(String createdAtRange) {
    
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


  public AccountFilters currency(String currency) {
    
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


  public AccountFilters currencyIn(String currencyIn) {
    
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


  public AccountFilters id(String id) {
    
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


  public AccountFilters idIn(String idIn) {
    
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


  public AccountFilters institution(String institution) {
    
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


  public AccountFilters institutionIn(String institutionIn) {
    
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


  public AccountFilters internalIdentification(String internalIdentification) {
    
    this.internalIdentification = internalIdentification;
    return this;
  }

   /**
   * Get internalIdentification
   * @return internalIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTERNAL_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInternalIdentification() {
    return internalIdentification;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternalIdentification(String internalIdentification) {
    this.internalIdentification = internalIdentification;
  }


  public AccountFilters link(String link) {
    
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


  public AccountFilters linkIn(String linkIn) {
    
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


  public AccountFilters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public AccountFilters nameIcontains(String nameIcontains) {
    
    this.nameIcontains = nameIcontains;
    return this;
  }

   /**
   * Get nameIcontains
   * @return nameIcontains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME_ICONTAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNameIcontains() {
    return nameIcontains;
  }


  @JsonProperty(JSON_PROPERTY_NAME_ICONTAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameIcontains(String nameIcontains) {
    this.nameIcontains = nameIcontains;
  }


  public AccountFilters number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(String number) {
    this.number = number;
  }


  public AccountFilters numberIn(String numberIn) {
    
    this.numberIn = numberIn;
    return this;
  }

   /**
   * Get numberIn
   * @return numberIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumberIn() {
    return numberIn;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberIn(String numberIn) {
    this.numberIn = numberIn;
  }


  public AccountFilters publicIdentificationName(String publicIdentificationName) {
    
    this.publicIdentificationName = publicIdentificationName;
    return this;
  }

   /**
   * Get publicIdentificationName
   * @return publicIdentificationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUBLIC_IDENTIFICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicIdentificationName() {
    return publicIdentificationName;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_IDENTIFICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicIdentificationName(String publicIdentificationName) {
    this.publicIdentificationName = publicIdentificationName;
  }


  public AccountFilters publicIdentificationValue(String publicIdentificationValue) {
    
    this.publicIdentificationValue = publicIdentificationValue;
    return this;
  }

   /**
   * Get publicIdentificationValue
   * @return publicIdentificationValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUBLIC_IDENTIFICATION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicIdentificationValue() {
    return publicIdentificationValue;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_IDENTIFICATION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicIdentificationValue(String publicIdentificationValue) {
    this.publicIdentificationValue = publicIdentificationValue;
  }


  public AccountFilters type(String type) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountFilters accountFilters = (AccountFilters) o;
    return Objects.equals(this.balanceAvailable, accountFilters.balanceAvailable) &&
        Objects.equals(this.balanceAvailableLt, accountFilters.balanceAvailableLt) &&
        Objects.equals(this.balanceAvailableLte, accountFilters.balanceAvailableLte) &&
        Objects.equals(this.balanceAvailableGt, accountFilters.balanceAvailableGt) &&
        Objects.equals(this.balanceAvailableGte, accountFilters.balanceAvailableGte) &&
        Objects.equals(this.balanceAvailableRange, accountFilters.balanceAvailableRange) &&
        Objects.equals(this.balanceCurrent, accountFilters.balanceCurrent) &&
        Objects.equals(this.balanceCurrentLt, accountFilters.balanceCurrentLt) &&
        Objects.equals(this.balanceCurrentLte, accountFilters.balanceCurrentLte) &&
        Objects.equals(this.balanceCurrentGt, accountFilters.balanceCurrentGt) &&
        Objects.equals(this.balanceCurrentGte, accountFilters.balanceCurrentGte) &&
        Objects.equals(this.balanceCurrentRange, accountFilters.balanceCurrentRange) &&
        Objects.equals(this.bankProductId, accountFilters.bankProductId) &&
        Objects.equals(this.category, accountFilters.category) &&
        Objects.equals(this.categoryIn, accountFilters.categoryIn) &&
        Objects.equals(this.createdAtGt, accountFilters.createdAtGt) &&
        Objects.equals(this.createdAtLt, accountFilters.createdAtLt) &&
        Objects.equals(this.createdAtGte, accountFilters.createdAtGte) &&
        Objects.equals(this.createdAtLte, accountFilters.createdAtLte) &&
        Objects.equals(this.createdAtRange, accountFilters.createdAtRange) &&
        Objects.equals(this.currency, accountFilters.currency) &&
        Objects.equals(this.currencyIn, accountFilters.currencyIn) &&
        Objects.equals(this.id, accountFilters.id) &&
        Objects.equals(this.idIn, accountFilters.idIn) &&
        Objects.equals(this.institution, accountFilters.institution) &&
        Objects.equals(this.institutionIn, accountFilters.institutionIn) &&
        Objects.equals(this.internalIdentification, accountFilters.internalIdentification) &&
        Objects.equals(this.link, accountFilters.link) &&
        Objects.equals(this.linkIn, accountFilters.linkIn) &&
        Objects.equals(this.name, accountFilters.name) &&
        Objects.equals(this.nameIcontains, accountFilters.nameIcontains) &&
        Objects.equals(this.number, accountFilters.number) &&
        Objects.equals(this.numberIn, accountFilters.numberIn) &&
        Objects.equals(this.publicIdentificationName, accountFilters.publicIdentificationName) &&
        Objects.equals(this.publicIdentificationValue, accountFilters.publicIdentificationValue) &&
        Objects.equals(this.type, accountFilters.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAvailable, balanceAvailableLt, balanceAvailableLte, balanceAvailableGt, balanceAvailableGte, balanceAvailableRange, balanceCurrent, balanceCurrentLt, balanceCurrentLte, balanceCurrentGt, balanceCurrentGte, balanceCurrentRange, bankProductId, category, categoryIn, createdAtGt, createdAtLt, createdAtGte, createdAtLte, createdAtRange, currency, currencyIn, id, idIn, institution, institutionIn, internalIdentification, link, linkIn, name, nameIcontains, number, numberIn, publicIdentificationName, publicIdentificationValue, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFilters {\n");
    sb.append("    balanceAvailable: ").append(toIndentedString(balanceAvailable)).append("\n");
    sb.append("    balanceAvailableLt: ").append(toIndentedString(balanceAvailableLt)).append("\n");
    sb.append("    balanceAvailableLte: ").append(toIndentedString(balanceAvailableLte)).append("\n");
    sb.append("    balanceAvailableGt: ").append(toIndentedString(balanceAvailableGt)).append("\n");
    sb.append("    balanceAvailableGte: ").append(toIndentedString(balanceAvailableGte)).append("\n");
    sb.append("    balanceAvailableRange: ").append(toIndentedString(balanceAvailableRange)).append("\n");
    sb.append("    balanceCurrent: ").append(toIndentedString(balanceCurrent)).append("\n");
    sb.append("    balanceCurrentLt: ").append(toIndentedString(balanceCurrentLt)).append("\n");
    sb.append("    balanceCurrentLte: ").append(toIndentedString(balanceCurrentLte)).append("\n");
    sb.append("    balanceCurrentGt: ").append(toIndentedString(balanceCurrentGt)).append("\n");
    sb.append("    balanceCurrentGte: ").append(toIndentedString(balanceCurrentGte)).append("\n");
    sb.append("    balanceCurrentRange: ").append(toIndentedString(balanceCurrentRange)).append("\n");
    sb.append("    bankProductId: ").append(toIndentedString(bankProductId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    categoryIn: ").append(toIndentedString(categoryIn)).append("\n");
    sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
    sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    createdAtRange: ").append(toIndentedString(createdAtRange)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currencyIn: ").append(toIndentedString(currencyIn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    institutionIn: ").append(toIndentedString(institutionIn)).append("\n");
    sb.append("    internalIdentification: ").append(toIndentedString(internalIdentification)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    linkIn: ").append(toIndentedString(linkIn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameIcontains: ").append(toIndentedString(nameIcontains)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberIn: ").append(toIndentedString(numberIn)).append("\n");
    sb.append("    publicIdentificationName: ").append(toIndentedString(publicIdentificationName)).append("\n");
    sb.append("    publicIdentificationValue: ").append(toIndentedString(publicIdentificationValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

