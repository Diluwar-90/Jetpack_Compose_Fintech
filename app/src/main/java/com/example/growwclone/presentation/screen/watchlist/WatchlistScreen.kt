package com.example.growwclone.presentation.screen.watchlist

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.growwclone.data.model.Stock
import com.example.growwclone.data.repository.WatchlistRepository

@Composable
fun WatchlistScreen() {
    val watchlist = remember { mutableStateOf(WatchlistRepository.getWatchlist()) }

    LazyColumn {
        items(watchlist.value) { stock ->
            WatchlistItem(stock)
        }
    }
}

@Composable
fun WatchlistItem(stock: Stock) {
    Row(modifier = Modifier.padding(16.dp)) {
        Text(stock.name)
        Spacer(modifier = Modifier.weight(1f))
        Text("\$${stock.price}")
        if (stock.isInWatchlist) {
            Button(onClick = { WatchlistRepository.removeFromWatchlist(stock) }) {
                Text("Remove")
            }
        }
    }
}
