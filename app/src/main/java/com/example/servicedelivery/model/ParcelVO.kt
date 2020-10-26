package com.example.servicedelivery.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ParcelVO(
    @SerializedName("orderNumber")
    val orderNumber: String?,
    @SerializedName("photoUrl")
    val photoUrl: String?,
    @SerializedName("updateStatus")
    val updateStatus: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("progress")
    val progress: String?
) : Parcelable