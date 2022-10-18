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
import com.vhbarros.belvo.client.model.ReceivablesTransactionAccount;
import com.vhbarros.belvo.client.model.ReceivablesTransactionNumberOfInstallments;
import com.vhbarros.belvo.client.model.RecevablesTransactionFees;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ReceivablesTransaction
 */
@JsonPropertyOrder({
  ReceivablesTransaction.JSON_PROPERTY_ID,
  ReceivablesTransaction.JSON_PROPERTY_ACCOUNT,
  ReceivablesTransaction.JSON_PROPERTY_CREATED_AT,
  ReceivablesTransaction.JSON_PROPERTY_COLLECTED_AT,
  ReceivablesTransaction.JSON_PROPERTY_VALUE_HOUR,
  ReceivablesTransaction.JSON_PROPERTY_VALUE_DATE,
  ReceivablesTransaction.JSON_PROPERTY_INSTITUTION_TRANSACTION_ID,
  ReceivablesTransaction.JSON_PROPERTY_CURRENCY,
  ReceivablesTransaction.JSON_PROPERTY_TYPE,
  ReceivablesTransaction.JSON_PROPERTY_GROSS_AMOUNT,
  ReceivablesTransaction.JSON_PROPERTY_NET_AMOUNT,
  ReceivablesTransaction.JSON_PROPERTY_FEES,
  ReceivablesTransaction.JSON_PROPERTY_STATUS,
  ReceivablesTransaction.JSON_PROPERTY_NUMBER_OF_INSTALLMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class ReceivablesTransaction {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private ReceivablesTransactionAccount account;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private OffsetDateTime collectedAt;

  public static final String JSON_PROPERTY_VALUE_HOUR = "value_hour";
  private String valueHour;

  public static final String JSON_PROPERTY_VALUE_DATE = "value_date";
  private LocalDate valueDate;

  public static final String JSON_PROPERTY_INSTITUTION_TRANSACTION_ID = "institution_transaction_id";
  private String institutionTransactionId;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  /**
   * The type of transaction. For example, whether the transaction was a &#x60;VISA_DEBIT&#x60; or a &#x60;MASTERCARD_CREDIT&#x60;.
   */
  public enum TypeEnum {
    VISA_CREDIT("VISA_CREDIT"),
    
    VISA_DEBIT("VISA_DEBIT"),
    
    MASTERCARD_CREDIT("MASTERCARD_CREDIT"),
    
    MASTERCARD_DEBIT("MASTERCARD_DEBIT"),
    
    ELO_CREDIT("ELO_CREDIT"),
    
    ELO_DEBIT("ELO_DEBIT");

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

  public static final String JSON_PROPERTY_GROSS_AMOUNT = "gross_amount";
  private Float grossAmount;

  public static final String JSON_PROPERTY_NET_AMOUNT = "net_amount";
  private Float netAmount;

  public static final String JSON_PROPERTY_FEES = "fees";
  private List<RecevablesTransactionFees> fees = new ArrayList<>();

  /**
   * The status of the transaction. Can be either:    - &#x60;APPROVED&#x60;   - &#x60;CANCELLED&#x60;   - &#x60;REVERTED&#x60;   - &#x60;UNCATEGORIZED&#x60;
   */
  public enum StatusEnum {
    APPROVED("APPROVED"),
    
    CANCELLED("CANCELLED"),
    
    REVERTED("REVERTED"),
    
    UNCATEGORIZED("UNCATEGORIZED");

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

  public static final String JSON_PROPERTY_NUMBER_OF_INSTALLMENTS = "number_of_installments";
  private ReceivablesTransactionNumberOfInstallments numberOfInstallments;

  public ReceivablesTransaction() {
  }

  @JsonCreator
  public ReceivablesTransaction(
    @JsonProperty(JSON_PROPERTY_ID) UUID id
  ) {
    this();
    this.id = id;
  }

   /**
   * Belvo&#39;s unique ID used to reference the current receivable transaction.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", required = true, value = "Belvo's unique ID used to reference the current receivable transaction.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }




  public ReceivablesTransaction account(ReceivablesTransactionAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReceivablesTransactionAccount getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccount(ReceivablesTransactionAccount account) {
    this.account = account;
  }


  public ReceivablesTransaction createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO timestamp of when the data point was last updated in Belvo&#39;s database.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-04-23T21:30:20.336854Z", required = true, value = "The ISO timestamp of when the data point was last updated in Belvo's database.")
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


  public ReceivablesTransaction collectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-04-23T21:32:55.336854Z", required = true, value = "The ISO timestamp when the data point was collected.")
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


  public ReceivablesTransaction valueHour(String valueHour) {
    
    this.valueHour = valueHour;
    return this;
  }

   /**
   * The time that the transaction occurred, according to the institution, in &#x60;HH:MM&#x60; format.
   * @return valueHour
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "19:47", required = true, value = "The time that the transaction occurred, according to the institution, in `HH:MM` format.")
  @JsonProperty(JSON_PROPERTY_VALUE_HOUR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValueHour() {
    return valueHour;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_HOUR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValueHour(String valueHour) {
    this.valueHour = valueHour;
  }


  public ReceivablesTransaction valueDate(LocalDate valueDate) {
    
    this.valueDate = valueDate;
    return this;
  }

   /**
   * The date that the transactions occurred, according to the institution, in &#x60;YYYY-MM-DD&#x60; format.
   * @return valueDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Sun Jan 16 00:00:00 UTC 2022", required = true, value = "The date that the transactions occurred, according to the institution, in `YYYY-MM-DD` format.")
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


  public ReceivablesTransaction institutionTransactionId(String institutionTransactionId) {
    
    this.institutionTransactionId = institutionTransactionId;
    return this;
  }

   /**
   * Internal identification number that the acquirer uses to identify the transaction. ℹ️ **Note**: For Brazil, this number is the NSU.
   * @return institutionTransactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "134532345", required = true, value = "Internal identification number that the acquirer uses to identify the transaction. ℹ️ **Note**: For Brazil, this number is the NSU.")
  @JsonProperty(JSON_PROPERTY_INSTITUTION_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInstitutionTransactionId() {
    return institutionTransactionId;
  }


  @JsonProperty(JSON_PROPERTY_INSTITUTION_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstitutionTransactionId(String institutionTransactionId) {
    this.institutionTransactionId = institutionTransactionId;
  }


  public ReceivablesTransaction currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the transaction. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that currencies other than those listed above may be returned.
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BRL", required = true, value = "The currency of the transaction. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that currencies other than those listed above may be returned.")
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


  public ReceivablesTransaction type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of transaction. For example, whether the transaction was a &#x60;VISA_DEBIT&#x60; or a &#x60;MASTERCARD_CREDIT&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MASTERCARD_CREDIT", required = true, value = "The type of transaction. For example, whether the transaction was a `VISA_DEBIT` or a `MASTERCARD_CREDIT`.")
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


  public ReceivablesTransaction grossAmount(Float grossAmount) {
    
    this.grossAmount = grossAmount;
    return this;
  }

   /**
   * The total gross amount of the transaction.
   * @return grossAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "106.7", required = true, value = "The total gross amount of the transaction.")
  @JsonProperty(JSON_PROPERTY_GROSS_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getGrossAmount() {
    return grossAmount;
  }


  @JsonProperty(JSON_PROPERTY_GROSS_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGrossAmount(Float grossAmount) {
    this.grossAmount = grossAmount;
  }


  public ReceivablesTransaction netAmount(Float netAmount) {
    
    this.netAmount = netAmount;
    return this;
  }

   /**
   * The net amount of the transaction.
   * @return netAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "104.58", required = true, value = "The net amount of the transaction.")
  @JsonProperty(JSON_PROPERTY_NET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getNetAmount() {
    return netAmount;
  }


  @JsonProperty(JSON_PROPERTY_NET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNetAmount(Float netAmount) {
    this.netAmount = netAmount;
  }


  public ReceivablesTransaction fees(List<RecevablesTransactionFees> fees) {
    
    this.fees = fees;
    return this;
  }

  public ReceivablesTransaction addFeesItem(RecevablesTransactionFees feesItem) {
    this.fees.add(feesItem);
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RecevablesTransactionFees> getFees() {
    return fees;
  }


  @JsonProperty(JSON_PROPERTY_FEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFees(List<RecevablesTransactionFees> fees) {
    this.fees = fees;
  }


  public ReceivablesTransaction status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the transaction. Can be either:    - &#x60;APPROVED&#x60;   - &#x60;CANCELLED&#x60;   - &#x60;REVERTED&#x60;   - &#x60;UNCATEGORIZED&#x60;
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APPROVED", required = true, value = "The status of the transaction. Can be either:    - `APPROVED`   - `CANCELLED`   - `REVERTED`   - `UNCATEGORIZED`")
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


  public ReceivablesTransaction numberOfInstallments(ReceivablesTransactionNumberOfInstallments numberOfInstallments) {
    
    this.numberOfInstallments = numberOfInstallments;
    return this;
  }

   /**
   * Get numberOfInstallments
   * @return numberOfInstallments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_INSTALLMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReceivablesTransactionNumberOfInstallments getNumberOfInstallments() {
    return numberOfInstallments;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_INSTALLMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumberOfInstallments(ReceivablesTransactionNumberOfInstallments numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivablesTransaction receivablesTransaction = (ReceivablesTransaction) o;
    return Objects.equals(this.id, receivablesTransaction.id) &&
        Objects.equals(this.account, receivablesTransaction.account) &&
        Objects.equals(this.createdAt, receivablesTransaction.createdAt) &&
        Objects.equals(this.collectedAt, receivablesTransaction.collectedAt) &&
        Objects.equals(this.valueHour, receivablesTransaction.valueHour) &&
        Objects.equals(this.valueDate, receivablesTransaction.valueDate) &&
        Objects.equals(this.institutionTransactionId, receivablesTransaction.institutionTransactionId) &&
        Objects.equals(this.currency, receivablesTransaction.currency) &&
        Objects.equals(this.type, receivablesTransaction.type) &&
        Objects.equals(this.grossAmount, receivablesTransaction.grossAmount) &&
        Objects.equals(this.netAmount, receivablesTransaction.netAmount) &&
        Objects.equals(this.fees, receivablesTransaction.fees) &&
        Objects.equals(this.status, receivablesTransaction.status) &&
        Objects.equals(this.numberOfInstallments, receivablesTransaction.numberOfInstallments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, account, createdAt, collectedAt, valueHour, valueDate, institutionTransactionId, currency, type, grossAmount, netAmount, fees, status, numberOfInstallments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivablesTransaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    valueHour: ").append(toIndentedString(valueHour)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    institutionTransactionId: ").append(toIndentedString(institutionTransactionId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    numberOfInstallments: ").append(toIndentedString(numberOfInstallments)).append("\n");
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

