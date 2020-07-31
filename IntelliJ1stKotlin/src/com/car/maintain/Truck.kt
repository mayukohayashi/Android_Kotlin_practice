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
}

fun main() {
    val truck1 = Truck("BMW", 2000, 10000.0, 102, "Hayashi", "Dump")
    println(truck1.model)
    println(truck1.getCarPrice())

    val truck2 = Truck("Audi", 2010, 30000.0, 10, "Garbage")
    println(truck2.owner)
}