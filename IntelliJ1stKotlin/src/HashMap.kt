fun main() {
    var listOfUsers = HashMap<Int, String>()
    listOfUsers[123] = "mayuko"
    listOfUsers[321] = "test"
    listOfUsers[313] = "test1"
    println("Print ID 123: ${listOfUsers[123]}")

    for (key:Int in listOfUsers.keys)
        println("$key: ${listOfUsers[key]}")

}