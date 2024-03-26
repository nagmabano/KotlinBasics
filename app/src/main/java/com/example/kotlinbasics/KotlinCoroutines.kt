package com.example.kotlinbasics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() {
    println("Main program starts:  ${Thread.currentThread().name}")

    GlobalScope.launch { // create a background thread (worker thread)
        println("Fake work starts: ${Thread.currentThread().name}") // Thread T1
        delay(1000) //Pretend doing some work
        println("Fake work finished: ${Thread.currentThread().name}") // Either T1 or any of the thread
    }

    runBlocking {// creates a coroutine that blocks the main thread
        delay(2000)
    }

    println("Main program ends:  ${Thread.currentThread().name}")
}