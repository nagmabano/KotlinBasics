package com.example.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasics.di.Downloader
import com.example.kotlinbasics.di.DownloaderFactory
import com.example.kotlinbasics.di.Executor
import com.example.kotlinbasics.di.HttpClient
import com.example.kotlinbasics.di.Request

class MainActivity : AppCompatActivity() {

    private lateinit var baseApp: BaseApp
//    private lateinit var downloader: Downloader
    private val download = DownloaderFactory.create()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        baseApp = BaseApp()
        baseApp.car.getCar()

//        downloader = Downloader(Request(HttpClient(), Executor()))
        download.getDownload()


    }
}