package com.example.kotlinbasics

fun main() {
//    loop@ for(i in 1..100) {
//        for(j in 1.. 100) {
//            if(i*5==j){
//                println(j)
//                break@loop
//            }
//        }
//    }

    listOf<Int>(1,2,3,4,5).forEach lit@ {
        if(it == 3) return@lit
        println(it)
    }
}