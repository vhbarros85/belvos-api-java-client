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
import com.vhbarros.belvo.client.model.TaxReturnBusiness;
import com.vhbarros.belvo.client.model.TaxReturnBusinessMonthly;
import com.vhbarros.belvo.client.model.TaxReturnPersonal;
import com.vhbarros.belvo.client.model.TaxReturnPersonalMonthly;
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
 * RetrieveTaxReturns200ResponseInner
 */
@JsonPropertyOrder({
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_ID,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_LINK,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_COLLECTED_AT,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_CREATED_AT,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_INFORMACION_GENERAL,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_SUELDOS_SALARIOS,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_SERVICIOS_PROFESIONALES,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_DEDUCCIONES_PERSONALES,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_DETERMINACION_IMPUESTO,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_RETENCIONES,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_DIVIDENDOS,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_DATOS_INFORMATIVOS,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_PDF,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_RECEIPT_PDF,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_ISR,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_IVA,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_TYPE,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_DATOS_ADICIONALES,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_ESTADO_RESULTADOS,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_ESTADO_POSICION_FINANCIERA_BALANCE,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_CONCILIACION_ENTRE_RESULTADO_CONTABLE_FISCAL,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_DEDUCCIONES_AUTORIZADAS,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_CIFRAS_CIERRE_EJERCICIO,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_DETERMINACION_DEL_IMPUESTO_SOBRE_LA_RENTA,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_DIVIDENDOS_O_UTILIDADES_DISTRIBUIDOS,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_DETALLE_PAGO_R1_ISR_PERSONAS_MORALES,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_DETERMINACION_ISR,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_DETALLE_PAGO_ISR,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_DETERMINACION_IVA,
  RetrieveTaxReturns200ResponseInner.JSON_PROPERTY_DETALLE_PAGO_IVA
})
@JsonTypeName("RetrieveTaxReturns_200_response_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class RetrieveTaxReturns200ResponseInner {
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

  public static final String JSON_PROPERTY_ISR = "isr";
  private Object isr;

  public static final String JSON_PROPERTY_IVA = "iva";
  private Object iva;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_DATOS_ADICIONALES = "datos_adicionales";
  private JsonNullable<Object> datosAdicionales = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_ESTADO_RESULTADOS = "estado_resultados";
  private Object estadoResultados;

  public static final String JSON_PROPERTY_ESTADO_POSICION_FINANCIERA_BALANCE = "estado_posicion_financiera_balance";
  private Object estadoPosicionFinancieraBalance;

  public static final String JSON_PROPERTY_CONCILIACION_ENTRE_RESULTADO_CONTABLE_FISCAL = "conciliacion_entre_resultado_contable_fiscal";
  private Object conciliacionEntreResultadoContableFiscal;

  public static final String JSON_PROPERTY_DEDUCCIONES_AUTORIZADAS = "deducciones_autorizadas";
  private JsonNullable<Object> deduccionesAutorizadas = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_CIFRAS_CIERRE_EJERCICIO = "cifras_cierre_ejercicio";
  private Object cifrasCierreEjercicio;

  public static final String JSON_PROPERTY_DETERMINACION_DEL_IMPUESTO_SOBRE_LA_RENTA = "determinacion_del_impuesto_sobre_la_renta";
  private Object determinacionDelImpuestoSobreLaRenta;

  public static final String JSON_PROPERTY_DIVIDENDOS_O_UTILIDADES_DISTRIBUIDOS = "dividendos_o_utilidades_distribuidos";
  private JsonNullable<Object> dividendosOUtilidadesDistribuidos = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_DETALLE_PAGO_R1_ISR_PERSONAS_MORALES = "detalle_pago_r1_isr_personas_morales";
  private Object detallePagoR1IsrPersonasMorales;

  public static final String JSON_PROPERTY_DETERMINACION_ISR = "determinacion_isr";
  private Object determinacionIsr;

  public static final String JSON_PROPERTY_DETALLE_PAGO_ISR = "detalle_pago_isr";
  private Object detallePagoIsr;

  public static final String JSON_PROPERTY_DETERMINACION_IVA = "determinacion_iva";
  private Object determinacionIva;

  public static final String JSON_PROPERTY_DETALLE_PAGO_IVA = "detalle_pago_iva";
  private Object detallePagoIva;

  public RetrieveTaxReturns200ResponseInner() {
  }

  public RetrieveTaxReturns200ResponseInner id(UUID id) {
    
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


  public RetrieveTaxReturns200ResponseInner link(UUID link) {
    
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


  public RetrieveTaxReturns200ResponseInner collectedAt(OffsetDateTime collectedAt) {
    
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


  public RetrieveTaxReturns200ResponseInner createdAt(OffsetDateTime createdAt) {
    
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


  public RetrieveTaxReturns200ResponseInner informacionGeneral(Object informacionGeneral) {
    
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


  public RetrieveTaxReturns200ResponseInner sueldosSalarios(Object sueldosSalarios) {
    
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


  public RetrieveTaxReturns200ResponseInner serviciosProfesionales(Object serviciosProfesionales) {
    
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


  public RetrieveTaxReturns200ResponseInner deduccionesPersonales(Object deduccionesPersonales) {
    
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


  public RetrieveTaxReturns200ResponseInner determinacionImpuesto(Object determinacionImpuesto) {
    
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


  public RetrieveTaxReturns200ResponseInner retenciones(Object retenciones) {
    
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


  public RetrieveTaxReturns200ResponseInner dividendos(Object dividendos) {
    
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


  public RetrieveTaxReturns200ResponseInner datosInformativos(Object datosInformativos) {
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


  public RetrieveTaxReturns200ResponseInner pdf(File pdf) {
    
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


  public RetrieveTaxReturns200ResponseInner receiptPdf(File receiptPdf) {
    
    this.receiptPdf = receiptPdf;
    return this;
  }

   /**
   * The acknowledgement receipt from the fiscal institution confirming that they received the tax return.
   * @return receiptPdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@42482b31", required = true, value = "The acknowledgement receipt from the fiscal institution confirming that they received the tax return.")
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


  public RetrieveTaxReturns200ResponseInner isr(Object isr) {
    
    this.isr = isr;
    return this;
  }

   /**
   * Information used to calculate the monthly provisional payments of the income tax.
   * @return isr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Information used to calculate the monthly provisional payments of the income tax.")
  @JsonProperty(JSON_PROPERTY_ISR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getIsr() {
    return isr;
  }


  @JsonProperty(JSON_PROPERTY_ISR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsr(Object isr) {
    this.isr = isr;
  }


  public RetrieveTaxReturns200ResponseInner iva(Object iva) {
    
    this.iva = iva;
    return this;
  }

   /**
   * Information used to calculate the monthly provisional payments of the VAT tax.
   * @return iva
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Information used to calculate the monthly provisional payments of the VAT tax.")
  @JsonProperty(JSON_PROPERTY_IVA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getIva() {
    return iva;
  }


  @JsonProperty(JSON_PROPERTY_IVA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIva(Object iva) {
    this.iva = iva;
  }


  public RetrieveTaxReturns200ResponseInner type(String type) {
    
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


  public RetrieveTaxReturns200ResponseInner datosAdicionales(Object datosAdicionales) {
    this.datosAdicionales = JsonNullable.<Object>of(datosAdicionales);
    
    return this;
  }

   /**
   * Additional data regarding the tax return.
   * @return datosAdicionales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional data regarding the tax return.")
  @JsonIgnore

  public Object getDatosAdicionales() {
        return datosAdicionales.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATOS_ADICIONALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDatosAdicionales_JsonNullable() {
    return datosAdicionales;
  }
  
  @JsonProperty(JSON_PROPERTY_DATOS_ADICIONALES)
  public void setDatosAdicionales_JsonNullable(JsonNullable<Object> datosAdicionales) {
    this.datosAdicionales = datosAdicionales;
  }

  public void setDatosAdicionales(Object datosAdicionales) {
    this.datosAdicionales = JsonNullable.<Object>of(datosAdicionales);
  }


  public RetrieveTaxReturns200ResponseInner estadoResultados(Object estadoResultados) {
    
    this.estadoResultados = estadoResultados;
    return this;
  }

   /**
   * Detailed information about the legal entity&#39;s yearly profit and loss.
   * @return estadoResultados
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Detailed information about the legal entity's yearly profit and loss.")
  @JsonProperty(JSON_PROPERTY_ESTADO_RESULTADOS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getEstadoResultados() {
    return estadoResultados;
  }


  @JsonProperty(JSON_PROPERTY_ESTADO_RESULTADOS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEstadoResultados(Object estadoResultados) {
    this.estadoResultados = estadoResultados;
  }


  public RetrieveTaxReturns200ResponseInner estadoPosicionFinancieraBalance(Object estadoPosicionFinancieraBalance) {
    
    this.estadoPosicionFinancieraBalance = estadoPosicionFinancieraBalance;
    return this;
  }

   /**
   * Details regarding balance sheet of the legal entity.
   * @return estadoPosicionFinancieraBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding balance sheet of the legal entity.")
  @JsonProperty(JSON_PROPERTY_ESTADO_POSICION_FINANCIERA_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getEstadoPosicionFinancieraBalance() {
    return estadoPosicionFinancieraBalance;
  }


  @JsonProperty(JSON_PROPERTY_ESTADO_POSICION_FINANCIERA_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEstadoPosicionFinancieraBalance(Object estadoPosicionFinancieraBalance) {
    this.estadoPosicionFinancieraBalance = estadoPosicionFinancieraBalance;
  }


  public RetrieveTaxReturns200ResponseInner conciliacionEntreResultadoContableFiscal(Object conciliacionEntreResultadoContableFiscal) {
    
    this.conciliacionEntreResultadoContableFiscal = conciliacionEntreResultadoContableFiscal;
    return this;
  }

   /**
   * Details regarding the accounting reconciliation.
   * @return conciliacionEntreResultadoContableFiscal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding the accounting reconciliation.")
  @JsonProperty(JSON_PROPERTY_CONCILIACION_ENTRE_RESULTADO_CONTABLE_FISCAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getConciliacionEntreResultadoContableFiscal() {
    return conciliacionEntreResultadoContableFiscal;
  }


  @JsonProperty(JSON_PROPERTY_CONCILIACION_ENTRE_RESULTADO_CONTABLE_FISCAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConciliacionEntreResultadoContableFiscal(Object conciliacionEntreResultadoContableFiscal) {
    this.conciliacionEntreResultadoContableFiscal = conciliacionEntreResultadoContableFiscal;
  }


  public RetrieveTaxReturns200ResponseInner deduccionesAutorizadas(Object deduccionesAutorizadas) {
    this.deduccionesAutorizadas = JsonNullable.<Object>of(deduccionesAutorizadas);
    
    return this;
  }

   /**
   * Details regarding the legal entity&#39;s deductions.
   * @return deduccionesAutorizadas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details regarding the legal entity's deductions.")
  @JsonIgnore

  public Object getDeduccionesAutorizadas() {
        return deduccionesAutorizadas.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEDUCCIONES_AUTORIZADAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDeduccionesAutorizadas_JsonNullable() {
    return deduccionesAutorizadas;
  }
  
  @JsonProperty(JSON_PROPERTY_DEDUCCIONES_AUTORIZADAS)
  public void setDeduccionesAutorizadas_JsonNullable(JsonNullable<Object> deduccionesAutorizadas) {
    this.deduccionesAutorizadas = deduccionesAutorizadas;
  }

  public void setDeduccionesAutorizadas(Object deduccionesAutorizadas) {
    this.deduccionesAutorizadas = JsonNullable.<Object>of(deduccionesAutorizadas);
  }


  public RetrieveTaxReturns200ResponseInner cifrasCierreEjercicio(Object cifrasCierreEjercicio) {
    
    this.cifrasCierreEjercicio = cifrasCierreEjercicio;
    return this;
  }

   /**
   * Details regarding key numbers at the end of the fiscal exercise.
   * @return cifrasCierreEjercicio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding key numbers at the end of the fiscal exercise.")
  @JsonProperty(JSON_PROPERTY_CIFRAS_CIERRE_EJERCICIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getCifrasCierreEjercicio() {
    return cifrasCierreEjercicio;
  }


  @JsonProperty(JSON_PROPERTY_CIFRAS_CIERRE_EJERCICIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCifrasCierreEjercicio(Object cifrasCierreEjercicio) {
    this.cifrasCierreEjercicio = cifrasCierreEjercicio;
  }


  public RetrieveTaxReturns200ResponseInner determinacionDelImpuestoSobreLaRenta(Object determinacionDelImpuestoSobreLaRenta) {
    
    this.determinacionDelImpuestoSobreLaRenta = determinacionDelImpuestoSobreLaRenta;
    return this;
  }

   /**
   * Details regarding the final tax return.
   * @return determinacionDelImpuestoSobreLaRenta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding the final tax return.")
  @JsonProperty(JSON_PROPERTY_DETERMINACION_DEL_IMPUESTO_SOBRE_LA_RENTA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDeterminacionDelImpuestoSobreLaRenta() {
    return determinacionDelImpuestoSobreLaRenta;
  }


  @JsonProperty(JSON_PROPERTY_DETERMINACION_DEL_IMPUESTO_SOBRE_LA_RENTA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeterminacionDelImpuestoSobreLaRenta(Object determinacionDelImpuestoSobreLaRenta) {
    this.determinacionDelImpuestoSobreLaRenta = determinacionDelImpuestoSobreLaRenta;
  }


  public RetrieveTaxReturns200ResponseInner dividendosOUtilidadesDistribuidos(Object dividendosOUtilidadesDistribuidos) {
    this.dividendosOUtilidadesDistribuidos = JsonNullable.<Object>of(dividendosOUtilidadesDistribuidos);
    
    return this;
  }

   /**
   * Details regarding distributed dividends.
   * @return dividendosOUtilidadesDistribuidos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details regarding distributed dividends.")
  @JsonIgnore

  public Object getDividendosOUtilidadesDistribuidos() {
        return dividendosOUtilidadesDistribuidos.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DIVIDENDOS_O_UTILIDADES_DISTRIBUIDOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDividendosOUtilidadesDistribuidos_JsonNullable() {
    return dividendosOUtilidadesDistribuidos;
  }
  
  @JsonProperty(JSON_PROPERTY_DIVIDENDOS_O_UTILIDADES_DISTRIBUIDOS)
  public void setDividendosOUtilidadesDistribuidos_JsonNullable(JsonNullable<Object> dividendosOUtilidadesDistribuidos) {
    this.dividendosOUtilidadesDistribuidos = dividendosOUtilidadesDistribuidos;
  }

  public void setDividendosOUtilidadesDistribuidos(Object dividendosOUtilidadesDistribuidos) {
    this.dividendosOUtilidadesDistribuidos = JsonNullable.<Object>of(dividendosOUtilidadesDistribuidos);
  }


  public RetrieveTaxReturns200ResponseInner detallePagoR1IsrPersonasMorales(Object detallePagoR1IsrPersonasMorales) {
    
    this.detallePagoR1IsrPersonasMorales = detallePagoR1IsrPersonasMorales;
    return this;
  }

   /**
   * Details of the tax payment.
   * @return detallePagoR1IsrPersonasMorales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details of the tax payment.")
  @JsonProperty(JSON_PROPERTY_DETALLE_PAGO_R1_ISR_PERSONAS_MORALES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDetallePagoR1IsrPersonasMorales() {
    return detallePagoR1IsrPersonasMorales;
  }


  @JsonProperty(JSON_PROPERTY_DETALLE_PAGO_R1_ISR_PERSONAS_MORALES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDetallePagoR1IsrPersonasMorales(Object detallePagoR1IsrPersonasMorales) {
    this.detallePagoR1IsrPersonasMorales = detallePagoR1IsrPersonasMorales;
  }


  public RetrieveTaxReturns200ResponseInner determinacionIsr(Object determinacionIsr) {
    
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


  public RetrieveTaxReturns200ResponseInner detallePagoIsr(Object detallePagoIsr) {
    
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


  public RetrieveTaxReturns200ResponseInner determinacionIva(Object determinacionIva) {
    
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


  public RetrieveTaxReturns200ResponseInner detallePagoIva(Object detallePagoIva) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveTaxReturns200ResponseInner retrieveTaxReturns200ResponseInner = (RetrieveTaxReturns200ResponseInner) o;
    return Objects.equals(this.id, retrieveTaxReturns200ResponseInner.id) &&
        Objects.equals(this.link, retrieveTaxReturns200ResponseInner.link) &&
        Objects.equals(this.collectedAt, retrieveTaxReturns200ResponseInner.collectedAt) &&
        Objects.equals(this.createdAt, retrieveTaxReturns200ResponseInner.createdAt) &&
        Objects.equals(this.informacionGeneral, retrieveTaxReturns200ResponseInner.informacionGeneral) &&
        Objects.equals(this.sueldosSalarios, retrieveTaxReturns200ResponseInner.sueldosSalarios) &&
        Objects.equals(this.serviciosProfesionales, retrieveTaxReturns200ResponseInner.serviciosProfesionales) &&
        Objects.equals(this.deduccionesPersonales, retrieveTaxReturns200ResponseInner.deduccionesPersonales) &&
        Objects.equals(this.determinacionImpuesto, retrieveTaxReturns200ResponseInner.determinacionImpuesto) &&
        Objects.equals(this.retenciones, retrieveTaxReturns200ResponseInner.retenciones) &&
        Objects.equals(this.dividendos, retrieveTaxReturns200ResponseInner.dividendos) &&
        equalsNullable(this.datosInformativos, retrieveTaxReturns200ResponseInner.datosInformativos) &&
        Objects.equals(this.pdf, retrieveTaxReturns200ResponseInner.pdf) &&
        Objects.equals(this.receiptPdf, retrieveTaxReturns200ResponseInner.receiptPdf) &&
        Objects.equals(this.isr, retrieveTaxReturns200ResponseInner.isr) &&
        Objects.equals(this.iva, retrieveTaxReturns200ResponseInner.iva) &&
        Objects.equals(this.type, retrieveTaxReturns200ResponseInner.type) &&
        equalsNullable(this.datosAdicionales, retrieveTaxReturns200ResponseInner.datosAdicionales) &&
        Objects.equals(this.estadoResultados, retrieveTaxReturns200ResponseInner.estadoResultados) &&
        Objects.equals(this.estadoPosicionFinancieraBalance, retrieveTaxReturns200ResponseInner.estadoPosicionFinancieraBalance) &&
        Objects.equals(this.conciliacionEntreResultadoContableFiscal, retrieveTaxReturns200ResponseInner.conciliacionEntreResultadoContableFiscal) &&
        equalsNullable(this.deduccionesAutorizadas, retrieveTaxReturns200ResponseInner.deduccionesAutorizadas) &&
        Objects.equals(this.cifrasCierreEjercicio, retrieveTaxReturns200ResponseInner.cifrasCierreEjercicio) &&
        Objects.equals(this.determinacionDelImpuestoSobreLaRenta, retrieveTaxReturns200ResponseInner.determinacionDelImpuestoSobreLaRenta) &&
        equalsNullable(this.dividendosOUtilidadesDistribuidos, retrieveTaxReturns200ResponseInner.dividendosOUtilidadesDistribuidos) &&
        Objects.equals(this.detallePagoR1IsrPersonasMorales, retrieveTaxReturns200ResponseInner.detallePagoR1IsrPersonasMorales) &&
        Objects.equals(this.determinacionIsr, retrieveTaxReturns200ResponseInner.determinacionIsr) &&
        Objects.equals(this.detallePagoIsr, retrieveTaxReturns200ResponseInner.detallePagoIsr) &&
        Objects.equals(this.determinacionIva, retrieveTaxReturns200ResponseInner.determinacionIva) &&
        Objects.equals(this.detallePagoIva, retrieveTaxReturns200ResponseInner.detallePagoIva);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, collectedAt, createdAt, informacionGeneral, sueldosSalarios, serviciosProfesionales, deduccionesPersonales, determinacionImpuesto, retenciones, dividendos, hashCodeNullable(datosInformativos), pdf, receiptPdf, isr, iva, type, hashCodeNullable(datosAdicionales), estadoResultados, estadoPosicionFinancieraBalance, conciliacionEntreResultadoContableFiscal, hashCodeNullable(deduccionesAutorizadas), cifrasCierreEjercicio, determinacionDelImpuestoSobreLaRenta, hashCodeNullable(dividendosOUtilidadesDistribuidos), detallePagoR1IsrPersonasMorales, determinacionIsr, detallePagoIsr, determinacionIva, detallePagoIva);
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
    sb.append("class RetrieveTaxReturns200ResponseInner {\n");
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
    sb.append("    isr: ").append(toIndentedString(isr)).append("\n");
    sb.append("    iva: ").append(toIndentedString(iva)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    datosAdicionales: ").append(toIndentedString(datosAdicionales)).append("\n");
    sb.append("    estadoResultados: ").append(toIndentedString(estadoResultados)).append("\n");
    sb.append("    estadoPosicionFinancieraBalance: ").append(toIndentedString(estadoPosicionFinancieraBalance)).append("\n");
    sb.append("    conciliacionEntreResultadoContableFiscal: ").append(toIndentedString(conciliacionEntreResultadoContableFiscal)).append("\n");
    sb.append("    deduccionesAutorizadas: ").append(toIndentedString(deduccionesAutorizadas)).append("\n");
    sb.append("    cifrasCierreEjercicio: ").append(toIndentedString(cifrasCierreEjercicio)).append("\n");
    sb.append("    determinacionDelImpuestoSobreLaRenta: ").append(toIndentedString(determinacionDelImpuestoSobreLaRenta)).append("\n");
    sb.append("    dividendosOUtilidadesDistribuidos: ").append(toIndentedString(dividendosOUtilidadesDistribuidos)).append("\n");
    sb.append("    detallePagoR1IsrPersonasMorales: ").append(toIndentedString(detallePagoR1IsrPersonasMorales)).append("\n");
    sb.append("    determinacionIsr: ").append(toIndentedString(determinacionIsr)).append("\n");
    sb.append("    detallePagoIsr: ").append(toIndentedString(detallePagoIsr)).append("\n");
    sb.append("    determinacionIva: ").append(toIndentedString(determinacionIva)).append("\n");
    sb.append("    detallePagoIva: ").append(toIndentedString(detallePagoIva)).append("\n");
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

