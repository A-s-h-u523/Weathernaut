package com.example.weather.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weather.data.repository.CurrentLocationRepository
import com.example.weather.viewmodel.CurrentLocationViewModel

class CurrentLocationViewModelFactory(private val repository: CurrentLocationRepository): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CurrentLocationViewModel(repository) as T
    }

}