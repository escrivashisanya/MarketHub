package com.josemaria.markethub.ui.screens.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.josemaria.markethub.R

@Composable
fun LoginScreen(){

    Column(
        modifier = Modifier
            .paint(painter = painterResource(R.drawable.img), contentScale = ContentScale.FillBounds)
            .fillMaxSize()






    ) {






































    }



}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){

    LoginScreen()
}