# belvo-openapi-api-client

Belvo API Docs

- API version: 1.20.1

- Build date: 2022-10-16T15:47:17.569Z[Etc/UTC]

# Introduction

Belvo is an open banking API for Latin America that allows companies to access banking and fiscal information in a secure as well as agile way.

Through our API, you can access:


- **Bank and Gig information** such as account information, real-time
balance, historical transactions, and account owner identification.

- **Fiscal information** such as received and sent invoices and tax returns.


<img src=\"https://files.readme.io/acf27d3-belvo_pipes.png\"
alt=\"fiscal-endpoints\">


In this API reference you'll find all the information you need about each

endpoint and resource.


<div style=\"background-color:#f4f6f8; border-left: 6px solid
#4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right:
25px\">

<strong>Tip: </strong> Make sure that you also check out our Developer
Portal for guides on <a
href=\"https://developers.belvo.com/docs/get-started-in-5-minutes\"
target=\"_blank\">how to get started</a>, using our <a
href=\"https://developers.belvo.com/docs/test-in-sandbox\"
target=\"_blank\">Sandbox environment</a>, as well as how to <a
href=\"https://developers.belvo.com/docs/connect-widget\"
target=\"_blank\">integrate the widget</a> or use our <a
href=\"https://developers.belvo.com/docs/quickstart-application\"
target=\"_blank\">quickstart application</a>.

</div>


## Environment

We currently offer three environments: sandbox, development, and
production.


When using our SDKs, make sure to use the **Alias** (and not the Base URL).


| Environment | Purpose | Access |
|-----------|-------|-------|
| **Sandbox** | The [Sandbox environment](https://developers.belvo.com/docs/test-in-sandbox) is dedicated for your testing and development phases. In this environment, you can create links without real credentials and you can pull test data from all endpoints. **⚠️The sandbox environment is refreshed frequently and your test data can be updated or deleted.** | Base URL (cURL): https://sandbox.belvo.com/ <br><br>Alias (SDKs): sandbox|
|**Development**|The Development environment is dedicated for testing with real credentials and institutions with real-world institutions. You can create up to 25 links for free in this environment.| Base URL (cURL): https://development.belvo.com/ <br><br>Alias (SDKs): development |
| **Production** | The Production environment is dedicated for live applications with real connections to institutions. In this environment, you
will need real credentials to create links and you will pull real data from the institutions.| Base URL (cURL): https://api.belvo.com/ <br><br>Alias
(SDKs): production|


For each environment, you'll need to [generate separate API
keys](https://developers.belvo.com/docs/get-your-belvo-api-keys).


## Response codes


We use the following HTTP status code in the response depending on the
success or failure:


| Status Code | Description |
|-----------|-------|
| `200` | ✅ **Success** - The content is available in the response body. |
| `201` | ✅ **Success** - The content was created successfully on Belvo. |
| `204` | ✅ **Success** - No content to return. |
| `400` | ❌ **Bad Request Error** - Request returned an error, detail in content.|
| `401` | ❌ **Unauthorized** - The Belvo credentials provided are not valid.|
| `404` | ❌ **Not Found** - The resource you try to access cannot be found.|
| `405` | ❌ **Method Not Allowed** - The HTTP method you are using is not accepted for this resource.|
| `408` | ❌ **Request Timeout** - The request timed out and was terminated by the server.|
| `428` | ❌ **MFA Token Required** - MFA token was required by the institution to connect. |
| `500` | ❌ **Internal Server Error** - The detail of the error is available in the response body.|


## Error handling


### Error messages


Belvo API errors are returned in JSON format. For example, an error might
look like this:


```json

[
    {
      \"request_id\": \"a6e1c493d7a29d91aed4338e6fcf077d\",
      \"message\": \"This field is required.\",
      \"code\": \"required\",
      \"field\": \"link\"
    }
]

```


Typically, an error response will have the following parameters:

- `request_id`: a unique ID for the request, you should share it with the
Belvo support team for investigations.

- `message`: human-readable description of the error.

- `code`: a unique code for the error. Check the table below to see how to
handle each error code.

- `field` *(optional)*: The specific field in the request body that has an
issue.



### Request identifier

When you need help with a specific error, add the request identifier
(`request_id`) in your message to the Belvo support team. This will speed up
investigations and get you back up and running in no time at all.


### Error codes and troubleshooting


For a full list of errors and how to troubleshoot them, please see our
dedicated [Error handling
articles](https://developers.belvo.com/docs/integration-overview#error-handling)
in our DevPortal.



### Retry policy


Please see our recommended [retry
policies](https://developers.belvo.com/docs/integration-overview#error-retry-policy)
in the DevPortal.


  For more information, please visit [https://developers.belvo.com](https://developers.belvo.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.vhbarros</groupId>
  <artifactId>belvo-openapi-api-client</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'belvo-openapi-api-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'belvo-openapi-api-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.vhbarros:belvo-openapi-api-client:0.0.1-SNAPSHOT"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/belvo-openapi-api-client-0.0.1-SNAPSHOT.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.vhbarros.belvo.client.invoker.*;
import com.vhbarros.belvo.client.invoker.auth.*;
import com.vhbarros.belvo.client.invoker.auth.api.AccountsApi;

public class AccountsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.belvo.com");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The `account.id` you want to delete
        try {
            apiInstance.destroyAccount(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#destroyAccount");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.belvo.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**destroyAccount**](docs/AccountsApi.md#destroyAccount) | **DELETE** /api/accounts/{id}/ | Delete an account
*AccountsApi* | [**detailAccount**](docs/AccountsApi.md#detailAccount) | **GET** /api/accounts/{id}/ | Get an account&#39;s details
*AccountsApi* | [**listAccounts**](docs/AccountsApi.md#listAccounts) | **GET** /api/accounts/ | List all accounts
*AccountsApi* | [**patchAccounts**](docs/AccountsApi.md#patchAccounts) | **PATCH** /api/accounts/ | Complete an accounts request
*AccountsApi* | [**retrieveAccounts**](docs/AccountsApi.md#retrieveAccounts) | **POST** /api/accounts/ | Retrieve accounts for a link
*BalancesApi* | [**destroyBalance**](docs/BalancesApi.md#destroyBalance) | **DELETE** /api/balances/{id}/ | Delete a balance
*BalancesApi* | [**detailBalance**](docs/BalancesApi.md#detailBalance) | **GET** /api/balances/{id}/ | Get a balance&#39;s details
*BalancesApi* | [**listBalances**](docs/BalancesApi.md#listBalances) | **GET** /api/balances/ | List all balances
*BalancesApi* | [**patchBalances**](docs/BalancesApi.md#patchBalances) | **PATCH** /api/balances/ | Complete a balances request
*BalancesApi* | [**retrieveBalances**](docs/BalancesApi.md#retrieveBalances) | **POST** /api/balances/ | Retrieve balances for a link
*IncomesApi* | [**destroyIncomes**](docs/IncomesApi.md#destroyIncomes) | **DELETE** /api/incomes/{id}/ | Delete an income
*IncomesApi* | [**detailIncome**](docs/IncomesApi.md#detailIncome) | **GET** /api/incomes/{id}/ | Get an income&#39;s details
*IncomesApi* | [**listIncomes**](docs/IncomesApi.md#listIncomes) | **GET** /api/incomes/ | List all incomes
*IncomesApi* | [**patchIncomes**](docs/IncomesApi.md#patchIncomes) | **PATCH** /api/incomes/ | Complete an incomes request
*IncomesApi* | [**retrieveIncome**](docs/IncomesApi.md#retrieveIncome) | **POST** /api/incomes/ | Retrieve incomes for a link
*InstitutionsApi* | [**detailInstitution**](docs/InstitutionsApi.md#detailInstitution) | **GET** /api/institutions/{id}/ | Get an institution&#39;s details
*InstitutionsApi* | [**listInstitutions**](docs/InstitutionsApi.md#listInstitutions) | **GET** /api/institutions/ | List all institutions
*InvestmentPortfoliosBetaApi* | [**destroyPortfolio**](docs/InvestmentPortfoliosBetaApi.md#destroyPortfolio) | **DELETE** /investments/portfolios/{id}/ | Delete a portfolio
*InvestmentPortfoliosBetaApi* | [**detailPortfolio**](docs/InvestmentPortfoliosBetaApi.md#detailPortfolio) | **GET** /investments/portfolios/{id}/ | Get a portfolio&#39;s details
*InvestmentPortfoliosBetaApi* | [**listPortfolio**](docs/InvestmentPortfoliosBetaApi.md#listPortfolio) | **GET** /investments/portfolios/ | List all portfolios
*InvestmentPortfoliosBetaApi* | [**patchPortfolio**](docs/InvestmentPortfoliosBetaApi.md#patchPortfolio) | **PATCH** /investments/portfolios/ | Complete a portfolios request
*InvestmentPortfoliosBetaApi* | [**retrievePortfolio**](docs/InvestmentPortfoliosBetaApi.md#retrievePortfolio) | **POST** /investments/portfolios/ | Retrieve portfolios for a link
*InvestmentTransactionsBetaApi* | [**destroyInvestmentTransaction**](docs/InvestmentTransactionsBetaApi.md#destroyInvestmentTransaction) | **DELETE** /investments/transactions/{id}/ | Delete an investment transaction
*InvestmentTransactionsBetaApi* | [**detailInvestmentTransaction**](docs/InvestmentTransactionsBetaApi.md#detailInvestmentTransaction) | **GET** /investments/transactions/{id}/ | Get an investment transaction&#39;s details
*InvestmentTransactionsBetaApi* | [**listInvestmentTransactions**](docs/InvestmentTransactionsBetaApi.md#listInvestmentTransactions) | **GET** /investments/transactions/ | List all investment transactions
*InvestmentTransactionsBetaApi* | [**patchInvestmentsTransactions**](docs/InvestmentTransactionsBetaApi.md#patchInvestmentsTransactions) | **PATCH** /investments/transactions/ | Complete a investment transactions request
*InvestmentTransactionsBetaApi* | [**retrieveInstrumentTransaction**](docs/InvestmentTransactionsBetaApi.md#retrieveInstrumentTransaction) | **POST** /investments/transactions/ | Retrieve investment transactions for a link
*InvoicesApi* | [**destroyInvoice**](docs/InvoicesApi.md#destroyInvoice) | **DELETE** /api/invoices/{id}/ | Delete an invoice
*InvoicesApi* | [**detailInvoice**](docs/InvoicesApi.md#detailInvoice) | **GET** /api/invoices/{id}/ | Get an invoice&#39;s details
*InvoicesApi* | [**listInvoices**](docs/InvoicesApi.md#listInvoices) | **GET** /api/invoices/ | List all invoices
*InvoicesApi* | [**retrieveInvoices**](docs/InvoicesApi.md#retrieveInvoices) | **POST** /api/invoices/ | Retrieve invoices for a link
*LinksApi* | [**destroyLink**](docs/LinksApi.md#destroyLink) | **DELETE** /api/links/{id}/ | Delete a link
*LinksApi* | [**detailLink**](docs/LinksApi.md#detailLink) | **GET** /api/links/{id}/ | Get a link&#39;s details
*LinksApi* | [**listLinks**](docs/LinksApi.md#listLinks) | **GET** /api/links/ | List all links
*LinksApi* | [**patchLinks**](docs/LinksApi.md#patchLinks) | **PATCH** /api/links/ | Complete a links request
*LinksApi* | [**registerLink**](docs/LinksApi.md#registerLink) | **POST** /api/links/ | Register a new link
*LinksApi* | [**updateLink**](docs/LinksApi.md#updateLink) | **PUT** /api/links/{id}/ | Update a link&#39;s credentials
*OwnersApi* | [**destroyOwner**](docs/OwnersApi.md#destroyOwner) | **DELETE** /api/owners/{id}/ | Delete an owner
*OwnersApi* | [**detailOwner**](docs/OwnersApi.md#detailOwner) | **GET** /api/owners/{id}/ | Get an owner&#39;s details
*OwnersApi* | [**listOwners**](docs/OwnersApi.md#listOwners) | **GET** /api/owners/ | List all owners
*OwnersApi* | [**patchOwners**](docs/OwnersApi.md#patchOwners) | **PATCH** /api/owners/ | Complete an owners request
*OwnersApi* | [**retrieveOwners**](docs/OwnersApi.md#retrieveOwners) | **POST** /api/owners/ | Retrieve owners for a link
*ReceivableTransactionsBetaApi* | [**destroyReceivableTransaction**](docs/ReceivableTransactionsBetaApi.md#destroyReceivableTransaction) | **DELETE** /receivables/transactions/{id}/ | Delete a receivable transaction
*ReceivableTransactionsBetaApi* | [**detailReceivableTransaction**](docs/ReceivableTransactionsBetaApi.md#detailReceivableTransaction) | **GET** /receivables/transactions/{id}/ | Get a receivable transaction&#39;s details
*ReceivableTransactionsBetaApi* | [**listReceivableTransactions**](docs/ReceivableTransactionsBetaApi.md#listReceivableTransactions) | **GET** /receivables/transactions/ | List all receivable transactions
*ReceivableTransactionsBetaApi* | [**retrieveReceivableTransactions**](docs/ReceivableTransactionsBetaApi.md#retrieveReceivableTransactions) | **POST** /receivables/transactions/ | Retrieve receivable transactions for a link
*RecurringExpensesApi* | [**destroyRecurringExpense**](docs/RecurringExpensesApi.md#destroyRecurringExpense) | **DELETE** /api/recurring-expenses/{id}/ | Delete a recurring expense
*RecurringExpensesApi* | [**detailRecurringExpense**](docs/RecurringExpensesApi.md#detailRecurringExpense) | **GET** /api/recurring-expenses/{id}/ | Get a recurring expense&#39;s details
*RecurringExpensesApi* | [**listRecurringExpenses**](docs/RecurringExpensesApi.md#listRecurringExpenses) | **GET** /api/recurring-expenses/ | List all recurring expenses
*RecurringExpensesApi* | [**patchRecurringExpenses**](docs/RecurringExpensesApi.md#patchRecurringExpenses) | **PATCH** /api/recurring-expenses/ | Complete a recurring expenses request
*RecurringExpensesApi* | [**retrieveRecurringExpenses**](docs/RecurringExpensesApi.md#retrieveRecurringExpenses) | **POST** /api/recurring-expenses/ | Retrieve recurring expenses for a link
*RiskInsightsApi* | [**destroyRiskInsights**](docs/RiskInsightsApi.md#destroyRiskInsights) | **DELETE** /api/risk-insights/{id}/ | Delete a risk insight
*RiskInsightsApi* | [**detailRiskInsights**](docs/RiskInsightsApi.md#detailRiskInsights) | **GET** /api/risk-insights/{id}/ | Get a risk insight&#39;s details
*RiskInsightsApi* | [**listRiskInsights**](docs/RiskInsightsApi.md#listRiskInsights) | **GET** /api/risk-insights/ | List all risk insights
*RiskInsightsApi* | [**patchRiskInsights**](docs/RiskInsightsApi.md#patchRiskInsights) | **PATCH** /api/risk-insights/ | Complete a risk insights request
*RiskInsightsApi* | [**retrieveRiskInsights**](docs/RiskInsightsApi.md#retrieveRiskInsights) | **POST** /api/risk-insights/ | Retrieve risk insights for a link
*TaxComplianceStatusApi* | [**destroyTaxComplianceStatus**](docs/TaxComplianceStatusApi.md#destroyTaxComplianceStatus) | **DELETE** /api/tax-compliance-status/{id}/ | Delete a tax compliance status
*TaxComplianceStatusApi* | [**detailTaxComplianceStatus**](docs/TaxComplianceStatusApi.md#detailTaxComplianceStatus) | **GET** /api/tax-compliance-status/{id}/ | Get a tax compliance status&#39;s details
*TaxComplianceStatusApi* | [**listTaxComplianceStatus**](docs/TaxComplianceStatusApi.md#listTaxComplianceStatus) | **GET** /api/tax-compliance-status/ | List all tax compliance statuses
*TaxComplianceStatusApi* | [**retrieveTaxComplianceStatus**](docs/TaxComplianceStatusApi.md#retrieveTaxComplianceStatus) | **POST** /api/tax-compliance-status/ | Retrieve tax compliance statuses for a link
*TaxRetentionsApi* | [**destroyTaxRetention**](docs/TaxRetentionsApi.md#destroyTaxRetention) | **DELETE** /api/tax-retentions/{id}/ | Delete a tax retention
*TaxRetentionsApi* | [**detailTaxRetentions**](docs/TaxRetentionsApi.md#detailTaxRetentions) | **GET** /api/tax-retentions/{id}/ | Get a tax retention&#39;s details
*TaxRetentionsApi* | [**listTaxRetentions**](docs/TaxRetentionsApi.md#listTaxRetentions) | **GET** /api/tax-retentions/ | List all tax retentions
*TaxRetentionsApi* | [**retrieveTaxRetentions**](docs/TaxRetentionsApi.md#retrieveTaxRetentions) | **POST** /api/tax-retentions/ | Retrieve tax retentions for a link
*TaxReturnsApi* | [**destroyTaxReturn**](docs/TaxReturnsApi.md#destroyTaxReturn) | **DELETE** /api/tax-returns/{id}/ | Delete a tax return
*TaxReturnsApi* | [**detailTaxReturn**](docs/TaxReturnsApi.md#detailTaxReturn) | **GET** /api/tax-returns/{id}/ | Get a tax return&#39;s details
*TaxReturnsApi* | [**listTaxReturns**](docs/TaxReturnsApi.md#listTaxReturns) | **GET** /api/tax-returns/ | List all tax returns
*TaxReturnsApi* | [**retrieveTaxReturns**](docs/TaxReturnsApi.md#retrieveTaxReturns) | **POST** /api/tax-returns/ | Retrieve tax returns for a link
*TaxStatusApi* | [**destroyTaxStatus**](docs/TaxStatusApi.md#destroyTaxStatus) | **DELETE** /api/tax-status/{id}/ | Delete a tax status
*TaxStatusApi* | [**detailTaxStatus**](docs/TaxStatusApi.md#detailTaxStatus) | **GET** /api/tax-status/{id}/ | Get a tax status&#39;s details
*TaxStatusApi* | [**listTaxStatus**](docs/TaxStatusApi.md#listTaxStatus) | **GET** /api/tax-status/ | List all tax statuses
*TaxStatusApi* | [**retrieveTaxStatus**](docs/TaxStatusApi.md#retrieveTaxStatus) | **POST** /api/tax-status/ | Retrieve tax statuses for a link
*TransactionsApi* | [**destroyTransaction**](docs/TransactionsApi.md#destroyTransaction) | **DELETE** /api/transactions/{id}/ | Delete a transaction
*TransactionsApi* | [**detailTransaction**](docs/TransactionsApi.md#detailTransaction) | **GET** /api/transactions/{id}/ | Get a transaction&#39;s details
*TransactionsApi* | [**listTransactions**](docs/TransactionsApi.md#listTransactions) | **GET** /api/transactions/ | List all transactions
*TransactionsApi* | [**patchTransactions**](docs/TransactionsApi.md#patchTransactions) | **PATCH** /api/transactions/ | Complete a transactions request
*TransactionsApi* | [**retrieveTransactions**](docs/TransactionsApi.md#retrieveTransactions) | **POST** /api/transactions/ | Retrieve transactions for a link


## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountFilters](docs/AccountFilters.md)
 - [AccountsBalance](docs/AccountsBalance.md)
 - [AccountsCreditData](docs/AccountsCreditData.md)
 - [AccountsFundsData](docs/AccountsFundsData.md)
 - [AccountsFundsDataPublicIdentifications](docs/AccountsFundsDataPublicIdentifications.md)
 - [AccountsGigPaymentData](docs/AccountsGigPaymentData.md)
 - [AccountsLoanData](docs/AccountsLoanData.md)
 - [AccountsLoanDataFees](docs/AccountsLoanDataFees.md)
 - [AccountsLoanDataInterestRate](docs/AccountsLoanDataInterestRate.md)
 - [AccountsPaginatedResponse](docs/AccountsPaginatedResponse.md)
 - [AccountsReceivablesData](docs/AccountsReceivablesData.md)
 - [Balance](docs/Balance.md)
 - [BalanceFilters](docs/BalanceFilters.md)
 - [BalancesPaginatedResponse](docs/BalancesPaginatedResponse.md)
 - [BalancesRequest](docs/BalancesRequest.md)
 - [Income](docs/Income.md)
 - [IncomeFilters](docs/IncomeFilters.md)
 - [IncomeSourceTransaction](docs/IncomeSourceTransaction.md)
 - [IncomeSources](docs/IncomeSources.md)
 - [IncomesAggregations](docs/IncomesAggregations.md)
 - [IncomesPaginatedResponse](docs/IncomesPaginatedResponse.md)
 - [IncomesRequest](docs/IncomesRequest.md)
 - [Institution](docs/Institution.md)
 - [InstitutionAccount](docs/InstitutionAccount.md)
 - [InstitutionDownError](docs/InstitutionDownError.md)
 - [InstitutionFilters](docs/InstitutionFilters.md)
 - [InstitutionFormFields](docs/InstitutionFormFields.md)
 - [InstitutionInactiveError](docs/InstitutionInactiveError.md)
 - [InstitutionUnavailableError](docs/InstitutionUnavailableError.md)
 - [InstitutionsFeature](docs/InstitutionsFeature.md)
 - [InstitutionsFormField](docs/InstitutionsFormField.md)
 - [InstitutionsFormFieldValues](docs/InstitutionsFormFieldValues.md)
 - [InstitutionsPaginatedResponse](docs/InstitutionsPaginatedResponse.md)
 - [InstrumentTransactionRequest](docs/InstrumentTransactionRequest.md)
 - [InvalidLinkError](docs/InvalidLinkError.md)
 - [InvalidPeriodError](docs/InvalidPeriodError.md)
 - [InvestmentPortfolioFilters](docs/InvestmentPortfolioFilters.md)
 - [InvestmentTransactionFilters](docs/InvestmentTransactionFilters.md)
 - [InvestmentsInstrumentTransaction](docs/InvestmentsInstrumentTransaction.md)
 - [InvestmentsInstrumentTransactionInstrument](docs/InvestmentsInstrumentTransactionInstrument.md)
 - [InvestmentsInstrumentTransactionPortfolio](docs/InvestmentsInstrumentTransactionPortfolio.md)
 - [InvestmentsPortfolio](docs/InvestmentsPortfolio.md)
 - [InvestmentsPortfolioInstrument](docs/InvestmentsPortfolioInstrument.md)
 - [InvestmentsPortfolioInstrumentFees](docs/InvestmentsPortfolioInstrumentFees.md)
 - [InvestmentsPortfolioInstrumentInterestRate](docs/InvestmentsPortfolioInstrumentInterestRate.md)
 - [InvestmentsPortfolioInstrumentPublicId](docs/InvestmentsPortfolioInstrumentPublicId.md)
 - [InvestmentsPortfolioInstrumentRedemptionConditions](docs/InvestmentsPortfolioInstrumentRedemptionConditions.md)
 - [InvestmentsPortfoliosPaginatedResponse](docs/InvestmentsPortfoliosPaginatedResponse.md)
 - [InvestmentsTransactionsPaginatedResponse](docs/InvestmentsTransactionsPaginatedResponse.md)
 - [InvoiceDetail](docs/InvoiceDetail.md)
 - [InvoiceDetailRetainedTax](docs/InvoiceDetailRetainedTax.md)
 - [InvoiceFilters](docs/InvoiceFilters.md)
 - [InvoiceWarnings](docs/InvoiceWarnings.md)
 - [InvoiceWithId](docs/InvoiceWithId.md)
 - [InvoicesPayments](docs/InvoicesPayments.md)
 - [InvoicesPaymentsRelatedDocuments](docs/InvoicesPaymentsRelatedDocuments.md)
 - [InvoicesPayroll](docs/InvoicesPayroll.md)
 - [InvoicesRequest](docs/InvoicesRequest.md)
 - [InvoicesResponsePaginatedResponse](docs/InvoicesResponsePaginatedResponse.md)
 - [Link](docs/Link.md)
 - [LinkFilters](docs/LinkFilters.md)
 - [LinksPutRequest](docs/LinksPutRequest.md)
 - [LinksRequest](docs/LinksRequest.md)
 - [ListTaxReturns200Response](docs/ListTaxReturns200Response.md)
 - [NotFoundError](docs/NotFoundError.md)
 - [Owner](docs/Owner.md)
 - [OwnerDocumentId](docs/OwnerDocumentId.md)
 - [OwnerFilters](docs/OwnerFilters.md)
 - [OwnersGigData](docs/OwnersGigData.md)
 - [OwnersPaginatedResponse](docs/OwnersPaginatedResponse.md)
 - [PaginatedResponseLink](docs/PaginatedResponseLink.md)
 - [PatchBody](docs/PatchBody.md)
 - [PatchBodyWithoutSaveData](docs/PatchBodyWithoutSaveData.md)
 - [ReceivableTransactionFilters](docs/ReceivableTransactionFilters.md)
 - [ReceivableTransactionRequest](docs/ReceivableTransactionRequest.md)
 - [ReceivablesTransaction](docs/ReceivablesTransaction.md)
 - [ReceivablesTransactionAccount](docs/ReceivablesTransactionAccount.md)
 - [ReceivablesTransactionNumberOfInstallments](docs/ReceivablesTransactionNumberOfInstallments.md)
 - [ReceivablesTransactionsPaginatedResponse](docs/ReceivablesTransactionsPaginatedResponse.md)
 - [RecevablesTransactionFees](docs/RecevablesTransactionFees.md)
 - [RecurringExpenseFilters](docs/RecurringExpenseFilters.md)
 - [RecurringExpenseSourceTransaction](docs/RecurringExpenseSourceTransaction.md)
 - [RecurringExpenses](docs/RecurringExpenses.md)
 - [RecurringExpensesPaginatedResponse](docs/RecurringExpensesPaginatedResponse.md)
 - [RegisterLink400ResponseInner](docs/RegisterLink400ResponseInner.md)
 - [RequestTimeoutError](docs/RequestTimeoutError.md)
 - [RetentionBreakdown](docs/RetentionBreakdown.md)
 - [RetrieveIncome400ResponseInner](docs/RetrieveIncome400ResponseInner.md)
 - [RetrieveTaxReturns200ResponseInner](docs/RetrieveTaxReturns200ResponseInner.md)
 - [RetrieveTaxReturnsRequest](docs/RetrieveTaxReturnsRequest.md)
 - [RiskInsightFilters](docs/RiskInsightFilters.md)
 - [RiskInsights](docs/RiskInsights.md)
 - [RiskInsightsBalanceMetrics](docs/RiskInsightsBalanceMetrics.md)
 - [RiskInsightsCashflowMetrics](docs/RiskInsightsCashflowMetrics.md)
 - [RiskInsightsCreditCardMetrics](docs/RiskInsightsCreditCardMetrics.md)
 - [RiskInsightsLoansMetrics](docs/RiskInsightsLoansMetrics.md)
 - [RiskInsightsPaginatedResponse](docs/RiskInsightsPaginatedResponse.md)
 - [RiskInsightsTransactionMetrics](docs/RiskInsightsTransactionMetrics.md)
 - [SessionExpiredError](docs/SessionExpiredError.md)
 - [StandardRequest](docs/StandardRequest.md)
 - [TaxComplianceStatus](docs/TaxComplianceStatus.md)
 - [TaxComplianceStatusFilters](docs/TaxComplianceStatusFilters.md)
 - [TaxComplianceStatusPaginatedResponse](docs/TaxComplianceStatusPaginatedResponse.md)
 - [TaxComplianceStatusRequest](docs/TaxComplianceStatusRequest.md)
 - [TaxRetentions](docs/TaxRetentions.md)
 - [TaxRetentionsPaginatedResponse](docs/TaxRetentionsPaginatedResponse.md)
 - [TaxRetentionsRequest](docs/TaxRetentionsRequest.md)
 - [TaxReturnBusiness](docs/TaxReturnBusiness.md)
 - [TaxReturnBusinessMonthly](docs/TaxReturnBusinessMonthly.md)
 - [TaxReturnFilters](docs/TaxReturnFilters.md)
 - [TaxReturnPersonal](docs/TaxReturnPersonal.md)
 - [TaxReturnPersonalMonthly](docs/TaxReturnPersonalMonthly.md)
 - [TaxReturnsBusinessMonthlyPaginated](docs/TaxReturnsBusinessMonthlyPaginated.md)
 - [TaxReturnsBusinessPaginated](docs/TaxReturnsBusinessPaginated.md)
 - [TaxReturnsMonthlyRequest](docs/TaxReturnsMonthlyRequest.md)
 - [TaxReturnsPersonalMonthlyPaginated](docs/TaxReturnsPersonalMonthlyPaginated.md)
 - [TaxReturnsPersonalPaginated](docs/TaxReturnsPersonalPaginated.md)
 - [TaxReturnsYearlyRequest](docs/TaxReturnsYearlyRequest.md)
 - [TaxStatus](docs/TaxStatus.md)
 - [TaxStatusAddress](docs/TaxStatusAddress.md)
 - [TaxStatusAddressBetweenStreet](docs/TaxStatusAddressBetweenStreet.md)
 - [TaxStatusEconomicActivity](docs/TaxStatusEconomicActivity.md)
 - [TaxStatusFilters](docs/TaxStatusFilters.md)
 - [TaxStatusObligations](docs/TaxStatusObligations.md)
 - [TaxStatusPaginatedResponse](docs/TaxStatusPaginatedResponse.md)
 - [TaxStatusRegimens](docs/TaxStatusRegimens.md)
 - [TaxStatusRequest](docs/TaxStatusRequest.md)
 - [TaxStatusTaxPayerInformation](docs/TaxStatusTaxPayerInformation.md)
 - [TokenRequiredResponse](docs/TokenRequiredResponse.md)
 - [TokenRequiredResponseTokenGenerationData](docs/TokenRequiredResponseTokenGenerationData.md)
 - [TooManySessionsError](docs/TooManySessionsError.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionBreakdown](docs/TransactionBreakdown.md)
 - [TransactionCreditCardData](docs/TransactionCreditCardData.md)
 - [TransactionFilters](docs/TransactionFilters.md)
 - [TransactionGigData](docs/TransactionGigData.md)
 - [TransactionMerchantData](docs/TransactionMerchantData.md)
 - [TransactionsPaginatedResponse](docs/TransactionsPaginatedResponse.md)
 - [TransactionsRequest](docs/TransactionsRequest.md)
 - [UnauthorizedError](docs/UnauthorizedError.md)
 - [UnconfirmedLinkError](docs/UnconfirmedLinkError.md)
 - [UnexpectedError](docs/UnexpectedError.md)
 - [UnsupportedOperationError](docs/UnsupportedOperationError.md)
 - [ValidationError](docs/ValidationError.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth


- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@belvo.com

