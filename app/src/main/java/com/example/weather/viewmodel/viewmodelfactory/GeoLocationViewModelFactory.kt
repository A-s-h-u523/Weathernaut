package com.example.weather.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weather.data.repository.GeoLocationRepository
import com.example.weather.viewmodel.GeoLocationViewModel

class GeoLocationViewModelFactory(private val repository: GeoLocationRepository) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return GeoLocationViewModel(repository) as T
    }
}