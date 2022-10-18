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
import com.vhbarros.belvo.client.model.TaxStatusAddressBetweenStreet;
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
 * The tax payer&#39;s address details.
 */
@ApiModel(description = "The tax payer's address details.")
@JsonPropertyOrder({
  TaxStatusAddress.JSON_PROPERTY_POSTAL_CODE,
  TaxStatusAddress.JSON_PROPERTY_STREET_TYPE,
  TaxStatusAddress.JSON_PROPERTY_STREET,
  TaxStatusAddress.JSON_PROPERTY_EXTERIOR_NUMBER,
  TaxStatusAddress.JSON_PROPERTY_INTERIOR_NUMBER,
  TaxStatusAddress.JSON_PROPERTY_SUBURB,
  TaxStatusAddress.JSON_PROPERTY_LOCALITY,
  TaxStatusAddress.JSON_PROPERTY_MUNICIPALITY,
  TaxStatusAddress.JSON_PROPERTY_STATE,
  TaxStatusAddress.JSON_PROPERTY_BETWEEN_STREET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class TaxStatusAddress {
  public static final String JSON_PROPERTY_POSTAL_CODE = "postal_code";
  private String postalCode;

  public static final String JSON_PROPERTY_STREET_TYPE = "street_type";
  private JsonNullable<String> streetType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STREET = "street";
  private JsonNullable<String> street = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXTERIOR_NUMBER = "exterior_number";
  private JsonNullable<String> exteriorNumber = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INTERIOR_NUMBER = "interior_number";
  private JsonNullable<String> interiorNumber = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUBURB = "suburb";
  private JsonNullable<String> suburb = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOCALITY = "locality";
  private JsonNullable<String> locality = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MUNICIPALITY = "municipality";
  private JsonNullable<String> municipality = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private JsonNullable<String> state = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BETWEEN_STREET = "between_street";
  private JsonNullable<List<TaxStatusAddressBetweenStreet>> betweenStreet = JsonNullable.<List<TaxStatusAddressBetweenStreet>>undefined();

  public TaxStatusAddress() {
  }

  public TaxStatusAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postcode of the address.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", required = true, value = "The postcode of the address.")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public TaxStatusAddress streetType(String streetType) {
    this.streetType = JsonNullable.<String>of(streetType);
    
    return this;
  }

   /**
   * The &#x60;street&#x60; type.
   * @return streetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CALLE", value = "The `street` type.")
  @JsonIgnore

  public String getStreetType() {
        return streetType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STREET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStreetType_JsonNullable() {
    return streetType;
  }
  
  @JsonProperty(JSON_PROPERTY_STREET_TYPE)
  public void setStreetType_JsonNullable(JsonNullable<String> streetType) {
    this.streetType = streetType;
  }

  public void setStreetType(String streetType) {
    this.streetType = JsonNullable.<String>of(streetType);
  }


  public TaxStatusAddress street(String street) {
    this.street = JsonNullable.<String>of(street);
    
    return this;
  }

   /**
   * The tax payers street.
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LA MALINCHE", value = "The tax payers street.")
  @JsonIgnore

  public String getStreet() {
        return street.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStreet_JsonNullable() {
    return street;
  }
  
  @JsonProperty(JSON_PROPERTY_STREET)
  public void setStreet_JsonNullable(JsonNullable<String> street) {
    this.street = street;
  }

  public void setStreet(String street) {
    this.street = JsonNullable.<String>of(street);
  }


  public TaxStatusAddress exteriorNumber(String exteriorNumber) {
    this.exteriorNumber = JsonNullable.<String>of(exteriorNumber);
    
    return this;
  }

   /**
   * The street number.
   * @return exteriorNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "432", value = "The street number.")
  @JsonIgnore

  public String getExteriorNumber() {
        return exteriorNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERIOR_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExteriorNumber_JsonNullable() {
    return exteriorNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTERIOR_NUMBER)
  public void setExteriorNumber_JsonNullable(JsonNullable<String> exteriorNumber) {
    this.exteriorNumber = exteriorNumber;
  }

  public void setExteriorNumber(String exteriorNumber) {
    this.exteriorNumber = JsonNullable.<String>of(exteriorNumber);
  }


  public TaxStatusAddress interiorNumber(String interiorNumber) {
    this.interiorNumber = JsonNullable.<String>of(interiorNumber);
    
    return this;
  }

   /**
   * Additional address information.
   * @return interiorNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PLANTA BAJA", value = "Additional address information.")
  @JsonIgnore

  public String getInteriorNumber() {
        return interiorNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTERIOR_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInteriorNumber_JsonNullable() {
    return interiorNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_INTERIOR_NUMBER)
  public void setInteriorNumber_JsonNullable(JsonNullable<String> interiorNumber) {
    this.interiorNumber = interiorNumber;
  }

  public void setInteriorNumber(String interiorNumber) {
    this.interiorNumber = JsonNullable.<String>of(interiorNumber);
  }


  public TaxStatusAddress suburb(String suburb) {
    this.suburb = JsonNullable.<String>of(suburb);
    
    return this;
  }

   /**
   * The suburb of the tax payer.
   * @return suburb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COLINAS DEL BOSQUE", value = "The suburb of the tax payer.")
  @JsonIgnore

  public String getSuburb() {
        return suburb.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBURB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSuburb_JsonNullable() {
    return suburb;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBURB)
  public void setSuburb_JsonNullable(JsonNullable<String> suburb) {
    this.suburb = suburb;
  }

  public void setSuburb(String suburb) {
    this.suburb = JsonNullable.<String>of(suburb);
  }


  public TaxStatusAddress locality(String locality) {
    this.locality = JsonNullable.<String>of(locality);
    
    return this;
  }

   /**
   * The locality of the address.
   * @return locality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TLALPAN", value = "The locality of the address.")
  @JsonIgnore

  public String getLocality() {
        return locality.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLocality_JsonNullable() {
    return locality;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCALITY)
  public void setLocality_JsonNullable(JsonNullable<String> locality) {
    this.locality = locality;
  }

  public void setLocality(String locality) {
    this.locality = JsonNullable.<String>of(locality);
  }


  public TaxStatusAddress municipality(String municipality) {
    this.municipality = JsonNullable.<String>of(municipality);
    
    return this;
  }

   /**
   * The municipality of the address.
   * @return municipality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TLALPAN", value = "The municipality of the address.")
  @JsonIgnore

  public String getMunicipality() {
        return municipality.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MUNICIPALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMunicipality_JsonNullable() {
    return municipality;
  }
  
  @JsonProperty(JSON_PROPERTY_MUNICIPALITY)
  public void setMunicipality_JsonNullable(JsonNullable<String> municipality) {
    this.municipality = municipality;
  }

  public void setMunicipality(String municipality) {
    this.municipality = JsonNullable.<String>of(municipality);
  }


  public TaxStatusAddress state(String state) {
    this.state = JsonNullable.<String>of(state);
    
    return this;
  }

   /**
   * The state that the address is in.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CIUDAD DE MEXICO", value = "The state that the address is in.")
  @JsonIgnore

  public String getState() {
        return state.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getState_JsonNullable() {
    return state;
  }
  
  @JsonProperty(JSON_PROPERTY_STATE)
  public void setState_JsonNullable(JsonNullable<String> state) {
    this.state = state;
  }

  public void setState(String state) {
    this.state = JsonNullable.<String>of(state);
  }


  public TaxStatusAddress betweenStreet(List<TaxStatusAddressBetweenStreet> betweenStreet) {
    this.betweenStreet = JsonNullable.<List<TaxStatusAddressBetweenStreet>>of(betweenStreet);
    
    return this;
  }

  public TaxStatusAddress addBetweenStreetItem(TaxStatusAddressBetweenStreet betweenStreetItem) {
    if (this.betweenStreet == null || !this.betweenStreet.isPresent()) {
      this.betweenStreet = JsonNullable.<List<TaxStatusAddressBetweenStreet>>of(new ArrayList<>());
    }
    try {
      this.betweenStreet.get().add(betweenStreetItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Additional information about where the &#x60;street&#x60; is located.
   * @return betweenStreet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional information about where the `street` is located.")
  @JsonIgnore

  public List<TaxStatusAddressBetweenStreet> getBetweenStreet() {
        return betweenStreet.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BETWEEN_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TaxStatusAddressBetweenStreet>> getBetweenStreet_JsonNullable() {
    return betweenStreet;
  }
  
  @JsonProperty(JSON_PROPERTY_BETWEEN_STREET)
  public void setBetweenStreet_JsonNullable(JsonNullable<List<TaxStatusAddressBetweenStreet>> betweenStreet) {
    this.betweenStreet = betweenStreet;
  }

  public void setBetweenStreet(List<TaxStatusAddressBetweenStreet> betweenStreet) {
    this.betweenStreet = JsonNullable.<List<TaxStatusAddressBetweenStreet>>of(betweenStreet);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxStatusAddress taxStatusAddress = (TaxStatusAddress) o;
    return Objects.equals(this.postalCode, taxStatusAddress.postalCode) &&
        equalsNullable(this.streetType, taxStatusAddress.streetType) &&
        equalsNullable(this.street, taxStatusAddress.street) &&
        equalsNullable(this.exteriorNumber, taxStatusAddress.exteriorNumber) &&
        equalsNullable(this.interiorNumber, taxStatusAddress.interiorNumber) &&
        equalsNullable(this.suburb, taxStatusAddress.suburb) &&
        equalsNullable(this.locality, taxStatusAddress.locality) &&
        equalsNullable(this.municipality, taxStatusAddress.municipality) &&
        equalsNullable(this.state, taxStatusAddress.state) &&
        equalsNullable(this.betweenStreet, taxStatusAddress.betweenStreet);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(postalCode, hashCodeNullable(streetType), hashCodeNullable(street), hashCodeNullable(exteriorNumber), hashCodeNullable(interiorNumber), hashCodeNullable(suburb), hashCodeNullable(locality), hashCodeNullable(municipality), hashCodeNullable(state), hashCodeNullable(betweenStreet));
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
    sb.append("class TaxStatusAddress {\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    exteriorNumber: ").append(toIndentedString(exteriorNumber)).append("\n");
    sb.append("    interiorNumber: ").append(toIndentedString(interiorNumber)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    betweenStreet: ").append(toIndentedString(betweenStreet)).append("\n");
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

