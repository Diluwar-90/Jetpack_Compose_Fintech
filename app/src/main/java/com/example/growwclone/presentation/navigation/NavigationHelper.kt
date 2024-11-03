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
            NavigationGraph.LoginScreen.route
        else
            NavigationGraph.HomeScreen.route
    ) {
        composable(
            route = NavigationGraph.HomeScreen.route
        ) {
            HomeScreen(navHostController = navHostController)
        }
        composable(
            route = NavigationGraph.LoginScreen.route
        ) {
            LoginScreen(navHostController)
        }
        composable(
            route = NavigationGraph.RegisterScreen.route
        ) {
            RegisterScreen(navHostController)
        }

        composable(route = NavigationGraph.StockScreen.route) {
            StockScreen(navHostController)
        }
        composable(route = NavigationGraph.MutualFundScreen.route) { MutualFundScreen(navHostController) }
        composable(route = NavigationGraph.AccountScreen.route) { AccountScreen(navHostController) }
    }

    // Bottom Navigation
    val currentBackStackEntry by navHostController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry?.destination?.route ?: NavigationGraph.HomeScreen.route

    BottomNavigationBar(currentRoute) { route ->
        navHostController.navigate(route) {
            // Clear back stack to prevent multiple copies of screens
            popUpTo(navHostController.graph.startDestinationId) { saveState = true }
            launchSingleTop = true
            restoreState = true
        }
    }
}