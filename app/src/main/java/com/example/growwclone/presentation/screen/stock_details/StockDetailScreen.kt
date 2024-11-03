package com.example.growwclone.presentation.screen.stock_details

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.growwclone.data.model.Stock
import com.example.growwclone.data.repository.WatchlistRepository

@Composable
fun StockDetailScreen(stock: Stock) {
    Column {
        Text(stock.name, style = MaterialTheme.typography.headlineSmall)
        Text("\$${stock.price}")
        Button(onClick = {
            if (stock.isInWatchlist) {
                WatchlistRepository.removeFromWatchlist(stock)
            } else {
                WatchlistRepository.addToWatchlist(stock)
            }
        }) {
            Text(if (stock.isInWatchlist) "Remove from Watchlist" else "Add to Watchlist")
        }
    }
}
