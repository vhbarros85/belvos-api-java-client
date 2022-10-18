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
import com.vhbarros.belvo.client.model.Account;
import com.vhbarros.belvo.client.model.TransactionCreditCardData;
import com.vhbarros.belvo.client.model.TransactionGigData;
import com.vhbarros.belvo.client.model.TransactionMerchantData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Transaction
 */
@JsonPropertyOrder({
  Transaction.JSON_PROPERTY_ID,
  Transaction.JSON_PROPERTY_ACCOUNT,
  Transaction.JSON_PROPERTY_COLLECTED_AT,
  Transaction.JSON_PROPERTY_CREATED_AT,
  Transaction.JSON_PROPERTY_VALUE_DATE,
  Transaction.JSON_PROPERTY_ACCOUNTING_DATE,
  Transaction.JSON_PROPERTY_AMOUNT,
  Transaction.JSON_PROPERTY_BALANCE,
  Transaction.JSON_PROPERTY_CURRENCY,
  Transaction.JSON_PROPERTY_DESCRIPTION,
  Transaction.JSON_PROPERTY_OBSERVATIONS,
  Transaction.JSON_PROPERTY_MERCHANT,
  Transaction.JSON_PROPERTY_CATEGORY,
  Transaction.JSON_PROPERTY_REFERENCE,
  Transaction.JSON_PROPERTY_TYPE,
  Transaction.JSON_PROPERTY_STATUS,
  Transaction.JSON_PROPERTY_GIG_DATA,
  Transaction.JSON_PROPERTY_CREDIT_CARD_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class Transaction {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private Account account;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private OffsetDateTime collectedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_VALUE_DATE = "value_date";
  private LocalDate valueDate;

  public static final String JSON_PROPERTY_ACCOUNTING_DATE = "accounting_date";
  private LocalDate accountingDate;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Float amount;

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private Float balance;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_OBSERVATIONS = "observations";
  private String observations;

  public static final String JSON_PROPERTY_MERCHANT = "merchant";
  private JsonNullable<TransactionMerchantData> merchant = JsonNullable.<TransactionMerchantData>undefined();

  /**
   * The name of the category to which this transaction belongs.  &gt; **Get transaction categorization** We can clean and categorize transactions for you as part of our [Transaction categorization](https://developers.belvo.com/docs/banking#transaction-categorization) product, turning raw data into actionable insights. To enable this product, just email our sales team at sales@belvo.com, and they&#39;ll get right to it.  We return one of the following enum values:    - &#x60;Deposits&#x60;   - &#x60;Home &amp; Life&#x60;   - &#x60;Food &amp; Groceries&#x60;   - &#x60;Online Platforms &amp; Leisure&#x60;   - &#x60;Transport &amp; Travel&#x60;   - &#x60;Personal Shopping&#x60;   - &#x60;Taxes&#x60;   - &#x60;Withdrawal &amp; ATM&#x60;   - &#x60;Credits &amp; Loans&#x60;   - &#x60;Bills &amp; Utilities&#x60;   - &#x60;Investments &amp; Savings&#x60;   - &#x60;Fees &amp; Charges&#x60;   - &#x60;Income &amp; Payments&#x60;   - &#x60;Transfers&#x60; 
   */
  public enum CategoryEnum {
    DEPOSITS("Deposits"),
    
    HOME_LIFE("Home & Life"),
    
    FOOD_GROCERIES("Food & Groceries"),
    
    ONLINE_PLATFORMS_LEISURE("Online Platforms & Leisure"),
    
    TRANSPORT_TRAVEL("Transport & Travel"),
    
    PERSONAL_SHOPPING("Personal Shopping"),
    
    TAXES("Taxes"),
    
    WITHDRAWAL_ATM("Withdrawal & ATM"),
    
    CREDITS_LOANS("Credits & Loans"),
    
    BILLS_UTILITIES("Bills & Utilities"),
    
    INVESTMENTS_SAVINGS("Investments & Savings"),
    
    FEES_CHARGES("Fees & Charges"),
    
    INCOME_PAYMENTS("Income & Payments"),
    
    TRANSFERS("Transfers"),
    
    NULL("null");

    private String value;

    CategoryEnum(String value) {
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
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private JsonNullable<CategoryEnum> category = JsonNullable.<CategoryEnum>undefined();

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  /**
   * The direction of the transaction: - &#x60;INFLOW&#x60; indicates money coming into the account. - &#x60;OUTFLOW&#x60; indicates money going out of the account. 
   */
  public enum TypeEnum {
    OUTFLOW("OUTFLOW"),
    
    INFLOW("INFLOW"),
    
    NULL("null");

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
      return null;
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  /**
   * The status of the transaction.  We return one of the following enum values:    - &#x60;PENDING&#x60;   - &#x60;PROCESSED&#x60;   - &#x60;UNCATEGORIZED&#x60; 
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    PROCESSED("PROCESSED"),
    
    UNCATEGORIZED("UNCATEGORIZED"),
    
    NULL("null");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_GIG_DATA = "gig_data";
  private JsonNullable<TransactionGigData> gigData = JsonNullable.<TransactionGigData>undefined();

  public static final String JSON_PROPERTY_CREDIT_CARD_DATA = "credit_card_data";
  private JsonNullable<TransactionCreditCardData> creditCardData = JsonNullable.<TransactionCreditCardData>undefined();

  public Transaction() {
  }

  public Transaction id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique ID for the transaction.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "076c66e5-90f5-4e01-99c7-50e32f65ae42", value = "Belvo's unique ID for the transaction.")
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


  public Transaction account(Account account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Account getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccount(Account account) {
    this.account = account;
  }


  public Transaction collectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-11-28T10:27:44.813Z", required = true, value = "The ISO-8601 timestamp when the data point was collected.")
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


  public Transaction createdAt(OffsetDateTime createdAt) {
    
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


  public Transaction valueDate(LocalDate valueDate) {
    
    this.valueDate = valueDate;
    return this;
  }

   /**
   * The date when the transaction occurred, in &#x60;YYYY-MM-DD&#x60; format.
   * @return valueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Oct 23 00:00:00 UTC 2019", required = true, value = "The date when the transaction occurred, in `YYYY-MM-DD` format.")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getValueDate() {
    return valueDate;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
  }


  public Transaction accountingDate(LocalDate accountingDate) {
    
    this.accountingDate = accountingDate;
    return this;
  }

   /**
   * The date when the transaction was processed and accounted for by the institution.
   * @return accountingDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Oct 23 00:00:00 UTC 2019", required = true, value = "The date when the transaction was processed and accounted for by the institution.")
  @JsonProperty(JSON_PROPERTY_ACCOUNTING_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getAccountingDate() {
    return accountingDate;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNTING_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountingDate(LocalDate accountingDate) {
    this.accountingDate = accountingDate;
  }


  public Transaction amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The transaction amount. ℹ️ The amount displayed is always positive as we indicate the direction of the transaction in the &#x60;type&#x60; parameter. 
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2145.45", required = true, value = "The transaction amount. ℹ️ The amount displayed is always positive as we indicate the direction of the transaction in the `type` parameter. ")
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


  public Transaction balance(Float balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * The balance at the end of the transaction.
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "16907.96", required = true, value = "The balance at the end of the transaction.")
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getBalance() {
    return balance;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalance(Float balance) {
    this.balance = balance;
  }


  public Transaction currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the transaction. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned.
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MXN", required = true, value = "The currency of the transaction. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned.")
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


  public Transaction description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of transaction provided by the institution. Usually this is the text that the end user sees in the online platform.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SEVEN BUDDHAS RFC:XXXXXXXXXX", required = true, value = "The description of transaction provided by the institution. Usually this is the text that the end user sees in the online platform.")
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


  public Transaction observations(String observations) {
    
    this.observations = observations;
    return this;
  }

   /**
   * Additional observations provided by the institution on the transaction.
   * @return observations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OPTIONAL OBSERVATIONS", required = true, value = "Additional observations provided by the institution on the transaction.")
  @JsonProperty(JSON_PROPERTY_OBSERVATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getObservations() {
    return observations;
  }


  @JsonProperty(JSON_PROPERTY_OBSERVATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObservations(String observations) {
    this.observations = observations;
  }


  public Transaction merchant(TransactionMerchantData merchant) {
    this.merchant = JsonNullable.<TransactionMerchantData>of(merchant);
    
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public TransactionMerchantData getMerchant() {
        return merchant.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<TransactionMerchantData> getMerchant_JsonNullable() {
    return merchant;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT)
  public void setMerchant_JsonNullable(JsonNullable<TransactionMerchantData> merchant) {
    this.merchant = merchant;
  }

  public void setMerchant(TransactionMerchantData merchant) {
    this.merchant = JsonNullable.<TransactionMerchantData>of(merchant);
  }


  public Transaction category(CategoryEnum category) {
    this.category = JsonNullable.<CategoryEnum>of(category);
    
    return this;
  }

   /**
   * The name of the category to which this transaction belongs.  &gt; **Get transaction categorization** We can clean and categorize transactions for you as part of our [Transaction categorization](https://developers.belvo.com/docs/banking#transaction-categorization) product, turning raw data into actionable insights. To enable this product, just email our sales team at sales@belvo.com, and they&#39;ll get right to it.  We return one of the following enum values:    - &#x60;Deposits&#x60;   - &#x60;Home &amp; Life&#x60;   - &#x60;Food &amp; Groceries&#x60;   - &#x60;Online Platforms &amp; Leisure&#x60;   - &#x60;Transport &amp; Travel&#x60;   - &#x60;Personal Shopping&#x60;   - &#x60;Taxes&#x60;   - &#x60;Withdrawal &amp; ATM&#x60;   - &#x60;Credits &amp; Loans&#x60;   - &#x60;Bills &amp; Utilities&#x60;   - &#x60;Investments &amp; Savings&#x60;   - &#x60;Fees &amp; Charges&#x60;   - &#x60;Income &amp; Payments&#x60;   - &#x60;Transfers&#x60; 
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Food & Groceries", value = "The name of the category to which this transaction belongs.  > **Get transaction categorization** We can clean and categorize transactions for you as part of our [Transaction categorization](https://developers.belvo.com/docs/banking#transaction-categorization) product, turning raw data into actionable insights. To enable this product, just email our sales team at sales@belvo.com, and they'll get right to it.  We return one of the following enum values:    - `Deposits`   - `Home & Life`   - `Food & Groceries`   - `Online Platforms & Leisure`   - `Transport & Travel`   - `Personal Shopping`   - `Taxes`   - `Withdrawal & ATM`   - `Credits & Loans`   - `Bills & Utilities`   - `Investments & Savings`   - `Fees & Charges`   - `Income & Payments`   - `Transfers` ")
  @JsonIgnore

  public CategoryEnum getCategory() {
        return category.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CategoryEnum> getCategory_JsonNullable() {
    return category;
  }
  
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  public void setCategory_JsonNullable(JsonNullable<CategoryEnum> category) {
    this.category = category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = JsonNullable.<CategoryEnum>of(category);
  }


  public Transaction reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * The reference number of the transaction, provided by the bank.
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8703", required = true, value = "The reference number of the transaction, provided by the bank.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public Transaction type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The direction of the transaction: - &#x60;INFLOW&#x60; indicates money coming into the account. - &#x60;OUTFLOW&#x60; indicates money going out of the account. 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The direction of the transaction: - `INFLOW` indicates money coming into the account. - `OUTFLOW` indicates money going out of the account. ")
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


  public Transaction status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the transaction.  We return one of the following enum values:    - &#x60;PENDING&#x60;   - &#x60;PROCESSED&#x60;   - &#x60;UNCATEGORIZED&#x60; 
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The status of the transaction.  We return one of the following enum values:    - `PENDING`   - `PROCESSED`   - `UNCATEGORIZED` ")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Transaction gigData(TransactionGigData gigData) {
    this.gigData = JsonNullable.<TransactionGigData>of(gigData);
    
    return this;
  }

   /**
   * Get gigData
   * @return gigData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public TransactionGigData getGigData() {
        return gigData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GIG_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<TransactionGigData> getGigData_JsonNullable() {
    return gigData;
  }
  
  @JsonProperty(JSON_PROPERTY_GIG_DATA)
  public void setGigData_JsonNullable(JsonNullable<TransactionGigData> gigData) {
    this.gigData = gigData;
  }

  public void setGigData(TransactionGigData gigData) {
    this.gigData = JsonNullable.<TransactionGigData>of(gigData);
  }


  public Transaction creditCardData(TransactionCreditCardData creditCardData) {
    this.creditCardData = JsonNullable.<TransactionCreditCardData>of(creditCardData);
    
    return this;
  }

   /**
   * Get creditCardData
   * @return creditCardData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public TransactionCreditCardData getCreditCardData() {
        return creditCardData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREDIT_CARD_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<TransactionCreditCardData> getCreditCardData_JsonNullable() {
    return creditCardData;
  }
  
  @JsonProperty(JSON_PROPERTY_CREDIT_CARD_DATA)
  public void setCreditCardData_JsonNullable(JsonNullable<TransactionCreditCardData> creditCardData) {
    this.creditCardData = creditCardData;
  }

  public void setCreditCardData(TransactionCreditCardData creditCardData) {
    this.creditCardData = JsonNullable.<TransactionCreditCardData>of(creditCardData);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.account, transaction.account) &&
        Objects.equals(this.collectedAt, transaction.collectedAt) &&
        Objects.equals(this.createdAt, transaction.createdAt) &&
        Objects.equals(this.valueDate, transaction.valueDate) &&
        Objects.equals(this.accountingDate, transaction.accountingDate) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.balance, transaction.balance) &&
        Objects.equals(this.currency, transaction.currency) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.observations, transaction.observations) &&
        equalsNullable(this.merchant, transaction.merchant) &&
        equalsNullable(this.category, transaction.category) &&
        Objects.equals(this.reference, transaction.reference) &&
        Objects.equals(this.type, transaction.type) &&
        Objects.equals(this.status, transaction.status) &&
        equalsNullable(this.gigData, transaction.gigData) &&
        equalsNullable(this.creditCardData, transaction.creditCardData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, account, collectedAt, createdAt, valueDate, accountingDate, amount, balance, currency, description, observations, hashCodeNullable(merchant), hashCodeNullable(category), reference, type, status, hashCodeNullable(gigData), hashCodeNullable(creditCardData));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    accountingDate: ").append(toIndentedString(accountingDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    gigData: ").append(toIndentedString(gigData)).append("\n");
    sb.append("    creditCardData: ").append(toIndentedString(creditCardData)).append("\n");
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

