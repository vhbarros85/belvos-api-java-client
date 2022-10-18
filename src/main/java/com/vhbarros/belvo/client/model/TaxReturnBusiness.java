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
 * TaxReturnBusiness
 */
@JsonPropertyOrder({
  TaxReturnBusiness.JSON_PROPERTY_ID,
  TaxReturnBusiness.JSON_PROPERTY_COLLECTED_AT,
  TaxReturnBusiness.JSON_PROPERTY_CREATED_AT,
  TaxReturnBusiness.JSON_PROPERTY_INFORMACION_GENERAL,
  TaxReturnBusiness.JSON_PROPERTY_DATOS_ADICIONALES,
  TaxReturnBusiness.JSON_PROPERTY_ESTADO_RESULTADOS,
  TaxReturnBusiness.JSON_PROPERTY_ESTADO_POSICION_FINANCIERA_BALANCE,
  TaxReturnBusiness.JSON_PROPERTY_CONCILIACION_ENTRE_RESULTADO_CONTABLE_FISCAL,
  TaxReturnBusiness.JSON_PROPERTY_DEDUCCIONES_AUTORIZADAS,
  TaxReturnBusiness.JSON_PROPERTY_CIFRAS_CIERRE_EJERCICIO,
  TaxReturnBusiness.JSON_PROPERTY_DETERMINACION_DEL_IMPUESTO_SOBRE_LA_RENTA,
  TaxReturnBusiness.JSON_PROPERTY_DIVIDENDOS_O_UTILIDADES_DISTRIBUIDOS,
  TaxReturnBusiness.JSON_PROPERTY_DETALLE_PAGO_R1_ISR_PERSONAS_MORALES,
  TaxReturnBusiness.JSON_PROPERTY_PDF,
  TaxReturnBusiness.JSON_PROPERTY_RECEIPT_PDF
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class TaxReturnBusiness extends HashMap<String, Object> {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private OffsetDateTime collectedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_INFORMACION_GENERAL = "informacion_general";
  private Object informacionGeneral;

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

  public static final String JSON_PROPERTY_PDF = "pdf";
  private File pdf;

  public static final String JSON_PROPERTY_RECEIPT_PDF = "receipt_pdf";
  private File receiptPdf;

  public TaxReturnBusiness() {

  }

  public TaxReturnBusiness id(UUID id) {
    
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


  public TaxReturnBusiness collectedAt(OffsetDateTime collectedAt) {
    
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


  public TaxReturnBusiness createdAt(OffsetDateTime createdAt) {
    
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


  public TaxReturnBusiness informacionGeneral(Object informacionGeneral) {
    
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


  public TaxReturnBusiness datosAdicionales(Object datosAdicionales) {
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


  public TaxReturnBusiness estadoResultados(Object estadoResultados) {
    
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


  public TaxReturnBusiness estadoPosicionFinancieraBalance(Object estadoPosicionFinancieraBalance) {
    
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


  public TaxReturnBusiness conciliacionEntreResultadoContableFiscal(Object conciliacionEntreResultadoContableFiscal) {
    
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


  public TaxReturnBusiness deduccionesAutorizadas(Object deduccionesAutorizadas) {
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


  public TaxReturnBusiness cifrasCierreEjercicio(Object cifrasCierreEjercicio) {
    
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


  public TaxReturnBusiness determinacionDelImpuestoSobreLaRenta(Object determinacionDelImpuestoSobreLaRenta) {
    
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


  public TaxReturnBusiness dividendosOUtilidadesDistribuidos(Object dividendosOUtilidadesDistribuidos) {
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


  public TaxReturnBusiness detallePagoR1IsrPersonasMorales(Object detallePagoR1IsrPersonasMorales) {
    
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


  public TaxReturnBusiness pdf(File pdf) {
    
    this.pdf = pdf;
    return this;
  }

   /**
   * Tax return PDF as a binary.
   * @return pdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@2b812c97", required = true, value = "Tax return PDF as a binary.")
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


  public TaxReturnBusiness receiptPdf(File receiptPdf) {
    
    this.receiptPdf = receiptPdf;
    return this;
  }

   /**
   * The acknowledgement receipt from the fiscal institution confirming that they received the tax return.
   * @return receiptPdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@7bf60b62", required = true, value = "The acknowledgement receipt from the fiscal institution confirming that they received the tax return.")
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
    TaxReturnBusiness taxReturnBusiness = (TaxReturnBusiness) o;
    return Objects.equals(this.id, taxReturnBusiness.id) &&
        Objects.equals(this.collectedAt, taxReturnBusiness.collectedAt) &&
        Objects.equals(this.createdAt, taxReturnBusiness.createdAt) &&
        Objects.equals(this.informacionGeneral, taxReturnBusiness.informacionGeneral) &&
        equalsNullable(this.datosAdicionales, taxReturnBusiness.datosAdicionales) &&
        Objects.equals(this.estadoResultados, taxReturnBusiness.estadoResultados) &&
        Objects.equals(this.estadoPosicionFinancieraBalance, taxReturnBusiness.estadoPosicionFinancieraBalance) &&
        Objects.equals(this.conciliacionEntreResultadoContableFiscal, taxReturnBusiness.conciliacionEntreResultadoContableFiscal) &&
        equalsNullable(this.deduccionesAutorizadas, taxReturnBusiness.deduccionesAutorizadas) &&
        Objects.equals(this.cifrasCierreEjercicio, taxReturnBusiness.cifrasCierreEjercicio) &&
        Objects.equals(this.determinacionDelImpuestoSobreLaRenta, taxReturnBusiness.determinacionDelImpuestoSobreLaRenta) &&
        equalsNullable(this.dividendosOUtilidadesDistribuidos, taxReturnBusiness.dividendosOUtilidadesDistribuidos) &&
        Objects.equals(this.detallePagoR1IsrPersonasMorales, taxReturnBusiness.detallePagoR1IsrPersonasMorales) &&
        Objects.equals(this.pdf, taxReturnBusiness.pdf) &&
        Objects.equals(this.receiptPdf, taxReturnBusiness.receiptPdf) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, collectedAt, createdAt, informacionGeneral, hashCodeNullable(datosAdicionales), estadoResultados, estadoPosicionFinancieraBalance, conciliacionEntreResultadoContableFiscal, hashCodeNullable(deduccionesAutorizadas), cifrasCierreEjercicio, determinacionDelImpuestoSobreLaRenta, hashCodeNullable(dividendosOUtilidadesDistribuidos), detallePagoR1IsrPersonasMorales, pdf, receiptPdf, super.hashCode());
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
    sb.append("class TaxReturnBusiness {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    informacionGeneral: ").append(toIndentedString(informacionGeneral)).append("\n");
    sb.append("    datosAdicionales: ").append(toIndentedString(datosAdicionales)).append("\n");
    sb.append("    estadoResultados: ").append(toIndentedString(estadoResultados)).append("\n");
    sb.append("    estadoPosicionFinancieraBalance: ").append(toIndentedString(estadoPosicionFinancieraBalance)).append("\n");
    sb.append("    conciliacionEntreResultadoContableFiscal: ").append(toIndentedString(conciliacionEntreResultadoContableFiscal)).append("\n");
    sb.append("    deduccionesAutorizadas: ").append(toIndentedString(deduccionesAutorizadas)).append("\n");
    sb.append("    cifrasCierreEjercicio: ").append(toIndentedString(cifrasCierreEjercicio)).append("\n");
    sb.append("    determinacionDelImpuestoSobreLaRenta: ").append(toIndentedString(determinacionDelImpuestoSobreLaRenta)).append("\n");
    sb.append("    dividendosOUtilidadesDistribuidos: ").append(toIndentedString(dividendosOUtilidadesDistribuidos)).append("\n");
    sb.append("    detallePagoR1IsrPersonasMorales: ").append(toIndentedString(detallePagoR1IsrPersonasMorales)).append("\n");
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

