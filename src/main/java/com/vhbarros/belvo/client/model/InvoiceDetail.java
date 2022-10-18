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
import com.vhbarros.belvo.client.model.InvoiceDetailRetainedTax;
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
 * InvoiceDetail
 */
@JsonPropertyOrder({
  InvoiceDetail.JSON_PROPERTY_DESCRIPTION,
  InvoiceDetail.JSON_PROPERTY_PRODUCT_IDENTIFICATION,
  InvoiceDetail.JSON_PROPERTY_QUANTITY,
  InvoiceDetail.JSON_PROPERTY_UNIT_CODE,
  InvoiceDetail.JSON_PROPERTY_UNIT_DESCRIPTION,
  InvoiceDetail.JSON_PROPERTY_UNIT_AMOUNT,
  InvoiceDetail.JSON_PROPERTY_PRE_TAX_AMOUNT,
  InvoiceDetail.JSON_PROPERTY_TAX_PERCENTAGE,
  InvoiceDetail.JSON_PROPERTY_TAX_AMOUNT,
  InvoiceDetail.JSON_PROPERTY_TOTAL_AMOUNT,
  InvoiceDetail.JSON_PROPERTY_RETAINED_TAXES,
  InvoiceDetail.JSON_PROPERTY_COLLECTED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class InvoiceDetail {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PRODUCT_IDENTIFICATION = "product_identification";
  private String productIdentification;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Integer quantity;

  public static final String JSON_PROPERTY_UNIT_CODE = "unit_code";
  private String unitCode;

  public static final String JSON_PROPERTY_UNIT_DESCRIPTION = "unit_description";
  private String unitDescription;

  public static final String JSON_PROPERTY_UNIT_AMOUNT = "unit_amount";
  private Float unitAmount;

  public static final String JSON_PROPERTY_PRE_TAX_AMOUNT = "pre_tax_amount";
  private Float preTaxAmount;

  public static final String JSON_PROPERTY_TAX_PERCENTAGE = "tax_percentage";
  private Float taxPercentage;

  public static final String JSON_PROPERTY_TAX_AMOUNT = "tax_amount";
  private Float taxAmount;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT = "total_amount";
  private Float totalAmount;

  public static final String JSON_PROPERTY_RETAINED_TAXES = "retained_taxes";
  private List<InvoiceDetailRetainedTax> retainedTaxes = null;

  public static final String JSON_PROPERTY_COLLECTED_AT = "collected_at";
  private JsonNullable<OffsetDateTime> collectedAt = JsonNullable.<OffsetDateTime>undefined();

  public InvoiceDetail() {
  }

  public InvoiceDetail description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the invoice item (an invoice can have one or more items).
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "December 2019 accounting fees", required = true, value = "The description of the invoice item (an invoice can have one or more items).")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public InvoiceDetail productIdentification(String productIdentification) {
    
    this.productIdentification = productIdentification;
    return this;
  }

   /**
   * The identification code of the product or the service, as defined by the legal entity in the country. - 🇲🇽 [Mexico](http://200.57.3.89/Pys/catPyS.aspx) 
   * @return productIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "84101600", required = true, value = "The identification code of the product or the service, as defined by the legal entity in the country. - 🇲🇽 [Mexico](http://200.57.3.89/Pys/catPyS.aspx) ")
  @JsonProperty(JSON_PROPERTY_PRODUCT_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProductIdentification() {
    return productIdentification;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductIdentification(String productIdentification) {
    this.productIdentification = productIdentification;
  }


  public InvoiceDetail quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of this invoice item.
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", required = true, value = "The quantity of this invoice item.")
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public InvoiceDetail unitCode(String unitCode) {
    
    this.unitCode = unitCode;
    return this;
  }

   /**
   * The unit of measure, as defined by the legal entity in the country.  - 🇲🇽 Mexico [SAT catalog reference](https://developers.belvo.com/docs/sat-catalogs#unit-code) 
   * @return unitCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "E48", required = true, value = "The unit of measure, as defined by the legal entity in the country.  - 🇲🇽 Mexico [SAT catalog reference](https://developers.belvo.com/docs/sat-catalogs#unit-code) ")
  @JsonProperty(JSON_PROPERTY_UNIT_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUnitCode() {
    return unitCode;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnitCode(String unitCode) {
    this.unitCode = unitCode;
  }


  public InvoiceDetail unitDescription(String unitDescription) {
    
    this.unitDescription = unitDescription;
    return this;
  }

   /**
   * The description of the item, as defined by the legal entity in the country. - 🇲🇽 Mexico [SAT catalog reference](https://developers.belvo.com/docs/sat-catalogs#unit-code) 
   * @return unitDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Unidad de servicio", required = true, value = "The description of the item, as defined by the legal entity in the country. - 🇲🇽 Mexico [SAT catalog reference](https://developers.belvo.com/docs/sat-catalogs#unit-code) ")
  @JsonProperty(JSON_PROPERTY_UNIT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUnitDescription() {
    return unitDescription;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnitDescription(String unitDescription) {
    this.unitDescription = unitDescription;
  }


  public InvoiceDetail unitAmount(Float unitAmount) {
    
    this.unitAmount = unitAmount;
    return this;
  }

   /**
   * The price of one a singular item.
   * @return unitAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", required = true, value = "The price of one a singular item.")
  @JsonProperty(JSON_PROPERTY_UNIT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getUnitAmount() {
    return unitAmount;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnitAmount(Float unitAmount) {
    this.unitAmount = unitAmount;
  }


  public InvoiceDetail preTaxAmount(Float preTaxAmount) {
    
    this.preTaxAmount = preTaxAmount;
    return this;
  }

   /**
   * The total price for this item before tax is applied (&#x60;quantity&#x60; x &#x60;unit_amount&#x60;).
   * @return preTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "400", required = true, value = "The total price for this item before tax is applied (`quantity` x `unit_amount`).")
  @JsonProperty(JSON_PROPERTY_PRE_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getPreTaxAmount() {
    return preTaxAmount;
  }


  @JsonProperty(JSON_PROPERTY_PRE_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreTaxAmount(Float preTaxAmount) {
    this.preTaxAmount = preTaxAmount;
  }


  public InvoiceDetail taxPercentage(Float taxPercentage) {
    
    this.taxPercentage = taxPercentage;
    return this;
  }

   /**
   * The tax percentage to apply.
   * @return taxPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "16", required = true, value = "The tax percentage to apply.")
  @JsonProperty(JSON_PROPERTY_TAX_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getTaxPercentage() {
    return taxPercentage;
  }


  @JsonProperty(JSON_PROPERTY_TAX_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaxPercentage(Float taxPercentage) {
    this.taxPercentage = taxPercentage;
  }


  public InvoiceDetail taxAmount(Float taxAmount) {
    
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * The amount of tax for this invoice item (&#x60;pre_tax_amount&#x60; x &#x60;tax_percentage&#x60;).
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "64", required = true, value = "The amount of tax for this invoice item (`pre_tax_amount` x `tax_percentage`).")
  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getTaxAmount() {
    return taxAmount;
  }


  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaxAmount(Float taxAmount) {
    this.taxAmount = taxAmount;
  }


  public InvoiceDetail totalAmount(Float totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * The total price for this invoice item (&#x60;pre_tax_amount&#x60; + &#x60;tax_amount&#x60;).
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "464", required = true, value = "The total price for this invoice item (`pre_tax_amount` + `tax_amount`).")
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getTotalAmount() {
    return totalAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalAmount(Float totalAmount) {
    this.totalAmount = totalAmount;
  }


  public InvoiceDetail retainedTaxes(List<InvoiceDetailRetainedTax> retainedTaxes) {
    
    this.retainedTaxes = retainedTaxes;
    return this;
  }

  public InvoiceDetail addRetainedTaxesItem(InvoiceDetailRetainedTax retainedTaxesItem) {
    if (this.retainedTaxes == null) {
      this.retainedTaxes = new ArrayList<>();
    }
    this.retainedTaxes.add(retainedTaxesItem);
    return this;
  }

   /**
   * The retained tax on the invoice item.
   * @return retainedTaxes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The retained tax on the invoice item.")
  @JsonProperty(JSON_PROPERTY_RETAINED_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InvoiceDetailRetainedTax> getRetainedTaxes() {
    return retainedTaxes;
  }


  @JsonProperty(JSON_PROPERTY_RETAINED_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetainedTaxes(List<InvoiceDetailRetainedTax> retainedTaxes) {
    this.retainedTaxes = retainedTaxes;
  }


  public InvoiceDetail collectedAt(OffsetDateTime collectedAt) {
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
    InvoiceDetail invoiceDetail = (InvoiceDetail) o;
    return Objects.equals(this.description, invoiceDetail.description) &&
        Objects.equals(this.productIdentification, invoiceDetail.productIdentification) &&
        Objects.equals(this.quantity, invoiceDetail.quantity) &&
        Objects.equals(this.unitCode, invoiceDetail.unitCode) &&
        Objects.equals(this.unitDescription, invoiceDetail.unitDescription) &&
        Objects.equals(this.unitAmount, invoiceDetail.unitAmount) &&
        Objects.equals(this.preTaxAmount, invoiceDetail.preTaxAmount) &&
        Objects.equals(this.taxPercentage, invoiceDetail.taxPercentage) &&
        Objects.equals(this.taxAmount, invoiceDetail.taxAmount) &&
        Objects.equals(this.totalAmount, invoiceDetail.totalAmount) &&
        Objects.equals(this.retainedTaxes, invoiceDetail.retainedTaxes) &&
        equalsNullable(this.collectedAt, invoiceDetail.collectedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, productIdentification, quantity, unitCode, unitDescription, unitAmount, preTaxAmount, taxPercentage, taxAmount, totalAmount, retainedTaxes, hashCodeNullable(collectedAt));
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
    sb.append("class InvoiceDetail {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    productIdentification: ").append(toIndentedString(productIdentification)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitCode: ").append(toIndentedString(unitCode)).append("\n");
    sb.append("    unitDescription: ").append(toIndentedString(unitDescription)).append("\n");
    sb.append("    unitAmount: ").append(toIndentedString(unitAmount)).append("\n");
    sb.append("    preTaxAmount: ").append(toIndentedString(preTaxAmount)).append("\n");
    sb.append("    taxPercentage: ").append(toIndentedString(taxPercentage)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    retainedTaxes: ").append(toIndentedString(retainedTaxes)).append("\n");
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

