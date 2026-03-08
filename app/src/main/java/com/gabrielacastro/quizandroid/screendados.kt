package com.gabrielacastro.quizandroid

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun screendados(){
    var number by remember { mutableStateOf( (1..6).random()) }
    val list = listOf(R.drawable.dice_1,R.drawable.dice_2,R.drawable.dice_3,R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6)
    val context = LocalContext.current
    Scaffold(
        topBar = {mitopbar()}
    ) {innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally, //centra horizontalmente
            verticalArrangement = Arrangement.Center) {//centra verticalmente
            val image = if(number == 1) R.drawable.dice_1
            else if(number == 2) R.drawable.dice_2
            else if(number == 3) R.drawable.dice_3
            else if(number == 4) R.drawable.dice_4
            else if(number == 5) R.drawable.dice_5
            else R.drawable.dice_6

            val painter = painterResource(image)

            Image(
                painter = painter,
                contentDescription = null,
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
                number = (1..6).random()
                Toast
                    .makeText(context,"El numero obtenido fue: $number", Toast.LENGTH_LONG)
                    .show()
            }) {

                Text(text = "Lanza el dado!!!")
            }
        }

    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun mitopbar(){
    TopAppBar(
        title = {Text(text = "Lanzar dado app")},
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFC8A2C8))
    )
}