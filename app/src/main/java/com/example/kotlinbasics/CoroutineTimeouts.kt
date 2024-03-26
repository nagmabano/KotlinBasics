package com.example.kotlinbasics

import android.text.format.Time
import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull
import java.lang.Exception

fun main() = runBlocking {
    println("\nMain program starts: ${Thread.currentThread().name}")

    val result:String? = withTimeoutOrNull(20000) {
        for (i in 0..500) {
            println("$i.")
            delay(5)
        }
        "I am done"
    }
    println(result)

    println("\nMain program ends: ${Thread.currentThread().name}")
}