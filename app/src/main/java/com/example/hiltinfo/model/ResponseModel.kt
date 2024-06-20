package com.example.hiltinfo.model

import com.google.gson.annotations.SerializedName

class ResponseModel(
    @SerializedName("userId") val uId: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("body") val body: String
) {
}