package com.example.growwclone.presentation.screen.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.growwclone.presentation.navigation.BottomNavigationBar
import com.example.growwclone.presentation.navigation.BottomNavigationScreens
import com.example.growwclone.presentation.navigation.SetUpNavigationGraph

@Composable
fun HomeScreen(
    navHostController: NavHostController,
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    val navController = rememberNavController()

    val bottomNavigationItems = listOf(
        BottomNavigationScreens.HomeScreen,
        BottomNavigationScreens.StockScreen,
        BottomNavigationScreens.MutualFundScreen,
        BottomNavigationScreens.AccountScreen
    )

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController, bottomNavigationItems)
        },
    ) { innerPadding->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding) // Apply innerPadding to avoid content being obscured
        ){
           // SetUpNavigationGraph()
        }

    }


}
