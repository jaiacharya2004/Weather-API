package com.example.realtimeweather.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val baseUrl = "https://api.weatherapi.com";

object RetrofitInstance {
    private fun getInstance() : Retrofit {
    return Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    }

    val weatherApi : WeatherApi = getInstance().create(WeatherApi::class.java)

}