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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Details on how to generate the token.
 */
@ApiModel(description = "Details on how to generate the token.")
@JsonPropertyOrder({
  TokenRequiredResponseTokenGenerationData.JSON_PROPERTY_INSTRUCTIONS,
  TokenRequiredResponseTokenGenerationData.JSON_PROPERTY_TYPE,
  TokenRequiredResponseTokenGenerationData.JSON_PROPERTY_VALUE,
  TokenRequiredResponseTokenGenerationData.JSON_PROPERTY_EXPECTS_USER_INPUT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class TokenRequiredResponseTokenGenerationData {
  public static final String JSON_PROPERTY_INSTRUCTIONS = "instructions";
  private String instructions;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_EXPECTS_USER_INPUT = "expects_user_input";
  private Boolean expectsUserInput = true;

  public TokenRequiredResponseTokenGenerationData() {
  }

  public TokenRequiredResponseTokenGenerationData instructions(String instructions) {
    
    this.instructions = instructions;
    return this;
  }

   /**
   * Instructions for token generation.
   * @return instructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Use this code to generate the token", value = "Instructions for token generation.")
  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstructions() {
    return instructions;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  public TokenRequiredResponseTokenGenerationData type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of the data to generate the token (QR code, numeric challenge).
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "numeric", value = "Type of the data to generate the token (QR code, numeric challenge).")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public TokenRequiredResponseTokenGenerationData value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value to use to generate the token.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "Value to use to generate the token.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public TokenRequiredResponseTokenGenerationData expectsUserInput(Boolean expectsUserInput) {
    
    this.expectsUserInput = expectsUserInput;
    return this;
  }

   /**
   * Indicates whether the user needs to provide input in order to complete the authentication. When set to &#x60;false&#x60;, your user may need to: - confirm the login on another device - scan a QR code You will still need to make a PATCH call to complete the request.
   * @return expectsUserInput
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether the user needs to provide input in order to complete the authentication. When set to `false`, your user may need to: - confirm the login on another device - scan a QR code You will still need to make a PATCH call to complete the request.")
  @JsonProperty(JSON_PROPERTY_EXPECTS_USER_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExpectsUserInput() {
    return expectsUserInput;
  }


  @JsonProperty(JSON_PROPERTY_EXPECTS_USER_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpectsUserInput(Boolean expectsUserInput) {
    this.expectsUserInput = expectsUserInput;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenRequiredResponseTokenGenerationData tokenRequiredResponseTokenGenerationData = (TokenRequiredResponseTokenGenerationData) o;
    return Objects.equals(this.instructions, tokenRequiredResponseTokenGenerationData.instructions) &&
        Objects.equals(this.type, tokenRequiredResponseTokenGenerationData.type) &&
        Objects.equals(this.value, tokenRequiredResponseTokenGenerationData.value) &&
        Objects.equals(this.expectsUserInput, tokenRequiredResponseTokenGenerationData.expectsUserInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructions, type, value, expectsUserInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenRequiredResponseTokenGenerationData {\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    expectsUserInput: ").append(toIndentedString(expectsUserInput)).append("\n");
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

