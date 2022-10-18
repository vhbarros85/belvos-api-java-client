

# IncomeSources

A list of income sources for the account.  For each income source, we provide additional insights such as: - Frequency of the income transactions. - Key metrics about the transaction amounts.  ℹ️ If no income sources are found, we return an empty array. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactions** | [**List&lt;IncomeSourceTransaction&gt;**](IncomeSourceTransaction.md) | A list of supporting transactions for this income source.   ℹ️ If no income transactions are found, we return an empty array.  |  |
|**confidence** | [**ConfidenceEnum**](#ConfidenceEnum) | Belvo&#39;s level of confidence that the source is actually an income.  We return one of the following enum values:    - &#x60;HIGH&#x60;   - &#x60;MEDIUM&#x60;  |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of income.  We return one of the following enum values:    - &#x60;SALARY&#x60;   - &#x60;CASH_DEPOSIT&#x60;   - &#x60;PENSION&#x60;   - &#x60;UNKNOWN&#x60;  |  |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) | How often the income transaction occurs.  We return one of the following enum values:    - &#x60;MONTHLY&#x60;   - &#x60;FORTNIGHTLY&#x60;   - &#x60;WEEKLY&#x60;   - &#x60;IRREGULAR&#x60;  |  |
|**stdTransactionAmount** | **Float** | The standard deviation of the income transaction. |  |
|**averageTransactionAmount** | **Float** | The average income transaction amount. |  |
|**medianTransactionAmount** | **Float** | The median income transaction amount. |  |
|**minimumTransactionAmount** | **Float** | The minimum income transaction amount. |  |
|**maximumTransactionAmount** | **Float** | The maximum income transaction amount. |  |
|**daysSinceLastTransaction** | **Integer** | The number of days since the last income transaction. |  |
|**averageDaysBetweenConsecutiveIncomeTransactions** | **Float** | The average number of days between consecutive income transactions. |  |
|**stdDaysBetweenConsecutiveIncomeTransactions** | **Float** | The standard deviation of days between consecutive income transactions. |  |
|**medianDaysBetweenConsecutiveIncomeTransactions** | **Float** | The median number of days between consecutive income transactions. |  |
|**minimumDaysBetweenConsecutiveIncomeTransactions** | **Integer** | The minimum number of days between consecutive income transactions. |  |
|**maximumDaysBetweenConsecutiveIncomeTransactions** | **Integer** | The maximum number of days between consecutive income transactions. |  |



## Enum: ConfidenceEnum

| Name | Value |
|---- | -----|
| HIGH | &quot;HIGH&quot; |
| MEDIUM | &quot;MEDIUM&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SALARY | &quot;SALARY&quot; |
| CASH_DEPOSIT | &quot;CASH_DEPOSIT&quot; |
| PENSION | &quot;PENSION&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



## Enum: FrequencyEnum

| Name | Value |
|---- | -----|
| MONTHLY | &quot;MONTHLY&quot; |
| FORTNIGHTLY | &quot;FORTNIGHTLY&quot; |
| WEEKLY | &quot;WEEKLY&quot; |
| IRREGULAR | &quot;IRREGULAR&quot; |



