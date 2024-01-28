package com.example.kotlinbasics

fun main() {
    println("Enter your age")
    val input = readln()
    val age =input.toInt()

    if(age>=18) {
        println("You can vote")
    } else {
        println("You can't vote")
    }
}