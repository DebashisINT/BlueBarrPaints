package com.breezefieldbluebarry.features.weather.api

import com.breezefieldbluebarry.features.task.api.TaskApi
import com.breezefieldbluebarry.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}