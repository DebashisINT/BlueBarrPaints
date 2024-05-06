package com.breezefieldbluebarry.features.orderList.model

import com.breezefieldbluebarry.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}