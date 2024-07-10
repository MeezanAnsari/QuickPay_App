package com.predatorx.quickpayapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.predatorx.quickpayapp.ui.theme.QuickPayAppTheme
import com.predatorx.quickpayapp.MyAppNavigation
import com.predatorx.quickpayapp.pages.LoginPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuickPayAppTheme {
                com.predatorx.quickpayapp.pages.HomePage()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    QuickPayAppTheme {
        com.predatorx.quickpayapp.pages.HomePage()
    }
}