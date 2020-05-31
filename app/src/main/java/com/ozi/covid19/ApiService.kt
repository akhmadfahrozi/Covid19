package com.ozi.covid19

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor


object ApiService{

        val BASE_URL = "https://api.kawalcorona.com/"
        private var retrofit: Retrofit? = null
        fun getRetrofitClient(): Retrofit? {
            if (retrofit == null)
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(getOkHttp())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

            return retrofit
        }

        private fun getOkHttp(): OkHttpClient {
            val httpLoggingInterceptor = HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BASIC)
                .setLevel(HttpLoggingInterceptor.Level.BODY)
            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build()
            return okHttpClient

        }

        fun getService(): ApiServicee? {
            return getRetrofitClient()?.create<ApiServicee>(ApiServicee::class.java)
        }
    }