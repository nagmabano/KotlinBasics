package com.example.kotlinbasics

interface MyInterface {
    fun bar() {
        println("In parent Interface")
    }
    fun boo()  //Interface can't have method implementation

}

class Childs: MyInterface {
    override fun bar() {
        println("In bar!!")
    }

    override fun boo() {
        println("In Foo")
    }
}

fun main() {
    var child = Childs()
    child.bar()
    child.boo()
}