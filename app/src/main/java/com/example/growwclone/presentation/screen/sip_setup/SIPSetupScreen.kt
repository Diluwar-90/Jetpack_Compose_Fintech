package com.example.growwclone.presentation.screen.sip_setup

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.growwclone.data.model.SIP
import com.example.growwclone.data.model.Stock
import com.example.growwclone.data.repository.SIPRepository

@Composable
fun SIPSetupScreen(stock: Stock) {
    var amount by remember { mutableStateOf("") }
    var frequency by remember { mutableStateOf("Monthly") }
    var startDate by remember { mutableStateOf("") }

    Column {
        TextField(
            value = amount,
            onValueChange = { amount = it },
            label = { Text("Amount") }
        )
        TextField(
            value = frequency,
            onValueChange = { frequency = it },
            label = { Text("Frequency") }
        )
        TextField(
            value = startDate,
            onValueChange = { startDate = it },
            label = { Text("Start Date") }
        )
        Button(onClick = {
            val sip = SIP(stock, amount.toDouble(), frequency, startDate)
            SIPRepository.addSIP(sip)
        }) {
            Text("Set up SIP")
        }
    }
}
