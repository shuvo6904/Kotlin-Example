package com.example.kotlinexample.model


import com.google.gson.annotations.SerializedName

data class OnlineShopPublishModel(
    @SerializedName("code")
    var code: Int = 0,
    @SerializedName("message")
    var message: String = "",
    @SerializedName("shop")
    var shop: Shop = Shop()
)