package com.example.growwclone.presentation.screen.addfunds

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
import androidx.navigation.compose.rememberNavController

@Composable
fun AddFundsScreen() {
    var amount by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        TextField(
            value = amount,
            onValueChange = { amount = it },
            label = { Text("Amount") }
        )
        Button(onClick = {
            // Simulate adding funds to account
        }) {
            Text("Add Funds")
        }
    }
}

