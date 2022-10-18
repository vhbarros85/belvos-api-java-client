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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Additional details regarding the receivables account, if applicable.
 */
@ApiModel(description = "Additional details regarding the receivables account, if applicable.")
@JsonPropertyOrder({
  AccountsReceivablesData.JSON_PROPERTY_CURRENT,
  AccountsReceivablesData.JSON_PROPERTY_AVAILABLE,
  AccountsReceivablesData.JSON_PROPERTY_ANTICIPATED,
  AccountsReceivablesData.JSON_PROPERTY_COLLECTED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class AccountsReceivablesData {
  public static final String JSON_PROPERTY_CURRENT = "current";
  private Float current;

  public static final String JSON_PROPERTY_AVAILABLE = "available";
  private Float available;

  public static final String JSON_PROPERTY_ANTICIPATED = "anticipated";
  private Float anticipated;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private OffsetDateTime collectedAt;

  public AccountsReceivablesData() {
  }

  public AccountsReceivablesData current(Float current) {
    
    this.current = current;
    return this;
  }

   /**
   * The total sum of all receivables (&#x60;available&#x60; + &#x60;anticipated&#x60;)
   * @return current
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2193.83", required = true, value = "The total sum of all receivables (`available` + `anticipated`)")
  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getCurrent() {
    return current;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrent(Float current) {
    this.current = current;
  }


  public AccountsReceivablesData available(Float available) {
    
    this.available = available;
    return this;
  }

   /**
   * The amount that the owner of the account will receive according to an established date.
   * @return available
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "800.37", required = true, value = "The amount that the owner of the account will receive according to an established date.")
  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getAvailable() {
    return available;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvailable(Float available) {
    this.available = available;
  }


  public AccountsReceivablesData anticipated(Float anticipated) {
    
    this.anticipated = anticipated;
    return this;
  }

   /**
   * The amount that the owner of the account received earlier than contracted.
   * @return anticipated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1393.46", required = true, value = "The amount that the owner of the account received earlier than contracted.")
  @JsonProperty(JSON_PROPERTY_ANTICIPATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getAnticipated() {
    return anticipated;
  }


  @JsonProperty(JSON_PROPERTY_ANTICIPATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAnticipated(Float anticipated) {
    this.anticipated = anticipated;
  }


  public AccountsReceivablesData collectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2022-02-09T08:45:50.406032Z", required = true, value = "The ISO-8601 timestamp when the data point was collected.")
  @JsonProperty(JSON_PROPERTY_COLLECTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCollectedAt(OffsetDateTime collectedAt) {
    this.collectedAt = collectedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsReceivablesData accountsReceivablesData = (AccountsReceivablesData) o;
    return Objects.equals(this.current, accountsReceivablesData.current) &&
        Objects.equals(this.available, accountsReceivablesData.available) &&
        Objects.equals(this.anticipated, accountsReceivablesData.anticipated) &&
        Objects.equals(this.collectedAt, accountsReceivablesData.collectedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, available, anticipated, collectedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsReceivablesData {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    anticipated: ").append(toIndentedString(anticipated)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
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

