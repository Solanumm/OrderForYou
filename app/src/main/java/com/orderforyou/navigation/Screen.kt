package com.orderforyou.navigation

sealed class Screen(val route: String) {
    object LoginScreen : Screen("LoginScreen")
    object Home: Screen("HomeScreen")
    object Register: Screen("Register")

    fun withArgs (vararg args:String) : String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
