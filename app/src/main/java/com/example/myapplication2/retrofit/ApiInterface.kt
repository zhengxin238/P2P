package com.example.myapplication2.retrofit

import com.example.myapplication2.MyDataResponse
import com.example.myapplication2.QuerySummaryDataWithAppTitleAndStartTimeModel
import com.example.myapplication2.models.UpdateFullSummaryWithIDModel
import com.example.myapplication2.models.StoreFullSummaryModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiInterface {

    @GET("api/entry/summarylist")
    fun getData(): Call<MyDataResponse>
    @POST("api/entry/storeFullSummary")
    fun addSummary(@Body newSummary: StoreFullSummaryModel): Call<MyDataResponse>
    @POST("/api/entry/updateFullSummaryWithID")
    fun updateFullSummaryWithID(@Body newUpdateSummary: UpdateFullSummaryWithIDModel) : Call<MyDataResponse>
    @POST("api/entry/querySummaryDataWithAppTItleAndStartTime")
    fun querySummaryDataWithAppTItleAndStartTime(@Body newQuery: QuerySummaryDataWithAppTitleAndStartTimeModel) : Call<MyDataResponse>
}