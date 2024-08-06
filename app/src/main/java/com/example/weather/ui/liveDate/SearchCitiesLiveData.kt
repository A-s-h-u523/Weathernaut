package com.example.weather.ui.liveDate

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.weather.model.CityLocationDataItem

object SearchCitiesLiveData {
    private val citiesLiveData = MutableLiveData<CityLocationDataItem>()

    fun getCitiesLiveData(): LiveData<CityLocationDataItem> = citiesLiveData

    fun updateCitiesLiveData(newCitiesData: CityLocationDataItem) {
        citiesLiveData.value = newCitiesData
    }
}