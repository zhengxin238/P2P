package com.example.myapplication2.models.summary

data class StoreFullSummaryModel(

    val appTitle: String,
    val averagePower: Int,
    val endTime: String,
    val energyConsumption: Int,
    val startTime: String
)