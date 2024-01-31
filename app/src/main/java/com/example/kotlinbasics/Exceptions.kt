package com.example.kotlinbasics

import java.lang.Exception

fun main() {
    try {
        println("Please enter something")
        val input = readln()
        val a: Int? = try { input.toInt() } catch (e: NumberFormatException) { null }
        println(a)
        throw Exception("Hi there!!")
    }  catch (e: Exception) {
        println(e)
    } finally {
        println("In the finally block!!")
    }
}