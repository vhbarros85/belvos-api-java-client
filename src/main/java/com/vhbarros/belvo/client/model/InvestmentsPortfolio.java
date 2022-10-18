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
import com.vhbarros.belvo.client.model.InvestmentsPortfolioInstrument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InvestmentsPortfolio
 */
@JsonPropertyOrder({
  InvestmentsPortfolio.JSON_PROPERTY_ID,
  InvestmentsPortfolio.JSON_PROPERTY_NAME,
  InvestmentsPortfolio.JSON_PROPERTY_TYPE,
  InvestmentsPortfolio.JSON_PROPERTY_BALANCE_TYPE,
  InvestmentsPortfolio.JSON_PROPERTY_BALANCE_GROSS,
  InvestmentsPortfolio.JSON_PROPERTY_BALANCE_NET,
  InvestmentsPortfolio.JSON_PROPERTY_CURRENCY,
  InvestmentsPortfolio.JSON_PROPERTY_INSTRUMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-16T15:47:17.569Z[Etc/UTC]")
public class InvestmentsPortfolio {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * The portfolio type.  We return one of the following enum values:    - &#x60;FIXED_INCOME&#x60;   - &#x60;OTHER&#x60;   - &#x60;PENSION&#x60;   - &#x60;VARIABLE_INCOME&#x60; 
   */
  public enum TypeEnum {
    FIXED_INCOME("FIXED_INCOME"),
    
    OTHER("OTHER"),
    
    PENSION("PENSION"),
    
    VARIABLE_INCOME("VARIABLE_INCOME");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_BALANCE_TYPE = "balance_type";
  private JsonNullable<String> balanceType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BALANCE_GROSS = "balance_gross";
  private Float balanceGross;

  public static final String JSON_PROPERTY_BALANCE_NET = "balance_net";
  private Float balanceNet;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_INSTRUMENTS = "instruments";
  private JsonNullable<List<InvestmentsPortfolioInstrument>> instruments = JsonNullable.<List<InvestmentsPortfolioInstrument>>undefined();

  public InvestmentsPortfolio() {
  }

  public InvestmentsPortfolio id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique ID used to reference the current portfolio.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", value = "Belvo's unique ID used to reference the current portfolio.")
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


  public InvestmentsPortfolio name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the portfolio, as given in the institution. 
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Investimento", required = true, value = "The name of the portfolio, as given in the institution. ")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public InvestmentsPortfolio type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The portfolio type.  We return one of the following enum values:    - &#x60;FIXED_INCOME&#x60;   - &#x60;OTHER&#x60;   - &#x60;PENSION&#x60;   - &#x60;VARIABLE_INCOME&#x60; 
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "FIXED_INCOME", required = true, value = "The portfolio type.  We return one of the following enum values:    - `FIXED_INCOME`   - `OTHER`   - `PENSION`   - `VARIABLE_INCOME` ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public InvestmentsPortfolio balanceType(String balanceType) {
    this.balanceType = JsonNullable.<String>of(balanceType);
    
    return this;
  }

   /**
   * Indicates whether this account is either an &#x60;ASSET&#x60; or a &#x60;LIABILITY&#x60;. You can consider the balance of an &#x60;ASSET&#x60; as being positive, while the balance of a &#x60;LIABILITY&#x60; as negative. 
   * @return balanceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ASSET", value = "Indicates whether this account is either an `ASSET` or a `LIABILITY`. You can consider the balance of an `ASSET` as being positive, while the balance of a `LIABILITY` as negative. ")
  @JsonIgnore

  public String getBalanceType() {
        return balanceType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BALANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBalanceType_JsonNullable() {
    return balanceType;
  }
  
  @JsonProperty(JSON_PROPERTY_BALANCE_TYPE)
  public void setBalanceType_JsonNullable(JsonNullable<String> balanceType) {
    this.balanceType = balanceType;
  }

  public void setBalanceType(String balanceType) {
    this.balanceType = JsonNullable.<String>of(balanceType);
  }


  public InvestmentsPortfolio balanceGross(Float balanceGross) {
    
    this.balanceGross = balanceGross;
    return this;
  }

   /**
   * The current gross total value of the entire portfolio and all its underlying instruments, as given by the institution. 
   * @return balanceGross
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "76000", required = true, value = "The current gross total value of the entire portfolio and all its underlying instruments, as given by the institution. ")
  @JsonProperty(JSON_PROPERTY_BALANCE_GROSS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getBalanceGross() {
    return balanceGross;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_GROSS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalanceGross(Float balanceGross) {
    this.balanceGross = balanceGross;
  }


  public InvestmentsPortfolio balanceNet(Float balanceNet) {
    
    this.balanceNet = balanceNet;
    return this;
  }

   /**
   * The total current value of the entire portfolio and all its underlying instruments, as given by the institution.  ℹ️ **Note:** In Brazil, this is usually calculated based on the net value (that is, not including tax). 
   * @return balanceNet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "77370.69", required = true, value = "The total current value of the entire portfolio and all its underlying instruments, as given by the institution.  ℹ️ **Note:** In Brazil, this is usually calculated based on the net value (that is, not including tax). ")
  @JsonProperty(JSON_PROPERTY_BALANCE_NET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getBalanceNet() {
    return balanceNet;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_NET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalanceNet(Float balanceNet) {
    this.balanceNet = balanceNet;
  }


  public InvestmentsPortfolio currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the portfolio. For example:   - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned. 
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BRL", required = true, value = "The currency of the portfolio. For example:   - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned. ")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public InvestmentsPortfolio instruments(List<InvestmentsPortfolioInstrument> instruments) {
    this.instruments = JsonNullable.<List<InvestmentsPortfolioInstrument>>of(instruments);
    
    return this;
  }

  public InvestmentsPortfolio addInstrumentsItem(InvestmentsPortfolioInstrument instrumentsItem) {
    if (this.instruments == null || !this.instruments.isPresent()) {
      this.instruments = JsonNullable.<List<InvestmentsPortfolioInstrument>>of(new ArrayList<>());
    }
    try {
      this.instruments.get().add(instrumentsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * An array of instruments that fall into the investment portfolio.
   * @return instruments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of instruments that fall into the investment portfolio.")
  @JsonIgnore

  public List<InvestmentsPortfolioInstrument> getInstruments() {
        return instruments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<InvestmentsPortfolioInstrument>> getInstruments_JsonNullable() {
    return instruments;
  }
  
  @JsonProperty(JSON_PROPERTY_INSTRUMENTS)
  public void setInstruments_JsonNullable(JsonNullable<List<InvestmentsPortfolioInstrument>> instruments) {
    this.instruments = instruments;
  }

  public void setInstruments(List<InvestmentsPortfolioInstrument> instruments) {
    this.instruments = JsonNullable.<List<InvestmentsPortfolioInstrument>>of(instruments);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentsPortfolio investmentsPortfolio = (InvestmentsPortfolio) o;
    return Objects.equals(this.id, investmentsPortfolio.id) &&
        Objects.equals(this.name, investmentsPortfolio.name) &&
        Objects.equals(this.type, investmentsPortfolio.type) &&
        equalsNullable(this.balanceType, investmentsPortfolio.balanceType) &&
        Objects.equals(this.balanceGross, investmentsPortfolio.balanceGross) &&
        Objects.equals(this.balanceNet, investmentsPortfolio.balanceNet) &&
        Objects.equals(this.currency, investmentsPortfolio.currency) &&
        equalsNullable(this.instruments, investmentsPortfolio.instruments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, hashCodeNullable(balanceType), balanceGross, balanceNet, currency, hashCodeNullable(instruments));
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
    sb.append("class InvestmentsPortfolio {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
    sb.append("    balanceGross: ").append(toIndentedString(balanceGross)).append("\n");
    sb.append("    balanceNet: ").append(toIndentedString(balanceNet)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    instruments: ").append(toIndentedString(instruments)).append("\n");
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

