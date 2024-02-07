package com.example.kotlinbasics

open class Triangle {
    open fun draw() {
        println("Drawing a triangle!!")
    }
    val borderColor: String get() = "black"
}

class FilledTriangle: Triangle() {
    override fun draw() {
        super.draw()
        println("Filling the triangle")
        val filler = Filler()
        filler.drawAndFill()
    }
    val fillColor: String get() = super.borderColor
    inner class Filler {
        fun fill() {
            println("Filling")
        }
        fun drawAndFill() {
            super@FilledTriangle.draw()
            fill()
            println("Draw a filled triangle with color ${super@FilledTriangle.borderColor}")
        }
    }
}

fun main() {
    val fr = FilledTriangle()
    fr.draw()
}