package com.example.firebaselite

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.firebaselite.presentation.home.HomeScreen
import com.example.firebaselite.presentation.initial.InitialScreen
import com.example.firebaselite.presentation.login.LoginScreen
import com.example.firebaselite.presentation.signup.SignUpScreen
import com.google.firebase.auth.FirebaseAuth

@Composable
fun NavigationWrapper(
    navHostController: NavHostController,
    auth: FirebaseAuth
) {

    NavHost(navController = navHostController, startDestination = "initial") {
        composable("initial") {
            InitialScreen(navigateToLogin = { navHostController.navigate("logIn") },
                navigateToSignUp = { navHostController.navigate("signUp") })
        }
        composable("logIn") {
            LoginScreen(auth) { navHostController.navigate("home") }
        }
        composable("signUp") {
            SignUpScreen(auth)
        }
        composable("home") {
            HomeScreen()
        }
    }
}
