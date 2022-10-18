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
 * InvoiceFilters
 */
@JsonPropertyOrder({
  InvoiceFilters.JSON_PROPERTY_CREATED_AT,
  InvoiceFilters.JSON_PROPERTY_CREATED_AT_LT,
  InvoiceFilters.JSON_PROPERTY_CREATED_AT_LTE,
  InvoiceFilters.JSON_PROPERTY_CREATED_AT_GT,
  InvoiceFilters.JSON_PROPERTY_CREATED_AT_GTE,
  InvoiceFilters.JSON_PROPERTY_CREATED_AT_RANGE,
  InvoiceFilters.JSON_PROPERTY_ID,
  InvoiceFilters.JSON_PROPERTY_ID_IN,
  InvoiceFilters.JSON_PROPERTY_INVOICE_DATE,
  InvoiceFilters.JSON_PROPERTY_INVOICE_DATE_LT,
  InvoiceFilters.JSON_PROPERTY_INVOICE_DATE_LTE,
  InvoiceFilters.JSON_PROPERTY_INVOICE_DATE_GT,
  InvoiceFilters.JSON_PROPERTY_INVOICE_DATE_GTE,
  InvoiceFilters.JSON_PROPERTY_INVOICE_DATE_RANGE,
  InvoiceFilters.JSON_PROPERTY_INVOICE_IDENTIFICATION,
  InvoiceFilters.JSON_PROPERTY_INVOICE_IDENTIFICATION_LT,
  InvoiceFilters.JSON_PROPERTY_INVOICE_IDENTIFICATION_LTE,
  InvoiceFilters.JSON_PROPERTY_INVOICE_IDENTIFICATION_GT,
  InvoiceFilters.JSON_PROPERTY_INVOICE_IDENTIFICATION_GTE,
  InvoiceFilters.JSON_PROPERTY_INVOICE_IDENTIFICATION_RANGE,
  InvoiceFilters.JSON_PROPERTY_LINK_IN,
  InvoiceFilters.JSON_PROPERTY_STATUS,
  InvoiceFilters.JSON_PROPERTY_STATUS_IN,
  InvoiceFilters.JSON_PROPERTY_TOTAL_AMOUNT,
  InvoiceFilters.JSON_PROPERTY_TOTAL_AMOUNT_LT,
  InvoiceFilters.JSON_PROPERTY_TOTAL_AMOUNT_LTE,
  InvoiceFilters.JSON_PROPERTY_TOTAL_AMOUNT_GT,
  InvoiceFilters.JSON_PROPERTY_TOTAL_AMOUNT_GTE,
  InvoiceFilters.JSON_PROPERTY_TOTAL_AMOUNT_RANGE,
  InvoiceFilters.JSON_PROPERTY_TYPE,
  InvoiceFilters.JSON_PROPERTY_TYPE_IN
})
@JsonTypeName("invoiceFilters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class InvoiceFilters {
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_CREATED_AT_LT = "created_at__lt";
  private String createdAtLt;

  public static final String JSON_PROPERTY_CREATED_AT_LTE = "created_at__lte";
  private String createdAtLte;

  public static final String JSON_PROPERTY_CREATED_AT_GT = "created_at__gt";
  private String createdAtGt;

  public static final String JSON_PROPERTY_CREATED_AT_GTE = "created_at__gte";
  private String createdAtGte;

  public static final String JSON_PROPERTY_CREATED_AT_RANGE = "created_at__range";
  private String createdAtRange;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ID_IN = "id__in";
  private String idIn;

  public static final String JSON_PROPERTY_INVOICE_DATE = "invoice_date";
  private String invoiceDate;

  public static final String JSON_PROPERTY_INVOICE_DATE_LT = "invoice_date__lt";
  private String invoiceDateLt;

  public static final String JSON_PROPERTY_INVOICE_DATE_LTE = "invoice_date__lte";
  private String invoiceDateLte;

  public static final String JSON_PROPERTY_INVOICE_DATE_GT = "invoice_date__gt";
  private String invoiceDateGt;

  public static final String JSON_PROPERTY_INVOICE_DATE_GTE = "invoice_date__gte";
  private String invoiceDateGte;

  public static final String JSON_PROPERTY_INVOICE_DATE_RANGE = "invoice_date__range";
  private String invoiceDateRange;

  public static final String JSON_PROPERTY_INVOICE_IDENTIFICATION = "invoice_identification";
  private String invoiceIdentification;

  public static final String JSON_PROPERTY_INVOICE_IDENTIFICATION_LT = "invoice_identification__lt";
  private String invoiceIdentificationLt;

  public static final String JSON_PROPERTY_INVOICE_IDENTIFICATION_LTE = "invoice_identification__lte";
  private String invoiceIdentificationLte;

  public static final String JSON_PROPERTY_INVOICE_IDENTIFICATION_GT = "invoice_identification__gt";
  private String invoiceIdentificationGt;

  public static final String JSON_PROPERTY_INVOICE_IDENTIFICATION_GTE = "invoice_identification__gte";
  private String invoiceIdentificationGte;

  public static final String JSON_PROPERTY_INVOICE_IDENTIFICATION_RANGE = "invoice_identification__range";
  private String invoiceIdentificationRange;

  public static final String JSON_PROPERTY_LINK_IN = "link__in";
  private String linkIn;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STATUS_IN = "status__in";
  private String statusIn;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT = "total_amount";
  private String totalAmount;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT_LT = "total_amount__lt";
  private String totalAmountLt;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT_LTE = "total_amount__lte";
  private String totalAmountLte;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT_GT = "total_amount__gt";
  private String totalAmountGt;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT_GTE = "total_amount__gte";
  private String totalAmountGte;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT_RANGE = "total_amount__range";
  private String totalAmountRange;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_TYPE_IN = "type__in";
  private String typeIn;

  public InvoiceFilters() {
  }

  public InvoiceFilters createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public InvoiceFilters createdAtLt(String createdAtLt) {
    
    this.createdAtLt = createdAtLt;
    return this;
  }

   /**
   * Get createdAtLt
   * @return createdAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAtLt() {
    return createdAtLt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtLt(String createdAtLt) {
    this.createdAtLt = createdAtLt;
  }


  public InvoiceFilters createdAtLte(String createdAtLte) {
    
    this.createdAtLte = createdAtLte;
    return this;
  }

   /**
   * Get createdAtLte
   * @return createdAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAtLte() {
    return createdAtLte;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtLte(String createdAtLte) {
    this.createdAtLte = createdAtLte;
  }


  public InvoiceFilters createdAtGt(String createdAtGt) {
    
    this.createdAtGt = createdAtGt;
    return this;
  }

   /**
   * Get createdAtGt
   * @return createdAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAtGt() {
    return createdAtGt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtGt(String createdAtGt) {
    this.createdAtGt = createdAtGt;
  }


  public InvoiceFilters createdAtGte(String createdAtGte) {
    
    this.createdAtGte = createdAtGte;
    return this;
  }

   /**
   * Get createdAtGte
   * @return createdAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAtGte() {
    return createdAtGte;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtGte(String createdAtGte) {
    this.createdAtGte = createdAtGte;
  }


  public InvoiceFilters createdAtRange(String createdAtRange) {
    
    this.createdAtRange = createdAtRange;
    return this;
  }

   /**
   * Get createdAtRange
   * @return createdAtRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAtRange() {
    return createdAtRange;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtRange(String createdAtRange) {
    this.createdAtRange = createdAtRange;
  }


  public InvoiceFilters id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public InvoiceFilters idIn(String idIn) {
    
    this.idIn = idIn;
    return this;
  }

   /**
   * Get idIn
   * @return idIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdIn() {
    return idIn;
  }


  @JsonProperty(JSON_PROPERTY_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdIn(String idIn) {
    this.idIn = idIn;
  }


  public InvoiceFilters invoiceDate(String invoiceDate) {
    
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * Get invoiceDate
   * @return invoiceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceDate() {
    return invoiceDate;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public InvoiceFilters invoiceDateLt(String invoiceDateLt) {
    
    this.invoiceDateLt = invoiceDateLt;
    return this;
  }

   /**
   * Get invoiceDateLt
   * @return invoiceDateLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_DATE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceDateLt() {
    return invoiceDateLt;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_DATE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceDateLt(String invoiceDateLt) {
    this.invoiceDateLt = invoiceDateLt;
  }


  public InvoiceFilters invoiceDateLte(String invoiceDateLte) {
    
    this.invoiceDateLte = invoiceDateLte;
    return this;
  }

   /**
   * Get invoiceDateLte
   * @return invoiceDateLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_DATE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceDateLte() {
    return invoiceDateLte;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_DATE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceDateLte(String invoiceDateLte) {
    this.invoiceDateLte = invoiceDateLte;
  }


  public InvoiceFilters invoiceDateGt(String invoiceDateGt) {
    
    this.invoiceDateGt = invoiceDateGt;
    return this;
  }

   /**
   * Get invoiceDateGt
   * @return invoiceDateGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_DATE_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceDateGt() {
    return invoiceDateGt;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_DATE_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceDateGt(String invoiceDateGt) {
    this.invoiceDateGt = invoiceDateGt;
  }


  public InvoiceFilters invoiceDateGte(String invoiceDateGte) {
    
    this.invoiceDateGte = invoiceDateGte;
    return this;
  }

   /**
   * Get invoiceDateGte
   * @return invoiceDateGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_DATE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceDateGte() {
    return invoiceDateGte;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_DATE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceDateGte(String invoiceDateGte) {
    this.invoiceDateGte = invoiceDateGte;
  }


  public InvoiceFilters invoiceDateRange(String invoiceDateRange) {
    
    this.invoiceDateRange = invoiceDateRange;
    return this;
  }

   /**
   * Get invoiceDateRange
   * @return invoiceDateRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceDateRange() {
    return invoiceDateRange;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceDateRange(String invoiceDateRange) {
    this.invoiceDateRange = invoiceDateRange;
  }


  public InvoiceFilters invoiceIdentification(String invoiceIdentification) {
    
    this.invoiceIdentification = invoiceIdentification;
    return this;
  }

   /**
   * Get invoiceIdentification
   * @return invoiceIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceIdentification() {
    return invoiceIdentification;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceIdentification(String invoiceIdentification) {
    this.invoiceIdentification = invoiceIdentification;
  }


  public InvoiceFilters invoiceIdentificationLt(String invoiceIdentificationLt) {
    
    this.invoiceIdentificationLt = invoiceIdentificationLt;
    return this;
  }

   /**
   * Get invoiceIdentificationLt
   * @return invoiceIdentificationLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceIdentificationLt() {
    return invoiceIdentificationLt;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceIdentificationLt(String invoiceIdentificationLt) {
    this.invoiceIdentificationLt = invoiceIdentificationLt;
  }


  public InvoiceFilters invoiceIdentificationLte(String invoiceIdentificationLte) {
    
    this.invoiceIdentificationLte = invoiceIdentificationLte;
    return this;
  }

   /**
   * Get invoiceIdentificationLte
   * @return invoiceIdentificationLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceIdentificationLte() {
    return invoiceIdentificationLte;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceIdentificationLte(String invoiceIdentificationLte) {
    this.invoiceIdentificationLte = invoiceIdentificationLte;
  }


  public InvoiceFilters invoiceIdentificationGt(String invoiceIdentificationGt) {
    
    this.invoiceIdentificationGt = invoiceIdentificationGt;
    return this;
  }

   /**
   * Get invoiceIdentificationGt
   * @return invoiceIdentificationGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceIdentificationGt() {
    return invoiceIdentificationGt;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceIdentificationGt(String invoiceIdentificationGt) {
    this.invoiceIdentificationGt = invoiceIdentificationGt;
  }


  public InvoiceFilters invoiceIdentificationGte(String invoiceIdentificationGte) {
    
    this.invoiceIdentificationGte = invoiceIdentificationGte;
    return this;
  }

   /**
   * Get invoiceIdentificationGte
   * @return invoiceIdentificationGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceIdentificationGte() {
    return invoiceIdentificationGte;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceIdentificationGte(String invoiceIdentificationGte) {
    this.invoiceIdentificationGte = invoiceIdentificationGte;
  }


  public InvoiceFilters invoiceIdentificationRange(String invoiceIdentificationRange) {
    
    this.invoiceIdentificationRange = invoiceIdentificationRange;
    return this;
  }

   /**
   * Get invoiceIdentificationRange
   * @return invoiceIdentificationRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceIdentificationRange() {
    return invoiceIdentificationRange;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_IDENTIFICATION_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceIdentificationRange(String invoiceIdentificationRange) {
    this.invoiceIdentificationRange = invoiceIdentificationRange;
  }


  public InvoiceFilters linkIn(String linkIn) {
    
    this.linkIn = linkIn;
    return this;
  }

   /**
   * Get linkIn
   * @return linkIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINK_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkIn() {
    return linkIn;
  }


  @JsonProperty(JSON_PROPERTY_LINK_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkIn(String linkIn) {
    this.linkIn = linkIn;
  }


  public InvoiceFilters status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public InvoiceFilters statusIn(String statusIn) {
    
    this.statusIn = statusIn;
    return this;
  }

   /**
   * Get statusIn
   * @return statusIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatusIn() {
    return statusIn;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusIn(String statusIn) {
    this.statusIn = statusIn;
  }


  public InvoiceFilters totalAmount(String totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotalAmount() {
    return totalAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }


  public InvoiceFilters totalAmountLt(String totalAmountLt) {
    
    this.totalAmountLt = totalAmountLt;
    return this;
  }

   /**
   * Get totalAmountLt
   * @return totalAmountLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotalAmountLt() {
    return totalAmountLt;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAmountLt(String totalAmountLt) {
    this.totalAmountLt = totalAmountLt;
  }


  public InvoiceFilters totalAmountLte(String totalAmountLte) {
    
    this.totalAmountLte = totalAmountLte;
    return this;
  }

   /**
   * Get totalAmountLte
   * @return totalAmountLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotalAmountLte() {
    return totalAmountLte;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAmountLte(String totalAmountLte) {
    this.totalAmountLte = totalAmountLte;
  }


  public InvoiceFilters totalAmountGt(String totalAmountGt) {
    
    this.totalAmountGt = totalAmountGt;
    return this;
  }

   /**
   * Get totalAmountGt
   * @return totalAmountGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotalAmountGt() {
    return totalAmountGt;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAmountGt(String totalAmountGt) {
    this.totalAmountGt = totalAmountGt;
  }


  public InvoiceFilters totalAmountGte(String totalAmountGte) {
    
    this.totalAmountGte = totalAmountGte;
    return this;
  }

   /**
   * Get totalAmountGte
   * @return totalAmountGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotalAmountGte() {
    return totalAmountGte;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAmountGte(String totalAmountGte) {
    this.totalAmountGte = totalAmountGte;
  }


  public InvoiceFilters totalAmountRange(String totalAmountRange) {
    
    this.totalAmountRange = totalAmountRange;
    return this;
  }

   /**
   * Get totalAmountRange
   * @return totalAmountRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotalAmountRange() {
    return totalAmountRange;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAmountRange(String totalAmountRange) {
    this.totalAmountRange = totalAmountRange;
  }


  public InvoiceFilters type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public InvoiceFilters typeIn(String typeIn) {
    
    this.typeIn = typeIn;
    return this;
  }

   /**
   * Get typeIn
   * @return typeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypeIn() {
    return typeIn;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeIn(String typeIn) {
    this.typeIn = typeIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceFilters invoiceFilters = (InvoiceFilters) o;
    return Objects.equals(this.createdAt, invoiceFilters.createdAt) &&
        Objects.equals(this.createdAtLt, invoiceFilters.createdAtLt) &&
        Objects.equals(this.createdAtLte, invoiceFilters.createdAtLte) &&
        Objects.equals(this.createdAtGt, invoiceFilters.createdAtGt) &&
        Objects.equals(this.createdAtGte, invoiceFilters.createdAtGte) &&
        Objects.equals(this.createdAtRange, invoiceFilters.createdAtRange) &&
        Objects.equals(this.id, invoiceFilters.id) &&
        Objects.equals(this.idIn, invoiceFilters.idIn) &&
        Objects.equals(this.invoiceDate, invoiceFilters.invoiceDate) &&
        Objects.equals(this.invoiceDateLt, invoiceFilters.invoiceDateLt) &&
        Objects.equals(this.invoiceDateLte, invoiceFilters.invoiceDateLte) &&
        Objects.equals(this.invoiceDateGt, invoiceFilters.invoiceDateGt) &&
        Objects.equals(this.invoiceDateGte, invoiceFilters.invoiceDateGte) &&
        Objects.equals(this.invoiceDateRange, invoiceFilters.invoiceDateRange) &&
        Objects.equals(this.invoiceIdentification, invoiceFilters.invoiceIdentification) &&
        Objects.equals(this.invoiceIdentificationLt, invoiceFilters.invoiceIdentificationLt) &&
        Objects.equals(this.invoiceIdentificationLte, invoiceFilters.invoiceIdentificationLte) &&
        Objects.equals(this.invoiceIdentificationGt, invoiceFilters.invoiceIdentificationGt) &&
        Objects.equals(this.invoiceIdentificationGte, invoiceFilters.invoiceIdentificationGte) &&
        Objects.equals(this.invoiceIdentificationRange, invoiceFilters.invoiceIdentificationRange) &&
        Objects.equals(this.linkIn, invoiceFilters.linkIn) &&
        Objects.equals(this.status, invoiceFilters.status) &&
        Objects.equals(this.statusIn, invoiceFilters.statusIn) &&
        Objects.equals(this.totalAmount, invoiceFilters.totalAmount) &&
        Objects.equals(this.totalAmountLt, invoiceFilters.totalAmountLt) &&
        Objects.equals(this.totalAmountLte, invoiceFilters.totalAmountLte) &&
        Objects.equals(this.totalAmountGt, invoiceFilters.totalAmountGt) &&
        Objects.equals(this.totalAmountGte, invoiceFilters.totalAmountGte) &&
        Objects.equals(this.totalAmountRange, invoiceFilters.totalAmountRange) &&
        Objects.equals(this.type, invoiceFilters.type) &&
        Objects.equals(this.typeIn, invoiceFilters.typeIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdAtLt, createdAtLte, createdAtGt, createdAtGte, createdAtRange, id, idIn, invoiceDate, invoiceDateLt, invoiceDateLte, invoiceDateGt, invoiceDateGte, invoiceDateRange, invoiceIdentification, invoiceIdentificationLt, invoiceIdentificationLte, invoiceIdentificationGt, invoiceIdentificationGte, invoiceIdentificationRange, linkIn, status, statusIn, totalAmount, totalAmountLt, totalAmountLte, totalAmountGt, totalAmountGte, totalAmountRange, type, typeIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceFilters {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtRange: ").append(toIndentedString(createdAtRange)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    invoiceDateLt: ").append(toIndentedString(invoiceDateLt)).append("\n");
    sb.append("    invoiceDateLte: ").append(toIndentedString(invoiceDateLte)).append("\n");
    sb.append("    invoiceDateGt: ").append(toIndentedString(invoiceDateGt)).append("\n");
    sb.append("    invoiceDateGte: ").append(toIndentedString(invoiceDateGte)).append("\n");
    sb.append("    invoiceDateRange: ").append(toIndentedString(invoiceDateRange)).append("\n");
    sb.append("    invoiceIdentification: ").append(toIndentedString(invoiceIdentification)).append("\n");
    sb.append("    invoiceIdentificationLt: ").append(toIndentedString(invoiceIdentificationLt)).append("\n");
    sb.append("    invoiceIdentificationLte: ").append(toIndentedString(invoiceIdentificationLte)).append("\n");
    sb.append("    invoiceIdentificationGt: ").append(toIndentedString(invoiceIdentificationGt)).append("\n");
    sb.append("    invoiceIdentificationGte: ").append(toIndentedString(invoiceIdentificationGte)).append("\n");
    sb.append("    invoiceIdentificationRange: ").append(toIndentedString(invoiceIdentificationRange)).append("\n");
    sb.append("    linkIn: ").append(toIndentedString(linkIn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalAmountLt: ").append(toIndentedString(totalAmountLt)).append("\n");
    sb.append("    totalAmountLte: ").append(toIndentedString(totalAmountLte)).append("\n");
    sb.append("    totalAmountGt: ").append(toIndentedString(totalAmountGt)).append("\n");
    sb.append("    totalAmountGte: ").append(toIndentedString(totalAmountGte)).append("\n");
    sb.append("    totalAmountRange: ").append(toIndentedString(totalAmountRange)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
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

