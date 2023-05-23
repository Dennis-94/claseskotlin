fun main(args: Array<String>) {
    // 4-. Ejercicio: Tabla de multiplicar.
    //Solicita al usuario un número entero.
    //Imprime la tabla de multiplicar del número ingresado, desde 1 hasta 10.
    println("Ejercicio Nª4")
    println("Ingrese un numero para generar una tabla de multiplicar")
    var num1 = readLine()?.toInt() ?: 0
    println("la tabla de multiplicar del numero $num1:")
    for (i in 1..10) {
        var resulado2 = num1 * i
        println("$num1 x $i = $resulado2")
    }
}
