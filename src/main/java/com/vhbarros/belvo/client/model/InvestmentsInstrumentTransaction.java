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
import com.vhbarros.belvo.client.model.InvestmentsInstrumentTransactionInstrument;
import com.vhbarros.belvo.client.model.InvestmentsInstrumentTransactionPortfolio;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InvestmentsInstrumentTransaction
 */
@JsonPropertyOrder({
  InvestmentsInstrumentTransaction.JSON_PROPERTY_ID,
  InvestmentsInstrumentTransaction.JSON_PROPERTY_LINK,
  InvestmentsInstrumentTransaction.JSON_PROPERTY_COLLECTED_AT,
  InvestmentsInstrumentTransaction.JSON_PROPERTY_CREATED_AT,
  InvestmentsInstrumentTransaction.JSON_PROPERTY_PORTFOLIO,
  InvestmentsInstrumentTransaction.JSON_PROPERTY_INSTRUMENT,
  InvestmentsInstrumentTransaction.JSON_PROPERTY_SETTLEMENT_DATE,
  InvestmentsInstrumentTransaction.JSON_PROPERTY_OPERATION_DATE,
  InvestmentsInstrumentTransaction.JSON_PROPERTY_DESCRIPTION,
  InvestmentsInstrumentTransaction.JSON_PROPERTY_TYPE,
  InvestmentsInstrumentTransaction.JSON_PROPERTY_QUANTITY,
  InvestmentsInstrumentTransaction.JSON_PROPERTY_AMOUNT,
  InvestmentsInstrumentTransaction.JSON_PROPERTY_PRICE,
  InvestmentsInstrumentTransaction.JSON_PROPERTY_CURRENCY,
  InvestmentsInstrumentTransaction.JSON_PROPERTY_FEES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class InvestmentsInstrumentTransaction {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_LINK = "link";
  private UUID link;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private OffsetDateTime collectedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_PORTFOLIO = "portfolio";
  private InvestmentsInstrumentTransactionPortfolio portfolio;

  public static final String JSON_PROPERTY_INSTRUMENT = "instrument";
  private InvestmentsInstrumentTransactionInstrument instrument;

  public static final String JSON_PROPERTY_SETTLEMENT_DATE = "settlement_date";
  private LocalDate settlementDate;

  public static final String JSON_PROPERTY_OPERATION_DATE = "operation_date";
  private LocalDate operationDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * The type of transaction.  We return one of the following enum values:    - &#x60;BUY&#x60;   - &#x60;SELL&#x60;   - &#x60;CANCEL&#x60;   - &#x60;CASH&#x60;   - &#x60;FEE&#x60;   - &#x60;TRANSFER&#x60;   - &#x60;DIVIDEND&#x60; 
   */
  public enum TypeEnum {
    BUY("BUY"),
    
    SELL("SELL"),
    
    CANCEL("CANCEL"),
    
    CASH("CASH"),
    
    FEE("FEE"),
    
    TRANSFER("TRANSFER"),
    
    DIVIDEND("DIVIDEND");

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

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Float quantity;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Float amount;

  public static final String JSON_PROPERTY_PRICE = "price";
  private Float price;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_FEES = "fees";
  private Float fees;

  public InvestmentsInstrumentTransaction() {
  }

  public InvestmentsInstrumentTransaction id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique identifier used to reference the current instrument transaction.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f3cd25ba-d109-4ddf-8d29-624c26cbee3f", value = "Belvo's unique identifier used to reference the current instrument transaction.")
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


  public InvestmentsInstrumentTransaction link(UUID link) {
    
    this.link = link;
    return this;
  }

   /**
   * The &#x60;link.id&#x60; the transaction belongs to.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f3cd25ba-d109-4ddf-8d29-624c26cbee3f", value = "The `link.id` the transaction belongs to.")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(UUID link) {
    this.link = link;
  }


  public InvestmentsInstrumentTransaction collectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-09T08:45:50.406032Z", required = true, value = "The ISO-8601 timestamp when the data point was collected.")
  @JsonProperty(JSON_PROPERTY_COLLECTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCollectedAt(OffsetDateTime collectedAt) {
    this.collectedAt = collectedAt;
  }


  public InvestmentsInstrumentTransaction createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-09T08:45:50.406032Z", value = "The ISO-8601 timestamp of when the data point was last updated in Belvo's database.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public InvestmentsInstrumentTransaction portfolio(InvestmentsInstrumentTransactionPortfolio portfolio) {
    
    this.portfolio = portfolio;
    return this;
  }

   /**
   * Get portfolio
   * @return portfolio
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PORTFOLIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InvestmentsInstrumentTransactionPortfolio getPortfolio() {
    return portfolio;
  }


  @JsonProperty(JSON_PROPERTY_PORTFOLIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPortfolio(InvestmentsInstrumentTransactionPortfolio portfolio) {
    this.portfolio = portfolio;
  }


  public InvestmentsInstrumentTransaction instrument(InvestmentsInstrumentTransactionInstrument instrument) {
    
    this.instrument = instrument;
    return this;
  }

   /**
   * Get instrument
   * @return instrument
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InvestmentsInstrumentTransactionInstrument getInstrument() {
    return instrument;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstrument(InvestmentsInstrumentTransactionInstrument instrument) {
    this.instrument = instrument;
  }


  public InvestmentsInstrumentTransaction settlementDate(LocalDate settlementDate) {
    
    this.settlementDate = settlementDate;
    return this;
  }

   /**
   * Date when the transaction was processed by the bank.
   * @return settlementDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Fri Aug 13 00:00:00 UTC 2021", required = true, value = "Date when the transaction was processed by the bank.")
  @JsonProperty(JSON_PROPERTY_SETTLEMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getSettlementDate() {
    return settlementDate;
  }


  @JsonProperty(JSON_PROPERTY_SETTLEMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSettlementDate(LocalDate settlementDate) {
    this.settlementDate = settlementDate;
  }


  public InvestmentsInstrumentTransaction operationDate(LocalDate operationDate) {
    
    this.operationDate = operationDate;
    return this;
  }

   /**
   * Date when the transaction was initiated by the user.
   * @return operationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sat Aug 07 00:00:00 UTC 2021", required = true, value = "Date when the transaction was initiated by the user.")
  @JsonProperty(JSON_PROPERTY_OPERATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getOperationDate() {
    return operationDate;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperationDate(LocalDate operationDate) {
    this.operationDate = operationDate;
  }


  public InvestmentsInstrumentTransaction description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Additional description for the transaction.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Stock acquisition", required = true, value = "Additional description for the transaction.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public InvestmentsInstrumentTransaction type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of transaction.  We return one of the following enum values:    - &#x60;BUY&#x60;   - &#x60;SELL&#x60;   - &#x60;CANCEL&#x60;   - &#x60;CASH&#x60;   - &#x60;FEE&#x60;   - &#x60;TRANSFER&#x60;   - &#x60;DIVIDEND&#x60; 
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BUY", required = true, value = "The type of transaction.  We return one of the following enum values:    - `BUY`   - `SELL`   - `CANCEL`   - `CASH`   - `FEE`   - `TRANSFER`   - `DIVIDEND` ")
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


  public InvestmentsInstrumentTransaction quantity(Float quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of shares purchased in this transaction.
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18.2556", required = true, value = "Number of shares purchased in this transaction.")
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


  public InvestmentsInstrumentTransaction amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The total amount of the transaction.  ℹ️ **Note:** Does not include the transaction fees. 
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18000.25", required = true, value = "The total amount of the transaction.  ℹ️ **Note:** Does not include the transaction fees. ")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public InvestmentsInstrumentTransaction price(Float price) {
    
    this.price = price;
    return this;
  }

   /**
   * The market price for one share at the time of the transaction.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", required = true, value = "The market price for one share at the time of the transaction.")
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


  public InvestmentsInstrumentTransaction currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the transaction. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned. 
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BRL", required = true, value = "The currency of the transaction. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned. ")
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


  public InvestmentsInstrumentTransaction fees(Float fees) {
    
    this.fees = fees;
    return this;
  }

   /**
   * The total fees paid to conduct the transaction.
   * @return fees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "184.5", required = true, value = "The total fees paid to conduct the transaction.")
  @JsonProperty(JSON_PROPERTY_FEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getFees() {
    return fees;
  }


  @JsonProperty(JSON_PROPERTY_FEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFees(Float fees) {
    this.fees = fees;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentsInstrumentTransaction investmentsInstrumentTransaction = (InvestmentsInstrumentTransaction) o;
    return Objects.equals(this.id, investmentsInstrumentTransaction.id) &&
        Objects.equals(this.link, investmentsInstrumentTransaction.link) &&
        Objects.equals(this.collectedAt, investmentsInstrumentTransaction.collectedAt) &&
        Objects.equals(this.createdAt, investmentsInstrumentTransaction.createdAt) &&
        Objects.equals(this.portfolio, investmentsInstrumentTransaction.portfolio) &&
        Objects.equals(this.instrument, investmentsInstrumentTransaction.instrument) &&
        Objects.equals(this.settlementDate, investmentsInstrumentTransaction.settlementDate) &&
        Objects.equals(this.operationDate, investmentsInstrumentTransaction.operationDate) &&
        Objects.equals(this.description, investmentsInstrumentTransaction.description) &&
        Objects.equals(this.type, investmentsInstrumentTransaction.type) &&
        Objects.equals(this.quantity, investmentsInstrumentTransaction.quantity) &&
        Objects.equals(this.amount, investmentsInstrumentTransaction.amount) &&
        Objects.equals(this.price, investmentsInstrumentTransaction.price) &&
        Objects.equals(this.currency, investmentsInstrumentTransaction.currency) &&
        Objects.equals(this.fees, investmentsInstrumentTransaction.fees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, collectedAt, createdAt, portfolio, instrument, settlementDate, operationDate, description, type, quantity, amount, price, currency, fees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentsInstrumentTransaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
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

