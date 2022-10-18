

# InvestmentsPortfolioInstrument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID used to reference the current instrument. |  [optional] |
|**publicId** | [**List&lt;InvestmentsPortfolioInstrumentPublicId&gt;**](InvestmentsPortfolioInstrumentPublicId.md) | The public identifiers for the instrument. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The instrument type. For more information about instruments, please see our [Investments DevPortal article](https://developers.belvo.com/docs/investments#instruments).  We return one of the following enum values:    - &#x60;BOND&#x60;   - &#x60;DEPOSIT&#x60;   - &#x60;ETF&#x60;   - &#x60;FUND&#x60;   - &#x60;OTHER&#x60;   - &#x60;PENSION&#x60;   - &#x60;STOCK&#x60;  |  |
|**subtype** | **String** | The subtype for the instrument, as given by the institution. |  |
|**name** | **String** | The name of the instrument, as given by the institution. |  |
|**currency** | **String** | The currency of the instrument. For example:  - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso) - 🇺🇸 USD (US Dollar)   Please note that other currencies other than in the list above may be returned.  |  |
|**price** | **Float** | The current price of one share in the instrument. |  |
|**quantity** | **Float** | The total amount of shares owned in the instrument. |  |
|**balanceGross** | **Float** | The total gross value of the instrument (including taxes). |  |
|**balanceNet** | **Float** | The total net value of the instrument (excluding taxes). |  |
|**averageAcquisitionPrice** | **Float** | The average price of each share acquired in the instrument. |  |
|**profit** | **Float** | The current profit earned in the instrument. |  |
|**openDate** | **LocalDate** | The start date of the instrument. Only applicable for instruments of type &#x60;bond&#x60; or &#x60;savings&#x60;. |  |
|**redemptionConditions** | [**List&lt;InvestmentsPortfolioInstrumentRedemptionConditions&gt;**](InvestmentsPortfolioInstrumentRedemptionConditions.md) | An array of conditions that apply to the instrument in order to retrieve the final value.  For example, the due date, the liquidity date, the previdencia type, and so on.  |  |
|**fees** | [**List&lt;InvestmentsPortfolioInstrumentFees&gt;**](InvestmentsPortfolioInstrumentFees.md) | An array of fees that apply to the instrument. |  |
|**interestRates** | [**List&lt;InvestmentsPortfolioInstrumentInterestRate&gt;**](InvestmentsPortfolioInstrumentInterestRate.md) | An array of interest rates that apply to the instrument. |  |



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



