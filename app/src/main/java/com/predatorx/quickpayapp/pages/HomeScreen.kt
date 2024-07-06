package com.predatorx.quickpayapp.pages

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
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    }
}

@Composable
fun TopBar(modifier: Modifier = Modifier){
    Row (modifier = modifier
        .fillMaxWidth()
        .padding(start = 30.dp, end = 30.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        MyIcon(painterResource(R.drawable.bell))

        Row (
            Modifier.width(120.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            MyIcon(painterResource(R.drawable.qrcode))
            MyIcon(painterResource(R.drawable.user))
        }
    }
}

@Composable
fun MyIcon(painter: Painter){
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
                .width(35.dp)
                .height(35.dp)
                .padding(5.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomePage()
}