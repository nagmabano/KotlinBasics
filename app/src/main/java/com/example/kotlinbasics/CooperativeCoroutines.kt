package com.example.kotlinbasics

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {// create a blocking coroutine that runs in the current thread(main)

    println("Main program starts: ${Thread.currentThread().name}") // main thread

    val job: Job = launch {// Thread T1 creates a non blocking coroutine
        for (i in 0..500) {
            print("$i.")
            Thread.sleep(50)
        }
    }
    delay(200)
    job.cancel()
    job.join() // waits for coroutine to finish

    println("\nMain program ends: ${Thread.currentThread().name}") // main thread

}