package com.example.growwclone.utils

class Helper {
    fun calculateMonthlyInvestment(targetAmount: Double, timeHorizon: Int, interestRate: Double = 0.07): Double {
        val months = timeHorizon * 12
        val ratePerMonth = interestRate / 12
        return (targetAmount * ratePerMonth) / (Math.pow(1 + ratePerMonth, months.toDouble()) - 1)
    }

}