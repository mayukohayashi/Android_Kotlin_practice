package com.car.maintain

data class Person(val name:String, val age:Int, val gender:String)

fun main() {

    val person = Person("Mayuko", 22, "female")
    println("person.name: ${person.name}")
    println("person.age: ${person.age}")
    println("person.gender: ${person.gender}")

}