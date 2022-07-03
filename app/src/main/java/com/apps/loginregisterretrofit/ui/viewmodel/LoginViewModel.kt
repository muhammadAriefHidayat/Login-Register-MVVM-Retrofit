package com.apps.loginregisterretrofit.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.apps.loginregisterretrofit.data.api.ApiServices
import com.apps.loginregisterretrofit.data.repository.MainRepository
import com.apps.loginregisterretrofit.model.LoginBody
import com.apps.loginregisterretrofit.model.LoginResponse
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoginViewModel(private val repository: MainRepository):ViewModel() {

    fun Login(loginBody: LoginBody) = viewModelScope.launch {
        Log.d("hasillog",loginBody.toString())
        repository.login(loginBody).collect{
            it.enqueue(object : Callback<LoginResponse> {
                override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                    Log.d("hasil", "res")
                    Log.d("hasil", "res :${response.toString()}")
                    val dataTOken = response.body()?.data
                    Log.d("hasil", "res :${dataTOken.toString()}")
                    Log.d("hasil", "token :${dataTOken?.token.toString()}")
                    Log.d("hasil", "res2 :${response.body().toString()}")
                }

                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                    Log.d("hasil", "error")
                }
            })
        }
    }
}