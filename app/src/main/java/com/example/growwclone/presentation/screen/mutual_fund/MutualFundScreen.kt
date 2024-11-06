package com.example.growwclone.presentation.screen.mutual_fund

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.growwclone.presentation.navigation.BottomNavigationBar

@Composable
fun MutualFundScreen(navHostController: NavHostController) {
        Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
            Text(text = "Mutual FUnd Screen")
        }
}