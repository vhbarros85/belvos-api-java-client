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
import com.vhbarros.belvo.client.model.InstitutionFormFields;
import com.vhbarros.belvo.client.model.InstitutionsFeature;
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
 * Institution
 */
@JsonPropertyOrder({
  Institution.JSON_PROPERTY_ID,
  Institution.JSON_PROPERTY_NAME,
  Institution.JSON_PROPERTY_TYPE,
  Institution.JSON_PROPERTY_WEBSITE,
  Institution.JSON_PROPERTY_DISPLAY_NAME,
  Institution.JSON_PROPERTY_COUNTRY_CODES,
  Institution.JSON_PROPERTY_PRIMARY_COLOR,
  Institution.JSON_PROPERTY_LOGO,
  Institution.JSON_PROPERTY_ICON_LOGO,
  Institution.JSON_PROPERTY_TEXT_LOGO,
  Institution.JSON_PROPERTY_FORM_FIELDS,
  Institution.JSON_PROPERTY_FEATURES,
  Institution.JSON_PROPERTY_RESOURCES,
  Institution.JSON_PROPERTY_INTEGRATION_TYPE,
  Institution.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class Institution {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * The type of institution.  Can be either:    - &#x60;bank&#x60;   - &#x60;fiscal&#x60;   - &#x60;gig&#x60; 
   */
  public enum TypeEnum {
    BANK("bank"),
    
    FISCAL("fiscal"),
    
    GIG("gig");

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_WEBSITE = "website";
  private JsonNullable<String> website = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_COUNTRY_CODES = "country_codes";
  private List<String> countryCodes = null;

  public static final String JSON_PROPERTY_PRIMARY_COLOR = "primary_color";
  private String primaryColor;

  public static final String JSON_PROPERTY_LOGO = "logo";
  private JsonNullable<String> logo = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ICON_LOGO = "icon_logo";
  private JsonNullable<String> iconLogo = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TEXT_LOGO = "text_logo";
  private JsonNullable<String> textLogo = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FORM_FIELDS = "form_fields";
  private InstitutionFormFields formFields;

  public static final String JSON_PROPERTY_FEATURES = "features";
  private List<InstitutionsFeature> features = null;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private List<String> resources = null;

  /**
   * The type of technology used to access the institution.  - &#x60;credentials&#x60;: Uses Belvo&#39;s scraping technology, combined with user credentials, to perform requests. - &#x60;openbanking&#x60;: Uses the bank&#39;s openbanking API to perform requests. 
   */
  public enum IntegrationTypeEnum {
    CREDENTIALS("credentials"),
    
    OPENBANKING("openbanking");

    private String value;

    IntegrationTypeEnum(String value) {
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
    public static IntegrationTypeEnum fromValue(String value) {
      for (IntegrationTypeEnum b : IntegrationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integration_type";
  private IntegrationTypeEnum integrationType;

  /**
   * Indicates whether Belvo&#39;s integration with the institution is currently active (&#x60;healthy&#x60;) or undergoing maintenance (&#x60;down&#x60;). 
   */
  public enum StatusEnum {
    HEALTHY("healthy"),
    
    DOWN("down");

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

  public Institution() {
  }

  public Institution id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the institution as designated by Belvo.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1003", value = "The ID of the institution as designated by Belvo.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public Institution name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the institution, as designated by Belvo. Please see our [Institutions](https://developers.belvo.com/docs/institution) DevPortal article for a detailed list of institution names.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "erebor_mx_retail", value = "The name of the institution, as designated by Belvo. Please see our [Institutions](https://developers.belvo.com/docs/institution) DevPortal article for a detailed list of institution names.")
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


  public Institution type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of institution.  Can be either:    - &#x60;bank&#x60;   - &#x60;fiscal&#x60;   - &#x60;gig&#x60; 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bank", value = "The type of institution.  Can be either:    - `bank`   - `fiscal`   - `gig` ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Institution website(String website) {
    this.website = JsonNullable.<String>of(website);
    
    return this;
  }

   /**
   * The URL of the institution&#39;s website.
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.erebor.com/", value = "The URL of the institution's website.")
  @JsonIgnore

  public String getWebsite() {
        return website.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebsite_JsonNullable() {
    return website;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBSITE)
  public void setWebsite_JsonNullable(JsonNullable<String> website) {
    this.website = website;
  }

  public void setWebsite(String website) {
    this.website = JsonNullable.<String>of(website);
  }


  public Institution displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The customer-facing name of the institution.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Erebor Mexico", value = "The customer-facing name of the institution.")
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


  public Institution countryCodes(List<String> countryCodes) {
    
    this.countryCodes = countryCodes;
    return this;
  }

  public Institution addCountryCodesItem(String countryCodesItem) {
    if (this.countryCodes == null) {
      this.countryCodes = new ArrayList<>();
    }
    this.countryCodes.add(countryCodesItem);
    return this;
  }

   /**
   * The country codes where the institution is available, for example: - 🇧🇷 BR (Brazil) - 🇨🇴 CO (Colombia) - 🇲🇽 MX (Mexico)   
   * @return countryCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country codes where the institution is available, for example: - 🇧🇷 BR (Brazil) - 🇨🇴 CO (Colombia) - 🇲🇽 MX (Mexico)   ")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCountryCodes() {
    return countryCodes;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCodes(List<String> countryCodes) {
    this.countryCodes = countryCodes;
  }


  public Institution primaryColor(String primaryColor) {
    
    this.primaryColor = primaryColor;
    return this;
  }

   /**
   * The primary color on the institution&#39;s website.
   * @return primaryColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "#056dae", value = "The primary color on the institution's website.")
  @JsonProperty(JSON_PROPERTY_PRIMARY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryColor() {
    return primaryColor;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
  }


  public Institution logo(String logo) {
    this.logo = JsonNullable.<String>of(logo);
    
    return this;
  }

   /**
   * The URL of the institution&#39;s logo.
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://belvo-api-media.s3.amazonaws.com/logos/erebor_logo.png", value = "The URL of the institution's logo.")
  @JsonIgnore

  public String getLogo() {
        return logo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLogo_JsonNullable() {
    return logo;
  }
  
  @JsonProperty(JSON_PROPERTY_LOGO)
  public void setLogo_JsonNullable(JsonNullable<String> logo) {
    this.logo = logo;
  }

  public void setLogo(String logo) {
    this.logo = JsonNullable.<String>of(logo);
  }


  public Institution iconLogo(String iconLogo) {
    this.iconLogo = JsonNullable.<String>of(iconLogo);
    
    return this;
  }

   /**
   * The URL of the institution&#39;s icon logo.
   * @return iconLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://statics.belvo.io/widget/images/institutions/erebor.svg", value = "The URL of the institution's icon logo.")
  @JsonIgnore

  public String getIconLogo() {
        return iconLogo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ICON_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIconLogo_JsonNullable() {
    return iconLogo;
  }
  
  @JsonProperty(JSON_PROPERTY_ICON_LOGO)
  public void setIconLogo_JsonNullable(JsonNullable<String> iconLogo) {
    this.iconLogo = iconLogo;
  }

  public void setIconLogo(String iconLogo) {
    this.iconLogo = JsonNullable.<String>of(iconLogo);
  }


  public Institution textLogo(String textLogo) {
    this.textLogo = JsonNullable.<String>of(textLogo);
    
    return this;
  }

   /**
   * The URL of the institution&#39;s text logo.
   * @return textLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://statics.belvo.io/widget/images/institutions/erebor.svg", value = "The URL of the institution's text logo.")
  @JsonIgnore

  public String getTextLogo() {
        return textLogo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEXT_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTextLogo_JsonNullable() {
    return textLogo;
  }
  
  @JsonProperty(JSON_PROPERTY_TEXT_LOGO)
  public void setTextLogo_JsonNullable(JsonNullable<String> textLogo) {
    this.textLogo = textLogo;
  }

  public void setTextLogo(String textLogo) {
    this.textLogo = JsonNullable.<String>of(textLogo);
  }


  public Institution formFields(InstitutionFormFields formFields) {
    
    this.formFields = formFields;
    return this;
  }

   /**
   * Get formFields
   * @return formFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InstitutionFormFields getFormFields() {
    return formFields;
  }


  @JsonProperty(JSON_PROPERTY_FORM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormFields(InstitutionFormFields formFields) {
    this.formFields = formFields;
  }


  public Institution features(List<InstitutionsFeature> features) {
    
    this.features = features;
    return this;
  }

  public Institution addFeaturesItem(InstitutionsFeature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * The features that the institution supports. If the institution has no special features, then Belvo returns an empty array.  Here is a list of the available features: - &#x60;token_required&#x60; indicates that the institution may require a token during link creation or when making any other requests. 
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The features that the institution supports. If the institution has no special features, then Belvo returns an empty array.  Here is a list of the available features: - `token_required` indicates that the institution may require a token during link creation or when making any other requests. ")
  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InstitutionsFeature> getFeatures() {
    return features;
  }


  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeatures(List<InstitutionsFeature> features) {
    this.features = features;
  }


  public Institution resources(List<String> resources) {
    
    this.resources = resources;
    return this;
  }

  public Institution addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * A list of Belvo resources that you can use with the institution. This list includes one or more of the following resources:    - &#x60;ACCOUNTS&#x60;   - &#x60;BALANCES&#x60;   - &#x60;INCOMES&#x60;   - &#x60;INVESTMENTS_PORTFOLIOS&#x60;   - &#x60;INVESTMENTS_TRANSACTIONS&#x60;   - &#x60;INVOICES&#x60;   - &#x60;OWNERS&#x60;   - &#x60;RECURRING_EXPENSES&#x60;   - &#x60;RISK_INSIGHTS&#x60;   - &#x60;TRANSACTIONS&#x60;   - &#x60;TAX_COMPLIANCE_STATUS&#x60;   - &#x60;TAX_STATUS&#x60;   - &#x60;TAX_RETURNS&#x60; 
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"ACCOUNTS\",\"BALANCES\",\"INCOMES\",\"OWNERS\",\"RECURRING_EXPENSES\",\"RISK_INSIGHTS\",\"TRANSACTIONS\"]", value = "A list of Belvo resources that you can use with the institution. This list includes one or more of the following resources:    - `ACCOUNTS`   - `BALANCES`   - `INCOMES`   - `INVESTMENTS_PORTFOLIOS`   - `INVESTMENTS_TRANSACTIONS`   - `INVOICES`   - `OWNERS`   - `RECURRING_EXPENSES`   - `RISK_INSIGHTS`   - `TRANSACTIONS`   - `TAX_COMPLIANCE_STATUS`   - `TAX_STATUS`   - `TAX_RETURNS` ")
  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getResources() {
    return resources;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResources(List<String> resources) {
    this.resources = resources;
  }


  public Institution integrationType(IntegrationTypeEnum integrationType) {
    
    this.integrationType = integrationType;
    return this;
  }

   /**
   * The type of technology used to access the institution.  - &#x60;credentials&#x60;: Uses Belvo&#39;s scraping technology, combined with user credentials, to perform requests. - &#x60;openbanking&#x60;: Uses the bank&#39;s openbanking API to perform requests. 
   * @return integrationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "credentials", value = "The type of technology used to access the institution.  - `credentials`: Uses Belvo's scraping technology, combined with user credentials, to perform requests. - `openbanking`: Uses the bank's openbanking API to perform requests. ")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IntegrationTypeEnum getIntegrationType() {
    return integrationType;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationType(IntegrationTypeEnum integrationType) {
    this.integrationType = integrationType;
  }


  public Institution status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Indicates whether Belvo&#39;s integration with the institution is currently active (&#x60;healthy&#x60;) or undergoing maintenance (&#x60;down&#x60;). 
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "healthy", value = "Indicates whether Belvo's integration with the institution is currently active (`healthy`) or undergoing maintenance (`down`). ")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Institution institution = (Institution) o;
    return Objects.equals(this.id, institution.id) &&
        Objects.equals(this.name, institution.name) &&
        Objects.equals(this.type, institution.type) &&
        equalsNullable(this.website, institution.website) &&
        Objects.equals(this.displayName, institution.displayName) &&
        Objects.equals(this.countryCodes, institution.countryCodes) &&
        Objects.equals(this.primaryColor, institution.primaryColor) &&
        equalsNullable(this.logo, institution.logo) &&
        equalsNullable(this.iconLogo, institution.iconLogo) &&
        equalsNullable(this.textLogo, institution.textLogo) &&
        Objects.equals(this.formFields, institution.formFields) &&
        Objects.equals(this.features, institution.features) &&
        Objects.equals(this.resources, institution.resources) &&
        Objects.equals(this.integrationType, institution.integrationType) &&
        Objects.equals(this.status, institution.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, hashCodeNullable(website), displayName, countryCodes, primaryColor, hashCodeNullable(logo), hashCodeNullable(iconLogo), hashCodeNullable(textLogo), formFields, features, resources, integrationType, status);
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
    sb.append("class Institution {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    countryCodes: ").append(toIndentedString(countryCodes)).append("\n");
    sb.append("    primaryColor: ").append(toIndentedString(primaryColor)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    iconLogo: ").append(toIndentedString(iconLogo)).append("\n");
    sb.append("    textLogo: ").append(toIndentedString(textLogo)).append("\n");
    sb.append("    formFields: ").append(toIndentedString(formFields)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

