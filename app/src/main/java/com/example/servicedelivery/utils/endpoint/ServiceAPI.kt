package com.example.servicedelivery.utils.endpoint

import com.example.servicedelivery.model.ParcelResponse
import retrofit2.Call
import retrofit2.http.GET

interface ServiceAPI {

    @GET("ceOYRfmRWq?indent=2")
    fun getParcels(): Call<ParcelResponse>
}