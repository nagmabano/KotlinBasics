package com.example.kotlinbasics

data class Person(var name: String , var age: Int) {
}

class InitOrderDemo(name: String) {
    val firstPropery = "First property: $name".also(::println)
    init {
        println("First initializer block that prints $name")
    }
    val secondProperty = "Second Property: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }
}

fun main() {
    val person1 = Person("Jhon Doe", 24).also(::println)
    val person2 = Person("Sam", 54).also(::println)
    InitOrderDemo("Hana")
}