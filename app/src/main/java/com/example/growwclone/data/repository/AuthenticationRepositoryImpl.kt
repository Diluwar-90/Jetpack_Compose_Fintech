package com.example.growwclone.data.repository

import com.example.growwclone.core.Response
import com.example.growwclone.domain.repository.AuthenticationRepository
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AuthenticationRepositoryImpl @Inject constructor(
    private val auth: FirebaseAuth
): AuthenticationRepository {
    override suspend fun login(email: String, password: String): Flow<Response<AuthResult>> {
        return flow {
            try {
                emit(Response.Loading)
                val data = auth.signInWithEmailAndPassword(email,password).await()
                emit(Response.Success(data))
            } catch (e: Exception){
                emit(Response.Error(e.localizedMessage?: "Oops, something went wrong."))
            }
        }
    }

    override suspend fun register(email: String, password: String): Flow<Response<AuthResult>> {
        return flow {
            try {
                emit(Response.Loading)
                val data = auth.createUserWithEmailAndPassword(email,password).await()
                emit(Response.Success(data))
            }catch (e:Exception){
                emit(Response.Error(e.localizedMessage?: "Oops, something went wrong."))
            }
        }
    }

    override suspend fun resetPassword(email: String): Flow<Response<Void?>> {
        return flow {
            try {

            } catch (e: Exception){
                emit(Response.Error(e.localizedMessage ?: "Oops, something went wrong."))
            }
        }
    }

    override suspend fun logout() {
        auth.signOut()
    }

    override suspend fun userId(): String {
        return auth.currentUser?.uid ?: ""
    }

    override suspend fun isLoggedIn(): Boolean {
        return auth.currentUser == null
    }

}