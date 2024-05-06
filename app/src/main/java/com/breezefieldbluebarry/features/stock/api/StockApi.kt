package com.breezefieldbluebarry.features.stock.api


import com.breezefieldbluebarry.app.NetworkConstant
import com.breezefieldbluebarry.base.BaseResponse
import com.breezefieldbluebarry.features.stock.model.AddStockInputParamsModel
import com.breezefieldbluebarry.features.stock.model.NewStockListResponseModel
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by Saikat on 17-09-2019.
 */
interface StockApi {

    @POST("Stock/AddStock")
    fun addStock(@Body addStock: AddStockInputParamsModel): Observable<BaseResponse>


    @FormUrlEncoded
    @POST("Stock/StockDetailsShopList")
    fun getStockList(@Field("session_token") session_token: String, @Field("user_id") user_id: String): Observable<NewStockListResponseModel>

    /**
     * Companion object to create the GithubApiService
     */
    companion object Factory {
        fun create(): StockApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(StockApi::class.java)
        }
    }

}