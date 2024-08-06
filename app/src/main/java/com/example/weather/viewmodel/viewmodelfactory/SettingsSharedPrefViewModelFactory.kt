package com.example.weather.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weather.data.repository.SettingsSharedPrefRepository
import com.example.weather.viewmodel.SettingsSharedPrefViewModel

class SettingsSharedPrefViewModelFactory(private val repository: SettingsSharedPrefRepository): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SettingsSharedPrefViewModel(repository) as T
    }

}