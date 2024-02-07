package com.example.kotlinbasics

interface Flower {
    fun color(){
        println("Interface Flower")
    }
}

open class Rose {
    open fun color(){
        println("Red color")
    }
}

class PinkRose: Rose(), Flower {
    override fun color() {
        super<Rose>.color()
        super<Flower>.color()
        println("Pink color")
    }
}

fun main() {
    var flr = PinkRose()
    flr.color()
}