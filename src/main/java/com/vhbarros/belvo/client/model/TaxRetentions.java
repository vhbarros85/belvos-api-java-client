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
import com.vhbarros.belvo.client.model.RetentionBreakdown;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TaxRetentions
 */
@JsonPropertyOrder({
  TaxRetentions.JSON_PROPERTY_ID,
  TaxRetentions.JSON_PROPERTY_LINK,
  TaxRetentions.JSON_PROPERTY_COLLECTED_AT,
  TaxRetentions.JSON_PROPERTY_CREATED_AT,
  TaxRetentions.JSON_PROPERTY_INVOICE_IDENTIFICATION,
  TaxRetentions.JSON_PROPERTY_VERSION,
  TaxRetentions.JSON_PROPERTY_CODE,
  TaxRetentions.JSON_PROPERTY_ISSUED_AT,
  TaxRetentions.JSON_PROPERTY_CERTIFIED_AT,
  TaxRetentions.JSON_PROPERTY_CANCELLED_AT,
  TaxRetentions.JSON_PROPERTY_SENDER_ID,
  TaxRetentions.JSON_PROPERTY_SENDER_NAME,
  TaxRetentions.JSON_PROPERTY_RECEIVER_NATIONALITY,
  TaxRetentions.JSON_PROPERTY_RECEIVER_ID,
  TaxRetentions.JSON_PROPERTY_RECEIVER_NAME,
  TaxRetentions.JSON_PROPERTY_TOTAL_INVOICE_AMOUNT,
  TaxRetentions.JSON_PROPERTY_TOTAL_EXEMPT_AMOUNT,
  TaxRetentions.JSON_PROPERTY_TOTAL_RETAINED_AMOUNT,
  TaxRetentions.JSON_PROPERTY_TOTAL_TAXABLE_AMOUNT,
  TaxRetentions.JSON_PROPERTY_RETENTION_BREAKDOWN,
  TaxRetentions.JSON_PROPERTY_XML
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class TaxRetentions {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_LINK = "link";
  private UUID link;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private OffsetDateTime collectedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_INVOICE_IDENTIFICATION = "invoice_identification";
  private UUID invoiceIdentification;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_CODE = "code";
  private Integer code;

  public static final String JSON_PROPERTY_ISSUED_AT = "issued_at";
  private OffsetDateTime issuedAt;

  public static final String JSON_PROPERTY_CERTIFIED_AT = "certified_at";
  private OffsetDateTime certifiedAt;

  public static final String JSON_PROPERTY_CANCELLED_AT = "cancelled_at";
  private OffsetDateTime cancelledAt;

  public static final String JSON_PROPERTY_SENDER_ID = "sender_id";
  private String senderId;

  public static final String JSON_PROPERTY_SENDER_NAME = "sender_name";
  private String senderName;

  public static final String JSON_PROPERTY_RECEIVER_NATIONALITY = "receiver_nationality";
  private String receiverNationality;

  public static final String JSON_PROPERTY_RECEIVER_ID = "receiver_id";
  private String receiverId;

  public static final String JSON_PROPERTY_RECEIVER_NAME = "receiver_name";
  private String receiverName;

  public static final String JSON_PROPERTY_TOTAL_INVOICE_AMOUNT = "total_invoice_amount";
  private Float totalInvoiceAmount;

  public static final String JSON_PROPERTY_TOTAL_EXEMPT_AMOUNT = "total_exempt_amount";
  private Float totalExemptAmount;

  public static final String JSON_PROPERTY_TOTAL_RETAINED_AMOUNT = "total_retained_amount";
  private Float totalRetainedAmount;

  public static final String JSON_PROPERTY_TOTAL_TAXABLE_AMOUNT = "total_taxable_amount";
  private Float totalTaxableAmount;

  public static final String JSON_PROPERTY_RETENTION_BREAKDOWN = "retention_breakdown";
  private List<RetentionBreakdown> retentionBreakdown = new ArrayList<>();

  public static final String JSON_PROPERTY_XML = "xml";
  private String xml;

  public TaxRetentions() {
  }

  public TaxRetentions id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique identifier used to reference the current tax retention statement.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c749315b-eec2-435d-a458-06912878564f", value = "Belvo's unique identifier used to reference the current tax retention statement.")
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


  public TaxRetentions link(UUID link) {
    
    this.link = link;
    return this;
  }

   /**
   * The &#x60;link.id&#x60; the tax retention belongs to.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19697249-01b8-443e-a451-76bfc5fbeebf", value = "The `link.id` the tax retention belongs to.")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(UUID link) {
    this.link = link;
  }


  public TaxRetentions collectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the data point was collected. 
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-09T08:45:50.406032Z", required = true, value = "The ISO-8601 timestamp of when the data point was collected. ")
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


  public TaxRetentions createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. 
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-09T08:46:20.406032Z", value = "The ISO-8601 timestamp of when the data point was last updated in Belvo's database. ")
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


  public TaxRetentions invoiceIdentification(UUID invoiceIdentification) {
    
    this.invoiceIdentification = invoiceIdentification;
    return this;
  }

   /**
   * The fiscal institution&#39;s unique ID for the invoice that the tax retention relates to. 
   * @return invoiceIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "def404af-5eef-4112-aa99-d1ec8493b89a", required = true, value = "The fiscal institution's unique ID for the invoice that the tax retention relates to. ")
  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getInvoiceIdentification() {
    return invoiceIdentification;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvoiceIdentification(UUID invoiceIdentification) {
    this.invoiceIdentification = invoiceIdentification;
  }


  public TaxRetentions version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The CFDI version of the tax retentions. 
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", required = true, value = "The CFDI version of the tax retentions. ")
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


  public TaxRetentions code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * The tax retention code. For more information, see our [SAT Catalogs DevPortal article](https://developers.belvo.com/docs/sat-catalogs#retention-code). 
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", required = true, value = "The tax retention code. For more information, see our [SAT Catalogs DevPortal article](https://developers.belvo.com/docs/sat-catalogs#retention-code). ")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(Integer code) {
    this.code = code;
  }


  public TaxRetentions issuedAt(OffsetDateTime issuedAt) {
    
    this.issuedAt = issuedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the tax retention was issued. 
   * @return issuedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-03T21:10:40Z", required = true, value = "The ISO-8601 timestamp of when the tax retention was issued. ")
  @JsonProperty(JSON_PROPERTY_ISSUED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }


  @JsonProperty(JSON_PROPERTY_ISSUED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  public TaxRetentions certifiedAt(OffsetDateTime certifiedAt) {
    
    this.certifiedAt = certifiedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the tax retention was certified. 
   * @return certifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-03T21:10:41Z", required = true, value = "The ISO-8601 timestamp of when the tax retention was certified. ")
  @JsonProperty(JSON_PROPERTY_CERTIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCertifiedAt() {
    return certifiedAt;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCertifiedAt(OffsetDateTime certifiedAt) {
    this.certifiedAt = certifiedAt;
  }


  public TaxRetentions cancelledAt(OffsetDateTime cancelledAt) {
    
    this.cancelledAt = cancelledAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the tax retention was canceled (if applicable). 
   * @return cancelledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ISO-8601 timestamp of when the tax retention was canceled (if applicable). ")
  @JsonProperty(JSON_PROPERTY_CANCELLED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCancelledAt() {
    return cancelledAt;
  }


  @JsonProperty(JSON_PROPERTY_CANCELLED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCancelledAt(OffsetDateTime cancelledAt) {
    this.cancelledAt = cancelledAt;
  }


  public TaxRetentions senderId(String senderId) {
    
    this.senderId = senderId;
    return this;
  }

   /**
   * The fiscal ID of the invoice sender. 
   * @return senderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JKUF980404P0", required = true, value = "The fiscal ID of the invoice sender. ")
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


  public TaxRetentions senderName(String senderName) {
    
    this.senderName = senderName;
    return this;
  }

   /**
   * The name of the invoice sender. 
   * @return senderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Roberto Nunez Batman", required = true, value = "The name of the invoice sender. ")
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


  public TaxRetentions receiverNationality(String receiverNationality) {
    
    this.receiverNationality = receiverNationality;
    return this;
  }

   /**
   * Whether the invoice receiver is a Mexican national or not. If the receiver is not considered a Mexican national, the retained taxes can be calculated differently. Possible values:   - &#x60;NATIONAL&#x60;   - &#x60;FOREIGN&#x60; 
   * @return receiverNationality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NATIONAL", required = true, value = "Whether the invoice receiver is a Mexican national or not. If the receiver is not considered a Mexican national, the retained taxes can be calculated differently. Possible values:   - `NATIONAL`   - `FOREIGN` ")
  @JsonProperty(JSON_PROPERTY_RECEIVER_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReceiverNationality() {
    return receiverNationality;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVER_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReceiverNationality(String receiverNationality) {
    this.receiverNationality = receiverNationality;
  }


  public TaxRetentions receiverId(String receiverId) {
    
    this.receiverId = receiverId;
    return this;
  }

   /**
   * The fiscal ID of the invoice receiver. 
   * @return receiverId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GYGK3207809L1", required = true, value = "The fiscal ID of the invoice receiver. ")
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


  public TaxRetentions receiverName(String receiverName) {
    
    this.receiverName = receiverName;
    return this;
  }

   /**
   * The name of the invoice receiver. 
   * @return receiverName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACME LTD", required = true, value = "The name of the invoice receiver. ")
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


  public TaxRetentions totalInvoiceAmount(Float totalInvoiceAmount) {
    
    this.totalInvoiceAmount = totalInvoiceAmount;
    return this;
  }

   /**
   * The total amount of the invoice that the tax retention relates to. 
   * @return totalInvoiceAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "53249.8", required = true, value = "The total amount of the invoice that the tax retention relates to. ")
  @JsonProperty(JSON_PROPERTY_TOTAL_INVOICE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getTotalInvoiceAmount() {
    return totalInvoiceAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_INVOICE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalInvoiceAmount(Float totalInvoiceAmount) {
    this.totalInvoiceAmount = totalInvoiceAmount;
  }


  public TaxRetentions totalExemptAmount(Float totalExemptAmount) {
    
    this.totalExemptAmount = totalExemptAmount;
    return this;
  }

   /**
   * Total amount that is exempt from taxation. 
   * @return totalExemptAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000.8", required = true, value = "Total amount that is exempt from taxation. ")
  @JsonProperty(JSON_PROPERTY_TOTAL_EXEMPT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getTotalExemptAmount() {
    return totalExemptAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_EXEMPT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalExemptAmount(Float totalExemptAmount) {
    this.totalExemptAmount = totalExemptAmount;
  }


  public TaxRetentions totalRetainedAmount(Float totalRetainedAmount) {
    
    this.totalRetainedAmount = totalRetainedAmount;
    return this;
  }

   /**
   * Total tax retained. 
   * @return totalRetainedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1550.7", required = true, value = "Total tax retained. ")
  @JsonProperty(JSON_PROPERTY_TOTAL_RETAINED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getTotalRetainedAmount() {
    return totalRetainedAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_RETAINED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalRetainedAmount(Float totalRetainedAmount) {
    this.totalRetainedAmount = totalRetainedAmount;
  }


  public TaxRetentions totalTaxableAmount(Float totalTaxableAmount) {
    
    this.totalTaxableAmount = totalTaxableAmount;
    return this;
  }

   /**
   * The total amount that can be taxed. Calculated as &#x60;total_invoice_amount&#x60; - &#x60;total_exempt_amount&#x60;. 
   * @return totalTaxableAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "43249", required = true, value = "The total amount that can be taxed. Calculated as `total_invoice_amount` - `total_exempt_amount`. ")
  @JsonProperty(JSON_PROPERTY_TOTAL_TAXABLE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getTotalTaxableAmount() {
    return totalTaxableAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_TAXABLE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalTaxableAmount(Float totalTaxableAmount) {
    this.totalTaxableAmount = totalTaxableAmount;
  }


  public TaxRetentions retentionBreakdown(List<RetentionBreakdown> retentionBreakdown) {
    
    this.retentionBreakdown = retentionBreakdown;
    return this;
  }

  public TaxRetentions addRetentionBreakdownItem(RetentionBreakdown retentionBreakdownItem) {
    this.retentionBreakdown.add(retentionBreakdownItem);
    return this;
  }

   /**
   * A breakdown of the retained taxes.
   * @return retentionBreakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A breakdown of the retained taxes.")
  @JsonProperty(JSON_PROPERTY_RETENTION_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RetentionBreakdown> getRetentionBreakdown() {
    return retentionBreakdown;
  }


  @JsonProperty(JSON_PROPERTY_RETENTION_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRetentionBreakdown(List<RetentionBreakdown> retentionBreakdown) {
    this.retentionBreakdown = retentionBreakdown;
  }


  public TaxRetentions xml(String xml) {
    
    this.xml = xml;
    return this;
  }

   /**
   * The tax retention document in XML form. 
   * @return xml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "=XML-STRING=", required = true, value = "The tax retention document in XML form. ")
  @JsonProperty(JSON_PROPERTY_XML)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getXml() {
    return xml;
  }


  @JsonProperty(JSON_PROPERTY_XML)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setXml(String xml) {
    this.xml = xml;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRetentions taxRetentions = (TaxRetentions) o;
    return Objects.equals(this.id, taxRetentions.id) &&
        Objects.equals(this.link, taxRetentions.link) &&
        Objects.equals(this.collectedAt, taxRetentions.collectedAt) &&
        Objects.equals(this.createdAt, taxRetentions.createdAt) &&
        Objects.equals(this.invoiceIdentification, taxRetentions.invoiceIdentification) &&
        Objects.equals(this.version, taxRetentions.version) &&
        Objects.equals(this.code, taxRetentions.code) &&
        Objects.equals(this.issuedAt, taxRetentions.issuedAt) &&
        Objects.equals(this.certifiedAt, taxRetentions.certifiedAt) &&
        Objects.equals(this.cancelledAt, taxRetentions.cancelledAt) &&
        Objects.equals(this.senderId, taxRetentions.senderId) &&
        Objects.equals(this.senderName, taxRetentions.senderName) &&
        Objects.equals(this.receiverNationality, taxRetentions.receiverNationality) &&
        Objects.equals(this.receiverId, taxRetentions.receiverId) &&
        Objects.equals(this.receiverName, taxRetentions.receiverName) &&
        Objects.equals(this.totalInvoiceAmount, taxRetentions.totalInvoiceAmount) &&
        Objects.equals(this.totalExemptAmount, taxRetentions.totalExemptAmount) &&
        Objects.equals(this.totalRetainedAmount, taxRetentions.totalRetainedAmount) &&
        Objects.equals(this.totalTaxableAmount, taxRetentions.totalTaxableAmount) &&
        Objects.equals(this.retentionBreakdown, taxRetentions.retentionBreakdown) &&
        Objects.equals(this.xml, taxRetentions.xml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, collectedAt, createdAt, invoiceIdentification, version, code, issuedAt, certifiedAt, cancelledAt, senderId, senderName, receiverNationality, receiverId, receiverName, totalInvoiceAmount, totalExemptAmount, totalRetainedAmount, totalTaxableAmount, retentionBreakdown, xml);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRetentions {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    invoiceIdentification: ").append(toIndentedString(invoiceIdentification)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    certifiedAt: ").append(toIndentedString(certifiedAt)).append("\n");
    sb.append("    cancelledAt: ").append(toIndentedString(cancelledAt)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    receiverNationality: ").append(toIndentedString(receiverNationality)).append("\n");
    sb.append("    receiverId: ").append(toIndentedString(receiverId)).append("\n");
    sb.append("    receiverName: ").append(toIndentedString(receiverName)).append("\n");
    sb.append("    totalInvoiceAmount: ").append(toIndentedString(totalInvoiceAmount)).append("\n");
    sb.append("    totalExemptAmount: ").append(toIndentedString(totalExemptAmount)).append("\n");
    sb.append("    totalRetainedAmount: ").append(toIndentedString(totalRetainedAmount)).append("\n");
    sb.append("    totalTaxableAmount: ").append(toIndentedString(totalTaxableAmount)).append("\n");
    sb.append("    retentionBreakdown: ").append(toIndentedString(retentionBreakdown)).append("\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
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

