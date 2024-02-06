@file:JvmName("DogKt")

package com.example.kotlinbasics

open class Animal(val name:String) {
    open fun eat() {
        println("$name is eating!!")
    }
}

class Cat(name: String, val breed:String): Animal(name) {
    fun bark() {
        println("$name meow's!!")
        super.eat()
        this.eat()
    }
    override fun eat() {
        println("Eating in this method!!")
    }
}

fun main() {
    val myCat = Cat("Lucy", "persian")
    println(myCat.name)
    myCat.bark()
//    myCat.eat()
}