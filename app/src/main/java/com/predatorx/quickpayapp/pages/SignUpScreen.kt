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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.predatorx.quickpayapp.R

@Composable
fun SignUpPage(modifier: Modifier = Modifier){

    var userName by remember { mutableStateOf("")}
    var number by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var conPass by remember { mutableStateOf ("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.baby_blue))
        .padding(top = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painterResource(R.drawable.quickpay_logo), null)
        Spacer(Modifier.padding(top = 5.dp, bottom = 5.dp))
        Text(
            text = "SignUp Now",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.black)
        )
        Spacer(Modifier.padding(top = 10.dp, bottom = 10.dp))
        TextField(
            value = userName,
            onValueChange = {userName = it},
            label = { Text("Enter Username") },
            leadingIcon = { TextfieldIcon(painterResource(R.drawable.user))})
        Spacer(Modifier.padding(top = 5.dp, bottom = 5.dp))
        TextField(
            value = number,
            onValueChange = {number = it},
            label = { Text("Enter Mobile")},
            leadingIcon = { TextfieldIcon(painterResource(R.drawable.phone))})
        Spacer(Modifier.padding(top = 5.dp, bottom = 5.dp))
        TextField(value = email, onValueChange = {email = it}, label = { Text("Enter Email")}, leadingIcon = {
            Image(imageVector = Icons.Rounded.Email, contentDescription = null, colorFilter = ColorFilter.tint(color = Color.DarkGray)) }
        )
        Spacer(Modifier.padding(top = 5.dp, bottom = 5.dp))
        TextField(value = password, onValueChange = {password = it},  label = { Text("Enter Password")}, leadingIcon = { TextfieldIcon(
            painter = painterResource(id = R.drawable.lock)
        )})
        Spacer(Modifier.padding(top = 5.dp, bottom = 5.dp))
        TextField(value = conPass, onValueChange = {conPass = it}, label = { Text("Confirm Password")}, leadingIcon = { TextfieldIcon(
            painter = painterResource(id = R.drawable.key)
        )})
        Spacer(Modifier.padding(top = 15.dp, bottom = 15.dp))
        Button(onClick = { /*TODO*/ },
            colors = ButtonColors(
                containerColor = colorResource(id = R.color.black),
                contentColor = colorResource(id = R.color.white),
                disabledContainerColor = Color.LightGray,
                disabledContentColor = Color.Gray
            )
        ) {
            Text(text = "SUBMIT",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(5.dp),
            )
        }
        Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))
        Button(onClick = { /*TODO*/ },
            colors = ButtonColors(
                containerColor = colorResource(id = R.color.con_color),
                contentColor = colorResource(id = R.color.black),
                disabledContainerColor = Color.LightGray,
                disabledContentColor = Color.Gray
            )
        ) {
            Text("Already have an Account? Login Here!",)
        }
    }
}

@Composable
fun TextfieldIcon(painter: Painter){
    Image(
        painter = painter,
        contentDescription = null,
        modifier = Modifier
            .width(20.dp)
            .height(20.dp),
        colorFilter = ColorFilter.tint(color = Color.DarkGray)
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpScreenPreview(){
    SignUpPage()
}