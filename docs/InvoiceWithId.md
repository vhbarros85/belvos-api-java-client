

# InvoiceWithId


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique identifier used to reference the current invoice. |  [optional] |
|**link** | **String** | The &#x60;link.id&#x60; the invoice belongs to. |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  [optional] |
|**invoiceIdentification** | **String** | The fiscal institution&#39;s unique ID for the invoice. |  |
|**invoiceDate** | **LocalDate** | The date of the invoice. |  |
|**status** | **String** | The status of the invoice. Can be either *Vigente* (valid) or *Cancelado* (cancelled). |  |
|**invoiceType** | [**InvoiceTypeEnum**](#InvoiceTypeEnum) | The fiscal institution&#39;s classification of the invoice.  For Mexico&#39;s SAT, we return one of the following enum values:    - &#x60;Egreso&#x60;   - &#x60;Ingreso&#x60;   - &#x60;Nómina&#x60;   - &#x60;Pago&#x60;   - &#x60;Traslado&#x60;  |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the invoice (from the perspective of the invoice sender). Can be either &#x60;INFLOW&#x60; or &#x60;OUTFLOW&#x60;.  |  |
|**senderId** | **String** | The fiscal ID of the invoice sender |  |
|**senderName** | **String** | The name of the invoice sender. |  |
|**senderTaxFraudStatus** | **String** | Indicates whether or not the sender is on SAT&#39;s tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution&#39;s regulations.&lt;br&gt;&lt;br&gt; SAT updates the tax fraud list every three months. &lt;br&gt;&lt;br&gt; For more information regarding the reason&#39;s a taxpayer can be put on the tax fraud list, please see [Article 69](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69.html) and [Article 69-B](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69B.html) of Mexico&#39;s Código Fiscal de la Federación. &lt;br&gt;&lt;br&gt; Possible statuses are: - &#x60;INVESTIGATING&#x60; &lt;br&gt; The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. &lt;br&gt; - &#x60;DISMISSED&#x60; &lt;br&gt; The fiscal institution has investigated the taxpayer and declared them innocent. &lt;br&gt; - &#x60;CONFIRMED&#x60; &lt;br&gt; The fiscal institution has confirmed that the taxpayer is guilty. &lt;br&gt; - &#x60;OVERTURNED&#x60; &lt;br&gt; The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. &lt;br&gt; - &#x60;NO_TAX_FRAUD_STATUS&#x60; &lt;br&gt; The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution&#39;s regulations). |  [optional] |
|**receiverId** | **String** | The fiscal ID of the invoice receiver. |  |
|**receiverName** | **String** | The name of the invoice receiver. |  |
|**receiverTaxFraudStatus** | **String** | Indicates whether or not the receiver is on SAT&#39;s tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution&#39;s regulations.&lt;br&gt;&lt;br&gt; SAT updates the tax fraud list every three months. &lt;br&gt;&lt;br&gt; For more information regarding the reason&#39;s a taxpayer can be put on the tax fraud list, please see [Article 69](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69.html) and [Article 69-B](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69B.html) of Mexico&#39;s Código Fiscal de la Federación. &lt;br&gt;&lt;br&gt; Possible statuses are: - &#x60;INVESTIGATING&#x60; &lt;br&gt; The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. &lt;br&gt; - &#x60;DISMISSED&#x60; &lt;br&gt; The fiscal institution has investigated the taxpayer and declared them innocent. &lt;br&gt; - &#x60;CONFIRMED&#x60; &lt;br&gt; The fiscal institution has confirmed that the taxpayer is guilty. &lt;br&gt; - &#x60;OVERTURNED&#x60; &lt;br&gt; The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. &lt;br&gt; - &#x60;NO_TAX_FRAUD_STATUS&#x60; &lt;br&gt; The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution&#39;s regulations). |  [optional] |
|**cancelationStatus** | **String** | If the invoice is cancelled, this field indicates the status of the cancellation. |  |
|**cancelationUpdateDate** | **LocalDate** | The date of the invoice cancelation. |  |
|**certificationDate** | **LocalDate** | The date of the fiscal certification. |  |
|**certificationAuthority** | **String** | The fiscal ID of the certification provider. |  |
|**paymentType** | **String** | The payment type code used for this invoice, as defined by the country legal entity. - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-type)  |  |
|**paymentTypeDescription** | **String** | *This field has been deprecated.*  *The description of the payment method used for this invoice.*  |  |
|**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | The payment method code used for this invoice, as defined by the legal entity of the country.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-method). For Mexico, we return &#x60;PUE&#x60;, &#x60;PIP&#x60;, OR &#x60;PPD&#x60;.  |  [optional] |
|**paymentMethodDescription** | **String** | *This field has been deprecated.*  *The description of the payment method used for this invoice.*  |  [optional] |
|**usage** | **String** | The invoice&#39;s usage code, as defined by the legal entity of the country.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#usage)  |  [optional] |
|**version** | **String** | The CFDI version of the invoice. |  [optional] |
|**placeOfIssue** | **String** | The postcode of where the invoice was issued. |  [optional] |
|**invoiceDetails** | [**List&lt;InvoiceDetail&gt;**](InvoiceDetail.md) | A list of descriptions for each item (purchased product or service provided) in the invoice.  |  |
|**currency** | **String** | The currency of the invoice. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned. |  |
|**subtotalAmount** | **Float** | The pretax amount of this invoice (sum of each item&#39;s &#x60;pre_tax_amount&#x60;). |  |
|**exchangeRate** | **Float** | The exchange rate used in this invoice for the currency. |  |
|**taxAmount** | **Float** | The amount of tax for this invoice (sum of each item&#39;s &#x60;tax_amount&#x60;). |  |
|**discountAmount** | **Float** | The total amount discounted in this invoice. |  |
|**totalAmount** | **Float** | The total amount of the invoice (&#x60;subtotal_amount&#x60; + &#x60;tax_amount&#x60; - &#x60;discount_amount&#x60;) |  |
|**payments** | [**List&lt;InvoicesPayments&gt;**](InvoicesPayments.md) | A list detailing all the invoice payments. |  |
|**payroll** | [**InvoicesPayroll**](InvoicesPayroll.md) |  |  |
|**folio** | **String** | The internal control number that the taxpayer assigns to the invoice. |  [optional] |
|**xml** | **String** | XML of the invoice document. |  [optional] |
|**warnings** | [**InvoiceWarnings**](InvoiceWarnings.md) |  |  [optional] |
|**senderBlacklistStatus** | **String** | This field has been deprecated. Please use &#x60;sender_tax_fraud_status&#x60; instead.  |  [optional] |
|**receiverBlacklistStatus** | **String** | This field has been deprecated. Please use &#x60;receiver_tax_fraud_status&#x60; instead.  |  [optional] |



## Enum: InvoiceTypeEnum

| Name | Value |
|---- | -----|
| EGRESO | &quot;Egreso&quot; |
| INGRESO | &quot;Ingreso&quot; |
| N_MINA | &quot;Nómina&quot; |
| PAGO | &quot;Pago&quot; |
| TRASLADO | &quot;Traslado&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| OUTFLOW | &quot;OUTFLOW&quot; |
| INFLOW | &quot;INFLOW&quot; |



## Enum: PaymentMethodEnum

| Name | Value |
|---- | -----|
| PUE | &quot;PUE&quot; |
| PIP | &quot;PIP&quot; |
| PPD | &quot;PPD&quot; |
| NULL | &quot;null&quot; |



