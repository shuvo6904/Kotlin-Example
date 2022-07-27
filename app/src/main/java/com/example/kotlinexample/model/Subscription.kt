package com.example.kotlinexample.model


import com.google.gson.annotations.SerializedName

data class Subscription(
    @SerializedName("created_at")
    var createdAt: String = "",
    @SerializedName("end_date")
    var endDate: String = "",
    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("package")
    var packageX: String = "",
    @SerializedName("shop_id")
    var shopId: Int = 0,
    @SerializedName("updated_at")
    var updatedAt: String = ""
)