

# RetrieveTaxReturns200ResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier created by Belvo used to reference the current Tax Return. |  [optional] |
|**link** | **UUID** | The &#x60;link.id&#x60; the statement belongs to |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  [optional] |
|**informacionGeneral** | **Object** | General information regarding the tax return (year, RFC, return type, person/company name, and so on). |  |
|**sueldosSalarios** | **Object** | Details regarding the income information together combined with withheld taxes. |  |
|**serviciosProfesionales** | **Object** | Details regarding the income and tax information from professional services provided. |  |
|**deduccionesPersonales** | **Object** | List of all personal tax deductions. |  |
|**determinacionImpuesto** | **Object** | Details regarding the final tax return. |  |
|**retenciones** | **Object** | Details on the already withheld taxes. |  |
|**dividendos** | **Object** | Details regarding dividends. |  |
|**datosInformativos** | **Object** | Extra informative data on the tax return. |  [optional] |
|**pdf** | **File** | Tax return PDF as a binary. |  |
|**receiptPdf** | **File** | The acknowledgement receipt from the fiscal institution confirming that they received the tax return. |  |
|**isr** | **Object** | Information used to calculate the monthly provisional payments of the income tax. |  |
|**iva** | **Object** | Information used to calculate the monthly provisional payments of the VAT tax. |  |
|**type** | **String** | The type of tax return. Can be either monthly or annual. |  |
|**datosAdicionales** | **Object** | Additional data regarding the tax return. |  [optional] |
|**estadoResultados** | **Object** | Detailed information about the legal entity&#39;s yearly profit and loss. |  |
|**estadoPosicionFinancieraBalance** | **Object** | Details regarding balance sheet of the legal entity. |  |
|**conciliacionEntreResultadoContableFiscal** | **Object** | Details regarding the accounting reconciliation. |  |
|**deduccionesAutorizadas** | **Object** | Details regarding the legal entity&#39;s deductions. |  [optional] |
|**cifrasCierreEjercicio** | **Object** | Details regarding key numbers at the end of the fiscal exercise. |  |
|**determinacionDelImpuestoSobreLaRenta** | **Object** | Details regarding the final tax return. |  |
|**dividendosOUtilidadesDistribuidos** | **Object** | Details regarding distributed dividends. |  [optional] |
|**detallePagoR1IsrPersonasMorales** | **Object** | Details of the tax payment. |  |
|**determinacionIsr** | **Object** | Information used to calculate the provisional income tax for the period. |  |
|**detallePagoIsr** | **Object** | Information on the monthly provisional payments for the income tax. |  |
|**determinacionIva** | **Object** | Information used to calculate the provisional VAT tax for the period. |  |
|**detallePagoIva** | **Object** | Information on the monthly provisional payments for the VAT tax. |  |



