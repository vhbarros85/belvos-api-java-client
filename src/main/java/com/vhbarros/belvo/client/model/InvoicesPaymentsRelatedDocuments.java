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
 * List of all the related deferred invoices affected by the payment.
 */
@ApiModel(description = "List of all the related deferred invoices affected by the payment.")
@JsonPropertyOrder({
  InvoicesPaymentsRelatedDocuments.JSON_PROPERTY_INVOICE_IDENTIFICATION,
  InvoicesPaymentsRelatedDocuments.JSON_PROPERTY_CURRENCY,
  InvoicesPaymentsRelatedDocuments.JSON_PROPERTY_PAYMENT_METHOD,
  InvoicesPaymentsRelatedDocuments.JSON_PROPERTY_PARTIALITY_NUMBER,
  InvoicesPaymentsRelatedDocuments.JSON_PROPERTY_PREVIOUS_BALANCE,
  InvoicesPaymentsRelatedDocuments.JSON_PROPERTY_AMOUNT_PAID,
  InvoicesPaymentsRelatedDocuments.JSON_PROPERTY_OUTSTANDING_BALANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class InvoicesPaymentsRelatedDocuments {
  public static final String JSON_PROPERTY_INVOICE_IDENTIFICATION = "invoice_identification";
  private String invoiceIdentification;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "payment_method";
  private String paymentMethod;

  public static final String JSON_PROPERTY_PARTIALITY_NUMBER = "partiality_number";
  private Integer partialityNumber;

  public static final String JSON_PROPERTY_PREVIOUS_BALANCE = "previous_balance";
  private Float previousBalance;

  public static final String JSON_PROPERTY_AMOUNT_PAID = "amount_paid";
  private Float amountPaid;

  public static final String JSON_PROPERTY_OUTSTANDING_BALANCE = "outstanding_balance";
  private Float outstandingBalance;

  public InvoicesPaymentsRelatedDocuments() {
  }

  public InvoicesPaymentsRelatedDocuments invoiceIdentification(String invoiceIdentification) {
    
    this.invoiceIdentification = invoiceIdentification;
    return this;
  }

   /**
   * The fiscal institution&#39;s unique ID for the related deferred invoice.
   * @return invoiceIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7EE015F3-6311-11EA-B02A-00155D014007", required = true, value = "The fiscal institution's unique ID for the related deferred invoice.")
  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInvoiceIdentification() {
    return invoiceIdentification;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvoiceIdentification(String invoiceIdentification) {
    this.invoiceIdentification = invoiceIdentification;
  }


  public InvoicesPaymentsRelatedDocuments currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the related invoice. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MXN", required = true, value = "The currency of the related invoice. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public InvoicesPaymentsRelatedDocuments paymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The payment method of the related invoice.
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PPD", required = true, value = "The payment method of the related invoice.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public InvoicesPaymentsRelatedDocuments partialityNumber(Integer partialityNumber) {
    
    this.partialityNumber = partialityNumber;
    return this;
  }

   /**
   * The payment installment number.
   * @return partialityNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The payment installment number.")
  @JsonProperty(JSON_PROPERTY_PARTIALITY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPartialityNumber() {
    return partialityNumber;
  }


  @JsonProperty(JSON_PROPERTY_PARTIALITY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartialityNumber(Integer partialityNumber) {
    this.partialityNumber = partialityNumber;
  }


  public InvoicesPaymentsRelatedDocuments previousBalance(Float previousBalance) {
    
    this.previousBalance = previousBalance;
    return this;
  }

   /**
   * The invoice amount before the payment.
   * @return previousBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18877.84", required = true, value = "The invoice amount before the payment.")
  @JsonProperty(JSON_PROPERTY_PREVIOUS_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getPreviousBalance() {
    return previousBalance;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreviousBalance(Float previousBalance) {
    this.previousBalance = previousBalance;
  }


  public InvoicesPaymentsRelatedDocuments amountPaid(Float amountPaid) {
    
    this.amountPaid = amountPaid;
    return this;
  }

   /**
   * The amount paid in this installment.
   * @return amountPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8000", required = true, value = "The amount paid in this installment.")
  @JsonProperty(JSON_PROPERTY_AMOUNT_PAID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getAmountPaid() {
    return amountPaid;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_PAID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountPaid(Float amountPaid) {
    this.amountPaid = amountPaid;
  }


  public InvoicesPaymentsRelatedDocuments outstandingBalance(Float outstandingBalance) {
    
    this.outstandingBalance = outstandingBalance;
    return this;
  }

   /**
   * The amount remaining to be paid.
   * @return outstandingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10877.84", required = true, value = "The amount remaining to be paid.")
  @JsonProperty(JSON_PROPERTY_OUTSTANDING_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getOutstandingBalance() {
    return outstandingBalance;
  }


  @JsonProperty(JSON_PROPERTY_OUTSTANDING_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOutstandingBalance(Float outstandingBalance) {
    this.outstandingBalance = outstandingBalance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicesPaymentsRelatedDocuments invoicesPaymentsRelatedDocuments = (InvoicesPaymentsRelatedDocuments) o;
    return Objects.equals(this.invoiceIdentification, invoicesPaymentsRelatedDocuments.invoiceIdentification) &&
        Objects.equals(this.currency, invoicesPaymentsRelatedDocuments.currency) &&
        Objects.equals(this.paymentMethod, invoicesPaymentsRelatedDocuments.paymentMethod) &&
        Objects.equals(this.partialityNumber, invoicesPaymentsRelatedDocuments.partialityNumber) &&
        Objects.equals(this.previousBalance, invoicesPaymentsRelatedDocuments.previousBalance) &&
        Objects.equals(this.amountPaid, invoicesPaymentsRelatedDocuments.amountPaid) &&
        Objects.equals(this.outstandingBalance, invoicesPaymentsRelatedDocuments.outstandingBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceIdentification, currency, paymentMethod, partialityNumber, previousBalance, amountPaid, outstandingBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicesPaymentsRelatedDocuments {\n");
    sb.append("    invoiceIdentification: ").append(toIndentedString(invoiceIdentification)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    partialityNumber: ").append(toIndentedString(partialityNumber)).append("\n");
    sb.append("    previousBalance: ").append(toIndentedString(previousBalance)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    outstandingBalance: ").append(toIndentedString(outstandingBalance)).append("\n");
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

