package com.example.servicedelivery.repository

import com.example.servicedelivery.model.ParcelResponse
import com.example.servicedelivery.utils.endpoint.ServiceAPI
import com.example.servicedelivery.utils.retrofit.NetworkUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ParcelRepository() {

    private var api: ServiceAPI = NetworkUtils.getServiceApi()

    fun getParcels(success: (ParcelResponse) -> Unit, error: () -> Unit) {
        var parcelResponse: ParcelResponse? = null
        val callback = api.getParcels()

        callback.enqueue(object : Callback<ParcelResponse> {
            override fun onFailure(call: Call<ParcelResponse>, t: Throwable) {
                error()
            }

            override fun onResponse(
                call: Call<ParcelResponse>,
                response: Response<ParcelResponse>
            ) {
                response.body()?.let { success(it) }
            }

        })
    }
}