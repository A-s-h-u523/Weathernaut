package com.example.weather.data.repository

import com.example.weather.data.local.WeatherSharedPrefService
import com.example.weather.model.weathermodel.WeatherData

class WeatherSharedPrefRepository(private val weatherService: WeatherSharedPrefService) {

    fun getData(): WeatherData? {
        return weatherService.getData()
    }

    fun sendData(weatherData: WeatherData) {
        weatherService.sendData(weatherData)
    }

}