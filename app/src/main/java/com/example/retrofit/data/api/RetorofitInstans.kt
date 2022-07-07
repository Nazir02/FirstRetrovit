package com.example.retrofit.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetorofitInstans {
    private val retrofit by lazy {
        Retrofit.Builder().baseUrl("https://api.privatbank.ua/")
            .addConverterFactory(GsonConverterFactory.create()).build()

    }
    val api:ApiServise by lazy {
        retrofit.create(ApiServise::class.java)
    }
}