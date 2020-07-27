package com.car.maintain

class Car(val type:String, val model:Int, val price:Double,
          val milesDrive:Int, val owner:String){
    init {
        println("Object class is created!")
    }

    fun getCarPrice():Double {
        return this.price - (this.milesDrive.toDouble() * 10)
    }
}

fun main() {
    val car1 = Car("BMW", 2000, 10000.0, 102, "Hayashi")
    println(car1.model)
    println(car1.getCarPrice())

    val car2 = Car("Audi", 2010, 30000.0, 10, "Test man")
    println(car2.owner)

    // list of car
    val listOfCar = arrayListOf<Car>()
    listOfCar.add(Car("BMW", 2000, 10000.0, 102, "Hayashi"))
    listOfCar.add(Car("Audi", 2010, 30000.0, 10, "Test man"))

    for(car in listOfCar) {
        println("==========")
        println(car.owner)
        println(car.getCarPrice())
    }
}