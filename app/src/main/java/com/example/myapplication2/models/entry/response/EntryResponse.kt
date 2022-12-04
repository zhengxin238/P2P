package com.example.myapplication2.models.entry.response

import com.google.gson.annotations.SerializedName

data class EntryResponse(
    @SerializedName("response" )
    val responseTwo: List<EntryModel>
)