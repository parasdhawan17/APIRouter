package com.paymentus.sdk.APIHandlers.Controllers.AutoPay

import APIModule1.DataObjectModule1
import APIModule1.ResponseObjectModule1

internal interface Module1Interface {
    fun makePutCall(dataObjectModule1: DataObjectModule1,
                    completionHandler: (response: ResponseObjectModule1) -> Unit)
    fun makePostCall(dataObjectModule1: DataObjectModule1,
                     completionHandler: (response: ResponseObjectModule1) -> Unit)
}