fun main(){
    var str:String
    str = "Welcome to Kotlin"

    val name:String = "Mayuko"
    val age:Int = 30
    val GPA:Double = 3.3

    println("Name: $name")
    println("Age: $age")
    println("GPA: $GPA")

    var count = 1
    println("Count: $count")
    count = 19
    println("Count: $count")

    var department:String?
    department = null
    department = "Software department"
    print("Department ${department!!}")
}