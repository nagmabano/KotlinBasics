package com.example.kotlinbasics

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlinx.coroutines.yield
import java.lang.Exception

fun main() = runBlocking {// create a blocking coroutine that runs in the current thread(main)

    println("Main program starts: ${Thread.currentThread().name}") // main thread

    val job: Job = launch(Dispatchers.Default) {// Thread T1 creates a non blocking coroutine
        try {
            for (i in 0..500) {
                print("$i.")
                delay(10)
            }
        } catch (e: CancellationException) {
            println("\nException caught safely: $e ")
        } finally {
            withContext(NonCancellable){
                delay(200) // Generally we don't use suspending function in finally,
                // it throws an exception and the code in finally is not executed
                println("\nClose resources in finally")
            }
        }

    }
    delay(200) // print few values before we cancel

    job.cancel(CancellationException("My own crash message")) // sending your own cancellation message
    job.join()
    println("\nMain program ends: ${Thread.currentThread().name}") // main thread

}