package com.breezefieldbluebarry.features.location.api

import com.breezefieldbluebarry.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldbluebarry.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}