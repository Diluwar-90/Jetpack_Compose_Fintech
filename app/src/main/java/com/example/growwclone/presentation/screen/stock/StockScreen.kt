package com.example.growwclone.presentation.screen.stock

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun StockScreen(navController: NavHostController) {
    Text(text = "Stock Screen")
    //var stockName by remember { mutableStateOf("") }
  /*  var quantity by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        TextField(
            value = stockName,
            onValueChange = { stockName = it },
            label = { Text("Stock Name") }
        )
        TextField(
            value = quantity,
            onValueChange = { quantity = it },
            label = { Text("Quantity") }
        )
        Button(onClick = {
            // Simulate stock buy
        }) {
            Text("Buy")
        }
    }*/
}
