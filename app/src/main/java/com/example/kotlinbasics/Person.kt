package com.example.kotlinbasics

class Person constructor(var name: String , var age: Int) {
}

fun main() {
    val person1 = Person("Jhon Doe", 24).also(::println)
    val person2 = Person("Sam", 54).also(::println)
}