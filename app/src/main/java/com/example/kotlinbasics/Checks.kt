package com.example.kotlinbasics

import java.util.ArrayList

fun main() {
//    val obj = intArrayOf(2,2)
//    if (obj is String) {
//        println(obj.length)
//    }
//
//    if (obj !is String) { // Same as !(obj is String)
//        println("Not a String")
//    } else {
//        println(obj.length)
//    }
    demo (1)
    demo("String")
    demo(intArrayOf(2,2))
}

fun demo(x: Any) {
//    if (x is String) {
//        print(x.length) // x is automatically cast to String
//    }
    when (x) {
        is Int -> println(x + 1)
        is String -> println(x.length)
        is IntArray -> println(x.sum())
    }
}