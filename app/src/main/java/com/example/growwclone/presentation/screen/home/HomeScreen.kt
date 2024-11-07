package com.example.growwclone.presentation.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.growwclone.presentation.navigation.BottomNavigationBar
import com.example.growwclone.presentation.navigation.MainNavItems
import com.example.growwclone.presentation.navigation.SetUpNavigationGraph

@Composable
fun HomeScreen(
    navHostController: NavHostController,
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    Scaffold(
        bottomBar = { BottomNavigationBar(navHostController)  }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
        ) {
            Button(
                onClick = {
                    // Logout logic
                    homeViewModel.logout()
                    navHostController.navigate(MainNavItems.LoginScreen.route) {
                        popUpTo(0) { inclusive = true }
                    }
                },
                modifier = Modifier.wrapContentSize()
            ) {
                Text(text = "Logout")
            }
        }
    }
}