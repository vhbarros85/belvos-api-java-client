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
import com.vhbarros.belvo.client.model.AccountsLoanDataFees;
import com.vhbarros.belvo.client.model.AccountsLoanDataInterestRate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The loan options associated with this account.
 */
@ApiModel(description = "The loan options associated with this account.")
@JsonPropertyOrder({
  AccountsLoanData.JSON_PROPERTY_COLLECTED_AT,
  AccountsLoanData.JSON_PROPERTY_CONTRACT_AMOUNT,
  AccountsLoanData.JSON_PROPERTY_PRINCIPAL,
  AccountsLoanData.JSON_PROPERTY_LOAN_TYPE,
  AccountsLoanData.JSON_PROPERTY_PAYMENT_DAY,
  AccountsLoanData.JSON_PROPERTY_OUTSTANDING_PRINCIPAL,
  AccountsLoanData.JSON_PROPERTY_OUTSTANDING_BALANCE,
  AccountsLoanData.JSON_PROPERTY_MONTHLY_PAYMENT,
  AccountsLoanData.JSON_PROPERTY_INTEREST_RATES,
  AccountsLoanData.JSON_PROPERTY_FEES,
  AccountsLoanData.JSON_PROPERTY_NUMBER_OF_INSTALLMENTS_TOTAL,
  AccountsLoanData.JSON_PROPERTY_NUMBER_OF_INSTALLMENTS_OUTSTANDING,
  AccountsLoanData.JSON_PROPERTY_CONTRACT_START_DATE,
  AccountsLoanData.JSON_PROPERTY_CONTRACT_END_DATE,
  AccountsLoanData.JSON_PROPERTY_CONTRACT_NUMBER,
  AccountsLoanData.JSON_PROPERTY_CREDIT_LIMIT,
  AccountsLoanData.JSON_PROPERTY_LAST_PERIOD_BALANCE,
  AccountsLoanData.JSON_PROPERTY_INTEREST_RATE,
  AccountsLoanData.JSON_PROPERTY_LIMIT_DAY,
  AccountsLoanData.JSON_PROPERTY_CUTTING_DAY,
  AccountsLoanData.JSON_PROPERTY_CUTTING_DATE,
  AccountsLoanData.JSON_PROPERTY_LAST_PAYMENT_DATE,
  AccountsLoanData.JSON_PROPERTY_NO_INTEREST_PAYMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class AccountsLoanData {
  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private OffsetDateTime collectedAt;

  public static final String JSON_PROPERTY_CONTRACT_AMOUNT = "contract_amount";
  private JsonNullable<Float> contractAmount = JsonNullable.<Float>undefined();

  public static final String JSON_PROPERTY_PRINCIPAL = "principal";
  private Float principal;

  public static final String JSON_PROPERTY_LOAN_TYPE = "loan_type";
  private JsonNullable<String> loanType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAYMENT_DAY = "payment_day";
  private String paymentDay;

  public static final String JSON_PROPERTY_OUTSTANDING_PRINCIPAL = "outstanding_principal";
  private JsonNullable<Float> outstandingPrincipal = JsonNullable.<Float>undefined();

  public static final String JSON_PROPERTY_OUTSTANDING_BALANCE = "outstanding_balance";
  private Float outstandingBalance;

  public static final String JSON_PROPERTY_MONTHLY_PAYMENT = "monthly_payment";
  private Float monthlyPayment;

  public static final String JSON_PROPERTY_INTEREST_RATES = "interest_rates";
  private List<AccountsLoanDataInterestRate> interestRates = new ArrayList<>();

  public static final String JSON_PROPERTY_FEES = "fees";
  private JsonNullable<List<AccountsLoanDataFees>> fees = JsonNullable.<List<AccountsLoanDataFees>>undefined();

  public static final String JSON_PROPERTY_NUMBER_OF_INSTALLMENTS_TOTAL = "number_of_installments_total";
  private JsonNullable<Integer> numberOfInstallmentsTotal = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_NUMBER_OF_INSTALLMENTS_OUTSTANDING = "number_of_installments_outstanding";
  private JsonNullable<Integer> numberOfInstallmentsOutstanding = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_CONTRACT_START_DATE = "contract_start_date";
  private JsonNullable<LocalDate> contractStartDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_CONTRACT_END_DATE = "contract_end_date";
  private LocalDate contractEndDate;

  public static final String JSON_PROPERTY_CONTRACT_NUMBER = "contract_number";
  private JsonNullable<String> contractNumber = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREDIT_LIMIT = "credit_limit";
  private JsonNullable<BigDecimal> creditLimit = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_LAST_PERIOD_BALANCE = "last_period_balance";
  private JsonNullable<BigDecimal> lastPeriodBalance = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_INTEREST_RATE = "interest_rate";
  private JsonNullable<BigDecimal> interestRate = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_LIMIT_DAY = "limit_day";
  private JsonNullable<String> limitDay = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUTTING_DAY = "cutting_day";
  private JsonNullable<String> cuttingDay = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUTTING_DATE = "cutting_date";
  private JsonNullable<String> cuttingDate = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_PAYMENT_DATE = "last_payment_date";
  private JsonNullable<String> lastPaymentDate = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NO_INTEREST_PAYMENT = "no_interest_payment";
  private JsonNullable<BigDecimal> noInterestPayment = JsonNullable.<BigDecimal>undefined();

  public AccountsLoanData() {
  }

  public AccountsLoanData collectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nonnull
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


  public AccountsLoanData contractAmount(Float contractAmount) {
    this.contractAmount = JsonNullable.<Float>of(contractAmount);
    
    return this;
  }

   /**
   * The initial total loan amount, calculated by the institution, when the contract was signed. This amount includes the principal + interest + taxes + fees.
   * @return contractAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "202000", value = "The initial total loan amount, calculated by the institution, when the contract was signed. This amount includes the principal + interest + taxes + fees.")
  @JsonIgnore

  public Float getContractAmount() {
        return contractAmount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTRACT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Float> getContractAmount_JsonNullable() {
    return contractAmount;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTRACT_AMOUNT)
  public void setContractAmount_JsonNullable(JsonNullable<Float> contractAmount) {
    this.contractAmount = contractAmount;
  }

  public void setContractAmount(Float contractAmount) {
    this.contractAmount = JsonNullable.<Float>of(contractAmount);
  }


  public AccountsLoanData principal(Float principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * Total amount of the loan (the amount the user receives).
   * @return principal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "192000", required = true, value = "Total amount of the loan (the amount the user receives).")
  @JsonProperty(JSON_PROPERTY_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getPrincipal() {
    return principal;
  }


  @JsonProperty(JSON_PROPERTY_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrincipal(Float principal) {
    this.principal = principal;
  }


  public AccountsLoanData loanType(String loanType) {
    this.loanType = JsonNullable.<String>of(loanType);
    
    return this;
  }

   /**
   * The type of the loan, according to the institution.
   * @return loanType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Consignado", value = "The type of the loan, according to the institution.")
  @JsonIgnore

  public String getLoanType() {
        return loanType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOAN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLoanType_JsonNullable() {
    return loanType;
  }
  
  @JsonProperty(JSON_PROPERTY_LOAN_TYPE)
  public void setLoanType_JsonNullable(JsonNullable<String> loanType) {
    this.loanType = loanType;
  }

  public void setLoanType(String loanType) {
    this.loanType = JsonNullable.<String>of(loanType);
  }


  public AccountsLoanData paymentDay(String paymentDay) {
    
    this.paymentDay = paymentDay;
    return this;
  }

   /**
   * The day of the month by which the owner needs to pay the loan.
   * @return paymentDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "27", required = true, value = "The day of the month by which the owner needs to pay the loan.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_DAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentDay() {
    return paymentDay;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_DAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentDay(String paymentDay) {
    this.paymentDay = paymentDay;
  }


  public AccountsLoanData outstandingPrincipal(Float outstandingPrincipal) {
    this.outstandingPrincipal = JsonNullable.<Float>of(outstandingPrincipal);
    
    return this;
  }

   /**
   * Outstanding loan amount, that is, how much remains to pay on the principal (not including interest). 
   * @return outstandingPrincipal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "142023", value = "Outstanding loan amount, that is, how much remains to pay on the principal (not including interest). ")
  @JsonIgnore

  public Float getOutstandingPrincipal() {
        return outstandingPrincipal.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OUTSTANDING_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Float> getOutstandingPrincipal_JsonNullable() {
    return outstandingPrincipal;
  }
  
  @JsonProperty(JSON_PROPERTY_OUTSTANDING_PRINCIPAL)
  public void setOutstandingPrincipal_JsonNullable(JsonNullable<Float> outstandingPrincipal) {
    this.outstandingPrincipal = outstandingPrincipal;
  }

  public void setOutstandingPrincipal(Float outstandingPrincipal) {
    this.outstandingPrincipal = JsonNullable.<Float>of(outstandingPrincipal);
  }


  public AccountsLoanData outstandingBalance(Float outstandingBalance) {
    
    this.outstandingBalance = outstandingBalance;
    return this;
  }

   /**
   * The amount remaining to pay in total, including interest.
   * @return outstandingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "182000", required = true, value = "The amount remaining to pay in total, including interest.")
  @JsonProperty(JSON_PROPERTY_OUTSTANDING_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getOutstandingBalance() {
    return outstandingBalance;
  }


  @JsonProperty(JSON_PROPERTY_OUTSTANDING_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOutstandingBalance(Float outstandingBalance) {
    this.outstandingBalance = outstandingBalance;
  }


  public AccountsLoanData monthlyPayment(Float monthlyPayment) {
    
    this.monthlyPayment = monthlyPayment;
    return this;
  }

   /**
   * The recurrent monthly payment, if applicable.
   * @return monthlyPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", required = true, value = "The recurrent monthly payment, if applicable.")
  @JsonProperty(JSON_PROPERTY_MONTHLY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getMonthlyPayment() {
    return monthlyPayment;
  }


  @JsonProperty(JSON_PROPERTY_MONTHLY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMonthlyPayment(Float monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
  }


  public AccountsLoanData interestRates(List<AccountsLoanDataInterestRate> interestRates) {
    
    this.interestRates = interestRates;
    return this;
  }

  public AccountsLoanData addInterestRatesItem(AccountsLoanDataInterestRate interestRatesItem) {
    this.interestRates.add(interestRatesItem);
    return this;
  }

   /**
   * Breakdown of the interest applied to the loan.
   * @return interestRates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Breakdown of the interest applied to the loan.")
  @JsonProperty(JSON_PROPERTY_INTEREST_RATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AccountsLoanDataInterestRate> getInterestRates() {
    return interestRates;
  }


  @JsonProperty(JSON_PROPERTY_INTEREST_RATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInterestRates(List<AccountsLoanDataInterestRate> interestRates) {
    this.interestRates = interestRates;
  }


  public AccountsLoanData fees(List<AccountsLoanDataFees> fees) {
    this.fees = JsonNullable.<List<AccountsLoanDataFees>>of(fees);
    
    return this;
  }

  public AccountsLoanData addFeesItem(AccountsLoanDataFees feesItem) {
    if (this.fees == null || !this.fees.isPresent()) {
      this.fees = JsonNullable.<List<AccountsLoanDataFees>>of(new ArrayList<>());
    }
    try {
      this.fees.get().add(feesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Breakdown of the fees applied to the loan.
   * @return fees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Breakdown of the fees applied to the loan.")
  @JsonIgnore

  public List<AccountsLoanDataFees> getFees() {
        return fees.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AccountsLoanDataFees>> getFees_JsonNullable() {
    return fees;
  }
  
  @JsonProperty(JSON_PROPERTY_FEES)
  public void setFees_JsonNullable(JsonNullable<List<AccountsLoanDataFees>> fees) {
    this.fees = fees;
  }

  public void setFees(List<AccountsLoanDataFees> fees) {
    this.fees = JsonNullable.<List<AccountsLoanDataFees>>of(fees);
  }


  public AccountsLoanData numberOfInstallmentsTotal(Integer numberOfInstallmentsTotal) {
    this.numberOfInstallmentsTotal = JsonNullable.<Integer>of(numberOfInstallmentsTotal);
    
    return this;
  }

   /**
   * The total number of installments required to pay the loan.
   * @return numberOfInstallmentsTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60", value = "The total number of installments required to pay the loan.")
  @JsonIgnore

  public Integer getNumberOfInstallmentsTotal() {
        return numberOfInstallmentsTotal.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NUMBER_OF_INSTALLMENTS_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getNumberOfInstallmentsTotal_JsonNullable() {
    return numberOfInstallmentsTotal;
  }
  
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_INSTALLMENTS_TOTAL)
  public void setNumberOfInstallmentsTotal_JsonNullable(JsonNullable<Integer> numberOfInstallmentsTotal) {
    this.numberOfInstallmentsTotal = numberOfInstallmentsTotal;
  }

  public void setNumberOfInstallmentsTotal(Integer numberOfInstallmentsTotal) {
    this.numberOfInstallmentsTotal = JsonNullable.<Integer>of(numberOfInstallmentsTotal);
  }


  public AccountsLoanData numberOfInstallmentsOutstanding(Integer numberOfInstallmentsOutstanding) {
    this.numberOfInstallmentsOutstanding = JsonNullable.<Integer>of(numberOfInstallmentsOutstanding);
    
    return this;
  }

   /**
   * The number of installments left to pay.
   * @return numberOfInstallmentsOutstanding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "48", value = "The number of installments left to pay.")
  @JsonIgnore

  public Integer getNumberOfInstallmentsOutstanding() {
        return numberOfInstallmentsOutstanding.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NUMBER_OF_INSTALLMENTS_OUTSTANDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getNumberOfInstallmentsOutstanding_JsonNullable() {
    return numberOfInstallmentsOutstanding;
  }
  
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_INSTALLMENTS_OUTSTANDING)
  public void setNumberOfInstallmentsOutstanding_JsonNullable(JsonNullable<Integer> numberOfInstallmentsOutstanding) {
    this.numberOfInstallmentsOutstanding = numberOfInstallmentsOutstanding;
  }

  public void setNumberOfInstallmentsOutstanding(Integer numberOfInstallmentsOutstanding) {
    this.numberOfInstallmentsOutstanding = JsonNullable.<Integer>of(numberOfInstallmentsOutstanding);
  }


  public AccountsLoanData contractStartDate(LocalDate contractStartDate) {
    this.contractStartDate = JsonNullable.<LocalDate>of(contractStartDate);
    
    return this;
  }

   /**
   * The date when the loan contract was signed.
   * @return contractStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sun Mar 01 00:00:00 UTC 2020", value = "The date when the loan contract was signed.")
  @JsonIgnore

  public LocalDate getContractStartDate() {
        return contractStartDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTRACT_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getContractStartDate_JsonNullable() {
    return contractStartDate;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTRACT_START_DATE)
  public void setContractStartDate_JsonNullable(JsonNullable<LocalDate> contractStartDate) {
    this.contractStartDate = contractStartDate;
  }

  public void setContractStartDate(LocalDate contractStartDate) {
    this.contractStartDate = JsonNullable.<LocalDate>of(contractStartDate);
  }


  public AccountsLoanData contractEndDate(LocalDate contractEndDate) {
    
    this.contractEndDate = contractEndDate;
    return this;
  }

   /**
   * The date when the loan is expected to be completed.
   * @return contractEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fri Oct 01 00:00:00 UTC 2027", value = "The date when the loan is expected to be completed.")
  @JsonProperty(JSON_PROPERTY_CONTRACT_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getContractEndDate() {
    return contractEndDate;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractEndDate(LocalDate contractEndDate) {
    this.contractEndDate = contractEndDate;
  }


  public AccountsLoanData contractNumber(String contractNumber) {
    this.contractNumber = JsonNullable.<String>of(contractNumber);
    
    return this;
  }

   /**
   * The contract number of the loan, as given by the institution.
   * @return contractNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "890ASLDJF87SD00", value = "The contract number of the loan, as given by the institution.")
  @JsonIgnore

  public String getContractNumber() {
        return contractNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTRACT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getContractNumber_JsonNullable() {
    return contractNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTRACT_NUMBER)
  public void setContractNumber_JsonNullable(JsonNullable<String> contractNumber) {
    this.contractNumber = contractNumber;
  }

  public void setContractNumber(String contractNumber) {
    this.contractNumber = JsonNullable.<String>of(contractNumber);
  }


  public AccountsLoanData creditLimit(BigDecimal creditLimit) {
    this.creditLimit = JsonNullable.<BigDecimal>of(creditLimit);
    
    return this;
  }

   /**
   * This field has been deprecated.  Please see &#x60;principal&#x60; instead. 
   * @return creditLimit
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  Please see `principal` instead. ")
  @JsonIgnore

  public BigDecimal getCreditLimit() {
        return creditLimit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREDIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getCreditLimit_JsonNullable() {
    return creditLimit;
  }
  
  @JsonProperty(JSON_PROPERTY_CREDIT_LIMIT)
  public void setCreditLimit_JsonNullable(JsonNullable<BigDecimal> creditLimit) {
    this.creditLimit = creditLimit;
  }

  public void setCreditLimit(BigDecimal creditLimit) {
    this.creditLimit = JsonNullable.<BigDecimal>of(creditLimit);
  }


  public AccountsLoanData lastPeriodBalance(BigDecimal lastPeriodBalance) {
    this.lastPeriodBalance = JsonNullable.<BigDecimal>of(lastPeriodBalance);
    
    return this;
  }

   /**
   * This field has been deprecated.  Please see &#x60;outstanding_balance&#x60; instead. 
   * @return lastPeriodBalance
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  Please see `outstanding_balance` instead. ")
  @JsonIgnore

  public BigDecimal getLastPeriodBalance() {
        return lastPeriodBalance.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_PERIOD_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getLastPeriodBalance_JsonNullable() {
    return lastPeriodBalance;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_PERIOD_BALANCE)
  public void setLastPeriodBalance_JsonNullable(JsonNullable<BigDecimal> lastPeriodBalance) {
    this.lastPeriodBalance = lastPeriodBalance;
  }

  public void setLastPeriodBalance(BigDecimal lastPeriodBalance) {
    this.lastPeriodBalance = JsonNullable.<BigDecimal>of(lastPeriodBalance);
  }


  public AccountsLoanData interestRate(BigDecimal interestRate) {
    this.interestRate = JsonNullable.<BigDecimal>of(interestRate);
    
    return this;
  }

   /**
   * This field has been deprecated.  Please see the &#x60;interest_rates&#x60; object instead. 
   * @return interestRate
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  Please see the `interest_rates` object instead. ")
  @JsonIgnore

  public BigDecimal getInterestRate() {
        return interestRate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getInterestRate_JsonNullable() {
    return interestRate;
  }
  
  @JsonProperty(JSON_PROPERTY_INTEREST_RATE)
  public void setInterestRate_JsonNullable(JsonNullable<BigDecimal> interestRate) {
    this.interestRate = interestRate;
  }

  public void setInterestRate(BigDecimal interestRate) {
    this.interestRate = JsonNullable.<BigDecimal>of(interestRate);
  }


  public AccountsLoanData limitDay(String limitDay) {
    this.limitDay = JsonNullable.<String>of(limitDay);
    
    return this;
  }

   /**
   * This field has been deprecated.  Please see &#x60;payment_day&#x60; instead. 
   * @return limitDay
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  Please see `payment_day` instead. ")
  @JsonIgnore

  public String getLimitDay() {
        return limitDay.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIMIT_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLimitDay_JsonNullable() {
    return limitDay;
  }
  
  @JsonProperty(JSON_PROPERTY_LIMIT_DAY)
  public void setLimitDay_JsonNullable(JsonNullable<String> limitDay) {
    this.limitDay = limitDay;
  }

  public void setLimitDay(String limitDay) {
    this.limitDay = JsonNullable.<String>of(limitDay);
  }


  public AccountsLoanData cuttingDay(String cuttingDay) {
    this.cuttingDay = JsonNullable.<String>of(cuttingDay);
    
    return this;
  }

   /**
   * This field has been deprecated.  The closing day of the month for the loan. 
   * @return cuttingDay
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  The closing day of the month for the loan. ")
  @JsonIgnore

  public String getCuttingDay() {
        return cuttingDay.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUTTING_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCuttingDay_JsonNullable() {
    return cuttingDay;
  }
  
  @JsonProperty(JSON_PROPERTY_CUTTING_DAY)
  public void setCuttingDay_JsonNullable(JsonNullable<String> cuttingDay) {
    this.cuttingDay = cuttingDay;
  }

  public void setCuttingDay(String cuttingDay) {
    this.cuttingDay = JsonNullable.<String>of(cuttingDay);
  }


  public AccountsLoanData cuttingDate(String cuttingDate) {
    this.cuttingDate = JsonNullable.<String>of(cuttingDate);
    
    return this;
  }

   /**
   * This field has been deprecated.  The closing date of the loan period. 
   * @return cuttingDate
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  The closing date of the loan period. ")
  @JsonIgnore

  public String getCuttingDate() {
        return cuttingDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUTTING_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCuttingDate_JsonNullable() {
    return cuttingDate;
  }
  
  @JsonProperty(JSON_PROPERTY_CUTTING_DATE)
  public void setCuttingDate_JsonNullable(JsonNullable<String> cuttingDate) {
    this.cuttingDate = cuttingDate;
  }

  public void setCuttingDate(String cuttingDate) {
    this.cuttingDate = JsonNullable.<String>of(cuttingDate);
  }


  public AccountsLoanData lastPaymentDate(String lastPaymentDate) {
    this.lastPaymentDate = JsonNullable.<String>of(lastPaymentDate);
    
    return this;
  }

   /**
   * This field has been deprecated.  The date when the last loan payment was made. 
   * @return lastPaymentDate
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  The date when the last loan payment was made. ")
  @JsonIgnore

  public String getLastPaymentDate() {
        return lastPaymentDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_PAYMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastPaymentDate_JsonNullable() {
    return lastPaymentDate;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_PAYMENT_DATE)
  public void setLastPaymentDate_JsonNullable(JsonNullable<String> lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
  }

  public void setLastPaymentDate(String lastPaymentDate) {
    this.lastPaymentDate = JsonNullable.<String>of(lastPaymentDate);
  }


  public AccountsLoanData noInterestPayment(BigDecimal noInterestPayment) {
    this.noInterestPayment = JsonNullable.<BigDecimal>of(noInterestPayment);
    
    return this;
  }

   /**
   * This field has been deprecated.  The minimum amount required to pay to avoid generating interest. 
   * @return noInterestPayment
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  The minimum amount required to pay to avoid generating interest. ")
  @JsonIgnore

  public BigDecimal getNoInterestPayment() {
        return noInterestPayment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NO_INTEREST_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getNoInterestPayment_JsonNullable() {
    return noInterestPayment;
  }
  
  @JsonProperty(JSON_PROPERTY_NO_INTEREST_PAYMENT)
  public void setNoInterestPayment_JsonNullable(JsonNullable<BigDecimal> noInterestPayment) {
    this.noInterestPayment = noInterestPayment;
  }

  public void setNoInterestPayment(BigDecimal noInterestPayment) {
    this.noInterestPayment = JsonNullable.<BigDecimal>of(noInterestPayment);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsLoanData accountsLoanData = (AccountsLoanData) o;
    return Objects.equals(this.collectedAt, accountsLoanData.collectedAt) &&
        equalsNullable(this.contractAmount, accountsLoanData.contractAmount) &&
        Objects.equals(this.principal, accountsLoanData.principal) &&
        equalsNullable(this.loanType, accountsLoanData.loanType) &&
        Objects.equals(this.paymentDay, accountsLoanData.paymentDay) &&
        equalsNullable(this.outstandingPrincipal, accountsLoanData.outstandingPrincipal) &&
        Objects.equals(this.outstandingBalance, accountsLoanData.outstandingBalance) &&
        Objects.equals(this.monthlyPayment, accountsLoanData.monthlyPayment) &&
        Objects.equals(this.interestRates, accountsLoanData.interestRates) &&
        equalsNullable(this.fees, accountsLoanData.fees) &&
        equalsNullable(this.numberOfInstallmentsTotal, accountsLoanData.numberOfInstallmentsTotal) &&
        equalsNullable(this.numberOfInstallmentsOutstanding, accountsLoanData.numberOfInstallmentsOutstanding) &&
        equalsNullable(this.contractStartDate, accountsLoanData.contractStartDate) &&
        Objects.equals(this.contractEndDate, accountsLoanData.contractEndDate) &&
        equalsNullable(this.contractNumber, accountsLoanData.contractNumber) &&
        equalsNullable(this.creditLimit, accountsLoanData.creditLimit) &&
        equalsNullable(this.lastPeriodBalance, accountsLoanData.lastPeriodBalance) &&
        equalsNullable(this.interestRate, accountsLoanData.interestRate) &&
        equalsNullable(this.limitDay, accountsLoanData.limitDay) &&
        equalsNullable(this.cuttingDay, accountsLoanData.cuttingDay) &&
        equalsNullable(this.cuttingDate, accountsLoanData.cuttingDate) &&
        equalsNullable(this.lastPaymentDate, accountsLoanData.lastPaymentDate) &&
        equalsNullable(this.noInterestPayment, accountsLoanData.noInterestPayment);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectedAt, hashCodeNullable(contractAmount), principal, hashCodeNullable(loanType), paymentDay, hashCodeNullable(outstandingPrincipal), outstandingBalance, monthlyPayment, interestRates, hashCodeNullable(fees), hashCodeNullable(numberOfInstallmentsTotal), hashCodeNullable(numberOfInstallmentsOutstanding), hashCodeNullable(contractStartDate), contractEndDate, hashCodeNullable(contractNumber), hashCodeNullable(creditLimit), hashCodeNullable(lastPeriodBalance), hashCodeNullable(interestRate), hashCodeNullable(limitDay), hashCodeNullable(cuttingDay), hashCodeNullable(cuttingDate), hashCodeNullable(lastPaymentDate), hashCodeNullable(noInterestPayment));
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
    sb.append("class AccountsLoanData {\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    contractAmount: ").append(toIndentedString(contractAmount)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    loanType: ").append(toIndentedString(loanType)).append("\n");
    sb.append("    paymentDay: ").append(toIndentedString(paymentDay)).append("\n");
    sb.append("    outstandingPrincipal: ").append(toIndentedString(outstandingPrincipal)).append("\n");
    sb.append("    outstandingBalance: ").append(toIndentedString(outstandingBalance)).append("\n");
    sb.append("    monthlyPayment: ").append(toIndentedString(monthlyPayment)).append("\n");
    sb.append("    interestRates: ").append(toIndentedString(interestRates)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    numberOfInstallmentsTotal: ").append(toIndentedString(numberOfInstallmentsTotal)).append("\n");
    sb.append("    numberOfInstallmentsOutstanding: ").append(toIndentedString(numberOfInstallmentsOutstanding)).append("\n");
    sb.append("    contractStartDate: ").append(toIndentedString(contractStartDate)).append("\n");
    sb.append("    contractEndDate: ").append(toIndentedString(contractEndDate)).append("\n");
    sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    lastPeriodBalance: ").append(toIndentedString(lastPeriodBalance)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    limitDay: ").append(toIndentedString(limitDay)).append("\n");
    sb.append("    cuttingDay: ").append(toIndentedString(cuttingDay)).append("\n");
    sb.append("    cuttingDate: ").append(toIndentedString(cuttingDate)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    noInterestPayment: ").append(toIndentedString(noInterestPayment)).append("\n");
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

