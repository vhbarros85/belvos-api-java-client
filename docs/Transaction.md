

# Transaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID for the transaction. |  [optional] |
|**account** | [**Account**](Account.md) |  |  |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  [optional] |
|**valueDate** | **LocalDate** | The date when the transaction occurred, in &#x60;YYYY-MM-DD&#x60; format. |  |
|**accountingDate** | **LocalDate** | The date when the transaction was processed and accounted for by the institution. |  |
|**amount** | **Float** | The transaction amount. ℹ️ The amount displayed is always positive as we indicate the direction of the transaction in the &#x60;type&#x60; parameter.  |  |
|**balance** | **Float** | The balance at the end of the transaction. |  |
|**currency** | **String** | The currency of the transaction. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned. |  |
|**description** | **String** | The description of transaction provided by the institution. Usually this is the text that the end user sees in the online platform. |  |
|**observations** | **String** | Additional observations provided by the institution on the transaction. |  |
|**merchant** | [**TransactionMerchantData**](TransactionMerchantData.md) |  |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) | The name of the category to which this transaction belongs.  &gt; **Get transaction categorization** We can clean and categorize transactions for you as part of our [Transaction categorization](https://developers.belvo.com/docs/banking#transaction-categorization) product, turning raw data into actionable insights. To enable this product, just email our sales team at sales@belvo.com, and they&#39;ll get right to it.  We return one of the following enum values:    - &#x60;Deposits&#x60;   - &#x60;Home &amp; Life&#x60;   - &#x60;Food &amp; Groceries&#x60;   - &#x60;Online Platforms &amp; Leisure&#x60;   - &#x60;Transport &amp; Travel&#x60;   - &#x60;Personal Shopping&#x60;   - &#x60;Taxes&#x60;   - &#x60;Withdrawal &amp; ATM&#x60;   - &#x60;Credits &amp; Loans&#x60;   - &#x60;Bills &amp; Utilities&#x60;   - &#x60;Investments &amp; Savings&#x60;   - &#x60;Fees &amp; Charges&#x60;   - &#x60;Income &amp; Payments&#x60;   - &#x60;Transfers&#x60;  |  [optional] |
|**reference** | **String** | The reference number of the transaction, provided by the bank. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The direction of the transaction: - &#x60;INFLOW&#x60; indicates money coming into the account. - &#x60;OUTFLOW&#x60; indicates money going out of the account.  |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the transaction.  We return one of the following enum values:    - &#x60;PENDING&#x60;   - &#x60;PROCESSED&#x60;   - &#x60;UNCATEGORIZED&#x60;  |  |
|**gigData** | [**TransactionGigData**](TransactionGigData.md) |  |  [optional] |
|**creditCardData** | [**TransactionCreditCardData**](TransactionCreditCardData.md) |  |  [optional] |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| DEPOSITS | &quot;Deposits&quot; |
| HOME_LIFE | &quot;Home &amp; Life&quot; |
| FOOD_GROCERIES | &quot;Food &amp; Groceries&quot; |
| ONLINE_PLATFORMS_LEISURE | &quot;Online Platforms &amp; Leisure&quot; |
| TRANSPORT_TRAVEL | &quot;Transport &amp; Travel&quot; |
| PERSONAL_SHOPPING | &quot;Personal Shopping&quot; |
| TAXES | &quot;Taxes&quot; |
| WITHDRAWAL_ATM | &quot;Withdrawal &amp; ATM&quot; |
| CREDITS_LOANS | &quot;Credits &amp; Loans&quot; |
| BILLS_UTILITIES | &quot;Bills &amp; Utilities&quot; |
| INVESTMENTS_SAVINGS | &quot;Investments &amp; Savings&quot; |
| FEES_CHARGES | &quot;Fees &amp; Charges&quot; |
| INCOME_PAYMENTS | &quot;Income &amp; Payments&quot; |
| TRANSFERS | &quot;Transfers&quot; |
| NULL | &quot;null&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| OUTFLOW | &quot;OUTFLOW&quot; |
| INFLOW | &quot;INFLOW&quot; |
| NULL | &quot;null&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| PROCESSED | &quot;PROCESSED&quot; |
| UNCATEGORIZED | &quot;UNCATEGORIZED&quot; |
| NULL | &quot;null&quot; |



