package com.example.weather.viewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weather.data.repository.UpcomingDaysSharedPrefRepository
import com.example.weather.viewmodel.UpcomingDaysSharedPrefViewModel

class UpcomingDaysSharedPrefViewModelFactory(private val repository: UpcomingDaysSharedPrefRepository) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return UpcomingDaysSharedPrefViewModel(repository) as T
    }

}