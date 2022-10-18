

# IncomesAggregations

A list of aggregated data for the incomes.   ℹ️ If not income information can be found, we return an empty array. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**periodUnit** | **String** | Period to be considered. At present all calculations are based on *rolling months*.  Note: A *rolling month* is a period of 30 days. For example, 15-03-2021 to 14-04-2021.  |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of income used in the calculations. At present, Belvo takes into consideration all the income types into the calculation. We return one of the following enum values:    - &#x60;ALL&#x60;   - &#x60;CASH_DEPOSIT&#x60;   - &#x60;PENSION&#x60;   - &#x60;SALARY&#x60;   - &#x60;UNKNOWN&#x60; |  |
|**minimumConfidence** | [**MinimumConfidenceEnum**](#MinimumConfidenceEnum) | The lowest confidence score of the income transactions used in performing the calculations.  When the &#x60;minimum_confidence&#x60; enum is equal to: - &#x60;HIGH&#x60;, only transactions with high confidence score are used. - &#x60;MEDIUM&#x60;, all transactions with a confidence score of medium or high are used.  |  |
|**lookbackPeriods** | **Integer** | Number of &#x60;period_unit&#x60;s used to generate insights and calculations. |  |
|**fullPeriods** | **Integer** | Number of &#x60;period_unit&#x60;s with data to perform calculations. |  |
|**periodsWithIncome** | **Integer** | Number of &#x60;period_unit&#x60;s with at least one income available with a confidence of either &#x60;HIGH&#x60; or &#x60;MEDIUM&#x60;.  |  |
|**totalNumberOfSources** | **Integer** | The total number of income transactions in the last &#x60;period_unit&#x60;s. |  |
|**stdIncomePerPeriod** | **Float** | The standard deviation of the income amount calculated per month, given the past three &#x60;period_unit&#x60;s.  |  |
|**averageIncomePerPeriod** | **Float** | The average income amount calculated per month, given the past three &#x60;period_unit&#x60;s.  |  |
|**medianIncomePerPeriod** | **Float** | The median income amount calculated per month, given the past three &#x60;period_unit&#x60;s.  |  |
|**maximumIncomePerPeriod** | **Float** | The maximum income amount calculated per month, given the past three &#x60;period_unit&#x60;s.  |  |
|**minimumIncomePerPeriod** | **Float** | The minimum income amount calculated per month, given the past three &#x60;period_unit&#x60;s.  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| CASH_DEPOSIT | &quot;CASH_DEPOSIT&quot; |
| PENSION | &quot;PENSION&quot; |
| SALARY | &quot;SALARY&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



## Enum: MinimumConfidenceEnum

| Name | Value |
|---- | -----|
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |



