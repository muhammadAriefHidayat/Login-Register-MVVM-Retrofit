package com.apps.loginregisterretrofit.data.api

import com.apps.loginregisterretrofit.model.LoginBody
import com.apps.loginregisterretrofit.model.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiServices {
    @POST("/api/v1/auth/login")
    suspend fun login(
        @Body loginBody: LoginBody
    ): LoginResponse
}