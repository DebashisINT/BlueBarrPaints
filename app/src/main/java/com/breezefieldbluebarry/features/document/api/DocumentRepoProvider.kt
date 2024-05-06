package com.breezefieldbluebarry.features.document.api

import com.breezefieldbluebarry.features.dymanicSection.api.DynamicApi
import com.breezefieldbluebarry.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}