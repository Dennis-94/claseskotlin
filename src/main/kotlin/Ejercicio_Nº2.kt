fun main(args: Array<String>) {
    //2.- Ejercicio: Calculadora simple.
    //Solicita al usuario dos números enteros y un operador (+, -, *, /).
    //Realiza la operación y muestra el resultado.
    println("Ejercicio Nª 2")
    println("ingrese 2 numeros y un operador (+,-,*,/)")
    println("ingrese el primer numero:")
    var x = readLine()?.toIntOrNull() ?: 1
    println("ingrese el segundo numero:")
    var y = readLine()?.toIntOrNull() ?: 1
    println("ingrese  un operador")
    var z = readLine()
    if (x != null && y != null && z != null) {
        var resultado = if (z == "+") {
            x + y
        } else if (z == "-") {
            x - y
        } else if (z == "*") {
            x * y
        } else if (z == "/") {
            if (y != 0) {
                x / y
            } else {
                println("Error division por cero")
            }
        } else {
            println("Error de ingreso el operador es invalido")
        }
        println("El resultado es: $resultado")
    }
}