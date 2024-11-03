package com.example.growwclone.presentation.screen.payment

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun PaymentScreen() {
    var amount by remember { mutableStateOf("") }

    Column {
        TextField(
            value = amount,
            onValueChange = { amount = it },
            label = { Text("Enter Amount") }
        )
        Button(onClick = {
            // Simulate transaction
        }) {
            Text("Proceed to Pay")
        }
    }
}
