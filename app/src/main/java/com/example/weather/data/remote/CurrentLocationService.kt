package com.example.weather.data.remote

import com.example.weather.model.CurrentLocationData
import retrofit2.Response
import retrofit2.http.GET

interface CurrentLocationService {

    @GET("/json")
    suspend fun getApproximateLocation(): Response<CurrentLocationData>

}