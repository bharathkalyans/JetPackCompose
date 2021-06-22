package com.example.demoapp

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.demoapp.ui.theme.DemoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Yellow)
                    .padding(20.dp, 40.dp)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
            ) {
                Text(
                    "Hello ", modifier = Modifier
                        .offset(0.dp,20.dp),
                    color = Color.Red,
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text("World ")

            }

        }

    }
}

