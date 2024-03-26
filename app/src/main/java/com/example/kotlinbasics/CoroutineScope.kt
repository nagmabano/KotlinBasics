package com.example.kotlinbasics

import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    println("runBlocking: $this")

    println("Some cde")

    launch {
        println("launch: $this")
        launch {
            println("child: $this")
        }
    }

    val b = async {
        println("async: $this")
    }
}