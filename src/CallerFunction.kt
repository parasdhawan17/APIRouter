import APIModule1.*
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
    obj.makeCall(Module.Module1.PostCall(DataObjectModule1("data")) { response: ResponseObjectModule1 ->
        // Handle the result
    })
    obj.makeCall(Module.Module1.PutCall(DataObjectModule1("data")) { response: ResponseObjectModule1 ->
        // Handle the result
    })

    obj.makeCall(Module.Module2.PostCall(DataObjectModule2("data")) { response: ResponseObjectModule2 ->
        // Handle the result
    })
    obj.makeCall(Module.Module2.PutCall(DataObjectModule2("data")) { response: ResponseObjectModule2 ->
        // Handle the result
    })
    obj.makeCall(Module.Module3.PostCall(DataObjectModule3("data")) { response: ResponseObjectModule3 ->
        // Handle the result
    })
    obj.makeCall(Module.Module3.PutCall(DataObjectModule3("data")) { response: ResponseObjectModule3 ->
        // Handle the result
    })
}