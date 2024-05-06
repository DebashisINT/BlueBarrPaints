package com.breezefieldbluebarry.features.viewAllOrder.orderOptimized

import com.breezefieldbluebarry.app.domain.ProductOnlineRateTempEntity
import com.breezefieldbluebarry.base.BaseResponse
import com.breezefieldbluebarry.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}