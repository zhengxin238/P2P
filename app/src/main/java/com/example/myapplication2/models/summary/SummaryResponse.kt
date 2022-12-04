package com.example.myapplication2.models.summary

import com.google.gson.annotations.SerializedName

data class SummaryResponse(
    @SerializedName("response" )
    val responseOne: List<SummaryResponseItem>


)