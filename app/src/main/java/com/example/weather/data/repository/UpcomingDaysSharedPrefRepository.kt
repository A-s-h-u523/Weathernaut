package com.example.weather.data.repository

import com.example.weather.data.local.UpcomingDaysSharedPrefService
import com.example.weather.model.nextweathermodel.nextsevendays.NextSevenDaysWeather

class UpcomingDaysSharedPrefRepository(private val service: UpcomingDaysSharedPrefService) {

    fun sendData(weatherData: NextSevenDaysWeather) {
        service.sendData(weatherData)
    }

    fun getData(): NextSevenDaysWeather? {
        return service.getData()
    }

}