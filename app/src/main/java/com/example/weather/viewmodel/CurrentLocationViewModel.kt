package com.example.weather.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.weather.data.repository.CurrentLocationRepository
import com.example.weather.model.CurrentLocationData

class CurrentLocationViewModel(private val currentLocationRepository: CurrentLocationRepository) : ViewModel() {
    suspend fun getLocation() {
        currentLocationRepository.getLocation()
    }

    val approximateLocationLiveData: LiveData<CurrentLocationData>
        get() = currentLocationRepository.locationLiveData
}