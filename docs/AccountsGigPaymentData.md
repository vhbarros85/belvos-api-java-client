

# AccountsGigPaymentData

Additional data provided by the institution on the payment methods configured in the user profiles. This data is **only** provided by gig economy institutions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**method** | **String** | The payment method type set up by the user (&#x60;BANK_ACCOUNT&#x60;, &#x60;CARD&#x60;, or &#x60;CASH&#x60;). |  [optional] |
|**issuer** | **String** | The payment &#x60;method&#x60; issuer set up by the user (bank institution or card issuer). |  [optional] |
|**number** | **String** | The bank account or card number used for the payment. |  [optional] |
|**holderName** | **String** | The name of the payment &#x60;method&#x60; holder. |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  [optional] |



