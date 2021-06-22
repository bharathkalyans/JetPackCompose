package com.example.demoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.demoapp.ui.theme.DemoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /*Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Companion.Yellow),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text("Hello ")
                Text("World ")
                Text(" !")
            }*/
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Companion.Yellow),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text("Hello ")
                Text("World ")
                Text(" !")
            }

        }
    }
}

