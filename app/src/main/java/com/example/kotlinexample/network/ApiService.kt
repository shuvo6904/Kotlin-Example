package com.example.kotlinexample.network

import com.example.kotlinexample.model.OnlineShopPublishModel
import retrofit2.Response
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {

    @POST("online-shop/publish")
    suspend fun onlineShopPublish(@Header("Authorization") token: String, @Query("shop_id") shop_id : Int) : Response<OnlineShopPublishModel>


}