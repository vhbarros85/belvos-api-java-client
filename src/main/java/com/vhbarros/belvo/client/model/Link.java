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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Link
 */
@JsonPropertyOrder({
  Link.JSON_PROPERTY_ID,
  Link.JSON_PROPERTY_INSTITUTION,
  Link.JSON_PROPERTY_ACCESS_MODE,
  Link.JSON_PROPERTY_LAST_ACCESSED_AT,
  Link.JSON_PROPERTY_CREATED_AT,
  Link.JSON_PROPERTY_EXTERNAL_ID,
  Link.JSON_PROPERTY_INSTITUTION_USER_ID,
  Link.JSON_PROPERTY_STATUS,
  Link.JSON_PROPERTY_CREATED_BY,
  Link.JSON_PROPERTY_REFRESH_RATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class Link {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_INSTITUTION = "institution";
  private String institution;

  /**
   * The link type. For more information, see our [Links](https://developers.belvo.com/docs/links-and-institutions#links) article. We return one of the following enum values:   - &#x60;single&#x60;   - &#x60;recurrent&#x60; 
   */
  public enum AccessModeEnum {
    SINGLE("single"),
    
    RECURRENT("recurrent");

    private String value;

    AccessModeEnum(String value) {
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
    public static AccessModeEnum fromValue(String value) {
      for (AccessModeEnum b : AccessModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACCESS_MODE = "access_mode";
  private AccessModeEnum accessMode;

  public static final String JSON_PROPERTY_LAST_ACCESSED_AT = "last_accessed_at";
  private OffsetDateTime lastAccessedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "external_id";
  private JsonNullable<String> externalId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INSTITUTION_USER_ID = "institution_user_id";
  private String institutionUserId;

  /**
   * The current status of the link. For more information, see our [Link](https://developers.belvo.com/docs/links-and-institutions#links) article in the devportal. We return one of the following enum values:   - &#x60;valid&#x60;   - &#x60;invalid&#x60;   - &#x60;unconfirmed&#x60;   - &#x60;token_required&#x60; 
   */
  public enum StatusEnum {
    VALID("valid"),
    
    INVALID("invalid"),
    
    UNCONFIRMED("unconfirmed"),
    
    TOKEN_REQUIRED("token_required");

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private UUID createdBy;

  /**
   * The update refresh rate for the recurrent link. For more information, check out our [recurrent link documentation](https://developers.belvo.com/docs/links-and-institutions#recurrent-links) in our DevPortal. We return one of the following enum values:   - &#x60;6h&#x60;   - &#x60;12h&#x60;   - &#x60;24h&#x60;   - &#x60;7d&#x60; (default)   - &#x60;30d&#x60; (once a month) 
   */
  public enum RefreshRateEnum {
    _6H("6h"),
    
    _12H("12h"),
    
    _24H("24h"),
    
    _7D("7d"),
    
    _30D("30d");

    private String value;

    RefreshRateEnum(String value) {
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
    public static RefreshRateEnum fromValue(String value) {
      for (RefreshRateEnum b : RefreshRateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REFRESH_RATE = "refresh_rate";
  private RefreshRateEnum refreshRate = RefreshRateEnum._7D;

  public Link() {
  }

  public Link id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique ID used to reference the current Link.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", value = "Belvo's unique ID used to reference the current Link.")
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


  public Link institution(String institution) {
    
    this.institution = institution;
    return this;
  }

   /**
   * Belvo&#39;s name for the institution. 
   * @return institution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "erebor_mx_retail", value = "Belvo's name for the institution. ")
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


  public Link accessMode(AccessModeEnum accessMode) {
    
    this.accessMode = accessMode;
    return this;
  }

   /**
   * The link type. For more information, see our [Links](https://developers.belvo.com/docs/links-and-institutions#links) article. We return one of the following enum values:   - &#x60;single&#x60;   - &#x60;recurrent&#x60; 
   * @return accessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "recurrent", value = "The link type. For more information, see our [Links](https://developers.belvo.com/docs/links-and-institutions#links) article. We return one of the following enum values:   - `single`   - `recurrent` ")
  @JsonProperty(JSON_PROPERTY_ACCESS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccessModeEnum getAccessMode() {
    return accessMode;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessMode(AccessModeEnum accessMode) {
    this.accessMode = accessMode;
  }


  public Link lastAccessedAt(OffsetDateTime lastAccessedAt) {
    
    this.lastAccessedAt = lastAccessedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of Belvo&#39;s most recent successful access to the institution for the given link.
   * @return lastAccessedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-09-27T13:02:03.584Z", value = "The ISO-8601 timestamp of Belvo's most recent successful access to the institution for the given link.")
  @JsonProperty(JSON_PROPERTY_LAST_ACCESSED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastAccessedAt() {
    return lastAccessedAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_ACCESSED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastAccessedAt(OffsetDateTime lastAccessedAt) {
    this.lastAccessedAt = lastAccessedAt;
  }


  public Link createdAt(OffsetDateTime createdAt) {
    
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


  public Link externalId(String externalId) {
    this.externalId = JsonNullable.<String>of(externalId);
    
    return this;
  }

   /**
   * The &#x60;external_id&#x60; you provided as an additional identifier for the link. For more information, see our [Link creation article](https://developers.belvo.com/docs/link-creation-best-practices#adding-your-own-identifier).
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "56ab5706-6e00-48a4-91c9-ca55968678d9", value = "The `external_id` you provided as an additional identifier for the link. For more information, see our [Link creation article](https://developers.belvo.com/docs/link-creation-best-practices#adding-your-own-identifier).")
  @JsonIgnore

  public String getExternalId() {
        return externalId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExternalId_JsonNullable() {
    return externalId;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  public void setExternalId_JsonNullable(JsonNullable<String> externalId) {
    this.externalId = externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = JsonNullable.<String>of(externalId);
  }


  public Link institutionUserId(String institutionUserId) {
    
    this.institutionUserId = institutionUserId;
    return this;
  }

   /**
   * &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Info:&lt;/strong&gt; Only applicable for links created &lt;b&gt;after 08-02-2022&lt;/b&gt;. &lt;/div&gt;  A unique 44-character string that can be used to identify a user at a given institution.  📚 Check out our [Avoiding duplicated links](https://developers.belvo.com/docs/link-creation-best-practices#avoiding-duplicated-links) DevPortal article for more information and tips on how to use it.
   * @return institutionUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sooE7XJWEKypZJR603ecaWYk-8Ap0oD8Nr1pBQ4eG9c=", value = "<div style=\"background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Info:</strong> Only applicable for links created <b>after 08-02-2022</b>. </div>  A unique 44-character string that can be used to identify a user at a given institution.  📚 Check out our [Avoiding duplicated links](https://developers.belvo.com/docs/link-creation-best-practices#avoiding-duplicated-links) DevPortal article for more information and tips on how to use it.")
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


  public Link status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The current status of the link. For more information, see our [Link](https://developers.belvo.com/docs/links-and-institutions#links) article in the devportal. We return one of the following enum values:   - &#x60;valid&#x60;   - &#x60;invalid&#x60;   - &#x60;unconfirmed&#x60;   - &#x60;token_required&#x60; 
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current status of the link. For more information, see our [Link](https://developers.belvo.com/docs/links-and-institutions#links) article in the devportal. We return one of the following enum values:   - `valid`   - `invalid`   - `unconfirmed`   - `token_required` ")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Link createdBy(UUID createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * The unique ID for the user that created this link.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bcef7f35-67f2-4b19-b009-cb38795faf09", value = "The unique ID for the user that created this link.")
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(UUID createdBy) {
    this.createdBy = createdBy;
  }


  public Link refreshRate(RefreshRateEnum refreshRate) {
    
    this.refreshRate = refreshRate;
    return this;
  }

   /**
   * The update refresh rate for the recurrent link. For more information, check out our [recurrent link documentation](https://developers.belvo.com/docs/links-and-institutions#recurrent-links) in our DevPortal. We return one of the following enum values:   - &#x60;6h&#x60;   - &#x60;12h&#x60;   - &#x60;24h&#x60;   - &#x60;7d&#x60; (default)   - &#x60;30d&#x60; (once a month) 
   * @return refreshRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7d", value = "The update refresh rate for the recurrent link. For more information, check out our [recurrent link documentation](https://developers.belvo.com/docs/links-and-institutions#recurrent-links) in our DevPortal. We return one of the following enum values:   - `6h`   - `12h`   - `24h`   - `7d` (default)   - `30d` (once a month) ")
  @JsonProperty(JSON_PROPERTY_REFRESH_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RefreshRateEnum getRefreshRate() {
    return refreshRate;
  }


  @JsonProperty(JSON_PROPERTY_REFRESH_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefreshRate(RefreshRateEnum refreshRate) {
    this.refreshRate = refreshRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.id, link.id) &&
        Objects.equals(this.institution, link.institution) &&
        Objects.equals(this.accessMode, link.accessMode) &&
        Objects.equals(this.lastAccessedAt, link.lastAccessedAt) &&
        Objects.equals(this.createdAt, link.createdAt) &&
        equalsNullable(this.externalId, link.externalId) &&
        Objects.equals(this.institutionUserId, link.institutionUserId) &&
        Objects.equals(this.status, link.status) &&
        Objects.equals(this.createdBy, link.createdBy) &&
        Objects.equals(this.refreshRate, link.refreshRate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, institution, accessMode, lastAccessedAt, createdAt, hashCodeNullable(externalId), institutionUserId, status, createdBy, refreshRate);
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
    sb.append("class Link {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    lastAccessedAt: ").append(toIndentedString(lastAccessedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    institutionUserId: ").append(toIndentedString(institutionUserId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    refreshRate: ").append(toIndentedString(refreshRate)).append("\n");
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

