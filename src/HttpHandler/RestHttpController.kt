package com.paymentus.sdk.APIHandlers.Controllers.RestHttp

import com.paymentus.sdk.APIHandlers.DataModels.ApiHandlers.APIRequestDataObject
import com.paymentus.sdk.APIHandlers.DataModels.ApiHandlers.ApiResponseDataObject

/**
 * This controller class route the Api Requests to the RestHttpService
 */
class RestHttpController constructor(restHttpInjection: RestHttpInterface): RestHttpInterface {


    private val restHttp: RestHttpInterface = restHttpInjection

    /**
     * This function create a Post Api request of Content Type - application/json.
     *
     * @param apiRequestDataObject This Data class encapsulate the details required to make an api request
     * @param completionHandler This handler conveys the success/failure of the Api Request to the calling function
     */
    override fun postRequest(apiRequestDataObject: APIRequestDataObject,
                             completionHandler: (response: ApiResponseDataObject) -> Unit) {
        restHttp.postRequest(apiRequestDataObject,completionHandler)
    }

    /**
     * This function create a Get Api request.
     *
     * @param apiRequestDataObject This Data class encapsulate the details required to make an api request
     * @param completionHandler This handler conveys the success/failure of the Api Request to the calling function
     */
    override fun getRequest(apiRequestDataObject: APIRequestDataObject, completionHandler: (response: ApiResponseDataObject) -> Unit) {
        restHttp.getRequest(apiRequestDataObject, completionHandler)
    }

    /**
     * This function create a Delete Api request
     *
     * @param apiRequestDataObject This Data class encapsulate the details required to make an api request
     * @param completionHandler This handler conveys the success/failure of the Api Request to the calling function
     */
    override fun deleteRequest(apiRequestDataObject: APIRequestDataObject, completionHandler: (response: ApiResponseDataObject) -> Unit) {
        restHttp.deleteRequest(apiRequestDataObject, completionHandler)
    }

    /**
     * This function create a Put Api request
     *
     * @param apiRequestDataObject This Data class encapsulate the details required to make an api request
     * @param completionHandler This handler conveys the success/failure of the Api Request to the calling function
     */
    override fun putRequest(apiRequestDataObject: APIRequestDataObject, completionHandler: (response: ApiResponseDataObject) -> Unit) {
       restHttp.putRequest(apiRequestDataObject,completionHandler)
    }

    /**
     * This function defines a Multipart api request
     *
     * @param apiRequestDataObject This Data class encapsulate the details required to make an api request
     * @param completionHandler This handler conveys the success/failure of the Api Request to the calling function
     */
    override fun multiPartRequest(
        apiRequestDataObject: APIRequestDataObject,
        completionHandler: (response: ApiResponseDataObject) -> Unit
    ) {
        restHttp.multiPartRequest(apiRequestDataObject,completionHandler)
    }
}