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
import com.vhbarros.belvo.client.model.TaxStatusAddress;
import com.vhbarros.belvo.client.model.TaxStatusEconomicActivity;
import com.vhbarros.belvo.client.model.TaxStatusObligations;
import com.vhbarros.belvo.client.model.TaxStatusRegimens;
import com.vhbarros.belvo.client.model.TaxStatusTaxPayerInformation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
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
 * TaxStatus
 */
@JsonPropertyOrder({
  TaxStatus.JSON_PROPERTY_ID,
  TaxStatus.JSON_PROPERTY_LINK,
  TaxStatus.JSON_PROPERTY_COLLECTED_AT,
  TaxStatus.JSON_PROPERTY_CREATED_AT,
  TaxStatus.JSON_PROPERTY_PLACE_AND_DATE_OF_ISSUANCE,
  TaxStatus.JSON_PROPERTY_OFFICIAL_NAME,
  TaxStatus.JSON_PROPERTY_ID_CIF,
  TaxStatus.JSON_PROPERTY_TAX_PAYER_INFORMATION,
  TaxStatus.JSON_PROPERTY_ADDRESS,
  TaxStatus.JSON_PROPERTY_ECONOMIC_ACTIVITY,
  TaxStatus.JSON_PROPERTY_REGIMENS,
  TaxStatus.JSON_PROPERTY_OBLIGATIONS,
  TaxStatus.JSON_PROPERTY_DIGITAL_STAMP,
  TaxStatus.JSON_PROPERTY_DIGITAL_STAMP_CHAIN,
  TaxStatus.JSON_PROPERTY_PDF
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class TaxStatus {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_LINK = "link";
  private UUID link;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private OffsetDateTime collectedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_PLACE_AND_DATE_OF_ISSUANCE = "place_and_date_of_issuance";
  private JsonNullable<String> placeAndDateOfIssuance = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OFFICIAL_NAME = "official_name";
  private JsonNullable<String> officialName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID_CIF = "id_cif";
  private JsonNullable<String> idCif = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAX_PAYER_INFORMATION = "tax_payer_information";
  private JsonNullable<TaxStatusTaxPayerInformation> taxPayerInformation = JsonNullable.<TaxStatusTaxPayerInformation>undefined();

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private JsonNullable<TaxStatusAddress> address = JsonNullable.<TaxStatusAddress>undefined();

  public static final String JSON_PROPERTY_ECONOMIC_ACTIVITY = "economic_activity";
  private JsonNullable<List<TaxStatusEconomicActivity>> economicActivity = JsonNullable.<List<TaxStatusEconomicActivity>>undefined();

  public static final String JSON_PROPERTY_REGIMENS = "regimens";
  private JsonNullable<List<TaxStatusRegimens>> regimens = JsonNullable.<List<TaxStatusRegimens>>undefined();

  public static final String JSON_PROPERTY_OBLIGATIONS = "obligations";
  private JsonNullable<List<TaxStatusObligations>> obligations = JsonNullable.<List<TaxStatusObligations>>undefined();

  public static final String JSON_PROPERTY_DIGITAL_STAMP = "digital_stamp";
  private JsonNullable<String> digitalStamp = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DIGITAL_STAMP_CHAIN = "digital_stamp_chain";
  private JsonNullable<String> digitalStampChain = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PDF = "pdf";
  private File pdf;

  public TaxStatus() {
  }

  public TaxStatus id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier created by Belvo used to reference the current Tax Status.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21e9e25b-10a8-48a5-9e6a-4072b364b53f", value = "Unique identifier created by Belvo used to reference the current Tax Status.")
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


  public TaxStatus link(UUID link) {
    
    this.link = link;
    return this;
  }

   /**
   * The Link ID that the tax status is associated with.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c2280c05-cbeb-4a29-ae53-8f837a77995b", value = "The Link ID that the tax status is associated with.")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(UUID link) {
    this.link = link;
  }


  public TaxStatus collectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-04-23T21:32:55.336Z", required = true, value = "The ISO-8601 timestamp when the data point was collected.")
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


  public TaxStatus createdAt(OffsetDateTime createdAt) {
    
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


  public TaxStatus placeAndDateOfIssuance(String placeAndDateOfIssuance) {
    this.placeAndDateOfIssuance = JsonNullable.<String>of(placeAndDateOfIssuance);
    
    return this;
  }

   /**
   * The place and date of that the tax status was issued.
   * @return placeAndDateOfIssuance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TLALPAN , CIUDAD DE MEXICO A 19 DE MARZO DE 2020", value = "The place and date of that the tax status was issued.")
  @JsonIgnore

  public String getPlaceAndDateOfIssuance() {
        return placeAndDateOfIssuance.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PLACE_AND_DATE_OF_ISSUANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPlaceAndDateOfIssuance_JsonNullable() {
    return placeAndDateOfIssuance;
  }
  
  @JsonProperty(JSON_PROPERTY_PLACE_AND_DATE_OF_ISSUANCE)
  public void setPlaceAndDateOfIssuance_JsonNullable(JsonNullable<String> placeAndDateOfIssuance) {
    this.placeAndDateOfIssuance = placeAndDateOfIssuance;
  }

  public void setPlaceAndDateOfIssuance(String placeAndDateOfIssuance) {
    this.placeAndDateOfIssuance = JsonNullable.<String>of(placeAndDateOfIssuance);
  }


  public TaxStatus officialName(String officialName) {
    this.officialName = JsonNullable.<String>of(officialName);
    
    return this;
  }

   /**
   * The name of the person or business.
   * @return officialName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe", value = "The name of the person or business.")
  @JsonIgnore

  public String getOfficialName() {
        return officialName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OFFICIAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOfficialName_JsonNullable() {
    return officialName;
  }
  
  @JsonProperty(JSON_PROPERTY_OFFICIAL_NAME)
  public void setOfficialName_JsonNullable(JsonNullable<String> officialName) {
    this.officialName = officialName;
  }

  public void setOfficialName(String officialName) {
    this.officialName = JsonNullable.<String>of(officialName);
  }


  public TaxStatus idCif(String idCif) {
    this.idCif = JsonNullable.<String>of(idCif);
    
    return this;
  }

   /**
   * The taxpayer&#39;s *Cédula de Identificación Fiscal* (CIF) ID.
   * @return idCif
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345678901", value = "The taxpayer's *Cédula de Identificación Fiscal* (CIF) ID.")
  @JsonIgnore

  public String getIdCif() {
        return idCif.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_CIF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIdCif_JsonNullable() {
    return idCif;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_CIF)
  public void setIdCif_JsonNullable(JsonNullable<String> idCif) {
    this.idCif = idCif;
  }

  public void setIdCif(String idCif) {
    this.idCif = JsonNullable.<String>of(idCif);
  }


  public TaxStatus taxPayerInformation(TaxStatusTaxPayerInformation taxPayerInformation) {
    this.taxPayerInformation = JsonNullable.<TaxStatusTaxPayerInformation>of(taxPayerInformation);
    
    return this;
  }

   /**
   * Get taxPayerInformation
   * @return taxPayerInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public TaxStatusTaxPayerInformation getTaxPayerInformation() {
        return taxPayerInformation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAX_PAYER_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<TaxStatusTaxPayerInformation> getTaxPayerInformation_JsonNullable() {
    return taxPayerInformation;
  }
  
  @JsonProperty(JSON_PROPERTY_TAX_PAYER_INFORMATION)
  public void setTaxPayerInformation_JsonNullable(JsonNullable<TaxStatusTaxPayerInformation> taxPayerInformation) {
    this.taxPayerInformation = taxPayerInformation;
  }

  public void setTaxPayerInformation(TaxStatusTaxPayerInformation taxPayerInformation) {
    this.taxPayerInformation = JsonNullable.<TaxStatusTaxPayerInformation>of(taxPayerInformation);
  }


  public TaxStatus address(TaxStatusAddress address) {
    this.address = JsonNullable.<TaxStatusAddress>of(address);
    
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public TaxStatusAddress getAddress() {
        return address.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<TaxStatusAddress> getAddress_JsonNullable() {
    return address;
  }
  
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  public void setAddress_JsonNullable(JsonNullable<TaxStatusAddress> address) {
    this.address = address;
  }

  public void setAddress(TaxStatusAddress address) {
    this.address = JsonNullable.<TaxStatusAddress>of(address);
  }


  public TaxStatus economicActivity(List<TaxStatusEconomicActivity> economicActivity) {
    this.economicActivity = JsonNullable.<List<TaxStatusEconomicActivity>>of(economicActivity);
    
    return this;
  }

  public TaxStatus addEconomicActivityItem(TaxStatusEconomicActivity economicActivityItem) {
    if (this.economicActivity == null || !this.economicActivity.isPresent()) {
      this.economicActivity = JsonNullable.<List<TaxStatusEconomicActivity>>of(new ArrayList<>());
    }
    try {
      this.economicActivity.get().add(economicActivityItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * A list of economic activity objects. 
   * @return economicActivity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of economic activity objects. ")
  @JsonIgnore

  public List<TaxStatusEconomicActivity> getEconomicActivity() {
        return economicActivity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ECONOMIC_ACTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TaxStatusEconomicActivity>> getEconomicActivity_JsonNullable() {
    return economicActivity;
  }
  
  @JsonProperty(JSON_PROPERTY_ECONOMIC_ACTIVITY)
  public void setEconomicActivity_JsonNullable(JsonNullable<List<TaxStatusEconomicActivity>> economicActivity) {
    this.economicActivity = economicActivity;
  }

  public void setEconomicActivity(List<TaxStatusEconomicActivity> economicActivity) {
    this.economicActivity = JsonNullable.<List<TaxStatusEconomicActivity>>of(economicActivity);
  }


  public TaxStatus regimens(List<TaxStatusRegimens> regimens) {
    this.regimens = JsonNullable.<List<TaxStatusRegimens>>of(regimens);
    
    return this;
  }

  public TaxStatus addRegimensItem(TaxStatusRegimens regimensItem) {
    if (this.regimens == null || !this.regimens.isPresent()) {
      this.regimens = JsonNullable.<List<TaxStatusRegimens>>of(new ArrayList<>());
    }
    try {
      this.regimens.get().add(regimensItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * A list of regimen objects. 
   * @return regimens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of regimen objects. ")
  @JsonIgnore

  public List<TaxStatusRegimens> getRegimens() {
        return regimens.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REGIMENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TaxStatusRegimens>> getRegimens_JsonNullable() {
    return regimens;
  }
  
  @JsonProperty(JSON_PROPERTY_REGIMENS)
  public void setRegimens_JsonNullable(JsonNullable<List<TaxStatusRegimens>> regimens) {
    this.regimens = regimens;
  }

  public void setRegimens(List<TaxStatusRegimens> regimens) {
    this.regimens = JsonNullable.<List<TaxStatusRegimens>>of(regimens);
  }


  public TaxStatus obligations(List<TaxStatusObligations> obligations) {
    this.obligations = JsonNullable.<List<TaxStatusObligations>>of(obligations);
    
    return this;
  }

  public TaxStatus addObligationsItem(TaxStatusObligations obligationsItem) {
    if (this.obligations == null || !this.obligations.isPresent()) {
      this.obligations = JsonNullable.<List<TaxStatusObligations>>of(new ArrayList<>());
    }
    try {
      this.obligations.get().add(obligationsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Details regarding a business&#39;s obligations.  ℹ️ For non-business accounts, this field will return empty. 
   * @return obligations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details regarding a business's obligations.  ℹ️ For non-business accounts, this field will return empty. ")
  @JsonIgnore

  public List<TaxStatusObligations> getObligations() {
        return obligations.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OBLIGATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TaxStatusObligations>> getObligations_JsonNullable() {
    return obligations;
  }
  
  @JsonProperty(JSON_PROPERTY_OBLIGATIONS)
  public void setObligations_JsonNullable(JsonNullable<List<TaxStatusObligations>> obligations) {
    this.obligations = obligations;
  }

  public void setObligations(List<TaxStatusObligations> obligations) {
    this.obligations = JsonNullable.<List<TaxStatusObligations>>of(obligations);
  }


  public TaxStatus digitalStamp(String digitalStamp) {
    this.digitalStamp = JsonNullable.<String>of(digitalStamp);
    
    return this;
  }

   /**
   * The validation certificate of the document.
   * @return digitalStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "||2020/04/26|GHTF980303F7|CONSTANCIA DE SITUACIÓN FISCAL|2044441088666600000034||", value = "The validation certificate of the document.")
  @JsonIgnore

  public String getDigitalStamp() {
        return digitalStamp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DIGITAL_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDigitalStamp_JsonNullable() {
    return digitalStamp;
  }
  
  @JsonProperty(JSON_PROPERTY_DIGITAL_STAMP)
  public void setDigitalStamp_JsonNullable(JsonNullable<String> digitalStamp) {
    this.digitalStamp = digitalStamp;
  }

  public void setDigitalStamp(String digitalStamp) {
    this.digitalStamp = JsonNullable.<String>of(digitalStamp);
  }


  public TaxStatus digitalStampChain(String digitalStampChain) {
    this.digitalStampChain = JsonNullable.<String>of(digitalStampChain);
    
    return this;
  }

   /**
   * A data chain containing the basic structure of a fiscal digital check.  - 🇲🇽 Mexico: Comprobante Fiscal Digital por Internet (CFDI) 
   * @return digitalStampChain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EtenSA9t1adG7bn+Jj23kj43JK+XbMPxdOppwabhXD+pXseSqYowWWDna0mpUk3264lkj2345j23faNZB852dCDt9KAjow=", value = "A data chain containing the basic structure of a fiscal digital check.  - 🇲🇽 Mexico: Comprobante Fiscal Digital por Internet (CFDI) ")
  @JsonIgnore

  public String getDigitalStampChain() {
        return digitalStampChain.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DIGITAL_STAMP_CHAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDigitalStampChain_JsonNullable() {
    return digitalStampChain;
  }
  
  @JsonProperty(JSON_PROPERTY_DIGITAL_STAMP_CHAIN)
  public void setDigitalStampChain_JsonNullable(JsonNullable<String> digitalStampChain) {
    this.digitalStampChain = digitalStampChain;
  }

  public void setDigitalStampChain(String digitalStampChain) {
    this.digitalStampChain = JsonNullable.<String>of(digitalStampChain);
  }


  public TaxStatus pdf(File pdf) {
    
    this.pdf = pdf;
    return this;
  }

   /**
   * Tax status PDF as a binary string.
   * @return pdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@600f427b", required = true, value = "Tax status PDF as a binary string.")
  @JsonProperty(JSON_PROPERTY_PDF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public File getPdf() {
    return pdf;
  }


  @JsonProperty(JSON_PROPERTY_PDF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPdf(File pdf) {
    this.pdf = pdf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxStatus taxStatus = (TaxStatus) o;
    return Objects.equals(this.id, taxStatus.id) &&
        Objects.equals(this.link, taxStatus.link) &&
        Objects.equals(this.collectedAt, taxStatus.collectedAt) &&
        Objects.equals(this.createdAt, taxStatus.createdAt) &&
        equalsNullable(this.placeAndDateOfIssuance, taxStatus.placeAndDateOfIssuance) &&
        equalsNullable(this.officialName, taxStatus.officialName) &&
        equalsNullable(this.idCif, taxStatus.idCif) &&
        equalsNullable(this.taxPayerInformation, taxStatus.taxPayerInformation) &&
        equalsNullable(this.address, taxStatus.address) &&
        equalsNullable(this.economicActivity, taxStatus.economicActivity) &&
        equalsNullable(this.regimens, taxStatus.regimens) &&
        equalsNullable(this.obligations, taxStatus.obligations) &&
        equalsNullable(this.digitalStamp, taxStatus.digitalStamp) &&
        equalsNullable(this.digitalStampChain, taxStatus.digitalStampChain) &&
        Objects.equals(this.pdf, taxStatus.pdf);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, collectedAt, createdAt, hashCodeNullable(placeAndDateOfIssuance), hashCodeNullable(officialName), hashCodeNullable(idCif), hashCodeNullable(taxPayerInformation), hashCodeNullable(address), hashCodeNullable(economicActivity), hashCodeNullable(regimens), hashCodeNullable(obligations), hashCodeNullable(digitalStamp), hashCodeNullable(digitalStampChain), pdf);
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
    sb.append("class TaxStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    placeAndDateOfIssuance: ").append(toIndentedString(placeAndDateOfIssuance)).append("\n");
    sb.append("    officialName: ").append(toIndentedString(officialName)).append("\n");
    sb.append("    idCif: ").append(toIndentedString(idCif)).append("\n");
    sb.append("    taxPayerInformation: ").append(toIndentedString(taxPayerInformation)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    economicActivity: ").append(toIndentedString(economicActivity)).append("\n");
    sb.append("    regimens: ").append(toIndentedString(regimens)).append("\n");
    sb.append("    obligations: ").append(toIndentedString(obligations)).append("\n");
    sb.append("    digitalStamp: ").append(toIndentedString(digitalStamp)).append("\n");
    sb.append("    digitalStampChain: ").append(toIndentedString(digitalStampChain)).append("\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
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

