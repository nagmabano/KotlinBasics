package com.example.kotlinbasics

    class Hierarchy(val name: String) {
        val children: MutableList<Hierarchy> = mutableListOf()
        constructor(name: String, parent: Hierarchy) : this(name) {
            parent.children.add(this)
        }
    }


fun main() {
    val p1 = Hierarchy("Alice")
    val p2 = Hierarchy("Bob", p1)
    println(p1.name)
    for (child in p1.children) {
        println(child.name)
    }
    println(p2.name)
    println(p2.children)
}