package com.example.kotlinbasics

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() = runBlocking {
        println("Main program starts:  ${Thread.currentThread().name}")

        val jobDeffered: Deferred<Unit> = async { // async returns a deferred object
            // and not the job object. Deferred is a sub type of Job. It is of generic type.
            println("Fake work starts: ${Thread.currentThread().name}") // Thread T1
            mySuspendFunc(1000) //Pretend doing some work
            println("Fake work finished: ${Thread.currentThread().name}") // Either T1 or any of the thread
        }

        // job.cancel() to cancel a coroutine
        jobDeffered.join() // job function will wait for the execution of the job to complete

        println("Main program ends:  ${Thread.currentThread().name}")
    }

suspend fun mySuspendFunc(time: Long) {
    delay(time)
}
