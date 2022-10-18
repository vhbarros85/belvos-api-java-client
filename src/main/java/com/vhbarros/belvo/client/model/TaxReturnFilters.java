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
 * TaxReturnFilters
 */
@JsonPropertyOrder({
  TaxReturnFilters.JSON_PROPERTY_CREATED_AT_LT,
  TaxReturnFilters.JSON_PROPERTY_CREATED_AT_LTE,
  TaxReturnFilters.JSON_PROPERTY_CREATED_AT_GT,
  TaxReturnFilters.JSON_PROPERTY_CREATED_AT_GTE,
  TaxReturnFilters.JSON_PROPERTY_CREATED_AT_RANGE,
  TaxReturnFilters.JSON_PROPERTY_ID,
  TaxReturnFilters.JSON_PROPERTY_ID_IN,
  TaxReturnFilters.JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO,
  TaxReturnFilters.JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_LT,
  TaxReturnFilters.JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_LTE,
  TaxReturnFilters.JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_GT,
  TaxReturnFilters.JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_GTE,
  TaxReturnFilters.JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_RANGE,
  TaxReturnFilters.JSON_PROPERTY_INFORMACION_GENERAL_TIPO_DECLARACION,
  TaxReturnFilters.JSON_PROPERTY_INFORMACION_GENERAL_TIPO_DECLARACION_IN,
  TaxReturnFilters.JSON_PROPERTY_LINK_IN
})
@JsonTypeName("taxReturnFilters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class TaxReturnFilters {
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

  public static final String JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO = "informacion_general__ejercicio";
  private String informacionGeneralEjercicio;

  public static final String JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_LT = "informacion_general__ejercicio__lt";
  private String informacionGeneralEjercicioLt;

  public static final String JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_LTE = "informacion_general__ejercicio__lte";
  private String informacionGeneralEjercicioLte;

  public static final String JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_GT = "informacion_general__ejercicio__gt";
  private String informacionGeneralEjercicioGt;

  public static final String JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_GTE = "informacion_general__ejercicio__gte";
  private String informacionGeneralEjercicioGte;

  public static final String JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_RANGE = "informacion_general__ejercicio__range";
  private String informacionGeneralEjercicioRange;

  public static final String JSON_PROPERTY_INFORMACION_GENERAL_TIPO_DECLARACION = "informacion_general__tipo_declaracion";
  private String informacionGeneralTipoDeclaracion;

  public static final String JSON_PROPERTY_INFORMACION_GENERAL_TIPO_DECLARACION_IN = "informacion_general__tipo_declaracion__in";
  private String informacionGeneralTipoDeclaracionIn;

  public static final String JSON_PROPERTY_LINK_IN = "link__in";
  private String linkIn;

  public TaxReturnFilters() {
  }

  public TaxReturnFilters createdAtLt(String createdAtLt) {
    
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


  public TaxReturnFilters createdAtLte(String createdAtLte) {
    
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


  public TaxReturnFilters createdAtGt(String createdAtGt) {
    
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


  public TaxReturnFilters createdAtGte(String createdAtGte) {
    
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


  public TaxReturnFilters createdAtRange(String createdAtRange) {
    
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


  public TaxReturnFilters id(String id) {
    
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


  public TaxReturnFilters idIn(String idIn) {
    
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


  public TaxReturnFilters informacionGeneralEjercicio(String informacionGeneralEjercicio) {
    
    this.informacionGeneralEjercicio = informacionGeneralEjercicio;
    return this;
  }

   /**
   * Get informacionGeneralEjercicio
   * @return informacionGeneralEjercicio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInformacionGeneralEjercicio() {
    return informacionGeneralEjercicio;
  }


  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInformacionGeneralEjercicio(String informacionGeneralEjercicio) {
    this.informacionGeneralEjercicio = informacionGeneralEjercicio;
  }


  public TaxReturnFilters informacionGeneralEjercicioLt(String informacionGeneralEjercicioLt) {
    
    this.informacionGeneralEjercicioLt = informacionGeneralEjercicioLt;
    return this;
  }

   /**
   * Get informacionGeneralEjercicioLt
   * @return informacionGeneralEjercicioLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInformacionGeneralEjercicioLt() {
    return informacionGeneralEjercicioLt;
  }


  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInformacionGeneralEjercicioLt(String informacionGeneralEjercicioLt) {
    this.informacionGeneralEjercicioLt = informacionGeneralEjercicioLt;
  }


  public TaxReturnFilters informacionGeneralEjercicioLte(String informacionGeneralEjercicioLte) {
    
    this.informacionGeneralEjercicioLte = informacionGeneralEjercicioLte;
    return this;
  }

   /**
   * Get informacionGeneralEjercicioLte
   * @return informacionGeneralEjercicioLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInformacionGeneralEjercicioLte() {
    return informacionGeneralEjercicioLte;
  }


  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInformacionGeneralEjercicioLte(String informacionGeneralEjercicioLte) {
    this.informacionGeneralEjercicioLte = informacionGeneralEjercicioLte;
  }


  public TaxReturnFilters informacionGeneralEjercicioGt(String informacionGeneralEjercicioGt) {
    
    this.informacionGeneralEjercicioGt = informacionGeneralEjercicioGt;
    return this;
  }

   /**
   * Get informacionGeneralEjercicioGt
   * @return informacionGeneralEjercicioGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInformacionGeneralEjercicioGt() {
    return informacionGeneralEjercicioGt;
  }


  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInformacionGeneralEjercicioGt(String informacionGeneralEjercicioGt) {
    this.informacionGeneralEjercicioGt = informacionGeneralEjercicioGt;
  }


  public TaxReturnFilters informacionGeneralEjercicioGte(String informacionGeneralEjercicioGte) {
    
    this.informacionGeneralEjercicioGte = informacionGeneralEjercicioGte;
    return this;
  }

   /**
   * Get informacionGeneralEjercicioGte
   * @return informacionGeneralEjercicioGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInformacionGeneralEjercicioGte() {
    return informacionGeneralEjercicioGte;
  }


  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInformacionGeneralEjercicioGte(String informacionGeneralEjercicioGte) {
    this.informacionGeneralEjercicioGte = informacionGeneralEjercicioGte;
  }


  public TaxReturnFilters informacionGeneralEjercicioRange(String informacionGeneralEjercicioRange) {
    
    this.informacionGeneralEjercicioRange = informacionGeneralEjercicioRange;
    return this;
  }

   /**
   * Get informacionGeneralEjercicioRange
   * @return informacionGeneralEjercicioRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInformacionGeneralEjercicioRange() {
    return informacionGeneralEjercicioRange;
  }


  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_EJERCICIO_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInformacionGeneralEjercicioRange(String informacionGeneralEjercicioRange) {
    this.informacionGeneralEjercicioRange = informacionGeneralEjercicioRange;
  }


  public TaxReturnFilters informacionGeneralTipoDeclaracion(String informacionGeneralTipoDeclaracion) {
    
    this.informacionGeneralTipoDeclaracion = informacionGeneralTipoDeclaracion;
    return this;
  }

   /**
   * Get informacionGeneralTipoDeclaracion
   * @return informacionGeneralTipoDeclaracion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_TIPO_DECLARACION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInformacionGeneralTipoDeclaracion() {
    return informacionGeneralTipoDeclaracion;
  }


  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_TIPO_DECLARACION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInformacionGeneralTipoDeclaracion(String informacionGeneralTipoDeclaracion) {
    this.informacionGeneralTipoDeclaracion = informacionGeneralTipoDeclaracion;
  }


  public TaxReturnFilters informacionGeneralTipoDeclaracionIn(String informacionGeneralTipoDeclaracionIn) {
    
    this.informacionGeneralTipoDeclaracionIn = informacionGeneralTipoDeclaracionIn;
    return this;
  }

   /**
   * Get informacionGeneralTipoDeclaracionIn
   * @return informacionGeneralTipoDeclaracionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_TIPO_DECLARACION_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInformacionGeneralTipoDeclaracionIn() {
    return informacionGeneralTipoDeclaracionIn;
  }


  @JsonProperty(JSON_PROPERTY_INFORMACION_GENERAL_TIPO_DECLARACION_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInformacionGeneralTipoDeclaracionIn(String informacionGeneralTipoDeclaracionIn) {
    this.informacionGeneralTipoDeclaracionIn = informacionGeneralTipoDeclaracionIn;
  }


  public TaxReturnFilters linkIn(String linkIn) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxReturnFilters taxReturnFilters = (TaxReturnFilters) o;
    return Objects.equals(this.createdAtLt, taxReturnFilters.createdAtLt) &&
        Objects.equals(this.createdAtLte, taxReturnFilters.createdAtLte) &&
        Objects.equals(this.createdAtGt, taxReturnFilters.createdAtGt) &&
        Objects.equals(this.createdAtGte, taxReturnFilters.createdAtGte) &&
        Objects.equals(this.createdAtRange, taxReturnFilters.createdAtRange) &&
        Objects.equals(this.id, taxReturnFilters.id) &&
        Objects.equals(this.idIn, taxReturnFilters.idIn) &&
        Objects.equals(this.informacionGeneralEjercicio, taxReturnFilters.informacionGeneralEjercicio) &&
        Objects.equals(this.informacionGeneralEjercicioLt, taxReturnFilters.informacionGeneralEjercicioLt) &&
        Objects.equals(this.informacionGeneralEjercicioLte, taxReturnFilters.informacionGeneralEjercicioLte) &&
        Objects.equals(this.informacionGeneralEjercicioGt, taxReturnFilters.informacionGeneralEjercicioGt) &&
        Objects.equals(this.informacionGeneralEjercicioGte, taxReturnFilters.informacionGeneralEjercicioGte) &&
        Objects.equals(this.informacionGeneralEjercicioRange, taxReturnFilters.informacionGeneralEjercicioRange) &&
        Objects.equals(this.informacionGeneralTipoDeclaracion, taxReturnFilters.informacionGeneralTipoDeclaracion) &&
        Objects.equals(this.informacionGeneralTipoDeclaracionIn, taxReturnFilters.informacionGeneralTipoDeclaracionIn) &&
        Objects.equals(this.linkIn, taxReturnFilters.linkIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAtLt, createdAtLte, createdAtGt, createdAtGte, createdAtRange, id, idIn, informacionGeneralEjercicio, informacionGeneralEjercicioLt, informacionGeneralEjercicioLte, informacionGeneralEjercicioGt, informacionGeneralEjercicioGte, informacionGeneralEjercicioRange, informacionGeneralTipoDeclaracion, informacionGeneralTipoDeclaracionIn, linkIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxReturnFilters {\n");
    sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtRange: ").append(toIndentedString(createdAtRange)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
    sb.append("    informacionGeneralEjercicio: ").append(toIndentedString(informacionGeneralEjercicio)).append("\n");
    sb.append("    informacionGeneralEjercicioLt: ").append(toIndentedString(informacionGeneralEjercicioLt)).append("\n");
    sb.append("    informacionGeneralEjercicioLte: ").append(toIndentedString(informacionGeneralEjercicioLte)).append("\n");
    sb.append("    informacionGeneralEjercicioGt: ").append(toIndentedString(informacionGeneralEjercicioGt)).append("\n");
    sb.append("    informacionGeneralEjercicioGte: ").append(toIndentedString(informacionGeneralEjercicioGte)).append("\n");
    sb.append("    informacionGeneralEjercicioRange: ").append(toIndentedString(informacionGeneralEjercicioRange)).append("\n");
    sb.append("    informacionGeneralTipoDeclaracion: ").append(toIndentedString(informacionGeneralTipoDeclaracion)).append("\n");
    sb.append("    informacionGeneralTipoDeclaracionIn: ").append(toIndentedString(informacionGeneralTipoDeclaracionIn)).append("\n");
    sb.append("    linkIn: ").append(toIndentedString(linkIn)).append("\n");
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

