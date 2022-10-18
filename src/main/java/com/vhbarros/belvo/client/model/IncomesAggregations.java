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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A list of aggregated data for the incomes.   ℹ️ If not income information can be found, we return an empty array. 
 */
@ApiModel(description = "A list of aggregated data for the incomes.   ℹ️ If not income information can be found, we return an empty array. ")
@JsonPropertyOrder({
  IncomesAggregations.JSON_PROPERTY_PERIOD_UNIT,
  IncomesAggregations.JSON_PROPERTY_TYPE,
  IncomesAggregations.JSON_PROPERTY_MINIMUM_CONFIDENCE,
  IncomesAggregations.JSON_PROPERTY_LOOKBACK_PERIODS,
  IncomesAggregations.JSON_PROPERTY_FULL_PERIODS,
  IncomesAggregations.JSON_PROPERTY_PERIODS_WITH_INCOME,
  IncomesAggregations.JSON_PROPERTY_TOTAL_NUMBER_OF_SOURCES,
  IncomesAggregations.JSON_PROPERTY_STD_INCOME_PER_PERIOD,
  IncomesAggregations.JSON_PROPERTY_AVERAGE_INCOME_PER_PERIOD,
  IncomesAggregations.JSON_PROPERTY_MEDIAN_INCOME_PER_PERIOD,
  IncomesAggregations.JSON_PROPERTY_MAXIMUM_INCOME_PER_PERIOD,
  IncomesAggregations.JSON_PROPERTY_MINIMUM_INCOME_PER_PERIOD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class IncomesAggregations {
  public static final String JSON_PROPERTY_PERIOD_UNIT = "period_unit";
  private String periodUnit;

  /**
   * The type of income used in the calculations. At present, Belvo takes into consideration all the income types into the calculation. We return one of the following enum values:    - &#x60;ALL&#x60;   - &#x60;CASH_DEPOSIT&#x60;   - &#x60;PENSION&#x60;   - &#x60;SALARY&#x60;   - &#x60;UNKNOWN&#x60;
   */
  public enum TypeEnum {
    ALL("ALL"),
    
    CASH_DEPOSIT("CASH_DEPOSIT"),
    
    PENSION("PENSION"),
    
    SALARY("SALARY"),
    
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
   * The lowest confidence score of the income transactions used in performing the calculations.  When the &#x60;minimum_confidence&#x60; enum is equal to: - &#x60;HIGH&#x60;, only transactions with high confidence score are used. - &#x60;MEDIUM&#x60;, all transactions with a confidence score of medium or high are used. 
   */
  public enum MinimumConfidenceEnum {
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH");

    private String value;

    MinimumConfidenceEnum(String value) {
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
    public static MinimumConfidenceEnum fromValue(String value) {
      for (MinimumConfidenceEnum b : MinimumConfidenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MINIMUM_CONFIDENCE = "minimum_confidence";
  private MinimumConfidenceEnum minimumConfidence;

  public static final String JSON_PROPERTY_LOOKBACK_PERIODS = "lookback_periods";
  private Integer lookbackPeriods;

  public static final String JSON_PROPERTY_FULL_PERIODS = "full_periods";
  private Integer fullPeriods;

  public static final String JSON_PROPERTY_PERIODS_WITH_INCOME = "periods_with_income";
  private Integer periodsWithIncome;

  public static final String JSON_PROPERTY_TOTAL_NUMBER_OF_SOURCES = "total_number_of_sources";
  private Integer totalNumberOfSources;

  public static final String JSON_PROPERTY_STD_INCOME_PER_PERIOD = "std_income_per_period";
  private Float stdIncomePerPeriod;

  public static final String JSON_PROPERTY_AVERAGE_INCOME_PER_PERIOD = "average_income_per_period";
  private Float averageIncomePerPeriod;

  public static final String JSON_PROPERTY_MEDIAN_INCOME_PER_PERIOD = "median_income_per_period";
  private Float medianIncomePerPeriod;

  public static final String JSON_PROPERTY_MAXIMUM_INCOME_PER_PERIOD = "maximum_income_per_period";
  private Float maximumIncomePerPeriod;

  public static final String JSON_PROPERTY_MINIMUM_INCOME_PER_PERIOD = "minimum_income_per_period";
  private Float minimumIncomePerPeriod;

  public IncomesAggregations() {
  }

  public IncomesAggregations periodUnit(String periodUnit) {
    
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Period to be considered. At present all calculations are based on *rolling months*.  Note: A *rolling month* is a period of 30 days. For example, 15-03-2021 to 14-04-2021. 
   * @return periodUnit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MONTH", required = true, value = "Period to be considered. At present all calculations are based on *rolling months*.  Note: A *rolling month* is a period of 30 days. For example, 15-03-2021 to 14-04-2021. ")
  @JsonProperty(JSON_PROPERTY_PERIOD_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPeriodUnit() {
    return periodUnit;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPeriodUnit(String periodUnit) {
    this.periodUnit = periodUnit;
  }


  public IncomesAggregations type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of income used in the calculations. At present, Belvo takes into consideration all the income types into the calculation. We return one of the following enum values:    - &#x60;ALL&#x60;   - &#x60;CASH_DEPOSIT&#x60;   - &#x60;PENSION&#x60;   - &#x60;SALARY&#x60;   - &#x60;UNKNOWN&#x60;
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ALL", required = true, value = "The type of income used in the calculations. At present, Belvo takes into consideration all the income types into the calculation. We return one of the following enum values:    - `ALL`   - `CASH_DEPOSIT`   - `PENSION`   - `SALARY`   - `UNKNOWN`")
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


  public IncomesAggregations minimumConfidence(MinimumConfidenceEnum minimumConfidence) {
    
    this.minimumConfidence = minimumConfidence;
    return this;
  }

   /**
   * The lowest confidence score of the income transactions used in performing the calculations.  When the &#x60;minimum_confidence&#x60; enum is equal to: - &#x60;HIGH&#x60;, only transactions with high confidence score are used. - &#x60;MEDIUM&#x60;, all transactions with a confidence score of medium or high are used. 
   * @return minimumConfidence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "HIGH", required = true, value = "The lowest confidence score of the income transactions used in performing the calculations.  When the `minimum_confidence` enum is equal to: - `HIGH`, only transactions with high confidence score are used. - `MEDIUM`, all transactions with a confidence score of medium or high are used. ")
  @JsonProperty(JSON_PROPERTY_MINIMUM_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MinimumConfidenceEnum getMinimumConfidence() {
    return minimumConfidence;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinimumConfidence(MinimumConfidenceEnum minimumConfidence) {
    this.minimumConfidence = minimumConfidence;
  }


  public IncomesAggregations lookbackPeriods(Integer lookbackPeriods) {
    
    this.lookbackPeriods = lookbackPeriods;
    return this;
  }

   /**
   * Number of &#x60;period_unit&#x60;s used to generate insights and calculations.
   * @return lookbackPeriods
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "Number of `period_unit`s used to generate insights and calculations.")
  @JsonProperty(JSON_PROPERTY_LOOKBACK_PERIODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLookbackPeriods() {
    return lookbackPeriods;
  }


  @JsonProperty(JSON_PROPERTY_LOOKBACK_PERIODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLookbackPeriods(Integer lookbackPeriods) {
    this.lookbackPeriods = lookbackPeriods;
  }


  public IncomesAggregations fullPeriods(Integer fullPeriods) {
    
    this.fullPeriods = fullPeriods;
    return this;
  }

   /**
   * Number of &#x60;period_unit&#x60;s with data to perform calculations.
   * @return fullPeriods
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Number of `period_unit`s with data to perform calculations.")
  @JsonProperty(JSON_PROPERTY_FULL_PERIODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFullPeriods() {
    return fullPeriods;
  }


  @JsonProperty(JSON_PROPERTY_FULL_PERIODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFullPeriods(Integer fullPeriods) {
    this.fullPeriods = fullPeriods;
  }


  public IncomesAggregations periodsWithIncome(Integer periodsWithIncome) {
    
    this.periodsWithIncome = periodsWithIncome;
    return this;
  }

   /**
   * Number of &#x60;period_unit&#x60;s with at least one income available with a confidence of either &#x60;HIGH&#x60; or &#x60;MEDIUM&#x60;. 
   * @return periodsWithIncome
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "Number of `period_unit`s with at least one income available with a confidence of either `HIGH` or `MEDIUM`. ")
  @JsonProperty(JSON_PROPERTY_PERIODS_WITH_INCOME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPeriodsWithIncome() {
    return periodsWithIncome;
  }


  @JsonProperty(JSON_PROPERTY_PERIODS_WITH_INCOME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPeriodsWithIncome(Integer periodsWithIncome) {
    this.periodsWithIncome = periodsWithIncome;
  }


  public IncomesAggregations totalNumberOfSources(Integer totalNumberOfSources) {
    
    this.totalNumberOfSources = totalNumberOfSources;
    return this;
  }

   /**
   * The total number of income transactions in the last &#x60;period_unit&#x60;s.
   * @return totalNumberOfSources
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "The total number of income transactions in the last `period_unit`s.")
  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalNumberOfSources() {
    return totalNumberOfSources;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalNumberOfSources(Integer totalNumberOfSources) {
    this.totalNumberOfSources = totalNumberOfSources;
  }


  public IncomesAggregations stdIncomePerPeriod(Float stdIncomePerPeriod) {
    
    this.stdIncomePerPeriod = stdIncomePerPeriod;
    return this;
  }

   /**
   * The standard deviation of the income amount calculated per month, given the past three &#x60;period_unit&#x60;s. 
   * @return stdIncomePerPeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1415.12", required = true, value = "The standard deviation of the income amount calculated per month, given the past three `period_unit`s. ")
  @JsonProperty(JSON_PROPERTY_STD_INCOME_PER_PERIOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getStdIncomePerPeriod() {
    return stdIncomePerPeriod;
  }


  @JsonProperty(JSON_PROPERTY_STD_INCOME_PER_PERIOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStdIncomePerPeriod(Float stdIncomePerPeriod) {
    this.stdIncomePerPeriod = stdIncomePerPeriod;
  }


  public IncomesAggregations averageIncomePerPeriod(Float averageIncomePerPeriod) {
    
    this.averageIncomePerPeriod = averageIncomePerPeriod;
    return this;
  }

   /**
   * The average income amount calculated per month, given the past three &#x60;period_unit&#x60;s. 
   * @return averageIncomePerPeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2742.07", required = true, value = "The average income amount calculated per month, given the past three `period_unit`s. ")
  @JsonProperty(JSON_PROPERTY_AVERAGE_INCOME_PER_PERIOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getAverageIncomePerPeriod() {
    return averageIncomePerPeriod;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_INCOME_PER_PERIOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAverageIncomePerPeriod(Float averageIncomePerPeriod) {
    this.averageIncomePerPeriod = averageIncomePerPeriod;
  }


  public IncomesAggregations medianIncomePerPeriod(Float medianIncomePerPeriod) {
    
    this.medianIncomePerPeriod = medianIncomePerPeriod;
    return this;
  }

   /**
   * The median income amount calculated per month, given the past three &#x60;period_unit&#x60;s. 
   * @return medianIncomePerPeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1990.73", required = true, value = "The median income amount calculated per month, given the past three `period_unit`s. ")
  @JsonProperty(JSON_PROPERTY_MEDIAN_INCOME_PER_PERIOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getMedianIncomePerPeriod() {
    return medianIncomePerPeriod;
  }


  @JsonProperty(JSON_PROPERTY_MEDIAN_INCOME_PER_PERIOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMedianIncomePerPeriod(Float medianIncomePerPeriod) {
    this.medianIncomePerPeriod = medianIncomePerPeriod;
  }


  public IncomesAggregations maximumIncomePerPeriod(Float maximumIncomePerPeriod) {
    
    this.maximumIncomePerPeriod = maximumIncomePerPeriod;
    return this;
  }

   /**
   * The maximum income amount calculated per month, given the past three &#x60;period_unit&#x60;s. 
   * @return maximumIncomePerPeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4374.4", required = true, value = "The maximum income amount calculated per month, given the past three `period_unit`s. ")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_INCOME_PER_PERIOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getMaximumIncomePerPeriod() {
    return maximumIncomePerPeriod;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_INCOME_PER_PERIOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaximumIncomePerPeriod(Float maximumIncomePerPeriod) {
    this.maximumIncomePerPeriod = maximumIncomePerPeriod;
  }


  public IncomesAggregations minimumIncomePerPeriod(Float minimumIncomePerPeriod) {
    
    this.minimumIncomePerPeriod = minimumIncomePerPeriod;
    return this;
  }

   /**
   * The minimum income amount calculated per month, given the past three &#x60;period_unit&#x60;s. 
   * @return minimumIncomePerPeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1861.08", required = true, value = "The minimum income amount calculated per month, given the past three `period_unit`s. ")
  @JsonProperty(JSON_PROPERTY_MINIMUM_INCOME_PER_PERIOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getMinimumIncomePerPeriod() {
    return minimumIncomePerPeriod;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_INCOME_PER_PERIOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinimumIncomePerPeriod(Float minimumIncomePerPeriod) {
    this.minimumIncomePerPeriod = minimumIncomePerPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomesAggregations incomesAggregations = (IncomesAggregations) o;
    return Objects.equals(this.periodUnit, incomesAggregations.periodUnit) &&
        Objects.equals(this.type, incomesAggregations.type) &&
        Objects.equals(this.minimumConfidence, incomesAggregations.minimumConfidence) &&
        Objects.equals(this.lookbackPeriods, incomesAggregations.lookbackPeriods) &&
        Objects.equals(this.fullPeriods, incomesAggregations.fullPeriods) &&
        Objects.equals(this.periodsWithIncome, incomesAggregations.periodsWithIncome) &&
        Objects.equals(this.totalNumberOfSources, incomesAggregations.totalNumberOfSources) &&
        Objects.equals(this.stdIncomePerPeriod, incomesAggregations.stdIncomePerPeriod) &&
        Objects.equals(this.averageIncomePerPeriod, incomesAggregations.averageIncomePerPeriod) &&
        Objects.equals(this.medianIncomePerPeriod, incomesAggregations.medianIncomePerPeriod) &&
        Objects.equals(this.maximumIncomePerPeriod, incomesAggregations.maximumIncomePerPeriod) &&
        Objects.equals(this.minimumIncomePerPeriod, incomesAggregations.minimumIncomePerPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodUnit, type, minimumConfidence, lookbackPeriods, fullPeriods, periodsWithIncome, totalNumberOfSources, stdIncomePerPeriod, averageIncomePerPeriod, medianIncomePerPeriod, maximumIncomePerPeriod, minimumIncomePerPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomesAggregations {\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    minimumConfidence: ").append(toIndentedString(minimumConfidence)).append("\n");
    sb.append("    lookbackPeriods: ").append(toIndentedString(lookbackPeriods)).append("\n");
    sb.append("    fullPeriods: ").append(toIndentedString(fullPeriods)).append("\n");
    sb.append("    periodsWithIncome: ").append(toIndentedString(periodsWithIncome)).append("\n");
    sb.append("    totalNumberOfSources: ").append(toIndentedString(totalNumberOfSources)).append("\n");
    sb.append("    stdIncomePerPeriod: ").append(toIndentedString(stdIncomePerPeriod)).append("\n");
    sb.append("    averageIncomePerPeriod: ").append(toIndentedString(averageIncomePerPeriod)).append("\n");
    sb.append("    medianIncomePerPeriod: ").append(toIndentedString(medianIncomePerPeriod)).append("\n");
    sb.append("    maximumIncomePerPeriod: ").append(toIndentedString(maximumIncomePerPeriod)).append("\n");
    sb.append("    minimumIncomePerPeriod: ").append(toIndentedString(minimumIncomePerPeriod)).append("\n");
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

