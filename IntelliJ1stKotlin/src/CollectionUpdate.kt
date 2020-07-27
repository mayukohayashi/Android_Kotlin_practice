/*
mutable: you can update, add some
im-mutable: you can not updatte. or cannot add some
 */

fun main() {
    // 1: list

    // im-mutable
    var listOfImmutable = listOf("Jena", "Liena")
    for (name in listOfImmutable) {
        println(name)
    }

    // mutable
    var listOfMutable = mutableListOf("Jena", "Liena")
    listOfMutable[0] = "Raiz"
    for (name in listOfMutable) {
        println(name)
    }

    var listOfUsersIm = mapOf(1 to "Mayuko", 2 to "Leia")
    var listOfUsersMu = mutableMapOf(1 to "Mayuko", 2 to "Leia")

}