package com.example.weather.data.repository

import com.example.weather.data.local.LocationSharedPrefService
import com.example.weather.model.CurrentLocationData

class LocationSharedPrefRepository(private val locationSharedPrefService: LocationSharedPrefService) {

    fun getData(): CurrentLocationData? {
        return locationSharedPrefService.getData()
    }

    fun sendData(locationData: CurrentLocationData) {
        locationSharedPrefService.sendData(locationData)
    }

}