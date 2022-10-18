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
import com.vhbarros.belvo.client.model.AccountsBalance;
import com.vhbarros.belvo.client.model.AccountsCreditData;
import com.vhbarros.belvo.client.model.AccountsFundsData;
import com.vhbarros.belvo.client.model.AccountsGigPaymentData;
import com.vhbarros.belvo.client.model.AccountsLoanData;
import com.vhbarros.belvo.client.model.AccountsReceivablesData;
import com.vhbarros.belvo.client.model.InstitutionAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Details regarding the account.  **Note**: For our recurring expenses resource, this account relates to the account that was analyzed to generate the recurring expenses report. 
 */
@ApiModel(description = "Details regarding the account.  **Note**: For our recurring expenses resource, this account relates to the account that was analyzed to generate the recurring expenses report. ")
@JsonPropertyOrder({
  Account.JSON_PROPERTY_ID,
  Account.JSON_PROPERTY_LINK,
  Account.JSON_PROPERTY_INSTITUTION,
  Account.JSON_PROPERTY_COLLECTED_AT,
  Account.JSON_PROPERTY_CREATED_AT,
  Account.JSON_PROPERTY_CATEGORY,
  Account.JSON_PROPERTY_BALANCE_TYPE,
  Account.JSON_PROPERTY_TYPE,
  Account.JSON_PROPERTY_NAME,
  Account.JSON_PROPERTY_NUMBER,
  Account.JSON_PROPERTY_BALANCE,
  Account.JSON_PROPERTY_CURRENCY,
  Account.JSON_PROPERTY_PUBLIC_IDENTIFICATION_NAME,
  Account.JSON_PROPERTY_PUBLIC_IDENTIFICATION_VALUE,
  Account.JSON_PROPERTY_LAST_ACCESSED_AT,
  Account.JSON_PROPERTY_CREDIT_DATA,
  Account.JSON_PROPERTY_LOAN_DATA,
  Account.JSON_PROPERTY_FUNDS_DATA,
  Account.JSON_PROPERTY_GIG_PAYMENT_DATA,
  Account.JSON_PROPERTY_RECEIVABLES_DATA,
  Account.JSON_PROPERTY_BANK_PRODUCT_ID,
  Account.JSON_PROPERTY_INTERNAL_IDENTIFICATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class Account {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_LINK = "link";
  private JsonNullable<String> link = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INSTITUTION = "institution";
  private InstitutionAccount institution;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private OffsetDateTime collectedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  /**
   * The type of account. For Gig economy institutions, the account type refers to their gig role (delivery or driver). We return one of the following enum values:   - &#x60;CHECKING_ACCOUNT&#x60;   - &#x60;CREDIT_CARD&#x60;   - &#x60;DELIVERY_ACCOUNT&#x60;   - &#x60;DRIVER_ACCOUNT&#x60;   - &#x60;INVESTMENT_ACCOUNT&#x60;   - &#x60;LOAN_ACCOUNT&#x60;   - &#x60;PENSION_FUND_ACCOUNT&#x60;   - &#x60;RECEIVABLES_ACCOUNT&#x60;   - &#x60;SAVINGS_ACCOUNT&#x60;   - &#x60;UNCATEGORIZED&#x60; 
   */
  public enum CategoryEnum {
    CHECKING_ACCOUNT("CHECKING_ACCOUNT"),
    
    CREDIT_CARD("CREDIT_CARD"),
    
    DELIVERY_ACCOUNT("DELIVERY_ACCOUNT"),
    
    DRIVER_ACCOUNT("DRIVER_ACCOUNT"),
    
    INVESTMENT_ACCOUNT("INVESTMENT_ACCOUNT"),
    
    LOAN_ACCOUNT("LOAN_ACCOUNT"),
    
    PENSION_FUND_ACCOUNT("PENSION_FUND_ACCOUNT"),
    
    RECEIVABLES_ACCOUNT("RECEIVABLES_ACCOUNT"),
    
    SAVINGS_ACCOUNT("SAVINGS_ACCOUNT"),
    
    UNCATEGORIZED("UNCATEGORIZED");

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
  private CategoryEnum category;

  public static final String JSON_PROPERTY_BALANCE_TYPE = "balance_type";
  private String balanceType;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private AccountsBalance balance;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_PUBLIC_IDENTIFICATION_NAME = "public_identification_name";
  private String publicIdentificationName;

  public static final String JSON_PROPERTY_PUBLIC_IDENTIFICATION_VALUE = "public_identification_value";
  private String publicIdentificationValue;

  public static final String JSON_PROPERTY_LAST_ACCESSED_AT = "last_accessed_at";
  private OffsetDateTime lastAccessedAt;

  public static final String JSON_PROPERTY_CREDIT_DATA = "credit_data";
  private AccountsCreditData creditData;

  public static final String JSON_PROPERTY_LOAN_DATA = "loan_data";
  private AccountsLoanData loanData;

  public static final String JSON_PROPERTY_FUNDS_DATA = "funds_data";
  private JsonNullable<List<AccountsFundsData>> fundsData = JsonNullable.<List<AccountsFundsData>>undefined();

  public static final String JSON_PROPERTY_GIG_PAYMENT_DATA = "gig_payment_data";
  private JsonNullable<AccountsGigPaymentData> gigPaymentData = JsonNullable.<AccountsGigPaymentData>undefined();

  public static final String JSON_PROPERTY_RECEIVABLES_DATA = "receivables_data";
  private JsonNullable<AccountsReceivablesData> receivablesData = JsonNullable.<AccountsReceivablesData>undefined();

  public static final String JSON_PROPERTY_BANK_PRODUCT_ID = "bank_product_id";
  private JsonNullable<String> bankProductId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INTERNAL_IDENTIFICATION = "internal_identification";
  private JsonNullable<String> internalIdentification = JsonNullable.<String>undefined();

  public Account() {
  }

  public Account id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier created by Belvo used to reference the current account.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0d3ffb69-f83b-456e-ad8e-208d0998d71d", value = "The unique identifier created by Belvo used to reference the current account.")
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


  public Account link(String link) {
    this.link = JsonNullable.<String>of(link);
    
    return this;
  }

   /**
   * The &#x60;link.id&#x60; the account belongs to.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", value = "The `link.id` the account belongs to.")
  @JsonIgnore

  public String getLink() {
        return link.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLink_JsonNullable() {
    return link;
  }
  
  @JsonProperty(JSON_PROPERTY_LINK)
  public void setLink_JsonNullable(JsonNullable<String> link) {
    this.link = link;
  }

  public void setLink(String link) {
    this.link = JsonNullable.<String>of(link);
  }


  public Account institution(InstitutionAccount institution) {
    
    this.institution = institution;
    return this;
  }

   /**
   * Get institution
   * @return institution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTITUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InstitutionAccount getInstitution() {
    return institution;
  }


  @JsonProperty(JSON_PROPERTY_INSTITUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstitution(InstitutionAccount institution) {
    this.institution = institution;
  }


  public Account collectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-09-27T13:01:41.941Z", required = true, value = "The ISO-8601 timestamp when the data point was collected.")
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


  public Account createdAt(OffsetDateTime createdAt) {
    
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


  public Account category(CategoryEnum category) {
    
    this.category = category;
    return this;
  }

   /**
   * The type of account. For Gig economy institutions, the account type refers to their gig role (delivery or driver). We return one of the following enum values:   - &#x60;CHECKING_ACCOUNT&#x60;   - &#x60;CREDIT_CARD&#x60;   - &#x60;DELIVERY_ACCOUNT&#x60;   - &#x60;DRIVER_ACCOUNT&#x60;   - &#x60;INVESTMENT_ACCOUNT&#x60;   - &#x60;LOAN_ACCOUNT&#x60;   - &#x60;PENSION_FUND_ACCOUNT&#x60;   - &#x60;RECEIVABLES_ACCOUNT&#x60;   - &#x60;SAVINGS_ACCOUNT&#x60;   - &#x60;UNCATEGORIZED&#x60; 
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CHECKING_ACCOUNT", required = true, value = "The type of account. For Gig economy institutions, the account type refers to their gig role (delivery or driver). We return one of the following enum values:   - `CHECKING_ACCOUNT`   - `CREDIT_CARD`   - `DELIVERY_ACCOUNT`   - `DRIVER_ACCOUNT`   - `INVESTMENT_ACCOUNT`   - `LOAN_ACCOUNT`   - `PENSION_FUND_ACCOUNT`   - `RECEIVABLES_ACCOUNT`   - `SAVINGS_ACCOUNT`   - `UNCATEGORIZED` ")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CategoryEnum getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  public Account balanceType(String balanceType) {
    
    this.balanceType = balanceType;
    return this;
  }

   /**
   * Indicates whether this account is either an &#x60;ASSET&#x60; or a &#x60;LIABILITY&#x60;. You can consider the balance of an &#x60;ASSET&#x60; as being positive, while the balance of a &#x60;LIABILITY&#x60; as negative.  ℹ️ **Note**: Due to the nature of cash payments in gig-economy institutions, the &#x60;balance.current&#x60; and &#x60;balance.available&#x60; may indicate that the gig-economy user has a negative balance. However, this is still considered an &#x60;ASSET&#x60; as the gig-economy user has received payment for their services. 
   * @return balanceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ASSET", required = true, value = "Indicates whether this account is either an `ASSET` or a `LIABILITY`. You can consider the balance of an `ASSET` as being positive, while the balance of a `LIABILITY` as negative.  ℹ️ **Note**: Due to the nature of cash payments in gig-economy institutions, the `balance.current` and `balance.available` may indicate that the gig-economy user has a negative balance. However, this is still considered an `ASSET` as the gig-economy user has received payment for their services. ")
  @JsonProperty(JSON_PROPERTY_BALANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBalanceType() {
    return balanceType;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalanceType(String balanceType) {
    this.balanceType = balanceType;
  }


  public Account type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The account type, as designated by the institution.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Cuentas de efectivo", required = true, value = "The account type, as designated by the institution.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public Account name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The account name, as given by the institution.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Cuenta Perfiles- M.N. - MXN-666", required = true, value = "The account name, as given by the institution.")
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


  public Account number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * The account number, as designated by the institution.
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4057068115181", required = true, value = "The account number, as designated by the institution.")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumber(String number) {
    this.number = number;
  }


  public Account balance(AccountsBalance balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccountsBalance getBalance() {
    return balance;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalance(AccountsBalance balance) {
    this.balance = balance;
  }


  public Account currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the account. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MXN", required = true, value = "The currency of the account. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned.")
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


  public Account publicIdentificationName(String publicIdentificationName) {
    
    this.publicIdentificationName = publicIdentificationName;
    return this;
  }

   /**
   * The public name for the type of identification. For example: &#x60;\&quot;CLABE\&quot;&#x60;.  ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be &#x60;AGENCY/ACCOUNT&#x60;. 
   * @return publicIdentificationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CLABE", required = true, value = "The public name for the type of identification. For example: `\"CLABE\"`.  ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be `AGENCY/ACCOUNT`. ")
  @JsonProperty(JSON_PROPERTY_PUBLIC_IDENTIFICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPublicIdentificationName() {
    return publicIdentificationName;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_IDENTIFICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPublicIdentificationName(String publicIdentificationName) {
    this.publicIdentificationName = publicIdentificationName;
  }


  public Account publicIdentificationValue(String publicIdentificationValue) {
    
    this.publicIdentificationValue = publicIdentificationValue;
    return this;
  }

   /**
   * The value for the &#x60;public_identification_name&#x60;.  ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be the agency and bank account number, separated by a slash. For example: &#x60;0444/45722-0&#x60;. 
   * @return publicIdentificationValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "150194683119900273", required = true, value = "The value for the `public_identification_name`.  ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be the agency and bank account number, separated by a slash. For example: `0444/45722-0`. ")
  @JsonProperty(JSON_PROPERTY_PUBLIC_IDENTIFICATION_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPublicIdentificationValue() {
    return publicIdentificationValue;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_IDENTIFICATION_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPublicIdentificationValue(String publicIdentificationValue) {
    this.publicIdentificationValue = publicIdentificationValue;
  }


  public Account lastAccessedAt(OffsetDateTime lastAccessedAt) {
    
    this.lastAccessedAt = lastAccessedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of Belvo&#39;s most recent successful access to the institution for the given link.
   * @return lastAccessedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-09T10:28:40Z", required = true, value = "The ISO-8601 timestamp of Belvo's most recent successful access to the institution for the given link.")
  @JsonProperty(JSON_PROPERTY_LAST_ACCESSED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getLastAccessedAt() {
    return lastAccessedAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_ACCESSED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastAccessedAt(OffsetDateTime lastAccessedAt) {
    this.lastAccessedAt = lastAccessedAt;
  }


  public Account creditData(AccountsCreditData creditData) {
    
    this.creditData = creditData;
    return this;
  }

   /**
   * Get creditData
   * @return creditData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CREDIT_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccountsCreditData getCreditData() {
    return creditData;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditData(AccountsCreditData creditData) {
    this.creditData = creditData;
  }


  public Account loanData(AccountsLoanData loanData) {
    
    this.loanData = loanData;
    return this;
  }

   /**
   * Get loanData
   * @return loanData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOAN_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccountsLoanData getLoanData() {
    return loanData;
  }


  @JsonProperty(JSON_PROPERTY_LOAN_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLoanData(AccountsLoanData loanData) {
    this.loanData = loanData;
  }


  public Account fundsData(List<AccountsFundsData> fundsData) {
    this.fundsData = JsonNullable.<List<AccountsFundsData>>of(fundsData);
    
    return this;
  }

  public Account addFundsDataItem(AccountsFundsData fundsDataItem) {
    if (this.fundsData == null || !this.fundsData.isPresent()) {
      this.fundsData = JsonNullable.<List<AccountsFundsData>>of(new ArrayList<>());
    }
    try {
      this.fundsData.get().add(fundsDataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * One or more funds that contribute to the the pension account.
   * @return fundsData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One or more funds that contribute to the the pension account.")
  @JsonIgnore

  public List<AccountsFundsData> getFundsData() {
        return fundsData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FUNDS_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AccountsFundsData>> getFundsData_JsonNullable() {
    return fundsData;
  }
  
  @JsonProperty(JSON_PROPERTY_FUNDS_DATA)
  public void setFundsData_JsonNullable(JsonNullable<List<AccountsFundsData>> fundsData) {
    this.fundsData = fundsData;
  }

  public void setFundsData(List<AccountsFundsData> fundsData) {
    this.fundsData = JsonNullable.<List<AccountsFundsData>>of(fundsData);
  }


  public Account gigPaymentData(AccountsGigPaymentData gigPaymentData) {
    this.gigPaymentData = JsonNullable.<AccountsGigPaymentData>of(gigPaymentData);
    
    return this;
  }

   /**
   * Get gigPaymentData
   * @return gigPaymentData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public AccountsGigPaymentData getGigPaymentData() {
        return gigPaymentData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GIG_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AccountsGigPaymentData> getGigPaymentData_JsonNullable() {
    return gigPaymentData;
  }
  
  @JsonProperty(JSON_PROPERTY_GIG_PAYMENT_DATA)
  public void setGigPaymentData_JsonNullable(JsonNullable<AccountsGigPaymentData> gigPaymentData) {
    this.gigPaymentData = gigPaymentData;
  }

  public void setGigPaymentData(AccountsGigPaymentData gigPaymentData) {
    this.gigPaymentData = JsonNullable.<AccountsGigPaymentData>of(gigPaymentData);
  }


  public Account receivablesData(AccountsReceivablesData receivablesData) {
    this.receivablesData = JsonNullable.<AccountsReceivablesData>of(receivablesData);
    
    return this;
  }

   /**
   * Get receivablesData
   * @return receivablesData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public AccountsReceivablesData getReceivablesData() {
        return receivablesData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECEIVABLES_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AccountsReceivablesData> getReceivablesData_JsonNullable() {
    return receivablesData;
  }
  
  @JsonProperty(JSON_PROPERTY_RECEIVABLES_DATA)
  public void setReceivablesData_JsonNullable(JsonNullable<AccountsReceivablesData> receivablesData) {
    this.receivablesData = receivablesData;
  }

  public void setReceivablesData(AccountsReceivablesData receivablesData) {
    this.receivablesData = JsonNullable.<AccountsReceivablesData>of(receivablesData);
  }


  public Account bankProductId(String bankProductId) {
    this.bankProductId = JsonNullable.<String>of(bankProductId);
    
    return this;
  }

   /**
   * *This field has been deprecated.*  *The institution&#39;s product ID for the account type.* 
   * @return bankProductId
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.*  *The institution's product ID for the account type.* ")
  @JsonIgnore

  public String getBankProductId() {
        return bankProductId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BANK_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBankProductId_JsonNullable() {
    return bankProductId;
  }
  
  @JsonProperty(JSON_PROPERTY_BANK_PRODUCT_ID)
  public void setBankProductId_JsonNullable(JsonNullable<String> bankProductId) {
    this.bankProductId = bankProductId;
  }

  public void setBankProductId(String bankProductId) {
    this.bankProductId = JsonNullable.<String>of(bankProductId);
  }


  public Account internalIdentification(String internalIdentification) {
    this.internalIdentification = JsonNullable.<String>of(internalIdentification);
    
    return this;
  }

   /**
   * *This field has been deprecated.*  *The institution&#39;s internal identification for the account.* 
   * @return internalIdentification
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.*  *The institution's internal identification for the account.* ")
  @JsonIgnore

  public String getInternalIdentification() {
        return internalIdentification.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTERNAL_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInternalIdentification_JsonNullable() {
    return internalIdentification;
  }
  
  @JsonProperty(JSON_PROPERTY_INTERNAL_IDENTIFICATION)
  public void setInternalIdentification_JsonNullable(JsonNullable<String> internalIdentification) {
    this.internalIdentification = internalIdentification;
  }

  public void setInternalIdentification(String internalIdentification) {
    this.internalIdentification = JsonNullable.<String>of(internalIdentification);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        equalsNullable(this.link, account.link) &&
        Objects.equals(this.institution, account.institution) &&
        Objects.equals(this.collectedAt, account.collectedAt) &&
        Objects.equals(this.createdAt, account.createdAt) &&
        Objects.equals(this.category, account.category) &&
        Objects.equals(this.balanceType, account.balanceType) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.number, account.number) &&
        Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.currency, account.currency) &&
        Objects.equals(this.publicIdentificationName, account.publicIdentificationName) &&
        Objects.equals(this.publicIdentificationValue, account.publicIdentificationValue) &&
        Objects.equals(this.lastAccessedAt, account.lastAccessedAt) &&
        Objects.equals(this.creditData, account.creditData) &&
        Objects.equals(this.loanData, account.loanData) &&
        equalsNullable(this.fundsData, account.fundsData) &&
        equalsNullable(this.gigPaymentData, account.gigPaymentData) &&
        equalsNullable(this.receivablesData, account.receivablesData) &&
        equalsNullable(this.bankProductId, account.bankProductId) &&
        equalsNullable(this.internalIdentification, account.internalIdentification);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(link), institution, collectedAt, createdAt, category, balanceType, type, name, number, balance, currency, publicIdentificationName, publicIdentificationValue, lastAccessedAt, creditData, loanData, hashCodeNullable(fundsData), hashCodeNullable(gigPaymentData), hashCodeNullable(receivablesData), hashCodeNullable(bankProductId), hashCodeNullable(internalIdentification));
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
    sb.append("class Account {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    publicIdentificationName: ").append(toIndentedString(publicIdentificationName)).append("\n");
    sb.append("    publicIdentificationValue: ").append(toIndentedString(publicIdentificationValue)).append("\n");
    sb.append("    lastAccessedAt: ").append(toIndentedString(lastAccessedAt)).append("\n");
    sb.append("    creditData: ").append(toIndentedString(creditData)).append("\n");
    sb.append("    loanData: ").append(toIndentedString(loanData)).append("\n");
    sb.append("    fundsData: ").append(toIndentedString(fundsData)).append("\n");
    sb.append("    gigPaymentData: ").append(toIndentedString(gigPaymentData)).append("\n");
    sb.append("    receivablesData: ").append(toIndentedString(receivablesData)).append("\n");
    sb.append("    bankProductId: ").append(toIndentedString(bankProductId)).append("\n");
    sb.append("    internalIdentification: ").append(toIndentedString(internalIdentification)).append("\n");
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

