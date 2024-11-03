package com.example.growwclone.data.model

data class InvestmentGoal(
    val goalName: String,
    val targetAmount: Double,
    val timeHorizon: Int,  // in years
    val monthlyInvestment: Double
)

