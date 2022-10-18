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
 * InstitutionFilters
 */
@JsonPropertyOrder({
  InstitutionFilters.JSON_PROPERTY_CODE,
  InstitutionFilters.JSON_PROPERTY_CODE_IN,
  InstitutionFilters.JSON_PROPERTY_COUNTRY_CODE,
  InstitutionFilters.JSON_PROPERTY_COUNTRY_CODE_IN,
  InstitutionFilters.JSON_PROPERTY_DISPLAY_NAME,
  InstitutionFilters.JSON_PROPERTY_NAME,
  InstitutionFilters.JSON_PROPERTY_NAME_IN,
  InstitutionFilters.JSON_PROPERTY_RESOURCES_ALLIN,
  InstitutionFilters.JSON_PROPERTY_STATUS,
  InstitutionFilters.JSON_PROPERTY_STATUS_IN,
  InstitutionFilters.JSON_PROPERTY_TYPE,
  InstitutionFilters.JSON_PROPERTY_TYPE_IN,
  InstitutionFilters.JSON_PROPERTY_WEBSITE
})
@JsonTypeName("institutionFilters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class InstitutionFilters {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_CODE_IN = "code__in";
  private String codeIn;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public static final String JSON_PROPERTY_COUNTRY_CODE_IN = "country_code__in";
  private String countryCodeIn;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAME_IN = "name__in";
  private String nameIn;

  public static final String JSON_PROPERTY_RESOURCES_ALLIN = "resources__allin";
  private String resourcesAllin;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STATUS_IN = "status__in";
  private String statusIn;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_TYPE_IN = "type__in";
  private String typeIn;

  public static final String JSON_PROPERTY_WEBSITE = "website";
  private String website;

  public InstitutionFilters() {
  }

  public InstitutionFilters code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public InstitutionFilters codeIn(String codeIn) {
    
    this.codeIn = codeIn;
    return this;
  }

   /**
   * Get codeIn
   * @return codeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CODE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCodeIn() {
    return codeIn;
  }


  @JsonProperty(JSON_PROPERTY_CODE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCodeIn(String codeIn) {
    this.codeIn = codeIn;
  }


  public InstitutionFilters countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public InstitutionFilters countryCodeIn(String countryCodeIn) {
    
    this.countryCodeIn = countryCodeIn;
    return this;
  }

   /**
   * Get countryCodeIn
   * @return countryCodeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCodeIn() {
    return countryCodeIn;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCodeIn(String countryCodeIn) {
    this.countryCodeIn = countryCodeIn;
  }


  public InstitutionFilters displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public InstitutionFilters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public InstitutionFilters nameIn(String nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

   /**
   * Get nameIn
   * @return nameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNameIn() {
    return nameIn;
  }


  @JsonProperty(JSON_PROPERTY_NAME_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameIn(String nameIn) {
    this.nameIn = nameIn;
  }


  public InstitutionFilters resourcesAllin(String resourcesAllin) {
    
    this.resourcesAllin = resourcesAllin;
    return this;
  }

   /**
   * Get resourcesAllin
   * @return resourcesAllin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCES_ALLIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourcesAllin() {
    return resourcesAllin;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCES_ALLIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourcesAllin(String resourcesAllin) {
    this.resourcesAllin = resourcesAllin;
  }


  public InstitutionFilters status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public InstitutionFilters statusIn(String statusIn) {
    
    this.statusIn = statusIn;
    return this;
  }

   /**
   * Get statusIn
   * @return statusIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatusIn() {
    return statusIn;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusIn(String statusIn) {
    this.statusIn = statusIn;
  }


  public InstitutionFilters type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public InstitutionFilters typeIn(String typeIn) {
    
    this.typeIn = typeIn;
    return this;
  }

   /**
   * Get typeIn
   * @return typeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypeIn() {
    return typeIn;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeIn(String typeIn) {
    this.typeIn = typeIn;
  }


  public InstitutionFilters website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebsite() {
    return website;
  }


  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionFilters institutionFilters = (InstitutionFilters) o;
    return Objects.equals(this.code, institutionFilters.code) &&
        Objects.equals(this.codeIn, institutionFilters.codeIn) &&
        Objects.equals(this.countryCode, institutionFilters.countryCode) &&
        Objects.equals(this.countryCodeIn, institutionFilters.countryCodeIn) &&
        Objects.equals(this.displayName, institutionFilters.displayName) &&
        Objects.equals(this.name, institutionFilters.name) &&
        Objects.equals(this.nameIn, institutionFilters.nameIn) &&
        Objects.equals(this.resourcesAllin, institutionFilters.resourcesAllin) &&
        Objects.equals(this.status, institutionFilters.status) &&
        Objects.equals(this.statusIn, institutionFilters.statusIn) &&
        Objects.equals(this.type, institutionFilters.type) &&
        Objects.equals(this.typeIn, institutionFilters.typeIn) &&
        Objects.equals(this.website, institutionFilters.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, codeIn, countryCode, countryCodeIn, displayName, name, nameIn, resourcesAllin, status, statusIn, type, typeIn, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionFilters {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeIn: ").append(toIndentedString(codeIn)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryCodeIn: ").append(toIndentedString(countryCodeIn)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameIn: ").append(toIndentedString(nameIn)).append("\n");
    sb.append("    resourcesAllin: ").append(toIndentedString(resourcesAllin)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

