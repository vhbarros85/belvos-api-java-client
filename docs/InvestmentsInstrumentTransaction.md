

# InvestmentsInstrumentTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique identifier used to reference the current instrument transaction. |  [optional] |
|**link** | **UUID** | The &#x60;link.id&#x60; the transaction belongs to. |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  [optional] |
|**portfolio** | [**InvestmentsInstrumentTransactionPortfolio**](InvestmentsInstrumentTransactionPortfolio.md) |  |  |
|**instrument** | [**InvestmentsInstrumentTransactionInstrument**](InvestmentsInstrumentTransactionInstrument.md) |  |  |
|**settlementDate** | **LocalDate** | Date when the transaction was processed by the bank. |  |
|**operationDate** | **LocalDate** | Date when the transaction was initiated by the user. |  |
|**description** | **String** | Additional description for the transaction. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of transaction.  We return one of the following enum values:    - &#x60;BUY&#x60;   - &#x60;SELL&#x60;   - &#x60;CANCEL&#x60;   - &#x60;CASH&#x60;   - &#x60;FEE&#x60;   - &#x60;TRANSFER&#x60;   - &#x60;DIVIDEND&#x60;  |  |
|**quantity** | **Float** | Number of shares purchased in this transaction. |  |
|**amount** | **Float** | The total amount of the transaction.  ℹ️ **Note:** Does not include the transaction fees.  |  |
|**price** | **Float** | The market price for one share at the time of the transaction. |  |
|**currency** | **String** | The currency of the transaction. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned.  |  |
|**fees** | **Float** | The total fees paid to conduct the transaction. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BUY | &quot;BUY&quot; |
| SELL | &quot;SELL&quot; |
| CANCEL | &quot;CANCEL&quot; |
| CASH | &quot;CASH&quot; |
| FEE | &quot;FEE&quot; |
| TRANSFER | &quot;TRANSFER&quot; |
| DIVIDEND | &quot;DIVIDEND&quot; |



