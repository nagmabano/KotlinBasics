package com.example.kotlinbasics

fun main() {
    val obj = "Samsung"
//    if (obj is String) {
//        println(obj.length)
//    }
//
//    if (obj !is String) { // Same as !(obj is String)
//        println("Not a String")
//    } else {
//        println(obj.length)
//    }
    demo(obj)
}

fun demo(x: Any) {
    if (x is String) {
        print(x.length) // x is automatically cast to String
    }
}