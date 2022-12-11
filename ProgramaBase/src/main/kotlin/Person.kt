class Person (var nombre:String,var edad:Int) {//Jueves
        lateinit var despues:String
        init {
            println("1")
            this.nombre=nombre.uppercase()
            this.edad=this.edad*2
            despues="Inicio despues"
        }
        constructor(nombre:String):this(nombre.replaceAfter('e',"*"),12){
            println("2")
            ocuparDespues()
        }
        private fun ocuparDespues(){
            if(::despues.isInitialized){
                println("3")
                println("Se inicio despues ($despues)")
            }
        }
        override fun toString(): String {
            return "Hola $nombre ya tienes $edad años"
        }
//        var nombre:String=""
//            get() = field.uppercase()
//            set(value) {
//                field=value.replaceAfter(' ',"")
//            }
//        var edad:Int=0
//        override fun toString(): String {
//            return "Hola $nombre ya tienes $edad años"
//        }
    }