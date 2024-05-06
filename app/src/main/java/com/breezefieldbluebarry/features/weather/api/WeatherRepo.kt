package com.breezefieldbluebarry.features.weather.api

import com.breezefieldbluebarry.base.BaseResponse
import com.breezefieldbluebarry.features.task.api.TaskApi
import com.breezefieldbluebarry.features.task.model.AddTaskInputModel
import com.breezefieldbluebarry.features.weather.model.ForeCastAPIResponse
import com.breezefieldbluebarry.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}