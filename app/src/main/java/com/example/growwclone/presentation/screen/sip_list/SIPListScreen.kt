package com.example.growwclone.presentation.screen.sip_list

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.growwclone.data.repository.SIPRepository

@Composable
fun SIPListScreen() {
    val sips = SIPRepository.getSIPs()

    LazyColumn {
        items(sips) { sip ->
            Row(modifier = Modifier.padding(16.dp)) {
                Text("${sip.stock.name} - \$${sip.amount} - ${sip.frequency}")
            }
        }
    }
}
