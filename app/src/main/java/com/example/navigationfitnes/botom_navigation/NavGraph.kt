package com.example.navigationfitnes.botom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

var nameOftrain:String = ""
var descriptionOfTrain:String = ""
@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "open"){

        composable("open"){
            Open(navHostController)
        }

        composable("screen_1"){
            Screen1{
                name, description ->
                run {
                    nameOftrain = name
                    descriptionOfTrain = description
                    navHostController.navigate("screen_2")
                }
            }
        }
        composable("screen_2"){
            Screen2(navHostController = navHostController, nameRecept = nameOftrain, description = descriptionOfTrain){
                navHostController.navigate("screen_1")

            }
        }

        composable("screen_5"){
            Screen5()
        }

    }
}

