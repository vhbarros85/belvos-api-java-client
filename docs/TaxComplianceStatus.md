

# TaxComplianceStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier created by Belvo used to reference the current Tax Compliance Status. |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  [optional] |
|**internalIdentification** | **String** | The institution’s internal identification number for the document. |  [optional] |
|**pdf** | **File** | Tax compliance status PDF as a binary. |  |
|**rfc** | **String** | The account holder&#39;s RFC (Registro Federal de Contribuyentes) number. |  [optional] |
|**outcome** | [**OutcomeEnum**](#OutcomeEnum) | Indicates whether the taxpayer is complying to all their tax obligations (&#x60;POSITIVE&#x60;), if they are not (&#x60;NEGATIVE&#x60;), or have none to comply to (&#x60;NO_OBLIGATIONS&#x60;). |  [optional] |



## Enum: OutcomeEnum

| Name | Value |
|---- | -----|
| POSITIVE | &quot;POSITIVE&quot; |
| NEGATIVE | &quot;NEGATIVE&quot; |
| NO_OBLIGATIONS | &quot;NO_OBLIGATIONS&quot; |



