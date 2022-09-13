fun main() {
    val patron = """[0-9]{8}+[A-Z]""".toRegex()
    // patron alternativo para la tarjeta """[0-9]{4}+[0-9]{4}+-[0-9]{4}+-[0-9]{4}"""
    do {
        println("Introduce tu DNI en mayúscula")
        val prueba = readln()
        var dni = prueba.matches(patron)
    }while(!dni)
}