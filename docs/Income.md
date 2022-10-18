

# Income

Income insights

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique identifier used to reference the current income. |  |
|**account** | [**Account**](Account.md) |  |  |
|**currency** | **String** | The currency of the income. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned. |  |
|**sources** | [**List&lt;IncomeSources&gt;**](IncomeSources.md) | A list of income sources for the account.  For each income source, we provide additional insights such as: - Frequency of the income transactions. - Key metrics about the transaction amounts.  |  |
|**aggregations** | [**List&lt;IncomesAggregations&gt;**](IncomesAggregations.md) | A list of aggregated metrics for the income.  |  |
|**collectedAt** | **OffsetDateTime** | This field has been deprecated.  The ISO-8601 timestamp when the data point was collected.  |  |



