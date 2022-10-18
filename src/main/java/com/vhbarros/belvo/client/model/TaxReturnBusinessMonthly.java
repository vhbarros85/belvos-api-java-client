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
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TaxReturnBusinessMonthly
 */
@JsonPropertyOrder({
  TaxReturnBusinessMonthly.JSON_PROPERTY_ID,
  TaxReturnBusinessMonthly.JSON_PROPERTY_COLLECTED_AT,
  TaxReturnBusinessMonthly.JSON_PROPERTY_CREATED_AT,
  TaxReturnBusinessMonthly.JSON_PROPERTY_INFORMACION_GENERAL,
  TaxReturnBusinessMonthly.JSON_PROPERTY_DETERMINACION_ISR,
  TaxReturnBusinessMonthly.JSON_PROPERTY_DETALLE_PAGO_ISR,
  TaxReturnBusinessMonthly.JSON_PROPERTY_DETERMINACION_IVA,
  TaxReturnBusinessMonthly.JSON_PROPERTY_DETALLE_PAGO_IVA,
  TaxReturnBusinessMonthly.JSON_PROPERTY_PDF,
  TaxReturnBusinessMonthly.JSON_PROPERTY_RECEIPT_PDF,
  TaxReturnBusinessMonthly.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class TaxReturnBusinessMonthly extends HashMap<String, Object> {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private OffsetDateTime collectedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_INFORMACION_GENERAL = "informacion_general";
  private Object informacionGeneral;

  public static final String JSON_PROPERTY_DETERMINACION_ISR = "determinacion_isr";
  private Object determinacionIsr;

  public static final String JSON_PROPERTY_DETALLE_PAGO_ISR = "detalle_pago_isr";
  private Object detallePagoIsr;

  public static final String JSON_PROPERTY_DETERMINACION_IVA = "determinacion_iva";
  private Object determinacionIva;

  public static final String JSON_PROPERTY_DETALLE_PAGO_IVA = "detalle_pago_iva";
  private Object detallePagoIva;

  public static final String JSON_PROPERTY_PDF = "pdf";
  private File pdf;

  public static final String JSON_PROPERTY_RECEIPT_PDF = "receipt_pdf";
  private JsonNullable<File> receiptPdf = JsonNullable.<File>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public TaxReturnBusinessMonthly() {

  }

  public TaxReturnBusinessMonthly id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier created by Belvo used to reference the current Tax Return.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0d3ffb69-f83b-456e-ad8e-208d0998d71d", value = "Unique identifier created by Belvo used to reference the current Tax Return.")
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


  public TaxReturnBusinessMonthly collectedAt(OffsetDateTime collectedAt) {
    
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


  public TaxReturnBusinessMonthly createdAt(OffsetDateTime createdAt) {
    
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


  public TaxReturnBusinessMonthly informacionGeneral(Object informacionGeneral) {
    
    this.informacionGeneral = informacionGeneral;
    return this;
  }

   /**
   * General information regarding the tax return (year, RFC, return type, person/company name, and so on).
   * @return informacionGeneral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "General information regarding the tax return (year, RFC, return type, person/company name, and so on).")
  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getInformacionGeneral() {
    return informacionGeneral;
  }


  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInformacionGeneral(Object informacionGeneral) {
    this.informacionGeneral = informacionGeneral;
  }


  public TaxReturnBusinessMonthly determinacionIsr(Object determinacionIsr) {
    
    this.determinacionIsr = determinacionIsr;
    return this;
  }

   /**
   * Information used to calculate the provisional income tax for the period.
   * @return determinacionIsr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Information used to calculate the provisional income tax for the period.")
  @JsonProperty(JSON_PROPERTY_DETERMINACION_ISR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDeterminacionIsr() {
    return determinacionIsr;
  }


  @JsonProperty(JSON_PROPERTY_DETERMINACION_ISR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeterminacionIsr(Object determinacionIsr) {
    this.determinacionIsr = determinacionIsr;
  }


  public TaxReturnBusinessMonthly detallePagoIsr(Object detallePagoIsr) {
    
    this.detallePagoIsr = detallePagoIsr;
    return this;
  }

   /**
   * Information on the monthly provisional payments for the income tax.
   * @return detallePagoIsr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Information on the monthly provisional payments for the income tax.")
  @JsonProperty(JSON_PROPERTY_DETALLE_PAGO_ISR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDetallePagoIsr() {
    return detallePagoIsr;
  }


  @JsonProperty(JSON_PROPERTY_DETALLE_PAGO_ISR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDetallePagoIsr(Object detallePagoIsr) {
    this.detallePagoIsr = detallePagoIsr;
  }


  public TaxReturnBusinessMonthly determinacionIva(Object determinacionIva) {
    
    this.determinacionIva = determinacionIva;
    return this;
  }

   /**
   * Information used to calculate the provisional VAT tax for the period.
   * @return determinacionIva
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Information used to calculate the provisional VAT tax for the period.")
  @JsonProperty(JSON_PROPERTY_DETERMINACION_IVA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDeterminacionIva() {
    return determinacionIva;
  }


  @JsonProperty(JSON_PROPERTY_DETERMINACION_IVA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeterminacionIva(Object determinacionIva) {
    this.determinacionIva = determinacionIva;
  }


  public TaxReturnBusinessMonthly detallePagoIva(Object detallePagoIva) {
    
    this.detallePagoIva = detallePagoIva;
    return this;
  }

   /**
   * Information on the monthly provisional payments for the VAT tax.
   * @return detallePagoIva
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Information on the monthly provisional payments for the VAT tax.")
  @JsonProperty(JSON_PROPERTY_DETALLE_PAGO_IVA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDetallePagoIva() {
    return detallePagoIva;
  }


  @JsonProperty(JSON_PROPERTY_DETALLE_PAGO_IVA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDetallePagoIva(Object detallePagoIva) {
    this.detallePagoIva = detallePagoIva;
  }


  public TaxReturnBusinessMonthly pdf(File pdf) {
    
    this.pdf = pdf;
    return this;
  }

   /**
   * Tax return PDF as a binary.
   * @return pdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@402fe91b", required = true, value = "Tax return PDF as a binary.")
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


  public TaxReturnBusinessMonthly receiptPdf(File receiptPdf) {
    this.receiptPdf = JsonNullable.<File>of(receiptPdf);
    
    return this;
  }

   /**
   * The acknowledgement receipt from the fiscal institution confirming that they received the tax return.
   * @return receiptPdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@42482b31", value = "The acknowledgement receipt from the fiscal institution confirming that they received the tax return.")
  @JsonIgnore

  public File getReceiptPdf() {
        return receiptPdf.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECEIPT_PDF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<File> getReceiptPdf_JsonNullable() {
    return receiptPdf;
  }
  
  @JsonProperty(JSON_PROPERTY_RECEIPT_PDF)
  public void setReceiptPdf_JsonNullable(JsonNullable<File> receiptPdf) {
    this.receiptPdf = receiptPdf;
  }

  public void setReceiptPdf(File receiptPdf) {
    this.receiptPdf = JsonNullable.<File>of(receiptPdf);
  }


  public TaxReturnBusinessMonthly type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of tax return. Can be either monthly or annual.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "monthly", required = true, value = "The type of tax return. Can be either monthly or annual.")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxReturnBusinessMonthly taxReturnBusinessMonthly = (TaxReturnBusinessMonthly) o;
    return Objects.equals(this.id, taxReturnBusinessMonthly.id) &&
        Objects.equals(this.collectedAt, taxReturnBusinessMonthly.collectedAt) &&
        Objects.equals(this.createdAt, taxReturnBusinessMonthly.createdAt) &&
        Objects.equals(this.informacionGeneral, taxReturnBusinessMonthly.informacionGeneral) &&
        Objects.equals(this.determinacionIsr, taxReturnBusinessMonthly.determinacionIsr) &&
        Objects.equals(this.detallePagoIsr, taxReturnBusinessMonthly.detallePagoIsr) &&
        Objects.equals(this.determinacionIva, taxReturnBusinessMonthly.determinacionIva) &&
        Objects.equals(this.detallePagoIva, taxReturnBusinessMonthly.detallePagoIva) &&
        Objects.equals(this.pdf, taxReturnBusinessMonthly.pdf) &&
        equalsNullable(this.receiptPdf, taxReturnBusinessMonthly.receiptPdf) &&
        Objects.equals(this.type, taxReturnBusinessMonthly.type) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, collectedAt, createdAt, informacionGeneral, determinacionIsr, detallePagoIsr, determinacionIva, detallePagoIva, pdf, hashCodeNullable(receiptPdf), type, super.hashCode());
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
    sb.append("class TaxReturnBusinessMonthly {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    informacionGeneral: ").append(toIndentedString(informacionGeneral)).append("\n");
    sb.append("    determinacionIsr: ").append(toIndentedString(determinacionIsr)).append("\n");
    sb.append("    detallePagoIsr: ").append(toIndentedString(detallePagoIsr)).append("\n");
    sb.append("    determinacionIva: ").append(toIndentedString(determinacionIva)).append("\n");
    sb.append("    detallePagoIva: ").append(toIndentedString(detallePagoIva)).append("\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
    sb.append("    receiptPdf: ").append(toIndentedString(receiptPdf)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

