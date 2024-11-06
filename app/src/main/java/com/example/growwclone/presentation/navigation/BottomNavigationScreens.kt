package com.example.growwclone.presentation.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationScreens(val route: String, val resourceId: String, val icon: ImageVector) {
    data object HomeScreen : BottomNavigationScreens("HomeScreen", "Home", Icons.Filled.Home)
    data object StockScreen : BottomNavigationScreens("StockScreen", "Stock", Icons.Filled.Star)
    data object MutualFundScreen : BottomNavigationScreens("MutualFundScreen", "MutualFund", Icons.Filled.Face)
    data object AccountScreen : BottomNavigationScreens("AccountScreen", "Account", Icons.Filled.AccountBox)
}
