fun main(args: Array<String>) {
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
}