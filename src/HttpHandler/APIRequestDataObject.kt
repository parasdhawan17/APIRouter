package com.paymentus.sdk.APIHandlers.DataModels.ApiHandlers

import java.io.File

data class APIRequestDataObject(var body : String?= null,
                                var path : String,
                                var headers:Map<String,String>?=null,
                                var authToken : String?= null,
                                var queryParameters : Map<String,String>?=null,
                                var xformUrlEncodedFormParams: Map<String,String>?=null,
                                var multiPartData : File?=null)