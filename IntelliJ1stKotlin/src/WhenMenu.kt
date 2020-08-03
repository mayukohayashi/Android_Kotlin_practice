fun main() {
    print("Pick food menu number:")
    val foodID:Int = readLine()!!.toInt()

    when(foodID){
        1 -> {
            print("寿司")
        }

        2 -> {
            println("味噌汁")
        }

        else -> {
            println("please order something")
        }
    }
}