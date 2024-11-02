package com.example.growwclone.domain.usecase.auth

import com.example.growwclone.domain.repository.AuthenticationRepository
import javax.inject.Inject

class RegisterUseCase @Inject constructor(
    private val authenticationRepository: AuthenticationRepository
) {
    suspend operator fun invoke(email: String,password: String) = authenticationRepository.register(email,password)
}