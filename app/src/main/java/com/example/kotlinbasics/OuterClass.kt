package com.example.kotlinbasics

class OuterClass {
    private var property: String = "Outer Property"

    inner class InnerClass() {
        fun displayOuterProperty() {
             val property: String = "Inner Property"
            // Inner class has access to public and private properties of outer class
            println(property)
            // explicitly referring outer class to resolve the name conflict between inner and outer class
            println(this@OuterClass.property)
        }
    }
}

fun main() {
    val outerInstance = OuterClass()
    // Each instance of inner class is associated with an instance of outer class
    val innerInstance = outerInstance.InnerClass()
    innerInstance.displayOuterProperty()
}