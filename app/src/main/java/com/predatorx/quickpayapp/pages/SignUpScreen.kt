package com.predatorx.quickpayapp.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun SignUpPageLayout(){

    var userName by remember { mutableStateOf("")}
    var number by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var con_pass by remember { mutableStateOf ("") }

    Column {
        TextField(value = userName, onValueChange = {userName = it})
    }

}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpScreenPreview(){
    SignUpPageLayout()
}