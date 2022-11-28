package com.example.myapplication2.retrofit

import com.example.myapplication2.MyDataResponse
import com.example.myapplication2.ResponseItem
import com.example.myapplication2.StoreModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiInterface {

    @GET("api/entry/summarylist")
    fun getData(): Call<MyDataResponse>
    @POST("api/entry/storeFullSummary")
    fun addSummary(@Body newSummary: StoreModel): Call<MyDataResponse>
}