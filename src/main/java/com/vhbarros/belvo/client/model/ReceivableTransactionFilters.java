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
 * ReceivableTransactionFilters
 */
@JsonPropertyOrder({
  ReceivableTransactionFilters.JSON_PROPERTY_ACCOUNT_IN,
  ReceivableTransactionFilters.JSON_PROPERTY_CREATED_AT,
  ReceivableTransactionFilters.JSON_PROPERTY_CREATED_AT_LT,
  ReceivableTransactionFilters.JSON_PROPERTY_CREATED_AT_LTE,
  ReceivableTransactionFilters.JSON_PROPERTY_CREATED_AT_GT,
  ReceivableTransactionFilters.JSON_PROPERTY_CREATED_AT_GTE,
  ReceivableTransactionFilters.JSON_PROPERTY_CREATED_AT_RANGE,
  ReceivableTransactionFilters.JSON_PROPERTY_LINK_IN,
  ReceivableTransactionFilters.JSON_PROPERTY_VALUE_DATE,
  ReceivableTransactionFilters.JSON_PROPERTY_VALUE_DATE_GT,
  ReceivableTransactionFilters.JSON_PROPERTY_VALUE_DATE_LT,
  ReceivableTransactionFilters.JSON_PROPERTY_VALUE_DATE_GTE,
  ReceivableTransactionFilters.JSON_PROPERTY_VALUE_DATE_LTE,
  ReceivableTransactionFilters.JSON_PROPERTY_VALUE_DATE_RANGE
})
@JsonTypeName("receivableTransactionFilters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class ReceivableTransactionFilters {
  public static final String JSON_PROPERTY_ACCOUNT_IN = "account__in";
  private String accountIn;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_CREATED_AT_LT = "created_at__lt";
  private String createdAtLt;

  public static final String JSON_PROPERTY_CREATED_AT_LTE = "created_at__lte";
  private String createdAtLte;

  public static final String JSON_PROPERTY_CREATED_AT_GT = "created_at__gt";
  private String createdAtGt;

  public static final String JSON_PROPERTY_CREATED_AT_GTE = "created_at__gte";
  private String createdAtGte;

  public static final String JSON_PROPERTY_CREATED_AT_RANGE = "created_at__range";
  private String createdAtRange;

  public static final String JSON_PROPERTY_LINK_IN = "link__in";
  private String linkIn;

  public static final String JSON_PROPERTY_VALUE_DATE = "value_date";
  private String valueDate;

  public static final String JSON_PROPERTY_VALUE_DATE_GT = "value_date__gt";
  private String valueDateGt;

  public static final String JSON_PROPERTY_VALUE_DATE_LT = "value_date__lt";
  private String valueDateLt;

  public static final String JSON_PROPERTY_VALUE_DATE_GTE = "value_date__gte";
  private String valueDateGte;

  public static final String JSON_PROPERTY_VALUE_DATE_LTE = "value_date__lte";
  private String valueDateLte;

  public static final String JSON_PROPERTY_VALUE_DATE_RANGE = "value_date__range";
  private String valueDateRange;

  public ReceivableTransactionFilters() {
  }

  public ReceivableTransactionFilters accountIn(String accountIn) {
    
    this.accountIn = accountIn;
    return this;
  }

   /**
   * Get accountIn
   * @return accountIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountIn() {
    return accountIn;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountIn(String accountIn) {
    this.accountIn = accountIn;
  }


  public ReceivableTransactionFilters createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public ReceivableTransactionFilters createdAtLt(String createdAtLt) {
    
    this.createdAtLt = createdAtLt;
    return this;
  }

   /**
   * Get createdAtLt
   * @return createdAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAtLt() {
    return createdAtLt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtLt(String createdAtLt) {
    this.createdAtLt = createdAtLt;
  }


  public ReceivableTransactionFilters createdAtLte(String createdAtLte) {
    
    this.createdAtLte = createdAtLte;
    return this;
  }

   /**
   * Get createdAtLte
   * @return createdAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAtLte() {
    return createdAtLte;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtLte(String createdAtLte) {
    this.createdAtLte = createdAtLte;
  }


  public ReceivableTransactionFilters createdAtGt(String createdAtGt) {
    
    this.createdAtGt = createdAtGt;
    return this;
  }

   /**
   * Get createdAtGt
   * @return createdAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAtGt() {
    return createdAtGt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtGt(String createdAtGt) {
    this.createdAtGt = createdAtGt;
  }


  public ReceivableTransactionFilters createdAtGte(String createdAtGte) {
    
    this.createdAtGte = createdAtGte;
    return this;
  }

   /**
   * Get createdAtGte
   * @return createdAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAtGte() {
    return createdAtGte;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtGte(String createdAtGte) {
    this.createdAtGte = createdAtGte;
  }


  public ReceivableTransactionFilters createdAtRange(String createdAtRange) {
    
    this.createdAtRange = createdAtRange;
    return this;
  }

   /**
   * Get createdAtRange
   * @return createdAtRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAtRange() {
    return createdAtRange;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtRange(String createdAtRange) {
    this.createdAtRange = createdAtRange;
  }


  public ReceivableTransactionFilters linkIn(String linkIn) {
    
    this.linkIn = linkIn;
    return this;
  }

   /**
   * Get linkIn
   * @return linkIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINK_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkIn() {
    return linkIn;
  }


  @JsonProperty(JSON_PROPERTY_LINK_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkIn(String linkIn) {
    this.linkIn = linkIn;
  }


  public ReceivableTransactionFilters valueDate(String valueDate) {
    
    this.valueDate = valueDate;
    return this;
  }

   /**
   * Get valueDate
   * @return valueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueDate() {
    return valueDate;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }


  public ReceivableTransactionFilters valueDateGt(String valueDateGt) {
    
    this.valueDateGt = valueDateGt;
    return this;
  }

   /**
   * Get valueDateGt
   * @return valueDateGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueDateGt() {
    return valueDateGt;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_DATE_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueDateGt(String valueDateGt) {
    this.valueDateGt = valueDateGt;
  }


  public ReceivableTransactionFilters valueDateLt(String valueDateLt) {
    
    this.valueDateLt = valueDateLt;
    return this;
  }

   /**
   * Get valueDateLt
   * @return valueDateLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueDateLt() {
    return valueDateLt;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_DATE_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueDateLt(String valueDateLt) {
    this.valueDateLt = valueDateLt;
  }


  public ReceivableTransactionFilters valueDateGte(String valueDateGte) {
    
    this.valueDateGte = valueDateGte;
    return this;
  }

   /**
   * Get valueDateGte
   * @return valueDateGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueDateGte() {
    return valueDateGte;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_DATE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueDateGte(String valueDateGte) {
    this.valueDateGte = valueDateGte;
  }


  public ReceivableTransactionFilters valueDateLte(String valueDateLte) {
    
    this.valueDateLte = valueDateLte;
    return this;
  }

   /**
   * Get valueDateLte
   * @return valueDateLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueDateLte() {
    return valueDateLte;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_DATE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueDateLte(String valueDateLte) {
    this.valueDateLte = valueDateLte;
  }


  public ReceivableTransactionFilters valueDateRange(String valueDateRange) {
    
    this.valueDateRange = valueDateRange;
    return this;
  }

   /**
   * Get valueDateRange
   * @return valueDateRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueDateRange() {
    return valueDateRange;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueDateRange(String valueDateRange) {
    this.valueDateRange = valueDateRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivableTransactionFilters receivableTransactionFilters = (ReceivableTransactionFilters) o;
    return Objects.equals(this.accountIn, receivableTransactionFilters.accountIn) &&
        Objects.equals(this.createdAt, receivableTransactionFilters.createdAt) &&
        Objects.equals(this.createdAtLt, receivableTransactionFilters.createdAtLt) &&
        Objects.equals(this.createdAtLte, receivableTransactionFilters.createdAtLte) &&
        Objects.equals(this.createdAtGt, receivableTransactionFilters.createdAtGt) &&
        Objects.equals(this.createdAtGte, receivableTransactionFilters.createdAtGte) &&
        Objects.equals(this.createdAtRange, receivableTransactionFilters.createdAtRange) &&
        Objects.equals(this.linkIn, receivableTransactionFilters.linkIn) &&
        Objects.equals(this.valueDate, receivableTransactionFilters.valueDate) &&
        Objects.equals(this.valueDateGt, receivableTransactionFilters.valueDateGt) &&
        Objects.equals(this.valueDateLt, receivableTransactionFilters.valueDateLt) &&
        Objects.equals(this.valueDateGte, receivableTransactionFilters.valueDateGte) &&
        Objects.equals(this.valueDateLte, receivableTransactionFilters.valueDateLte) &&
        Objects.equals(this.valueDateRange, receivableTransactionFilters.valueDateRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIn, createdAt, createdAtLt, createdAtLte, createdAtGt, createdAtGte, createdAtRange, linkIn, valueDate, valueDateGt, valueDateLt, valueDateGte, valueDateLte, valueDateRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivableTransactionFilters {\n");
    sb.append("    accountIn: ").append(toIndentedString(accountIn)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtRange: ").append(toIndentedString(createdAtRange)).append("\n");
    sb.append("    linkIn: ").append(toIndentedString(linkIn)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    valueDateGt: ").append(toIndentedString(valueDateGt)).append("\n");
    sb.append("    valueDateLt: ").append(toIndentedString(valueDateLt)).append("\n");
    sb.append("    valueDateGte: ").append(toIndentedString(valueDateGte)).append("\n");
    sb.append("    valueDateLte: ").append(toIndentedString(valueDateLte)).append("\n");
    sb.append("    valueDateRange: ").append(toIndentedString(valueDateRange)).append("\n");
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

