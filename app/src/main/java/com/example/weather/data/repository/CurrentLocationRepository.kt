package com.example.weather.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.weather.data.remote.CurrentLocationService
import com.example.weather.model.CurrentLocationData

class CurrentLocationRepository(private val currentLocationService: CurrentLocationService) {

    private val approximateLocationLiveData = MutableLiveData<CurrentLocationData>()

    val locationLiveData: LiveData<CurrentLocationData>
        get() = approximateLocationLiveData

    suspend fun getLocation() {
        val result = currentLocationService.getApproximateLocation()

        if(result.body() != null) {
            approximateLocationLiveData.postValue(result.body())
        }
    }

}