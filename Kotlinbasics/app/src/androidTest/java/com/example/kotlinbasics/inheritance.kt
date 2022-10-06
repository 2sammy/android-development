package com.example.kotlinbasics

open class Car(override val maxSpeed:Double, val name:String,val brand:String) : Drivable{
   open var range : Double = 0.00
    // here is the car that we fuel the amount of fuel.
    fun extendRange(amount:Double){
        if(amount > 0)
            range += amount
    }
  open  fun drive(distance: Double){
        print("Drove for $distance km")
    }
override fun drive(): String = "driving"
//    override fun drive():String {
  //     return "driving the interface drive"
    //}

}
interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}


class Electric (maxSpeed: Double, name: String,brand: String, batteryLife:Double) : Car(maxSpeed,name,brand,) {
override var range = batteryLife * 6
    var typeCharger = "type C"

    override fun drive(distance: Double){
        println(" Drove for $distance km on electricity")
    }
    override fun drive():String = "Drove for $range Km on electricity"

    override fun brake() {
        super.brake()
    }
}

fun main(){
    var myCar = Car(349.0,"v8","toyota")
    var myECar = Electric(400.0,"S-model","Tesla",78.00)

    myCar.drive(200.0)
    myECar.drive(200.0)
    myCar.extendRange(200.0)
    myECar.drive()
    myECar.typeCharger = "type c"
}