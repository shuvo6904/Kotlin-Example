package com.example.kotlinexample.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroInstance {


    companion object{
        const val BASE_URL_HISHABEE = "https://dev.hishabee.business/api/V2/"

        private val logger = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

        private val okHttp = OkHttpClient.Builder().addInterceptor(logger)



        fun getRetroInstance() : Retrofit{

            return Retrofit.Builder()
                .baseUrl(BASE_URL_HISHABEE)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttp.build())
                .build()
        }
    }
}