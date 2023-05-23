fun main(args: Array<String>) {
    //1:- Ejercicio: Números pares e impares.
//Solicita al usuario un número entero.
//Imprime todos los números pares desde 2 hasta el número ingresado.
//Imprime todos los números impares desde 1 hasta el número ingresado.
    println("Ejercicio Nº 1")
    println("Ingrese un numero entero  :")
    var entrada = readLine()?.toIntOrNull() ?: 1
    if (entrada != null) {
        var i = 2
        println("numero pares desde 2 hasta :$entrada")
        while (i <= entrada) {
            print(" $i")
            i += 2
        }
        println("")
        println("")
        var j = 1
        println("numero impares desde 1 hasta $entrada")
        while (j <= entrada) {
            print(" $j")
            j += 2
        }

    } else {
        println("Error de ingreso. Ingrese solo numeros enteros")
    }
}