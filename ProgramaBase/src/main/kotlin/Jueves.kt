data class Jueves(var nombre:String, var edad:Int){//jueves

init{
    this.nombre=nombre.uppercase()
    this.edad=this.edad*2
}
    constructor(nombre: String):this(nombre.replaceAfter('e',"*"),12)
    override fun toString():String{
        return "Hola $nombre ya tienes $edad years"
    }
}//los constructores deben de pasar sobre el constructor primario

fun main(args: Array<String>){
    val jueves=Jueves("Pedro")
    println(jueves)

}