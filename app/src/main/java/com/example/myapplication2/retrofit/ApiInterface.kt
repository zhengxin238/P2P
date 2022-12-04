package com.example.myapplication2.retrofit

import com.example.myapplication2.models.entry.response.EntryResponse
import com.example.myapplication2.models.entry.source.StoreFullEntryModel
import com.example.myapplication2.models.summary.SummaryResponse
import com.example.myapplication2.models.summary.QuerySummaryDataWithAppTitleAndStartTimeModel
import com.example.myapplication2.models.summary.UpdateFullSummaryWithIDModel
import com.example.myapplication2.models.summary.StoreFullSummaryModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiInterface {
////Summary
    @GET("api/entry/summarylist")
    fun getSummaryData(): Call<SummaryResponse>
    @POST("api/entry/storeFullSummary")
    fun addSummary(@Body newSummary: StoreFullSummaryModel): Call<SummaryResponse>
    @POST("/api/entry/updateFullSummaryWithID")
    fun updateFullSummaryWithID(@Body newUpdateSummary: UpdateFullSummaryWithIDModel) : Call<SummaryResponse>
    @POST("api/entry/querySummaryDataWithAppTItleAndStartTime")
    fun querySummaryDataWithAppTItleAndStartTime(@Body newQuery: QuerySummaryDataWithAppTitleAndStartTimeModel) : Call<SummaryResponse>





////Entry
    @GET("api/entry/entrylist")
    fun getEntryData(): Call<EntryResponse>
    @POST("api/entry/storeFullEntry")
    fun addEntry(@Body newEntry: StoreFullEntryModel): Call<String>


}