package com.example.mynamecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mynamecard.ui.theme.MyNameCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNameCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DrawMain("Android", "Developer")
                }
            }
        }
    }
}

@Composable
fun DrawMain(name: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.people1)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(8.dp)
        ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(width = 200.dp, height = 250.dp)
            )
        }
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .padding(8.dp)
        ) {
            Text(
                text = "$name",
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(16.dp)
            )
            Text(
                text = "$title",
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(16.dp)
            )
        }
        ShowContact("+1 (548) 398 1234", "@instagram", "test@gmail.com")
    }
}

@Composable
fun ShowContact(phone: String, social: String, email: String, modifier: Modifier = Modifier) {
    val icPhone = painterResource(R.drawable.ic_phone)
    val icSocial = painterResource(R.drawable.ic_instagram)
    val icEmail = painterResource(R.drawable.ic_email)
    val icWidth = 45.dp
    val icHeight = 45.dp
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(top = 30.dp)
    ) {
        Row (modifier = Modifier
            .align(Alignment.Start)
            .padding(10.dp)
        ) {
            Image(
                painter = icPhone,
                contentDescription = null,
                modifier = Modifier
                    .size(width = icWidth, height = icHeight)
                    .padding(end=10.dp)
            )
            Text(
                text = "$phone",
                fontSize = 24.sp,
            )
        }
        Row(modifier = Modifier
            .align(Alignment.Start)
            .padding(10.dp)
        ) {
            Image(
                painter = icSocial,
                contentDescription = null,
                modifier = Modifier
                    .size(width = icWidth, height = icHeight)
                    .padding(end=10.dp)
            )
            Text(
                text = "$social",
                fontSize = 24.sp,
            )
        }
        Row(modifier = Modifier
            .align(Alignment.Start)
            .padding(10.dp)
        ) {
            Image(
                painter = icEmail,
                contentDescription = null,
                modifier = Modifier
                    .size(width = icWidth, height = icHeight)
                    .padding(end=10.dp)
            )
            Text(
                text = "$email",
                fontSize = 24.sp,
            )
        }
    }
}
