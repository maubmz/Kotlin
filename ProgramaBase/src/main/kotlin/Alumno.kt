data class Alumno(var matricula: String = "00") : Persona() {//jueves
    override fun toString(): String {
        return "Alumno(matricula='$matricula') " + super.toString()
    }
}
