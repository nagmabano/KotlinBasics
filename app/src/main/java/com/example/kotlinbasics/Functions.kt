package com.example.kotlinbasics

data class CoffeeDetails(val sugarCount: Int, val name: String, val size: String, val creamAmount:Int)
// you cant have extra functions for data class unlike the normal class
fun main() {

    val coffeeForJenny = CoffeeDetails(0, "Jenny", "xl", 3)
    makeCoffee(coffeeForJenny)

}
fun askDetails() {
    println("Who is this coffee for?")
    val name = readln()

    println("How many pieces of sugar do you want?")
    val sugarCount = readln().toInt()

//    makeCoffee(coffeeDetails.sugarCount, coffeeDetails.name)
}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if (coffeeDetails.sugarCount == 0)
        println("Coffee with no sugar and ${coffeeDetails.creamAmount} scoop of cream for ${coffeeDetails.name}")
    else if(coffeeDetails.sugarCount == 1)
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar and ${coffeeDetails.creamAmount} scoop of cream for ${coffeeDetails.name}")
    else
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar and ${coffeeDetails.creamAmount} scoop of cream for ${coffeeDetails.name}")
}