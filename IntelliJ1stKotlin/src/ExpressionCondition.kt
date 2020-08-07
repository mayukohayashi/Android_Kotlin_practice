fun main() {

    val isMarried = true
    val GPA = 3.8

    val isQualified:Int = if (isMarried && GPA >= 3.8) 1 else 0

    print (isQualified)

    val isGood:Boolean = when(GPA){
        4.0 -> true
        else -> false
    }

    println (isGood)

}