

# RecurringExpenses

Recurring expense insights.   ℹ️ If no recurring expense insights are found, we return an empty array. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique identifier used to reference the current recurring expense. |  [optional] |
|**account** | [**Account**](Account.md) |  |  |
|**name** | **String** | The name for the recurring expense.  ℹ️ **Note**: This information is taken from the description section of a transaction and then normalized to provide you with an easy-to-read name. As such, sometimes the name will reflect the merchant the payment is made to (for example, Netflix.com), while for other recurring expenses, this could be something like \&quot;Monthly payment to John\&quot;.  |  |
|**transactions** | [**List&lt;RecurringExpenseSourceTransaction&gt;**](RecurringExpenseSourceTransaction.md) | An array of minified transaction objects used to evaluate the recurring expense. If no transactions were found, we return an empty array. |  |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) | The frequency at which this recurring expense occurs. ℹ️ **Note:** As part of the BETA, Belvo only identifies &#x60;MONTHLY&#x60; frequencies.  |  |
|**averageTransactionAmount** | **Float** | The average transaction amount of the recurring expense. |  |
|**medianTransactionAmount** | **Float** | The median transaction amount of the recurring expense. |  |
|**daysSinceLastTransaction** | **Integer** | Number of days since the last recurring expense occurred.  Based on the frequency, you can infer how many days until the next charge will occur.  |  |
|**category** | **String** | The transaction category for the recurring expense. For more information on the available categories, please see our [Transaction categorization documentation](https://developers.belvo.com/docs/banking#transaction-categorization). ℹ️ **Note:** As part of the BETA - the most common categories that will be returned are: - &#x60;Online Platforms &amp; Leisure&#x60; (Netflix, Spotify, Gym Memberships) - &#x60;Bills &amp; Utilities&#x60; (electricity, telephone, internet)  |  |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | The type of recurring expense. As part of the BETA, Belvo only returns &#x60;SUBSCRIPTION&#x60; payment types.  |  |



## Enum: FrequencyEnum

| Name | Value |
|---- | -----|
| MONTHLY | &quot;MONTHLY&quot; |



## Enum: PaymentTypeEnum

| Name | Value |
|---- | -----|
| SUBSCRIPTION | &quot;SUBSCRIPTION&quot; |



