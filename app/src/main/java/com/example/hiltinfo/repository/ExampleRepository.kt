package com.example.hiltinfo.repository

import com.example.hiltinfo.api.ExampleApi
import com.example.hiltinfo.model.ResponseModel
import javax.inject.Inject

class ExampleRepository @Inject constructor(private val api: ExampleApi) {

    suspend fun getPost(): ResponseModel {
        return api.getPost()
    }
}