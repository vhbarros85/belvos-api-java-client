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
import com.vhbarros.belvo.client.model.InstitutionsFormField;
import com.vhbarros.belvo.client.model.InstitutionsFormFieldValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The form fields on the institution&#39;s website that require user credentials.
 */
@ApiModel(description = "The form fields on the institution's website that require user credentials.")
@JsonPropertyOrder({
  InstitutionFormFields.JSON_PROPERTY_NAME,
  InstitutionFormFields.JSON_PROPERTY_TYPE,
  InstitutionFormFields.JSON_PROPERTY_LABEL,
  InstitutionFormFields.JSON_PROPERTY_VALIDATION,
  InstitutionFormFields.JSON_PROPERTY_PLACEHOLDER,
  InstitutionFormFields.JSON_PROPERTY_VALIDATION_MESSAGE,
  InstitutionFormFields.JSON_PROPERTY_VALUES
})
@JsonTypeName("Institution_form_fields")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class InstitutionFormFields {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_VALIDATION = "validation";
  private String validation;

  public static final String JSON_PROPERTY_PLACEHOLDER = "placeholder";
  private String placeholder;

  public static final String JSON_PROPERTY_VALIDATION_MESSAGE = "validation_message";
  private String validationMessage;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<InstitutionsFormFieldValues> values = null;

  public InstitutionFormFields() {
  }

  public InstitutionFormFields name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The username, password, or username type field.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "username", value = "The username, password, or username type field.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public InstitutionFormFields type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The input type for the form field. For example, string.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "text", value = "The input type for the form field. For example, string.")
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


  public InstitutionFormFields label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * The label of the form field. For example: - Client number - Key Bancanet - Document 
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Client number", value = "The label of the form field. For example: - Client number - Key Bancanet - Document ")
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


  public InstitutionFormFields validation(String validation) {
    
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


  public InstitutionFormFields placeholder(String placeholder) {
    
    this.placeholder = placeholder;
    return this;
  }

   /**
   * The placeholder text in the form field.
   * @return placeholder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ABC333333A33", value = "The placeholder text in the form field.")
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


  public InstitutionFormFields validationMessage(String validationMessage) {
    
    this.validationMessage = validationMessage;
    return this;
  }

   /**
   * The message displayed when an invalid input is provided in the form field.
   * @return validationMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Invalid client number", value = "The message displayed when an invalid input is provided in the form field.")
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


  public InstitutionFormFields values(List<InstitutionsFormFieldValues> values) {
    
    this.values = values;
    return this;
  }

  public InstitutionFormFields addValuesItem(InstitutionsFormFieldValues valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * If the form field is for documents, the institution may require additional input regarding the document type.
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the form field is for documents, the institution may require additional input regarding the document type.")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InstitutionsFormFieldValues> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(List<InstitutionsFormFieldValues> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionFormFields institutionFormFields = (InstitutionFormFields) o;
    return Objects.equals(this.name, institutionFormFields.name) &&
        Objects.equals(this.type, institutionFormFields.type) &&
        Objects.equals(this.label, institutionFormFields.label) &&
        Objects.equals(this.validation, institutionFormFields.validation) &&
        Objects.equals(this.placeholder, institutionFormFields.placeholder) &&
        Objects.equals(this.validationMessage, institutionFormFields.validationMessage) &&
        Objects.equals(this.values, institutionFormFields.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, label, validation, placeholder, validationMessage, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionFormFields {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

