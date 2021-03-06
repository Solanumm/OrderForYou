package com.orderforyou.login

import android.content.Context
import android.util.Patterns
import android.widget.Toast
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class LoginScreenViewModel @Inject constructor(

): ViewModel(){


    fun login (email:String, password: String, context: Context): Boolean{
        if (email.isNullOrBlank() || password.isNullOrBlank()) {
            Toast.makeText(
                context,
                "Los campos no pueden estar vacios",
                Toast.LENGTH_SHORT
            ).show()
            return false
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(
                context,
                "Porfavor ingresa un Email Valido ",
                Toast.LENGTH_SHORT
            ).show()
            return false
        }

        if (email.isNullOrBlank() || password != "admin") {
            Toast.makeText(
                context,
                "Contraseña incorrecta",
                Toast.LENGTH_SHORT
            ).show()
            return false
        }
        return email == "admin@gmail.com" && password == "admin"


    }

}