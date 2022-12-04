package com.example.myapplication2.models.entry.source

data class StoreFullEntryModel(

    val appInfo: AppInfoOriginal,
    val batteryInfo: BatteryInfoOriginal,
    val cpuInfo: CpuInfoOriginal,
    val memoryInfo: MemoryInfoOriginal,
    val summaryID: Int,

    )
