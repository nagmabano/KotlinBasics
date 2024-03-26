package com.example.kotlinbasics

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking{

    println("Main program starts: ${Thread.currentThread().name}")

    val time = measureTimeMillis {
        val one = getMessageOne()
        val two = getMessageTwo()
        println("The entire message is: ${one + two}")
    }

    println("Completed in time $time ms")

    println("Main program ends: ${Thread.currentThread().name}")

}

suspend fun getMessageOne(): String {
    delay(1000L) // pretend to do some work
    return "Hello"
}

suspend fun getMessageTwo(): String {
    delay(1000L) // pretend to do some work
    return " World!"
}