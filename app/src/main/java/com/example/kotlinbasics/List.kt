package com.example.kotlinbasics

fun main() {
    // Immutable list
    val shoppingList = listOf("processor", "ram", "graphic card", "ssd")

    // Mutable list
    val shoppingListMutable = mutableListOf("processor", "ram", "graphic card", "ssd")
    shoppingListMutable.add("fan")
    println(shoppingListMutable)
    shoppingListMutable.remove("graphic card")
    shoppingListMutable.add("graphic card RTX 4060")
    println(shoppingListMutable)

}