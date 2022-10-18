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
 * LinkFilters
 */
@JsonPropertyOrder({
  LinkFilters.JSON_PROPERTY_ACCESS_MODE,
  LinkFilters.JSON_PROPERTY_CREATED_AT,
  LinkFilters.JSON_PROPERTY_CREATED_AT_GT,
  LinkFilters.JSON_PROPERTY_CREATED_AT_LT,
  LinkFilters.JSON_PROPERTY_CREATED_AT_GTE,
  LinkFilters.JSON_PROPERTY_CREATED_AT_LTE,
  LinkFilters.JSON_PROPERTY_CREATED_AT_RANGE,
  LinkFilters.JSON_PROPERTY_CREATED_BY_NOT_IN,
  LinkFilters.JSON_PROPERTY_EXTERNAL_ID,
  LinkFilters.JSON_PROPERTY_EXTERNAL_ID_IN,
  LinkFilters.JSON_PROPERTY_ID,
  LinkFilters.JSON_PROPERTY_ID_IN,
  LinkFilters.JSON_PROPERTY_INSTITUTION,
  LinkFilters.JSON_PROPERTY_INSTITUTION_IN,
  LinkFilters.JSON_PROPERTY_INSTITUTION_USER_ID,
  LinkFilters.JSON_PROPERTY_INSTITUTION_USER_ID_IN,
  LinkFilters.JSON_PROPERTY_REFRESH_RATE,
  LinkFilters.JSON_PROPERTY_STATUS,
  LinkFilters.JSON_PROPERTY_STATUS_IN
})
@JsonTypeName("linkFilters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class LinkFilters {
  public static final String JSON_PROPERTY_ACCESS_MODE = "access_mode";
  private String accessMode;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_CREATED_AT_GT = "created_at__gt";
  private String createdAtGt;

  public static final String JSON_PROPERTY_CREATED_AT_LT = "created_at__lt";
  private String createdAtLt;

  public static final String JSON_PROPERTY_CREATED_AT_GTE = "created_at__gte";
  private String createdAtGte;

  public static final String JSON_PROPERTY_CREATED_AT_LTE = "created_at__lte";
  private String createdAtLte;

  public static final String JSON_PROPERTY_CREATED_AT_RANGE = "created_at__range";
  private String createdAtRange;

  public static final String JSON_PROPERTY_CREATED_BY_NOT_IN = "created_by__not_in";
  private String createdByNotIn;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "external_id";
  private String externalId;

  public static final String JSON_PROPERTY_EXTERNAL_ID_IN = "external_id__in";
  private String externalIdIn;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ID_IN = "id__in";
  private String idIn;

  public static final String JSON_PROPERTY_INSTITUTION = "institution";
  private String institution;

  public static final String JSON_PROPERTY_INSTITUTION_IN = "institution__in";
  private String institutionIn;

  public static final String JSON_PROPERTY_INSTITUTION_USER_ID = "institution_user_id";
  private String institutionUserId;

  public static final String JSON_PROPERTY_INSTITUTION_USER_ID_IN = "institution_user_id__in";
  private String institutionUserIdIn;

  public static final String JSON_PROPERTY_REFRESH_RATE = "refresh_rate";
  private String refreshRate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STATUS_IN = "status__in";
  private String statusIn;

  public LinkFilters() {
  }

  public LinkFilters accessMode(String accessMode) {
    
    this.accessMode = accessMode;
    return this;
  }

   /**
   * Get accessMode
   * @return accessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCESS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessMode() {
    return accessMode;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessMode(String accessMode) {
    this.accessMode = accessMode;
  }


  public LinkFilters createdAt(String createdAt) {
    
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


  public LinkFilters createdAtGt(String createdAtGt) {
    
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


  public LinkFilters createdAtLt(String createdAtLt) {
    
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


  public LinkFilters createdAtGte(String createdAtGte) {
    
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


  public LinkFilters createdAtLte(String createdAtLte) {
    
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


  public LinkFilters createdAtRange(String createdAtRange) {
    
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


  public LinkFilters createdByNotIn(String createdByNotIn) {
    
    this.createdByNotIn = createdByNotIn;
    return this;
  }

   /**
   * Get createdByNotIn
   * @return createdByNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY_NOT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedByNotIn() {
    return createdByNotIn;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY_NOT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedByNotIn(String createdByNotIn) {
    this.createdByNotIn = createdByNotIn;
  }


  public LinkFilters externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public LinkFilters externalIdIn(String externalIdIn) {
    
    this.externalIdIn = externalIdIn;
    return this;
  }

   /**
   * Get externalIdIn
   * @return externalIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalIdIn() {
    return externalIdIn;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalIdIn(String externalIdIn) {
    this.externalIdIn = externalIdIn;
  }


  public LinkFilters id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public LinkFilters idIn(String idIn) {
    
    this.idIn = idIn;
    return this;
  }

   /**
   * Get idIn
   * @return idIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdIn() {
    return idIn;
  }


  @JsonProperty(JSON_PROPERTY_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdIn(String idIn) {
    this.idIn = idIn;
  }


  public LinkFilters institution(String institution) {
    
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

  public String getInstitution() {
    return institution;
  }


  @JsonProperty(JSON_PROPERTY_INSTITUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstitution(String institution) {
    this.institution = institution;
  }


  public LinkFilters institutionIn(String institutionIn) {
    
    this.institutionIn = institutionIn;
    return this;
  }

   /**
   * Get institutionIn
   * @return institutionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTITUTION_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstitutionIn() {
    return institutionIn;
  }


  @JsonProperty(JSON_PROPERTY_INSTITUTION_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstitutionIn(String institutionIn) {
    this.institutionIn = institutionIn;
  }


  public LinkFilters institutionUserId(String institutionUserId) {
    
    this.institutionUserId = institutionUserId;
    return this;
  }

   /**
   * Get institutionUserId
   * @return institutionUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTITUTION_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstitutionUserId() {
    return institutionUserId;
  }


  @JsonProperty(JSON_PROPERTY_INSTITUTION_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstitutionUserId(String institutionUserId) {
    this.institutionUserId = institutionUserId;
  }


  public LinkFilters institutionUserIdIn(String institutionUserIdIn) {
    
    this.institutionUserIdIn = institutionUserIdIn;
    return this;
  }

   /**
   * Get institutionUserIdIn
   * @return institutionUserIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTITUTION_USER_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstitutionUserIdIn() {
    return institutionUserIdIn;
  }


  @JsonProperty(JSON_PROPERTY_INSTITUTION_USER_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstitutionUserIdIn(String institutionUserIdIn) {
    this.institutionUserIdIn = institutionUserIdIn;
  }


  public LinkFilters refreshRate(String refreshRate) {
    
    this.refreshRate = refreshRate;
    return this;
  }

   /**
   * Get refreshRate
   * @return refreshRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFRESH_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefreshRate() {
    return refreshRate;
  }


  @JsonProperty(JSON_PROPERTY_REFRESH_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefreshRate(String refreshRate) {
    this.refreshRate = refreshRate;
  }


  public LinkFilters status(String status) {
    
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


  public LinkFilters statusIn(String statusIn) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkFilters linkFilters = (LinkFilters) o;
    return Objects.equals(this.accessMode, linkFilters.accessMode) &&
        Objects.equals(this.createdAt, linkFilters.createdAt) &&
        Objects.equals(this.createdAtGt, linkFilters.createdAtGt) &&
        Objects.equals(this.createdAtLt, linkFilters.createdAtLt) &&
        Objects.equals(this.createdAtGte, linkFilters.createdAtGte) &&
        Objects.equals(this.createdAtLte, linkFilters.createdAtLte) &&
        Objects.equals(this.createdAtRange, linkFilters.createdAtRange) &&
        Objects.equals(this.createdByNotIn, linkFilters.createdByNotIn) &&
        Objects.equals(this.externalId, linkFilters.externalId) &&
        Objects.equals(this.externalIdIn, linkFilters.externalIdIn) &&
        Objects.equals(this.id, linkFilters.id) &&
        Objects.equals(this.idIn, linkFilters.idIn) &&
        Objects.equals(this.institution, linkFilters.institution) &&
        Objects.equals(this.institutionIn, linkFilters.institutionIn) &&
        Objects.equals(this.institutionUserId, linkFilters.institutionUserId) &&
        Objects.equals(this.institutionUserIdIn, linkFilters.institutionUserIdIn) &&
        Objects.equals(this.refreshRate, linkFilters.refreshRate) &&
        Objects.equals(this.status, linkFilters.status) &&
        Objects.equals(this.statusIn, linkFilters.statusIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, createdAt, createdAtGt, createdAtLt, createdAtGte, createdAtLte, createdAtRange, createdByNotIn, externalId, externalIdIn, id, idIn, institution, institutionIn, institutionUserId, institutionUserIdIn, refreshRate, status, statusIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkFilters {\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
    sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    createdAtRange: ").append(toIndentedString(createdAtRange)).append("\n");
    sb.append("    createdByNotIn: ").append(toIndentedString(createdByNotIn)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalIdIn: ").append(toIndentedString(externalIdIn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    institutionIn: ").append(toIndentedString(institutionIn)).append("\n");
    sb.append("    institutionUserId: ").append(toIndentedString(institutionUserId)).append("\n");
    sb.append("    institutionUserIdIn: ").append(toIndentedString(institutionUserIdIn)).append("\n");
    sb.append("    refreshRate: ").append(toIndentedString(refreshRate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
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

