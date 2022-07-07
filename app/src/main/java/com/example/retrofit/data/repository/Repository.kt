package com.example.retrofit.data.repository

import com.example.retrofit.data.api.RetorofitInstans
import com.example.retrofit.model.beznal.beznal
import com.example.retrofit.model.nal.nalMony
import retrofit2.Response

class Repository {
    suspend fun getNal():Response<nalMony>{
        return RetorofitInstans.api.getNalMoney()
    }
    suspend fun getBezNal():Response<beznal>{
        return RetorofitInstans.api.getBezNalMoney()
    }
}