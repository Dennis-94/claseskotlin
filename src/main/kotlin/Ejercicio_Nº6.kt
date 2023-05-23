fun main(args: Array<String>) {
// 6.-Ejercicio: Suma de números pares.
    //Solicita al usuario un número entero positivo.
    //Calcula la suma de todos los números pares desde 1 hasta el número ingresado y muestra el resultado.
    println("Ejercicio Nª6")
    println("ingrese un numero ")
    var num3 = readLine()?.toIntOrNull() ?: 1
    if (num3 != null && num3 >= 0) {
        var n = 0
        for (i in 1.. num3){
            if ( i % 2 == 0){
                n += i
            }
        }
        println("la suma de los numeros pares desde el 1 hasta $num3 es: $n")
    } else {
        println("Error de ingreso. Ingrese solo numeros enteros")
    }
}