package com.orderforyou

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.orderforyou.login.LoginScreen
import com.orderforyou.ui.theme.OrderForYouTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OrderForYouTheme {
                LoginScreen()
            }


        }
    }
}

