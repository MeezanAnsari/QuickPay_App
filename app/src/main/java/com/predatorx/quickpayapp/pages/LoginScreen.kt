package com.predatorx.quickpayapp.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.predatorx.quickpayapp.AuthViewModel
import com.predatorx.quickpayapp.R

@Composable
fun LoginPage(modifier: Modifier = Modifier, navController: NavController, authViewModel: AuthViewModel){

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column (modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.baby_blue))
        .statusBarsPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painterResource(R.drawable.quickpay_logo), null)
        Spacer(Modifier.padding(top = 20.dp, bottom = 20.dp))
        TextField(
            value = email,
            onValueChange = {email = it},
            label = { Text("Enter Email")},
            leadingIcon = {Icon(Icons.Rounded.Email, contentDescription = null)}
        )
        Spacer(Modifier.padding(top = 10.dp, bottom = 10.dp))
        TextField(
            password,
            onValueChange = {password = it},
            label = { Text("Enter Password")},
            leadingIcon = { Icon(Icons.Rounded.Lock, contentDescription = null)})
        Spacer(Modifier.padding(top = 20.dp, bottom = 20.dp))
        Button(onClick = { /*TODO*/ },
            colors = ButtonColors(
                containerColor = colorResource(R.color.black),
                contentColor = colorResource(R.color.white),
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.DarkGray
            )
        ){
            Text("LOGIN", fontSize = 20.sp, modifier = Modifier.padding(6.dp))
        }

        Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

        Button(onClick = { /*TODO*/ },
            colors = ButtonColors(
                containerColor = Color.Transparent,
                contentColor = colorResource(R.color.black),
                disabledContainerColor = Color.Transparent,
                disabledContentColor = Color.DarkGray
            )
        ) {
            Text("Don't have an Account?  SignUp Now!", fontSize = 18.sp)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview(){

}