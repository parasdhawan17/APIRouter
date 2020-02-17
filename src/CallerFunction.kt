import APIModule1.ResponseObjectModule1
import APIModule1.ResponseObjectModule2
import APIModule1.ResponseObjectModule3
import jdk.nashorn.internal.codegen.CompilerConstants

internal class CallerFunction {
    fun makeCall(module: Module) {
        when (module) {
            is Module.Module1 -> {
                module.makeCall()
            }
            is Module.Module2 -> {
                module.makeCall()
            }
            is Module.Module3 -> {
                module.makeCall()
            }
        }
    }
}

internal fun call() {
    val obj = CallerFunction()
    obj.makeCall(Module.Module1.PostCall("data") { response: ResponseObjectModule1 ->
        // Handle the result
    })
    obj.makeCall(Module.Module1.PutCall("data") { response: ResponseObjectModule1 ->
        // Handle the result
    })

    obj.makeCall(Module.Module2.PostCall("data") { response: ResponseObjectModule2 ->
        // Handle the result
    })
    obj.makeCall(Module.Module2.PutCall("data") { response: ResponseObjectModule2 ->
        // Handle the result
    })
    obj.makeCall(Module.Module3.PostCall("data") { response: ResponseObjectModule3 ->
        // Handle the result
    })
    obj.makeCall(Module.Module3.PutCall("data") { response: ResponseObjectModule3 ->
        // Handle the result
    })
}