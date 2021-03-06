package com.paymentus.sdk.APIHandlers.Controllers.AutoPay

import APIModule1.DataObjectModule1
import APIModule1.DataObjectModule2
import APIModule1.ResponseObjectModule1
import APIModule1.ResponseObjectModule2
import com.paymentus.sdk.APIHandlers.Controllers.RestHttp.RestHttpInterface

internal class Module2Controller constructor(module2Interface: Module2Interface) : Module2Interface{


    var module2Interface: Module2Interface = module2Interface;


    override fun makePostCall(
        dataObjectModule1: DataObjectModule2,
        completionHandler: (response: ResponseObjectModule2) -> Unit
    ) {
        module2Interface.makePostCall(dataObjectModule1,completionHandler)
    }

    override fun makePutCall(
        dataObjectModule1: DataObjectModule2,
        completionHandler: (response: ResponseObjectModule2) -> Unit
    ) {
        module2Interface.makePostCall(dataObjectModule1,completionHandler)
    }
}