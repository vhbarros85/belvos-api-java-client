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
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for RetrieveTaxReturns200ResponseInner
 */
public class RetrieveTaxReturns200ResponseInnerTest {
    private final RetrieveTaxReturns200ResponseInner model = new RetrieveTaxReturns200ResponseInner();

    /**
     * Model tests for RetrieveTaxReturns200ResponseInner
     */
    @Test
    public void testRetrieveTaxReturns200ResponseInner() {
        // TODO: test RetrieveTaxReturns200ResponseInner
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'link'
     */
    @Test
    public void linkTest() {
        // TODO: test link
    }

    /**
     * Test the property 'collectedAt'
     */
    @Test
    public void collectedAtTest() {
        // TODO: test collectedAt
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'informacionGeneral'
     */
    @Test
    public void informacionGeneralTest() {
        // TODO: test informacionGeneral
    }

    /**
     * Test the property 'sueldosSalarios'
     */
    @Test
    public void sueldosSalariosTest() {
        // TODO: test sueldosSalarios
    }

    /**
     * Test the property 'serviciosProfesionales'
     */
    @Test
    public void serviciosProfesionalesTest() {
        // TODO: test serviciosProfesionales
    }

    /**
     * Test the property 'deduccionesPersonales'
     */
    @Test
    public void deduccionesPersonalesTest() {
        // TODO: test deduccionesPersonales
    }

    /**
     * Test the property 'determinacionImpuesto'
     */
    @Test
    public void determinacionImpuestoTest() {
        // TODO: test determinacionImpuesto
    }

    /**
     * Test the property 'retenciones'
     */
    @Test
    public void retencionesTest() {
        // TODO: test retenciones
    }

    /**
     * Test the property 'dividendos'
     */
    @Test
    public void dividendosTest() {
        // TODO: test dividendos
    }

    /**
     * Test the property 'datosInformativos'
     */
    @Test
    public void datosInformativosTest() {
        // TODO: test datosInformativos
    }

    /**
     * Test the property 'pdf'
     */
    @Test
    public void pdfTest() {
        // TODO: test pdf
    }

    /**
     * Test the property 'receiptPdf'
     */
    @Test
    public void receiptPdfTest() {
        // TODO: test receiptPdf
    }

    /**
     * Test the property 'isr'
     */
    @Test
    public void isrTest() {
        // TODO: test isr
    }

    /**
     * Test the property 'iva'
     */
    @Test
    public void ivaTest() {
        // TODO: test iva
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'datosAdicionales'
     */
    @Test
    public void datosAdicionalesTest() {
        // TODO: test datosAdicionales
    }

    /**
     * Test the property 'estadoResultados'
     */
    @Test
    public void estadoResultadosTest() {
        // TODO: test estadoResultados
    }

    /**
     * Test the property 'estadoPosicionFinancieraBalance'
     */
    @Test
    public void estadoPosicionFinancieraBalanceTest() {
        // TODO: test estadoPosicionFinancieraBalance
    }

    /**
     * Test the property 'conciliacionEntreResultadoContableFiscal'
     */
    @Test
    public void conciliacionEntreResultadoContableFiscalTest() {
        // TODO: test conciliacionEntreResultadoContableFiscal
    }

    /**
     * Test the property 'deduccionesAutorizadas'
     */
    @Test
    public void deduccionesAutorizadasTest() {
        // TODO: test deduccionesAutorizadas
    }

    /**
     * Test the property 'cifrasCierreEjercicio'
     */
    @Test
    public void cifrasCierreEjercicioTest() {
        // TODO: test cifrasCierreEjercicio
    }

    /**
     * Test the property 'determinacionDelImpuestoSobreLaRenta'
     */
    @Test
    public void determinacionDelImpuestoSobreLaRentaTest() {
        // TODO: test determinacionDelImpuestoSobreLaRenta
    }

    /**
     * Test the property 'dividendosOUtilidadesDistribuidos'
     */
    @Test
    public void dividendosOUtilidadesDistribuidosTest() {
        // TODO: test dividendosOUtilidadesDistribuidos
    }

    /**
     * Test the property 'detallePagoR1IsrPersonasMorales'
     */
    @Test
    public void detallePagoR1IsrPersonasMoralesTest() {
        // TODO: test detallePagoR1IsrPersonasMorales
    }

    /**
     * Test the property 'determinacionIsr'
     */
    @Test
    public void determinacionIsrTest() {
        // TODO: test determinacionIsr
    }

    /**
     * Test the property 'detallePagoIsr'
     */
    @Test
    public void detallePagoIsrTest() {
        // TODO: test detallePagoIsr
    }

    /**
     * Test the property 'determinacionIva'
     */
    @Test
    public void determinacionIvaTest() {
        // TODO: test determinacionIva
    }

    /**
     * Test the property 'detallePagoIva'
     */
    @Test
    public void detallePagoIvaTest() {
        // TODO: test detallePagoIva
    }

}
