package com.example.servicedelivery.utils.retrofit

import com.example.servicedelivery.utils.endpoint.ServiceAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkUtils {
    fun getRetrofitInstance(baseUrl: String): Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getServiceApi(): ServiceAPI =
        getRetrofitInstance("http://www.json-generator.com/api/json/get/")
            .create(ServiceAPI::class.java)

}