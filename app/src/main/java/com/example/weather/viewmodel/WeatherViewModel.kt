package com.example.weather.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.weather.data.repository.WeatherRepository
import com.example.weather.model.weathermodel.WeatherData

class WeatherViewModel(private val weatherRepository: WeatherRepository): ViewModel() {

    suspend fun getWeather(lat: String, lon: String, appId: String) {
        weatherRepository.getWeather(lat, lon, appId)
    }

    val weatherLiveData: LiveData<WeatherData>
        get() = weatherRepository.weatherData

}