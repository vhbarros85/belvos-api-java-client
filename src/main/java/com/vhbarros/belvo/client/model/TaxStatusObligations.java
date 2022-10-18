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
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Details regarding a business&#39;s obligations.  ℹ️ For non-business accounts, this field will return empty. 
 */
@ApiModel(description = "Details regarding a business's obligations.  ℹ️ For non-business accounts, this field will return empty. ")
@JsonPropertyOrder({
  TaxStatusObligations.JSON_PROPERTY_OBLIGATION,
  TaxStatusObligations.JSON_PROPERTY_EXPIRATION,
  TaxStatusObligations.JSON_PROPERTY_INITIAL_DATE,
  TaxStatusObligations.JSON_PROPERTY_END_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class TaxStatusObligations {
  public static final String JSON_PROPERTY_OBLIGATION = "obligation";
  private JsonNullable<String> obligation = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXPIRATION = "expiration";
  private JsonNullable<String> expiration = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INITIAL_DATE = "initial_date";
  private JsonNullable<LocalDate> initialDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private JsonNullable<LocalDate> endDate = JsonNullable.<LocalDate>undefined();

  public TaxStatusObligations() {
  }

  public TaxStatusObligations obligation(String obligation) {
    this.obligation = JsonNullable.<String>of(obligation);
    
    return this;
  }

   /**
   * The description of the obligation.
   * @return obligation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Declaración informativa de IVA con la anual de ISR", value = "The description of the obligation.")
  @JsonIgnore

  public String getObligation() {
        return obligation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OBLIGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getObligation_JsonNullable() {
    return obligation;
  }
  
  @JsonProperty(JSON_PROPERTY_OBLIGATION)
  public void setObligation_JsonNullable(JsonNullable<String> obligation) {
    this.obligation = obligation;
  }

  public void setObligation(String obligation) {
    this.obligation = JsonNullable.<String>of(obligation);
  }


  public TaxStatusObligations expiration(String expiration) {
    this.expiration = JsonNullable.<String>of(expiration);
    
    return this;
  }

   /**
   * The deadline to fulfill the obligation, as imposed by the tax authority
   * @return expiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Conjuntamente con la declaración anual del ejercicio.", value = "The deadline to fulfill the obligation, as imposed by the tax authority")
  @JsonIgnore

  public String getExpiration() {
        return expiration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExpiration_JsonNullable() {
    return expiration;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  public void setExpiration_JsonNullable(JsonNullable<String> expiration) {
    this.expiration = expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = JsonNullable.<String>of(expiration);
  }


  public TaxStatusObligations initialDate(LocalDate initialDate) {
    this.initialDate = JsonNullable.<LocalDate>of(initialDate);
    
    return this;
  }

   /**
   * The date when obligation started.
   * @return initialDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sun Dec 06 00:00:00 UTC 2020", value = "The date when obligation started.")
  @JsonIgnore

  public LocalDate getInitialDate() {
        return initialDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INITIAL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getInitialDate_JsonNullable() {
    return initialDate;
  }
  
  @JsonProperty(JSON_PROPERTY_INITIAL_DATE)
  public void setInitialDate_JsonNullable(JsonNullable<LocalDate> initialDate) {
    this.initialDate = initialDate;
  }

  public void setInitialDate(LocalDate initialDate) {
    this.initialDate = JsonNullable.<LocalDate>of(initialDate);
  }


  public TaxStatusObligations endDate(LocalDate endDate) {
    this.endDate = JsonNullable.<LocalDate>of(endDate);
    
    return this;
  }

   /**
   * The date when obligation ended.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when obligation ended.")
  @JsonIgnore

  public LocalDate getEndDate() {
        return endDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getEndDate_JsonNullable() {
    return endDate;
  }
  
  @JsonProperty(JSON_PROPERTY_END_DATE)
  public void setEndDate_JsonNullable(JsonNullable<LocalDate> endDate) {
    this.endDate = endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = JsonNullable.<LocalDate>of(endDate);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxStatusObligations taxStatusObligations = (TaxStatusObligations) o;
    return equalsNullable(this.obligation, taxStatusObligations.obligation) &&
        equalsNullable(this.expiration, taxStatusObligations.expiration) &&
        equalsNullable(this.initialDate, taxStatusObligations.initialDate) &&
        equalsNullable(this.endDate, taxStatusObligations.endDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(obligation), hashCodeNullable(expiration), hashCodeNullable(initialDate), hashCodeNullable(endDate));
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
    sb.append("class TaxStatusObligations {\n");
    sb.append("    obligation: ").append(toIndentedString(obligation)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    initialDate: ").append(toIndentedString(initialDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

