

# TaxStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier created by Belvo used to reference the current Tax Status. |  [optional] |
|**link** | **UUID** | The Link ID that the tax status is associated with. |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  [optional] |
|**placeAndDateOfIssuance** | **String** | The place and date of that the tax status was issued. |  [optional] |
|**officialName** | **String** | The name of the person or business. |  [optional] |
|**idCif** | **String** | The taxpayer&#39;s *Cédula de Identificación Fiscal* (CIF) ID. |  [optional] |
|**taxPayerInformation** | [**TaxStatusTaxPayerInformation**](TaxStatusTaxPayerInformation.md) |  |  [optional] |
|**address** | [**TaxStatusAddress**](TaxStatusAddress.md) |  |  [optional] |
|**economicActivity** | [**List&lt;TaxStatusEconomicActivity&gt;**](TaxStatusEconomicActivity.md) | A list of economic activity objects.  |  [optional] |
|**regimens** | [**List&lt;TaxStatusRegimens&gt;**](TaxStatusRegimens.md) | A list of regimen objects.  |  [optional] |
|**obligations** | [**List&lt;TaxStatusObligations&gt;**](TaxStatusObligations.md) | Details regarding a business&#39;s obligations.  ℹ️ For non-business accounts, this field will return empty.  |  [optional] |
|**digitalStamp** | **String** | The validation certificate of the document. |  [optional] |
|**digitalStampChain** | **String** | A data chain containing the basic structure of a fiscal digital check.  - 🇲🇽 Mexico: Comprobante Fiscal Digital por Internet (CFDI)  |  [optional] |
|**pdf** | **File** | Tax status PDF as a binary string. |  |



