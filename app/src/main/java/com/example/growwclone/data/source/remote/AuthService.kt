package com.example.growwclone.data.source.remote

import com.example.growwclone.data.model.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("auth/login")
    suspend fun signIn(
        @Body credentials: LoginRequest
    ): Response<User>
}

// Define the LoginRequest data class
data class LoginRequest(
    val email: String,
    val password: String
)