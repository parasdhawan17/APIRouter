package com.paymentus.sdk.APIHandlers.Controllers.AutoPay

import APIModule1.DataObjectModule1
import APIModule1.ResponseObjectModule1
import com.paymentus.sdk.APIHandlers.Controllers.RestHttp.RestHttpInterface

internal class Module1Controller constructor(module1Interface: Module1Interface) : Module1Interface{


    var module1Interface: Module1Interface = module1Interface;


    override fun makePostCall(
        dataObjectModule1: DataObjectModule1,
        completionHandler: (response: ResponseObjectModule1) -> Unit
    ) {
        module1Interface.makePostCall(dataObjectModule1,completionHandler)
    }

    override fun makePutCall(
        dataObjectModule1: DataObjectModule1,
        completionHandler: (response: ResponseObjectModule1) -> Unit
    ) {
        module1Interface.makePostCall(dataObjectModule1,completionHandler)
    }
}