package com.paymentus.sdk.APIHandlers.DataModels.ApiHandlers


data class ApiResponseDataObject
    (var response : String ?= null,
     var responseCode : Int?= null ,
     var success : Boolean = true,
     var error : String?=null)