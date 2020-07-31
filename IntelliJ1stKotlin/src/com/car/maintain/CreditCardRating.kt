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

// Delegate: clientはMasterCardでもVisaでもどちらでも対応できる
class PayPal(client:CreditCard): CreditCard by client {

    fun print(){
        println(this.cardNumber)
    }
}

fun main() {
    val visa = Visa("9279382781297312638292")
    visa.score(70)

    val masterCard = MasterCard("202372047282928")
    masterCard.score(73)

    // Delegate使ったPaypal呼び出す
    val payPalVisa = PayPal(visa)
    println("card number Paypal: ${payPalVisa.cardNumber}")
    payPalVisa.print()

    val payPalMasterCard = PayPal(masterCard)
    println("card number Paypal: ${payPalMasterCard.cardNumber}")
    payPalMasterCard.print()
}