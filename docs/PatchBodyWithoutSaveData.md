

# PatchBodyWithoutSaveData

A JSON object containing a session UUID and a MFA token

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**session** | **String** | The session you want to resume. You need to use the &#x60;session&#x60; value that is provided in the 428 Token Required response that you receive after you make your POST request. |  |
|**token** | **String** | The MFA token generated by the institution and required to continue a session. |  [optional] |
|**link** | **UUID** | The &#x60;link.id&#x60; you want to resume. Must be the same &#x60;link.id&#x60; as the one you receive in the 428 Token Required response that contains the &#x60;session&#x60; ID. |  |



