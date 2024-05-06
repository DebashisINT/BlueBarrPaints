package com.breezefieldbluebarry.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldbluebarry.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldbluebarry.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}