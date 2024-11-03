package com.example.growwclone.presentation.screen.price_alert

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.growwclone.data.model.Stock

@Composable
fun PriceAlertScreen(stock: Stock) {
    var alertPrice by remember { mutableStateOf("") }

    Column {
        TextField(
            value = alertPrice,
            onValueChange = { alertPrice = it },
            label = { Text("Set Price Alert") }
        )
        Button(onClick = {
            // Simulate price alert set
        }) {
            Text("Set Alert")
        }
    }
}
