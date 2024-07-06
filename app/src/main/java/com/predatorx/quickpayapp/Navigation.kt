package com.predatorx.quickpayapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.predatorx.quickpayapp.pages.HomePage
import com.predatorx.quickpayapp.pages.LoginPage
import com.predatorx.quickpayapp.pages.SignUpPage

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier,navController: NavController, authViewModel: AuthViewModel){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login", builder = {
        composable("login"){
            LoginPage(modifier, navController, authViewModel)
        }
        composable("signup"){
            SignUpPage( modifier, navController, authViewModel)
        }
        composable("homescreen"){
            HomePage(modifier, navController, authViewModel)
        }
    })
}