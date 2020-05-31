package com.ozi.covid19

import com.ozi.covid19.Model.ResponseData
import com.ozi.covid19.prov.ResponseProvinsi
import retrofit2.Call
import retrofit2.http.GET

interface ApiServicee{
@GET("indonesia")
fun getData(): Call<List<ResponseData>>
@GET("indonesia/provinsi")
fun getpro(): Call<ResponseProvinsi>
}