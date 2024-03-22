package com.example.kotlinbasics

import java.lang.AssertionError

class MyClass{

    private var _table: Map<String, Int>? = null
    var table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap()
            }
            return _table ?: throw AssertionError("Null")
        }
        set(value) {
            _table = value
        }

    var counter = 0
        set(value) {
            if (value >= 0){
                field = value  // Backing field
            }
        }
}

fun main() {
    val count1 = MyClass()
    count1.counter = -2
    println(count1.counter)

    count1.counter = 5
    count1.table = mapOf("apple" to 4)
    println(count1.table["apple"])


}