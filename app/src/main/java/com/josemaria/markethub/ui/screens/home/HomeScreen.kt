package com.josemaria.markethub.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationRailItemDefaults.colors
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        //TopAppBar
        val appBarColors = TopAppBarDefaults.topAppBarColors(
            containerColor = orange2,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White,
            actionIconContentColor = Color.White
        )

        TopAppBar(
            title = { Text(text = "Home") },

            colors = appBarColors,

            navigationIcon = {
                IconButton(onClick = { /* open menu */ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu"
                    )
                }
            },

            actions = {
                IconButton(onClick = { /* open notifications */ }) {
                    Icon(Icons.Default.Notifications, contentDescription = "Notifications")
                }
                IconButton(onClick = { /* share content */ }) {
                    Icon(Icons.Default.Share, contentDescription = "Share")
                }
                IconButton(onClick = { /* open cart */ }) {
                    Icon(Icons.Default.ShoppingCart, contentDescription = "Shopping Cart")
                }
            }
        )

        //End of TopAppBar

        Spacer(modifier = Modifier.height(20.dp))



        //SearchBar

        var search by remember { mutableStateOf("") }
        TextField(
            value = search,
            onValueChange = { search =it },
            modifier = Modifier.padding(start = 10.dp, end = 10.dp).fillMaxWidth(),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "")},
            placeholder = {  Text(text = "Search products,category...")}

        )


        //End of SearchBar

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = " Product Categories",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 20.dp)

        )


        Spacer(modifier = Modifier.height(20.dp))

        //Row

        Row(
            modifier = Modifier.padding(20.dp).horizontalScroll(rememberScrollState())
        ) {

            Column() {
                Image(
                    painter = painterResource(R.drawable.electronics),
                    contentDescription = "electronics",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop

                )
                Text(
                    text = "Electronics",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 20.dp)
                )
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column() {
                Image(
                    painter = painterResource(R.drawable.electronics),
                    contentDescription = "electronics",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop

                )
                Text(
                    text = "Electronics",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 20.dp)
                )
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column() {
                Image(
                    painter = painterResource(R.drawable.electronics),
                    contentDescription = "electronics",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop

                )
                Text(
                    text = "Electronics",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 20.dp)
                )
            }

            Spacer(modifier = Modifier.width(20.dp))


            Column() {
                Image(
                    painter = painterResource(R.drawable.electronics),
                    contentDescription = "electronics",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop

                )
                Text(
                    text = "Electronics",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 20.dp)
                )
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column() {
                Image(
                    painter = painterResource(R.drawable.electronics),
                    contentDescription = "electronics",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop

                )
                Text(
                    text = "Electronics",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 20.dp)
                )
            }



        }

        //End of Row






































    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}