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

class MathOperations {
    // companion objects are used to define constant properties of the class
    companion object {
        const val PI = 3.14159
        const val E = 2.71828
    }
}

fun main() {
    var car = Car.createCar("Sedan")
    println(car.model)

    val pi = MathOperations.PI
    println(pi)
    val e = MathOperations.E
    println(e)

}