package com.example.myapplication2.models.summary

data class SummaryResponseItem(
    val __v: Int,
    val _id: String,
    val appTitle: String,
    val averagePower: Int,
    val endTime: String,
    val energyConsumption: Int,
    val startTime: String
)