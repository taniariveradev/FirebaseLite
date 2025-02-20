package com.example.firebaselite

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.firebaselite.presentation.initial.InitialScreen
import com.example.firebaselite.presentation.login.LoginScreen
import com.example.firebaselite.presentation.signup.SignUpScreen

@Composable
fun NavigationWrapper(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = "initial") {
        composable("initial") {
            InitialScreen()
        }
        composable("login") {
            LoginScreen()
        }
        composable("signUp") {
            SignUpScreen()
        }
    }
}
