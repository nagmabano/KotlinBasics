package com.example.kotlinbasics

import android.app.Application
import com.example.kotlinbasics.di.Car
import com.example.kotlinbasics.di.Engine
import com.example.kotlinbasics.di.Wheel

class BaseApp: Application() {

    var car = Car(Engine(), Wheel())
}