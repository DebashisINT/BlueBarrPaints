package com.breezefieldbluebarry.features.nearbyuserlist.api

import com.breezefieldbluebarry.app.Pref
import com.breezefieldbluebarry.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldbluebarry.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldbluebarry.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}