package com.example.kotlinbasics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch { //coroutine builder
        doWorld() // extract function refactoring
    }
    println("Hello ")
}

suspend fun doWorld() {
    delay(5000) // Calling a suspend function from within a suspend function. A suspend function can be called either
                        // through a coroutine or through a suspend function. Here delay is a suspend function
                        // called from a suspend function in a coroutine scope
    println("World!")
}
