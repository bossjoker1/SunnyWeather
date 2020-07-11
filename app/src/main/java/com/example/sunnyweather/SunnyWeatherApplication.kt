package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
//全局化获得context
class SunnyWeatherApplication :Application(){
    companion object{
        const val TOKEN = "kZXXScEUPHru8O0e"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}