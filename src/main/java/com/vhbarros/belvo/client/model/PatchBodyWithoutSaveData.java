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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A JSON object containing a session UUID and a MFA token
 */
@ApiModel(description = "A JSON object containing a session UUID and a MFA token")
@JsonPropertyOrder({
  PatchBodyWithoutSaveData.JSON_PROPERTY_SESSION,
  PatchBodyWithoutSaveData.JSON_PROPERTY_TOKEN,
  PatchBodyWithoutSaveData.JSON_PROPERTY_LINK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class PatchBodyWithoutSaveData {
  public static final String JSON_PROPERTY_SESSION = "session";
  private String session;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_LINK = "link";
  private UUID link;

  public PatchBodyWithoutSaveData() {
  }

  public PatchBodyWithoutSaveData session(String session) {
    
    this.session = session;
    return this;
  }

   /**
   * The session you want to resume. You need to use the &#x60;session&#x60; value that is provided in the 428 Token Required response that you receive after you make your POST request.
   * @return session
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6e7b283c6efa449c9c028a16b5c249fa", required = true, value = "The session you want to resume. You need to use the `session` value that is provided in the 428 Token Required response that you receive after you make your POST request.")
  @JsonProperty(JSON_PROPERTY_SESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSession() {
    return session;
  }


  @JsonProperty(JSON_PROPERTY_SESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSession(String session) {
    this.session = session;
  }


  public PatchBodyWithoutSaveData token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * The MFA token generated by the institution and required to continue a session.
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234ab", value = "The MFA token generated by the institution and required to continue a session.")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(String token) {
    this.token = token;
  }


  public PatchBodyWithoutSaveData link(UUID link) {
    
    this.link = link;
    return this;
  }

   /**
   * The &#x60;link.id&#x60; you want to resume. Must be the same &#x60;link.id&#x60; as the one you receive in the 428 Token Required response that contains the &#x60;session&#x60; ID.
   * @return link
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "683005d6-f45c-4adb-b289-f1a12f50f80c", required = true, value = "The `link.id` you want to resume. Must be the same `link.id` as the one you receive in the 428 Token Required response that contains the `session` ID.")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLink(UUID link) {
    this.link = link;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchBodyWithoutSaveData patchBodyWithoutSaveData = (PatchBodyWithoutSaveData) o;
    return Objects.equals(this.session, patchBodyWithoutSaveData.session) &&
        Objects.equals(this.token, patchBodyWithoutSaveData.token) &&
        Objects.equals(this.link, patchBodyWithoutSaveData.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(session, token, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchBodyWithoutSaveData {\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

