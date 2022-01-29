package com.orderforyou

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.fragment.app.FragmentActivity
import com.orderforyou.navigation.Navigation
import com.orderforyou.ui.theme.OrderForYouTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OrderForYouTheme {
                Navigation()
            }


        }
    }
}

