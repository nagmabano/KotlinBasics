package com.example.kotlinbasics

fun main() {
    data class Person(val name: String?, val age: Int)

// Creating an instance of the Person data class
    val person = Person(null, 25)

//    var s = person.name ?: throw IllegalArgumentException("Name required")
//    println(s)

    // throw is of type nothing

    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }

    // you can use Nothing to mark a function that never returns

    val s = person.name ?: fail("Name is required")
    println(s)
}