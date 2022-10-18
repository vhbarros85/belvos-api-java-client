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
import com.vhbarros.belvo.client.model.RiskInsightsBalanceMetrics;
import com.vhbarros.belvo.client.model.RiskInsightsCashflowMetrics;
import com.vhbarros.belvo.client.model.RiskInsightsCreditCardMetrics;
import com.vhbarros.belvo.client.model.RiskInsightsLoansMetrics;
import com.vhbarros.belvo.client.model.RiskInsightsTransactionMetrics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RiskInsights
 */
@JsonPropertyOrder({
  RiskInsights.JSON_PROPERTY_ID,
  RiskInsights.JSON_PROPERTY_LINK,
  RiskInsights.JSON_PROPERTY_ACCOUNTS,
  RiskInsights.JSON_PROPERTY_CREATED_AT,
  RiskInsights.JSON_PROPERTY_TRANSACTIONS_METRICS,
  RiskInsights.JSON_PROPERTY_BALANCES_METRICS,
  RiskInsights.JSON_PROPERTY_CASHFLOW_METRICS,
  RiskInsights.JSON_PROPERTY_CREDIT_CARDS_METRICS,
  RiskInsights.JSON_PROPERTY_LOANS_METRICS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class RiskInsights {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_LINK = "link";
  private UUID link;

  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private List<UUID> accounts = new ArrayList<>();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_TRANSACTIONS_METRICS = "transactions_metrics";
  private RiskInsightsTransactionMetrics transactionsMetrics;

  public static final String JSON_PROPERTY_BALANCES_METRICS = "balances_metrics";
  private RiskInsightsBalanceMetrics balancesMetrics;

  public static final String JSON_PROPERTY_CASHFLOW_METRICS = "cashflow_metrics";
  private RiskInsightsCashflowMetrics cashflowMetrics;

  public static final String JSON_PROPERTY_CREDIT_CARDS_METRICS = "credit_cards_metrics";
  private RiskInsightsCreditCardMetrics creditCardsMetrics;

  public static final String JSON_PROPERTY_LOANS_METRICS = "loans_metrics";
  private RiskInsightsLoansMetrics loansMetrics;

  public RiskInsights() {
  }

  public RiskInsights id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique ID for the risk insights request.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "076c66e5-90f5-4e01-99c7-50e32f65ae42", required = true, value = "Belvo's unique ID for the risk insights request.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(UUID id) {
    this.id = id;
  }


  public RiskInsights link(UUID link) {
    
    this.link = link;
    return this;
  }

   /**
   * The &#x60;link.id&#x60; the risk insights analysis belongs to.
   * @return link
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", required = true, value = "The `link.id` the risk insights analysis belongs to.")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLink(UUID link) {
    this.link = link;
  }


  public RiskInsights accounts(List<UUID> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public RiskInsights addAccountsItem(UUID accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * An array of Belvo-generated account numbers (UUIDs) that were used during the risk insights analysis. If no accounts were found, we return an empty array.
   * @return accounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"0d3ffb69-f83b-456e-ad8e-208d0998d71d\",\"00293c8e-1152-440b-9892-3c071fb88672\",\"cf638fba-ef45-4c10-bc6f-adecc4b2bf4e\"]", required = true, value = "An array of Belvo-generated account numbers (UUIDs) that were used during the risk insights analysis. If no accounts were found, we return an empty array.")
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<UUID> getAccounts() {
    return accounts;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccounts(List<UUID> accounts) {
    this.accounts = accounts;
  }


  public RiskInsights createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2022-02-01T20:25:47.307911Z", required = true, value = "The ISO-8601 timestamp of when the data point was last updated in Belvo's database.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public RiskInsights transactionsMetrics(RiskInsightsTransactionMetrics transactionsMetrics) {
    
    this.transactionsMetrics = transactionsMetrics;
    return this;
  }

   /**
   * Get transactionsMetrics
   * @return transactionsMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTIONS_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RiskInsightsTransactionMetrics getTransactionsMetrics() {
    return transactionsMetrics;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTIONS_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionsMetrics(RiskInsightsTransactionMetrics transactionsMetrics) {
    this.transactionsMetrics = transactionsMetrics;
  }


  public RiskInsights balancesMetrics(RiskInsightsBalanceMetrics balancesMetrics) {
    
    this.balancesMetrics = balancesMetrics;
    return this;
  }

   /**
   * Get balancesMetrics
   * @return balancesMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BALANCES_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RiskInsightsBalanceMetrics getBalancesMetrics() {
    return balancesMetrics;
  }


  @JsonProperty(JSON_PROPERTY_BALANCES_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalancesMetrics(RiskInsightsBalanceMetrics balancesMetrics) {
    this.balancesMetrics = balancesMetrics;
  }


  public RiskInsights cashflowMetrics(RiskInsightsCashflowMetrics cashflowMetrics) {
    
    this.cashflowMetrics = cashflowMetrics;
    return this;
  }

   /**
   * Get cashflowMetrics
   * @return cashflowMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CASHFLOW_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RiskInsightsCashflowMetrics getCashflowMetrics() {
    return cashflowMetrics;
  }


  @JsonProperty(JSON_PROPERTY_CASHFLOW_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCashflowMetrics(RiskInsightsCashflowMetrics cashflowMetrics) {
    this.cashflowMetrics = cashflowMetrics;
  }


  public RiskInsights creditCardsMetrics(RiskInsightsCreditCardMetrics creditCardsMetrics) {
    
    this.creditCardsMetrics = creditCardsMetrics;
    return this;
  }

   /**
   * Get creditCardsMetrics
   * @return creditCardsMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CREDIT_CARDS_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RiskInsightsCreditCardMetrics getCreditCardsMetrics() {
    return creditCardsMetrics;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_CARDS_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditCardsMetrics(RiskInsightsCreditCardMetrics creditCardsMetrics) {
    this.creditCardsMetrics = creditCardsMetrics;
  }


  public RiskInsights loansMetrics(RiskInsightsLoansMetrics loansMetrics) {
    
    this.loansMetrics = loansMetrics;
    return this;
  }

   /**
   * Get loansMetrics
   * @return loansMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOANS_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RiskInsightsLoansMetrics getLoansMetrics() {
    return loansMetrics;
  }


  @JsonProperty(JSON_PROPERTY_LOANS_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLoansMetrics(RiskInsightsLoansMetrics loansMetrics) {
    this.loansMetrics = loansMetrics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskInsights riskInsights = (RiskInsights) o;
    return Objects.equals(this.id, riskInsights.id) &&
        Objects.equals(this.link, riskInsights.link) &&
        Objects.equals(this.accounts, riskInsights.accounts) &&
        Objects.equals(this.createdAt, riskInsights.createdAt) &&
        Objects.equals(this.transactionsMetrics, riskInsights.transactionsMetrics) &&
        Objects.equals(this.balancesMetrics, riskInsights.balancesMetrics) &&
        Objects.equals(this.cashflowMetrics, riskInsights.cashflowMetrics) &&
        Objects.equals(this.creditCardsMetrics, riskInsights.creditCardsMetrics) &&
        Objects.equals(this.loansMetrics, riskInsights.loansMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, accounts, createdAt, transactionsMetrics, balancesMetrics, cashflowMetrics, creditCardsMetrics, loansMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskInsights {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    transactionsMetrics: ").append(toIndentedString(transactionsMetrics)).append("\n");
    sb.append("    balancesMetrics: ").append(toIndentedString(balancesMetrics)).append("\n");
    sb.append("    cashflowMetrics: ").append(toIndentedString(cashflowMetrics)).append("\n");
    sb.append("    creditCardsMetrics: ").append(toIndentedString(creditCardsMetrics)).append("\n");
    sb.append("    loansMetrics: ").append(toIndentedString(loansMetrics)).append("\n");
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

