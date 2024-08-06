package com.example.weather.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.weather.data.repository.GeoLocationRepository
import com.example.weather.model.CityLocationData

class GeoLocationViewModel(private val repository: GeoLocationRepository) : ViewModel() {

    suspend fun getLocation(cityName: String, limit: Int, appID: String) {
        repository.getLocation(cityName, limit, appID)
    }

    val locationLiveData: LiveData<CityLocationData>
        get() = repository.locationLiveData

}