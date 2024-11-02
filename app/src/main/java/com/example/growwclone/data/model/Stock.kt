package com.example.growwclone.data.model

data class Stock(
    val name: String,
    val price: Double,
    val change: Double,
    var isInWatchlist: Boolean = false
)
