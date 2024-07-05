package com.predatorx.quickpayapp.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.predatorx.quickpayapp.R
import java.time.format.TextStyle

@Composable
fun SignUpPageLayout(){

    var userName by remember { mutableStateOf("")}
    var number by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var con_pass by remember { mutableStateOf ("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.baby_blue)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painterResource(R.drawable.quickpay_logo), null)
        Spacer(Modifier.padding(top = 10.dp, bottom = 15.dp))
        Text(text = "SignUp Now", style = androidx.compose.ui.text.TextStyle( fontSize = 30.sp , color = Color.Black , fontWeight = FontWeight.Bold ))
        Spacer(Modifier.padding(top = 15.dp, bottom = 15.dp))
        TextField(value = userName, onValueChange = {userName = it}, label = { Text("Enter UserName:") })
        Spacer(Modifier.padding(top = 15.dp, bottom = 15.dp))
        TextField(value = number, onValueChange = {number = it}, label = { Text("Enter Contact Number")})
        Spacer(Modifier.padding(top = 15.dp, bottom = 15.dp))
        TextField(value = email, onValueChange = {email = it}, label = { Text("Enter Email")})
        Spacer(Modifier.padding(top = 15.dp, bottom = 15.dp))
        TextField(value = password, onValueChange = {password = it},  label = { Text("Enter Passsword")})
        Spacer(Modifier.padding(top = 15.dp, bottom = 15.dp))
        TextField(value = con_pass, onValueChange = {con_pass = it}, label = { Text("Enter Confirm Password")})
        Spacer(Modifier.padding(top = 15.dp, bottom = 15.dp))


    }

}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpScreenPreview(){
    SignUpPageLayout()
}