package com.example.navigationfitnes.botom_navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigationfitnes.R

@Composable
fun Open(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.girl), contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
            )
        Text(
            modifier = Modifier
                .padding(20.dp)
                .wrapContentHeight(),
            text = "Fitness at Home",
            fontSize = 46.sp,
            textAlign = TextAlign.Center
        )
        Button( modifier = Modifier.padding(15.dp),
            onClick = { navController.navigate("MainScreen") }) {
            Text(fontSize = 30.sp , text = "Open")
        }
//        Button(modifier = Modifier,
//            onClick = { }) {
//            Text(fontSize = 20.sp, text = "Sing in")
//        }
    }
}



@Composable
fun Screen1() {
    Text(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(),
        text = "Screen1",
        textAlign = TextAlign.Center
    )
}
@Composable
fun Screen2() {
    Text(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(),
        text = "Screen2",
        textAlign = TextAlign.Center
    )
}
@Composable
fun Screen3() {
    Text(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(),
        text = "Screen3",
        textAlign = TextAlign.Center
    )
}
@Composable
fun Screen4() {
    Text(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(),
        text = "Screen4",
        textAlign = TextAlign.Center
    )
}
@Composable
fun Screen5() {
    Text(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(),
        text = "Screen5",
        textAlign = TextAlign.Center
    )
}