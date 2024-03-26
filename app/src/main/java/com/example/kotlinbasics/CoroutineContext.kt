package com.example.kotlinbasics

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    // this: CoroutineScope instance
    // coroutineContext: CoroutineContext instance

    // Without Parameter: CONFINED  [CONFINED DISPATCHER] - because we are confined to one thread
    // inherit the context from immediate parent and will execute on the thread on which parent is getting executed
    // even after delay() or suspending function continues to run on the same thread
    val d = launch {
        println("C1: ${Thread.currentThread().name}") // main
        delay(100)
        println("C6: ${Thread.currentThread().name}") // main
    }

    // With parameter: Dispatcher.Default [Similar to GlobalScope.launch {} ]
    // Gets its own context at global level.
    // It will create the coroutine at the application level hence will execute on a separate background thread
    // after delay or a suspending function runs on either on thread T1 or whichever thread is available
    val e = launch (Dispatchers.Default){
        println("C2: ${Thread.currentThread().name}") // DefaultDispatcher-worker-1 - Thread T1
        delay(2000)
        println("C3: ${Thread.currentThread().name}") // Thread? whichever thread is available
    }

    // With parameters: Dispatchers.Unconfined [Unconfined Dispatcher]
    // context is inherited from the immediate parent of runBlocking
    // after delay or a suspending function it continues to run on some other thread
    // Coroutine is not confined to one thread and it may change its thread in future
    val f = launch(Dispatchers.Unconfined) {
        println("C4: ${Thread.currentThread().name}") // Thread: main
        delay(200)
        println("C5: ${Thread.currentThread().name}") // Thread some other thread which is not main
                                                        // Assigned from shared pool of threads
    }

}