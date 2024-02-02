package com.example.kotlinbasics

fun main() {

    // creating an object/instance of class Dog
    val daisy = Dog("Daisy", "dwarf poodle", 2)
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} year old")
    println("A year has passed!")
    daisy.age = 3
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} year old")

//    val myBook = Book()
//    println("${myBook.title} was published by ${myBook.author} in the year ${myBook.yearPublished}")
//
//    val customBook = Book("Dune", "terads", 1984)
//    println("${customBook.title} was published by ${customBook.author} in the year ${customBook.yearPublished}")
}