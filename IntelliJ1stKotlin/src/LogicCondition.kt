fun main() {
    /*
    >
    <
    >=
    <=
    !=
    ==
And Gate (&&)
    True && True = True
    True && False = False
    False && True = False
    False && False = False

OR Gate (||)
    True && True = True
    True && False = True
    False && True = True
    False && False = False

Not gate (!)
    True = False
    False = True
     */

    var condition: Boolean = (3 < 2)
    println(condition)

    val number = 11
    println(number >= 1 && number <= 10)

    println(number >= 1 || number <= 10)


    val age = 23
    println( age >= 60 || age <= 18)
    println( !(age==22))

}