package com.predatorx.quickpayapp.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
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
fun LoginPage(modifier: Modifier = Modifier){

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var enabledState by remember { mutableStateOf(true) }

    fun validate(value: String){
        if (value.isEmpty() || value.isBlank()){
            enabledState = false
        }
    }

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
            onValueChange = {
                email = it
                validate(email)
            },
            label = { Text("Enter Email")},
            leadingIcon = {Icon(Icons.Rounded.Email, contentDescription = null)},
        )
        Spacer(Modifier.padding(top = 10.dp, bottom = 10.dp))
        TextField(
            value = password,
            onValueChange = {
                password = it
                validate(password)
            },
            label = { Text("Enter Password")},
            leadingIcon = {
                Icon(
                    painterResource(R.drawable.key),
                    contentDescription = null,
                    modifier = Modifier
                        .width(25.dp)
                        .height(25.dp))
            }
        )
        Spacer(Modifier.padding(top = 20.dp, bottom = 20.dp))
        Button(
            enabled = enabledState,
            onClick = {},
            colors = ButtonColors(
                containerColor = colorResource(R.color.black),
                contentColor = colorResource(R.color.white),
                disabledContainerColor = Color.LightGray,
                disabledContentColor = Color.Gray
            ),
        ){
            Text("LOGIN", fontSize = 20.sp, modifier = Modifier.padding(6.dp))
        }

        Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

        Button(onClick = { /*TODO*/ },
            colors = ButtonColors(
                containerColor = colorResource(R.color.con_color),
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
    LoginPage()
}