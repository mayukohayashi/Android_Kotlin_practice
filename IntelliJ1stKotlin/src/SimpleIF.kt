fun main() {

    print("Enter your age")
    val age:Int = readLine()!!.toInt()

    if (age < 20) {
       println("You need to ask parents to play this game")
    }

    if (age >= 20) {
        println("Enjoy!")
    }
}