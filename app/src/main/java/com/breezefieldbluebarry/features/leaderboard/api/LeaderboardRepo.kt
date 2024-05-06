package com.breezefieldbluebarry.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldbluebarry.app.FileUtils
import com.breezefieldbluebarry.app.Pref
import com.breezefieldbluebarry.base.BaseResponse
import com.breezefieldbluebarry.features.addshop.model.AddLogReqData
import com.breezefieldbluebarry.features.addshop.model.AddShopRequestData
import com.breezefieldbluebarry.features.addshop.model.AddShopResponse
import com.breezefieldbluebarry.features.addshop.model.LogFileResponse
import com.breezefieldbluebarry.features.addshop.model.UpdateAddrReq
import com.breezefieldbluebarry.features.contacts.CallHisDtls
import com.breezefieldbluebarry.features.contacts.CompanyReqData
import com.breezefieldbluebarry.features.contacts.ContactMasterRes
import com.breezefieldbluebarry.features.contacts.SourceMasterRes
import com.breezefieldbluebarry.features.contacts.StageMasterRes
import com.breezefieldbluebarry.features.contacts.StatusMasterRes
import com.breezefieldbluebarry.features.contacts.TypeMasterRes
import com.breezefieldbluebarry.features.dashboard.presentation.DashboardActivity
import com.breezefieldbluebarry.features.login.model.WhatsappApiData
import com.breezefieldbluebarry.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}