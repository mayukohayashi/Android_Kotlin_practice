fun main(){

    println("====Increment====")
    for(i in 0..10 step 2){
        println("Number is $i")
    }

    println("====Decrease====")
    for(i in 10 downTo 1 step 2){
        println("Number is $i")
    }

    println("End App")
}