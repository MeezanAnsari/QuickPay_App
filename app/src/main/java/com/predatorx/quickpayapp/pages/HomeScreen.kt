package com.predatorx.quickpayapp.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.predatorx.quickpayapp.R

@Composable
fun HomePage(modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.baby_blue))
            .statusBarsPadding()
    ){
        TopBar(Modifier.padding(top = 30.dp))
        BalanceCard()
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
fun BalanceCard(modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 40.dp, start = 30.dp, end = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Card(
            colors = CardColors(
                containerColor = colorResource(R.color.black),
                contentColor = colorResource(R.color.white),
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.DarkGray
            ),
            modifier = Modifier
                .width(360.dp)
                .height(200.dp)
        ) {
            Column (modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp)
            ){
                Text(
                    text = "Hello {user}",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.padding(top = 50.dp))
                Text(text = "My Wallet Balance",
                    color = Color.LightGray,
                    fontSize = 24.sp)
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, end = 20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween){
                    Row (verticalAlignment = Alignment.CenterVertically){
                        Image(painterResource(R.drawable.indian_rupee_sign),
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(colorResource(R.color.white)),
                            modifier = Modifier
                                .width(25.dp)
                                .height(23.dp))
                        Spacer(modifier = Modifier.padding(start = 5.dp))
                        Text(
                            text = "649,500",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(painterResource(R.drawable.eye),
                            contentDescription = null,
                            modifier = Modifier
                                .width(30.dp)
                                .height(20.dp),
                            tint = Color.LightGray
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Services(modifier: Modifier = Modifier){
    Column (modifier = Modifier
        .fillMaxWidth()
        .padding(top = 40.dp, start = 30.dp, end = 30.dp)
    ){
        Text(
            text = "Payment Options",
            fontSize = 26.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(start = 10.dp)
        )
        Spacer(modifier = Modifier.padding(top = 12.dp, bottom = 12.dp))
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            ServiceCard(painterResource(R.drawable.id_badge), "Pay by UPI ID")
            ServiceCard(painterResource(R.drawable.mobile_screen), "Pay by Mobile No.")
            ServiceCard(painterResource(R.drawable.building_columns), "Pay by Bank")
        }
        Spacer(modifier = Modifier.padding(top = 20.dp, bottom = 20.dp))
        Text(
            text = "Bills, Recharge & More",
            fontSize = 26.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(start = 10.dp)
        )
        Spacer(modifier = Modifier.padding(top = 12.dp, bottom = 12.dp))
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            ServiceCard(painterResource(R.drawable.sim_card), "Recharge Mobile No.")
            ServiceCard(painterResource(R.drawable.copy), "Pay Bills")
            ServiceCard(painterResource(R.drawable.plus), "More to Come..")
        }
    }
}

@Composable
fun ServiceCard(painter: Painter, text: String){
    Card (
        modifier = Modifier
            .width(100.dp)
            .height(130.dp),
        colors = CardColors(
            containerColor = colorResource(R.color.con_color),
            contentColor = colorResource(R.color.black),
            disabledContainerColor = Color.Gray,
            disabledContentColor = Color.DarkGray
        ),
        onClick = {}
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp, end = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ){
            MyIcon(painter, 70, 70)
            Text(
                text = text,
                softWrap = true,
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                lineHeight = 17.sp
            )
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomePage()
}