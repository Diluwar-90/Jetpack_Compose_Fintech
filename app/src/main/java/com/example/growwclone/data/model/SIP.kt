package com.example.growwclone.data.model

data class SIP(
    val stock: Stock,
    val amount: Double,
    val frequency: String,  // e.g., "Monthly"
    val startDate: String
)