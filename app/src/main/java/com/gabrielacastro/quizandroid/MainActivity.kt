package com.gabrielacastro.quizandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gabrielacastro.quizandroid.ui.theme.QuizAndroidGabrielaCastroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            pantalla1()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun pantalla1(){
    Column(modifier = Modifier.padding(16.dp).fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween)
    {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center)
        {
            Text(text = "Encabezado", modifier = Modifier.background(Color.Yellow).padding(8.dp))

        }

        Row(modifier = Modifier.padding(16.dp).fillMaxWidth().background(Color.Green), horizontalArrangement = Arrangement.SpaceEvenly)
        {
            Text(text = "Item 1", modifier = Modifier.padding(16.dp).background(Color.Yellow))
            Text(text = "Item 2", modifier = Modifier.padding(16.dp).background(Color.Blue))
            Text(text = "Item 3",  modifier = Modifier.padding(16.dp).background(Color.Red))
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center)
        {
            Text(text = "Pie de pagina", modifier = Modifier.padding(16.dp).background(Color.LightGray))

        }
    }

}