package com.breezefieldbluebarry.features.login.model.productlistmodel

import com.breezefieldbluebarry.app.domain.ModelEntity
import com.breezefieldbluebarry.app.domain.ProductListEntity
import com.breezefieldbluebarry.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}