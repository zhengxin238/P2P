package com.example.myapplication2.retrofit

import com.example.myapplication2.MyDataResponse
import retrofit2.Call
import retrofit2.http.GET


interface ApiInterface {

    @GET("api/entry/summarylist")
    fun getData(): Call<MyDataResponse>
}