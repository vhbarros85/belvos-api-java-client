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
 * LinksRequest
 */
@JsonPropertyOrder({
  LinksRequest.JSON_PROPERTY_INSTITUTION,
  LinksRequest.JSON_PROPERTY_USERNAME,
  LinksRequest.JSON_PROPERTY_PASSWORD,
  LinksRequest.JSON_PROPERTY_EXTERNAL_ID,
  LinksRequest.JSON_PROPERTY_USERNAME2,
  LinksRequest.JSON_PROPERTY_USERNAME3,
  LinksRequest.JSON_PROPERTY_PASSWORD2,
  LinksRequest.JSON_PROPERTY_TOKEN,
  LinksRequest.JSON_PROPERTY_ACCESS_MODE,
  LinksRequest.JSON_PROPERTY_USERNAME_TYPE,
  LinksRequest.JSON_PROPERTY_CERTIFICATE,
  LinksRequest.JSON_PROPERTY_PRIVATE_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class LinksRequest {
  public static final String JSON_PROPERTY_INSTITUTION = "institution";
  private String institution;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "external_id";
  private String externalId;

  public static final String JSON_PROPERTY_USERNAME2 = "username2";
  private String username2;

  public static final String JSON_PROPERTY_USERNAME3 = "username3";
  private String username3;

  public static final String JSON_PROPERTY_PASSWORD2 = "password2";
  private String password2;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private JsonNullable<String> token = JsonNullable.<String>undefined();

  /**
   * The type of link to create.  - Use &#x60;single&#x60; to do ad hoc one-time POST requests for accounts, owners, and transactions. - Use &#x60;recurrent&#x60; to have Belvo access information on a recurrent basis so you always have fresh account, owner, balance, and transaction data.  For more information, see our [Links](https://developers.belvo.com/docs/links-and-institutions#links) article. 
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
  private AccessModeEnum accessMode = AccessModeEnum.RECURRENT;

  public static final String JSON_PROPERTY_USERNAME_TYPE = "username_type";
  private JsonNullable<String> usernameType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private JsonNullable<String> certificate = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRIVATE_KEY = "private_key";
  private JsonNullable<String> privateKey = JsonNullable.<String>undefined();

  public LinksRequest() {
  }

  public LinksRequest institution(String institution) {
    
    this.institution = institution;
    return this;
  }

   /**
   * The Belvo name for the institution.
   * @return institution
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "erebor_mx_retail", required = true, value = "The Belvo name for the institution.")
  @JsonProperty(JSON_PROPERTY_INSTITUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInstitution() {
    return institution;
  }


  @JsonProperty(JSON_PROPERTY_INSTITUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstitution(String institution) {
    this.institution = institution;
  }


  public LinksRequest username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The end-user&#39;s username used to log in to the institution.
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "username", required = true, value = "The end-user's username used to log in to the institution.")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsername(String username) {
    this.username = username;
  }


  public LinksRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The end-user&#39;s password used to log in to the institution.
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "password", required = true, value = "The end-user's password used to log in to the institution.")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassword(String password) {
    this.password = password;
  }


  public LinksRequest externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * An additional identifier for the link, provided by you, to store in the Belvo database. **Cannot** include any Personal Identifiable Information (PII).  If we identify that the identifier contains PII, we will force a &#x60;null&#x60; value. For more information, see our [Link creation article](https://developers.belvo.com/docs/link-creation-best-practices#adding-your-own-identifier).
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "56ab5706-6e00-48a4-91c9-ca55968678d9", value = "An additional identifier for the link, provided by you, to store in the Belvo database. **Cannot** include any Personal Identifiable Information (PII).  If we identify that the identifier contains PII, we will force a `null` value. For more information, see our [Link creation article](https://developers.belvo.com/docs/link-creation-best-practices#adding-your-own-identifier).")
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


  public LinksRequest username2(String username2) {
    
    this.username2 = username2;
    return this;
  }

   /**
   * The end-user&#39;s second username used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second username, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response. 
   * @return username2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "secondusername", value = "The end-user's second username used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second username, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response. ")
  @JsonProperty(JSON_PROPERTY_USERNAME2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername2() {
    return username2;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername2(String username2) {
    this.username2 = username2;
  }


  public LinksRequest username3(String username3) {
    
    this.username3 = username3;
    return this;
  }

   /**
   * The end-user&#39;s third username used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a third username, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response. 
   * @return username3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "thirdusername", value = "The end-user's third username used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a third username, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response. ")
  @JsonProperty(JSON_PROPERTY_USERNAME3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername3() {
    return username3;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername3(String username3) {
    this.username3 = username3;
  }


  public LinksRequest password2(String password2) {
    
    this.password2 = password2;
    return this;
  }

   /**
   * The end-user&#39;s second password used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second password, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response. 
   * @return password2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pin", value = "The end-user's second password used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second password, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response. ")
  @JsonProperty(JSON_PROPERTY_PASSWORD2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword2() {
    return password2;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword2(String password2) {
    this.password2 = password2;
  }


  public LinksRequest token(String token) {
    this.token = JsonNullable.<String>of(token);
    
    return this;
  }

   /**
   * The MFA token required by the bank to log in.  We do not recommend sending the authentication token in the same request as registering the user. See our [Handling multi-factor authentication](https://developers.belvo.com/docs/handling-2-factor-authentication) article for more information and best practices. 
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234ab", value = "The MFA token required by the bank to log in.  We do not recommend sending the authentication token in the same request as registering the user. See our [Handling multi-factor authentication](https://developers.belvo.com/docs/handling-2-factor-authentication) article for more information and best practices. ")
  @JsonIgnore

  public String getToken() {
        return token.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getToken_JsonNullable() {
    return token;
  }
  
  @JsonProperty(JSON_PROPERTY_TOKEN)
  public void setToken_JsonNullable(JsonNullable<String> token) {
    this.token = token;
  }

  public void setToken(String token) {
    this.token = JsonNullable.<String>of(token);
  }


  public LinksRequest accessMode(AccessModeEnum accessMode) {
    
    this.accessMode = accessMode;
    return this;
  }

   /**
   * The type of link to create.  - Use &#x60;single&#x60; to do ad hoc one-time POST requests for accounts, owners, and transactions. - Use &#x60;recurrent&#x60; to have Belvo access information on a recurrent basis so you always have fresh account, owner, balance, and transaction data.  For more information, see our [Links](https://developers.belvo.com/docs/links-and-institutions#links) article. 
   * @return accessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of link to create.  - Use `single` to do ad hoc one-time POST requests for accounts, owners, and transactions. - Use `recurrent` to have Belvo access information on a recurrent basis so you always have fresh account, owner, balance, and transaction data.  For more information, see our [Links](https://developers.belvo.com/docs/links-and-institutions#links) article. ")
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


  public LinksRequest usernameType(String usernameType) {
    this.usernameType = JsonNullable.<String>of(usernameType);
    
    return this;
  }

   /**
   * Type of document to be used as a username.  Some banking institutions accept different documents to be used as the &#x60;username&#x60; to login. For example, the *Cédula de Ciudadanía*, *Cédula de Extranjería*, *Pasaporte&#39;*, and so on.  For banks that require a document to log in, you **must** provide the &#x60;username_type&#x60; parameter to specify which document is used when creating the link.  ℹ️ To know which institutions require the &#x60;username_type&#x60; parameter, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response.  For a list of standards codes, see the table below.  | Code | Description | |-----------|-------| | &#x60;001&#x60; | Cédula de Ciudadanía | | &#x60;002&#x60; | Cédula de Extranjería | | &#x60;003&#x60; | Pasaporte | | &#x60;004&#x60; | Tarjeta de Identidad | | &#x60;005&#x60; | Registro Civil | | &#x60;006&#x60; | Número Identificación Personal | | &#x60;020&#x60; | NIT | | &#x60;021&#x60; | NIT Persona Natural | | &#x60;022&#x60; | NIT Persona Extranjera | | &#x60;023&#x60; | NIT Persona Jurídica | | &#x60;024&#x60; | NIT Menores | | &#x60;025&#x60; | NIT Desasociado | | &#x60;030&#x60; | Trj. Seguro Social Extranjero | | &#x60;031&#x60; | Sociedad Extranjera sin NIT en Colombia | | &#x60;032&#x60; | Fideicomiso | | &#x60;033&#x60; | RIF Venezuela | | &#x60;034&#x60; | CIF | | &#x60;035&#x60; | Número de Identidad | | &#x60;036&#x60; | RTN | | &#x60;037&#x60; | Cédula de Identidad | | &#x60;038&#x60; | DIMEX | | &#x60;039&#x60; | CED | | &#x60;040&#x60; | PAS | | &#x60;041&#x60; | Documento Único de Identidad | | &#x60;042&#x60; | NIT Salvadoreño | | &#x60;100&#x60; | Agência e conta | | &#x60;101&#x60; | Código do operador | | &#x60;102&#x60; | Cartão de crédito | | &#x60;103&#x60; | CPF | 
   * @return usernameType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "001", value = "Type of document to be used as a username.  Some banking institutions accept different documents to be used as the `username` to login. For example, the *Cédula de Ciudadanía*, *Cédula de Extranjería*, *Pasaporte'*, and so on.  For banks that require a document to log in, you **must** provide the `username_type` parameter to specify which document is used when creating the link.  ℹ️ To know which institutions require the `username_type` parameter, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response.  For a list of standards codes, see the table below.  | Code | Description | |-----------|-------| | `001` | Cédula de Ciudadanía | | `002` | Cédula de Extranjería | | `003` | Pasaporte | | `004` | Tarjeta de Identidad | | `005` | Registro Civil | | `006` | Número Identificación Personal | | `020` | NIT | | `021` | NIT Persona Natural | | `022` | NIT Persona Extranjera | | `023` | NIT Persona Jurídica | | `024` | NIT Menores | | `025` | NIT Desasociado | | `030` | Trj. Seguro Social Extranjero | | `031` | Sociedad Extranjera sin NIT en Colombia | | `032` | Fideicomiso | | `033` | RIF Venezuela | | `034` | CIF | | `035` | Número de Identidad | | `036` | RTN | | `037` | Cédula de Identidad | | `038` | DIMEX | | `039` | CED | | `040` | PAS | | `041` | Documento Único de Identidad | | `042` | NIT Salvadoreño | | `100` | Agência e conta | | `101` | Código do operador | | `102` | Cartão de crédito | | `103` | CPF | ")
  @JsonIgnore

  public String getUsernameType() {
        return usernameType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USERNAME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUsernameType_JsonNullable() {
    return usernameType;
  }
  
  @JsonProperty(JSON_PROPERTY_USERNAME_TYPE)
  public void setUsernameType_JsonNullable(JsonNullable<String> usernameType) {
    this.usernameType = usernameType;
  }

  public void setUsernameType(String usernameType) {
    this.usernameType = JsonNullable.<String>of(usernameType);
  }


  public LinksRequest certificate(String certificate) {
    this.certificate = JsonNullable.<String>of(certificate);
    
    return this;
  }

   /**
   * For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded &#x60;certificate&#x60;. If the &#x60;certificate&#x60; parameter is used, you *must* also provide the &#x60;private_key&#x60; parameter. 
   * @return certificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890abcd=", value = "For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded `certificate`. If the `certificate` parameter is used, you *must* also provide the `private_key` parameter. ")
  @JsonIgnore

  public String getCertificate() {
        return certificate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCertificate_JsonNullable() {
    return certificate;
  }
  
  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  public void setCertificate_JsonNullable(JsonNullable<String> certificate) {
    this.certificate = certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = JsonNullable.<String>of(certificate);
  }


  public LinksRequest privateKey(String privateKey) {
    this.privateKey = JsonNullable.<String>of(privateKey);
    
    return this;
  }

   /**
   * For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded &#x60;private_key&#x60;. If the &#x60;private_key&#x60; parameter is used, you *must* also provide the &#x60;certificate&#x60; parameter. 
   * @return privateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890abcd=", value = "For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded `private_key`. If the `private_key` parameter is used, you *must* also provide the `certificate` parameter. ")
  @JsonIgnore

  public String getPrivateKey() {
        return privateKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPrivateKey_JsonNullable() {
    return privateKey;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  public void setPrivateKey_JsonNullable(JsonNullable<String> privateKey) {
    this.privateKey = privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = JsonNullable.<String>of(privateKey);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksRequest linksRequest = (LinksRequest) o;
    return Objects.equals(this.institution, linksRequest.institution) &&
        Objects.equals(this.username, linksRequest.username) &&
        Objects.equals(this.password, linksRequest.password) &&
        Objects.equals(this.externalId, linksRequest.externalId) &&
        Objects.equals(this.username2, linksRequest.username2) &&
        Objects.equals(this.username3, linksRequest.username3) &&
        Objects.equals(this.password2, linksRequest.password2) &&
        equalsNullable(this.token, linksRequest.token) &&
        Objects.equals(this.accessMode, linksRequest.accessMode) &&
        equalsNullable(this.usernameType, linksRequest.usernameType) &&
        equalsNullable(this.certificate, linksRequest.certificate) &&
        equalsNullable(this.privateKey, linksRequest.privateKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(institution, username, password, externalId, username2, username3, password2, hashCodeNullable(token), accessMode, hashCodeNullable(usernameType), hashCodeNullable(certificate), hashCodeNullable(privateKey));
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
    sb.append("class LinksRequest {\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    username2: ").append(toIndentedString(username2)).append("\n");
    sb.append("    username3: ").append(toIndentedString(username3)).append("\n");
    sb.append("    password2: ").append(toIndentedString(password2)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    usernameType: ").append(toIndentedString(usernameType)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

