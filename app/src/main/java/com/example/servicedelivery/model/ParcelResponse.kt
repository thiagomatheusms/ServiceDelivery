package com.example.servicedelivery.model

import com.google.gson.annotations.SerializedName

data class ParcelResponse (
    @SerializedName("value")
    val value: List<ParcelVO>
)