package com.breezefieldbluebarry.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldbluebarry.app.FileUtils
import com.breezefieldbluebarry.base.BaseResponse
import com.breezefieldbluebarry.features.NewQuotation.model.*
import com.breezefieldbluebarry.features.addshop.model.AddShopRequestData
import com.breezefieldbluebarry.features.addshop.model.AddShopResponse
import com.breezefieldbluebarry.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldbluebarry.features.damageProduct.model.delBreakageReq
import com.breezefieldbluebarry.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldbluebarry.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldbluebarry.features.myjobs.model.WIPImageSubmit
import com.breezefieldbluebarry.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}