package com.breezefieldbluebarry.features.newcollectionreport

import com.breezefieldbluebarry.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}