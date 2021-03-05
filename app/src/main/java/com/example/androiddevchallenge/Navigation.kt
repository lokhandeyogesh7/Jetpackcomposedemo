package com.example.androiddevchallenge

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.screens.PetList

@Composable
fun ComposeNavigation(){
    var navController = rememberNavController()

    NavHost(navController = navController, startDestination = "petList") {
        composable("petList") {
            PetList(navController)
        }
    }
}