package com.paymentus.sdk.APIHandlers.Controllers.AutoPay

import APIModule1.DataObjectModule1
import APIModule1.DataObjectModule3
import APIModule1.ResponseObjectModule1
import APIModule1.ResponseObjectModule3

internal interface Module3Interface {
    fun makePutCall(dataObjectModule3: DataObjectModule3,
                    completionHandler: (response: ResponseObjectModule3) -> Unit)
    fun makePostCall(dataObjectModule3: DataObjectModule3,
                     completionHandler: (response: ResponseObjectModule3) -> Unit)
}