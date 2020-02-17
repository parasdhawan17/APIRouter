import APIModule1.*
import com.paymentus.sdk.APIHandlers.Controllers.AutoPay.*
import com.paymentus.sdk.APIHandlers.Controllers.AutoPay.Module1Controller
import com.paymentus.sdk.APIHandlers.Controllers.AutoPay.Module1Service
import com.paymentus.sdk.APIHandlers.Controllers.AutoPay.Module2Controller
import com.paymentus.sdk.APIHandlers.Controllers.AutoPay.Module2Service
import com.paymentus.sdk.APIHandlers.Controllers.AutoPay.Module3Service

internal sealed class Module{

    sealed class Module1 : Module(){
        private val module1Service = Module1Service()
        val module1Controller = Module1Controller(module1Service)

        class PostCall(var data : DataObjectModule1,var completionHandler: (response: ResponseObjectModule1) -> Unit) : Module1(){
            fun call(){
                module1Controller.makePostCall(data,completionHandler)
            }
        }

        class PutCall(var data : String,var completionHandler: (response: ResponseObjectModule1) -> Unit) : Module1(){
            fun call(){
                module1Controller.makePostCall(DataObjectModule1(data),completionHandler)
            }
        }

        fun makeCall(){
            when(this){
                is Module1.PostCall -> this.call()
                is Module1.PutCall -> this.call()

            }
        }
    }

    sealed class Module2 : Module(){
        private val module2Service = Module2Service()
        val module2Controller = Module2Controller(module2Service)
        class PostCall(var data : DataObjectModule2, var completionHandler: (response: ResponseObjectModule2) -> Unit) : Module2(){
            fun call(){
                module2Controller.makePostCall(data,completionHandler)
            }
        }
        class PutCall(var data : DataObjectModule2,var completionHandler: (response: ResponseObjectModule2) -> Unit) : Module2(){
            fun call(){
                module2Controller.makePostCall(data,completionHandler)
            }
        }

        fun makeCall(){
            when(this){
                is Module2.PostCall -> this.call()
                is Module2.PutCall -> this.call()

            }
        }
    }

    sealed class Module3 : Module(){
        private val module3Service = Module3Service()
        val module3Controller = Module3Controller(module3Service)
        class PostCall(var data : DataObjectModule3,var completionHandler: (response: ResponseObjectModule3) -> Unit) : Module3(){
            fun call(){
                module3Controller.makePostCall(data,completionHandler)
            }
        }
        class PutCall(var data : DataObjectModule3,var completionHandler: (response: ResponseObjectModule3) -> Unit) : Module3(){
            fun call(){
                module3Controller.makePostCall(data,completionHandler)
            }
        }


        fun makeCall(){
            when(this){
                is Module3.PostCall -> this.call()
                is Module3.PutCall -> this.call()

            }
        }
    }
}