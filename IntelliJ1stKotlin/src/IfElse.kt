fun main() {
    print("Enter your age")
    val age:Int = readLine()!!.toInt()

    if(age >= 20) {
        println("you can enter this web site")
    } else if (age in 15..19) {
        println("惜しい")
    } else if (age <= 14) {
        println("go home")
    }

}