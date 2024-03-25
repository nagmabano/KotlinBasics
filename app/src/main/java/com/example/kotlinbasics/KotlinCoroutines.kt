package com.example.kotlinbasics

import kotlin.concurrent.thread

fun main() {
    println("Main program starts:  ${Thread.currentThread().name}")

    thread { // create a background thread (worker thread)
        println("Fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(1000) //Pretend doing some work
        println("Fake work finished: ${Thread.currentThread().name}")
    }

    println("Main program ends:  ${Thread.currentThread().name}")
}