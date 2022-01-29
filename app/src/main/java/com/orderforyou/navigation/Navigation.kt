package com.orderforyou.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.orderforyou.home.HomeScreen
import com.orderforyou.login.LoginScreen
import com.orderforyou.register.RegisterScreen


@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.LoginScreen.route) {


        composable(route = Screen.LoginScreen.route) {
            LoginScreen(navController)
        }

        composable(route = Screen.Home.route) { entry ->
            HomeScreen()
        }

        composable(route = Screen.Register.route) { entry ->
            RegisterScreen(navController)
        }


    }


}