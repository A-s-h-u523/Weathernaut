package com.example.weather.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weather.data.repository.HourlyWeatherRepository
import com.example.weather.viewmodel.HourlyWeatherViewModel

class HourlyWeatherViewModelFactory(private val repository: HourlyWeatherRepository) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return HourlyWeatherViewModel(repository) as T
    }

}