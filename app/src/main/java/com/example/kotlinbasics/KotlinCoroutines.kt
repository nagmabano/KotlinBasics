package com.example.kotlinbasics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() = runBlocking {
        println("Main program starts:  ${Thread.currentThread().name}")

        val job:Job = async { // Thread: main, since nonBlocking runs on the main thread and
            // launch will run on the local scope so it will also run on the main thread
            println("Fake work starts: ${Thread.currentThread().name}") // Thread T1
            mySuspendFunc(1000) //Pretend doing some work
            println("Fake work finished: ${Thread.currentThread().name}") // Either T1 or any of the thread
        }

        // job.cancel() to cancel a coroutine
        job.join() // job function will wait for the execution of the job to complete

        println("Main program ends:  ${Thread.currentThread().name}")
    }

suspend fun mySuspendFunc(time: Long) {
    delay(time)
}
