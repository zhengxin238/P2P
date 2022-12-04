package com.example.myapplication2.models.entry.response

data class MemoryInfo(
    val _id: String,
    val memoryStatistics: Double,
    val totalMemory: Int,
    val usedMemory: Int
)