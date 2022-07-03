package com.apps.loginregisterretrofit.data.api

import com.apps.loginregisterretrofit.model.LoginBody
import com.apps.loginregisterretrofit.model.LoginResponse
import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface ApiServices {
    @Headers("Content-Type: application/json")
    @POST("/api/v1/auth/login")
    suspend fun login2(
        @Body loginBody : LoginBody
    ): Call<LoginResponse>

}
