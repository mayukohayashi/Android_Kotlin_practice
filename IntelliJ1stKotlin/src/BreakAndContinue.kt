fun main() {
    println("Continue Example")
    for (number:Int in 1..10) {

        if ( number == 5) {
            continue
        }
        println(number)
    }

    println("Break Example")
    loop@ for (number:Int in 1..10) {
        println(number)

        for (innerLoop:Int in 1..7) {
            println("InnerLoop: $innerLoop")
            if (innerLoop == 6) {
                break@loop // returnにするとmainにもどる
            }
        }
    }
}