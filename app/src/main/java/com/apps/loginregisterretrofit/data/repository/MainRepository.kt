package com.apps.loginregisterretrofit.data.repository

import com.apps.loginregisterretrofit.data.datastore.RemoteDataSource
import com.apps.loginregisterretrofit.model.LoginBody

class MainRepository (private val remoteDataSource: RemoteDataSource){
    fun login(loginBody: LoginBody) = remoteDataSource.register(loginBody   )
}