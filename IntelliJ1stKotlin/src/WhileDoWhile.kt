fun main(){

    println("For Loop")
    for (i:Int in 1..10 step 1){
        println("Counter $i")
    }

    println("While Loop")

    var i = 1
    while (i <= 10) {
        println("Counter $i")
        i += 1
    }

    println("Do While Loop")
    i = 1
    do{
        println("Counter $i")
        i += 1
    } while (i <= 10)
}