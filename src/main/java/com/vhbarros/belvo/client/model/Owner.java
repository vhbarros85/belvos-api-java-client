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
import com.vhbarros.belvo.client.model.OwnerDocumentId;
import com.vhbarros.belvo.client.model.OwnersGigData;
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
 * Owner
 */
@JsonPropertyOrder({
  Owner.JSON_PROPERTY_ID,
  Owner.JSON_PROPERTY_LINK,
  Owner.JSON_PROPERTY_INTERNAL_IDENTIFICATION,
  Owner.JSON_PROPERTY_COLLECTED_AT,
  Owner.JSON_PROPERTY_CREATED_AT,
  Owner.JSON_PROPERTY_DISPLAY_NAME,
  Owner.JSON_PROPERTY_EMAIL,
  Owner.JSON_PROPERTY_PHONE_NUMBER,
  Owner.JSON_PROPERTY_ADDRESS,
  Owner.JSON_PROPERTY_DOCUMENT_ID,
  Owner.JSON_PROPERTY_GIG_DATA,
  Owner.JSON_PROPERTY_FIRST_NAME,
  Owner.JSON_PROPERTY_LAST_NAME,
  Owner.JSON_PROPERTY_SECOND_LAST_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class Owner {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_LINK = "link";
  private UUID link;

  public static final String JSON_PROPERTY_INTERNAL_IDENTIFICATION = "internal_identification";
  private String internalIdentification;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private OffsetDateTime collectedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_DOCUMENT_ID = "document_id";
  private JsonNullable<OwnerDocumentId> documentId = JsonNullable.<OwnerDocumentId>undefined();

  public static final String JSON_PROPERTY_GIG_DATA = "gig_data";
  private JsonNullable<OwnersGigData> gigData = JsonNullable.<OwnersGigData>undefined();

  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  private JsonNullable<String> firstName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  private JsonNullable<String> lastName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SECOND_LAST_NAME = "second_last_name";
  private JsonNullable<String> secondLastName = JsonNullable.<String>undefined();

  public Owner() {
  }

  public Owner id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique identifier used to reference the current owner.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c749315b-eec2-435d-a458-06912878564f", value = "Belvo's unique identifier used to reference the current owner.")
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


  public Owner link(UUID link) {
    
    this.link = link;
    return this;
  }

   /**
   * Belvo&#39;s unique ID used to reference the current Link.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", value = "Belvo's unique ID used to reference the current Link.")
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


  public Owner internalIdentification(String internalIdentification) {
    
    this.internalIdentification = internalIdentification;
    return this;
  }

   /**
   * The institution&#39;s internal identifier for the owner.
   * @return internalIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7e5838e4", required = true, value = "The institution's internal identifier for the owner.")
  @JsonProperty(JSON_PROPERTY_INTERNAL_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInternalIdentification() {
    return internalIdentification;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInternalIdentification(String internalIdentification) {
    this.internalIdentification = internalIdentification;
  }


  public Owner collectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-09-27T13:01:41.941Z", required = true, value = "The ISO-8601 timestamp when the data point was collected.")
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


  public Owner createdAt(OffsetDateTime createdAt) {
    
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


  public Owner displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The full name of the owner, as provided by the bank.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe", required = true, value = "The full name of the owner, as provided by the bank.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Owner email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The account owner&#39;s registered email address.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "johndoe@belvo.com", required = true, value = "The account owner's registered email address.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public Owner phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The account owner&#39;s registered phone number.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+52-XXX-XXX-XXXX", required = true, value = "The account owner's registered phone number.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public Owner address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The accounts owners registered address.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Carrer de la Llacuna, 162, 08018 Barcelona", required = true, value = "The accounts owners registered address.")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(String address) {
    this.address = address;
  }


  public Owner documentId(OwnerDocumentId documentId) {
    this.documentId = JsonNullable.<OwnerDocumentId>of(documentId);
    
    return this;
  }

   /**
   * Get documentId
   * @return documentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OwnerDocumentId getDocumentId() {
        return documentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OwnerDocumentId> getDocumentId_JsonNullable() {
    return documentId;
  }
  
  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  public void setDocumentId_JsonNullable(JsonNullable<OwnerDocumentId> documentId) {
    this.documentId = documentId;
  }

  public void setDocumentId(OwnerDocumentId documentId) {
    this.documentId = JsonNullable.<OwnerDocumentId>of(documentId);
  }


  public Owner gigData(OwnersGigData gigData) {
    this.gigData = JsonNullable.<OwnersGigData>of(gigData);
    
    return this;
  }

   /**
   * Get gigData
   * @return gigData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OwnersGigData getGigData() {
        return gigData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GIG_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OwnersGigData> getGigData_JsonNullable() {
    return gigData;
  }
  
  @JsonProperty(JSON_PROPERTY_GIG_DATA)
  public void setGigData_JsonNullable(JsonNullable<OwnersGigData> gigData) {
    this.gigData = gigData;
  }

  public void setGigData(OwnersGigData gigData) {
    this.gigData = JsonNullable.<OwnersGigData>of(gigData);
  }


  public Owner firstName(String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
    
    return this;
  }

   /**
   * *This field has been deprecated.*  *The first name of the account owner.* 
   * @return firstName
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.*  *The first name of the account owner.* ")
  @JsonIgnore

  public String getFirstName() {
        return firstName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFirstName_JsonNullable() {
    return firstName;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  public void setFirstName_JsonNullable(JsonNullable<String> firstName) {
    this.firstName = firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
  }


  public Owner lastName(String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
    
    return this;
  }

   /**
   * *This field has been deprecated.*  *The last name of the account owner.* 
   * @return lastName
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.*  *The last name of the account owner.* ")
  @JsonIgnore

  public String getLastName() {
        return lastName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastName_JsonNullable() {
    return lastName;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  public void setLastName_JsonNullable(JsonNullable<String> lastName) {
    this.lastName = lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
  }


  public Owner secondLastName(String secondLastName) {
    this.secondLastName = JsonNullable.<String>of(secondLastName);
    
    return this;
  }

   /**
   * *This field has been deprecated.*  *The second last name of the account owner.* 
   * @return secondLastName
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.*  *The second last name of the account owner.* ")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Owner owner = (Owner) o;
    return Objects.equals(this.id, owner.id) &&
        Objects.equals(this.link, owner.link) &&
        Objects.equals(this.internalIdentification, owner.internalIdentification) &&
        Objects.equals(this.collectedAt, owner.collectedAt) &&
        Objects.equals(this.createdAt, owner.createdAt) &&
        Objects.equals(this.displayName, owner.displayName) &&
        Objects.equals(this.email, owner.email) &&
        Objects.equals(this.phoneNumber, owner.phoneNumber) &&
        Objects.equals(this.address, owner.address) &&
        equalsNullable(this.documentId, owner.documentId) &&
        equalsNullable(this.gigData, owner.gigData) &&
        equalsNullable(this.firstName, owner.firstName) &&
        equalsNullable(this.lastName, owner.lastName) &&
        equalsNullable(this.secondLastName, owner.secondLastName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, internalIdentification, collectedAt, createdAt, displayName, email, phoneNumber, address, hashCodeNullable(documentId), hashCodeNullable(gigData), hashCodeNullable(firstName), hashCodeNullable(lastName), hashCodeNullable(secondLastName));
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
    sb.append("class Owner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    internalIdentification: ").append(toIndentedString(internalIdentification)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    gigData: ").append(toIndentedString(gigData)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    secondLastName: ").append(toIndentedString(secondLastName)).append("\n");
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

