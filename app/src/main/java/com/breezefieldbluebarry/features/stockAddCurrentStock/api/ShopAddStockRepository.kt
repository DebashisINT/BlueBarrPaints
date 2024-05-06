package com.breezefieldbluebarry.features.stockAddCurrentStock.api

import com.breezefieldbluebarry.base.BaseResponse
import com.breezefieldbluebarry.features.location.model.ShopRevisitStatusRequest
import com.breezefieldbluebarry.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldbluebarry.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldbluebarry.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldbluebarry.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}