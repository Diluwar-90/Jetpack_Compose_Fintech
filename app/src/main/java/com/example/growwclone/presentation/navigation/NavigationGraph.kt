package com.example.growwclone.presentation.navigation

sealed class NavigationGraph(val route: String) {
    data object LoginScreen : NavigationGraph(route = "login_screen")
    data object RegisterScreen : NavigationGraph(route = "register_screen")
    data object HomeScreen : NavigationGraph(route = "home_screen")
    data object StockScreen : NavigationGraph(route = "stock_screen")
    data object MutualFundScreen : NavigationGraph(route = "mutual_fund_screen")
    data object AccountScreen : NavigationGraph(route = "account_screen")
}