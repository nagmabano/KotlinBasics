package com.example.kotlinbasics

class MyClass{
    var counter = 0
        set(value) {
            if (value >= 0){
                field = value  // Backing field
            }
        }
}

fun main() {
    val count1 = MyClass()
    count1.counter = -2
    println(count1.counter)

    count1.counter = 5
    println(count1.counter)
}