package com.example.kotlinbasics

data class Person(var name: String , var age: Int) {
}

class InitOrderDemo(name: String) {
    val firstPropery = "First property: $name".also(::println)
    init {
        println("First initializer block that prints $name") //Primary constructor parameters can be
                                                            // used in the initializer blocks.
    }
    val secondProperty = "Second Property: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }
}

class Customer(name: String) {
    val customerKey = name.uppercase() // Primary constructor parameters can also be used in property
                                        // initializers declared in the class body
}

// decleration with default values
class Persons(val firstName: String, val lastName: String, var isEmployed: Boolean = true)


fun main() {
    val person1 = Person("Jhon Doe", 24).also(::println)
    val person2 = Person("Sam", 54).also(::println)
    InitOrderDemo("Hana")
}