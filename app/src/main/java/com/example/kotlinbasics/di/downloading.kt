package com.example.kotlinbasics.di

import android.util.Log

/* for downloading

* 1. HttpClient
* 2. Executor
* 3. Request
* 4. Downloader
* */

class HttpClient {

}

class Executor {

}

class Request constructor(private val client: HttpClient, private val executor: Executor) {

    fun getRequest() {
        Log.d("main", "file downloading")
    }

}

class Downloader constructor(private val request: Request) {

    fun getDownload() {
        request.getRequest()
    }

}

object DownloaderFactory {
    fun create(): Downloader {
        val client = HttpClient()
        val executor = Executor()
        val request = Request(client, executor)
        return Downloader(request)
    }
}
