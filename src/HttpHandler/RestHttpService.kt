package com.paymentus.sdk.APIHandlers.Controllers.RestHttp

import com.paymentus.sdk.APIHandlers.DataModels.ApiHandlers.APIRequestDataObject
import com.paymentus.sdk.APIHandlers.DataModels.ApiHandlers.ApiResponseDataObject


/**
 * This class handles the Api Requests, which are operated by the Volley Library.
 */
class RestHttpService : RestHttpInterface {
    override fun postRequest(
        apiRequestDataObject: APIRequestDataObject,
        completionHandler: (response: ApiResponseDataObject) -> Unit
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRequest(
        apiRequestDataObject: APIRequestDataObject,
        completionHandler: (response: ApiResponseDataObject) -> Unit
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteRequest(
        apiRequestDataObject: APIRequestDataObject,
        completionHandler: (response: ApiResponseDataObject) -> Unit
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun putRequest(
        apiRequestDataObject: APIRequestDataObject,
        completionHandler: (response: ApiResponseDataObject) -> Unit
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun multiPartRequest(
        apiRequestDataObject: APIRequestDataObject,
        completionHandler: (response: ApiResponseDataObject) -> Unit
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}