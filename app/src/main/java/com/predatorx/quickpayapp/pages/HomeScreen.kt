package com.predatorx.quickpayapp.pages

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.predatorx.quickpayapp.AuthViewModel
import com.predatorx.quickpayapp.R

@Composable
fun HomePage(modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .background(colorResource(R.color.baby_blue))
    ){
        TopBar(Modifier.padding(top = 30.dp))
        Services()
    }
}

@Composable
fun TopBar(modifier: Modifier = Modifier){
    Row (modifier = modifier
        .fillMaxWidth()
        .padding(start = 30.dp, end = 30.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        MyIcon(painterResource(R.drawable.bell), 35, 35)

        Row (
            Modifier.width(120.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            MyIcon(painterResource(R.drawable.qrcode), 35, 35)
            MyIcon(painterResource(R.drawable.user), 35, 35)
        }
    }
}

@Composable
fun Services(modifier: Modifier = Modifier){
    Column (modifier = Modifier.fillMaxWidth()){
        Text(text = "Our Services", fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            ServiceCard()
            ServiceCard()
            ServiceCard()
        }
    }
}

@Composable
fun MyIcon(painter: Painter, width: Int, height: Int){
    IconButton(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .width(50.dp)
            .height(50.dp),
        colors = IconButtonColors(
            containerColor = colorResource(R.color.con_color),
            contentColor = Color.Transparent,
            disabledContainerColor = Color.Transparent,
            disabledContentColor = Color.Transparent)
    ) {
        Image(
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .width(width.dp)
                .height(height.dp)
                .padding(5.dp)
        )
    }
}

@Composable
fun ServiceCard(){
    Card (
        modifier = Modifier
            .width(120.dp)
            .height(140.dp),
        colors = CardColors(
            containerColor = colorResource(R.color.con_color),
            contentColor = colorResource(R.color.black),
            disabledContainerColor = Color.Gray,
            disabledContentColor = Color.DarkGray
        )
    ){
        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ){
            MyIcon(painterResource(R.drawable.qrcode), 70, 70)
            Text(text = "Hello")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomePage()
}