package com.apps.loginregisterretrofit.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.apps.loginregisterretrofit.data.api.ApiServices
import com.apps.loginregisterretrofit.data.repository.MainRepository
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoginViewModel(private val repository: MainRepository):ViewModel() {

}