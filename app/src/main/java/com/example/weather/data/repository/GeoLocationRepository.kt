package com.example.weather.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.weather.data.remote.GeoLocationService
import com.example.weather.model.CityLocationData

class GeoLocationRepository(private val geoLocationService: GeoLocationService) {

    private val geoLocationLiveData = MutableLiveData<CityLocationData>()

    val locationLiveData: LiveData<CityLocationData>
        get() = geoLocationLiveData

    suspend fun getLocation(q: String, limit: Int, appId: String) {
        val result = geoLocationService.getLocation(q, limit, appId)

        if(result.body() != null) {
            geoLocationLiveData.postValue(result.body())
        }
    }

}