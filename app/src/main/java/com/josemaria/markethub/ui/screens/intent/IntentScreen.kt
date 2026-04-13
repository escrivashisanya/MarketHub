package com.josemaria.markethub.ui.screens.intent

import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.josemaria.markethub.R
import com.josemaria.markethub.navigation.ROUT_INTENT
import com.josemaria.markethub.navigation.ROUT_REGISTER
import com.josemaria.markethub.ui.theme.orange2


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){

    val mContext = LocalContext.current

    Column(
        modifier = Modifier
            .paint(painter = painterResource(R.drawable.img), contentScale = ContentScale.FillBounds)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,


    ) {


        //TopAppBar
        val appBarColors = TopAppBarDefaults.topAppBarColors(
            containerColor = orange2,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White,
            actionIconContentColor = Color.White
        )

        TopAppBar(
            title = { Text(text = "Intent") },

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

        Button(
            onClick = {  val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }},
            colors = ButtonDefaults.buttonColors(containerColor = orange2),
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.width(350.dp)
        ) {
            Text(text = "Pay via Mpesa")
        }

        Spacer(modifier = Modifier.height(20.dp))


        Button(
            onClick = {  val smsIntent= Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0720245837".toUri()
                smsIntent.putExtra("sms_body","Hello Glory,how was your day?")
                mContext.startActivity(smsIntent)
            },
            colors = ButtonDefaults.buttonColors(containerColor = orange2),
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.width(350.dp)
        ) {
            Text(text = "Send Message")
        }

        Spacer(modifier = Modifier.height(20.dp))



        Button(
            onClick = {  val callIntent= Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0720245837".toUri()
                mContext.startActivity(callIntent)
            },
            colors = ButtonDefaults.buttonColors(containerColor = orange2),
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.width(350.dp)
        ) {
            Text(text = "Call")
        }

        Spacer(modifier = Modifier.height(20.dp))



        Button(
            onClick = {  val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                    mContext.startActivity(cameraIntent)
                }else{
                    println("Camera app is not available")
                }},
            colors = ButtonDefaults.buttonColors(containerColor = orange2),
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.width(350.dp)
        ) {
            Text(text = "Camera")
        }

        Spacer(modifier = Modifier.height(20.dp))



        Button(
            onClick = { val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                mContext.startActivity(shareIntent)},
            colors = ButtonDefaults.buttonColors(containerColor = orange2),
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.width(350.dp)
        ) {
            Text(text = "Email")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {  val shareIntent=Intent(Intent.ACTION_SEND)
                shareIntent.type="text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, "https://github.com/gloryakinyi")
                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))},
            colors = ButtonDefaults.buttonColors(containerColor = orange2),
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.width(350.dp)
        ) {
            Text(text = "Share")
        }


































    }



}


@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){

    IntentScreen(rememberNavController())
}