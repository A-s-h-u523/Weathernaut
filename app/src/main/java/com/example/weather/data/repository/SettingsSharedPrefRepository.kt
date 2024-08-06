package com.example.weather.data.repository

import com.example.weather.data.local.SettingsSharedPrefService
import com.example.weather.model.SettingsData

class SettingsSharedPrefRepository(private val settingsService: SettingsSharedPrefService) {

    fun getData(): SettingsData? {
        return settingsService.getData()
    }

    fun sendData(settingsData: SettingsData) {
        settingsService.setData(settingsData)
    }
}