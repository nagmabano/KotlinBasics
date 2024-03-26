package com.example.kotlinbasics

import android.text.format.Time
import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import java.lang.Exception

fun main() = runBlocking {
    println("\nMain program starts: ${Thread.currentThread().name}")

    withTimeout(2000) {
        try {
            for (i in 0..500) {
                println("$i.")
                delay(500)
            }
        } catch (ex: TimeoutCancellationException) {
            println("Exception handled safely: $ex")
        } finally {
            println("Close resources in finally!!")
        }

    }

    println("\nMain program ends: ${Thread.currentThread().name}")
}