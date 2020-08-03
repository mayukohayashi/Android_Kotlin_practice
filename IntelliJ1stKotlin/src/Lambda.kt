val sum = {number1:Int, number2:Int ->
    number1 + number2
}

fun main() {
    val addNumbers = sum(3, 4)
    println("Add numbers : $addNumbers")

    println("List of numbers")
    val listOfNumbers = listOf(10, 15, 43, 32, 34, 3232)

    /* normal for Loop
    for (number in listOfNumbers){
        println(number)
    }
    */

    // Lambda
    listOfNumbers.forEach{number ->
        println(number)
    }
}