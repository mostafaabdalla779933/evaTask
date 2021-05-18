package com.example.sample.model


import com.google.gson.annotations.SerializedName

data class DoctorData(
    @SerializedName("DoctorList")
    val doctorList: List<Doctor?>? = null
)

