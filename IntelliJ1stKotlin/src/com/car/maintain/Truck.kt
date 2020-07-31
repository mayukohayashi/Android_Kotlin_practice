package com.car.maintain

// Inheritance

// :CartOptionsを継承していると明記
class Truck:CarOptions{

    var subType:String?=null

    constructor(type:String, model:Int, price:Double, milesDrive:Int, owner:String, subType:String)
            // :thisではない
            :super(type, model, price, milesDrive, owner){

        this.subType = subType
    }

    constructor(type:String, model:Int, price:Double, milesDrive:Int, subType:String)
            :super(type, model, price, milesDrive){

        this.subType = subType
    }

    override fun getCarPrice():Double {
        return this.getPrice()!! - (this.milesDrive!!.toDouble() * 10 * 0.8 )
    }

    fun getCarPriceWrapper():Double{
        // super.親クラスを見ている（this.はそのクラス）
        return super.getCarPrice()
    }

    /*
    // ここにはアクセスできない（CarOptions.ktのPriceがPrivateな為）
    // （Protectedであった場合）アクセスはできる
    fun showPrice(){
        println(this.price)
    }
    */
}


fun Truck.getCarPriceWrapper():Double{
    // class内にないのでsuperは使えない
    return this.getCarPrice()
}


fun main() {
    val truck1 = Truck("BMW", 2000, 10000.0, 102, "Hayashi", "Dump")
    println(truck1.model)
    /*
    // privateでもprotectedでもアクセスされない
    println(truck1.price)
     */
    println(truck1.getCarPrice())
    println(truck1.getCarPriceWrapper())

    val truck2 = Truck("Audi", 2010, 30000.0, 10, "Garbage")
    println(truck2.owner)
}