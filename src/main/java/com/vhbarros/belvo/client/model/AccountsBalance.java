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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Details regarding the current and available balances for the account. 
 */
@ApiModel(description = "Details regarding the current and available balances for the account. ")
@JsonPropertyOrder({
  AccountsBalance.JSON_PROPERTY_CURRENT,
  AccountsBalance.JSON_PROPERTY_AVAILABLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class AccountsBalance {
  public static final String JSON_PROPERTY_CURRENT = "current";
  private Float current;

  public static final String JSON_PROPERTY_AVAILABLE = "available";
  private JsonNullable<Float> available = JsonNullable.<Float>undefined();

  public AccountsBalance() {
  }

  public AccountsBalance current(Float current) {
    
    this.current = current;
    return this;
  }

   /**
   * The current balance is calculated differently according to the type of account.  - **💰 Checking and saving accounts**:  The user&#39;s account balance at the &#x60;collected_at&#x60; timestamp. - **💳 Credit cards**:  The amount the user has spent in the current card billing period (see &#x60;credit_data.cutting_date&#x60; for information on when the current billing period finishes). - **🏡 Loan accounts**:  The amount remaining to pay on the users&#39;s loan (same as &#x60;loan_data.outstanding_balance&#x60;). - **🚙 Gig economy accounts**:  The calculated amount the user has in their gig wallet.
   * @return current
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5874.13", required = true, value = "The current balance is calculated differently according to the type of account.  - **💰 Checking and saving accounts**:  The user's account balance at the `collected_at` timestamp. - **💳 Credit cards**:  The amount the user has spent in the current card billing period (see `credit_data.cutting_date` for information on when the current billing period finishes). - **🏡 Loan accounts**:  The amount remaining to pay on the users's loan (same as `loan_data.outstanding_balance`). - **🚙 Gig economy accounts**:  The calculated amount the user has in their gig wallet.")
  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getCurrent() {
    return current;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrent(Float current) {
    this.current = current;
  }


  public AccountsBalance available(Float available) {
    this.available = JsonNullable.<Float>of(available);
    
    return this;
  }

   /**
   * The balance that the account owner can use. - **💰 Checking and saving accounts**:  The available balance may be different to the &#x60;current&#x60; balance due to pending transactions. - **💳 Credit cards**:  The credit amount the user still has available for the current period. The amount is calculated as &#x60;credit_data.credit_limit&#x60; minus &#x60;balance.current&#x60;. - **🏡 Loan accounts**:  The present value required to pay off the loan, as provided by the institution.  **Note:** If the institution does not provide this value, we return &#x60;null&#x60;. - **🚙 Gig economy accounts**:  The amount the user currently has available in their gig wallet. This can differ from the &#x60;balance.current&#x60; in situations where the user has received a cash payment for a service and needs to charge their gig account with the amount they received in cash.
   * @return available
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5621.12", value = "The balance that the account owner can use. - **💰 Checking and saving accounts**:  The available balance may be different to the `current` balance due to pending transactions. - **💳 Credit cards**:  The credit amount the user still has available for the current period. The amount is calculated as `credit_data.credit_limit` minus `balance.current`. - **🏡 Loan accounts**:  The present value required to pay off the loan, as provided by the institution.  **Note:** If the institution does not provide this value, we return `null`. - **🚙 Gig economy accounts**:  The amount the user currently has available in their gig wallet. This can differ from the `balance.current` in situations where the user has received a cash payment for a service and needs to charge their gig account with the amount they received in cash.")
  @JsonIgnore

  public Float getAvailable() {
        return available.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Float> getAvailable_JsonNullable() {
    return available;
  }
  
  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  public void setAvailable_JsonNullable(JsonNullable<Float> available) {
    this.available = available;
  }

  public void setAvailable(Float available) {
    this.available = JsonNullable.<Float>of(available);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsBalance accountsBalance = (AccountsBalance) o;
    return Objects.equals(this.current, accountsBalance.current) &&
        equalsNullable(this.available, accountsBalance.available);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, hashCodeNullable(available));
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
    sb.append("class AccountsBalance {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

