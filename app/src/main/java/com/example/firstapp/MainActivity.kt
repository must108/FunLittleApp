package com.example.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.firstapp.ui.theme.FirstAppTheme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            FirstAppTheme {
                Greetings()
            }
        }
    }
}

@Composable
fun Greetings() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        verticalArrangement = Arrangement.spacedBy(
            20.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello World! My name is Mustaeen Ahmed.",
            fontSize = 32.sp
        )

        Text(
            text = "My favorite color is Carolina Blue",
            fontSize = 32.sp
        )

        Text(
            text = "My lucky number is 8.",
            fontSize = 32.sp
        )

        Text(
            text = "More to follow!",
            fontSize = 32.sp
        )
    }
}