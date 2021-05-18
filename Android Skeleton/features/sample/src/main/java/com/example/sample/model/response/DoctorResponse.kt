package com.example.sample.model.response


import com.example.sample.model.DoctorData
import com.google.gson.annotations.SerializedName
data class DoctorResponse(
    @SerializedName("Message")
    val message: String? = null,
    @SerializedName("ErrorList")
    val errorList: List<Any?>? = null,
    @SerializedName("Data")
    val data: DoctorData? = null
)