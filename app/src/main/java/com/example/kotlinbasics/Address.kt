package com.example.kotlinbasics

class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

fun copyAddress(address: Address): Address {
    val result = Address() // there's no 'new' keyword in Kotlin
    result.name = address.name // accessors are called
    result.street = address.street
    // ...
    return result
}

class Rectangle1(val width: Int, val height: Int) {
    var nwidth: Int = 10
        set(value) {
            if (value <10) {
                nwidth = 5
            } else {
                nwidth = 7
            }
            field = value
        }
    val area: Int // property type is optional since it can be inferred from the getter's return type
        get() = this.nwidth * this.height
}

fun main() {
    val originalAddress = Address()
    val copiedAddress = copyAddress(originalAddress)

    println("Original Address: $originalAddress")
    println("Copied Address: $copiedAddress")

    val adr = Address()
    println("${adr.name} ${adr.city} ${adr.state} ${adr.zip}")
    val result = copyAddress((adr))
    println("${result.name} ${result.city} ${result.state} ${result.zip}")

    val rectangle = Rectangle1(3, 4)
    println("Width=${rectangle.width}, height=${rectangle.height}, area=${rectangle.area}")
}