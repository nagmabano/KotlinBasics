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

interface Logger {
    fun log(message: String)
    // Companion object implements the logger interface
    companion object : Logger {
        override fun log(message: String) {
            println("Logger: $message")
        }
    }
}

class SingletonExample private constructor() {
    // companin object used to implement singleton pattern
    companion object {
        val instance: SingletonExample by lazy { SingletonExample() }
    }
}

fun main() {
    // if you declare a companion object inside your class, you can access its members using
    // only the class name as a qualifier.
    var car = Car.createCar("Sedan")
    println(car.model)

    val pi = MathOperations.PI
    println(pi)
    val e = MathOperations.E
    println(e)

    Logger.log("Hello companion object!!")

    val singletonInstance = SingletonExample.instance

}