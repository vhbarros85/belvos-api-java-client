

# Link


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID used to reference the current Link. |  [optional] |
|**institution** | **String** | Belvo&#39;s name for the institution.  |  [optional] |
|**accessMode** | [**AccessModeEnum**](#AccessModeEnum) | The link type. For more information, see our [Links](https://developers.belvo.com/docs/links-and-institutions#links) article. We return one of the following enum values:   - &#x60;single&#x60;   - &#x60;recurrent&#x60;  |  [optional] |
|**lastAccessedAt** | **OffsetDateTime** | The ISO-8601 timestamp of Belvo&#39;s most recent successful access to the institution for the given link. |  [optional] |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  [optional] |
|**externalId** | **String** | The &#x60;external_id&#x60; you provided as an additional identifier for the link. For more information, see our [Link creation article](https://developers.belvo.com/docs/link-creation-best-practices#adding-your-own-identifier). |  [optional] |
|**institutionUserId** | **String** | &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Info:&lt;/strong&gt; Only applicable for links created &lt;b&gt;after 08-02-2022&lt;/b&gt;. &lt;/div&gt;  A unique 44-character string that can be used to identify a user at a given institution.  📚 Check out our [Avoiding duplicated links](https://developers.belvo.com/docs/link-creation-best-practices#avoiding-duplicated-links) DevPortal article for more information and tips on how to use it. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the link. For more information, see our [Link](https://developers.belvo.com/docs/links-and-institutions#links) article in the devportal. We return one of the following enum values:   - &#x60;valid&#x60;   - &#x60;invalid&#x60;   - &#x60;unconfirmed&#x60;   - &#x60;token_required&#x60;  |  [optional] |
|**createdBy** | **UUID** | The unique ID for the user that created this link. |  [optional] |
|**refreshRate** | [**RefreshRateEnum**](#RefreshRateEnum) | The update refresh rate for the recurrent link. For more information, check out our [recurrent link documentation](https://developers.belvo.com/docs/links-and-institutions#recurrent-links) in our DevPortal. We return one of the following enum values:   - &#x60;6h&#x60;   - &#x60;12h&#x60;   - &#x60;24h&#x60;   - &#x60;7d&#x60; (default)   - &#x60;30d&#x60; (once a month)  |  [optional] |



## Enum: AccessModeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| RECURRENT | &quot;recurrent&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VALID | &quot;valid&quot; |
| INVALID | &quot;invalid&quot; |
| UNCONFIRMED | &quot;unconfirmed&quot; |
| TOKEN_REQUIRED | &quot;token_required&quot; |



## Enum: RefreshRateEnum

| Name | Value |
|---- | -----|
| _6H | &quot;6h&quot; |
| _12H | &quot;12h&quot; |
| _24H | &quot;24h&quot; |
| _7D | &quot;7d&quot; |
| _30D | &quot;30d&quot; |



