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

//    listOf<Int>(1,2,3,4,5).forEach lit@ {
//        if(it == 3) return@lit
//        println(it)
//    }
//    print("done with explicit label")

//    listOf<Int>(1,2,3,4,5).forEach {
//        if(it == 3) return@forEach
//        println(it)
//    }
//    print("done with implicit label")

//    listOf<Int>(1,2,3,4,5).forEach(fun(it: Int) {
//        if(it == 3) return
//        println(it)
//    })
//    print("done with anonymous function")
    val res = someFunction()
    println(res)
}

fun someFunction(): Int {
    val numbers = listOf(1, 2, 3, 4, 5)

    numbers.forEach {
        if (it == 3) {
            return@forEach  // Using label to specify the return point
        }
        println(it)
    }

    return 10
}