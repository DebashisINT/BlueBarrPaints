package com.breezefieldbluebarry.features.stockAddCurrentStock.api

import com.breezefieldbluebarry.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldbluebarry.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}