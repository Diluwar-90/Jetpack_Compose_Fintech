package com.example.growwclone.data.repository

import com.example.growwclone.data.model.Stock

object WatchlistRepository {
    private val watchlist = mutableListOf<Stock>()

    fun addToWatchlist(stock: Stock) {
        if (!watchlist.contains(stock)) {
            watchlist.add(stock.copy(isInWatchlist = true))
        }
    }

    fun removeFromWatchlist(stock: Stock) {
        watchlist.remove(stock)
    }

    fun getWatchlist(): List<Stock> = watchlist
}
