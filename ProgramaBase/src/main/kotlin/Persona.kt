import java.io.File

open class Persona(var nombre:String="Sin nombre", var edad:Int=0) {//jueves
    lateinit var despues:String
    val descripcion by lazy {
        println("Se ejecuta")
        obtenerDescripcion()}
    init {
        this.nombre=nombre.uppercase()
        this.edad=this.edad*2
        despues="Inicio despues"
    }
    constructor(nombre:String):this(nombre.replaceAfter('e',"*"),12){
        ocuparDespues()
    }
    private fun ocuparDespues(){
        if(::despues.isInitialized){
            println("Se inicio despues ($despues)")
        }
    }
    private fun obtenerDescripcion()=File("descripcion.txt")
        .readText()
        .split("\n")
        .shuffled()
        .first()
    override fun toString(): String {
        return "Hola $nombre ya tienes $edad años"
    }
}

//class Persona(var nombre:String, var edad:Int) {
//    lateinit var despues:String
//    val descripcion by lazy {
//        println("Se ejecuta")
//        obtenerDescripcion()}
//    init {
//        this.nombre=nombre.uppercase()
//        this.edad=this.edad*2
//        despues="Inicio despues"
//    }
//    constructor(nombre:String):this(nombre.replaceAfter('e',"*"),12){
//        ocuparDespues()
//    }
//    private fun ocuparDespues(){
//        if(::despues.isInitialized){
//            println("Se inicio despues ($despues)")
//        }
//    }
//    private fun obtenerDescripcion()= File("descripcion.txt")
//        .readText()
//        .split("\n")
//        .shuffled()
//        .first()
//    override fun toString(): String {
//        return "Hola $nombre ya tienes $edad años"
//    }
