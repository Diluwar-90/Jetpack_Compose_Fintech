package com.example.growwclone.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun BottomNavigationBar(
    currentRoute: String,
    onNavigate: (String) -> Unit
) {
    val navController = rememberNavController()
    BottomNavigation {
        val items = listOf(
            NavigationGraph.HomeScreen,
            NavigationGraph.StockScreen,
            NavigationGraph.MutualFundScreen,
            NavigationGraph.AccountScreen
        )

        items.forEach { screen ->
            BottomNavigationItem(
                icon = { Icon(Icons.Filled.Home, contentDescription = null) }, // Replace with appropriate icons
                label = { Text(screen.route.replace("_", " ").capitalize()) },
                selected = currentRoute == screen.route,
                onClick = {
                    onNavigate(screen.route)
                }
            )
        }
    }
}

@Composable
fun BottomNavigationItem(
    icon: @Composable () -> Unit,
    label: @Composable () -> Unit,
    selected: Boolean,
    onClick: () -> Unit
) {
    TODO("Not yet implemented")
}

@Composable
fun BottomNavigation(content: @Composable () -> Unit) {

}
