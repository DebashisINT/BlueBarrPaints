package com.breezefieldbluebarry.features.viewAllOrder.model

import com.breezefieldbluebarry.app.domain.NewOrderColorEntity
import com.breezefieldbluebarry.app.domain.NewOrderGenderEntity
import com.breezefieldbluebarry.app.domain.NewOrderProductEntity
import com.breezefieldbluebarry.app.domain.NewOrderSizeEntity
import com.breezefieldbluebarry.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

