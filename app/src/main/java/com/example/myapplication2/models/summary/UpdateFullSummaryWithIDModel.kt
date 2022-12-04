package com.example.myapplication2.models.summary



data class UpdateFullSummaryWithIDModel (

    val summaryID: String,
    val appTitle: String,
    val startTime: String,
    val endTime: String,
    val averagePower: Int,
    val energyConsumption: Int

)