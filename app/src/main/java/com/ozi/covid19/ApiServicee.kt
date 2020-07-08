package com.ozi.covid19

import com.ozi.covid19.Model.ResponseKaltim
import retrofit2.Call
import retrofit2.http.GET

interface ApiServicee{
    @GET("kasus")
    fun getData(): Call<List<ResponseKaltim>>
}