package com.example.growwclone.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController

@Composable
fun BottomNavigationBar(navHostController: NavHostController) {
    //var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Stock,
        BottomNavItem.MutualFund,
        BottomNavItem.Account
    )
    var selectedItem by remember { mutableStateOf(items[0].route) }

    val selectedIcons = listOf(Icons.Filled.Home, Icons.Filled.Star, Icons.Filled.Menu, Icons.Filled.AccountBox)
    val unselectedIcons =
        listOf(Icons.Outlined.Home, Icons.Outlined.Star, Icons.Outlined.Menu, Icons.Outlined.AccountBox
        )

    NavigationBar {
        items.forEach { screen ->
            NavigationBarItem(
                icon = { Icon(screen.icon, contentDescription = screen.title) },
                label = { Text(screen.title) },
                selected = selectedItem == screen.route,
                alwaysShowLabel = true,
                onClick = {
                    selectedItem = screen.route
                    navHostController.navigate(screen.route)
                }
            )
        }
    }
}
