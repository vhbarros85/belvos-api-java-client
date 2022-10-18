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
import com.vhbarros.belvo.client.model.RecurringExpenseSourceTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Recurring expense insights.   ℹ️ If no recurring expense insights are found, we return an empty array. 
 */
@ApiModel(description = "Recurring expense insights.   ℹ️ If no recurring expense insights are found, we return an empty array. ")
@JsonPropertyOrder({
  RecurringExpenses.JSON_PROPERTY_ID,
  RecurringExpenses.JSON_PROPERTY_ACCOUNT,
  RecurringExpenses.JSON_PROPERTY_NAME,
  RecurringExpenses.JSON_PROPERTY_TRANSACTIONS,
  RecurringExpenses.JSON_PROPERTY_FREQUENCY,
  RecurringExpenses.JSON_PROPERTY_AVERAGE_TRANSACTION_AMOUNT,
  RecurringExpenses.JSON_PROPERTY_MEDIAN_TRANSACTION_AMOUNT,
  RecurringExpenses.JSON_PROPERTY_DAYS_SINCE_LAST_TRANSACTION,
  RecurringExpenses.JSON_PROPERTY_CATEGORY,
  RecurringExpenses.JSON_PROPERTY_PAYMENT_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class RecurringExpenses {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private Account account;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TRANSACTIONS = "transactions";
  private List<RecurringExpenseSourceTransaction> transactions = new ArrayList<>();

  /**
   * The frequency at which this recurring expense occurs. ℹ️ **Note:** As part of the BETA, Belvo only identifies &#x60;MONTHLY&#x60; frequencies. 
   */
  public enum FrequencyEnum {
    MONTHLY("MONTHLY");

    private String value;

    FrequencyEnum(String value) {
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
    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private FrequencyEnum frequency = FrequencyEnum.MONTHLY;

  public static final String JSON_PROPERTY_AVERAGE_TRANSACTION_AMOUNT = "average_transaction_amount";
  private Float averageTransactionAmount;

  public static final String JSON_PROPERTY_MEDIAN_TRANSACTION_AMOUNT = "median_transaction_amount";
  private Float medianTransactionAmount;

  public static final String JSON_PROPERTY_DAYS_SINCE_LAST_TRANSACTION = "days_since_last_transaction";
  private Integer daysSinceLastTransaction;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  /**
   * The type of recurring expense. As part of the BETA, Belvo only returns &#x60;SUBSCRIPTION&#x60; payment types. 
   */
  public enum PaymentTypeEnum {
    SUBSCRIPTION("SUBSCRIPTION");

    private String value;

    PaymentTypeEnum(String value) {
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
    public static PaymentTypeEnum fromValue(String value) {
      for (PaymentTypeEnum b : PaymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_PAYMENT_TYPE = "payment_type";
  private PaymentTypeEnum paymentType = PaymentTypeEnum.SUBSCRIPTION;

  public RecurringExpenses() {
  }

  public RecurringExpenses id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique identifier used to reference the current recurring expense.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "076c66e5-90f5-4e01-99c7-50e32f65ae42", value = "Belvo's unique identifier used to reference the current recurring expense.")
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


  public RecurringExpenses account(Account account) {
    
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


  public RecurringExpenses name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name for the recurring expense.  ℹ️ **Note**: This information is taken from the description section of a transaction and then normalized to provide you with an easy-to-read name. As such, sometimes the name will reflect the merchant the payment is made to (for example, Netflix.com), while for other recurring expenses, this could be something like \&quot;Monthly payment to John\&quot;. 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Netflix", required = true, value = "The name for the recurring expense.  ℹ️ **Note**: This information is taken from the description section of a transaction and then normalized to provide you with an easy-to-read name. As such, sometimes the name will reflect the merchant the payment is made to (for example, Netflix.com), while for other recurring expenses, this could be something like \"Monthly payment to John\". ")
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


  public RecurringExpenses transactions(List<RecurringExpenseSourceTransaction> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public RecurringExpenses addTransactionsItem(RecurringExpenseSourceTransaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * An array of minified transaction objects used to evaluate the recurring expense. If no transactions were found, we return an empty array.
   * @return transactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of minified transaction objects used to evaluate the recurring expense. If no transactions were found, we return an empty array.")
  @JsonProperty(JSON_PROPERTY_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RecurringExpenseSourceTransaction> getTransactions() {
    return transactions;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactions(List<RecurringExpenseSourceTransaction> transactions) {
    this.transactions = transactions;
  }


  public RecurringExpenses frequency(FrequencyEnum frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * The frequency at which this recurring expense occurs. ℹ️ **Note:** As part of the BETA, Belvo only identifies &#x60;MONTHLY&#x60; frequencies. 
   * @return frequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MONTHLY", required = true, value = "The frequency at which this recurring expense occurs. ℹ️ **Note:** As part of the BETA, Belvo only identifies `MONTHLY` frequencies. ")
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FrequencyEnum getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public RecurringExpenses averageTransactionAmount(Float averageTransactionAmount) {
    
    this.averageTransactionAmount = averageTransactionAmount;
    return this;
  }

   /**
   * The average transaction amount of the recurring expense.
   * @return averageTransactionAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "32.9", required = true, value = "The average transaction amount of the recurring expense.")
  @JsonProperty(JSON_PROPERTY_AVERAGE_TRANSACTION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getAverageTransactionAmount() {
    return averageTransactionAmount;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_TRANSACTION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAverageTransactionAmount(Float averageTransactionAmount) {
    this.averageTransactionAmount = averageTransactionAmount;
  }


  public RecurringExpenses medianTransactionAmount(Float medianTransactionAmount) {
    
    this.medianTransactionAmount = medianTransactionAmount;
    return this;
  }

   /**
   * The median transaction amount of the recurring expense.
   * @return medianTransactionAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "32.9", required = true, value = "The median transaction amount of the recurring expense.")
  @JsonProperty(JSON_PROPERTY_MEDIAN_TRANSACTION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getMedianTransactionAmount() {
    return medianTransactionAmount;
  }


  @JsonProperty(JSON_PROPERTY_MEDIAN_TRANSACTION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMedianTransactionAmount(Float medianTransactionAmount) {
    this.medianTransactionAmount = medianTransactionAmount;
  }


  public RecurringExpenses daysSinceLastTransaction(Integer daysSinceLastTransaction) {
    
    this.daysSinceLastTransaction = daysSinceLastTransaction;
    return this;
  }

   /**
   * Number of days since the last recurring expense occurred.  Based on the frequency, you can infer how many days until the next charge will occur. 
   * @return daysSinceLastTransaction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "Number of days since the last recurring expense occurred.  Based on the frequency, you can infer how many days until the next charge will occur. ")
  @JsonProperty(JSON_PROPERTY_DAYS_SINCE_LAST_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDaysSinceLastTransaction() {
    return daysSinceLastTransaction;
  }


  @JsonProperty(JSON_PROPERTY_DAYS_SINCE_LAST_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDaysSinceLastTransaction(Integer daysSinceLastTransaction) {
    this.daysSinceLastTransaction = daysSinceLastTransaction;
  }


  public RecurringExpenses category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The transaction category for the recurring expense. For more information on the available categories, please see our [Transaction categorization documentation](https://developers.belvo.com/docs/banking#transaction-categorization). ℹ️ **Note:** As part of the BETA - the most common categories that will be returned are: - &#x60;Online Platforms &amp; Leisure&#x60; (Netflix, Spotify, Gym Memberships) - &#x60;Bills &amp; Utilities&#x60; (electricity, telephone, internet) 
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Online Platforms & Leisure", required = true, value = "The transaction category for the recurring expense. For more information on the available categories, please see our [Transaction categorization documentation](https://developers.belvo.com/docs/banking#transaction-categorization). ℹ️ **Note:** As part of the BETA - the most common categories that will be returned are: - `Online Platforms & Leisure` (Netflix, Spotify, Gym Memberships) - `Bills & Utilities` (electricity, telephone, internet) ")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCategory(String category) {
    this.category = category;
  }


  public RecurringExpenses paymentType(PaymentTypeEnum paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * The type of recurring expense. As part of the BETA, Belvo only returns &#x60;SUBSCRIPTION&#x60; payment types. 
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUBSCRIPTION", required = true, value = "The type of recurring expense. As part of the BETA, Belvo only returns `SUBSCRIPTION` payment types. ")
  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringExpenses recurringExpenses = (RecurringExpenses) o;
    return Objects.equals(this.id, recurringExpenses.id) &&
        Objects.equals(this.account, recurringExpenses.account) &&
        Objects.equals(this.name, recurringExpenses.name) &&
        Objects.equals(this.transactions, recurringExpenses.transactions) &&
        Objects.equals(this.frequency, recurringExpenses.frequency) &&
        Objects.equals(this.averageTransactionAmount, recurringExpenses.averageTransactionAmount) &&
        Objects.equals(this.medianTransactionAmount, recurringExpenses.medianTransactionAmount) &&
        Objects.equals(this.daysSinceLastTransaction, recurringExpenses.daysSinceLastTransaction) &&
        Objects.equals(this.category, recurringExpenses.category) &&
        Objects.equals(this.paymentType, recurringExpenses.paymentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, account, name, transactions, frequency, averageTransactionAmount, medianTransactionAmount, daysSinceLastTransaction, category, paymentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringExpenses {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    averageTransactionAmount: ").append(toIndentedString(averageTransactionAmount)).append("\n");
    sb.append("    medianTransactionAmount: ").append(toIndentedString(medianTransactionAmount)).append("\n");
    sb.append("    daysSinceLastTransaction: ").append(toIndentedString(daysSinceLastTransaction)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
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

