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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Additional data provided by the institution on the payment methods configured in the user profiles. This data is **only** provided by gig economy institutions.
 */
@ApiModel(description = "Additional data provided by the institution on the payment methods configured in the user profiles. This data is **only** provided by gig economy institutions.")
@JsonPropertyOrder({
  AccountsGigPaymentData.JSON_PROPERTY_METHOD,
  AccountsGigPaymentData.JSON_PROPERTY_ISSUER,
  AccountsGigPaymentData.JSON_PROPERTY_NUMBER,
  AccountsGigPaymentData.JSON_PROPERTY_HOLDER_NAME,
  AccountsGigPaymentData.JSON_PROPERTY_COLLECTED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class AccountsGigPaymentData {
  public static final String JSON_PROPERTY_METHOD = "method";
  private JsonNullable<String> method = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private JsonNullable<String> issuer = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NUMBER = "number";
  private JsonNullable<String> number = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HOLDER_NAME = "holder_name";
  private JsonNullable<String> holderName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private JsonNullable<OffsetDateTime> collectedAt = JsonNullable.<OffsetDateTime>undefined();

  public AccountsGigPaymentData() {
  }

  public AccountsGigPaymentData method(String method) {
    this.method = JsonNullable.<String>of(method);
    
    return this;
  }

   /**
   * The payment method type set up by the user (&#x60;BANK_ACCOUNT&#x60;, &#x60;CARD&#x60;, or &#x60;CASH&#x60;).
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BANK_ACCOUNT", value = "The payment method type set up by the user (`BANK_ACCOUNT`, `CARD`, or `CASH`).")
  @JsonIgnore

  public String getMethod() {
        return method.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMethod_JsonNullable() {
    return method;
  }
  
  @JsonProperty(JSON_PROPERTY_METHOD)
  public void setMethod_JsonNullable(JsonNullable<String> method) {
    this.method = method;
  }

  public void setMethod(String method) {
    this.method = JsonNullable.<String>of(method);
  }


  public AccountsGigPaymentData issuer(String issuer) {
    this.issuer = JsonNullable.<String>of(issuer);
    
    return this;
  }

   /**
   * The payment &#x60;method&#x60; issuer set up by the user (bank institution or card issuer).
   * @return issuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AZTECA - BANCO AZTECA SA", value = "The payment `method` issuer set up by the user (bank institution or card issuer).")
  @JsonIgnore

  public String getIssuer() {
        return issuer.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIssuer_JsonNullable() {
    return issuer;
  }
  
  @JsonProperty(JSON_PROPERTY_ISSUER)
  public void setIssuer_JsonNullable(JsonNullable<String> issuer) {
    this.issuer = issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = JsonNullable.<String>of(issuer);
  }


  public AccountsGigPaymentData number(String number) {
    this.number = JsonNullable.<String>of(number);
    
    return this;
  }

   /**
   * The bank account or card number used for the payment.
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123184016786312246", value = "The bank account or card number used for the payment.")
  @JsonIgnore

  public String getNumber() {
        return number.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNumber_JsonNullable() {
    return number;
  }
  
  @JsonProperty(JSON_PROPERTY_NUMBER)
  public void setNumber_JsonNullable(JsonNullable<String> number) {
    this.number = number;
  }

  public void setNumber(String number) {
    this.number = JsonNullable.<String>of(number);
  }


  public AccountsGigPaymentData holderName(String holderName) {
    this.holderName = JsonNullable.<String>of(holderName);
    
    return this;
  }

   /**
   * The name of the payment &#x60;method&#x60; holder.
   * @return holderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Elisa Rojas Rivas", value = "The name of the payment `method` holder.")
  @JsonIgnore

  public String getHolderName() {
        return holderName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getHolderName_JsonNullable() {
    return holderName;
  }
  
  @JsonProperty(JSON_PROPERTY_HOLDER_NAME)
  public void setHolderName_JsonNullable(JsonNullable<String> holderName) {
    this.holderName = holderName;
  }

  public void setHolderName(String holderName) {
    this.holderName = JsonNullable.<String>of(holderName);
  }


  public AccountsGigPaymentData collectedAt(OffsetDateTime collectedAt) {
    this.collectedAt = JsonNullable.<OffsetDateTime>of(collectedAt);
    
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-09-27T13:01:41.941Z", value = "The ISO-8601 timestamp when the data point was collected.")
  @JsonIgnore

  public OffsetDateTime getCollectedAt() {
        return collectedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COLLECTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCollectedAt_JsonNullable() {
    return collectedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_COLLECTED_AT)
  public void setCollectedAt_JsonNullable(JsonNullable<OffsetDateTime> collectedAt) {
    this.collectedAt = collectedAt;
  }

  public void setCollectedAt(OffsetDateTime collectedAt) {
    this.collectedAt = JsonNullable.<OffsetDateTime>of(collectedAt);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsGigPaymentData accountsGigPaymentData = (AccountsGigPaymentData) o;
    return equalsNullable(this.method, accountsGigPaymentData.method) &&
        equalsNullable(this.issuer, accountsGigPaymentData.issuer) &&
        equalsNullable(this.number, accountsGigPaymentData.number) &&
        equalsNullable(this.holderName, accountsGigPaymentData.holderName) &&
        equalsNullable(this.collectedAt, accountsGigPaymentData.collectedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(method), hashCodeNullable(issuer), hashCodeNullable(number), hashCodeNullable(holderName), hashCodeNullable(collectedAt));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsGigPaymentData {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
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

