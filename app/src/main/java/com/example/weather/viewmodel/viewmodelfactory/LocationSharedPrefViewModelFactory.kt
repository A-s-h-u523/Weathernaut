package com.example.weather.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weather.data.repository.LocationSharedPrefRepository
import com.example.weather.viewmodel.LocationSharedPrefViewModel

class LocationSharedPrefViewModelFactory(private val repository: LocationSharedPrefRepository) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LocationSharedPrefViewModel(repository) as T
    }

}