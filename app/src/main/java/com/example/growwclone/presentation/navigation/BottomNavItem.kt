package com.example.growwclone.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val route: String, val title: String, val icon: ImageVector) {
    data object Home : BottomNavItem("home", "Home", Icons.Default.Home)
    data object Stock : BottomNavItem("stock", "Stock", Icons.Default.Person)
    data object MutualFund : BottomNavItem("mutualfund", "Mutual Fund", Icons.Default.AccountBox)
    data object Account : BottomNavItem("account", "Account", Icons.Default.Settings)
}