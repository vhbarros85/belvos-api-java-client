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
import com.vhbarros.belvo.client.model.InvoiceDetail;
import com.vhbarros.belvo.client.model.InvoiceWarnings;
import com.vhbarros.belvo.client.model.InvoicesPayments;
import com.vhbarros.belvo.client.model.InvoicesPayroll;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InvoiceWithId
 */
@JsonPropertyOrder({
  InvoiceWithId.JSON_PROPERTY_ID,
  InvoiceWithId.JSON_PROPERTY_LINK,
  InvoiceWithId.JSON_PROPERTY_COLLECTED_AT,
  InvoiceWithId.JSON_PROPERTY_CREATED_AT,
  InvoiceWithId.JSON_PROPERTY_INVOICE_IDENTIFICATION,
  InvoiceWithId.JSON_PROPERTY_INVOICE_DATE,
  InvoiceWithId.JSON_PROPERTY_STATUS,
  InvoiceWithId.JSON_PROPERTY_INVOICE_TYPE,
  InvoiceWithId.JSON_PROPERTY_TYPE,
  InvoiceWithId.JSON_PROPERTY_SENDER_ID,
  InvoiceWithId.JSON_PROPERTY_SENDER_NAME,
  InvoiceWithId.JSON_PROPERTY_SENDER_TAX_FRAUD_STATUS,
  InvoiceWithId.JSON_PROPERTY_RECEIVER_ID,
  InvoiceWithId.JSON_PROPERTY_RECEIVER_NAME,
  InvoiceWithId.JSON_PROPERTY_RECEIVER_TAX_FRAUD_STATUS,
  InvoiceWithId.JSON_PROPERTY_CANCELATION_STATUS,
  InvoiceWithId.JSON_PROPERTY_CANCELATION_UPDATE_DATE,
  InvoiceWithId.JSON_PROPERTY_CERTIFICATION_DATE,
  InvoiceWithId.JSON_PROPERTY_CERTIFICATION_AUTHORITY,
  InvoiceWithId.JSON_PROPERTY_PAYMENT_TYPE,
  InvoiceWithId.JSON_PROPERTY_PAYMENT_TYPE_DESCRIPTION,
  InvoiceWithId.JSON_PROPERTY_PAYMENT_METHOD,
  InvoiceWithId.JSON_PROPERTY_PAYMENT_METHOD_DESCRIPTION,
  InvoiceWithId.JSON_PROPERTY_USAGE,
  InvoiceWithId.JSON_PROPERTY_VERSION,
  InvoiceWithId.JSON_PROPERTY_PLACE_OF_ISSUE,
  InvoiceWithId.JSON_PROPERTY_INVOICE_DETAILS,
  InvoiceWithId.JSON_PROPERTY_CURRENCY,
  InvoiceWithId.JSON_PROPERTY_SUBTOTAL_AMOUNT,
  InvoiceWithId.JSON_PROPERTY_EXCHANGE_RATE,
  InvoiceWithId.JSON_PROPERTY_TAX_AMOUNT,
  InvoiceWithId.JSON_PROPERTY_DISCOUNT_AMOUNT,
  InvoiceWithId.JSON_PROPERTY_TOTAL_AMOUNT,
  InvoiceWithId.JSON_PROPERTY_PAYMENTS,
  InvoiceWithId.JSON_PROPERTY_PAYROLL,
  InvoiceWithId.JSON_PROPERTY_FOLIO,
  InvoiceWithId.JSON_PROPERTY_XML,
  InvoiceWithId.JSON_PROPERTY_WARNINGS,
  InvoiceWithId.JSON_PROPERTY_SENDER_BLACKLIST_STATUS,
  InvoiceWithId.JSON_PROPERTY_RECEIVER_BLACKLIST_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class InvoiceWithId {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_LINK = "link";
  private String link;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private OffsetDateTime collectedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_INVOICE_IDENTIFICATION = "invoice_identification";
  private String invoiceIdentification;

  public static final String JSON_PROPERTY_INVOICE_DATE = "invoice_date";
  private LocalDate invoiceDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  /**
   * The fiscal institution&#39;s classification of the invoice.  For Mexico&#39;s SAT, we return one of the following enum values:    - &#x60;Egreso&#x60;   - &#x60;Ingreso&#x60;   - &#x60;Nómina&#x60;   - &#x60;Pago&#x60;   - &#x60;Traslado&#x60; 
   */
  public enum InvoiceTypeEnum {
    EGRESO("Egreso"),
    
    INGRESO("Ingreso"),
    
    N_MINA("Nómina"),
    
    PAGO("Pago"),
    
    TRASLADO("Traslado");

    private String value;

    InvoiceTypeEnum(String value) {
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
    public static InvoiceTypeEnum fromValue(String value) {
      for (InvoiceTypeEnum b : InvoiceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_INVOICE_TYPE = "invoice_type";
  private InvoiceTypeEnum invoiceType;

  /**
   * The type of the invoice (from the perspective of the invoice sender). Can be either &#x60;INFLOW&#x60; or &#x60;OUTFLOW&#x60;. 
   */
  public enum TypeEnum {
    OUTFLOW("OUTFLOW"),
    
    INFLOW("INFLOW");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_SENDER_ID = "sender_id";
  private String senderId;

  public static final String JSON_PROPERTY_SENDER_NAME = "sender_name";
  private String senderName;

  public static final String JSON_PROPERTY_SENDER_TAX_FRAUD_STATUS = "sender_tax_fraud_status";
  private JsonNullable<String> senderTaxFraudStatus = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RECEIVER_ID = "receiver_id";
  private String receiverId;

  public static final String JSON_PROPERTY_RECEIVER_NAME = "receiver_name";
  private String receiverName;

  public static final String JSON_PROPERTY_RECEIVER_TAX_FRAUD_STATUS = "receiver_tax_fraud_status";
  private JsonNullable<String> receiverTaxFraudStatus = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CANCELATION_STATUS = "cancelation_status";
  private String cancelationStatus;

  public static final String JSON_PROPERTY_CANCELATION_UPDATE_DATE = "cancelation_update_date";
  private LocalDate cancelationUpdateDate;

  public static final String JSON_PROPERTY_CERTIFICATION_DATE = "certification_date";
  private LocalDate certificationDate;

  public static final String JSON_PROPERTY_CERTIFICATION_AUTHORITY = "certification_authority";
  private String certificationAuthority;

  public static final String JSON_PROPERTY_PAYMENT_TYPE = "payment_type";
  private String paymentType;

  public static final String JSON_PROPERTY_PAYMENT_TYPE_DESCRIPTION = "payment_type_description";
  private String paymentTypeDescription;

  /**
   * The payment method code used for this invoice, as defined by the legal entity of the country.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-method). For Mexico, we return &#x60;PUE&#x60;, &#x60;PIP&#x60;, OR &#x60;PPD&#x60;. 
   */
  public enum PaymentMethodEnum {
    PUE("PUE"),
    
    PIP("PIP"),
    
    PPD("PPD"),
    
    NULL("null");

    private String value;

    PaymentMethodEnum(String value) {
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
    public static PaymentMethodEnum fromValue(String value) {
      for (PaymentMethodEnum b : PaymentMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "payment_method";
  private JsonNullable<PaymentMethodEnum> paymentMethod = JsonNullable.<PaymentMethodEnum>undefined();

  public static final String JSON_PROPERTY_PAYMENT_METHOD_DESCRIPTION = "payment_method_description";
  private JsonNullable<String> paymentMethodDescription = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USAGE = "usage";
  private JsonNullable<String> usage = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VERSION = "version";
  private JsonNullable<String> version = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PLACE_OF_ISSUE = "place_of_issue";
  private JsonNullable<String> placeOfIssue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INVOICE_DETAILS = "invoice_details";
  private List<InvoiceDetail> invoiceDetails = new ArrayList<>();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_SUBTOTAL_AMOUNT = "subtotal_amount";
  private Float subtotalAmount;

  public static final String JSON_PROPERTY_EXCHANGE_RATE = "exchange_rate";
  private Float exchangeRate;

  public static final String JSON_PROPERTY_TAX_AMOUNT = "tax_amount";
  private Float taxAmount;

  public static final String JSON_PROPERTY_DISCOUNT_AMOUNT = "discount_amount";
  private Float discountAmount;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT = "total_amount";
  private Float totalAmount;

  public static final String JSON_PROPERTY_PAYMENTS = "payments";
  private List<InvoicesPayments> payments = new ArrayList<>();

  public static final String JSON_PROPERTY_PAYROLL = "payroll";
  private InvoicesPayroll payroll;

  public static final String JSON_PROPERTY_FOLIO = "folio";
  private JsonNullable<String> folio = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_XML = "xml";
  private JsonNullable<String> xml = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private JsonNullable<InvoiceWarnings> warnings = JsonNullable.<InvoiceWarnings>undefined();

  public static final String JSON_PROPERTY_SENDER_BLACKLIST_STATUS = "sender_blacklist_status";
  private JsonNullable<String> senderBlacklistStatus = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RECEIVER_BLACKLIST_STATUS = "receiver_blacklist_status";
  private JsonNullable<String> receiverBlacklistStatus = JsonNullable.<String>undefined();

  public InvoiceWithId() {
  }

  public InvoiceWithId id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique identifier used to reference the current invoice.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c749315b-eec2-435d-a458-06912878564f", value = "Belvo's unique identifier used to reference the current invoice.")
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


  public InvoiceWithId link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * The &#x60;link.id&#x60; the invoice belongs to.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", value = "The `link.id` the invoice belongs to.")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(String link) {
    this.link = link;
  }


  public InvoiceWithId collectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-09-27T13:01:41.941Z", required = true, value = "The ISO-8601 timestamp when the data point was collected.")
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


  public InvoiceWithId createdAt(OffsetDateTime createdAt) {
    
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


  public InvoiceWithId invoiceIdentification(String invoiceIdentification) {
    
    this.invoiceIdentification = invoiceIdentification;
    return this;
  }

   /**
   * The fiscal institution&#39;s unique ID for the invoice.
   * @return invoiceIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A1A1A1A1-2B2B-3C33-D44D-555555E55EE", required = true, value = "The fiscal institution's unique ID for the invoice.")
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


  public InvoiceWithId invoiceDate(LocalDate invoiceDate) {
    
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * The date of the invoice.
   * @return invoiceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sun Dec 01 00:00:00 UTC 2019", required = true, value = "The date of the invoice.")
  @JsonProperty(JSON_PROPERTY_INVOICE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getInvoiceDate() {
    return invoiceDate;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvoiceDate(LocalDate invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public InvoiceWithId status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the invoice. Can be either *Vigente* (valid) or *Cancelado* (cancelled).
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Vigente", required = true, value = "The status of the invoice. Can be either *Vigente* (valid) or *Cancelado* (cancelled).")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public InvoiceWithId invoiceType(InvoiceTypeEnum invoiceType) {
    
    this.invoiceType = invoiceType;
    return this;
  }

   /**
   * The fiscal institution&#39;s classification of the invoice.  For Mexico&#39;s SAT, we return one of the following enum values:    - &#x60;Egreso&#x60;   - &#x60;Ingreso&#x60;   - &#x60;Nómina&#x60;   - &#x60;Pago&#x60;   - &#x60;Traslado&#x60; 
   * @return invoiceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ingreso", required = true, value = "The fiscal institution's classification of the invoice.  For Mexico's SAT, we return one of the following enum values:    - `Egreso`   - `Ingreso`   - `Nómina`   - `Pago`   - `Traslado` ")
  @JsonProperty(JSON_PROPERTY_INVOICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InvoiceTypeEnum getInvoiceType() {
    return invoiceType;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvoiceType(InvoiceTypeEnum invoiceType) {
    this.invoiceType = invoiceType;
  }


  public InvoiceWithId type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the invoice (from the perspective of the invoice sender). Can be either &#x60;INFLOW&#x60; or &#x60;OUTFLOW&#x60;. 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OUTFLOW", required = true, value = "The type of the invoice (from the perspective of the invoice sender). Can be either `INFLOW` or `OUTFLOW`. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public InvoiceWithId senderId(String senderId) {
    
    this.senderId = senderId;
    return this;
  }

   /**
   * The fiscal ID of the invoice sender
   * @return senderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AAA111111AA11", required = true, value = "The fiscal ID of the invoice sender")
  @JsonProperty(JSON_PROPERTY_SENDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSenderId() {
    return senderId;
  }


  @JsonProperty(JSON_PROPERTY_SENDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }


  public InvoiceWithId senderName(String senderName) {
    
    this.senderName = senderName;
    return this;
  }

   /**
   * The name of the invoice sender.
   * @return senderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACME CORP", required = true, value = "The name of the invoice sender.")
  @JsonProperty(JSON_PROPERTY_SENDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSenderName() {
    return senderName;
  }


  @JsonProperty(JSON_PROPERTY_SENDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }


  public InvoiceWithId senderTaxFraudStatus(String senderTaxFraudStatus) {
    this.senderTaxFraudStatus = JsonNullable.<String>of(senderTaxFraudStatus);
    
    return this;
  }

   /**
   * Indicates whether or not the sender is on SAT&#39;s tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution&#39;s regulations.&lt;br&gt;&lt;br&gt; SAT updates the tax fraud list every three months. &lt;br&gt;&lt;br&gt; For more information regarding the reason&#39;s a taxpayer can be put on the tax fraud list, please see [Article 69](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69.html) and [Article 69-B](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69B.html) of Mexico&#39;s Código Fiscal de la Federación. &lt;br&gt;&lt;br&gt; Possible statuses are: - &#x60;INVESTIGATING&#x60; &lt;br&gt; The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. &lt;br&gt; - &#x60;DISMISSED&#x60; &lt;br&gt; The fiscal institution has investigated the taxpayer and declared them innocent. &lt;br&gt; - &#x60;CONFIRMED&#x60; &lt;br&gt; The fiscal institution has confirmed that the taxpayer is guilty. &lt;br&gt; - &#x60;OVERTURNED&#x60; &lt;br&gt; The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. &lt;br&gt; - &#x60;NO_TAX_FRAUD_STATUS&#x60; &lt;br&gt; The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution&#39;s regulations).
   * @return senderTaxFraudStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NO_TAX_FRAUD_STATUS", value = "Indicates whether or not the sender is on SAT's tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution's regulations.<br><br> SAT updates the tax fraud list every three months. <br><br> For more information regarding the reason's a taxpayer can be put on the tax fraud list, please see [Article 69](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69.html) and [Article 69-B](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69B.html) of Mexico's Código Fiscal de la Federación. <br><br> Possible statuses are: - `INVESTIGATING` <br> The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. <br> - `DISMISSED` <br> The fiscal institution has investigated the taxpayer and declared them innocent. <br> - `CONFIRMED` <br> The fiscal institution has confirmed that the taxpayer is guilty. <br> - `OVERTURNED` <br> The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. <br> - `NO_TAX_FRAUD_STATUS` <br> The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution's regulations).")
  @JsonIgnore

  public String getSenderTaxFraudStatus() {
        return senderTaxFraudStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SENDER_TAX_FRAUD_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSenderTaxFraudStatus_JsonNullable() {
    return senderTaxFraudStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_SENDER_TAX_FRAUD_STATUS)
  public void setSenderTaxFraudStatus_JsonNullable(JsonNullable<String> senderTaxFraudStatus) {
    this.senderTaxFraudStatus = senderTaxFraudStatus;
  }

  public void setSenderTaxFraudStatus(String senderTaxFraudStatus) {
    this.senderTaxFraudStatus = JsonNullable.<String>of(senderTaxFraudStatus);
  }


  public InvoiceWithId receiverId(String receiverId) {
    
    this.receiverId = receiverId;
    return this;
  }

   /**
   * The fiscal ID of the invoice receiver.
   * @return receiverId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BBB222222BB22", required = true, value = "The fiscal ID of the invoice receiver.")
  @JsonProperty(JSON_PROPERTY_RECEIVER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReceiverId() {
    return receiverId;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReceiverId(String receiverId) {
    this.receiverId = receiverId;
  }


  public InvoiceWithId receiverName(String receiverName) {
    
    this.receiverName = receiverName;
    return this;
  }

   /**
   * The name of the invoice receiver.
   * @return receiverName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BELVO CORP", required = true, value = "The name of the invoice receiver.")
  @JsonProperty(JSON_PROPERTY_RECEIVER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReceiverName() {
    return receiverName;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
  }


  public InvoiceWithId receiverTaxFraudStatus(String receiverTaxFraudStatus) {
    this.receiverTaxFraudStatus = JsonNullable.<String>of(receiverTaxFraudStatus);
    
    return this;
  }

   /**
   * Indicates whether or not the receiver is on SAT&#39;s tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution&#39;s regulations.&lt;br&gt;&lt;br&gt; SAT updates the tax fraud list every three months. &lt;br&gt;&lt;br&gt; For more information regarding the reason&#39;s a taxpayer can be put on the tax fraud list, please see [Article 69](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69.html) and [Article 69-B](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69B.html) of Mexico&#39;s Código Fiscal de la Federación. &lt;br&gt;&lt;br&gt; Possible statuses are: - &#x60;INVESTIGATING&#x60; &lt;br&gt; The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. &lt;br&gt; - &#x60;DISMISSED&#x60; &lt;br&gt; The fiscal institution has investigated the taxpayer and declared them innocent. &lt;br&gt; - &#x60;CONFIRMED&#x60; &lt;br&gt; The fiscal institution has confirmed that the taxpayer is guilty. &lt;br&gt; - &#x60;OVERTURNED&#x60; &lt;br&gt; The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. &lt;br&gt; - &#x60;NO_TAX_FRAUD_STATUS&#x60; &lt;br&gt; The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution&#39;s regulations).
   * @return receiverTaxFraudStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NO_TAX_FRAUD_STATUS", value = "Indicates whether or not the receiver is on SAT's tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution's regulations.<br><br> SAT updates the tax fraud list every three months. <br><br> For more information regarding the reason's a taxpayer can be put on the tax fraud list, please see [Article 69](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69.html) and [Article 69-B](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69B.html) of Mexico's Código Fiscal de la Federación. <br><br> Possible statuses are: - `INVESTIGATING` <br> The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. <br> - `DISMISSED` <br> The fiscal institution has investigated the taxpayer and declared them innocent. <br> - `CONFIRMED` <br> The fiscal institution has confirmed that the taxpayer is guilty. <br> - `OVERTURNED` <br> The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. <br> - `NO_TAX_FRAUD_STATUS` <br> The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution's regulations).")
  @JsonIgnore

  public String getReceiverTaxFraudStatus() {
        return receiverTaxFraudStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECEIVER_TAX_FRAUD_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReceiverTaxFraudStatus_JsonNullable() {
    return receiverTaxFraudStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_RECEIVER_TAX_FRAUD_STATUS)
  public void setReceiverTaxFraudStatus_JsonNullable(JsonNullable<String> receiverTaxFraudStatus) {
    this.receiverTaxFraudStatus = receiverTaxFraudStatus;
  }

  public void setReceiverTaxFraudStatus(String receiverTaxFraudStatus) {
    this.receiverTaxFraudStatus = JsonNullable.<String>of(receiverTaxFraudStatus);
  }


  public InvoiceWithId cancelationStatus(String cancelationStatus) {
    
    this.cancelationStatus = cancelationStatus;
    return this;
  }

   /**
   * If the invoice is cancelled, this field indicates the status of the cancellation.
   * @return cancelationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "If the invoice is cancelled, this field indicates the status of the cancellation.")
  @JsonProperty(JSON_PROPERTY_CANCELATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCancelationStatus() {
    return cancelationStatus;
  }


  @JsonProperty(JSON_PROPERTY_CANCELATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCancelationStatus(String cancelationStatus) {
    this.cancelationStatus = cancelationStatus;
  }


  public InvoiceWithId cancelationUpdateDate(LocalDate cancelationUpdateDate) {
    
    this.cancelationUpdateDate = cancelationUpdateDate;
    return this;
  }

   /**
   * The date of the invoice cancelation.
   * @return cancelationUpdateDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mon Dec 02 00:00:00 UTC 2019", required = true, value = "The date of the invoice cancelation.")
  @JsonProperty(JSON_PROPERTY_CANCELATION_UPDATE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getCancelationUpdateDate() {
    return cancelationUpdateDate;
  }


  @JsonProperty(JSON_PROPERTY_CANCELATION_UPDATE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCancelationUpdateDate(LocalDate cancelationUpdateDate) {
    this.cancelationUpdateDate = cancelationUpdateDate;
  }


  public InvoiceWithId certificationDate(LocalDate certificationDate) {
    
    this.certificationDate = certificationDate;
    return this;
  }

   /**
   * The date of the fiscal certification.
   * @return certificationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sun Dec 01 00:00:00 UTC 2019", required = true, value = "The date of the fiscal certification.")
  @JsonProperty(JSON_PROPERTY_CERTIFICATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getCertificationDate() {
    return certificationDate;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCertificationDate(LocalDate certificationDate) {
    this.certificationDate = certificationDate;
  }


  public InvoiceWithId certificationAuthority(String certificationAuthority) {
    
    this.certificationAuthority = certificationAuthority;
    return this;
  }

   /**
   * The fiscal ID of the certification provider.
   * @return certificationAuthority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CCC333333CC33", required = true, value = "The fiscal ID of the certification provider.")
  @JsonProperty(JSON_PROPERTY_CERTIFICATION_AUTHORITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCertificationAuthority() {
    return certificationAuthority;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATION_AUTHORITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCertificationAuthority(String certificationAuthority) {
    this.certificationAuthority = certificationAuthority;
  }


  public InvoiceWithId paymentType(String paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * The payment type code used for this invoice, as defined by the country legal entity. - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-type) 
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99", required = true, value = "The payment type code used for this invoice, as defined by the country legal entity. - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-type) ")
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


  public InvoiceWithId paymentTypeDescription(String paymentTypeDescription) {
    
    this.paymentTypeDescription = paymentTypeDescription;
    return this;
  }

   /**
   * *This field has been deprecated.*  *The description of the payment method used for this invoice.* 
   * @return paymentTypeDescription
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "*This field has been deprecated.*  *The description of the payment method used for this invoice.* ")
  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentTypeDescription() {
    return paymentTypeDescription;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentTypeDescription(String paymentTypeDescription) {
    this.paymentTypeDescription = paymentTypeDescription;
  }


  public InvoiceWithId paymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = JsonNullable.<PaymentMethodEnum>of(paymentMethod);
    
    return this;
  }

   /**
   * The payment method code used for this invoice, as defined by the legal entity of the country.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-method). For Mexico, we return &#x60;PUE&#x60;, &#x60;PIP&#x60;, OR &#x60;PPD&#x60;. 
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PUE", value = "The payment method code used for this invoice, as defined by the legal entity of the country.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-method). For Mexico, we return `PUE`, `PIP`, OR `PPD`. ")
  @JsonIgnore

  public PaymentMethodEnum getPaymentMethod() {
        return paymentMethod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PaymentMethodEnum> getPaymentMethod_JsonNullable() {
    return paymentMethod;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  public void setPaymentMethod_JsonNullable(JsonNullable<PaymentMethodEnum> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = JsonNullable.<PaymentMethodEnum>of(paymentMethod);
  }


  public InvoiceWithId paymentMethodDescription(String paymentMethodDescription) {
    this.paymentMethodDescription = JsonNullable.<String>of(paymentMethodDescription);
    
    return this;
  }

   /**
   * *This field has been deprecated.*  *The description of the payment method used for this invoice.* 
   * @return paymentMethodDescription
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.*  *The description of the payment method used for this invoice.* ")
  @JsonIgnore

  public String getPaymentMethodDescription() {
        return paymentMethodDescription.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPaymentMethodDescription_JsonNullable() {
    return paymentMethodDescription;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_DESCRIPTION)
  public void setPaymentMethodDescription_JsonNullable(JsonNullable<String> paymentMethodDescription) {
    this.paymentMethodDescription = paymentMethodDescription;
  }

  public void setPaymentMethodDescription(String paymentMethodDescription) {
    this.paymentMethodDescription = JsonNullable.<String>of(paymentMethodDescription);
  }


  public InvoiceWithId usage(String usage) {
    this.usage = JsonNullable.<String>of(usage);
    
    return this;
  }

   /**
   * The invoice&#39;s usage code, as defined by the legal entity of the country.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#usage) 
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "P01", value = "The invoice's usage code, as defined by the legal entity of the country.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#usage) ")
  @JsonIgnore

  public String getUsage() {
        return usage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUsage_JsonNullable() {
    return usage;
  }
  
  @JsonProperty(JSON_PROPERTY_USAGE)
  public void setUsage_JsonNullable(JsonNullable<String> usage) {
    this.usage = usage;
  }

  public void setUsage(String usage) {
    this.usage = JsonNullable.<String>of(usage);
  }


  public InvoiceWithId version(String version) {
    this.version = JsonNullable.<String>of(version);
    
    return this;
  }

   /**
   * The CFDI version of the invoice.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.3", value = "The CFDI version of the invoice.")
  @JsonIgnore

  public String getVersion() {
        return version.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getVersion_JsonNullable() {
    return version;
  }
  
  @JsonProperty(JSON_PROPERTY_VERSION)
  public void setVersion_JsonNullable(JsonNullable<String> version) {
    this.version = version;
  }

  public void setVersion(String version) {
    this.version = JsonNullable.<String>of(version);
  }


  public InvoiceWithId placeOfIssue(String placeOfIssue) {
    this.placeOfIssue = JsonNullable.<String>of(placeOfIssue);
    
    return this;
  }

   /**
   * The postcode of where the invoice was issued.
   * @return placeOfIssue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01165", value = "The postcode of where the invoice was issued.")
  @JsonIgnore

  public String getPlaceOfIssue() {
        return placeOfIssue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PLACE_OF_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPlaceOfIssue_JsonNullable() {
    return placeOfIssue;
  }
  
  @JsonProperty(JSON_PROPERTY_PLACE_OF_ISSUE)
  public void setPlaceOfIssue_JsonNullable(JsonNullable<String> placeOfIssue) {
    this.placeOfIssue = placeOfIssue;
  }

  public void setPlaceOfIssue(String placeOfIssue) {
    this.placeOfIssue = JsonNullable.<String>of(placeOfIssue);
  }


  public InvoiceWithId invoiceDetails(List<InvoiceDetail> invoiceDetails) {
    
    this.invoiceDetails = invoiceDetails;
    return this;
  }

  public InvoiceWithId addInvoiceDetailsItem(InvoiceDetail invoiceDetailsItem) {
    this.invoiceDetails.add(invoiceDetailsItem);
    return this;
  }

   /**
   * A list of descriptions for each item (purchased product or service provided) in the invoice. 
   * @return invoiceDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of descriptions for each item (purchased product or service provided) in the invoice. ")
  @JsonProperty(JSON_PROPERTY_INVOICE_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<InvoiceDetail> getInvoiceDetails() {
    return invoiceDetails;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvoiceDetails(List<InvoiceDetail> invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
  }


  public InvoiceWithId currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the invoice. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MXN", required = true, value = "The currency of the invoice. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned.")
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


  public InvoiceWithId subtotalAmount(Float subtotalAmount) {
    
    this.subtotalAmount = subtotalAmount;
    return this;
  }

   /**
   * The pretax amount of this invoice (sum of each item&#39;s &#x60;pre_tax_amount&#x60;).
   * @return subtotalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "400", required = true, value = "The pretax amount of this invoice (sum of each item's `pre_tax_amount`).")
  @JsonProperty(JSON_PROPERTY_SUBTOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getSubtotalAmount() {
    return subtotalAmount;
  }


  @JsonProperty(JSON_PROPERTY_SUBTOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubtotalAmount(Float subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
  }


  public InvoiceWithId exchangeRate(Float exchangeRate) {
    
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * The exchange rate used in this invoice for the currency.
   * @return exchangeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.052", required = true, value = "The exchange rate used in this invoice for the currency.")
  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getExchangeRate() {
    return exchangeRate;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExchangeRate(Float exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


  public InvoiceWithId taxAmount(Float taxAmount) {
    
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * The amount of tax for this invoice (sum of each item&#39;s &#x60;tax_amount&#x60;).
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "64", required = true, value = "The amount of tax for this invoice (sum of each item's `tax_amount`).")
  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getTaxAmount() {
    return taxAmount;
  }


  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaxAmount(Float taxAmount) {
    this.taxAmount = taxAmount;
  }


  public InvoiceWithId discountAmount(Float discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * The total amount discounted in this invoice.
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", required = true, value = "The total amount discounted in this invoice.")
  @JsonProperty(JSON_PROPERTY_DISCOUNT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getDiscountAmount() {
    return discountAmount;
  }


  @JsonProperty(JSON_PROPERTY_DISCOUNT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDiscountAmount(Float discountAmount) {
    this.discountAmount = discountAmount;
  }


  public InvoiceWithId totalAmount(Float totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * The total amount of the invoice (&#x60;subtotal_amount&#x60; + &#x60;tax_amount&#x60; - &#x60;discount_amount&#x60;)
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "454", required = true, value = "The total amount of the invoice (`subtotal_amount` + `tax_amount` - `discount_amount`)")
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getTotalAmount() {
    return totalAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalAmount(Float totalAmount) {
    this.totalAmount = totalAmount;
  }


  public InvoiceWithId payments(List<InvoicesPayments> payments) {
    
    this.payments = payments;
    return this;
  }

  public InvoiceWithId addPaymentsItem(InvoicesPayments paymentsItem) {
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * A list detailing all the invoice payments.
   * @return payments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list detailing all the invoice payments.")
  @JsonProperty(JSON_PROPERTY_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<InvoicesPayments> getPayments() {
    return payments;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayments(List<InvoicesPayments> payments) {
    this.payments = payments;
  }


  public InvoiceWithId payroll(InvoicesPayroll payroll) {
    
    this.payroll = payroll;
    return this;
  }

   /**
   * Get payroll
   * @return payroll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PAYROLL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InvoicesPayroll getPayroll() {
    return payroll;
  }


  @JsonProperty(JSON_PROPERTY_PAYROLL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayroll(InvoicesPayroll payroll) {
    this.payroll = payroll;
  }


  public InvoiceWithId folio(String folio) {
    this.folio = JsonNullable.<String>of(folio);
    
    return this;
  }

   /**
   * The internal control number that the taxpayer assigns to the invoice.
   * @return folio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "26", value = "The internal control number that the taxpayer assigns to the invoice.")
  @JsonIgnore

  public String getFolio() {
        return folio.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FOLIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFolio_JsonNullable() {
    return folio;
  }
  
  @JsonProperty(JSON_PROPERTY_FOLIO)
  public void setFolio_JsonNullable(JsonNullable<String> folio) {
    this.folio = folio;
  }

  public void setFolio(String folio) {
    this.folio = JsonNullable.<String>of(folio);
  }


  public InvoiceWithId xml(String xml) {
    this.xml = JsonNullable.<String>of(xml);
    
    return this;
  }

   /**
   * XML of the invoice document.
   * @return xml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "XML of the invoice document.")
  @JsonIgnore

  public String getXml() {
        return xml.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_XML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getXml_JsonNullable() {
    return xml;
  }
  
  @JsonProperty(JSON_PROPERTY_XML)
  public void setXml_JsonNullable(JsonNullable<String> xml) {
    this.xml = xml;
  }

  public void setXml(String xml) {
    this.xml = JsonNullable.<String>of(xml);
  }


  public InvoiceWithId warnings(InvoiceWarnings warnings) {
    this.warnings = JsonNullable.<InvoiceWarnings>of(warnings);
    
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public InvoiceWarnings getWarnings() {
        return warnings.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<InvoiceWarnings> getWarnings_JsonNullable() {
    return warnings;
  }
  
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  public void setWarnings_JsonNullable(JsonNullable<InvoiceWarnings> warnings) {
    this.warnings = warnings;
  }

  public void setWarnings(InvoiceWarnings warnings) {
    this.warnings = JsonNullable.<InvoiceWarnings>of(warnings);
  }


  public InvoiceWithId senderBlacklistStatus(String senderBlacklistStatus) {
    this.senderBlacklistStatus = JsonNullable.<String>of(senderBlacklistStatus);
    
    return this;
  }

   /**
   * This field has been deprecated. Please use &#x60;sender_tax_fraud_status&#x60; instead. 
   * @return senderBlacklistStatus
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated. Please use `sender_tax_fraud_status` instead. ")
  @JsonIgnore

  public String getSenderBlacklistStatus() {
        return senderBlacklistStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SENDER_BLACKLIST_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSenderBlacklistStatus_JsonNullable() {
    return senderBlacklistStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_SENDER_BLACKLIST_STATUS)
  public void setSenderBlacklistStatus_JsonNullable(JsonNullable<String> senderBlacklistStatus) {
    this.senderBlacklistStatus = senderBlacklistStatus;
  }

  public void setSenderBlacklistStatus(String senderBlacklistStatus) {
    this.senderBlacklistStatus = JsonNullable.<String>of(senderBlacklistStatus);
  }


  public InvoiceWithId receiverBlacklistStatus(String receiverBlacklistStatus) {
    this.receiverBlacklistStatus = JsonNullable.<String>of(receiverBlacklistStatus);
    
    return this;
  }

   /**
   * This field has been deprecated. Please use &#x60;receiver_tax_fraud_status&#x60; instead. 
   * @return receiverBlacklistStatus
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated. Please use `receiver_tax_fraud_status` instead. ")
  @JsonIgnore

  public String getReceiverBlacklistStatus() {
        return receiverBlacklistStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECEIVER_BLACKLIST_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReceiverBlacklistStatus_JsonNullable() {
    return receiverBlacklistStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_RECEIVER_BLACKLIST_STATUS)
  public void setReceiverBlacklistStatus_JsonNullable(JsonNullable<String> receiverBlacklistStatus) {
    this.receiverBlacklistStatus = receiverBlacklistStatus;
  }

  public void setReceiverBlacklistStatus(String receiverBlacklistStatus) {
    this.receiverBlacklistStatus = JsonNullable.<String>of(receiverBlacklistStatus);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceWithId invoiceWithId = (InvoiceWithId) o;
    return Objects.equals(this.id, invoiceWithId.id) &&
        Objects.equals(this.link, invoiceWithId.link) &&
        Objects.equals(this.collectedAt, invoiceWithId.collectedAt) &&
        Objects.equals(this.createdAt, invoiceWithId.createdAt) &&
        Objects.equals(this.invoiceIdentification, invoiceWithId.invoiceIdentification) &&
        Objects.equals(this.invoiceDate, invoiceWithId.invoiceDate) &&
        Objects.equals(this.status, invoiceWithId.status) &&
        Objects.equals(this.invoiceType, invoiceWithId.invoiceType) &&
        Objects.equals(this.type, invoiceWithId.type) &&
        Objects.equals(this.senderId, invoiceWithId.senderId) &&
        Objects.equals(this.senderName, invoiceWithId.senderName) &&
        equalsNullable(this.senderTaxFraudStatus, invoiceWithId.senderTaxFraudStatus) &&
        Objects.equals(this.receiverId, invoiceWithId.receiverId) &&
        Objects.equals(this.receiverName, invoiceWithId.receiverName) &&
        equalsNullable(this.receiverTaxFraudStatus, invoiceWithId.receiverTaxFraudStatus) &&
        Objects.equals(this.cancelationStatus, invoiceWithId.cancelationStatus) &&
        Objects.equals(this.cancelationUpdateDate, invoiceWithId.cancelationUpdateDate) &&
        Objects.equals(this.certificationDate, invoiceWithId.certificationDate) &&
        Objects.equals(this.certificationAuthority, invoiceWithId.certificationAuthority) &&
        Objects.equals(this.paymentType, invoiceWithId.paymentType) &&
        Objects.equals(this.paymentTypeDescription, invoiceWithId.paymentTypeDescription) &&
        equalsNullable(this.paymentMethod, invoiceWithId.paymentMethod) &&
        equalsNullable(this.paymentMethodDescription, invoiceWithId.paymentMethodDescription) &&
        equalsNullable(this.usage, invoiceWithId.usage) &&
        equalsNullable(this.version, invoiceWithId.version) &&
        equalsNullable(this.placeOfIssue, invoiceWithId.placeOfIssue) &&
        Objects.equals(this.invoiceDetails, invoiceWithId.invoiceDetails) &&
        Objects.equals(this.currency, invoiceWithId.currency) &&
        Objects.equals(this.subtotalAmount, invoiceWithId.subtotalAmount) &&
        Objects.equals(this.exchangeRate, invoiceWithId.exchangeRate) &&
        Objects.equals(this.taxAmount, invoiceWithId.taxAmount) &&
        Objects.equals(this.discountAmount, invoiceWithId.discountAmount) &&
        Objects.equals(this.totalAmount, invoiceWithId.totalAmount) &&
        Objects.equals(this.payments, invoiceWithId.payments) &&
        Objects.equals(this.payroll, invoiceWithId.payroll) &&
        equalsNullable(this.folio, invoiceWithId.folio) &&
        equalsNullable(this.xml, invoiceWithId.xml) &&
        equalsNullable(this.warnings, invoiceWithId.warnings) &&
        equalsNullable(this.senderBlacklistStatus, invoiceWithId.senderBlacklistStatus) &&
        equalsNullable(this.receiverBlacklistStatus, invoiceWithId.receiverBlacklistStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, collectedAt, createdAt, invoiceIdentification, invoiceDate, status, invoiceType, type, senderId, senderName, hashCodeNullable(senderTaxFraudStatus), receiverId, receiverName, hashCodeNullable(receiverTaxFraudStatus), cancelationStatus, cancelationUpdateDate, certificationDate, certificationAuthority, paymentType, paymentTypeDescription, hashCodeNullable(paymentMethod), hashCodeNullable(paymentMethodDescription), hashCodeNullable(usage), hashCodeNullable(version), hashCodeNullable(placeOfIssue), invoiceDetails, currency, subtotalAmount, exchangeRate, taxAmount, discountAmount, totalAmount, payments, payroll, hashCodeNullable(folio), hashCodeNullable(xml), hashCodeNullable(warnings), hashCodeNullable(senderBlacklistStatus), hashCodeNullable(receiverBlacklistStatus));
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
    sb.append("class InvoiceWithId {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    invoiceIdentification: ").append(toIndentedString(invoiceIdentification)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    senderTaxFraudStatus: ").append(toIndentedString(senderTaxFraudStatus)).append("\n");
    sb.append("    receiverId: ").append(toIndentedString(receiverId)).append("\n");
    sb.append("    receiverName: ").append(toIndentedString(receiverName)).append("\n");
    sb.append("    receiverTaxFraudStatus: ").append(toIndentedString(receiverTaxFraudStatus)).append("\n");
    sb.append("    cancelationStatus: ").append(toIndentedString(cancelationStatus)).append("\n");
    sb.append("    cancelationUpdateDate: ").append(toIndentedString(cancelationUpdateDate)).append("\n");
    sb.append("    certificationDate: ").append(toIndentedString(certificationDate)).append("\n");
    sb.append("    certificationAuthority: ").append(toIndentedString(certificationAuthority)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentTypeDescription: ").append(toIndentedString(paymentTypeDescription)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentMethodDescription: ").append(toIndentedString(paymentMethodDescription)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    placeOfIssue: ").append(toIndentedString(placeOfIssue)).append("\n");
    sb.append("    invoiceDetails: ").append(toIndentedString(invoiceDetails)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    subtotalAmount: ").append(toIndentedString(subtotalAmount)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    payroll: ").append(toIndentedString(payroll)).append("\n");
    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    senderBlacklistStatus: ").append(toIndentedString(senderBlacklistStatus)).append("\n");
    sb.append("    receiverBlacklistStatus: ").append(toIndentedString(receiverBlacklistStatus)).append("\n");
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

