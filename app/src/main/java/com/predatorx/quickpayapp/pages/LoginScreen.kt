package com.predatorx.quickpayapp.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
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
import com.predatorx.quickpayapp.R

@Composable
fun LoginPageLayout(){

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column (modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.baby_blue)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painterResource(R.drawable.quickpay_logo), null)
        Spacer(Modifier.padding(top = 20.dp, bottom = 20.dp))
        TextField(email, onValueChange = {email = it}, label = { Text("Enter Email")})
        Spacer(Modifier.padding(top = 10.dp, bottom = 10.dp))
        TextField(password, onValueChange = {password = it}, label = { Text("Enter Password")})
        Spacer(Modifier.padding(top = 20.dp, bottom = 20.dp))
        Button(onClick = { /*TODO*/ }){
            Text("LOGIN", fontSize = 24.sp, modifier = Modifier.padding(10.dp))
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview(){
    LoginPageLayout()
}