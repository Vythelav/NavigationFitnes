package com.example.navigationfitnes.botom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "Open"){

        composable("Open"){
            Screen1()
        }
        composable("screen_1"){
            Screen1()
        }
        composable("screen_2"){
            Screen2()
        }
        composable("screen_3"){
            Screen3()
        }
        composable("screen_4"){
            Screen4()
        }
        composable("screen_5"){
            Screen5()
        }

    }
}