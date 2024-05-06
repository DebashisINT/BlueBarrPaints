package com.breezefieldbluebarry.features.location.shopRevisitStatus

import com.breezefieldbluebarry.base.BaseResponse
import com.breezefieldbluebarry.features.location.model.ShopDurationRequest
import com.breezefieldbluebarry.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}