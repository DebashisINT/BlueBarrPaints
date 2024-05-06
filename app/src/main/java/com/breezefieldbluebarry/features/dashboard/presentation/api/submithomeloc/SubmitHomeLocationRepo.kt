package com.breezefieldbluebarry.features.dashboard.presentation.api.submithomeloc

import com.breezefieldbluebarry.base.BaseResponse
import com.breezefieldbluebarry.features.dashboard.presentation.model.SubmitHomeLocationInputModel
import io.reactivex.Observable

/**
 * Created by Saikat on 13-03-2019.
 */
class SubmitHomeLocationRepo(val apiService: SubmitHomeLocationApi) {
    fun submitAttendance(addAttendenceModel: SubmitHomeLocationInputModel): Observable<BaseResponse> {
        return apiService.submitHomeLocation(addAttendenceModel)
    }
}