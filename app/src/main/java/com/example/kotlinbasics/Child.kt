package com.example.kotlinbasics

class Child() {
    var name:String =""
    var age: Int = 0

    // Primary Constructor
    constructor(name:String, age:Int) : this() {
        this.name = name
        this.age = age
    }

    // Secondary Constructor
    constructor(name:String) : this(name, 0)
    // Secondary Constructor
    constructor(age: Int): this("Unknown", age)
}

fun main() {
    val child1 = Child("Ram", 5)
    val child2 = Child("Jhon")
    val child3 = Child(6)
    println(child1.name + " " +child1.age)
    println(child2.name + " " +child2.age)
    println(child3.name + " " +child3.age)
}