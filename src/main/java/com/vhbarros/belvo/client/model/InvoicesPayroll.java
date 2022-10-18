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
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Details regarding the payroll payment. Only applicable for payroll invoices.
 */
@ApiModel(description = "Details regarding the payroll payment. Only applicable for payroll invoices.")
@JsonPropertyOrder({
  InvoicesPayroll.JSON_PROPERTY_DAYS,
  InvoicesPayroll.JSON_PROPERTY_TYPE,
  InvoicesPayroll.JSON_PROPERTY_AMOUNT,
  InvoicesPayroll.JSON_PROPERTY_VERSION,
  InvoicesPayroll.JSON_PROPERTY_DATE_FROM,
  InvoicesPayroll.JSON_PROPERTY_DATE_TO,
  InvoicesPayroll.JSON_PROPERTY_COLLECTED_AT,
  InvoicesPayroll.JSON_PROPERTY_PAYMENT_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class InvoicesPayroll {
  public static final String JSON_PROPERTY_DAYS = "days";
  private Integer days;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Float amount;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_DATE_FROM = "date_from";
  private LocalDate dateFrom;

  public static final String JSON_PROPERTY_DATE_TO = "date_to";
  private LocalDate dateTo;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private JsonNullable<OffsetDateTime> collectedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_PAYMENT_DATE = "payment_date";
  private LocalDate paymentDate;

  public InvoicesPayroll() {
  }

  public InvoicesPayroll days(Integer days) {
    
    this.days = days;
    return this;
  }

   /**
   * The number of days covered by the payment.
   * @return days
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", required = true, value = "The number of days covered by the payment.")
  @JsonProperty(JSON_PROPERTY_DAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDays() {
    return days;
  }


  @JsonProperty(JSON_PROPERTY_DAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDays(Integer days) {
    this.days = days;
  }


  public InvoicesPayroll type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The payroll type, as defined by the legal entity of the country. - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payroll-type) 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "O", required = true, value = "The payroll type, as defined by the legal entity of the country. - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payroll-type) ")
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


  public InvoicesPayroll amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The total amount of the payroll payment.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20400.1", required = true, value = "The total amount of the payroll payment.")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public InvoicesPayroll version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the payroll object.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1.2", required = true, value = "The version of the payroll object.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(String version) {
    this.version = version;
  }


  public InvoicesPayroll dateFrom(LocalDate dateFrom) {
    
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * The start date of the payment period.
   * @return dateFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sun Jul 01 00:00:00 UTC 2018", required = true, value = "The start date of the payment period.")
  @JsonProperty(JSON_PROPERTY_DATE_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getDateFrom() {
    return dateFrom;
  }


  @JsonProperty(JSON_PROPERTY_DATE_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }


  public InvoicesPayroll dateTo(LocalDate dateTo) {
    
    this.dateTo = dateTo;
    return this;
  }

   /**
   * The end date of the payment period.
   * @return dateTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Jul 31 00:00:00 UTC 2018", required = true, value = "The end date of the payment period.")
  @JsonProperty(JSON_PROPERTY_DATE_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getDateTo() {
    return dateTo;
  }


  @JsonProperty(JSON_PROPERTY_DATE_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }


  public InvoicesPayroll collectedAt(OffsetDateTime collectedAt) {
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


  public InvoicesPayroll paymentDate(LocalDate paymentDate) {
    
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * The payment date.
   * @return paymentDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The payment date.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getPaymentDate() {
    return paymentDate;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicesPayroll invoicesPayroll = (InvoicesPayroll) o;
    return Objects.equals(this.days, invoicesPayroll.days) &&
        Objects.equals(this.type, invoicesPayroll.type) &&
        Objects.equals(this.amount, invoicesPayroll.amount) &&
        Objects.equals(this.version, invoicesPayroll.version) &&
        Objects.equals(this.dateFrom, invoicesPayroll.dateFrom) &&
        Objects.equals(this.dateTo, invoicesPayroll.dateTo) &&
        equalsNullable(this.collectedAt, invoicesPayroll.collectedAt) &&
        Objects.equals(this.paymentDate, invoicesPayroll.paymentDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, type, amount, version, dateFrom, dateTo, hashCodeNullable(collectedAt), paymentDate);
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
    sb.append("class InvoicesPayroll {\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
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

