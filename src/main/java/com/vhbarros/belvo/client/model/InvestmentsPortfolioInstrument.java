/*
 * Belvo API Docs
 * # Introduction  Belvo is an open banking API for Latin America that allows companies to access banking and fiscal information in a secure as well as agile way.  Through our API, you can access:   - **Bank and Gig information** such as account information, real-time balance, historical transactions, and account owner identification.  - **Fiscal information** such as received and sent invoices and tax returns.   <img src=\"https://files.readme.io/acf27d3-belvo_pipes.png\" alt=\"fiscal-endpoints\">   In this API reference you'll find all the information you need about each  endpoint and resource.   <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\">  <strong>Tip: </strong> Make sure that you also check out our Developer Portal for guides on <a href=\"https://developers.belvo.com/docs/get-started-in-5-minutes\" target=\"_blank\">how to get started</a>, using our <a href=\"https://developers.belvo.com/docs/test-in-sandbox\" target=\"_blank\">Sandbox environment</a>, as well as how to <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">integrate the widget</a> or use our <a href=\"https://developers.belvo.com/docs/quickstart-application\" target=\"_blank\">quickstart application</a>.  </div>   ## Environment  We currently offer three environments: sandbox, development, and production.   When using our SDKs, make sure to use the **Alias** (and not the Base URL).   | Environment | Purpose | Access | |-----------|-------|-------| | **Sandbox** | The [Sandbox environment](https://developers.belvo.com/docs/test-in-sandbox) is dedicated for your testing and development phases. In this environment, you can create links without real credentials and you can pull test data from all endpoints. **⚠️The sandbox environment is refreshed frequently and your test data can be updated or deleted.** | Base URL (cURL): https://sandbox.belvo.com/ <br><br>Alias (SDKs): sandbox| |**Development**|The Development environment is dedicated for testing with real credentials and institutions with real-world institutions. You can create up to 25 links for free in this environment.| Base URL (cURL): https://development.belvo.com/ <br><br>Alias (SDKs): development | | **Production** | The Production environment is dedicated for live applications with real connections to institutions. In this environment, you will need real credentials to create links and you will pull real data from the institutions.| Base URL (cURL): https://api.belvo.com/ <br><br>Alias (SDKs): production|   For each environment, you'll need to [generate separate API keys](https://developers.belvo.com/docs/get-your-belvo-api-keys).   ## Response codes   We use the following HTTP status code in the response depending on the success or failure:   | Status Code | Description | |-----------|-------| | `200` | ✅ **Success** - The content is available in the response body. | | `201` | ✅ **Success** - The content was created successfully on Belvo. | | `204` | ✅ **Success** - No content to return. | | `400` | ❌ **Bad Request Error** - Request returned an error, detail in content.| | `401` | ❌ **Unauthorized** - The Belvo credentials provided are not valid.| | `404` | ❌ **Not Found** - The resource you try to access cannot be found.| | `405` | ❌ **Method Not Allowed** - The HTTP method you are using is not accepted for this resource.| | `408` | ❌ **Request Timeout** - The request timed out and was terminated by the server.| | `428` | ❌ **MFA Token Required** - MFA token was required by the institution to connect. | | `500` | ❌ **Internal Server Error** - The detail of the error is available in the response body.|   ## Error handling   ### Error messages   Belvo API errors are returned in JSON format. For example, an error might look like this:   ```json  [     {       \"request_id\": \"a6e1c493d7a29d91aed4338e6fcf077d\",       \"message\": \"This field is required.\",       \"code\": \"required\",       \"field\": \"link\"     } ]  ```   Typically, an error response will have the following parameters:  - `request_id`: a unique ID for the request, you should share it with the Belvo support team for investigations.  - `message`: human-readable description of the error.  - `code`: a unique code for the error. Check the table below to see how to handle each error code.  - `field` *(optional)*: The specific field in the request body that has an issue.    ### Request identifier  When you need help with a specific error, add the request identifier (`request_id`) in your message to the Belvo support team. This will speed up investigations and get you back up and running in no time at all.   ### Error codes and troubleshooting   For a full list of errors and how to troubleshoot them, please see our dedicated [Error handling articles](https://developers.belvo.com/docs/integration-overview#error-handling) in our DevPortal.    ### Retry policy   Please see our recommended [retry policies](https://developers.belvo.com/docs/integration-overview#error-retry-policy) in the DevPortal. 
 *
 * The version of the OpenAPI document: 1.20.1
 * Contact: support@belvo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.vhbarros.belvo.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vhbarros.belvo.client.model.InvestmentsPortfolioInstrumentFees;
import com.vhbarros.belvo.client.model.InvestmentsPortfolioInstrumentInterestRate;
import com.vhbarros.belvo.client.model.InvestmentsPortfolioInstrumentPublicId;
import com.vhbarros.belvo.client.model.InvestmentsPortfolioInstrumentRedemptionConditions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InvestmentsPortfolioInstrument
 */
@JsonPropertyOrder({
  InvestmentsPortfolioInstrument.JSON_PROPERTY_ID,
  InvestmentsPortfolioInstrument.JSON_PROPERTY_PUBLIC_ID,
  InvestmentsPortfolioInstrument.JSON_PROPERTY_TYPE,
  InvestmentsPortfolioInstrument.JSON_PROPERTY_SUBTYPE,
  InvestmentsPortfolioInstrument.JSON_PROPERTY_NAME,
  InvestmentsPortfolioInstrument.JSON_PROPERTY_CURRENCY,
  InvestmentsPortfolioInstrument.JSON_PROPERTY_PRICE,
  InvestmentsPortfolioInstrument.JSON_PROPERTY_QUANTITY,
  InvestmentsPortfolioInstrument.JSON_PROPERTY_BALANCE_GROSS,
  InvestmentsPortfolioInstrument.JSON_PROPERTY_BALANCE_NET,
  InvestmentsPortfolioInstrument.JSON_PROPERTY_AVERAGE_ACQUISITION_PRICE,
  InvestmentsPortfolioInstrument.JSON_PROPERTY_PROFIT,
  InvestmentsPortfolioInstrument.JSON_PROPERTY_OPEN_DATE,
  InvestmentsPortfolioInstrument.JSON_PROPERTY_REDEMPTION_CONDITIONS,
  InvestmentsPortfolioInstrument.JSON_PROPERTY_FEES,
  InvestmentsPortfolioInstrument.JSON_PROPERTY_INTEREST_RATES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class InvestmentsPortfolioInstrument {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private List<InvestmentsPortfolioInstrumentPublicId> publicId = new ArrayList<>();

  /**
   * The instrument type. For more information about instruments, please see our [Investments DevPortal article](https://developers.belvo.com/docs/investments#instruments).  We return one of the following enum values:    - &#x60;BOND&#x60;   - &#x60;DEPOSIT&#x60;   - &#x60;ETF&#x60;   - &#x60;FUND&#x60;   - &#x60;OTHER&#x60;   - &#x60;PENSION&#x60;   - &#x60;STOCK&#x60; 
   */
  public enum TypeEnum {
    BOND("BOND"),
    
    DEPOSIT("DEPOSIT"),
    
    ETF("ETF"),
    
    FUND("FUND"),
    
    OTHER("OTHER"),
    
    PENSION("PENSION"),
    
    STOCK("STOCK");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_SUBTYPE = "subtype";
  private String subtype;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_PRICE = "price";
  private Float price;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Float quantity;

  public static final String JSON_PROPERTY_BALANCE_GROSS = "balance_gross";
  private Float balanceGross;

  public static final String JSON_PROPERTY_BALANCE_NET = "balance_net";
  private Float balanceNet;

  public static final String JSON_PROPERTY_AVERAGE_ACQUISITION_PRICE = "average_acquisition_price";
  private Float averageAcquisitionPrice;

  public static final String JSON_PROPERTY_PROFIT = "profit";
  private Float profit;

  public static final String JSON_PROPERTY_OPEN_DATE = "open_date";
  private LocalDate openDate;

  public static final String JSON_PROPERTY_REDEMPTION_CONDITIONS = "redemption_conditions";
  private List<InvestmentsPortfolioInstrumentRedemptionConditions> redemptionConditions = new ArrayList<>();

  public static final String JSON_PROPERTY_FEES = "fees";
  private List<InvestmentsPortfolioInstrumentFees> fees = new ArrayList<>();

  public static final String JSON_PROPERTY_INTEREST_RATES = "interest_rates";
  private List<InvestmentsPortfolioInstrumentInterestRate> interestRates = new ArrayList<>();

  public InvestmentsPortfolioInstrument() {
  }

  public InvestmentsPortfolioInstrument id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique ID used to reference the current instrument.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", value = "Belvo's unique ID used to reference the current instrument.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public InvestmentsPortfolioInstrument publicId(List<InvestmentsPortfolioInstrumentPublicId> publicId) {
    
    this.publicId = publicId;
    return this;
  }

  public InvestmentsPortfolioInstrument addPublicIdItem(InvestmentsPortfolioInstrumentPublicId publicIdItem) {
    this.publicId.add(publicIdItem);
    return this;
  }

   /**
   * The public identifiers for the instrument.
   * @return publicId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The public identifiers for the instrument.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<InvestmentsPortfolioInstrumentPublicId> getPublicId() {
    return publicId;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPublicId(List<InvestmentsPortfolioInstrumentPublicId> publicId) {
    this.publicId = publicId;
  }


  public InvestmentsPortfolioInstrument type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The instrument type. For more information about instruments, please see our [Investments DevPortal article](https://developers.belvo.com/docs/investments#instruments).  We return one of the following enum values:    - &#x60;BOND&#x60;   - &#x60;DEPOSIT&#x60;   - &#x60;ETF&#x60;   - &#x60;FUND&#x60;   - &#x60;OTHER&#x60;   - &#x60;PENSION&#x60;   - &#x60;STOCK&#x60; 
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DEPOSIT", required = true, value = "The instrument type. For more information about instruments, please see our [Investments DevPortal article](https://developers.belvo.com/docs/investments#instruments).  We return one of the following enum values:    - `BOND`   - `DEPOSIT`   - `ETF`   - `FUND`   - `OTHER`   - `PENSION`   - `STOCK` ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public InvestmentsPortfolioInstrument subtype(String subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * The subtype for the instrument, as given by the institution.
   * @return subtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CBD", required = true, value = "The subtype for the instrument, as given by the institution.")
  @JsonProperty(JSON_PROPERTY_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubtype() {
    return subtype;
  }


  @JsonProperty(JSON_PROPERTY_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }


  public InvestmentsPortfolioInstrument name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the instrument, as given by the institution.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CBD DIGITAL ESPECIAL", required = true, value = "The name of the instrument, as given by the institution.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public InvestmentsPortfolioInstrument currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the instrument. For example:  - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso) - 🇺🇸 USD (US Dollar)   Please note that other currencies other than in the list above may be returned. 
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USD", required = true, value = "The currency of the instrument. For example:  - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso) - 🇺🇸 USD (US Dollar)   Please note that other currencies other than in the list above may be returned. ")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public InvestmentsPortfolioInstrument price(Float price) {
    
    this.price = price;
    return this;
  }

   /**
   * The current price of one share in the instrument.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.41", required = true, value = "The current price of one share in the instrument.")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrice(Float price) {
    this.price = price;
  }


  public InvestmentsPortfolioInstrument quantity(Float quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The total amount of shares owned in the instrument.
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "27.46", required = true, value = "The total amount of shares owned in the instrument.")
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantity(Float quantity) {
    this.quantity = quantity;
  }


  public InvestmentsPortfolioInstrument balanceGross(Float balanceGross) {
    
    this.balanceGross = balanceGross;
    return this;
  }

   /**
   * The total gross value of the instrument (including taxes).
   * @return balanceGross
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.09", required = true, value = "The total gross value of the instrument (including taxes).")
  @JsonProperty(JSON_PROPERTY_BALANCE_GROSS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getBalanceGross() {
    return balanceGross;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_GROSS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalanceGross(Float balanceGross) {
    this.balanceGross = balanceGross;
  }


  public InvestmentsPortfolioInstrument balanceNet(Float balanceNet) {
    
    this.balanceNet = balanceNet;
    return this;
  }

   /**
   * The total net value of the instrument (excluding taxes).
   * @return balanceNet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99.09", required = true, value = "The total net value of the instrument (excluding taxes).")
  @JsonProperty(JSON_PROPERTY_BALANCE_NET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getBalanceNet() {
    return balanceNet;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_NET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalanceNet(Float balanceNet) {
    this.balanceNet = balanceNet;
  }


  public InvestmentsPortfolioInstrument averageAcquisitionPrice(Float averageAcquisitionPrice) {
    
    this.averageAcquisitionPrice = averageAcquisitionPrice;
    return this;
  }

   /**
   * The average price of each share acquired in the instrument.
   * @return averageAcquisitionPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.01", required = true, value = "The average price of each share acquired in the instrument.")
  @JsonProperty(JSON_PROPERTY_AVERAGE_ACQUISITION_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getAverageAcquisitionPrice() {
    return averageAcquisitionPrice;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_ACQUISITION_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAverageAcquisitionPrice(Float averageAcquisitionPrice) {
    this.averageAcquisitionPrice = averageAcquisitionPrice;
  }


  public InvestmentsPortfolioInstrument profit(Float profit) {
    
    this.profit = profit;
    return this;
  }

   /**
   * The current profit earned in the instrument.
   * @return profit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.08", required = true, value = "The current profit earned in the instrument.")
  @JsonProperty(JSON_PROPERTY_PROFIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getProfit() {
    return profit;
  }


  @JsonProperty(JSON_PROPERTY_PROFIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProfit(Float profit) {
    this.profit = profit;
  }


  public InvestmentsPortfolioInstrument openDate(LocalDate openDate) {
    
    this.openDate = openDate;
    return this;
  }

   /**
   * The start date of the instrument. Only applicable for instruments of type &#x60;bond&#x60; or &#x60;savings&#x60;.
   * @return openDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Aug 10 00:00:00 UTC 2021", required = true, value = "The start date of the instrument. Only applicable for instruments of type `bond` or `savings`.")
  @JsonProperty(JSON_PROPERTY_OPEN_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getOpenDate() {
    return openDate;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOpenDate(LocalDate openDate) {
    this.openDate = openDate;
  }


  public InvestmentsPortfolioInstrument redemptionConditions(List<InvestmentsPortfolioInstrumentRedemptionConditions> redemptionConditions) {
    
    this.redemptionConditions = redemptionConditions;
    return this;
  }

  public InvestmentsPortfolioInstrument addRedemptionConditionsItem(InvestmentsPortfolioInstrumentRedemptionConditions redemptionConditionsItem) {
    this.redemptionConditions.add(redemptionConditionsItem);
    return this;
  }

   /**
   * An array of conditions that apply to the instrument in order to retrieve the final value.  For example, the due date, the liquidity date, the previdencia type, and so on. 
   * @return redemptionConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "An array of conditions that apply to the instrument in order to retrieve the final value.  For example, the due date, the liquidity date, the previdencia type, and so on. ")
  @JsonProperty(JSON_PROPERTY_REDEMPTION_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<InvestmentsPortfolioInstrumentRedemptionConditions> getRedemptionConditions() {
    return redemptionConditions;
  }


  @JsonProperty(JSON_PROPERTY_REDEMPTION_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedemptionConditions(List<InvestmentsPortfolioInstrumentRedemptionConditions> redemptionConditions) {
    this.redemptionConditions = redemptionConditions;
  }


  public InvestmentsPortfolioInstrument fees(List<InvestmentsPortfolioInstrumentFees> fees) {
    
    this.fees = fees;
    return this;
  }

  public InvestmentsPortfolioInstrument addFeesItem(InvestmentsPortfolioInstrumentFees feesItem) {
    this.fees.add(feesItem);
    return this;
  }

   /**
   * An array of fees that apply to the instrument.
   * @return fees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "An array of fees that apply to the instrument.")
  @JsonProperty(JSON_PROPERTY_FEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<InvestmentsPortfolioInstrumentFees> getFees() {
    return fees;
  }


  @JsonProperty(JSON_PROPERTY_FEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFees(List<InvestmentsPortfolioInstrumentFees> fees) {
    this.fees = fees;
  }


  public InvestmentsPortfolioInstrument interestRates(List<InvestmentsPortfolioInstrumentInterestRate> interestRates) {
    
    this.interestRates = interestRates;
    return this;
  }

  public InvestmentsPortfolioInstrument addInterestRatesItem(InvestmentsPortfolioInstrumentInterestRate interestRatesItem) {
    this.interestRates.add(interestRatesItem);
    return this;
  }

   /**
   * An array of interest rates that apply to the instrument.
   * @return interestRates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "An array of interest rates that apply to the instrument.")
  @JsonProperty(JSON_PROPERTY_INTEREST_RATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<InvestmentsPortfolioInstrumentInterestRate> getInterestRates() {
    return interestRates;
  }


  @JsonProperty(JSON_PROPERTY_INTEREST_RATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInterestRates(List<InvestmentsPortfolioInstrumentInterestRate> interestRates) {
    this.interestRates = interestRates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentsPortfolioInstrument investmentsPortfolioInstrument = (InvestmentsPortfolioInstrument) o;
    return Objects.equals(this.id, investmentsPortfolioInstrument.id) &&
        Objects.equals(this.publicId, investmentsPortfolioInstrument.publicId) &&
        Objects.equals(this.type, investmentsPortfolioInstrument.type) &&
        Objects.equals(this.subtype, investmentsPortfolioInstrument.subtype) &&
        Objects.equals(this.name, investmentsPortfolioInstrument.name) &&
        Objects.equals(this.currency, investmentsPortfolioInstrument.currency) &&
        Objects.equals(this.price, investmentsPortfolioInstrument.price) &&
        Objects.equals(this.quantity, investmentsPortfolioInstrument.quantity) &&
        Objects.equals(this.balanceGross, investmentsPortfolioInstrument.balanceGross) &&
        Objects.equals(this.balanceNet, investmentsPortfolioInstrument.balanceNet) &&
        Objects.equals(this.averageAcquisitionPrice, investmentsPortfolioInstrument.averageAcquisitionPrice) &&
        Objects.equals(this.profit, investmentsPortfolioInstrument.profit) &&
        Objects.equals(this.openDate, investmentsPortfolioInstrument.openDate) &&
        Objects.equals(this.redemptionConditions, investmentsPortfolioInstrument.redemptionConditions) &&
        Objects.equals(this.fees, investmentsPortfolioInstrument.fees) &&
        Objects.equals(this.interestRates, investmentsPortfolioInstrument.interestRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, publicId, type, subtype, name, currency, price, quantity, balanceGross, balanceNet, averageAcquisitionPrice, profit, openDate, redemptionConditions, fees, interestRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentsPortfolioInstrument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    balanceGross: ").append(toIndentedString(balanceGross)).append("\n");
    sb.append("    balanceNet: ").append(toIndentedString(balanceNet)).append("\n");
    sb.append("    averageAcquisitionPrice: ").append(toIndentedString(averageAcquisitionPrice)).append("\n");
    sb.append("    profit: ").append(toIndentedString(profit)).append("\n");
    sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
    sb.append("    redemptionConditions: ").append(toIndentedString(redemptionConditions)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    interestRates: ").append(toIndentedString(interestRates)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

