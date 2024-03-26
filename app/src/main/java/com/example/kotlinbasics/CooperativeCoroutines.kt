package com.example.kotlinbasics

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

fun main() = runBlocking {// create a blocking coroutine that runs in the current thread(main)

    println("Main program starts: ${Thread.currentThread().name}") // main thread

    val job: Job = launch(Dispatchers.Default) {// Thread T1 creates a non blocking coroutine
        for (i in 0..500) {
            if (!isActive) {
                return@launch
            }
            print("$i.")
            Thread.sleep(1)
        }
    }
    delay(2) // print few values before we cancel
//    job.cancel()
//    job.join() // waits for coroutine to finish

    job.cancelAndJoin() // replaces cancel and join function

    println("\nMain program ends: ${Thread.currentThread().name}") // main thread

}