package com.breezefieldbluebarry.features.viewAllOrder.interf

import com.breezefieldbluebarry.app.domain.NewOrderGenderEntity
import com.breezefieldbluebarry.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}