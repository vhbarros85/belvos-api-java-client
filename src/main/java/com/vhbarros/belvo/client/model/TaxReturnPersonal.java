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
 * TaxReturnPersonal
 */
@JsonPropertyOrder({
  TaxReturnPersonal.JSON_PROPERTY_ID,
  TaxReturnPersonal.JSON_PROPERTY_LINK,
  TaxReturnPersonal.JSON_PROPERTY_COLLECTED_AT,
  TaxReturnPersonal.JSON_PROPERTY_CREATED_AT,
  TaxReturnPersonal.JSON_PROPERTY_INFORMACION_GENERAL,
  TaxReturnPersonal.JSON_PROPERTY_SUELDOS_SALARIOS,
  TaxReturnPersonal.JSON_PROPERTY_SERVICIOS_PROFESIONALES,
  TaxReturnPersonal.JSON_PROPERTY_DEDUCCIONES_PERSONALES,
  TaxReturnPersonal.JSON_PROPERTY_DETERMINACION_IMPUESTO,
  TaxReturnPersonal.JSON_PROPERTY_RETENCIONES,
  TaxReturnPersonal.JSON_PROPERTY_DIVIDENDOS,
  TaxReturnPersonal.JSON_PROPERTY_DATOS_INFORMATIVOS,
  TaxReturnPersonal.JSON_PROPERTY_PDF,
  TaxReturnPersonal.JSON_PROPERTY_RECEIPT_PDF
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class TaxReturnPersonal extends HashMap<String, Object> {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_LINK = "link";
  private UUID link;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private OffsetDateTime collectedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_INFORMACION_GENERAL = "informacion_general";
  private Object informacionGeneral;

  public static final String JSON_PROPERTY_SUELDOS_SALARIOS = "sueldos_salarios";
  private Object sueldosSalarios;

  public static final String JSON_PROPERTY_SERVICIOS_PROFESIONALES = "servicios_profesionales";
  private Object serviciosProfesionales;

  public static final String JSON_PROPERTY_DEDUCCIONES_PERSONALES = "deducciones_personales";
  private Object deduccionesPersonales;

  public static final String JSON_PROPERTY_DETERMINACION_IMPUESTO = "determinacion_impuesto";
  private Object determinacionImpuesto;

  public static final String JSON_PROPERTY_RETENCIONES = "retenciones";
  private Object retenciones;

  public static final String JSON_PROPERTY_DIVIDENDOS = "dividendos";
  private Object dividendos;

  public static final String JSON_PROPERTY_DATOS_INFORMATIVOS = "datos_informativos";
  private JsonNullable<Object> datosInformativos = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_PDF = "pdf";
  private File pdf;

  public static final String JSON_PROPERTY_RECEIPT_PDF = "receipt_pdf";
  private File receiptPdf;

  public TaxReturnPersonal() {

  }

  public TaxReturnPersonal id(UUID id) {
    
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


  public TaxReturnPersonal link(UUID link) {
    
    this.link = link;
    return this;
  }

   /**
   * The &#x60;link.id&#x60; the statement belongs to
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", value = "The `link.id` the statement belongs to")
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


  public TaxReturnPersonal collectedAt(OffsetDateTime collectedAt) {
    
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


  public TaxReturnPersonal createdAt(OffsetDateTime createdAt) {
    
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


  public TaxReturnPersonal informacionGeneral(Object informacionGeneral) {
    
    this.informacionGeneral = informacionGeneral;
    return this;
  }

   /**
   * General information on the tax return (year, RFC, return type, person/company name, and so on).
   * @return informacionGeneral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "General information on the tax return (year, RFC, return type, person/company name, and so on).")
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


  public TaxReturnPersonal sueldosSalarios(Object sueldosSalarios) {
    
    this.sueldosSalarios = sueldosSalarios;
    return this;
  }

   /**
   * Details regarding the income information together combined with withheld taxes.
   * @return sueldosSalarios
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding the income information together combined with withheld taxes.")
  @JsonProperty(JSON_PROPERTY_SUELDOS_SALARIOS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getSueldosSalarios() {
    return sueldosSalarios;
  }


  @JsonProperty(JSON_PROPERTY_SUELDOS_SALARIOS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSueldosSalarios(Object sueldosSalarios) {
    this.sueldosSalarios = sueldosSalarios;
  }


  public TaxReturnPersonal serviciosProfesionales(Object serviciosProfesionales) {
    
    this.serviciosProfesionales = serviciosProfesionales;
    return this;
  }

   /**
   * Details regarding the income and tax information from professional services provided.
   * @return serviciosProfesionales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding the income and tax information from professional services provided.")
  @JsonProperty(JSON_PROPERTY_SERVICIOS_PROFESIONALES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getServiciosProfesionales() {
    return serviciosProfesionales;
  }


  @JsonProperty(JSON_PROPERTY_SERVICIOS_PROFESIONALES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiciosProfesionales(Object serviciosProfesionales) {
    this.serviciosProfesionales = serviciosProfesionales;
  }


  public TaxReturnPersonal deduccionesPersonales(Object deduccionesPersonales) {
    
    this.deduccionesPersonales = deduccionesPersonales;
    return this;
  }

   /**
   * List of all personal tax deductions.
   * @return deduccionesPersonales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "List of all personal tax deductions.")
  @JsonProperty(JSON_PROPERTY_DEDUCCIONES_PERSONALES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDeduccionesPersonales() {
    return deduccionesPersonales;
  }


  @JsonProperty(JSON_PROPERTY_DEDUCCIONES_PERSONALES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeduccionesPersonales(Object deduccionesPersonales) {
    this.deduccionesPersonales = deduccionesPersonales;
  }


  public TaxReturnPersonal determinacionImpuesto(Object determinacionImpuesto) {
    
    this.determinacionImpuesto = determinacionImpuesto;
    return this;
  }

   /**
   * Details regarding the final tax return.
   * @return determinacionImpuesto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding the final tax return.")
  @JsonProperty(JSON_PROPERTY_DETERMINACION_IMPUESTO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDeterminacionImpuesto() {
    return determinacionImpuesto;
  }


  @JsonProperty(JSON_PROPERTY_DETERMINACION_IMPUESTO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeterminacionImpuesto(Object determinacionImpuesto) {
    this.determinacionImpuesto = determinacionImpuesto;
  }


  public TaxReturnPersonal retenciones(Object retenciones) {
    
    this.retenciones = retenciones;
    return this;
  }

   /**
   * Details on the already withheld taxes.
   * @return retenciones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details on the already withheld taxes.")
  @JsonProperty(JSON_PROPERTY_RETENCIONES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getRetenciones() {
    return retenciones;
  }


  @JsonProperty(JSON_PROPERTY_RETENCIONES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRetenciones(Object retenciones) {
    this.retenciones = retenciones;
  }


  public TaxReturnPersonal dividendos(Object dividendos) {
    
    this.dividendos = dividendos;
    return this;
  }

   /**
   * Details regarding dividends.
   * @return dividendos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding dividends.")
  @JsonProperty(JSON_PROPERTY_DIVIDENDOS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDividendos() {
    return dividendos;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDENDOS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDividendos(Object dividendos) {
    this.dividendos = dividendos;
  }


  public TaxReturnPersonal datosInformativos(Object datosInformativos) {
    this.datosInformativos = JsonNullable.<Object>of(datosInformativos);
    
    return this;
  }

   /**
   * Extra informative data on the tax return.
   * @return datosInformativos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extra informative data on the tax return.")
  @JsonIgnore

  public Object getDatosInformativos() {
        return datosInformativos.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATOS_INFORMATIVOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDatosInformativos_JsonNullable() {
    return datosInformativos;
  }
  
  @JsonProperty(JSON_PROPERTY_DATOS_INFORMATIVOS)
  public void setDatosInformativos_JsonNullable(JsonNullable<Object> datosInformativos) {
    this.datosInformativos = datosInformativos;
  }

  public void setDatosInformativos(Object datosInformativos) {
    this.datosInformativos = JsonNullable.<Object>of(datosInformativos);
  }


  public TaxReturnPersonal pdf(File pdf) {
    
    this.pdf = pdf;
    return this;
  }

   /**
   * Tax return PDF as a binary.
   * @return pdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@2bcd6236", required = true, value = "Tax return PDF as a binary.")
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


  public TaxReturnPersonal receiptPdf(File receiptPdf) {
    
    this.receiptPdf = receiptPdf;
    return this;
  }

   /**
   * The acknowledgement receipt from the fiscal institution confirming that they received the tax return.
   * @return receiptPdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@280f1510", required = true, value = "The acknowledgement receipt from the fiscal institution confirming that they received the tax return.")
  @JsonProperty(JSON_PROPERTY_RECEIPT_PDF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public File getReceiptPdf() {
    return receiptPdf;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_PDF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReceiptPdf(File receiptPdf) {
    this.receiptPdf = receiptPdf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxReturnPersonal taxReturnPersonal = (TaxReturnPersonal) o;
    return Objects.equals(this.id, taxReturnPersonal.id) &&
        Objects.equals(this.link, taxReturnPersonal.link) &&
        Objects.equals(this.collectedAt, taxReturnPersonal.collectedAt) &&
        Objects.equals(this.createdAt, taxReturnPersonal.createdAt) &&
        Objects.equals(this.informacionGeneral, taxReturnPersonal.informacionGeneral) &&
        Objects.equals(this.sueldosSalarios, taxReturnPersonal.sueldosSalarios) &&
        Objects.equals(this.serviciosProfesionales, taxReturnPersonal.serviciosProfesionales) &&
        Objects.equals(this.deduccionesPersonales, taxReturnPersonal.deduccionesPersonales) &&
        Objects.equals(this.determinacionImpuesto, taxReturnPersonal.determinacionImpuesto) &&
        Objects.equals(this.retenciones, taxReturnPersonal.retenciones) &&
        Objects.equals(this.dividendos, taxReturnPersonal.dividendos) &&
        equalsNullable(this.datosInformativos, taxReturnPersonal.datosInformativos) &&
        Objects.equals(this.pdf, taxReturnPersonal.pdf) &&
        Objects.equals(this.receiptPdf, taxReturnPersonal.receiptPdf) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, collectedAt, createdAt, informacionGeneral, sueldosSalarios, serviciosProfesionales, deduccionesPersonales, determinacionImpuesto, retenciones, dividendos, hashCodeNullable(datosInformativos), pdf, receiptPdf, super.hashCode());
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
    sb.append("class TaxReturnPersonal {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    informacionGeneral: ").append(toIndentedString(informacionGeneral)).append("\n");
    sb.append("    sueldosSalarios: ").append(toIndentedString(sueldosSalarios)).append("\n");
    sb.append("    serviciosProfesionales: ").append(toIndentedString(serviciosProfesionales)).append("\n");
    sb.append("    deduccionesPersonales: ").append(toIndentedString(deduccionesPersonales)).append("\n");
    sb.append("    determinacionImpuesto: ").append(toIndentedString(determinacionImpuesto)).append("\n");
    sb.append("    retenciones: ").append(toIndentedString(retenciones)).append("\n");
    sb.append("    dividendos: ").append(toIndentedString(dividendos)).append("\n");
    sb.append("    datosInformativos: ").append(toIndentedString(datosInformativos)).append("\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
    sb.append("    receiptPdf: ").append(toIndentedString(receiptPdf)).append("\n");
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

