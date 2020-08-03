
fun addNumbers(x:Double=0.0, y:Double=0.0):Double {
    val temp = x + y
    return temp
    // println("Add = $temp")
}

fun displayInfo( vararg names:String){
    for(name in names){
        println(name)
    }
}

fun main() {
    var returnSub = addNumbers(3.0, 4.0)
    println("returnSub: $returnSub")

    returnSub = addNumbers(x=6.7, y=0.5)
    println("returnSub: $returnSub")

    returnSub = addNumbers(y=21.8)
    println("returnSub: $returnSub")

    returnSub = addNumbers(7.9)
    println("returnSub: $returnSub")

    displayInfo( names = *arrayOf("Jene", "Sean", "Doly"))
}
