

# TransactionGigData

Additional data provided by the institution on the transaction. This data is provided only by gig economy institutions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pickupAt** | **OffsetDateTime** | Pickup ISO-8601 timestamp for one trip transaction or delivery. |  [optional] |
|**dropoffAt** | **OffsetDateTime** | Dropoff ISO-8601 timestamp for one trip transaction or delivery. |  [optional] |
|**requestAt** | **OffsetDateTime** | ISO-8601 timestamp when one trip transaction or delivery was requested. |  [optional] |
|**pickupAddress** | **String** | Pickup address for the trip or delivery. |  [optional] |
|**dropoffAddress** | **String** | Dropoff address for the trip or delivery. |  [optional] |
|**pickupLatitude** | **String** | *This field has been deprecated.*  *Latitude of the &#x60;pickup_address&#x60;.*  |  [optional] |
|**pickupLongitude** | **String** | *This field has been deprecated.*  *Longitude of the &#x60;pickup_address&#x60;.*  |  [optional] |
|**dropoffLatitude** | **String** | *This field has been deprecated.*  *Latitude of the &#x60;dropoff_address&#x60;.*  |  [optional] |
|**dropoffLongitude** | **String** | *This field has been deprecated.*  *Longitude of the &#x60;dropoff_address&#x60;.*  |  [optional] |
|**distance** | **Float** | Distance in kilometers for the trip or delivery. |  [optional] |
|**paymentMethod** | **String** | Payment method for the transaction. For example, &#x60;CASH&#x60; or &#x60;IN_APP&#x60;. |  [optional] |
|**vehicleType** | **String** | Vehicle type used. |  [optional] |
|**merchantType** | **String** | Merchant type for the delivery. |  [optional] |
|**breakdown** | [**List&lt;TransactionBreakdown&gt;**](TransactionBreakdown.md) |  |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  [optional] |



