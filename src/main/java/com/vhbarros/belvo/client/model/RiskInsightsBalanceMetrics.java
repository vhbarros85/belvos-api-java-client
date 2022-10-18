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
 * Balance metrics calculated based on the user&#39;s balances from checking and savings accounts.
 */
@ApiModel(description = "Balance metrics calculated based on the user's balances from checking and savings accounts.")
@JsonPropertyOrder({
  RiskInsightsBalanceMetrics.JSON_PROPERTY_MIN_BALANCE1W,
  RiskInsightsBalanceMetrics.JSON_PROPERTY_MIN_BALANCE1M,
  RiskInsightsBalanceMetrics.JSON_PROPERTY_MIN_BALANCE3M,
  RiskInsightsBalanceMetrics.JSON_PROPERTY_MAX_BALANCE1W,
  RiskInsightsBalanceMetrics.JSON_PROPERTY_MAX_BALANCE1M,
  RiskInsightsBalanceMetrics.JSON_PROPERTY_MAX_BALANCE3M,
  RiskInsightsBalanceMetrics.JSON_PROPERTY_CLOSING_BALANCE,
  RiskInsightsBalanceMetrics.JSON_PROPERTY_DAYS_BALANCE_BELOW01W,
  RiskInsightsBalanceMetrics.JSON_PROPERTY_DAYS_BALANCE_BELOW01M,
  RiskInsightsBalanceMetrics.JSON_PROPERTY_DAYS_BALANCE_BELOW03M,
  RiskInsightsBalanceMetrics.JSON_PROPERTY_DAYS_BALANCE_BELOW_X1W,
  RiskInsightsBalanceMetrics.JSON_PROPERTY_DAYS_BALANCE_BELOW_X1M,
  RiskInsightsBalanceMetrics.JSON_PROPERTY_DAYS_BALANCE_BELOW_X3M,
  RiskInsightsBalanceMetrics.JSON_PROPERTY_BALANCE_THRESHOLD_X
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class RiskInsightsBalanceMetrics {
  public static final String JSON_PROPERTY_MIN_BALANCE1W = "min_balance_1w";
  private Float minBalance1w;

  public static final String JSON_PROPERTY_MIN_BALANCE1M = "min_balance_1m";
  private Float minBalance1m;

  public static final String JSON_PROPERTY_MIN_BALANCE3M = "min_balance_3m";
  private Float minBalance3m;

  public static final String JSON_PROPERTY_MAX_BALANCE1W = "max_balance_1w";
  private Float maxBalance1w;

  public static final String JSON_PROPERTY_MAX_BALANCE1M = "max_balance_1m";
  private Float maxBalance1m;

  public static final String JSON_PROPERTY_MAX_BALANCE3M = "max_balance_3m";
  private Float maxBalance3m;

  public static final String JSON_PROPERTY_CLOSING_BALANCE = "closing_balance";
  private Float closingBalance;

  public static final String JSON_PROPERTY_DAYS_BALANCE_BELOW01W = "days_balance_below_0_1w";
  private Integer daysBalanceBelow01w;

  public static final String JSON_PROPERTY_DAYS_BALANCE_BELOW01M = "days_balance_below_0_1m";
  private Integer daysBalanceBelow01m;

  public static final String JSON_PROPERTY_DAYS_BALANCE_BELOW03M = "days_balance_below_0_3m";
  private Integer daysBalanceBelow03m;

  public static final String JSON_PROPERTY_DAYS_BALANCE_BELOW_X1W = "days_balance_below_x_1w";
  private Integer daysBalanceBelowX1w;

  public static final String JSON_PROPERTY_DAYS_BALANCE_BELOW_X1M = "days_balance_below_x_1m";
  private Integer daysBalanceBelowX1m;

  public static final String JSON_PROPERTY_DAYS_BALANCE_BELOW_X3M = "days_balance_below_x_3m";
  private Integer daysBalanceBelowX3m;

  public static final String JSON_PROPERTY_BALANCE_THRESHOLD_X = "balance_threshold_x";
  private Float balanceThresholdX;

  public RiskInsightsBalanceMetrics() {
  }

  public RiskInsightsBalanceMetrics minBalance1w(Float minBalance1w) {
    
    this.minBalance1w = minBalance1w;
    return this;
  }

   /**
   * The minimum balance in the period (one week). 
   * @return minBalance1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.51", required = true, value = "The minimum balance in the period (one week). ")
  @JsonProperty(JSON_PROPERTY_MIN_BALANCE1W)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getMinBalance1w() {
    return minBalance1w;
  }


  @JsonProperty(JSON_PROPERTY_MIN_BALANCE1W)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinBalance1w(Float minBalance1w) {
    this.minBalance1w = minBalance1w;
  }


  public RiskInsightsBalanceMetrics minBalance1m(Float minBalance1m) {
    
    this.minBalance1m = minBalance1m;
    return this;
  }

   /**
   * The minimum balance in the period (one month). 
   * @return minBalance1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.51", required = true, value = "The minimum balance in the period (one month). ")
  @JsonProperty(JSON_PROPERTY_MIN_BALANCE1M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getMinBalance1m() {
    return minBalance1m;
  }


  @JsonProperty(JSON_PROPERTY_MIN_BALANCE1M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinBalance1m(Float minBalance1m) {
    this.minBalance1m = minBalance1m;
  }


  public RiskInsightsBalanceMetrics minBalance3m(Float minBalance3m) {
    
    this.minBalance3m = minBalance3m;
    return this;
  }

   /**
   * The minimum balance in the period (three months). 
   * @return minBalance3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.51", required = true, value = "The minimum balance in the period (three months). ")
  @JsonProperty(JSON_PROPERTY_MIN_BALANCE3M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getMinBalance3m() {
    return minBalance3m;
  }


  @JsonProperty(JSON_PROPERTY_MIN_BALANCE3M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinBalance3m(Float minBalance3m) {
    this.minBalance3m = minBalance3m;
  }


  public RiskInsightsBalanceMetrics maxBalance1w(Float maxBalance1w) {
    
    this.maxBalance1w = maxBalance1w;
    return this;
  }

   /**
   * The maximum balance in the period (one week). 
   * @return maxBalance1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3062.11", required = true, value = "The maximum balance in the period (one week). ")
  @JsonProperty(JSON_PROPERTY_MAX_BALANCE1W)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getMaxBalance1w() {
    return maxBalance1w;
  }


  @JsonProperty(JSON_PROPERTY_MAX_BALANCE1W)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxBalance1w(Float maxBalance1w) {
    this.maxBalance1w = maxBalance1w;
  }


  public RiskInsightsBalanceMetrics maxBalance1m(Float maxBalance1m) {
    
    this.maxBalance1m = maxBalance1m;
    return this;
  }

   /**
   * The maximum balance in the period (one month). 
   * @return maxBalance1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3062.11", required = true, value = "The maximum balance in the period (one month). ")
  @JsonProperty(JSON_PROPERTY_MAX_BALANCE1M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getMaxBalance1m() {
    return maxBalance1m;
  }


  @JsonProperty(JSON_PROPERTY_MAX_BALANCE1M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxBalance1m(Float maxBalance1m) {
    this.maxBalance1m = maxBalance1m;
  }


  public RiskInsightsBalanceMetrics maxBalance3m(Float maxBalance3m) {
    
    this.maxBalance3m = maxBalance3m;
    return this;
  }

   /**
   * The maximum balance in the period (three months). 
   * @return maxBalance3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3062.11", required = true, value = "The maximum balance in the period (three months). ")
  @JsonProperty(JSON_PROPERTY_MAX_BALANCE3M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getMaxBalance3m() {
    return maxBalance3m;
  }


  @JsonProperty(JSON_PROPERTY_MAX_BALANCE3M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxBalance3m(Float maxBalance3m) {
    this.maxBalance3m = maxBalance3m;
  }


  public RiskInsightsBalanceMetrics closingBalance(Float closingBalance) {
    
    this.closingBalance = closingBalance;
    return this;
  }

   /**
   * The balance of all the accounts at the &#x60;collected_at&#x60; time. 
   * @return closingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "24.19", required = true, value = "The balance of all the accounts at the `collected_at` time. ")
  @JsonProperty(JSON_PROPERTY_CLOSING_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getClosingBalance() {
    return closingBalance;
  }


  @JsonProperty(JSON_PROPERTY_CLOSING_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClosingBalance(Float closingBalance) {
    this.closingBalance = closingBalance;
  }


  public RiskInsightsBalanceMetrics daysBalanceBelow01w(Integer daysBalanceBelow01w) {
    
    this.daysBalanceBelow01w = daysBalanceBelow01w;
    return this;
  }

   /**
   * The number of days that the total balance of the account is less than or equal to 0 in the last week. 
   * @return daysBalanceBelow01w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", required = true, value = "The number of days that the total balance of the account is less than or equal to 0 in the last week. ")
  @JsonProperty(JSON_PROPERTY_DAYS_BALANCE_BELOW01W)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDaysBalanceBelow01w() {
    return daysBalanceBelow01w;
  }


  @JsonProperty(JSON_PROPERTY_DAYS_BALANCE_BELOW01W)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDaysBalanceBelow01w(Integer daysBalanceBelow01w) {
    this.daysBalanceBelow01w = daysBalanceBelow01w;
  }


  public RiskInsightsBalanceMetrics daysBalanceBelow01m(Integer daysBalanceBelow01m) {
    
    this.daysBalanceBelow01m = daysBalanceBelow01m;
    return this;
  }

   /**
   * The number of days that the total balance of the account is less than or equal to 0 in the last month. 
   * @return daysBalanceBelow01m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", required = true, value = "The number of days that the total balance of the account is less than or equal to 0 in the last month. ")
  @JsonProperty(JSON_PROPERTY_DAYS_BALANCE_BELOW01M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDaysBalanceBelow01m() {
    return daysBalanceBelow01m;
  }


  @JsonProperty(JSON_PROPERTY_DAYS_BALANCE_BELOW01M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDaysBalanceBelow01m(Integer daysBalanceBelow01m) {
    this.daysBalanceBelow01m = daysBalanceBelow01m;
  }


  public RiskInsightsBalanceMetrics daysBalanceBelow03m(Integer daysBalanceBelow03m) {
    
    this.daysBalanceBelow03m = daysBalanceBelow03m;
    return this;
  }

   /**
   * The number of days that the total balance of the account is less than or equal to 0 in the last three months. 
   * @return daysBalanceBelow03m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", required = true, value = "The number of days that the total balance of the account is less than or equal to 0 in the last three months. ")
  @JsonProperty(JSON_PROPERTY_DAYS_BALANCE_BELOW03M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDaysBalanceBelow03m() {
    return daysBalanceBelow03m;
  }


  @JsonProperty(JSON_PROPERTY_DAYS_BALANCE_BELOW03M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDaysBalanceBelow03m(Integer daysBalanceBelow03m) {
    this.daysBalanceBelow03m = daysBalanceBelow03m;
  }


  public RiskInsightsBalanceMetrics daysBalanceBelowX1w(Integer daysBalanceBelowX1w) {
    
    this.daysBalanceBelowX1w = daysBalanceBelowX1w;
    return this;
  }

   /**
   * The number of days that the total balance of the account is less than or equal to the amount specified in &#x60;balance_threshold_x&#x60; in the last week. 
   * @return daysBalanceBelowX1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", required = true, value = "The number of days that the total balance of the account is less than or equal to the amount specified in `balance_threshold_x` in the last week. ")
  @JsonProperty(JSON_PROPERTY_DAYS_BALANCE_BELOW_X1W)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDaysBalanceBelowX1w() {
    return daysBalanceBelowX1w;
  }


  @JsonProperty(JSON_PROPERTY_DAYS_BALANCE_BELOW_X1W)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDaysBalanceBelowX1w(Integer daysBalanceBelowX1w) {
    this.daysBalanceBelowX1w = daysBalanceBelowX1w;
  }


  public RiskInsightsBalanceMetrics daysBalanceBelowX1m(Integer daysBalanceBelowX1m) {
    
    this.daysBalanceBelowX1m = daysBalanceBelowX1m;
    return this;
  }

   /**
   * The number of days that the total balance of the account is less than or equal to the amount specified in &#x60;balance_threshold_x&#x60; in the last month. 
   * @return daysBalanceBelowX1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", required = true, value = "The number of days that the total balance of the account is less than or equal to the amount specified in `balance_threshold_x` in the last month. ")
  @JsonProperty(JSON_PROPERTY_DAYS_BALANCE_BELOW_X1M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDaysBalanceBelowX1m() {
    return daysBalanceBelowX1m;
  }


  @JsonProperty(JSON_PROPERTY_DAYS_BALANCE_BELOW_X1M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDaysBalanceBelowX1m(Integer daysBalanceBelowX1m) {
    this.daysBalanceBelowX1m = daysBalanceBelowX1m;
  }


  public RiskInsightsBalanceMetrics daysBalanceBelowX3m(Integer daysBalanceBelowX3m) {
    
    this.daysBalanceBelowX3m = daysBalanceBelowX3m;
    return this;
  }

   /**
   * The number of days that the total balance of the account is less than or equal to the amount specified in &#x60;balance_threshold_x&#x60; in the last three months. 
   * @return daysBalanceBelowX3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", required = true, value = "The number of days that the total balance of the account is less than or equal to the amount specified in `balance_threshold_x` in the last three months. ")
  @JsonProperty(JSON_PROPERTY_DAYS_BALANCE_BELOW_X3M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDaysBalanceBelowX3m() {
    return daysBalanceBelowX3m;
  }


  @JsonProperty(JSON_PROPERTY_DAYS_BALANCE_BELOW_X3M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDaysBalanceBelowX3m(Integer daysBalanceBelowX3m) {
    this.daysBalanceBelowX3m = daysBalanceBelowX3m;
  }


  public RiskInsightsBalanceMetrics balanceThresholdX(Float balanceThresholdX) {
    
    this.balanceThresholdX = balanceThresholdX;
    return this;
  }

   /**
   * The threshold used to compute &#x60;days_balance_below_x_period&#x60;. Please note, this is value is country specific (both in terms of the amount and the currency). 
   * @return balanceThresholdX
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "267", required = true, value = "The threshold used to compute `days_balance_below_x_period`. Please note, this is value is country specific (both in terms of the amount and the currency). ")
  @JsonProperty(JSON_PROPERTY_BALANCE_THRESHOLD_X)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getBalanceThresholdX() {
    return balanceThresholdX;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_THRESHOLD_X)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalanceThresholdX(Float balanceThresholdX) {
    this.balanceThresholdX = balanceThresholdX;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskInsightsBalanceMetrics riskInsightsBalanceMetrics = (RiskInsightsBalanceMetrics) o;
    return Objects.equals(this.minBalance1w, riskInsightsBalanceMetrics.minBalance1w) &&
        Objects.equals(this.minBalance1m, riskInsightsBalanceMetrics.minBalance1m) &&
        Objects.equals(this.minBalance3m, riskInsightsBalanceMetrics.minBalance3m) &&
        Objects.equals(this.maxBalance1w, riskInsightsBalanceMetrics.maxBalance1w) &&
        Objects.equals(this.maxBalance1m, riskInsightsBalanceMetrics.maxBalance1m) &&
        Objects.equals(this.maxBalance3m, riskInsightsBalanceMetrics.maxBalance3m) &&
        Objects.equals(this.closingBalance, riskInsightsBalanceMetrics.closingBalance) &&
        Objects.equals(this.daysBalanceBelow01w, riskInsightsBalanceMetrics.daysBalanceBelow01w) &&
        Objects.equals(this.daysBalanceBelow01m, riskInsightsBalanceMetrics.daysBalanceBelow01m) &&
        Objects.equals(this.daysBalanceBelow03m, riskInsightsBalanceMetrics.daysBalanceBelow03m) &&
        Objects.equals(this.daysBalanceBelowX1w, riskInsightsBalanceMetrics.daysBalanceBelowX1w) &&
        Objects.equals(this.daysBalanceBelowX1m, riskInsightsBalanceMetrics.daysBalanceBelowX1m) &&
        Objects.equals(this.daysBalanceBelowX3m, riskInsightsBalanceMetrics.daysBalanceBelowX3m) &&
        Objects.equals(this.balanceThresholdX, riskInsightsBalanceMetrics.balanceThresholdX);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minBalance1w, minBalance1m, minBalance3m, maxBalance1w, maxBalance1m, maxBalance3m, closingBalance, daysBalanceBelow01w, daysBalanceBelow01m, daysBalanceBelow03m, daysBalanceBelowX1w, daysBalanceBelowX1m, daysBalanceBelowX3m, balanceThresholdX);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskInsightsBalanceMetrics {\n");
    sb.append("    minBalance1w: ").append(toIndentedString(minBalance1w)).append("\n");
    sb.append("    minBalance1m: ").append(toIndentedString(minBalance1m)).append("\n");
    sb.append("    minBalance3m: ").append(toIndentedString(minBalance3m)).append("\n");
    sb.append("    maxBalance1w: ").append(toIndentedString(maxBalance1w)).append("\n");
    sb.append("    maxBalance1m: ").append(toIndentedString(maxBalance1m)).append("\n");
    sb.append("    maxBalance3m: ").append(toIndentedString(maxBalance3m)).append("\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
    sb.append("    daysBalanceBelow01w: ").append(toIndentedString(daysBalanceBelow01w)).append("\n");
    sb.append("    daysBalanceBelow01m: ").append(toIndentedString(daysBalanceBelow01m)).append("\n");
    sb.append("    daysBalanceBelow03m: ").append(toIndentedString(daysBalanceBelow03m)).append("\n");
    sb.append("    daysBalanceBelowX1w: ").append(toIndentedString(daysBalanceBelowX1w)).append("\n");
    sb.append("    daysBalanceBelowX1m: ").append(toIndentedString(daysBalanceBelowX1m)).append("\n");
    sb.append("    daysBalanceBelowX3m: ").append(toIndentedString(daysBalanceBelowX3m)).append("\n");
    sb.append("    balanceThresholdX: ").append(toIndentedString(balanceThresholdX)).append("\n");
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

