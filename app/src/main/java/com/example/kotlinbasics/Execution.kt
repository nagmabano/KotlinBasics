package com.example.kotlinbasics

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking{

    println("Main program starts: ${Thread.currentThread().name}")

    val time = measureTimeMillis {
        val one: Deferred<String> = async { getMessageOne() }
        val two: Deferred<String> = async { getMessageTwo() }
        println("The entire message is: ${one.await() + two.await()}")
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