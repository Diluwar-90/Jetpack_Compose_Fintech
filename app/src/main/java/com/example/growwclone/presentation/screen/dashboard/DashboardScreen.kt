package com.example.growwclone.presentation.screen.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DashboardScreen() {
    val stocks = listOf(
        Stock("AAPL", 150.0, 2.3),
        Stock("GOOG", 2800.0, 1.8),
        Stock("TSLA", 700.0, 4.5)
    )

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Your Portfolio", style = MaterialTheme.typography.headlineSmall)
        LazyColumn {
            items(stocks) { stock ->
                PortfolioItem(stock)
            }
        }
    }
}

@Composable
fun PortfolioItem(stock: Stock) {
    Row(modifier = Modifier.padding(16.dp)) {
        Text(stock.name, style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.weight(1f))
        Text("\$${stock.price}")
        Text("${stock.change}%")
    }
}

data class Stock(val name: String, val price: Double, val change: Double)
