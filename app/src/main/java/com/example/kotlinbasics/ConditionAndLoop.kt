package com.example.kotlinbasics

fun main() {
    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    var array = arrayOf("a", "b", "c")
    for (i in array.indices) {
        println(array[i])
    }

    for ((index, value) in array.withIndex()){
        println("The element at $index is $value")
    }

}