package com.paymentus.sdk.APIHandlers.Controllers.AutoPay

import APIModule1.*
import com.paymentus.sdk.APIHandlers.Controllers.RestHttp.RestHttpInterface

internal class Module3Controller constructor(module3Interface: Module3Interface) : Module3Interface{


    var module3Interface: Module3Interface = module3Interface;


    override fun makePostCall(
        dataObjectModule3: DataObjectModule3,
        completionHandler: (response: ResponseObjectModule3) -> Unit
    ) {
        module3Interface.makePostCall(dataObjectModule3,completionHandler)
    }

    override fun makePutCall(
        dataObjectModule3: DataObjectModule3,
        completionHandler: (response: ResponseObjectModule3) -> Unit
    ) {
        module3Interface.makePostCall(dataObjectModule3,completionHandler)
    }
}