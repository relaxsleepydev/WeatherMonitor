package com.example.weathermonitor

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weathermonitor.api.Constant
import com.example.weathermonitor.api.NetworkResponse
import com.example.weathermonitor.api.RetrofitInstance
import com.example.weathermonitor.api.WeatherModel
import kotlinx.coroutines.launch

class WeatherViewModel: ViewModel() {

    // instance of weatherApi
    private val weatherApi = RetrofitInstance.weatherApi

    // creating live data to expose it to ui
    private val _weatherResult = MutableLiveData<NetworkResponse<WeatherModel>>()
    val weatherResult: LiveData<NetworkResponse<WeatherModel>> = _weatherResult


    fun getData(city: String) {
        _weatherResult.value = NetworkResponse.Loading
        viewModelScope.launch {
            try {
                val response = weatherApi.getWeather(Constant.apikey, city)
                if (response.isSuccessful) {
                    response.body()?.let {
                        _weatherResult.value = NetworkResponse.Success(it)
                    }
                }
                else{
                    _weatherResult.value = NetworkResponse.Error("Failed to load data")
                }
            }
            catch (e : Exception) {
                    _weatherResult.value = NetworkResponse.Error("Failed to load data")
            }
        }
    }
}