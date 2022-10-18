

# InvestmentsInstrumentTransactionPortfolio

Basic information about the parent portfolio.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID used to reference the current portfolio. |  [optional] |
|**name** | **String** | The name of the portfolio, as given in the institution.  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The portfolio type.  We return one of the following enum values:    - &#x60;FIXED_INCOME&#x60;   - &#x60;OTHER&#x60;   - &#x60;PENSION&#x60;   - &#x60;VARIABLE_INCOME&#x60;  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FIXED_INCOME | &quot;FIXED_INCOME&quot; |
| OTHER | &quot;OTHER&quot; |
| PENSION | &quot;PENSION&quot; |
| VARIABLE_INCOME | &quot;VARIABLE_INCOME&quot; |



