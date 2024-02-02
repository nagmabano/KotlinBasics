package com.example.kotlinbasics

fun main() {
    val numbers = mutableListOf(1,2,3,4,5)

    for(num in 0 until numbers.size) {
        numbers[num] = numbers[num] * 2
    }
    println(numbers)
}