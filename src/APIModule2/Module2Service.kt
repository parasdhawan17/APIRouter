package com.paymentus.sdk.APIHandlers.Controllers.AutoPay

import APIModule1.DataObjectModule1
import APIModule1.DataObjectModule2
import APIModule1.ResponseObjectModule1
import APIModule1.ResponseObjectModule2
import com.paymentus.sdk.APIHandlers.Controllers.RestHttp.RestHttpController
import com.paymentus.sdk.APIHandlers.Controllers.RestHttp.RestHttpService
import com.paymentus.sdk.APIHandlers.DataModels.ApiHandlers.APIRequestDataObject
import com.paymentus.sdk.APIHandlers.DataModels.ApiHandlers.ApiResponseDataObject

/**
 * This class handles Auto Pay related transaction request and response.
 */
internal class Module2Service : Module2Interface {

    private val service = RestHttpService()
    private val apiController = RestHttpController(service)
    private val API_PATH: String = "http://www.dummy.com/api"

    override fun makePutCall(
        dataObjectModule1: DataObjectModule2,
        completionHandler: (response: ResponseObjectModule2) -> Unit
    ) {
        val apiRequestDataObject = APIRequestDataObject(body = dataObjectModule1.data, path = API_PATH)
        apiController.putRequest(apiRequestDataObject) {
                response: ApiResponseDataObject ->
            var responseObjectModule1 = ResponseObjectModule1(response = response.response!!)
        }
    }

    override fun makePostCall(
        dataObjectModule1: DataObjectModule2,
        completionHandler: (response: ResponseObjectModule2) -> Unit
    ) {
        val apiRequestDataObject = APIRequestDataObject(body = dataObjectModule1.data, path = API_PATH)
        apiController.postRequest(apiRequestDataObject) {
                response: ApiResponseDataObject ->
            var responseObjectModule1 = ResponseObjectModule1(response = response.response!!)
        }
    }

}