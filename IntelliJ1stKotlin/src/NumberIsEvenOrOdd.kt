fun main(args:Array<String>) {
    print("enter Number:")
    var input = readLine()!!.toInt()
    if (input % 2 == 0)
        println(" number is even")
    else
        println(" number is odd")

}