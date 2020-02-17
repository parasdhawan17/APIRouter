package com.paymentus.sdk.APIHandlers.Controllers.RestHttp

import com.paymentus.sdk.APIHandlers.DataModels.ApiHandlers.APIRequestDataObject
import com.paymentus.sdk.APIHandlers.DataModels.ApiHandlers.ApiResponseDataObject

/**
 * This interface class defines the Api Requests
 */
interface RestHttpInterface {

    /**
     * This function defines a Post Api request of Content Type - application/json.
     *
     * @param apiRequestDataObject This Data class encapsulate the details required to make an api request
     * @param completionHandler This handler conveys the success/failure of the Api Request to the calling function
     */
    fun postRequest(apiRequestDataObject: APIRequestDataObject, completionHandler: (response: ApiResponseDataObject) -> Unit)

    /**
     * This function defines a Get Api request.
     *
     * @param apiRequestDataObject This Data class encapsulate the details required to make an api request
     * @param completionHandler This handler conveys the success/failure of the Api Request to the calling function
     */
    fun getRequest(apiRequestDataObject: APIRequestDataObject, completionHandler: (response: ApiResponseDataObject) -> Unit)

    /**
     * This function defines a Delete Api request
     *
     * @param apiRequestDataObject This Data class encapsulate the details required to make an api request
     * @param completionHandler This handler conveys the success/failure of the Api Request to the calling function
     */
    fun deleteRequest(apiRequestDataObject: APIRequestDataObject,completionHandler: (response: ApiResponseDataObject) -> Unit)

    /**
     * This function defines a Put Api request
     *
     * @param apiRequestDataObject This Data class encapsulate the details required to make an api request
     * @param completionHandler This handler conveys the success/failure of the Api Request to the calling function
     */
    fun putRequest(apiRequestDataObject: APIRequestDataObject,completionHandler: (response: ApiResponseDataObject) -> Unit)

    /**
     * This function defines a Multipart api request
     *
     * @param apiRequestDataObject This Data class encapsulate the details required to make an api request
     * @param completionHandler This handler conveys the success/failure of the Api Request to the calling function
     */
    fun multiPartRequest(apiRequestDataObject: APIRequestDataObject,completionHandler: (response: ApiResponseDataObject) -> Unit)
}