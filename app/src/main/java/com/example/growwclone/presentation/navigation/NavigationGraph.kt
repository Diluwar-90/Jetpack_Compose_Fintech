package com.example.growwclone.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.growwclone.presentation.screen.account.AccountScreen
import com.example.growwclone.presentation.screen.dashboard.DashboardScreen
import com.example.growwclone.presentation.screen.home.HomeScreen
import com.example.growwclone.presentation.screen.login.LoginScreen
import com.example.growwclone.presentation.screen.mutual_fund.MutualFundScreen
import com.example.growwclone.presentation.screen.register.RegisterScreen
import com.example.growwclone.presentation.screen.stock.StockScreen

@Composable
fun SetUpNavigationGraph(
    navHostController: NavHostController = rememberNavController(),
    authenticationNavigationViewModel: AuthenticationNavigationViewModel = hiltViewModel()
) {
    NavHost(
        navController = navHostController,
        startDestination = if (authenticationNavigationViewModel.isLoggedInState.value)
            MainNavItems.LoginScreen.route
        else
            MainNavItems.HomeScreen.route
    ) {
        composable(
            route = MainNavItems.HomeScreen.route
        ) {
            HomeScreen(navHostController = navHostController)
        }
        composable(
            route = MainNavItems.LoginScreen.route
        ) {
            LoginScreen(navHostController)
        }
        composable(
            route = MainNavItems.RegisterScreen.route
        ) {
            RegisterScreen(navHostController)
        }

        composable(route = MainNavItems.StockScreen.route) {
            StockScreen(navHostController)
        }
        composable(route = MainNavItems.MutualFundScreen.route) { MutualFundScreen(navHostController) }
        composable(route = MainNavItems.AccountScreen.route) { AccountScreen(navHostController) }
        composable(route = MainNavItems.Dashboard.route) { DashboardScreen(navHostController) }
    }

    // Bottom Navigation
    val currentBackStackEntry by navHostController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry?.destination?.route ?: MainNavItems.HomeScreen.route

}