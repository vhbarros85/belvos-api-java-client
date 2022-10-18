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
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Details regarding the taxpayer.
 */
@ApiModel(description = "Details regarding the taxpayer.")
@JsonPropertyOrder({
  TaxStatusTaxPayerInformation.JSON_PROPERTY_RFC,
  TaxStatusTaxPayerInformation.JSON_PROPERTY_CURP,
  TaxStatusTaxPayerInformation.JSON_PROPERTY_NAME,
  TaxStatusTaxPayerInformation.JSON_PROPERTY_FIRST_LAST_NAME,
  TaxStatusTaxPayerInformation.JSON_PROPERTY_SECOND_LAST_NAME,
  TaxStatusTaxPayerInformation.JSON_PROPERTY_START_OPERATIONS_DATE,
  TaxStatusTaxPayerInformation.JSON_PROPERTY_STATUS_PADRON,
  TaxStatusTaxPayerInformation.JSON_PROPERTY_LAST_STATUS_CHANGE_DATE,
  TaxStatusTaxPayerInformation.JSON_PROPERTY_COMMERCIAL_NAME,
  TaxStatusTaxPayerInformation.JSON_PROPERTY_SOCIAL_NAME,
  TaxStatusTaxPayerInformation.JSON_PROPERTY_EMAIL,
  TaxStatusTaxPayerInformation.JSON_PROPERTY_PHONE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class TaxStatusTaxPayerInformation {
  public static final String JSON_PROPERTY_RFC = "rfc";
  private String rfc;

  public static final String JSON_PROPERTY_CURP = "curp";
  private JsonNullable<String> curp = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FIRST_LAST_NAME = "first_last_name";
  private JsonNullable<String> firstLastName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SECOND_LAST_NAME = "second_last_name";
  private JsonNullable<String> secondLastName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_START_OPERATIONS_DATE = "start_operations_date";
  private LocalDate startOperationsDate;

  public static final String JSON_PROPERTY_STATUS_PADRON = "status_padron";
  private String statusPadron;

  public static final String JSON_PROPERTY_LAST_STATUS_CHANGE_DATE = "last_status_change_date";
  private LocalDate lastStatusChangeDate;

  public static final String JSON_PROPERTY_COMMERCIAL_NAME = "commercial_name";
  private JsonNullable<String> commercialName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOCIAL_NAME = "social_name";
  private JsonNullable<String> socialName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PHONE = "phone";
  private JsonNullable<String> phone = JsonNullable.<String>undefined();

  public TaxStatusTaxPayerInformation() {
  }

  public TaxStatusTaxPayerInformation rfc(String rfc) {
    
    this.rfc = rfc;
    return this;
  }

   /**
   * The tax payers&#39;s RFC number.
   * @return rfc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BEMP12345G58", required = true, value = "The tax payers's RFC number.")
  @JsonProperty(JSON_PROPERTY_RFC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRfc() {
    return rfc;
  }


  @JsonProperty(JSON_PROPERTY_RFC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRfc(String rfc) {
    this.rfc = rfc;
  }


  public TaxStatusTaxPayerInformation curp(String curp) {
    this.curp = JsonNullable.<String>of(curp);
    
    return this;
  }

   /**
   * The tax payers&#39;s Clave Única de Registro de Población (CURP) number.
   * @return curp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BEMP12345HKGLLT00", value = "The tax payers's Clave Única de Registro de Población (CURP) number.")
  @JsonIgnore

  public String getCurp() {
        return curp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCurp_JsonNullable() {
    return curp;
  }
  
  @JsonProperty(JSON_PROPERTY_CURP)
  public void setCurp_JsonNullable(JsonNullable<String> curp) {
    this.curp = curp;
  }

  public void setCurp(String curp) {
    this.curp = JsonNullable.<String>of(curp);
  }


  public TaxStatusTaxPayerInformation name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * The tax payers&#39;s first name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JOHN", value = "The tax payers's first name.")
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


  public TaxStatusTaxPayerInformation firstLastName(String firstLastName) {
    this.firstLastName = JsonNullable.<String>of(firstLastName);
    
    return this;
  }

   /**
   * The tax payers&#39;s first last name.
   * @return firstLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DOE", value = "The tax payers's first last name.")
  @JsonIgnore

  public String getFirstLastName() {
        return firstLastName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFirstLastName_JsonNullable() {
    return firstLastName;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST_LAST_NAME)
  public void setFirstLastName_JsonNullable(JsonNullable<String> firstLastName) {
    this.firstLastName = firstLastName;
  }

  public void setFirstLastName(String firstLastName) {
    this.firstLastName = JsonNullable.<String>of(firstLastName);
  }


  public TaxStatusTaxPayerInformation secondLastName(String secondLastName) {
    this.secondLastName = JsonNullable.<String>of(secondLastName);
    
    return this;
  }

   /**
   * The tax payers&#39;s second last name.
   * @return secondLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SCHMOE", value = "The tax payers's second last name.")
  @JsonIgnore

  public String getSecondLastName() {
        return secondLastName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECOND_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSecondLastName_JsonNullable() {
    return secondLastName;
  }
  
  @JsonProperty(JSON_PROPERTY_SECOND_LAST_NAME)
  public void setSecondLastName_JsonNullable(JsonNullable<String> secondLastName) {
    this.secondLastName = secondLastName;
  }

  public void setSecondLastName(String secondLastName) {
    this.secondLastName = JsonNullable.<String>of(secondLastName);
  }


  public TaxStatusTaxPayerInformation startOperationsDate(LocalDate startOperationsDate) {
    
    this.startOperationsDate = startOperationsDate;
    return this;
  }

   /**
   * Date when the tax payer commenced taxable commercial activities.
   * @return startOperationsDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Feb 16 00:00:00 UTC 2016", required = true, value = "Date when the tax payer commenced taxable commercial activities.")
  @JsonProperty(JSON_PROPERTY_START_OPERATIONS_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getStartOperationsDate() {
    return startOperationsDate;
  }


  @JsonProperty(JSON_PROPERTY_START_OPERATIONS_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartOperationsDate(LocalDate startOperationsDate) {
    this.startOperationsDate = startOperationsDate;
  }


  public TaxStatusTaxPayerInformation statusPadron(String statusPadron) {
    
    this.statusPadron = statusPadron;
    return this;
  }

   /**
   * Status of the taxpayer in the Federal Register of Taxpayers (RFC). Can be &#x60;ACTIVO&#x60; or &#x60;INACTIVO&#x60;.
   * @return statusPadron
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACTIVO", required = true, value = "Status of the taxpayer in the Federal Register of Taxpayers (RFC). Can be `ACTIVO` or `INACTIVO`.")
  @JsonProperty(JSON_PROPERTY_STATUS_PADRON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatusPadron() {
    return statusPadron;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_PADRON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatusPadron(String statusPadron) {
    this.statusPadron = statusPadron;
  }


  public TaxStatusTaxPayerInformation lastStatusChangeDate(LocalDate lastStatusChangeDate) {
    
    this.lastStatusChangeDate = lastStatusChangeDate;
    return this;
  }

   /**
   * Date when &#x60;status_padron&#x60; was most recently updated.
   * @return lastStatusChangeDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Feb 16 00:00:00 UTC 2016", required = true, value = "Date when `status_padron` was most recently updated.")
  @JsonProperty(JSON_PROPERTY_LAST_STATUS_CHANGE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getLastStatusChangeDate() {
    return lastStatusChangeDate;
  }


  @JsonProperty(JSON_PROPERTY_LAST_STATUS_CHANGE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastStatusChangeDate(LocalDate lastStatusChangeDate) {
    this.lastStatusChangeDate = lastStatusChangeDate;
  }


  public TaxStatusTaxPayerInformation commercialName(String commercialName) {
    this.commercialName = JsonNullable.<String>of(commercialName);
    
    return this;
  }

   /**
   * The name of the company designated for consumers and the general public.
   * @return commercialName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JOHNDOE", value = "The name of the company designated for consumers and the general public.")
  @JsonIgnore

  public String getCommercialName() {
        return commercialName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMMERCIAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCommercialName_JsonNullable() {
    return commercialName;
  }
  
  @JsonProperty(JSON_PROPERTY_COMMERCIAL_NAME)
  public void setCommercialName_JsonNullable(JsonNullable<String> commercialName) {
    this.commercialName = commercialName;
  }

  public void setCommercialName(String commercialName) {
    this.commercialName = JsonNullable.<String>of(commercialName);
  }


  public TaxStatusTaxPayerInformation socialName(String socialName) {
    this.socialName = JsonNullable.<String>of(socialName);
    
    return this;
  }

   /**
   * The unique and exclusive name within the national territory that companies receive for legal or administrative purposes.
   * @return socialName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe SA DE CV", value = "The unique and exclusive name within the national territory that companies receive for legal or administrative purposes.")
  @JsonIgnore

  public String getSocialName() {
        return socialName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOCIAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSocialName_JsonNullable() {
    return socialName;
  }
  
  @JsonProperty(JSON_PROPERTY_SOCIAL_NAME)
  public void setSocialName_JsonNullable(JsonNullable<String> socialName) {
    this.socialName = socialName;
  }

  public void setSocialName(String socialName) {
    this.socialName = JsonNullable.<String>of(socialName);
  }


  public TaxStatusTaxPayerInformation email(String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

   /**
   * Contact email address for the tax payer.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "john_doe@gmail.com", value = "Contact email address for the tax payer.")
  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }

  public void setEmail(String email) {
    this.email = JsonNullable.<String>of(email);
  }


  public TaxStatusTaxPayerInformation phone(String phone) {
    this.phone = JsonNullable.<String>of(phone);
    
    return this;
  }

   /**
   * Contact phone number for the tax payer.
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890", value = "Contact phone number for the tax payer.")
  @JsonIgnore

  public String getPhone() {
        return phone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPhone_JsonNullable() {
    return phone;
  }
  
  @JsonProperty(JSON_PROPERTY_PHONE)
  public void setPhone_JsonNullable(JsonNullable<String> phone) {
    this.phone = phone;
  }

  public void setPhone(String phone) {
    this.phone = JsonNullable.<String>of(phone);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxStatusTaxPayerInformation taxStatusTaxPayerInformation = (TaxStatusTaxPayerInformation) o;
    return Objects.equals(this.rfc, taxStatusTaxPayerInformation.rfc) &&
        equalsNullable(this.curp, taxStatusTaxPayerInformation.curp) &&
        equalsNullable(this.name, taxStatusTaxPayerInformation.name) &&
        equalsNullable(this.firstLastName, taxStatusTaxPayerInformation.firstLastName) &&
        equalsNullable(this.secondLastName, taxStatusTaxPayerInformation.secondLastName) &&
        Objects.equals(this.startOperationsDate, taxStatusTaxPayerInformation.startOperationsDate) &&
        Objects.equals(this.statusPadron, taxStatusTaxPayerInformation.statusPadron) &&
        Objects.equals(this.lastStatusChangeDate, taxStatusTaxPayerInformation.lastStatusChangeDate) &&
        equalsNullable(this.commercialName, taxStatusTaxPayerInformation.commercialName) &&
        equalsNullable(this.socialName, taxStatusTaxPayerInformation.socialName) &&
        equalsNullable(this.email, taxStatusTaxPayerInformation.email) &&
        equalsNullable(this.phone, taxStatusTaxPayerInformation.phone);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(rfc, hashCodeNullable(curp), hashCodeNullable(name), hashCodeNullable(firstLastName), hashCodeNullable(secondLastName), startOperationsDate, statusPadron, lastStatusChangeDate, hashCodeNullable(commercialName), hashCodeNullable(socialName), hashCodeNullable(email), hashCodeNullable(phone));
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
    sb.append("class TaxStatusTaxPayerInformation {\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    curp: ").append(toIndentedString(curp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstLastName: ").append(toIndentedString(firstLastName)).append("\n");
    sb.append("    secondLastName: ").append(toIndentedString(secondLastName)).append("\n");
    sb.append("    startOperationsDate: ").append(toIndentedString(startOperationsDate)).append("\n");
    sb.append("    statusPadron: ").append(toIndentedString(statusPadron)).append("\n");
    sb.append("    lastStatusChangeDate: ").append(toIndentedString(lastStatusChangeDate)).append("\n");
    sb.append("    commercialName: ").append(toIndentedString(commercialName)).append("\n");
    sb.append("    socialName: ").append(toIndentedString(socialName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

