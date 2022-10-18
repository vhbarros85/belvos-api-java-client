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
import java.io.File;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TaxComplianceStatus
 */
@JsonPropertyOrder({
  TaxComplianceStatus.JSON_PROPERTY_ID,
  TaxComplianceStatus.JSON_PROPERTY_COLLECTED_AT,
  TaxComplianceStatus.JSON_PROPERTY_CREATED_AT,
  TaxComplianceStatus.JSON_PROPERTY_INTERNAL_IDENTIFICATION,
  TaxComplianceStatus.JSON_PROPERTY_PDF,
  TaxComplianceStatus.JSON_PROPERTY_RFC,
  TaxComplianceStatus.JSON_PROPERTY_OUTCOME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class TaxComplianceStatus {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private OffsetDateTime collectedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_INTERNAL_IDENTIFICATION = "internal_identification";
  private JsonNullable<String> internalIdentification = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PDF = "pdf";
  private File pdf;

  public static final String JSON_PROPERTY_RFC = "rfc";
  private JsonNullable<String> rfc = JsonNullable.<String>undefined();

  /**
   * Indicates whether the taxpayer is complying to all their tax obligations (&#x60;POSITIVE&#x60;), if they are not (&#x60;NEGATIVE&#x60;), or have none to comply to (&#x60;NO_OBLIGATIONS&#x60;).
   */
  public enum OutcomeEnum {
    POSITIVE("POSITIVE"),
    
    NEGATIVE("NEGATIVE"),
    
    NO_OBLIGATIONS("NO_OBLIGATIONS");

    private String value;

    OutcomeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OutcomeEnum fromValue(String value) {
      for (OutcomeEnum b : OutcomeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_OUTCOME = "outcome";
  private JsonNullable<OutcomeEnum> outcome = JsonNullable.<OutcomeEnum>undefined();

  public TaxComplianceStatus() {
  }

  public TaxComplianceStatus id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier created by Belvo used to reference the current Tax Compliance Status.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "91106968-1abd-4d64-85c1-4e73d96fb997", value = "Unique identifier created by Belvo used to reference the current Tax Compliance Status.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public TaxComplianceStatus collectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
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


  public TaxComplianceStatus createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-09T08:45:50.406032Z", value = "The ISO-8601 timestamp of when the data point was last updated in Belvo's database.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public TaxComplianceStatus internalIdentification(String internalIdentification) {
    this.internalIdentification = JsonNullable.<String>of(internalIdentification);
    
    return this;
  }

   /**
   * The institution’s internal identification number for the document.
   * @return internalIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20NE1234567", value = "The institution’s internal identification number for the document.")
  @JsonIgnore

  public String getInternalIdentification() {
        return internalIdentification.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTERNAL_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInternalIdentification_JsonNullable() {
    return internalIdentification;
  }
  
  @JsonProperty(JSON_PROPERTY_INTERNAL_IDENTIFICATION)
  public void setInternalIdentification_JsonNullable(JsonNullable<String> internalIdentification) {
    this.internalIdentification = internalIdentification;
  }

  public void setInternalIdentification(String internalIdentification) {
    this.internalIdentification = JsonNullable.<String>of(internalIdentification);
  }


  public TaxComplianceStatus pdf(File pdf) {
    
    this.pdf = pdf;
    return this;
  }

   /**
   * Tax compliance status PDF as a binary.
   * @return pdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@2b69f803", required = true, value = "Tax compliance status PDF as a binary.")
  @JsonProperty(JSON_PROPERTY_PDF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public File getPdf() {
    return pdf;
  }


  @JsonProperty(JSON_PROPERTY_PDF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPdf(File pdf) {
    this.pdf = pdf;
  }


  public TaxComplianceStatus rfc(String rfc) {
    this.rfc = JsonNullable.<String>of(rfc);
    
    return this;
  }

   /**
   * The account holder&#39;s RFC (Registro Federal de Contribuyentes) number.
   * @return rfc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "KDFC211118IS0", value = "The account holder's RFC (Registro Federal de Contribuyentes) number.")
  @JsonIgnore

  public String getRfc() {
        return rfc.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RFC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRfc_JsonNullable() {
    return rfc;
  }
  
  @JsonProperty(JSON_PROPERTY_RFC)
  public void setRfc_JsonNullable(JsonNullable<String> rfc) {
    this.rfc = rfc;
  }

  public void setRfc(String rfc) {
    this.rfc = JsonNullable.<String>of(rfc);
  }


  public TaxComplianceStatus outcome(OutcomeEnum outcome) {
    this.outcome = JsonNullable.<OutcomeEnum>of(outcome);
    
    return this;
  }

   /**
   * Indicates whether the taxpayer is complying to all their tax obligations (&#x60;POSITIVE&#x60;), if they are not (&#x60;NEGATIVE&#x60;), or have none to comply to (&#x60;NO_OBLIGATIONS&#x60;).
   * @return outcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NEGATIVE", value = "Indicates whether the taxpayer is complying to all their tax obligations (`POSITIVE`), if they are not (`NEGATIVE`), or have none to comply to (`NO_OBLIGATIONS`).")
  @JsonIgnore

  public OutcomeEnum getOutcome() {
        return outcome.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OutcomeEnum> getOutcome_JsonNullable() {
    return outcome;
  }
  
  @JsonProperty(JSON_PROPERTY_OUTCOME)
  public void setOutcome_JsonNullable(JsonNullable<OutcomeEnum> outcome) {
    this.outcome = outcome;
  }

  public void setOutcome(OutcomeEnum outcome) {
    this.outcome = JsonNullable.<OutcomeEnum>of(outcome);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxComplianceStatus taxComplianceStatus = (TaxComplianceStatus) o;
    return Objects.equals(this.id, taxComplianceStatus.id) &&
        Objects.equals(this.collectedAt, taxComplianceStatus.collectedAt) &&
        Objects.equals(this.createdAt, taxComplianceStatus.createdAt) &&
        equalsNullable(this.internalIdentification, taxComplianceStatus.internalIdentification) &&
        Objects.equals(this.pdf, taxComplianceStatus.pdf) &&
        equalsNullable(this.rfc, taxComplianceStatus.rfc) &&
        equalsNullable(this.outcome, taxComplianceStatus.outcome);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, collectedAt, createdAt, hashCodeNullable(internalIdentification), pdf, hashCodeNullable(rfc), hashCodeNullable(outcome));
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
    sb.append("class TaxComplianceStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    internalIdentification: ").append(toIndentedString(internalIdentification)).append("\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
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

