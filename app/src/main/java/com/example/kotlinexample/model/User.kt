package com.example.kotlinexample.model


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("address")
    var address: String = "",
    @SerializedName("avatar")
    var avatar: String = "",
    @SerializedName("avatar_original")
    var avatarOriginal: String = "",
    @SerializedName("balance")
    var balance: Int = 0,
    @SerializedName("brand_name")
    var brandName: String = "",
    @SerializedName("created_at")
    var createdAt: String = "",
    @SerializedName("customer_package_id")
    var customerPackageId: String = "",
    @SerializedName("email")
    var email: String = "",
    @SerializedName("email_verified_at")
    var emailVerifiedAt: String = "",
    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("interest")
    var interest: String = "",
    @SerializedName("logo_url")
    var logoUrl: String = "",
    @SerializedName("mobile_number")
    var mobileNumber: String = "",
    @SerializedName("name")
    var name: String = "",
    @SerializedName("nid_number")
    var nidNumber: String = "",
    @SerializedName("nid_verified")
    var nidVerified: Int = 0,
    @SerializedName("owner_name")
    var ownerName: String = "",
    @SerializedName("postal_code")
    var postalCode: String = "",
    @SerializedName("referral_code")
    var referralCode: String = "",
    @SerializedName("remaining_uploads")
    var remainingUploads: Int = 0,
    @SerializedName("updated_at")
    var updatedAt: String = "",
    @SerializedName("user_type")
    var userType: String = "",
    @SerializedName("verification_code")
    var verificationCode: String = "",
    @SerializedName("verified_at")
    var verifiedAt: String = "",
    @SerializedName("website")
    var website: String = ""
)