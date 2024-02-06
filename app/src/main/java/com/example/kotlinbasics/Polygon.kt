package com.example.kotlinbasics

abstract class Polygon {
    // abstract member does not have a implementation in its class
    abstract fun draw()
    abstract fun paint()
    fun poly() {
        println("I am a polygon")
    }
}

class Rectangle: Polygon() {
    override fun draw() {
        println("Draw Rectangle")
    }

    override fun paint() {
        println("Paint Rectangle")
    }
}

fun main() {
    val s = Rectangle()
    s.draw()
    s.paint()
    s.poly()



}