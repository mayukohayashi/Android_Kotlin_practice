fun main(){
    println("Enter Name:")
    val name:String = readLine()!!.toString()
    println("Enter Age:")
    val age:Int = readLine()!!.toInt()
    println("Enter GPA:")
    val gpa:Double = readLine()!!.toDouble()

    println("Name: $name")
    println("Age: $age")
    println("GPA: $gpa")
}