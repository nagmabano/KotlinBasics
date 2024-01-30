package com.example.kotlinbasics

fun main() {
    println("Please enter a number")
     val inputString = readln().toInt()
     val multiplier = 5

//    println("Result of multiplication is " + inputString*multiplier)

    println("What operation do you want to perform?")
    val operation = readln()
        when (operation) {
            "+" -> println(inputString + multiplier)
            "-" -> println(inputString - multiplier)
            "*" -> println(inputString * multiplier)
            "/" -> println(inputString / multiplier)
            else -> println("Not supported operation")
        }

}