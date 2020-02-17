package com.paymentus.sdk.APIHandlers.Controllers.AutoPay

import APIModule1.DataObjectModule1
import APIModule1.ResponseObjectModule1
import com.paymentus.sdk.APIHandlers.Controllers.RestHttp.RestHttpInterface

internal class Module3Controller constructor(module3Interface: Module3Interface) : Module3Interface{


    var module3Interface: Module3Interface = module3Interface;


    override fun makePostCall(
        dataObjectModule1: DataObjectModule1,
        completionHandler: (response: ResponseObjectModule1) -> Unit
    ) {
        module3Interface.makePostCall(dataObjectModule1,completionHandler)
    }

    override fun makePutCall(
        dataObjectModule1: DataObjectModule1,
        completionHandler: (response: ResponseObjectModule1) -> Unit
    ) {
        module3Interface.makePostCall(dataObjectModule1,completionHandler)
    }
}