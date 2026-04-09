package com.josemaria.markethub.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.josemaria.markethub.R
import com.josemaria.markethub.ui.theme.orange2

@Composable
fun LoginScreen(navController: NavController){

    Column(
        modifier = Modifier
            .paint(painter = painterResource(R.drawable.img), contentScale = ContentScale.FillBounds)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {

        Image(
            painter = painterResource(R.drawable.product),
            contentDescription = "product",
            modifier = Modifier.size(200.dp)

        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = " Welcome Back!",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,


            )

        Spacer(modifier = Modifier.height(20.dp))


        //Variables

        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmpassword by remember { mutableStateOf("") }






        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "",tint = orange2)},
            label = { Text(text = "username")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = orange2,
                unfocusedBorderColor = orange2,
                cursorColor = orange2
            )
        )





        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "",tint = orange2)},
            label = { Text(text = "email")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = orange2,
                unfocusedBorderColor = orange2,
                cursorColor = orange2
            )
        )




        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "",tint = orange2)},
            label = { Text(text = "password")}, colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = orange2,
                unfocusedBorderColor = orange2,
                cursorColor = orange2
            )
        )

        Spacer(modifier = Modifier.height(20.dp))




        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = orange2),
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.width(350.dp)
        ) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.height(20.dp))

        TextButton(onClick = {}) {
            Text(text = "Don't have an account?  Register")
        }







































    }


    }






@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){

    LoginScreen(rememberNavController())
}