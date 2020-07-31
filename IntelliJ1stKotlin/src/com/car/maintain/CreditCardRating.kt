package com.car.maintain

interface CreditCard {
    val cardNumber:String

    fun score(age:Int)
}

class MasterCard(override val cardNumber: String) :CreditCard {

    override fun score(age: Int) {
        if (age > 50) {
            println("Negative")
        } else {
            println("Positive")
        }
    }
}

class Visa(override val cardNumber: String) :CreditCard {

    override fun score(age: Int) {
        if (age > 60) {
            println("Negative")
        } else {
            println("Positive")
        }
    }
}

fun main() {
    val visa = Visa("9279382781297312638292")
    visa.score(70)

    val masterCard = MasterCard("202372047282928")
    masterCard.score(73)
}