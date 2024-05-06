package com.breezefieldbluebarry.features.location.shopRevisitStatus

import com.breezefieldbluebarry.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldbluebarry.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}