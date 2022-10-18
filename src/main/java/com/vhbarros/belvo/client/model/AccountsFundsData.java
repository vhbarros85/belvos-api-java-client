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
import com.vhbarros.belvo.client.model.AccountsFundsDataPublicIdentifications;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AccountsFundsData
 */
@JsonPropertyOrder({
  AccountsFundsData.JSON_PROPERTY_NAME,
  AccountsFundsData.JSON_PROPERTY_TYPE,
  AccountsFundsData.JSON_PROPERTY_PUBLIC_IDENTIFICATIONS,
  AccountsFundsData.JSON_PROPERTY_BALANCE,
  AccountsFundsData.JSON_PROPERTY_PERCENTAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class AccountsFundsData {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PUBLIC_IDENTIFICATIONS = "public_identifications";
  private JsonNullable<List<AccountsFundsDataPublicIdentifications>> publicIdentifications = JsonNullable.<List<AccountsFundsDataPublicIdentifications>>undefined();

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private JsonNullable<String> balance = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERCENTAGE = "percentage";
  private JsonNullable<String> percentage = JsonNullable.<String>undefined();

  public AccountsFundsData() {
  }

  public AccountsFundsData name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * The pension fund name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FIX X", value = "The pension fund name.")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public AccountsFundsData type(String type) {
    this.type = JsonNullable.<String>of(type);
    
    return this;
  }

   /**
   * Type of pension fund.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CNPJ", value = "Type of pension fund.")
  @JsonIgnore

  public String getType() {
        return type.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getType_JsonNullable() {
    return type;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<String> type) {
    this.type = type;
  }

  public void setType(String type) {
    this.type = JsonNullable.<String>of(type);
  }


  public AccountsFundsData publicIdentifications(List<AccountsFundsDataPublicIdentifications> publicIdentifications) {
    this.publicIdentifications = JsonNullable.<List<AccountsFundsDataPublicIdentifications>>of(publicIdentifications);
    
    return this;
  }

  public AccountsFundsData addPublicIdentificationsItem(AccountsFundsDataPublicIdentifications publicIdentificationsItem) {
    if (this.publicIdentifications == null || !this.publicIdentifications.isPresent()) {
      this.publicIdentifications = JsonNullable.<List<AccountsFundsDataPublicIdentifications>>of(new ArrayList<>());
    }
    try {
      this.publicIdentifications.get().add(publicIdentificationsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The fund&#39;s public IDs.
   * @return publicIdentifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The fund's public IDs.")
  @JsonIgnore

  public List<AccountsFundsDataPublicIdentifications> getPublicIdentifications() {
        return publicIdentifications.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUBLIC_IDENTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AccountsFundsDataPublicIdentifications>> getPublicIdentifications_JsonNullable() {
    return publicIdentifications;
  }
  
  @JsonProperty(JSON_PROPERTY_PUBLIC_IDENTIFICATIONS)
  public void setPublicIdentifications_JsonNullable(JsonNullable<List<AccountsFundsDataPublicIdentifications>> publicIdentifications) {
    this.publicIdentifications = publicIdentifications;
  }

  public void setPublicIdentifications(List<AccountsFundsDataPublicIdentifications> publicIdentifications) {
    this.publicIdentifications = JsonNullable.<List<AccountsFundsDataPublicIdentifications>>of(publicIdentifications);
  }


  public AccountsFundsData balance(String balance) {
    this.balance = JsonNullable.<String>of(balance);
    
    return this;
  }

   /**
   * The amount in the fund.
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "88427.94", value = "The amount in the fund.")
  @JsonIgnore

  public String getBalance() {
        return balance.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBalance_JsonNullable() {
    return balance;
  }
  
  @JsonProperty(JSON_PROPERTY_BALANCE)
  public void setBalance_JsonNullable(JsonNullable<String> balance) {
    this.balance = balance;
  }

  public void setBalance(String balance) {
    this.balance = JsonNullable.<String>of(balance);
  }


  public AccountsFundsData percentage(String percentage) {
    this.percentage = JsonNullable.<String>of(percentage);
    
    return this;
  }

   /**
   * How much this fund, as a percentage, contributes to the pension account&#39;s total.
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "How much this fund, as a percentage, contributes to the pension account's total.")
  @JsonIgnore

  public String getPercentage() {
        return percentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPercentage_JsonNullable() {
    return percentage;
  }
  
  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  public void setPercentage_JsonNullable(JsonNullable<String> percentage) {
    this.percentage = percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = JsonNullable.<String>of(percentage);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsFundsData accountsFundsData = (AccountsFundsData) o;
    return equalsNullable(this.name, accountsFundsData.name) &&
        equalsNullable(this.type, accountsFundsData.type) &&
        equalsNullable(this.publicIdentifications, accountsFundsData.publicIdentifications) &&
        equalsNullable(this.balance, accountsFundsData.balance) &&
        equalsNullable(this.percentage, accountsFundsData.percentage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(type), hashCodeNullable(publicIdentifications), hashCodeNullable(balance), hashCodeNullable(percentage));
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
    sb.append("class AccountsFundsData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    publicIdentifications: ").append(toIndentedString(publicIdentifications)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

