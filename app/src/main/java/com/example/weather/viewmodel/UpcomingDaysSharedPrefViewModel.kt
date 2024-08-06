package com.example.weather.viewmodel

import androidx.lifecycle.ViewModel
import com.example.weather.data.repository.UpcomingDaysSharedPrefRepository
import com.example.weather.model.nextweathermodel.nextsevendays.NextSevenDaysWeather

class UpcomingDaysSharedPrefViewModel(private val repository: UpcomingDaysSharedPrefRepository): ViewModel() {

    fun getData(): NextSevenDaysWeather? {
        return repository.getData()
    }

    fun sendData(weatherData: NextSevenDaysWeather) {
        repository.sendData(weatherData)
    }

}