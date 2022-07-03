package com.apps.loginregisterretrofit.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import com.apps.loginregisterretrofit.databinding.ActivityLoginBinding
import com.apps.loginregisterretrofit.model.LoginBody
import com.apps.loginregisterretrofit.ui.viewmodel.LoginViewModel
import com.apps.loginregisterretrofit.ui.viewmodel.ViewModelFactory

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private val loginViewModel : LoginViewModel by viewModels {
        ViewModelFactory.getInstance(this)
    }

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
                    val loginBody = LoginBody(email,password)
                    loginViewModel.Login(loginBody)
                }
            }
        }

    }
}