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
import com.vhbarros.belvo.client.model.InvoicesPaymentsRelatedDocuments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InvoicesPayments
 */
@JsonPropertyOrder({
  InvoicesPayments.JSON_PROPERTY_DATE,
  InvoicesPayments.JSON_PROPERTY_PAYMENT_TYPE,
  InvoicesPayments.JSON_PROPERTY_CURRENCY,
  InvoicesPayments.JSON_PROPERTY_EXCHANGE_RATE,
  InvoicesPayments.JSON_PROPERTY_AMOUNT,
  InvoicesPayments.JSON_PROPERTY_OPERATION_NUMBER,
  InvoicesPayments.JSON_PROPERTY_BENEFICIARY_RFC,
  InvoicesPayments.JSON_PROPERTY_BENEFICIARY_ACCOUNT_NUMBER,
  InvoicesPayments.JSON_PROPERTY_PAYER_RFC,
  InvoicesPayments.JSON_PROPERTY_PAYER_ACCOUNT_NUMBER,
  InvoicesPayments.JSON_PROPERTY_PAYER_BANK_NAME,
  InvoicesPayments.JSON_PROPERTY_RELATED_DOCUMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class InvoicesPayments {
  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_PAYMENT_TYPE = "payment_type";
  private String paymentType;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_EXCHANGE_RATE = "exchange_rate";
  private String exchangeRate;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Float amount;

  public static final String JSON_PROPERTY_OPERATION_NUMBER = "operation_number";
  private String operationNumber;

  public static final String JSON_PROPERTY_BENEFICIARY_RFC = "beneficiary_rfc";
  private JsonNullable<String> beneficiaryRfc = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BENEFICIARY_ACCOUNT_NUMBER = "beneficiary_account_number";
  private String beneficiaryAccountNumber;

  public static final String JSON_PROPERTY_PAYER_RFC = "payer_rfc";
  private String payerRfc;

  public static final String JSON_PROPERTY_PAYER_ACCOUNT_NUMBER = "payer_account_number";
  private String payerAccountNumber;

  public static final String JSON_PROPERTY_PAYER_BANK_NAME = "payer_bank_name";
  private String payerBankName;

  public static final String JSON_PROPERTY_RELATED_DOCUMENTS = "related_documents";
  private List<InvoicesPaymentsRelatedDocuments> relatedDocuments = new ArrayList<>();

  public InvoicesPayments() {
  }

  public InvoicesPayments date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * ISO-8601 timestamp when the payment was made.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-03-17T12:00Z", required = true, value = "ISO-8601 timestamp when the payment was made.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public InvoicesPayments paymentType(String paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Payment type code used for this invoice, as defined by the country&#39;s legal entity. - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-type) 
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "03", required = true, value = "Payment type code used for this invoice, as defined by the country's legal entity. - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-type) ")
  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentType() {
    return paymentType;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }


  public InvoicesPayments currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the payment. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BRL", required = true, value = "The currency of the payment. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned.")
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


  public InvoicesPayments exchangeRate(String exchangeRate) {
    
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * The &#x60;currency&#x60; to MXN currency exchange rate when the payment was made.
   * @return exchangeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.75", required = true, value = "The `currency` to MXN currency exchange rate when the payment was made.")
  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExchangeRate() {
    return exchangeRate;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


  public InvoicesPayments amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The invoice amount, in the currency of the original invoice.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8000.5", required = true, value = "The invoice amount, in the currency of the original invoice.")
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


  public InvoicesPayments operationNumber(String operationNumber) {
    
    this.operationNumber = operationNumber;
    return this;
  }

   /**
   * The fiscal institution&#39;s internal identifier for the operation.
   * @return operationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "831840", required = true, value = "The fiscal institution's internal identifier for the operation.")
  @JsonProperty(JSON_PROPERTY_OPERATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOperationNumber() {
    return operationNumber;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperationNumber(String operationNumber) {
    this.operationNumber = operationNumber;
  }


  public InvoicesPayments beneficiaryRfc(String beneficiaryRfc) {
    this.beneficiaryRfc = JsonNullable.<String>of(beneficiaryRfc);
    
    return this;
  }

   /**
   * The fiscal ID of the payment beneficiary.
   * @return beneficiaryRfc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BNM840515VB1", value = "The fiscal ID of the payment beneficiary.")
  @JsonIgnore

  public String getBeneficiaryRfc() {
        return beneficiaryRfc.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BENEFICIARY_RFC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBeneficiaryRfc_JsonNullable() {
    return beneficiaryRfc;
  }
  
  @JsonProperty(JSON_PROPERTY_BENEFICIARY_RFC)
  public void setBeneficiaryRfc_JsonNullable(JsonNullable<String> beneficiaryRfc) {
    this.beneficiaryRfc = beneficiaryRfc;
  }

  public void setBeneficiaryRfc(String beneficiaryRfc) {
    this.beneficiaryRfc = JsonNullable.<String>of(beneficiaryRfc);
  }


  public InvoicesPayments beneficiaryAccountNumber(String beneficiaryAccountNumber) {
    
    this.beneficiaryAccountNumber = beneficiaryAccountNumber;
    return this;
  }

   /**
   * The bank account number of the payment beneficiary.
   * @return beneficiaryAccountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12343453245633", required = true, value = "The bank account number of the payment beneficiary.")
  @JsonProperty(JSON_PROPERTY_BENEFICIARY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBeneficiaryAccountNumber() {
    return beneficiaryAccountNumber;
  }


  @JsonProperty(JSON_PROPERTY_BENEFICIARY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBeneficiaryAccountNumber(String beneficiaryAccountNumber) {
    this.beneficiaryAccountNumber = beneficiaryAccountNumber;
  }


  public InvoicesPayments payerRfc(String payerRfc) {
    
    this.payerRfc = payerRfc;
    return this;
  }

   /**
   * The fiscal ID of the payment issuer.
   * @return payerRfc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BKJM840515VB1", required = true, value = "The fiscal ID of the payment issuer.")
  @JsonProperty(JSON_PROPERTY_PAYER_RFC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPayerRfc() {
    return payerRfc;
  }


  @JsonProperty(JSON_PROPERTY_PAYER_RFC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayerRfc(String payerRfc) {
    this.payerRfc = payerRfc;
  }


  public InvoicesPayments payerAccountNumber(String payerAccountNumber) {
    
    this.payerAccountNumber = payerAccountNumber;
    return this;
  }

   /**
   * The bank account number of the payment issuer.
   * @return payerAccountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13343663245699", required = true, value = "The bank account number of the payment issuer.")
  @JsonProperty(JSON_PROPERTY_PAYER_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPayerAccountNumber() {
    return payerAccountNumber;
  }


  @JsonProperty(JSON_PROPERTY_PAYER_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayerAccountNumber(String payerAccountNumber) {
    this.payerAccountNumber = payerAccountNumber;
  }


  public InvoicesPayments payerBankName(String payerBankName) {
    
    this.payerBankName = payerBankName;
    return this;
  }

   /**
   * The banking institution that was used by the payment issuer.
   * @return payerBankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CITI BANAMEX", required = true, value = "The banking institution that was used by the payment issuer.")
  @JsonProperty(JSON_PROPERTY_PAYER_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPayerBankName() {
    return payerBankName;
  }


  @JsonProperty(JSON_PROPERTY_PAYER_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayerBankName(String payerBankName) {
    this.payerBankName = payerBankName;
  }


  public InvoicesPayments relatedDocuments(List<InvoicesPaymentsRelatedDocuments> relatedDocuments) {
    
    this.relatedDocuments = relatedDocuments;
    return this;
  }

  public InvoicesPayments addRelatedDocumentsItem(InvoicesPaymentsRelatedDocuments relatedDocumentsItem) {
    this.relatedDocuments.add(relatedDocumentsItem);
    return this;
  }

   /**
   * A list of all the related deferred invoices affected by the payment.
   * @return relatedDocuments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of all the related deferred invoices affected by the payment.")
  @JsonProperty(JSON_PROPERTY_RELATED_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<InvoicesPaymentsRelatedDocuments> getRelatedDocuments() {
    return relatedDocuments;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRelatedDocuments(List<InvoicesPaymentsRelatedDocuments> relatedDocuments) {
    this.relatedDocuments = relatedDocuments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicesPayments invoicesPayments = (InvoicesPayments) o;
    return Objects.equals(this.date, invoicesPayments.date) &&
        Objects.equals(this.paymentType, invoicesPayments.paymentType) &&
        Objects.equals(this.currency, invoicesPayments.currency) &&
        Objects.equals(this.exchangeRate, invoicesPayments.exchangeRate) &&
        Objects.equals(this.amount, invoicesPayments.amount) &&
        Objects.equals(this.operationNumber, invoicesPayments.operationNumber) &&
        equalsNullable(this.beneficiaryRfc, invoicesPayments.beneficiaryRfc) &&
        Objects.equals(this.beneficiaryAccountNumber, invoicesPayments.beneficiaryAccountNumber) &&
        Objects.equals(this.payerRfc, invoicesPayments.payerRfc) &&
        Objects.equals(this.payerAccountNumber, invoicesPayments.payerAccountNumber) &&
        Objects.equals(this.payerBankName, invoicesPayments.payerBankName) &&
        Objects.equals(this.relatedDocuments, invoicesPayments.relatedDocuments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, paymentType, currency, exchangeRate, amount, operationNumber, hashCodeNullable(beneficiaryRfc), beneficiaryAccountNumber, payerRfc, payerAccountNumber, payerBankName, relatedDocuments);
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
    sb.append("class InvoicesPayments {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    operationNumber: ").append(toIndentedString(operationNumber)).append("\n");
    sb.append("    beneficiaryRfc: ").append(toIndentedString(beneficiaryRfc)).append("\n");
    sb.append("    beneficiaryAccountNumber: ").append(toIndentedString(beneficiaryAccountNumber)).append("\n");
    sb.append("    payerRfc: ").append(toIndentedString(payerRfc)).append("\n");
    sb.append("    payerAccountNumber: ").append(toIndentedString(payerAccountNumber)).append("\n");
    sb.append("    payerBankName: ").append(toIndentedString(payerBankName)).append("\n");
    sb.append("    relatedDocuments: ").append(toIndentedString(relatedDocuments)).append("\n");
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

