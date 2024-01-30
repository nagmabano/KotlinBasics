package com.example.kotlinbasics

fun main() {
    val obj = "Sam"
    if (obj is String) {
        println(obj.length)
    }

    if (obj !is String) { // Same as !(obj is String)
        println("Not a String")
    } else {
        println(obj.length)
    }
}

