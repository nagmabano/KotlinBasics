package com.example.kotlinbasics

class MyTest {
    lateinit var subject: TestSubject

    fun setup() {
        subject = TestSubject()
    }

    fun test() {
        subject.method()
    }
}