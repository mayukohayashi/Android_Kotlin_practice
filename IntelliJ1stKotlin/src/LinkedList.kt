import java.util.*

fun main() {
    println("Enter number of Pets")
    val maxSize:Int = readLine()!!.toInt()

    // Write App in Array
    var listOfPets = LinkedList<String>()

    for (i:Int in 0 until maxSize) {
        println("Enter Pet Name $i")
        listOfPets.add(readLine()!!.toString())
    }

    for(i:Int in 0 until listOfPets.size) {
        println("Pet $i: ${listOfPets[i]}")
    }

}