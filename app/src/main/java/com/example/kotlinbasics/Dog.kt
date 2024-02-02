package com.example.kotlinbasics

class Dog(name: String) {

    init {
        bark(name)
    }

    fun bark(name: String) {
        println("$name says Woof woof!!")
    }
}