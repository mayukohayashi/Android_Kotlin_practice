fun add(number1:Int, number2:Int):Int{
    return number1 + number2
}

fun add(number1:Int, number2:Int, number3:Int):Int{
    return number1 + number2 + number3
}

fun add(number1:Int, number2:Int, number3:Int, number4:Int):Int{
    return number1 + number2 + number3 + number4
}

fun main() {
    println( add(3,5))
    println( add(4,3,5))
    println( add(2,5,4,3))
}
// 同じ名前のFunctionに上書きしまくる