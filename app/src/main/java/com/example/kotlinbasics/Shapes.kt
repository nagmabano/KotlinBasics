package com.example.kotlinbasics

open class Shapes {
    open fun drawCircle() {
        println("Parent Circle!!")
    }
    open fun drawSquare() {
        println("Parent Square!!")
    }
}

abstract class Circle: Shapes() {
    override fun drawCircle() {
        println("Draw circle!!")
    }
}

abstract class Square: Shapes() {
    override fun drawSquare() {
        println("Draw Square!!")
    }
}

class Ball: Circle()
class Carom: Square()

fun main() {
    val a = Shapes()
    a.drawCircle()
    a.drawSquare()

    val b = Ball()
    b.drawCircle()
    b.drawSquare()

    val c = Carom()
    c.drawSquare()
    c.drawCircle()
}