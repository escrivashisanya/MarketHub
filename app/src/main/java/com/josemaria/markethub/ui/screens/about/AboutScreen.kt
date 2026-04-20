package com.josemaria.markethub.ui.screens.about

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.josemaria.markethub.navigation.ROUT_HOME
import com.josemaria.markethub.ui.theme.orange2

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavController ){


    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(


        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("About us") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Black")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = orange2,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },




        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = orange2
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home", tint = Color.Black) },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites", tint = Color.Black) },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile", tint = Color.Black) },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )



            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = orange2
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {


                //Main Contents of the page

                //SearchBar

                var search by remember { mutableStateOf("") }
                TextField(
                    value = search,
                    onValueChange = { search = it },
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp)
                        .fillMaxWidth(),
                    leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
                    placeholder = { Text(text = "Search about us...") }

                )


                //End of SearchBar













            }
        }
    )

    //End of scaffold









}


@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){

    AboutScreen(rememberNavController())
}