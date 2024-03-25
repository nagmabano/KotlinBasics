package com.example.kotlinbasics

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch {
        delay(1000L)
        println("World!")
    }

    println("hello")
    job.join()
    println("Done")

//    doWorld()
//    println("done")
//    launch { //coroutine builder
//        doWorld() // extract function refactoring
//    }
//    println("Hello ")
}

suspend fun doWorld() = coroutineScope {
    launch {
        delay(5000L) // Calling a suspend function from within a suspend function. A suspend function can be called either
        // through a coroutine or through a suspend function. Here delay is a suspend function
        // called from a suspend function in a coroutine scope
        println("World!")
    }
    launch {
        delay(1000L)
        println("Hello1!")
    }

    println("Hello")

}
