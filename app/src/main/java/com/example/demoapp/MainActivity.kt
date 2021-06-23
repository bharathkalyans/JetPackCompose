package com.example.demoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp
                            )
                        ) {
                            append("B")
                        }
                        append("harath ")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp
                            )
                        ) {
                            append("K")
                        }
                        append("alyan")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
                                fontSize = 50.sp
                            )
                        ) {
                            append(" S")
                        }
                    },
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline,
                )
            }
        }
    }

    /* @Composable
     fun ImageCard(
         painter: Painter,
         title: String,
         contentDescription: String,
         modifier: Modifier = Modifier
     ) {
         Card(
             modifier = modifier,
             shape = RoundedCornerShape(20.dp),
             elevation = 5.dp
         ) {
             Box(modifier = Modifier.height(400.dp)) {
                 //Image
                 Image(
                     painter = painter,
                     contentDescription = contentDescription,
                     contentScale = ContentScale.Crop
                 )
                 //Using for Gradient!
                 Box(
                     modifier = Modifier
                         .fillMaxSize()
                         .background(
                             Brush.verticalGradient(
                                 colors = listOf(Color.Transparent, Color.Black),
                                 startY = 300f
                             )
                         )
                 )
                 //Text
                 Text(
                     text = title,
                     modifier = Modifier
                         .align(Alignment.BottomStart)
                         .padding(16.dp),
                     color = Color.White
                 )

             }
         }
     }*/

}

