fun main() {
    for (userID:Int in 1..2){

        println("$userID - Your name:")
        val name:String = readLine()!!.toString()

        println("You live:")
        val livePlace:String = readLine()!!.toString()

        var petName:String? = "" //空に
        println("Enter number of Pets:")
        val petsCount:Int = readLine()!!.toInt()
        for (petID:Int in 1..petsCount){ //petsCountの数だけ繰り返す
            println("Enter Pet $petID:")
            petName = petName + readLine()!!.toString() + ","
        }

        println("======= User Info ======")
        println("Name: $name")
        println("City: $livePlace")
        println("Pet name: $petName")

    }
}