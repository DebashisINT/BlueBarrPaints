package com.breezefieldbluebarry.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldbluebarry.app.Pref
import com.breezefieldbluebarry.base.BaseResponse
import com.breezefieldbluebarry.features.dashboard.presentation.model.DaystartDayendRequest
import com.breezefieldbluebarry.features.dashboard.presentation.model.StatusDayStartEnd
import com.breezefieldbluebarry.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldbluebarry.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }

    fun daystartendDelete(sessionToken:String,usrID:String,date:String,dayStDel:String,dayEndDel:String): Observable<BaseResponse> {
        return apiService.submitDayStartEndDelApi(sessionToken,usrID,date,dayStDel,dayEndDel)
    }


}