package com.breezefieldbluebarry.features.viewAllOrder.interf

import com.breezefieldbluebarry.app.domain.NewOrderProductEntity
import com.breezefieldbluebarry.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}