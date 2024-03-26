package com.example.kotlinbasics

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking{

    println("Main program starts: ${Thread.currentThread().name}")

    val one: Deferred<String> = async(start = CoroutineStart.LAZY) { getMessageOne() }
    val two: Deferred<String> = async(start = CoroutineStart.LAZY) { getMessageTwo() }
    println("The entire message is: ${one.await() + two.await()}")

    println("Main program ends: ${Thread.currentThread().name}")

}

suspend fun getMessageOne(): String {
    delay(1000L) // pretend to do some work
    println("After working in getMessageOne()")
    return "Hello"
}

suspend fun getMessageTwo(): String {
    delay(1000L) // pretend to do some work
    println("After working in getMessageTwo()")
    return " World!"
}