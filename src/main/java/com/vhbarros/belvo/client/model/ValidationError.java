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
 * This error occurs when you try to resume a request session that has already expired. This is usually because the user took too long to provide their authentication token.
 */
@ApiModel(description = "This error occurs when you try to resume a request session that has already expired. This is usually because the user took too long to provide their authentication token.")
@JsonPropertyOrder({
  ValidationError.JSON_PROPERTY_CODE,
  ValidationError.JSON_PROPERTY_MESSAGE,
  ValidationError.JSON_PROPERTY_REQUEST_ID,
  ValidationError.JSON_PROPERTY_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class ValidationError {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_FIELD = "field";
  private JsonNullable<String> field = JsonNullable.<String>undefined();

  public ValidationError() {
  }

  public ValidationError code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * A unique error code (&#x60;null&#x60;, &#x60;does_not_exist&#x60;, &#x60;required&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle:   - &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-blank\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 blank errors&lt;/a&gt;   - &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-null\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 null errors&lt;/a&gt;   - &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-does_not_exist\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 does_not_exist errors&lt;/a&gt;   - &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-required\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 required errors&lt;/a&gt;
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "required", value = "A unique error code (`null`, `does_not_exist`, `required`) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle:   - <a href=\"https://developers.belvo.com/docs/belvo-api-errors#400-blank\" target=\"_blank\">400 blank errors</a>   - <a href=\"https://developers.belvo.com/docs/belvo-api-errors#400-null\" target=\"_blank\">400 null errors</a>   - <a href=\"https://developers.belvo.com/docs/belvo-api-errors#400-does_not_exist\" target=\"_blank\">400 does_not_exist errors</a>   - <a href=\"https://developers.belvo.com/docs/belvo-api-errors#400-required\" target=\"_blank\">400 required errors</a>")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public ValidationError message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A short description of the error.   For &#x60;session_expired&#x60; errors, the description can be (among others):      - &#x60;This field is required.&#x60;   - &#x60;Object with name&#x3D;narnia does not exist.&#x60;   - &#x60;This field may not be null.&#x60;   - &#x60;This field may not be blank.&#x60;
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This field is required.", value = "A short description of the error.   For `session_expired` errors, the description can be (among others):      - `This field is required.`   - `Object with name=narnia does not exist.`   - `This field may not be null.`   - `This field may not be blank.`")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public ValidationError requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9e7b283c6efa449c9c028a16b5c249fb", value = "A 32-character unique ID of the request (matching a regex pattern of: `[a-f0-9]{32}`). Provide this ID when contacting the Belvo support team to accelerate investigations.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public ValidationError field(String field) {
    this.field = JsonNullable.<String>of(field);
    
    return this;
  }

   /**
   * Name of the field where the error was encountered.
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "link", value = "Name of the field where the error was encountered.")
  @JsonIgnore

  public String getField() {
        return field.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getField_JsonNullable() {
    return field;
  }
  
  @JsonProperty(JSON_PROPERTY_FIELD)
  public void setField_JsonNullable(JsonNullable<String> field) {
    this.field = field;
  }

  public void setField(String field) {
    this.field = JsonNullable.<String>of(field);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationError validationError = (ValidationError) o;
    return Objects.equals(this.code, validationError.code) &&
        Objects.equals(this.message, validationError.message) &&
        Objects.equals(this.requestId, validationError.requestId) &&
        equalsNullable(this.field, validationError.field);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, requestId, hashCodeNullable(field));
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
    sb.append("class ValidationError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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

