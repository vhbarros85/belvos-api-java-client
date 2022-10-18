

# Account

Details regarding the account.  **Note**: For our recurring expenses resource, this account relates to the account that was analyzed to generate the recurring expenses report. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier created by Belvo used to reference the current account. |  [optional] |
|**link** | **String** | The &#x60;link.id&#x60; the account belongs to. |  [optional] |
|**institution** | [**InstitutionAccount**](InstitutionAccount.md) |  |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) | The type of account. For Gig economy institutions, the account type refers to their gig role (delivery or driver). We return one of the following enum values:   - &#x60;CHECKING_ACCOUNT&#x60;   - &#x60;CREDIT_CARD&#x60;   - &#x60;DELIVERY_ACCOUNT&#x60;   - &#x60;DRIVER_ACCOUNT&#x60;   - &#x60;INVESTMENT_ACCOUNT&#x60;   - &#x60;LOAN_ACCOUNT&#x60;   - &#x60;PENSION_FUND_ACCOUNT&#x60;   - &#x60;RECEIVABLES_ACCOUNT&#x60;   - &#x60;SAVINGS_ACCOUNT&#x60;   - &#x60;UNCATEGORIZED&#x60;  |  |
|**balanceType** | **String** | Indicates whether this account is either an &#x60;ASSET&#x60; or a &#x60;LIABILITY&#x60;. You can consider the balance of an &#x60;ASSET&#x60; as being positive, while the balance of a &#x60;LIABILITY&#x60; as negative.  ℹ️ **Note**: Due to the nature of cash payments in gig-economy institutions, the &#x60;balance.current&#x60; and &#x60;balance.available&#x60; may indicate that the gig-economy user has a negative balance. However, this is still considered an &#x60;ASSET&#x60; as the gig-economy user has received payment for their services.  |  |
|**type** | **String** | The account type, as designated by the institution. |  |
|**name** | **String** | The account name, as given by the institution. |  |
|**number** | **String** | The account number, as designated by the institution. |  |
|**balance** | [**AccountsBalance**](AccountsBalance.md) |  |  |
|**currency** | **String** | The currency of the account. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned. |  |
|**publicIdentificationName** | **String** | The public name for the type of identification. For example: &#x60;\&quot;CLABE\&quot;&#x60;.  ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be &#x60;AGENCY/ACCOUNT&#x60;.  |  |
|**publicIdentificationValue** | **String** | The value for the &#x60;public_identification_name&#x60;.  ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be the agency and bank account number, separated by a slash. For example: &#x60;0444/45722-0&#x60;.  |  |
|**lastAccessedAt** | **OffsetDateTime** | The ISO-8601 timestamp of Belvo&#39;s most recent successful access to the institution for the given link. |  |
|**creditData** | [**AccountsCreditData**](AccountsCreditData.md) |  |  |
|**loanData** | [**AccountsLoanData**](AccountsLoanData.md) |  |  |
|**fundsData** | [**List&lt;AccountsFundsData&gt;**](AccountsFundsData.md) | One or more funds that contribute to the the pension account. |  [optional] |
|**gigPaymentData** | [**AccountsGigPaymentData**](AccountsGigPaymentData.md) |  |  [optional] |
|**receivablesData** | [**AccountsReceivablesData**](AccountsReceivablesData.md) |  |  [optional] |
|**bankProductId** | **String** | *This field has been deprecated.*  *The institution&#39;s product ID for the account type.*  |  [optional] |
|**internalIdentification** | **String** | *This field has been deprecated.*  *The institution&#39;s internal identification for the account.*  |  [optional] |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| CHECKING_ACCOUNT | &quot;CHECKING_ACCOUNT&quot; |
| CREDIT_CARD | &quot;CREDIT_CARD&quot; |
| DELIVERY_ACCOUNT | &quot;DELIVERY_ACCOUNT&quot; |
| DRIVER_ACCOUNT | &quot;DRIVER_ACCOUNT&quot; |
| INVESTMENT_ACCOUNT | &quot;INVESTMENT_ACCOUNT&quot; |
| LOAN_ACCOUNT | &quot;LOAN_ACCOUNT&quot; |
| PENSION_FUND_ACCOUNT | &quot;PENSION_FUND_ACCOUNT&quot; |
| RECEIVABLES_ACCOUNT | &quot;RECEIVABLES_ACCOUNT&quot; |
| SAVINGS_ACCOUNT | &quot;SAVINGS_ACCOUNT&quot; |
| UNCATEGORIZED | &quot;UNCATEGORIZED&quot; |



