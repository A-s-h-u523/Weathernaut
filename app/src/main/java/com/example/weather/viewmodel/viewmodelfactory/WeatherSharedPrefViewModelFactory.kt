package com.example.weather.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weather.data.repository.WeatherSharedPrefRepository
import com.example.weather.viewmodel.WeatherSharedPrefViewModel

class WeatherSharedPrefViewModelFactory(private val repository: WeatherSharedPrefRepository): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return WeatherSharedPrefViewModel(repository) as T
    }

}