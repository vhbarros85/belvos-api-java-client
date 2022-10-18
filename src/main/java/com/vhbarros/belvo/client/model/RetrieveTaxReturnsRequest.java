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
import com.vhbarros.belvo.client.model.TaxReturnsMonthlyRequest;
import com.vhbarros.belvo.client.model.TaxReturnsYearlyRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RetrieveTaxReturnsRequest
 */
@JsonPropertyOrder({
  RetrieveTaxReturnsRequest.JSON_PROPERTY_LINK,
  RetrieveTaxReturnsRequest.JSON_PROPERTY_ATTACH_PDF,
  RetrieveTaxReturnsRequest.JSON_PROPERTY_SAVE_DATA,
  RetrieveTaxReturnsRequest.JSON_PROPERTY_TYPE,
  RetrieveTaxReturnsRequest.JSON_PROPERTY_DATE_FROM,
  RetrieveTaxReturnsRequest.JSON_PROPERTY_DATE_TO,
  RetrieveTaxReturnsRequest.JSON_PROPERTY_YEAR_FROM,
  RetrieveTaxReturnsRequest.JSON_PROPERTY_YEAR_TO
})
@JsonTypeName("RetrieveTaxReturns_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class RetrieveTaxReturnsRequest {
  public static final String JSON_PROPERTY_LINK = "link";
  private UUID link;

  public static final String JSON_PROPERTY_ATTACH_PDF = "attach_pdf";
  private Boolean attachPdf = false;

  public static final String JSON_PROPERTY_SAVE_DATA = "save_data";
  private Boolean saveData = true;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "yearly";

  public static final String JSON_PROPERTY_DATE_FROM = "date_from";
  private String dateFrom;

  public static final String JSON_PROPERTY_DATE_TO = "date_to";
  private String dateTo;

  public static final String JSON_PROPERTY_YEAR_FROM = "year_from";
  private String yearFrom;

  public static final String JSON_PROPERTY_YEAR_TO = "year_to";
  private String yearTo;

  public RetrieveTaxReturnsRequest() {
  }

  public RetrieveTaxReturnsRequest link(UUID link) {
    
    this.link = link;
    return this;
  }

   /**
   * The fiscal &#x60;link.id&#x60; you want specific tax return information for.
   * @return link
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "d4617561-1c01-4b2f-83b6-a594f7b3bc57", required = true, value = "The fiscal `link.id` you want specific tax return information for.")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLink(UUID link) {
    this.link = link;
  }


  public RetrieveTaxReturnsRequest attachPdf(Boolean attachPdf) {
    
    this.attachPdf = attachPdf;
    return this;
  }

   /**
   * When this is set to &#x60;true&#x60;, you will receive the PDF as a binary string in the response.
   * @return attachPdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "When this is set to `true`, you will receive the PDF as a binary string in the response.")
  @JsonProperty(JSON_PROPERTY_ATTACH_PDF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAttachPdf() {
    return attachPdf;
  }


  @JsonProperty(JSON_PROPERTY_ATTACH_PDF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachPdf(Boolean attachPdf) {
    this.attachPdf = attachPdf;
  }


  public RetrieveTaxReturnsRequest saveData(Boolean saveData) {
    
    this.saveData = saveData;
    return this;
  }

   /**
   * Indicates whether or not to persist the data in Belvo. By default, this is set to &#x60;true&#x60; and we return a 201 Created response. When set to &#x60;false&#x60;, the data won&#39;t be persisted and we return a 200 OK response.
   * @return saveData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether or not to persist the data in Belvo. By default, this is set to `true` and we return a 201 Created response. When set to `false`, the data won't be persisted and we return a 200 OK response.")
  @JsonProperty(JSON_PROPERTY_SAVE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSaveData() {
    return saveData;
  }


  @JsonProperty(JSON_PROPERTY_SAVE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaveData(Boolean saveData) {
    this.saveData = saveData;
  }


  public RetrieveTaxReturnsRequest type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of tax return to return. For yearly tax returns this must be set to &#x60;yearly&#x60;.  By default, Belvo returns the yearly (annual) tax returns. 
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of tax return to return. For yearly tax returns this must be set to `yearly`.  By default, Belvo returns the yearly (annual) tax returns. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public RetrieveTaxReturnsRequest dateFrom(String dateFrom) {
    
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * The starting date you want to get tax returns for, in &#x60;YYYY-MM-DD&#x60; format.  ⚠️ The value of &#x60;date_from&#x60; cannot be greater than &#x60;date_to&#x60;.
   * @return dateFrom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2018-01-01", required = true, value = "The starting date you want to get tax returns for, in `YYYY-MM-DD` format.  ⚠️ The value of `date_from` cannot be greater than `date_to`.")
  @JsonProperty(JSON_PROPERTY_DATE_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDateFrom() {
    return dateFrom;
  }


  @JsonProperty(JSON_PROPERTY_DATE_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
  }


  public RetrieveTaxReturnsRequest dateTo(String dateTo) {
    
    this.dateTo = dateTo;
    return this;
  }

   /**
   * The date you want to stop getting tax returns for, in &#x60;YYYY-MM-DD&#x60; format.  ⚠️ The value of &#x60;date_to&#x60; cannot be greater than today&#39;s date (in other words, no future dates).
   * @return dateTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-01-01", required = true, value = "The date you want to stop getting tax returns for, in `YYYY-MM-DD` format.  ⚠️ The value of `date_to` cannot be greater than today's date (in other words, no future dates).")
  @JsonProperty(JSON_PROPERTY_DATE_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDateTo() {
    return dateTo;
  }


  @JsonProperty(JSON_PROPERTY_DATE_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }


  public RetrieveTaxReturnsRequest yearFrom(String yearFrom) {
    
    this.yearFrom = yearFrom;
    return this;
  }

   /**
   * The starting year you want to get tax returns for, in &#x60;YYYY&#x60; format. 
   * @return yearFrom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2018", required = true, value = "The starting year you want to get tax returns for, in `YYYY` format. ")
  @JsonProperty(JSON_PROPERTY_YEAR_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getYearFrom() {
    return yearFrom;
  }


  @JsonProperty(JSON_PROPERTY_YEAR_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setYearFrom(String yearFrom) {
    this.yearFrom = yearFrom;
  }


  public RetrieveTaxReturnsRequest yearTo(String yearTo) {
    
    this.yearTo = yearTo;
    return this;
  }

   /**
   * The year you want to stop getting tax returns for, in &#x60;YYYY&#x60; format. 
   * @return yearTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019", required = true, value = "The year you want to stop getting tax returns for, in `YYYY` format. ")
  @JsonProperty(JSON_PROPERTY_YEAR_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getYearTo() {
    return yearTo;
  }


  @JsonProperty(JSON_PROPERTY_YEAR_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setYearTo(String yearTo) {
    this.yearTo = yearTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveTaxReturnsRequest retrieveTaxReturnsRequest = (RetrieveTaxReturnsRequest) o;
    return Objects.equals(this.link, retrieveTaxReturnsRequest.link) &&
        Objects.equals(this.attachPdf, retrieveTaxReturnsRequest.attachPdf) &&
        Objects.equals(this.saveData, retrieveTaxReturnsRequest.saveData) &&
        Objects.equals(this.type, retrieveTaxReturnsRequest.type) &&
        Objects.equals(this.dateFrom, retrieveTaxReturnsRequest.dateFrom) &&
        Objects.equals(this.dateTo, retrieveTaxReturnsRequest.dateTo) &&
        Objects.equals(this.yearFrom, retrieveTaxReturnsRequest.yearFrom) &&
        Objects.equals(this.yearTo, retrieveTaxReturnsRequest.yearTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, attachPdf, saveData, type, dateFrom, dateTo, yearFrom, yearTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveTaxReturnsRequest {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    attachPdf: ").append(toIndentedString(attachPdf)).append("\n");
    sb.append("    saveData: ").append(toIndentedString(saveData)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    yearFrom: ").append(toIndentedString(yearFrom)).append("\n");
    sb.append("    yearTo: ").append(toIndentedString(yearTo)).append("\n");
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

