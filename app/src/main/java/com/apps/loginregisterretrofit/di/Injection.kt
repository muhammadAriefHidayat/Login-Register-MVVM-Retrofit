package com.apps.loginregisterretrofit.di

import android.content.Context
import com.apps.loginregisterretrofit.data.api.ApiConfig
import com.apps.loginregisterretrofit.data.datastore.RemoteDataSource
import com.apps.loginregisterretrofit.data.repository.MainRepository

object Injection {
    fun provideRepository(context: Context): MainRepository {
        val apiServices = ApiConfig.getApiService()
        val remoteDataSource = RemoteDataSource(apiServices)
        return MainRepository(remoteDataSource)
    }
}