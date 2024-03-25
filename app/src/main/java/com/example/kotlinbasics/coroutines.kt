package com.example.kotlinbasics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch { //coroutine builder
        delay(1000) // non-blocking delay - suspending function
        println("World!!")
    }
    println("Hello ")
}