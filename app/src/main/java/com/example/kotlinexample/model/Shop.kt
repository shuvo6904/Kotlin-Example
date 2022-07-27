package com.example.kotlinexample.model


import com.google.gson.annotations.SerializedName

data class Shop(
    @SerializedName("active")
    var active: Int = 0,
    @SerializedName("added_to_whatsapp")
    var addedToWhatsapp: Int = 0,
    @SerializedName("address")
    var address: String = "",
    @SerializedName("agent_application_status")
    var agentApplicationStatus: String = "",
    @SerializedName("area")
    var area: String = "",
    @SerializedName("balance")
    var balance: Int = 0,
    @SerializedName("campaign_id")
    var campaignId: String = "",
    @SerializedName("created_at")
    var createdAt: String = "",
    @SerializedName("device_count")
    var deviceCount: Int = 0,
    @SerializedName("end_date")
    var endDate: String = "",
    @SerializedName("facebook")
    var facebook: String = "",
    @SerializedName("floor_number")
    var floorNumber: String = "",
    @SerializedName("hishabee_credit")
    var hishabeeCredit: Int = 0,
    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("instagram")
    var instagram: String = "",
    @SerializedName("is_agent")
    var isAgent: Int = 0,
    @SerializedName("last_active")
    var lastActive: String = "",
    @SerializedName("lat")
    var lat: String = "",
    @SerializedName("liquid_balance")
    var liquidBalance: Int = 0,
    @SerializedName("lng")
    var lng: String = "",
    @SerializedName("logo_url")
    var logoUrl: String = "",
    @SerializedName("meta_description")
    var metaDescription: String = "",
    @SerializedName("meta_title")
    var metaTitle: String = "",
    @SerializedName("name")
    var name: String = "",
    @SerializedName("nid_verified")
    var nidVerified: Boolean = false,
    @SerializedName("online_shop_created_at")
    var onlineShopCreatedAt: String = "",
    @SerializedName("package")
    var packageX: String = "",
    @SerializedName("pick_up_point_id")
    var pickUpPointId: String = "",
    @SerializedName("public")
    var `public`: Boolean = false,
    @SerializedName("public_number")
    var publicNumber: String = "",
    @SerializedName("referral_code")
    var referralCode: String = "",
    @SerializedName("sales_funnel")
    var salesFunnel: String = "",
    @SerializedName("set_default")
    var setDefault: Int = 0,
    @SerializedName("shop_number")
    var shopNumber: String = "",
    @SerializedName("sliders")
    var sliders: String = "",
    @SerializedName("slug")
    var slug: String = "",
    @SerializedName("sms_count")
    var smsCount: Int = 0,
    @SerializedName("subscription")
    var subscription: Subscription = Subscription(),
    @SerializedName("theme")
    var theme: Int = 0,
    @SerializedName("time")
    var time: String = "",
    @SerializedName("tin")
    var tin: String = "",
    @SerializedName("trade_license")
    var tradeLicense: String = "",
    @SerializedName("twitter")
    var twitter: String = "",
    @SerializedName("type")
    var type: String = "",
    @SerializedName("updated_at")
    var updatedAt: String = "",
    @SerializedName("user")
    var user: User = User(),
    @SerializedName("user_id")
    var userId: Int = 0,
    @SerializedName("vat_percent")
    var vatPercent: Int = 0,
    @SerializedName("wallet")
    var wallet: Wallet = Wallet(),
    @SerializedName("wallet_balance")
    var walletBalance: Int = 0,
    @SerializedName("youtube")
    var youtube: String = ""
)