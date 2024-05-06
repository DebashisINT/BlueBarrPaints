package com.breezefieldbluebarry.features.photoReg.present

import com.breezefieldbluebarry.app.domain.ProspectEntity
import com.breezefieldbluebarry.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}