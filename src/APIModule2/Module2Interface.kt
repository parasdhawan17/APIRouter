package com.paymentus.sdk.APIHandlers.Controllers.AutoPay

import APIModule1.DataObjectModule1
import APIModule1.DataObjectModule2
import APIModule1.ResponseObjectModule1
import APIModule1.ResponseObjectModule2

internal interface Module2Interface {
    fun makePutCall(dataObjectModule1: DataObjectModule2,
                    completionHandler: (response: ResponseObjectModule2) -> Unit)
    fun makePostCall(dataObjectModule1: DataObjectModule2,
                     completionHandler: (response: ResponseObjectModule2) -> Unit)
}