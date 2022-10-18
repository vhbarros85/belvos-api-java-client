

# Institution


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The ID of the institution as designated by Belvo. |  [optional] |
|**name** | **String** | The name of the institution, as designated by Belvo. Please see our [Institutions](https://developers.belvo.com/docs/institution) DevPortal article for a detailed list of institution names. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of institution.  Can be either:    - &#x60;bank&#x60;   - &#x60;fiscal&#x60;   - &#x60;gig&#x60;  |  [optional] |
|**website** | **String** | The URL of the institution&#39;s website. |  [optional] |
|**displayName** | **String** | The customer-facing name of the institution. |  [optional] |
|**countryCodes** | **List&lt;String&gt;** | The country codes where the institution is available, for example: - 🇧🇷 BR (Brazil) - 🇨🇴 CO (Colombia) - 🇲🇽 MX (Mexico)    |  [optional] |
|**primaryColor** | **String** | The primary color on the institution&#39;s website. |  [optional] |
|**logo** | **String** | The URL of the institution&#39;s logo. |  [optional] |
|**iconLogo** | **String** | The URL of the institution&#39;s icon logo. |  [optional] |
|**textLogo** | **String** | The URL of the institution&#39;s text logo. |  [optional] |
|**formFields** | [**InstitutionFormFields**](InstitutionFormFields.md) |  |  [optional] |
|**features** | [**List&lt;InstitutionsFeature&gt;**](InstitutionsFeature.md) | The features that the institution supports. If the institution has no special features, then Belvo returns an empty array.  Here is a list of the available features: - &#x60;token_required&#x60; indicates that the institution may require a token during link creation or when making any other requests.  |  [optional] |
|**resources** | **List&lt;String&gt;** | A list of Belvo resources that you can use with the institution. This list includes one or more of the following resources:    - &#x60;ACCOUNTS&#x60;   - &#x60;BALANCES&#x60;   - &#x60;INCOMES&#x60;   - &#x60;INVESTMENTS_PORTFOLIOS&#x60;   - &#x60;INVESTMENTS_TRANSACTIONS&#x60;   - &#x60;INVOICES&#x60;   - &#x60;OWNERS&#x60;   - &#x60;RECURRING_EXPENSES&#x60;   - &#x60;RISK_INSIGHTS&#x60;   - &#x60;TRANSACTIONS&#x60;   - &#x60;TAX_COMPLIANCE_STATUS&#x60;   - &#x60;TAX_STATUS&#x60;   - &#x60;TAX_RETURNS&#x60;  |  [optional] |
|**integrationType** | [**IntegrationTypeEnum**](#IntegrationTypeEnum) | The type of technology used to access the institution.  - &#x60;credentials&#x60;: Uses Belvo&#39;s scraping technology, combined with user credentials, to perform requests. - &#x60;openbanking&#x60;: Uses the bank&#39;s openbanking API to perform requests.  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Indicates whether Belvo&#39;s integration with the institution is currently active (&#x60;healthy&#x60;) or undergoing maintenance (&#x60;down&#x60;).  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BANK | &quot;bank&quot; |
| FISCAL | &quot;fiscal&quot; |
| GIG | &quot;gig&quot; |



## Enum: IntegrationTypeEnum

| Name | Value |
|---- | -----|
| CREDENTIALS | &quot;credentials&quot; |
| OPENBANKING | &quot;openbanking&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| HEALTHY | &quot;healthy&quot; |
| DOWN | &quot;down&quot; |



