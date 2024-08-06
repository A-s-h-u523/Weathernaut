package com.example.weather.viewmodel

import androidx.lifecycle.ViewModel
import com.example.weather.data.repository.SettingsSharedPrefRepository
import com.example.weather.model.SettingsData

class SettingsSharedPrefViewModel(private val settingsRepository: SettingsSharedPrefRepository): ViewModel() {

    fun getData(): SettingsData? {
        return settingsRepository.getData()
    }

    fun sendData(settingsData: SettingsData) {
        settingsRepository.sendData(settingsData)
    }
}