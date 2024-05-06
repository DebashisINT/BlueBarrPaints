package com.breezefieldbluebarry.features.stockCompetetorStock.api

import com.breezefieldbluebarry.base.BaseResponse
import com.breezefieldbluebarry.features.orderList.model.NewOrderListResponseModel
import com.breezefieldbluebarry.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldbluebarry.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}