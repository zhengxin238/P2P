package com.example.myapplication2

import com.google.gson.annotations.SerializedName

data class MyDataResponse(
    @SerializedName("response" )
    val responseOne: List<ResponseItem>
)