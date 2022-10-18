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
 * Aggregated metrics calculated based on the link&#39;s credit card accounts.
 */
@ApiModel(description = "Aggregated metrics calculated based on the link's credit card accounts.")
@JsonPropertyOrder({
  RiskInsightsCreditCardMetrics.JSON_PROPERTY_NUM_ACCOUNTS,
  RiskInsightsCreditCardMetrics.JSON_PROPERTY_SUM_CREDIT_LIMIT,
  RiskInsightsCreditCardMetrics.JSON_PROPERTY_SUM_CREDIT_USED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class RiskInsightsCreditCardMetrics {
  public static final String JSON_PROPERTY_NUM_ACCOUNTS = "num_accounts";
  private Integer numAccounts;

  public static final String JSON_PROPERTY_SUM_CREDIT_LIMIT = "sum_credit_limit";
  private Float sumCreditLimit;

  public static final String JSON_PROPERTY_SUM_CREDIT_USED = "sum_credit_used";
  private Float sumCreditUsed;

  public RiskInsightsCreditCardMetrics() {
  }

  public RiskInsightsCreditCardMetrics numAccounts(Integer numAccounts) {
    
    this.numAccounts = numAccounts;
    return this;
  }

   /**
   * Number of credit cards accounts associated to the link. 
   * minimum: 0
   * @return numAccounts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Number of credit cards accounts associated to the link. ")
  @JsonProperty(JSON_PROPERTY_NUM_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNumAccounts() {
    return numAccounts;
  }


  @JsonProperty(JSON_PROPERTY_NUM_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumAccounts(Integer numAccounts) {
    this.numAccounts = numAccounts;
  }


  public RiskInsightsCreditCardMetrics sumCreditLimit(Float sumCreditLimit) {
    
    this.sumCreditLimit = sumCreditLimit;
    return this;
  }

   /**
   * Sum total of all credit cards&#39; limits. 
   * @return sumCreditLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "600.5", required = true, value = "Sum total of all credit cards' limits. ")
  @JsonProperty(JSON_PROPERTY_SUM_CREDIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getSumCreditLimit() {
    return sumCreditLimit;
  }


  @JsonProperty(JSON_PROPERTY_SUM_CREDIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSumCreditLimit(Float sumCreditLimit) {
    this.sumCreditLimit = sumCreditLimit;
  }


  public RiskInsightsCreditCardMetrics sumCreditUsed(Float sumCreditUsed) {
    
    this.sumCreditUsed = sumCreditUsed;
    return this;
  }

   /**
   * Sum total of all credit used. 
   * @return sumCreditUsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200.5", required = true, value = "Sum total of all credit used. ")
  @JsonProperty(JSON_PROPERTY_SUM_CREDIT_USED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getSumCreditUsed() {
    return sumCreditUsed;
  }


  @JsonProperty(JSON_PROPERTY_SUM_CREDIT_USED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSumCreditUsed(Float sumCreditUsed) {
    this.sumCreditUsed = sumCreditUsed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskInsightsCreditCardMetrics riskInsightsCreditCardMetrics = (RiskInsightsCreditCardMetrics) o;
    return Objects.equals(this.numAccounts, riskInsightsCreditCardMetrics.numAccounts) &&
        Objects.equals(this.sumCreditLimit, riskInsightsCreditCardMetrics.sumCreditLimit) &&
        Objects.equals(this.sumCreditUsed, riskInsightsCreditCardMetrics.sumCreditUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numAccounts, sumCreditLimit, sumCreditUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskInsightsCreditCardMetrics {\n");
    sb.append("    numAccounts: ").append(toIndentedString(numAccounts)).append("\n");
    sb.append("    sumCreditLimit: ").append(toIndentedString(sumCreditLimit)).append("\n");
    sb.append("    sumCreditUsed: ").append(toIndentedString(sumCreditUsed)).append("\n");
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

