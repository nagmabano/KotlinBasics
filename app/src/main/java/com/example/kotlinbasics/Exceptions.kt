package com.example.kotlinbasics

import java.lang.Exception

fun main() {
    try {
        throw Exception("Hi there!!")
    } catch (e: Exception) {
        println(e)
    } finally {
        println("In the finally block!!")
    }
}