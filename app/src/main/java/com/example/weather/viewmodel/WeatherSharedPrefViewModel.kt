package com.example.weather.viewmodel

import androidx.lifecycle.ViewModel
import com.example.weather.data.repository.WeatherSharedPrefRepository
import com.example.weather.model.weathermodel.WeatherData

class WeatherSharedPrefViewModel(private val weatherRepository: WeatherSharedPrefRepository): ViewModel() {

    fun getData(): WeatherData? {
        return weatherRepository.getData()
    }

    fun sendData(weatherData: WeatherData) {
        weatherRepository.sendData(weatherData)
    }

}