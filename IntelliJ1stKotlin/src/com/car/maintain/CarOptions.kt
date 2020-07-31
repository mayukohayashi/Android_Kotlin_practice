package com.car.maintain

// About Constructor

// 継承させるためopenとする（Public的なやつ？）
open class CarOptions(){

    var type:String?=null
    var model:Int?=null
    // アクセスできない
    // もし`protected`にした場合、アクセスはできる
    private var price:Double?=null
    var milesDrive:Int?=0
    var owner:String?=null

    constructor(type:String, model:Int, price:Double, milesDrive:Int, owner:String):this(){
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
    }

    constructor(type:String, model:Int, price:Double, milesDrive:Int):this(){
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
    }

    fun getCarPrice():Double {
        return this.price!! - (this.milesDrive!!.toDouble() * 10)
    }


}

fun main() {
    val car1 = CarOptions("BMW", 2000, 10000.0, 102, "Hayashi")
    println(car1.model)
    println(car1.getCarPrice())

    val car2 = CarOptions("Audi", 2010, 30000.0, 10)
    println(car2.owner)
}