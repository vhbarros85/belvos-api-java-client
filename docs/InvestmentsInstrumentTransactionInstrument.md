

# InvestmentsInstrumentTransactionInstrument

Basic information about the parent instrument.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID used to reference the current instrument. |  [optional] |
|**name** | **String** | The name of the instrument, as given by the institution. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The instrument type. For more information about instruments, please see our [Investments DevPortal article](https://developers.belvo.com/docs/investments#instruments).  We return one of the following enum values:    - &#x60;BOND&#x60;   - &#x60;DEPOSIT&#x60;   - &#x60;ETF&#x60;   - &#x60;FUND&#x60;   - &#x60;OTHER&#x60;   - &#x60;PENSION&#x60;   - &#x60;STOCK&#x60;  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BOND | &quot;BOND&quot; |
| DEPOSIT | &quot;DEPOSIT&quot; |
| ETF | &quot;ETF&quot; |
| FUND | &quot;FUND&quot; |
| OTHER | &quot;OTHER&quot; |
| PENSION | &quot;PENSION&quot; |
| STOCK | &quot;STOCK&quot; |



