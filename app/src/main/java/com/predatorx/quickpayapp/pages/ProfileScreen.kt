package com.predatorx.quickpayapp.pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.predatorx.quickpayapp.R

@Composable
fun ProfilePage(){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.baby_blue))
            .statusBarsPadding()
    ){
        UserInfo(painterResource(R.drawable.user), "Meezan")
        AccountDetailsCard()
        ViewTransactionsCard()
    }
}

@Composable
fun UserInfo(painter: Painter, name: String){
    val shape = RoundedCornerShape(50)
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 30.dp, bottom = 30.dp)){
        OutlinedCard(
            shape = shape,
            onClick = {},
            colors = CardColors(
                contentColor = Color.Transparent,
                containerColor = Color.Transparent,
                disabledContentColor = Color.Transparent,
                disabledContainerColor = Color.Transparent
            ),
            border = BorderStroke(2.dp, colorResource(R.color.black)),
        ) {
            Image(
                painter,
                contentDescription = null,
                modifier = Modifier
                    .width(130.dp)
                    .height(130.dp)
                    .padding(20.dp)
            )
        }
        Text("Hello, {$name}",
            fontSize = 32.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(top = 15.dp)
        )
    }
}

@Composable
fun AccountDetailsCard(){

    ElevatedCard (
        colors = CardColors(
            containerColor = colorResource(R.color.con_color),
            contentColor = colorResource(R.color.black),
            disabledContainerColor = Color.LightGray,
            disabledContentColor = Color.Gray),
        modifier = Modifier
            .width(370.dp)
            .padding(top = 30.dp),
    ){
        Column {
            AccountDetailsText(Modifier.padding(20.dp))
            AccountDetailsButton()
        }
    }
}

@Composable
fun AccountDetailsText(modifier: Modifier = Modifier){
    Column (modifier = modifier){
        Text(text = "Account Details", fontSize = 26.sp, fontWeight = FontWeight.SemiBold)
        BreakLine()
        Text(
            text = "Name : Meezan Ansari",
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp))
        Text(text = "Email : meezanansari130606@gmail.com", fontSize = 18.sp,
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp))
        Text(text = "Mobile No. : 7977402014", fontSize = 18.sp,
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp))
        Text(text = "Password : {Password}", fontSize = 18.sp,
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp))
        Text(text = "Account Balance : 649,500", fontSize = 20.sp,
            modifier = Modifier.padding(top = 5.dp))
    }
}

@Composable
fun AccountDetailsButton(){

    val shape = RoundedCornerShape(25)

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 20.dp, start = 20.dp, end = 20.dp)
    ){
        Button(onClick = { /*TODO*/ },
            colors = ButtonColors(
                containerColor = colorResource(R.color.black),
                contentColor = colorResource(R.color.white),
                disabledContainerColor = Color.LightGray,
                disabledContentColor = Color.Gray),
            shape = shape,
            modifier = Modifier.fillMaxWidth()
            ) {
            Text(text = "Update",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(3.dp)
            )
        }
    }
}

@Composable
fun ViewTransactionsCard(){
    Card (
        modifier = Modifier
            .padding(top = 50.dp, start = 25.dp, end = 25.dp)
            .height(60.dp),
        colors = CardColors(
            containerColor = colorResource(R.color.con_color),
            contentColor = colorResource(R.color.black),
            disabledContainerColor = Color.LightGray,
            disabledContentColor = Color.Gray),
        onClick = {}
    ){
        Column (verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 20.dp)
                ){
                    Icon(painterResource(R.drawable.rectangle_list),
                        contentDescription = null,
                        modifier = Modifier
                            .width(30.dp).height(25.dp))
                    Text(
                        text = "View all Transactions",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }
                Box(modifier = Modifier.padding(end = 20.dp)) {
                    Icon(
                        painterResource(R.drawable.chevron_right),
                        contentDescription = null,
                        modifier = Modifier
                            .width(20.dp)
                            .height(18.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun BreakLine(){
    val shape = RoundedCornerShape(50)
    Box (
        modifier = Modifier
            .padding(top = 20.dp, bottom = 20.dp)
    ){
        Card(
            shape = shape,
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp),
            colors = CardColors(
                containerColor = Color.DarkGray,
                contentColor = Color.DarkGray,
                disabledContainerColor = Color.LightGray,
                disabledContentColor = Color.Gray
            )
        ) {}
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfilePagePreview(){
    ProfilePage()
}