package com.breezefieldbluebarry.features.survey.api

import com.breezefieldbluebarry.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldbluebarry.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}