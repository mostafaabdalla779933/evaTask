package com.example.sample.model

import com.google.gson.annotations.SerializedName

data class Doctor(
    @SerializedName("accept_promocode")
    val acceptPromocode: Boolean? = null,
    @SerializedName("followup")
    val followup: Int? = null,
    @SerializedName("img")
    val img: String? = null,
    @SerializedName("fees")
    val fees: Int? = null,
    @SerializedName("specialist")
    val specialist: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("doctor_name")
    val doctorName: String? = null,
    @SerializedName("available_from")
    val availableFrom: String? = null
)