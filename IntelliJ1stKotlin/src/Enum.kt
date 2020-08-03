enum class Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

fun main(args:Array<String>) {
    var userDirection = Direction.SOUTH

    if (userDirection == Direction.NORTH) {
        println("went to the North")
    } else {
        println("Do not know where")
    }
}