fun main(){
    println("Enter number1: ")
    val number1:Double = readLine()!!.toDouble()
    println("Enter number2: ")
    val number2:Double = readLine()!!.toDouble()

    val sum:Double = number1 + number2
    println("sum: $sum")

    val sub:Double = number1 - number2
    println("sub: $sub")

    val mul:Double = number1 * number2
    println("mul: $mul")

    val div:Double = number1 / number2
    println("div: $div")
}