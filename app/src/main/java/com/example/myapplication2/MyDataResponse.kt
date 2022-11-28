package com.example.myapplication2

import com.google.gson.annotations.SerializedName
import retrofit2.http.Body

data class MyDataResponse(
    @SerializedName("response" )
    val responseOne: List<ResponseItem>


)