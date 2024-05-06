package com.breezefieldbluebarry.features.viewAllOrder.interf

import com.breezefieldbluebarry.app.domain.NewOrderGenderEntity
import com.breezefieldbluebarry.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}