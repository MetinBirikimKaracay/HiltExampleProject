package com.example.hiltinfo.api

import com.example.hiltinfo.model.ResponseModel
import retrofit2.http.GET

interface ExampleApi {

    @GET("posts/1")
    suspend fun getPost(): ResponseModel

}