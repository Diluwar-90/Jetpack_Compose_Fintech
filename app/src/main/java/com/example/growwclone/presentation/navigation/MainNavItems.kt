package com.example.growwclone.presentation.navigation

sealed class MainNavItems(val route: String) {
    data object LoginScreen : MainNavItems(route = "login_screen")
    data object RegisterScreen : MainNavItems(route = "register_screen")
    data object HomeScreen : MainNavItems(route = "home")
    data object StockScreen : MainNavItems(route = "stock")
    data object MutualFundScreen : MainNavItems(route = "mutualfund")
    data object AccountScreen : MainNavItems(route = "account")
    data object Dashboard : MainNavItems(route = "dashboard")
}