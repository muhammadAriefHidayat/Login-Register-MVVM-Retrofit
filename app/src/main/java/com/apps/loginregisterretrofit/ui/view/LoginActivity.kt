package com.apps.loginregisterretrofit.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.apps.loginregisterretrofit.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.button.setOnClickListener {
            val email = binding.editText.text.toString()
            val password = binding.edtEmail.text.toString()
            when {
                email.isEmpty() -> {
                    binding.editText.error = "Masukkan Email"
                }
                password.isEmpty() -> {
                    binding.edtEmail.error = "Masukkan Password"
                }
                else -> {
//                    logoin(email, password)
                }
            }
        }

    }

//    fun logoin(email: String, passord: String) {
//        Log.d("hasil", email)
//        val loginBody = LoginBody(email, passord)
//        Log.d("hasil", loginBody.toString())
//
//        val apiService = ApiClient.getClient.login2(loginBody)
//
//        apiService.enqueue(object : Callback<LoginResponse> {
//            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
//                Log.d("hasil", "res")
//                Log.d("hasil", "res :${response.toString()}")
//                val listUser = response.body()?.data
//                Log.d("hasil", "token :${listUser?.token.toString()}")
//                Log.d("hasil", "res2 :${response.body().toString()}")
//            }
//
//            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
//                Log.d("hasil", "error")
//            }
//        })
//
//
////        Log.d("ceking", client.data.token.toString())
//    }
}