package com.example.sunnyweather.logic.model

//封装realtime和daily
data class Weather(val realtime:RealtimeResponse.Realtime, val daily:DailyResponse.Daily)