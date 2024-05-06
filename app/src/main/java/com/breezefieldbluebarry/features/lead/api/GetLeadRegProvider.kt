package com.breezefieldbluebarry.features.lead.api

import com.breezefieldbluebarry.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldbluebarry.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}