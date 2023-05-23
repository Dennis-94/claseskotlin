fun main(args: Array<String>) {
// 5.-Ejercicio: Factorial de un número.
    //Solicita al usuario un número entero positivo.
    //Calcula el factorial del número ingresado y muestra el resultado.
    println("Ejercicio Nª5")
    println("Ingrese un numero para calcular su factorial")
    var num2 = readLine()?.toIntOrNull()
    if (num2 != null && num2 >= 0) {
        var factorial = 1
        for (i in 1..num2) {
            factorial *= i
        }
        println("el factorial de $num2 es: $factorial")
    } else {
        println("el numero ingresado no es valido")
    }
}