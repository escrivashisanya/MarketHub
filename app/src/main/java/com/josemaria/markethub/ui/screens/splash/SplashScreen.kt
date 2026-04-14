package com.josemaria.markethub.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.josemaria.markethub.R
import com.josemaria.markethub.navigation.ROUT_ONBOARDING
import com.josemaria.markethub.ui.theme.orange2
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){


    //Navigation

     val coroutine = rememberCoroutineScope()
    coroutine.launch {
        delay(2000)
        navController.navigate(route = ROUT_ONBOARDING)


    }

    //End of N avigation




    Column(
        modifier = Modifier
            .paint(painter = painterResource(id = R.drawable.img), contentScale = ContentScale.FillBounds)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center




    ) {


        Image(
            painter = painterResource(id = R.drawable.product),
            contentDescription = "product",
            modifier = Modifier.size(300.dp)

        )

























    }



}


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){

    SplashScreen(rememberNavController())
}