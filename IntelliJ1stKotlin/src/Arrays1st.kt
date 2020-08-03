fun main() {
    /*
    println("Pets App")
    val pet1:String? = readLine()!!.toString()
    val pet2:String? = readLine()!!.toString()
    val pet3:String? = readLine()!!.toString()

    println("Your pets are")
    println("pets1: $pet1")
    println("pets2: $pet2")
    println("pets3: $pet3")
    */
    println("Enter number of Pets")
    val maxSize:Int = readLine()!!.toInt()

    // Write App in Array
    var listOfPets:Array<String> = Array(maxSize){""} //Kotlinならnewいらん

    for (i:Int in 0 until maxSize) {
        println("Enter Pet Name $i")
        listOfPets[i] = readLine()!!.toString()
    }

    for(i:Int in 0 until maxSize) {
        println("Pet $i: ${listOfPets[i]}")
    }

}