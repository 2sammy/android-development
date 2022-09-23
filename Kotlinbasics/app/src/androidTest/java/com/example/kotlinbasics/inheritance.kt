package com.example.kotlinbasics

open class Car(val name:String,val brand:String) {
   open var range : Double = 0.00
    // here is the car that we fuel the amount of fuel.
    fun extendRange(amount:Double){
        if(amount > 0)
            range += amount
    }
  open  fun drive(distance: Double){
        print("Drove for $distance km")
    }

    //fun drive() {
      //  TODO("Not yet implemented")
    //}

}
interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}


class Electric (name: String,brand: String, batteryLife:Double) : Car(name,brand) {
override var range = batteryLife * 6
    var typeCharger = "type C"

    override fun drive(distance: Double){
        println(" Drove for $distance km on electricity")
    }
    fun drive(){
        println("Drove for $range Km on electricity")
    }
}

fun main(){
    var myCar = Car("v8","toyota")
    var myECar = Electric("S-model","Tesla",78.00)

    myCar.drive(200.0)
    myECar.drive(200.0)
    myCar.extendRange(200.0)
    myECar.drive()
    myECar.typeCharger = "type c"
}