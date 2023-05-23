fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val name: String ="Tony"
    var num1: Int =5
    var num2: Int =6
    var suma=num1+num2
    println ("La suma es:${suma}")
    var num3=5054
    var num4=847
    var resta=num3-num4
    println ("La resta es:${resta}")
    var num5=9054
    var num6=8
    var multiplicacion=num5 * num6
    var division = multiplicacion/ num6
    var modulo =num5% num6
    println ("La multiplicacion es:${multiplicacion}")
    println ("La division es:${division}")
    println ("La modulo es:${modulo}")
    var x = 1
    var y =21
        for (i in x .. y){
            if (i%2==0){

                println("es un numero par:${i}")
            }else {
                println("es un numero impar ${i}")
            }
        }
    var num=5
    var factorial=1
    if (num>1){
        for (i in 1 .. num){
            factorial*=i
        }
    }
    println("Factorial es: ${factorial}")

}