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
    fun login2(
        @Body loginBody : LoginBody
    ): Call<LoginResponse>

}
//
//object ApiClient {
//
//    val loggingInterceptor =
//        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
//    val client = OkHttpClient.Builder()
//        .addInterceptor(loggingInterceptor)
//        .build()
//    var BASE_URL:String="https://cosmetic-b.herokuapp.com"
//    val getClient: ApiServices
//        get() {
//
//            val gson = GsonBuilder()
//                .setLenient()
//                .create()
//
//            val retrofit = Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .client(client)
//                .addConverterFactory(GsonConverterFactory.create(gson))
//                .build()
//
//            return retrofit.create(ApiServices::class.java)
//        }
//}