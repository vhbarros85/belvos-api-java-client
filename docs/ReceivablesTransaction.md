

# ReceivablesTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID used to reference the current receivable transaction. |  [readonly] |
|**account** | [**ReceivablesTransactionAccount**](ReceivablesTransactionAccount.md) |  |  |
|**createdAt** | **OffsetDateTime** | The ISO timestamp of when the data point was last updated in Belvo&#39;s database. |  |
|**collectedAt** | **OffsetDateTime** | The ISO timestamp when the data point was collected. |  |
|**valueHour** | **String** | The time that the transaction occurred, according to the institution, in &#x60;HH:MM&#x60; format. |  |
|**valueDate** | **LocalDate** | The date that the transactions occurred, according to the institution, in &#x60;YYYY-MM-DD&#x60; format. |  |
|**institutionTransactionId** | **String** | Internal identification number that the acquirer uses to identify the transaction. ℹ️ **Note**: For Brazil, this number is the NSU. |  |
|**currency** | **String** | The currency of the transaction. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that currencies other than those listed above may be returned. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of transaction. For example, whether the transaction was a &#x60;VISA_DEBIT&#x60; or a &#x60;MASTERCARD_CREDIT&#x60;. |  |
|**grossAmount** | **Float** | The total gross amount of the transaction. |  |
|**netAmount** | **Float** | The net amount of the transaction. |  |
|**fees** | [**List&lt;RecevablesTransactionFees&gt;**](RecevablesTransactionFees.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the transaction. Can be either:    - &#x60;APPROVED&#x60;   - &#x60;CANCELLED&#x60;   - &#x60;REVERTED&#x60;   - &#x60;UNCATEGORIZED&#x60; |  |
|**numberOfInstallments** | [**ReceivablesTransactionNumberOfInstallments**](ReceivablesTransactionNumberOfInstallments.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VISA_CREDIT | &quot;VISA_CREDIT&quot; |
| VISA_DEBIT | &quot;VISA_DEBIT&quot; |
| MASTERCARD_CREDIT | &quot;MASTERCARD_CREDIT&quot; |
| MASTERCARD_DEBIT | &quot;MASTERCARD_DEBIT&quot; |
| ELO_CREDIT | &quot;ELO_CREDIT&quot; |
| ELO_DEBIT | &quot;ELO_DEBIT&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;APPROVED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| REVERTED | &quot;REVERTED&quot; |
| UNCATEGORIZED | &quot;UNCATEGORIZED&quot; |



