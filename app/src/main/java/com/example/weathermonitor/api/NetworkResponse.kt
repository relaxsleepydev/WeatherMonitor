package com.example.weathermonitor.api

// <out T> used to wrap it in anything
// this network response can be used to integrate any other api
sealed class NetworkResponse<out T> {
    data class Success<out T>(val data: T) : NetworkResponse<T>()
    data class Error(val message: String) : NetworkResponse<Nothing>()
    object Loading : NetworkResponse<Nothing>()
}