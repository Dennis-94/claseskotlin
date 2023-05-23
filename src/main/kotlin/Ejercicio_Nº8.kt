fun main(args: Array<String>) {
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