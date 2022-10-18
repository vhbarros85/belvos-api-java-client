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
 * Aggregated metrics calculated based on the user&#39;s transactions from checking, savings, credit, and loan accounts.  However, internal transfers (transfers between accounts belonging to the same link) are not used in the calculation. 
 */
@ApiModel(description = "Aggregated metrics calculated based on the user's transactions from checking, savings, credit, and loan accounts.  However, internal transfers (transfers between accounts belonging to the same link) are not used in the calculation. ")
@JsonPropertyOrder({
  RiskInsightsCashflowMetrics.JSON_PROPERTY_SUM_POSITIVE1W,
  RiskInsightsCashflowMetrics.JSON_PROPERTY_SUM_POSITIVE1M,
  RiskInsightsCashflowMetrics.JSON_PROPERTY_SUM_POSITIVE3M,
  RiskInsightsCashflowMetrics.JSON_PROPERTY_SUM_NEGATIVE1W,
  RiskInsightsCashflowMetrics.JSON_PROPERTY_SUM_NEGATIVE1M,
  RiskInsightsCashflowMetrics.JSON_PROPERTY_SUM_NEGATIVE3M,
  RiskInsightsCashflowMetrics.JSON_PROPERTY_POSITIVE_TO_NEGATIVE_RATIO1W,
  RiskInsightsCashflowMetrics.JSON_PROPERTY_POSITIVE_TO_NEGATIVE_RATIO1M,
  RiskInsightsCashflowMetrics.JSON_PROPERTY_POSITIVE_TO_NEGATIVE_RATIO3M
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class RiskInsightsCashflowMetrics {
  public static final String JSON_PROPERTY_SUM_POSITIVE1W = "sum_positive_1w";
  private Float sumPositive1w;

  public static final String JSON_PROPERTY_SUM_POSITIVE1M = "sum_positive_1m";
  private Float sumPositive1m;

  public static final String JSON_PROPERTY_SUM_POSITIVE3M = "sum_positive_3m";
  private Float sumPositive3m;

  public static final String JSON_PROPERTY_SUM_NEGATIVE1W = "sum_negative_1w";
  private Float sumNegative1w;

  public static final String JSON_PROPERTY_SUM_NEGATIVE1M = "sum_negative_1m";
  private Float sumNegative1m;

  public static final String JSON_PROPERTY_SUM_NEGATIVE3M = "sum_negative_3m";
  private Float sumNegative3m;

  public static final String JSON_PROPERTY_POSITIVE_TO_NEGATIVE_RATIO1W = "positive_to_negative_ratio_1w";
  private Float positiveToNegativeRatio1w;

  public static final String JSON_PROPERTY_POSITIVE_TO_NEGATIVE_RATIO1M = "positive_to_negative_ratio_1m";
  private Float positiveToNegativeRatio1m;

  public static final String JSON_PROPERTY_POSITIVE_TO_NEGATIVE_RATIO3M = "positive_to_negative_ratio_3m";
  private Float positiveToNegativeRatio3m;

  public RiskInsightsCashflowMetrics() {
  }

  public RiskInsightsCashflowMetrics sumPositive1w(Float sumPositive1w) {
    
    this.sumPositive1w = sumPositive1w;
    return this;
  }

   /**
   * Sum total of all transactions leading to a positive cashflow in the last week (counted from the time of the request). 
   * @return sumPositive1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10022.01", required = true, value = "Sum total of all transactions leading to a positive cashflow in the last week (counted from the time of the request). ")
  @JsonProperty(JSON_PROPERTY_SUM_POSITIVE1W)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getSumPositive1w() {
    return sumPositive1w;
  }


  @JsonProperty(JSON_PROPERTY_SUM_POSITIVE1W)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSumPositive1w(Float sumPositive1w) {
    this.sumPositive1w = sumPositive1w;
  }


  public RiskInsightsCashflowMetrics sumPositive1m(Float sumPositive1m) {
    
    this.sumPositive1m = sumPositive1m;
    return this;
  }

   /**
   * Sum total of all transactions leading to a positive cashflow in the last month (counted from the time of the request). 
   * @return sumPositive1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10022.01", required = true, value = "Sum total of all transactions leading to a positive cashflow in the last month (counted from the time of the request). ")
  @JsonProperty(JSON_PROPERTY_SUM_POSITIVE1M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getSumPositive1m() {
    return sumPositive1m;
  }


  @JsonProperty(JSON_PROPERTY_SUM_POSITIVE1M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSumPositive1m(Float sumPositive1m) {
    this.sumPositive1m = sumPositive1m;
  }


  public RiskInsightsCashflowMetrics sumPositive3m(Float sumPositive3m) {
    
    this.sumPositive3m = sumPositive3m;
    return this;
  }

   /**
   * Sum total of all transactions leading to a positive cashflow in the last three months (counted from the time of the request). 
   * @return sumPositive3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10022.01", required = true, value = "Sum total of all transactions leading to a positive cashflow in the last three months (counted from the time of the request). ")
  @JsonProperty(JSON_PROPERTY_SUM_POSITIVE3M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getSumPositive3m() {
    return sumPositive3m;
  }


  @JsonProperty(JSON_PROPERTY_SUM_POSITIVE3M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSumPositive3m(Float sumPositive3m) {
    this.sumPositive3m = sumPositive3m;
  }


  public RiskInsightsCashflowMetrics sumNegative1w(Float sumNegative1w) {
    
    this.sumNegative1w = sumNegative1w;
    return this;
  }

   /**
   * Sum total of all transactions leading to a negative cashflow in the last week (counted from the time of the request). 
   * @return sumNegative1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10237.03", required = true, value = "Sum total of all transactions leading to a negative cashflow in the last week (counted from the time of the request). ")
  @JsonProperty(JSON_PROPERTY_SUM_NEGATIVE1W)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getSumNegative1w() {
    return sumNegative1w;
  }


  @JsonProperty(JSON_PROPERTY_SUM_NEGATIVE1W)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSumNegative1w(Float sumNegative1w) {
    this.sumNegative1w = sumNegative1w;
  }


  public RiskInsightsCashflowMetrics sumNegative1m(Float sumNegative1m) {
    
    this.sumNegative1m = sumNegative1m;
    return this;
  }

   /**
   * Sum total of all transactions leading to a negative cashflow in the last month (counted from the time of the request). 
   * @return sumNegative1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10237.03", required = true, value = "Sum total of all transactions leading to a negative cashflow in the last month (counted from the time of the request). ")
  @JsonProperty(JSON_PROPERTY_SUM_NEGATIVE1M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getSumNegative1m() {
    return sumNegative1m;
  }


  @JsonProperty(JSON_PROPERTY_SUM_NEGATIVE1M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSumNegative1m(Float sumNegative1m) {
    this.sumNegative1m = sumNegative1m;
  }


  public RiskInsightsCashflowMetrics sumNegative3m(Float sumNegative3m) {
    
    this.sumNegative3m = sumNegative3m;
    return this;
  }

   /**
   * Sum total of all transactions leading to a negative cashflow in the last three months (counted from the time of the request). 
   * @return sumNegative3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10237.03", required = true, value = "Sum total of all transactions leading to a negative cashflow in the last three months (counted from the time of the request). ")
  @JsonProperty(JSON_PROPERTY_SUM_NEGATIVE3M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getSumNegative3m() {
    return sumNegative3m;
  }


  @JsonProperty(JSON_PROPERTY_SUM_NEGATIVE3M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSumNegative3m(Float sumNegative3m) {
    this.sumNegative3m = sumNegative3m;
  }


  public RiskInsightsCashflowMetrics positiveToNegativeRatio1w(Float positiveToNegativeRatio1w) {
    
    this.positiveToNegativeRatio1w = positiveToNegativeRatio1w;
    return this;
  }

   /**
   * The ratio between sum_positive / sum_negative  in the last week (counted from the time of the request).  ℹ️ If the ratio is greater than &#x60;1&#x60;, it means that the user has more income than outgoing, indicating that they spend less than they earn.  **Note**: In the case that there have been no outgoing transactions, the value will be &#x60;null&#x60;. 
   * @return positiveToNegativeRatio1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.98", required = true, value = "The ratio between sum_positive / sum_negative  in the last week (counted from the time of the request).  ℹ️ If the ratio is greater than `1`, it means that the user has more income than outgoing, indicating that they spend less than they earn.  **Note**: In the case that there have been no outgoing transactions, the value will be `null`. ")
  @JsonProperty(JSON_PROPERTY_POSITIVE_TO_NEGATIVE_RATIO1W)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getPositiveToNegativeRatio1w() {
    return positiveToNegativeRatio1w;
  }


  @JsonProperty(JSON_PROPERTY_POSITIVE_TO_NEGATIVE_RATIO1W)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPositiveToNegativeRatio1w(Float positiveToNegativeRatio1w) {
    this.positiveToNegativeRatio1w = positiveToNegativeRatio1w;
  }


  public RiskInsightsCashflowMetrics positiveToNegativeRatio1m(Float positiveToNegativeRatio1m) {
    
    this.positiveToNegativeRatio1m = positiveToNegativeRatio1m;
    return this;
  }

   /**
   * The ratio between sum_positive / sum_negative  in the last month (counted from the time of the request).  ℹ️ If the ratio is greater than &#x60;1&#x60;, it means that the user has more income than outgoing, indicating that they spend less than they earn. 
   * @return positiveToNegativeRatio1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.98", required = true, value = "The ratio between sum_positive / sum_negative  in the last month (counted from the time of the request).  ℹ️ If the ratio is greater than `1`, it means that the user has more income than outgoing, indicating that they spend less than they earn. ")
  @JsonProperty(JSON_PROPERTY_POSITIVE_TO_NEGATIVE_RATIO1M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getPositiveToNegativeRatio1m() {
    return positiveToNegativeRatio1m;
  }


  @JsonProperty(JSON_PROPERTY_POSITIVE_TO_NEGATIVE_RATIO1M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPositiveToNegativeRatio1m(Float positiveToNegativeRatio1m) {
    this.positiveToNegativeRatio1m = positiveToNegativeRatio1m;
  }


  public RiskInsightsCashflowMetrics positiveToNegativeRatio3m(Float positiveToNegativeRatio3m) {
    
    this.positiveToNegativeRatio3m = positiveToNegativeRatio3m;
    return this;
  }

   /**
   * The ratio between sum_positive / sum_negative  in the last three months (counted from the time of the request).  ℹ️ If the ratio is greater than &#x60;1&#x60;, it means that the user has more income than outgoing, indicating that they spend less than they earn. 
   * @return positiveToNegativeRatio3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.98", required = true, value = "The ratio between sum_positive / sum_negative  in the last three months (counted from the time of the request).  ℹ️ If the ratio is greater than `1`, it means that the user has more income than outgoing, indicating that they spend less than they earn. ")
  @JsonProperty(JSON_PROPERTY_POSITIVE_TO_NEGATIVE_RATIO3M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getPositiveToNegativeRatio3m() {
    return positiveToNegativeRatio3m;
  }


  @JsonProperty(JSON_PROPERTY_POSITIVE_TO_NEGATIVE_RATIO3M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPositiveToNegativeRatio3m(Float positiveToNegativeRatio3m) {
    this.positiveToNegativeRatio3m = positiveToNegativeRatio3m;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskInsightsCashflowMetrics riskInsightsCashflowMetrics = (RiskInsightsCashflowMetrics) o;
    return Objects.equals(this.sumPositive1w, riskInsightsCashflowMetrics.sumPositive1w) &&
        Objects.equals(this.sumPositive1m, riskInsightsCashflowMetrics.sumPositive1m) &&
        Objects.equals(this.sumPositive3m, riskInsightsCashflowMetrics.sumPositive3m) &&
        Objects.equals(this.sumNegative1w, riskInsightsCashflowMetrics.sumNegative1w) &&
        Objects.equals(this.sumNegative1m, riskInsightsCashflowMetrics.sumNegative1m) &&
        Objects.equals(this.sumNegative3m, riskInsightsCashflowMetrics.sumNegative3m) &&
        Objects.equals(this.positiveToNegativeRatio1w, riskInsightsCashflowMetrics.positiveToNegativeRatio1w) &&
        Objects.equals(this.positiveToNegativeRatio1m, riskInsightsCashflowMetrics.positiveToNegativeRatio1m) &&
        Objects.equals(this.positiveToNegativeRatio3m, riskInsightsCashflowMetrics.positiveToNegativeRatio3m);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sumPositive1w, sumPositive1m, sumPositive3m, sumNegative1w, sumNegative1m, sumNegative3m, positiveToNegativeRatio1w, positiveToNegativeRatio1m, positiveToNegativeRatio3m);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskInsightsCashflowMetrics {\n");
    sb.append("    sumPositive1w: ").append(toIndentedString(sumPositive1w)).append("\n");
    sb.append("    sumPositive1m: ").append(toIndentedString(sumPositive1m)).append("\n");
    sb.append("    sumPositive3m: ").append(toIndentedString(sumPositive3m)).append("\n");
    sb.append("    sumNegative1w: ").append(toIndentedString(sumNegative1w)).append("\n");
    sb.append("    sumNegative1m: ").append(toIndentedString(sumNegative1m)).append("\n");
    sb.append("    sumNegative3m: ").append(toIndentedString(sumNegative3m)).append("\n");
    sb.append("    positiveToNegativeRatio1w: ").append(toIndentedString(positiveToNegativeRatio1w)).append("\n");
    sb.append("    positiveToNegativeRatio1m: ").append(toIndentedString(positiveToNegativeRatio1m)).append("\n");
    sb.append("    positiveToNegativeRatio3m: ").append(toIndentedString(positiveToNegativeRatio3m)).append("\n");
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

