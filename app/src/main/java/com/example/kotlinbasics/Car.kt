package com.example.kotlinbasics

class Car private constructor(val model:String){
    // Here the companion object provides a factory method (createCar) for creating instances of the Car class.
    // The actual constructor of Car is marked as private, and the companion object is responsible for creating instances
    companion object {
        fun createCar(model: String): Car {
            return Car(model)
        }
    }
}

fun main() {
    var car = Car.createCar("Sedan")
    println(car.model)
}