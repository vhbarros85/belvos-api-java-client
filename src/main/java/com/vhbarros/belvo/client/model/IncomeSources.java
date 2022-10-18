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
import com.vhbarros.belvo.client.model.IncomeSourceTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A list of income sources for the account.  For each income source, we provide additional insights such as: - Frequency of the income transactions. - Key metrics about the transaction amounts.  ℹ️ If no income sources are found, we return an empty array. 
 */
@ApiModel(description = "A list of income sources for the account.  For each income source, we provide additional insights such as: - Frequency of the income transactions. - Key metrics about the transaction amounts.  ℹ️ If no income sources are found, we return an empty array. ")
@JsonPropertyOrder({
  IncomeSources.JSON_PROPERTY_TRANSACTIONS,
  IncomeSources.JSON_PROPERTY_CONFIDENCE,
  IncomeSources.JSON_PROPERTY_TYPE,
  IncomeSources.JSON_PROPERTY_FREQUENCY,
  IncomeSources.JSON_PROPERTY_STD_TRANSACTION_AMOUNT,
  IncomeSources.JSON_PROPERTY_AVERAGE_TRANSACTION_AMOUNT,
  IncomeSources.JSON_PROPERTY_MEDIAN_TRANSACTION_AMOUNT,
  IncomeSources.JSON_PROPERTY_MINIMUM_TRANSACTION_AMOUNT,
  IncomeSources.JSON_PROPERTY_MAXIMUM_TRANSACTION_AMOUNT,
  IncomeSources.JSON_PROPERTY_DAYS_SINCE_LAST_TRANSACTION,
  IncomeSources.JSON_PROPERTY_AVERAGE_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS,
  IncomeSources.JSON_PROPERTY_STD_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS,
  IncomeSources.JSON_PROPERTY_MEDIAN_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS,
  IncomeSources.JSON_PROPERTY_MINIMUM_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS,
  IncomeSources.JSON_PROPERTY_MAXIMUM_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class IncomeSources {
  public static final String JSON_PROPERTY_TRANSACTIONS = "transactions";
  private List<IncomeSourceTransaction> transactions = new ArrayList<>();

  /**
   * Belvo&#39;s level of confidence that the source is actually an income.  We return one of the following enum values:    - &#x60;HIGH&#x60;   - &#x60;MEDIUM&#x60; 
   */
  public enum ConfidenceEnum {
    HIGH("HIGH"),
    
    MEDIUM("MEDIUM");

    private String value;

    ConfidenceEnum(String value) {
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
    public static ConfidenceEnum fromValue(String value) {
      for (ConfidenceEnum b : ConfidenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONFIDENCE = "confidence";
  private ConfidenceEnum confidence;

  /**
   * The type of income.  We return one of the following enum values:    - &#x60;SALARY&#x60;   - &#x60;CASH_DEPOSIT&#x60;   - &#x60;PENSION&#x60;   - &#x60;UNKNOWN&#x60; 
   */
  public enum TypeEnum {
    SALARY("SALARY"),
    
    CASH_DEPOSIT("CASH_DEPOSIT"),
    
    PENSION("PENSION"),
    
    UNKNOWN("UNKNOWN");

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

  /**
   * How often the income transaction occurs.  We return one of the following enum values:    - &#x60;MONTHLY&#x60;   - &#x60;FORTNIGHTLY&#x60;   - &#x60;WEEKLY&#x60;   - &#x60;IRREGULAR&#x60; 
   */
  public enum FrequencyEnum {
    MONTHLY("MONTHLY"),
    
    FORTNIGHTLY("FORTNIGHTLY"),
    
    WEEKLY("WEEKLY"),
    
    IRREGULAR("IRREGULAR");

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
  private FrequencyEnum frequency;

  public static final String JSON_PROPERTY_STD_TRANSACTION_AMOUNT = "std_transaction_amount";
  private Float stdTransactionAmount;

  public static final String JSON_PROPERTY_AVERAGE_TRANSACTION_AMOUNT = "average_transaction_amount";
  private Float averageTransactionAmount;

  public static final String JSON_PROPERTY_MEDIAN_TRANSACTION_AMOUNT = "median_transaction_amount";
  private Float medianTransactionAmount;

  public static final String JSON_PROPERTY_MINIMUM_TRANSACTION_AMOUNT = "minimum_transaction_amount";
  private Float minimumTransactionAmount;

  public static final String JSON_PROPERTY_MAXIMUM_TRANSACTION_AMOUNT = "maximum_transaction_amount";
  private Float maximumTransactionAmount;

  public static final String JSON_PROPERTY_DAYS_SINCE_LAST_TRANSACTION = "days_since_last_transaction";
  private Integer daysSinceLastTransaction;

  public static final String JSON_PROPERTY_AVERAGE_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS = "average_days_between_consecutive_income_transactions";
  private Float averageDaysBetweenConsecutiveIncomeTransactions;

  public static final String JSON_PROPERTY_STD_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS = "std_days_between_consecutive_income_transactions";
  private Float stdDaysBetweenConsecutiveIncomeTransactions;

  public static final String JSON_PROPERTY_MEDIAN_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS = "median_days_between_consecutive_income_transactions";
  private Float medianDaysBetweenConsecutiveIncomeTransactions;

  public static final String JSON_PROPERTY_MINIMUM_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS = "minimum_days_between_consecutive_income_transactions";
  private Integer minimumDaysBetweenConsecutiveIncomeTransactions;

  public static final String JSON_PROPERTY_MAXIMUM_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS = "maximum_days_between_consecutive_income_transactions";
  private Integer maximumDaysBetweenConsecutiveIncomeTransactions;

  public IncomeSources() {
  }

  public IncomeSources transactions(List<IncomeSourceTransaction> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public IncomeSources addTransactionsItem(IncomeSourceTransaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * A list of supporting transactions for this income source.   ℹ️ If no income transactions are found, we return an empty array. 
   * @return transactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of supporting transactions for this income source.   ℹ️ If no income transactions are found, we return an empty array. ")
  @JsonProperty(JSON_PROPERTY_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<IncomeSourceTransaction> getTransactions() {
    return transactions;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactions(List<IncomeSourceTransaction> transactions) {
    this.transactions = transactions;
  }


  public IncomeSources confidence(ConfidenceEnum confidence) {
    
    this.confidence = confidence;
    return this;
  }

   /**
   * Belvo&#39;s level of confidence that the source is actually an income.  We return one of the following enum values:    - &#x60;HIGH&#x60;   - &#x60;MEDIUM&#x60; 
   * @return confidence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "HIGH", required = true, value = "Belvo's level of confidence that the source is actually an income.  We return one of the following enum values:    - `HIGH`   - `MEDIUM` ")
  @JsonProperty(JSON_PROPERTY_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConfidenceEnum getConfidence() {
    return confidence;
  }


  @JsonProperty(JSON_PROPERTY_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfidence(ConfidenceEnum confidence) {
    this.confidence = confidence;
  }


  public IncomeSources type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of income.  We return one of the following enum values:    - &#x60;SALARY&#x60;   - &#x60;CASH_DEPOSIT&#x60;   - &#x60;PENSION&#x60;   - &#x60;UNKNOWN&#x60; 
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SALARY", required = true, value = "The type of income.  We return one of the following enum values:    - `SALARY`   - `CASH_DEPOSIT`   - `PENSION`   - `UNKNOWN` ")
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


  public IncomeSources frequency(FrequencyEnum frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * How often the income transaction occurs.  We return one of the following enum values:    - &#x60;MONTHLY&#x60;   - &#x60;FORTNIGHTLY&#x60;   - &#x60;WEEKLY&#x60;   - &#x60;IRREGULAR&#x60; 
   * @return frequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MONTHLY", required = true, value = "How often the income transaction occurs.  We return one of the following enum values:    - `MONTHLY`   - `FORTNIGHTLY`   - `WEEKLY`   - `IRREGULAR` ")
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


  public IncomeSources stdTransactionAmount(Float stdTransactionAmount) {
    
    this.stdTransactionAmount = stdTransactionAmount;
    return this;
  }

   /**
   * The standard deviation of the income transaction.
   * @return stdTransactionAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1040.83", required = true, value = "The standard deviation of the income transaction.")
  @JsonProperty(JSON_PROPERTY_STD_TRANSACTION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getStdTransactionAmount() {
    return stdTransactionAmount;
  }


  @JsonProperty(JSON_PROPERTY_STD_TRANSACTION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStdTransactionAmount(Float stdTransactionAmount) {
    this.stdTransactionAmount = stdTransactionAmount;
  }


  public IncomeSources averageTransactionAmount(Float averageTransactionAmount) {
    
    this.averageTransactionAmount = averageTransactionAmount;
    return this;
  }

   /**
   * The average income transaction amount.
   * @return averageTransactionAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "31166.66", required = true, value = "The average income transaction amount.")
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


  public IncomeSources medianTransactionAmount(Float medianTransactionAmount) {
    
    this.medianTransactionAmount = medianTransactionAmount;
    return this;
  }

   /**
   * The median income transaction amount.
   * @return medianTransactionAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "31500", required = true, value = "The median income transaction amount.")
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


  public IncomeSources minimumTransactionAmount(Float minimumTransactionAmount) {
    
    this.minimumTransactionAmount = minimumTransactionAmount;
    return this;
  }

   /**
   * The minimum income transaction amount.
   * @return minimumTransactionAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "30000", required = true, value = "The minimum income transaction amount.")
  @JsonProperty(JSON_PROPERTY_MINIMUM_TRANSACTION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getMinimumTransactionAmount() {
    return minimumTransactionAmount;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_TRANSACTION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinimumTransactionAmount(Float minimumTransactionAmount) {
    this.minimumTransactionAmount = minimumTransactionAmount;
  }


  public IncomeSources maximumTransactionAmount(Float maximumTransactionAmount) {
    
    this.maximumTransactionAmount = maximumTransactionAmount;
    return this;
  }

   /**
   * The maximum income transaction amount.
   * @return maximumTransactionAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "32000", required = true, value = "The maximum income transaction amount.")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_TRANSACTION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getMaximumTransactionAmount() {
    return maximumTransactionAmount;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_TRANSACTION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaximumTransactionAmount(Float maximumTransactionAmount) {
    this.maximumTransactionAmount = maximumTransactionAmount;
  }


  public IncomeSources daysSinceLastTransaction(Integer daysSinceLastTransaction) {
    
    this.daysSinceLastTransaction = daysSinceLastTransaction;
    return this;
  }

   /**
   * The number of days since the last income transaction.
   * @return daysSinceLastTransaction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6", required = true, value = "The number of days since the last income transaction.")
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


  public IncomeSources averageDaysBetweenConsecutiveIncomeTransactions(Float averageDaysBetweenConsecutiveIncomeTransactions) {
    
    this.averageDaysBetweenConsecutiveIncomeTransactions = averageDaysBetweenConsecutiveIncomeTransactions;
    return this;
  }

   /**
   * The average number of days between consecutive income transactions.
   * @return averageDaysBetweenConsecutiveIncomeTransactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "30.5", required = true, value = "The average number of days between consecutive income transactions.")
  @JsonProperty(JSON_PROPERTY_AVERAGE_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getAverageDaysBetweenConsecutiveIncomeTransactions() {
    return averageDaysBetweenConsecutiveIncomeTransactions;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAverageDaysBetweenConsecutiveIncomeTransactions(Float averageDaysBetweenConsecutiveIncomeTransactions) {
    this.averageDaysBetweenConsecutiveIncomeTransactions = averageDaysBetweenConsecutiveIncomeTransactions;
  }


  public IncomeSources stdDaysBetweenConsecutiveIncomeTransactions(Float stdDaysBetweenConsecutiveIncomeTransactions) {
    
    this.stdDaysBetweenConsecutiveIncomeTransactions = stdDaysBetweenConsecutiveIncomeTransactions;
    return this;
  }

   /**
   * The standard deviation of days between consecutive income transactions.
   * @return stdDaysBetweenConsecutiveIncomeTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.12", required = true, value = "The standard deviation of days between consecutive income transactions.")
  @JsonProperty(JSON_PROPERTY_STD_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getStdDaysBetweenConsecutiveIncomeTransactions() {
    return stdDaysBetweenConsecutiveIncomeTransactions;
  }


  @JsonProperty(JSON_PROPERTY_STD_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStdDaysBetweenConsecutiveIncomeTransactions(Float stdDaysBetweenConsecutiveIncomeTransactions) {
    this.stdDaysBetweenConsecutiveIncomeTransactions = stdDaysBetweenConsecutiveIncomeTransactions;
  }


  public IncomeSources medianDaysBetweenConsecutiveIncomeTransactions(Float medianDaysBetweenConsecutiveIncomeTransactions) {
    
    this.medianDaysBetweenConsecutiveIncomeTransactions = medianDaysBetweenConsecutiveIncomeTransactions;
    return this;
  }

   /**
   * The median number of days between consecutive income transactions.
   * @return medianDaysBetweenConsecutiveIncomeTransactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "30.5", required = true, value = "The median number of days between consecutive income transactions.")
  @JsonProperty(JSON_PROPERTY_MEDIAN_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getMedianDaysBetweenConsecutiveIncomeTransactions() {
    return medianDaysBetweenConsecutiveIncomeTransactions;
  }


  @JsonProperty(JSON_PROPERTY_MEDIAN_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMedianDaysBetweenConsecutiveIncomeTransactions(Float medianDaysBetweenConsecutiveIncomeTransactions) {
    this.medianDaysBetweenConsecutiveIncomeTransactions = medianDaysBetweenConsecutiveIncomeTransactions;
  }


  public IncomeSources minimumDaysBetweenConsecutiveIncomeTransactions(Integer minimumDaysBetweenConsecutiveIncomeTransactions) {
    
    this.minimumDaysBetweenConsecutiveIncomeTransactions = minimumDaysBetweenConsecutiveIncomeTransactions;
    return this;
  }

   /**
   * The minimum number of days between consecutive income transactions.
   * @return minimumDaysBetweenConsecutiveIncomeTransactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "29", required = true, value = "The minimum number of days between consecutive income transactions.")
  @JsonProperty(JSON_PROPERTY_MINIMUM_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMinimumDaysBetweenConsecutiveIncomeTransactions() {
    return minimumDaysBetweenConsecutiveIncomeTransactions;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinimumDaysBetweenConsecutiveIncomeTransactions(Integer minimumDaysBetweenConsecutiveIncomeTransactions) {
    this.minimumDaysBetweenConsecutiveIncomeTransactions = minimumDaysBetweenConsecutiveIncomeTransactions;
  }


  public IncomeSources maximumDaysBetweenConsecutiveIncomeTransactions(Integer maximumDaysBetweenConsecutiveIncomeTransactions) {
    
    this.maximumDaysBetweenConsecutiveIncomeTransactions = maximumDaysBetweenConsecutiveIncomeTransactions;
    return this;
  }

   /**
   * The maximum number of days between consecutive income transactions.
   * @return maximumDaysBetweenConsecutiveIncomeTransactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "32", required = true, value = "The maximum number of days between consecutive income transactions.")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMaximumDaysBetweenConsecutiveIncomeTransactions() {
    return maximumDaysBetweenConsecutiveIncomeTransactions;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_DAYS_BETWEEN_CONSECUTIVE_INCOME_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaximumDaysBetweenConsecutiveIncomeTransactions(Integer maximumDaysBetweenConsecutiveIncomeTransactions) {
    this.maximumDaysBetweenConsecutiveIncomeTransactions = maximumDaysBetweenConsecutiveIncomeTransactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeSources incomeSources = (IncomeSources) o;
    return Objects.equals(this.transactions, incomeSources.transactions) &&
        Objects.equals(this.confidence, incomeSources.confidence) &&
        Objects.equals(this.type, incomeSources.type) &&
        Objects.equals(this.frequency, incomeSources.frequency) &&
        Objects.equals(this.stdTransactionAmount, incomeSources.stdTransactionAmount) &&
        Objects.equals(this.averageTransactionAmount, incomeSources.averageTransactionAmount) &&
        Objects.equals(this.medianTransactionAmount, incomeSources.medianTransactionAmount) &&
        Objects.equals(this.minimumTransactionAmount, incomeSources.minimumTransactionAmount) &&
        Objects.equals(this.maximumTransactionAmount, incomeSources.maximumTransactionAmount) &&
        Objects.equals(this.daysSinceLastTransaction, incomeSources.daysSinceLastTransaction) &&
        Objects.equals(this.averageDaysBetweenConsecutiveIncomeTransactions, incomeSources.averageDaysBetweenConsecutiveIncomeTransactions) &&
        Objects.equals(this.stdDaysBetweenConsecutiveIncomeTransactions, incomeSources.stdDaysBetweenConsecutiveIncomeTransactions) &&
        Objects.equals(this.medianDaysBetweenConsecutiveIncomeTransactions, incomeSources.medianDaysBetweenConsecutiveIncomeTransactions) &&
        Objects.equals(this.minimumDaysBetweenConsecutiveIncomeTransactions, incomeSources.minimumDaysBetweenConsecutiveIncomeTransactions) &&
        Objects.equals(this.maximumDaysBetweenConsecutiveIncomeTransactions, incomeSources.maximumDaysBetweenConsecutiveIncomeTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions, confidence, type, frequency, stdTransactionAmount, averageTransactionAmount, medianTransactionAmount, minimumTransactionAmount, maximumTransactionAmount, daysSinceLastTransaction, averageDaysBetweenConsecutiveIncomeTransactions, stdDaysBetweenConsecutiveIncomeTransactions, medianDaysBetweenConsecutiveIncomeTransactions, minimumDaysBetweenConsecutiveIncomeTransactions, maximumDaysBetweenConsecutiveIncomeTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeSources {\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    stdTransactionAmount: ").append(toIndentedString(stdTransactionAmount)).append("\n");
    sb.append("    averageTransactionAmount: ").append(toIndentedString(averageTransactionAmount)).append("\n");
    sb.append("    medianTransactionAmount: ").append(toIndentedString(medianTransactionAmount)).append("\n");
    sb.append("    minimumTransactionAmount: ").append(toIndentedString(minimumTransactionAmount)).append("\n");
    sb.append("    maximumTransactionAmount: ").append(toIndentedString(maximumTransactionAmount)).append("\n");
    sb.append("    daysSinceLastTransaction: ").append(toIndentedString(daysSinceLastTransaction)).append("\n");
    sb.append("    averageDaysBetweenConsecutiveIncomeTransactions: ").append(toIndentedString(averageDaysBetweenConsecutiveIncomeTransactions)).append("\n");
    sb.append("    stdDaysBetweenConsecutiveIncomeTransactions: ").append(toIndentedString(stdDaysBetweenConsecutiveIncomeTransactions)).append("\n");
    sb.append("    medianDaysBetweenConsecutiveIncomeTransactions: ").append(toIndentedString(medianDaysBetweenConsecutiveIncomeTransactions)).append("\n");
    sb.append("    minimumDaysBetweenConsecutiveIncomeTransactions: ").append(toIndentedString(minimumDaysBetweenConsecutiveIncomeTransactions)).append("\n");
    sb.append("    maximumDaysBetweenConsecutiveIncomeTransactions: ").append(toIndentedString(maximumDaysBetweenConsecutiveIncomeTransactions)).append("\n");
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

