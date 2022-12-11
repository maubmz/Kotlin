class MemoriaUsb (val datoDos:String="") {
    //jueves
    var marca: String = "Sin info"
        get() {
            return field.uppercase()
        }
        private set(value) {
            field = value.replaceAfter(' ', "*")
        }

    constructor(dato: String, datoTres: Int) : this(dato) {
        marca = dato
        println("Entrada 1$datoTres")
    }

    init {//Primero inicia el constructor primario por ser el primero despues los secundarios
        println("Entrada 2")
        println(marca)
        marca = "Kingston"
        println(marca)
    }
}
