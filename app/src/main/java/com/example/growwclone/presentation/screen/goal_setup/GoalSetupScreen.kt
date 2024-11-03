package com.example.growwclone.presentation.screen.goal_setup

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.growwclone.utils.Helper

@Composable
fun GoalSetupScreen() {
    var goalName by remember { mutableStateOf("") }
    var targetAmount by remember { mutableStateOf("") }
    var timeHorizon by remember { mutableStateOf("") }
    var monthlyInvestment by remember { mutableStateOf(0.0) }

    Column {
        TextField(
            value = goalName,
            onValueChange = { goalName = it },
            label = { Text("Goal Name") }
        )
        TextField(
            value = targetAmount,
            onValueChange = { targetAmount = it },
            label = { Text("Target Amount") }
        )
        TextField(
            value = timeHorizon,
            onValueChange = { timeHorizon = it },
            label = { Text("Time Horizon (Years)") }
        )
        Button(onClick = {
            monthlyInvestment = Helper().calculateMonthlyInvestment(
                targetAmount.toDouble(), timeHorizon.toInt()
            )
        }) {
            Text("Calculate Monthly Investment")
        }
        Text("Monthly Investment: \$${monthlyInvestment}")
    }
}
