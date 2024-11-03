package com.example.growwclone.presentation.screen.kyc_document

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun KYCUploadScreen() {
    var fileName by remember { mutableStateOf("No File Selected") }

    Button(onClick = {
        // Logic to open file picker
    }) {
        Text("Upload KYC Document")
    }

    Text(text = "Selected File: $fileName")
}
