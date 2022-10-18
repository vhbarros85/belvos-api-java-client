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
import com.vhbarros.belvo.client.model.TransactionBreakdown;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Additional data provided by the institution on the transaction. This data is provided only by gig economy institutions.
 */
@ApiModel(description = "Additional data provided by the institution on the transaction. This data is provided only by gig economy institutions.")
@JsonPropertyOrder({
  TransactionGigData.JSON_PROPERTY_PICKUP_AT,
  TransactionGigData.JSON_PROPERTY_DROPOFF_AT,
  TransactionGigData.JSON_PROPERTY_REQUEST_AT,
  TransactionGigData.JSON_PROPERTY_PICKUP_ADDRESS,
  TransactionGigData.JSON_PROPERTY_DROPOFF_ADDRESS,
  TransactionGigData.JSON_PROPERTY_PICKUP_LATITUDE,
  TransactionGigData.JSON_PROPERTY_PICKUP_LONGITUDE,
  TransactionGigData.JSON_PROPERTY_DROPOFF_LATITUDE,
  TransactionGigData.JSON_PROPERTY_DROPOFF_LONGITUDE,
  TransactionGigData.JSON_PROPERTY_DISTANCE,
  TransactionGigData.JSON_PROPERTY_PAYMENT_METHOD,
  TransactionGigData.JSON_PROPERTY_VEHICLE_TYPE,
  TransactionGigData.JSON_PROPERTY_MERCHANT_TYPE,
  TransactionGigData.JSON_PROPERTY_BREAKDOWN,
  TransactionGigData.JSON_PROPERTY_COLLECTED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class TransactionGigData {
  public static final String JSON_PROPERTY_PICKUP_AT = "pickup_at";
  private JsonNullable<OffsetDateTime> pickupAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_DROPOFF_AT = "dropoff_at";
  private JsonNullable<OffsetDateTime> dropoffAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_REQUEST_AT = "request_at";
  private JsonNullable<OffsetDateTime> requestAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_PICKUP_ADDRESS = "pickup_address";
  private JsonNullable<String> pickupAddress = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DROPOFF_ADDRESS = "dropoff_address";
  private JsonNullable<String> dropoffAddress = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PICKUP_LATITUDE = "pickup_latitude";
  private JsonNullable<String> pickupLatitude = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PICKUP_LONGITUDE = "pickup_longitude";
  private JsonNullable<String> pickupLongitude = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DROPOFF_LATITUDE = "dropoff_latitude";
  private JsonNullable<String> dropoffLatitude = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DROPOFF_LONGITUDE = "dropoff_longitude";
  private JsonNullable<String> dropoffLongitude = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private JsonNullable<Float> distance = JsonNullable.<Float>undefined();

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "payment_method";
  private JsonNullable<String> paymentMethod = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VEHICLE_TYPE = "vehicle_type";
  private JsonNullable<String> vehicleType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MERCHANT_TYPE = "merchant_type";
  private JsonNullable<String> merchantType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BREAKDOWN = "breakdown";
  private JsonNullable<List<TransactionBreakdown>> breakdown = JsonNullable.<List<TransactionBreakdown>>undefined();

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private JsonNullable<OffsetDateTime> collectedAt = JsonNullable.<OffsetDateTime>undefined();

  public TransactionGigData() {
  }

  public TransactionGigData pickupAt(OffsetDateTime pickupAt) {
    this.pickupAt = JsonNullable.<OffsetDateTime>of(pickupAt);
    
    return this;
  }

   /**
   * Pickup ISO-8601 timestamp for one trip transaction or delivery.
   * @return pickupAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-11-28T10:27:44.813Z", value = "Pickup ISO-8601 timestamp for one trip transaction or delivery.")
  @JsonIgnore

  public OffsetDateTime getPickupAt() {
        return pickupAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PICKUP_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getPickupAt_JsonNullable() {
    return pickupAt;
  }
  
  @JsonProperty(JSON_PROPERTY_PICKUP_AT)
  public void setPickupAt_JsonNullable(JsonNullable<OffsetDateTime> pickupAt) {
    this.pickupAt = pickupAt;
  }

  public void setPickupAt(OffsetDateTime pickupAt) {
    this.pickupAt = JsonNullable.<OffsetDateTime>of(pickupAt);
  }


  public TransactionGigData dropoffAt(OffsetDateTime dropoffAt) {
    this.dropoffAt = JsonNullable.<OffsetDateTime>of(dropoffAt);
    
    return this;
  }

   /**
   * Dropoff ISO-8601 timestamp for one trip transaction or delivery.
   * @return dropoffAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-11-28T10:27:44.813Z", value = "Dropoff ISO-8601 timestamp for one trip transaction or delivery.")
  @JsonIgnore

  public OffsetDateTime getDropoffAt() {
        return dropoffAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DROPOFF_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getDropoffAt_JsonNullable() {
    return dropoffAt;
  }
  
  @JsonProperty(JSON_PROPERTY_DROPOFF_AT)
  public void setDropoffAt_JsonNullable(JsonNullable<OffsetDateTime> dropoffAt) {
    this.dropoffAt = dropoffAt;
  }

  public void setDropoffAt(OffsetDateTime dropoffAt) {
    this.dropoffAt = JsonNullable.<OffsetDateTime>of(dropoffAt);
  }


  public TransactionGigData requestAt(OffsetDateTime requestAt) {
    this.requestAt = JsonNullable.<OffsetDateTime>of(requestAt);
    
    return this;
  }

   /**
   * ISO-8601 timestamp when one trip transaction or delivery was requested.
   * @return requestAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-11-28T10:27:44.813Z", value = "ISO-8601 timestamp when one trip transaction or delivery was requested.")
  @JsonIgnore

  public OffsetDateTime getRequestAt() {
        return requestAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REQUEST_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getRequestAt_JsonNullable() {
    return requestAt;
  }
  
  @JsonProperty(JSON_PROPERTY_REQUEST_AT)
  public void setRequestAt_JsonNullable(JsonNullable<OffsetDateTime> requestAt) {
    this.requestAt = requestAt;
  }

  public void setRequestAt(OffsetDateTime requestAt) {
    this.requestAt = JsonNullable.<OffsetDateTime>of(requestAt);
  }


  public TransactionGigData pickupAddress(String pickupAddress) {
    this.pickupAddress = JsonNullable.<String>of(pickupAddress);
    
    return this;
  }

   /**
   * Pickup address for the trip or delivery.
   * @return pickupAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Carrer de la Llacuna, 162, 08018 Barcelona", value = "Pickup address for the trip or delivery.")
  @JsonIgnore

  public String getPickupAddress() {
        return pickupAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PICKUP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPickupAddress_JsonNullable() {
    return pickupAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_PICKUP_ADDRESS)
  public void setPickupAddress_JsonNullable(JsonNullable<String> pickupAddress) {
    this.pickupAddress = pickupAddress;
  }

  public void setPickupAddress(String pickupAddress) {
    this.pickupAddress = JsonNullable.<String>of(pickupAddress);
  }


  public TransactionGigData dropoffAddress(String dropoffAddress) {
    this.dropoffAddress = JsonNullable.<String>of(dropoffAddress);
    
    return this;
  }

   /**
   * Dropoff address for the trip or delivery.
   * @return dropoffAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Carrer de la Llacuna, 162, 08018 Barcelona", value = "Dropoff address for the trip or delivery.")
  @JsonIgnore

  public String getDropoffAddress() {
        return dropoffAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DROPOFF_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDropoffAddress_JsonNullable() {
    return dropoffAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_DROPOFF_ADDRESS)
  public void setDropoffAddress_JsonNullable(JsonNullable<String> dropoffAddress) {
    this.dropoffAddress = dropoffAddress;
  }

  public void setDropoffAddress(String dropoffAddress) {
    this.dropoffAddress = JsonNullable.<String>of(dropoffAddress);
  }


  public TransactionGigData pickupLatitude(String pickupLatitude) {
    this.pickupLatitude = JsonNullable.<String>of(pickupLatitude);
    
    return this;
  }

   /**
   * *This field has been deprecated.*  *Latitude of the &#x60;pickup_address&#x60;.* 
   * @return pickupLatitude
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.*  *Latitude of the `pickup_address`.* ")
  @JsonIgnore

  public String getPickupLatitude() {
        return pickupLatitude.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PICKUP_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPickupLatitude_JsonNullable() {
    return pickupLatitude;
  }
  
  @JsonProperty(JSON_PROPERTY_PICKUP_LATITUDE)
  public void setPickupLatitude_JsonNullable(JsonNullable<String> pickupLatitude) {
    this.pickupLatitude = pickupLatitude;
  }

  public void setPickupLatitude(String pickupLatitude) {
    this.pickupLatitude = JsonNullable.<String>of(pickupLatitude);
  }


  public TransactionGigData pickupLongitude(String pickupLongitude) {
    this.pickupLongitude = JsonNullable.<String>of(pickupLongitude);
    
    return this;
  }

   /**
   * *This field has been deprecated.*  *Longitude of the &#x60;pickup_address&#x60;.* 
   * @return pickupLongitude
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.*  *Longitude of the `pickup_address`.* ")
  @JsonIgnore

  public String getPickupLongitude() {
        return pickupLongitude.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PICKUP_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPickupLongitude_JsonNullable() {
    return pickupLongitude;
  }
  
  @JsonProperty(JSON_PROPERTY_PICKUP_LONGITUDE)
  public void setPickupLongitude_JsonNullable(JsonNullable<String> pickupLongitude) {
    this.pickupLongitude = pickupLongitude;
  }

  public void setPickupLongitude(String pickupLongitude) {
    this.pickupLongitude = JsonNullable.<String>of(pickupLongitude);
  }


  public TransactionGigData dropoffLatitude(String dropoffLatitude) {
    this.dropoffLatitude = JsonNullable.<String>of(dropoffLatitude);
    
    return this;
  }

   /**
   * *This field has been deprecated.*  *Latitude of the &#x60;dropoff_address&#x60;.* 
   * @return dropoffLatitude
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.*  *Latitude of the `dropoff_address`.* ")
  @JsonIgnore

  public String getDropoffLatitude() {
        return dropoffLatitude.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DROPOFF_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDropoffLatitude_JsonNullable() {
    return dropoffLatitude;
  }
  
  @JsonProperty(JSON_PROPERTY_DROPOFF_LATITUDE)
  public void setDropoffLatitude_JsonNullable(JsonNullable<String> dropoffLatitude) {
    this.dropoffLatitude = dropoffLatitude;
  }

  public void setDropoffLatitude(String dropoffLatitude) {
    this.dropoffLatitude = JsonNullable.<String>of(dropoffLatitude);
  }


  public TransactionGigData dropoffLongitude(String dropoffLongitude) {
    this.dropoffLongitude = JsonNullable.<String>of(dropoffLongitude);
    
    return this;
  }

   /**
   * *This field has been deprecated.*  *Longitude of the &#x60;dropoff_address&#x60;.* 
   * @return dropoffLongitude
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.*  *Longitude of the `dropoff_address`.* ")
  @JsonIgnore

  public String getDropoffLongitude() {
        return dropoffLongitude.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DROPOFF_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDropoffLongitude_JsonNullable() {
    return dropoffLongitude;
  }
  
  @JsonProperty(JSON_PROPERTY_DROPOFF_LONGITUDE)
  public void setDropoffLongitude_JsonNullable(JsonNullable<String> dropoffLongitude) {
    this.dropoffLongitude = dropoffLongitude;
  }

  public void setDropoffLongitude(String dropoffLongitude) {
    this.dropoffLongitude = JsonNullable.<String>of(dropoffLongitude);
  }


  public TransactionGigData distance(Float distance) {
    this.distance = JsonNullable.<Float>of(distance);
    
    return this;
  }

   /**
   * Distance in kilometers for the trip or delivery.
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "Distance in kilometers for the trip or delivery.")
  @JsonIgnore

  public Float getDistance() {
        return distance.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Float> getDistance_JsonNullable() {
    return distance;
  }
  
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  public void setDistance_JsonNullable(JsonNullable<Float> distance) {
    this.distance = distance;
  }

  public void setDistance(Float distance) {
    this.distance = JsonNullable.<Float>of(distance);
  }


  public TransactionGigData paymentMethod(String paymentMethod) {
    this.paymentMethod = JsonNullable.<String>of(paymentMethod);
    
    return this;
  }

   /**
   * Payment method for the transaction. For example, &#x60;CASH&#x60; or &#x60;IN_APP&#x60;.
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CASH", value = "Payment method for the transaction. For example, `CASH` or `IN_APP`.")
  @JsonIgnore

  public String getPaymentMethod() {
        return paymentMethod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPaymentMethod_JsonNullable() {
    return paymentMethod;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  public void setPaymentMethod_JsonNullable(JsonNullable<String> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = JsonNullable.<String>of(paymentMethod);
  }


  public TransactionGigData vehicleType(String vehicleType) {
    this.vehicleType = JsonNullable.<String>of(vehicleType);
    
    return this;
  }

   /**
   * Vehicle type used.
   * @return vehicleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CAR", value = "Vehicle type used.")
  @JsonIgnore

  public String getVehicleType() {
        return vehicleType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VEHICLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getVehicleType_JsonNullable() {
    return vehicleType;
  }
  
  @JsonProperty(JSON_PROPERTY_VEHICLE_TYPE)
  public void setVehicleType_JsonNullable(JsonNullable<String> vehicleType) {
    this.vehicleType = vehicleType;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = JsonNullable.<String>of(vehicleType);
  }


  public TransactionGigData merchantType(String merchantType) {
    this.merchantType = JsonNullable.<String>of(merchantType);
    
    return this;
  }

   /**
   * Merchant type for the delivery.
   * @return merchantType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Restaurant", value = "Merchant type for the delivery.")
  @JsonIgnore

  public String getMerchantType() {
        return merchantType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMerchantType_JsonNullable() {
    return merchantType;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_TYPE)
  public void setMerchantType_JsonNullable(JsonNullable<String> merchantType) {
    this.merchantType = merchantType;
  }

  public void setMerchantType(String merchantType) {
    this.merchantType = JsonNullable.<String>of(merchantType);
  }


  public TransactionGigData breakdown(List<TransactionBreakdown> breakdown) {
    this.breakdown = JsonNullable.<List<TransactionBreakdown>>of(breakdown);
    
    return this;
  }

  public TransactionGigData addBreakdownItem(TransactionBreakdown breakdownItem) {
    if (this.breakdown == null || !this.breakdown.isPresent()) {
      this.breakdown = JsonNullable.<List<TransactionBreakdown>>of(new ArrayList<>());
    }
    try {
      this.breakdown.get().add(breakdownItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get breakdown
   * @return breakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<TransactionBreakdown> getBreakdown() {
        return breakdown.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TransactionBreakdown>> getBreakdown_JsonNullable() {
    return breakdown;
  }
  
  @JsonProperty(JSON_PROPERTY_BREAKDOWN)
  public void setBreakdown_JsonNullable(JsonNullable<List<TransactionBreakdown>> breakdown) {
    this.breakdown = breakdown;
  }

  public void setBreakdown(List<TransactionBreakdown> breakdown) {
    this.breakdown = JsonNullable.<List<TransactionBreakdown>>of(breakdown);
  }


  public TransactionGigData collectedAt(OffsetDateTime collectedAt) {
    this.collectedAt = JsonNullable.<OffsetDateTime>of(collectedAt);
    
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-09-27T13:01:41.941Z", value = "The ISO-8601 timestamp when the data point was collected.")
  @JsonIgnore

  public OffsetDateTime getCollectedAt() {
        return collectedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COLLECTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCollectedAt_JsonNullable() {
    return collectedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_COLLECTED_AT)
  public void setCollectedAt_JsonNullable(JsonNullable<OffsetDateTime> collectedAt) {
    this.collectedAt = collectedAt;
  }

  public void setCollectedAt(OffsetDateTime collectedAt) {
    this.collectedAt = JsonNullable.<OffsetDateTime>of(collectedAt);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionGigData transactionGigData = (TransactionGigData) o;
    return equalsNullable(this.pickupAt, transactionGigData.pickupAt) &&
        equalsNullable(this.dropoffAt, transactionGigData.dropoffAt) &&
        equalsNullable(this.requestAt, transactionGigData.requestAt) &&
        equalsNullable(this.pickupAddress, transactionGigData.pickupAddress) &&
        equalsNullable(this.dropoffAddress, transactionGigData.dropoffAddress) &&
        equalsNullable(this.pickupLatitude, transactionGigData.pickupLatitude) &&
        equalsNullable(this.pickupLongitude, transactionGigData.pickupLongitude) &&
        equalsNullable(this.dropoffLatitude, transactionGigData.dropoffLatitude) &&
        equalsNullable(this.dropoffLongitude, transactionGigData.dropoffLongitude) &&
        equalsNullable(this.distance, transactionGigData.distance) &&
        equalsNullable(this.paymentMethod, transactionGigData.paymentMethod) &&
        equalsNullable(this.vehicleType, transactionGigData.vehicleType) &&
        equalsNullable(this.merchantType, transactionGigData.merchantType) &&
        equalsNullable(this.breakdown, transactionGigData.breakdown) &&
        equalsNullable(this.collectedAt, transactionGigData.collectedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(pickupAt), hashCodeNullable(dropoffAt), hashCodeNullable(requestAt), hashCodeNullable(pickupAddress), hashCodeNullable(dropoffAddress), hashCodeNullable(pickupLatitude), hashCodeNullable(pickupLongitude), hashCodeNullable(dropoffLatitude), hashCodeNullable(dropoffLongitude), hashCodeNullable(distance), hashCodeNullable(paymentMethod), hashCodeNullable(vehicleType), hashCodeNullable(merchantType), hashCodeNullable(breakdown), hashCodeNullable(collectedAt));
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
    sb.append("class TransactionGigData {\n");
    sb.append("    pickupAt: ").append(toIndentedString(pickupAt)).append("\n");
    sb.append("    dropoffAt: ").append(toIndentedString(dropoffAt)).append("\n");
    sb.append("    requestAt: ").append(toIndentedString(requestAt)).append("\n");
    sb.append("    pickupAddress: ").append(toIndentedString(pickupAddress)).append("\n");
    sb.append("    dropoffAddress: ").append(toIndentedString(dropoffAddress)).append("\n");
    sb.append("    pickupLatitude: ").append(toIndentedString(pickupLatitude)).append("\n");
    sb.append("    pickupLongitude: ").append(toIndentedString(pickupLongitude)).append("\n");
    sb.append("    dropoffLatitude: ").append(toIndentedString(dropoffLatitude)).append("\n");
    sb.append("    dropoffLongitude: ").append(toIndentedString(dropoffLongitude)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
    sb.append("    merchantType: ").append(toIndentedString(merchantType)).append("\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
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

