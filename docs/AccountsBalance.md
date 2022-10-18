

# AccountsBalance

Details regarding the current and available balances for the account. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**current** | **Float** | The current balance is calculated differently according to the type of account.  - **💰 Checking and saving accounts**:  The user&#39;s account balance at the &#x60;collected_at&#x60; timestamp. - **💳 Credit cards**:  The amount the user has spent in the current card billing period (see &#x60;credit_data.cutting_date&#x60; for information on when the current billing period finishes). - **🏡 Loan accounts**:  The amount remaining to pay on the users&#39;s loan (same as &#x60;loan_data.outstanding_balance&#x60;). - **🚙 Gig economy accounts**:  The calculated amount the user has in their gig wallet. |  |
|**available** | **Float** | The balance that the account owner can use. - **💰 Checking and saving accounts**:  The available balance may be different to the &#x60;current&#x60; balance due to pending transactions. - **💳 Credit cards**:  The credit amount the user still has available for the current period. The amount is calculated as &#x60;credit_data.credit_limit&#x60; minus &#x60;balance.current&#x60;. - **🏡 Loan accounts**:  The present value required to pay off the loan, as provided by the institution.  **Note:** If the institution does not provide this value, we return &#x60;null&#x60;. - **🚙 Gig economy accounts**:  The amount the user currently has available in their gig wallet. This can differ from the &#x60;balance.current&#x60; in situations where the user has received a cash payment for a service and needs to charge their gig account with the amount they received in cash. |  [optional] |



