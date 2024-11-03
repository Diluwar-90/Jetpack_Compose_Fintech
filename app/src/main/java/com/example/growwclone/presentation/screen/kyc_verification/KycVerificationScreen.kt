package com.example.growwclone.presentation.screen.kyc_verification

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.growwclone.presentation.screen.kyc_document.KYCUploadScreen

@Composable
fun SimulateKYCVerificationScreen() {
    var isVerified by remember { mutableStateOf(false) }

    Column {
        KYCUploadScreen()
        Button(onClick = {
            // Simulate verification success/failure
            isVerified = true
        }) {
            Text("Submit for Verification")
        }
        Text(if (isVerified) "KYC Verified" else "Not Verified")
    }
}
