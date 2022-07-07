package com.example.retrofit.data.api

import com.example.retrofit.model.beznal.beznal
import com.example.retrofit.model.nal.nalMony
import retrofit2.Response
import retrofit2.http.GET

interface ApiServise {
    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoney():Response<nalMony>
    @GET(" p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBezNalMoney():Response<beznal>

}