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
import com.predatorx.quickpayapp.pages.LoginPageLayout
import com.predatorx.quickpayapp.pages.SignUpPageLayout
import com.predatorx.quickpayapp.ui.theme.QuickPayAppTheme
import com.predatorx.quickpayapp.MyAppNavigation

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val authViewModel: AuthViewModel by viewModels<> {  }

        setContent {
            QuickPayAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    MyAppNavigation(modifier = Modifier.padding(innerPadding), authViewModel = authViewModel)

                }
            }
        }
    }
}

@Composable
fun ScreenTest(){
    
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuickPayAppTheme {

    }
}