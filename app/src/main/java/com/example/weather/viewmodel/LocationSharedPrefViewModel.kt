package com.example.weather.viewmodel

import androidx.lifecycle.ViewModel
import com.example.weather.data.repository.LocationSharedPrefRepository
import com.example.weather.model.CurrentLocationData

class LocationSharedPrefViewModel(private val locationSharedPrefRepository: LocationSharedPrefRepository): ViewModel() {

    fun getData(): CurrentLocationData? {
        return locationSharedPrefRepository.getData()
    }

    fun sendData(locationData: CurrentLocationData) {
        locationSharedPrefRepository.sendData(locationData)
    }

}