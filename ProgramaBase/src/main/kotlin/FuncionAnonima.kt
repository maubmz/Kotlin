//fun main(args: Array<String>){ //Funcion anonima
//    val salida:(Int)->String={//el it solo sirve cuando solo recibe un objeto
//        "Salida de datos $it "
//    }
//    println(salida(90))
//}

//fun main(args: Array<String>){
//    val salida={
//        val dato="FES"
//        "Salida de datos $dato"
//    }
//    println(salida())
//}

//fun main(args: Array<String>){//ocupacion inferencia
//    val salida={a:Int,b:String->
//        val dato="FES"
//        "demo"
//        "Salida de datos $dato"
//    }
//    println(salida(3,"foca"))
//
//}

//fun main(ags:Array<String>){//definiendo una funcion que acepta otra funcion
//    val salida={entradaUno:String,entradaDos:Int->//"={" le esta haciendo referencia a una funcion
//        val mundo=(1..20).shuffled().last()
//        "Hola $entradaUno tu numero de vidas son $entradaDos para el mundo $mundo"
//    }
//    val especial={valorUno:String,valorDos:Int->
//        val incremento=(1..40).shuffled().last()+valorDos
//        "Hola $valorUno se incremento la siguiente puntuacion $incremento"
//    }
//    simulacion("jugador1",salida,::mostrarMensaje)//"::" significa que despues le das el valor
//    simulacion("Master",especial,::mostrarMensaje)
//}
//inline fun simulacion(jugador:String, bienvenida:(String,Int)->String, agregarOtraFuncion:(Int)->Unit){
//    val sorteo=(1..5).shuffled().last()//"inline" corta los procesos de lambda
//    agregarOtraFuncion(sorteo)
//    println(bienvenida(jugador,sorteo))
//}
//fun mostrarMensaje(sorteo:Int=0){
//    println("El valor del sorteo es: $sorteo")
//}

//fun main(args: Array<String>){
//    simulacion()
//}
//fun simulacion(){
//    val llamada=configuracion()
//    println(llamada("*enviando datos"))
//}
//fun configuracion():(String)->String{
//    val escuela="FES ARAGON"
//    var incremento=10
//    return{nombre:String ->
//        val codigoPostal="34234"
//        incremento+=2
//        println("Se realizo la configuracion")
//        "La cadena que sale es: CP=$codigoPostal incremento=$incremento " +
//                "dato que se mando $nombre variable de acceso $escuela"
//    }
//}

//fun main(args: Array<String>){//Imprimir una linea con letras en mayusccula
//    println("Dame un valor: ")
//    var dato= readLine()?.uppercase()
//    println(dato)
//}

fun main(args: Array<String>){//Imprimir un valor que le estamos dando que puede tratar con datos "null"
    var dato:String?=null
    var longitud: Int? = dato?.length
    println(longitud)
}