

# TransactionCreditCardData

Additional data provided by the institution for credit card transactions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  [optional] |
|**billName** | **String** | The title of the monthly credit card bill the transaction belongs to. The format of the returned value is institution specific, however, some common examples are:  - diciembre-2021 - dec-2021 - dec-21  |  [optional] |
|**billStatus** | [**BillStatusEnum**](#BillStatusEnum) | The status of the bill that the transaction appears on. Can be one of:    - &#x60;PAID&#x60;: The bill has been paid in full.   - &#x60;CLOSED&#x60;: The bill has been closed by the institution.   - &#x60;OPEN&#x60;: The bill is currently open. (Note: This is the main bill that Belvo retrieves balance data from).   - &#x60;FUTURE&#x60;: The bill is pending.    ℹ️ Note: Some banks consider CLOSED as PAID.  |  [optional] |
|**billAmount** | **Float** | The aggregate bill amount, as of &#x60;collected_at&#x60;. |  [optional] |
|**previousBillTotal** | **String** | The total amount of the previous month&#39;s bill, if available. |  [optional] |



## Enum: BillStatusEnum

| Name | Value |
|---- | -----|
| PAID | &quot;PAID&quot; |
| CLOSED | &quot;CLOSED&quot; |
| OPEN | &quot;OPEN&quot; |
| FUTURE | &quot;FUTURE&quot; |
| NULL | &quot;null&quot; |



