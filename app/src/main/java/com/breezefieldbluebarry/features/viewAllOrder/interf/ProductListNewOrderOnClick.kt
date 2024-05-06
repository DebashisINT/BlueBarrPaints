package com.breezefieldbluebarry.features.viewAllOrder.interf

import com.breezefieldbluebarry.app.domain.NewOrderGenderEntity
import com.breezefieldbluebarry.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}