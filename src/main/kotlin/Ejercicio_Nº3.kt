fun main(args: Array<String>) {
//3.- Ejercicio: Números primos.
    //Solicita al usuario un número entero.
    // Determina si el número ingresado es primo o no.
    println("Ejercicio Nª3")
    println("Ingrese un numero para saber si es primo o no")
    println("ingrese el numero")
    var numero = readLine()?.toIntOrNull() ?: 1
    var a = 1
    var contador = 0
    for (a in 1..numero) {
        if (numero % a == 0) {
            contador++
        }
    }
    if (contador <= 2) {
        println("el numero $numero, es primo")
    } else {
        println("el numero $numero, no es primo")
    }
}