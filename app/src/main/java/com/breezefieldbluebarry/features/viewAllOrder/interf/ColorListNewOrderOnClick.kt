package com.breezefieldbluebarry.features.viewAllOrder.interf

import com.breezefieldbluebarry.app.domain.NewOrderColorEntity
import com.breezefieldbluebarry.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}