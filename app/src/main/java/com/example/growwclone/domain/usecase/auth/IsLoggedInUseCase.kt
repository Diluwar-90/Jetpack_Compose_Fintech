package com.example.growwclone.domain.usecase.auth

import com.example.growwclone.domain.repository.AuthenticationRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class IsLoggedInUseCase @Inject constructor(
    private val authenticationRepository: AuthenticationRepository
) {
    operator fun invoke() = flow { emit(authenticationRepository.isLoggedIn()) }
}