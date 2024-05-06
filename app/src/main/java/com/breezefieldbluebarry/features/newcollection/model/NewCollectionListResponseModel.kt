package com.breezefieldbluebarry.features.newcollection.model

import com.breezefieldbluebarry.app.domain.CollectionDetailsEntity
import com.breezefieldbluebarry.base.BaseResponse
import com.breezefieldbluebarry.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}