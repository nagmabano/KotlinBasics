package com.example.kotlinbasics.di

import android.util.Log
// constructor injection
class Car constructor(private val engine: Engine, private val wheel: Wheel) {

    fun getCar() {
        engine.getEngine()
        wheel.getWheel()
        Log.d("main", "Car is running..")
    }
}

class Engine {

    fun getEngine() {
        Log.d("main", "Engine is running..")
    }
}

class Wheel {

    fun getWheel() {
        Log.d("main", "Wheel is running..")
    }
}