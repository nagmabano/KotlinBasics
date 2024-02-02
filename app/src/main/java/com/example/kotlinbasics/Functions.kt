package com.example.kotlinbasics

fun main() {

    add(5,10)

}

fun add(num1:Int, num2: Int): Int {
    val result = num1 + num2
    return result
}

fun askDetails() {
    println("Who is this coffee for?")
    val name = readln()

    println("How many pieces of sugar do you want?")
    val sugarCount = readln().toInt()

    makeCoffee(sugarCount, name)
}

fun makeCoffee(sugarCount: Int, name: String) {
    if (sugarCount == 0)
        println("Coffee with no sugar for $name")
    else if(sugarCount == 1)
        println("Coffee with $sugarCount spoon of sugar for $name")
    else
        println("Coffee with $sugarCount spoons of sugar for $name")
}