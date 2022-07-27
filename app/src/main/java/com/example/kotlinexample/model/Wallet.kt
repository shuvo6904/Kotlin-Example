package com.example.kotlinexample.model


import com.google.gson.annotations.SerializedName

data class Wallet(
    @SerializedName("created_at")
    var createdAt: String = "",
    @SerializedName("gift_points")
    var giftPoints: Int = 0,
    @SerializedName("hishabee_credit")
    var hishabeeCredit: Int = 0,
    @SerializedName("hishabee_grant")
    var hishabeeGrant: Int = 0,
    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("liquid_balance")
    var liquidBalance: Int = 0,
    @SerializedName("shop_id")
    var shopId: Int = 0,
    @SerializedName("total_balance")
    var totalBalance: Int = 0,
    @SerializedName("updated_at")
    var updatedAt: String = "",
    @SerializedName("user_id")
    var userId: Int = 0,
    @SerializedName("wallet_barcode")
    var walletBarcode: String = ""
)