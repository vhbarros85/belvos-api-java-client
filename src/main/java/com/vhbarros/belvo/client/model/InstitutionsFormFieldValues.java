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
 * InstitutionsFormFieldValues
 */
@JsonPropertyOrder({
  InstitutionsFormFieldValues.JSON_PROPERTY_CODE,
  InstitutionsFormFieldValues.JSON_PROPERTY_LABEL,
  InstitutionsFormFieldValues.JSON_PROPERTY_VALIDATION,
  InstitutionsFormFieldValues.JSON_PROPERTY_VALIDATION_MESSAGE,
  InstitutionsFormFieldValues.JSON_PROPERTY_PLACEHOLDER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class InstitutionsFormFieldValues {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_VALIDATION = "validation";
  private String validation;

  public static final String JSON_PROPERTY_VALIDATION_MESSAGE = "validation_message";
  private String validationMessage;

  public static final String JSON_PROPERTY_PLACEHOLDER = "placeholder";
  private String placeholder;

  public InstitutionsFormFieldValues() {
  }

  public InstitutionsFormFieldValues code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code of the document.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "001", value = "The code of the document.")
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


  public InstitutionsFormFieldValues label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * The label for the field. For example: - Cédula de Ciudadanía - Cédula de Extranjería - Pasaporte 
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Cédula de Ciudadanía", value = "The label for the field. For example: - Cédula de Ciudadanía - Cédula de Extranjería - Pasaporte ")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public InstitutionsFormFieldValues validation(String validation) {
    
    this.validation = validation;
    return this;
  }

   /**
   * The type of input validation used for the field.
   * @return validation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "^.{1,}$", value = "The type of input validation used for the field.")
  @JsonProperty(JSON_PROPERTY_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidation() {
    return validation;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidation(String validation) {
    this.validation = validation;
  }


  public InstitutionsFormFieldValues validationMessage(String validationMessage) {
    
    this.validationMessage = validationMessage;
    return this;
  }

   /**
   * The message displayed when an invalid input is provided in the form field.
   * @return validationMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Invalid document number", value = "The message displayed when an invalid input is provided in the form field.")
  @JsonProperty(JSON_PROPERTY_VALIDATION_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidationMessage() {
    return validationMessage;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
  }


  public InstitutionsFormFieldValues placeholder(String placeholder) {
    
    this.placeholder = placeholder;
    return this;
  }

   /**
   * The placeholder text in the form field.
   * @return placeholder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEF4444908M22", value = "The placeholder text in the form field.")
  @JsonProperty(JSON_PROPERTY_PLACEHOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlaceholder() {
    return placeholder;
  }


  @JsonProperty(JSON_PROPERTY_PLACEHOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionsFormFieldValues institutionsFormFieldValues = (InstitutionsFormFieldValues) o;
    return Objects.equals(this.code, institutionsFormFieldValues.code) &&
        Objects.equals(this.label, institutionsFormFieldValues.label) &&
        Objects.equals(this.validation, institutionsFormFieldValues.validation) &&
        Objects.equals(this.validationMessage, institutionsFormFieldValues.validationMessage) &&
        Objects.equals(this.placeholder, institutionsFormFieldValues.placeholder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label, validation, validationMessage, placeholder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionsFormFieldValues {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
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

