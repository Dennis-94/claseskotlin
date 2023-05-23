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
    println("")
    println("")
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
    println("")
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
    println("")
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
    println("")
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
    println("")
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
    println("")
    // 7.-Calcular los primeros n, número de una serie fibonacci: ejemplo los 10 primeros: 1,1,2,3,5,8,13,21,34,55
println("Ejercicio Nª7")
    println(" Calcular los primeros n, número de una serie fibonacci")
    println("ingrese un numero")
    var m = readLine()?.toIntOrNull()
    if (m != null && m > 0){
        println(" los primeros $m numeros de la serie Fibonacci son;")
        var a=0
        var b = 1
        for ( i in 1.. m){
            print(" $b - ")
        var suma = a + b
        a = b
        b= suma
    }
}else {
    println("error el valor ingresado no es valido")
}
    println("")
   // Ejercicio: Números primos en un rango.
    //Solicita al usuario dos números enteros, inicio y fin, donde inicio es menor que fin.
   // Imprime todos los números primos en el rango desde inicio hasta fin.
    println("Ejercicio Nª 8 numeros primos en un rango")
    println("ingrese el numero de inicio ")
    var inicio = readLine()?.toIntOrNull()
    println("ingrese el numero de fin")
    var fin = readLine()?.toIntOrNull()
    if (inicio != null && fin != null && inicio < fin){
        println("numeros primos en el rango desde $inicio hasta $fin:")
        for (valor in inicio..fin){
            var primo = true
            if (valor <= 1){
                primo = false
            }else {
                var i = 2
                while (i < valor) {
                    if (valor % i == 0) {
                        primo = false
                        break
                    }
                    i++
                }
            }
            if (primo){
                println(valor)
            }
        }
    } else {
        println("los numeros ingresados no son validos")
    }
}


