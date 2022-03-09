package com.example.firstjetpackapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstjetpackapp.ui.theme.FirstJetpackAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstJetpackAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android", "Robert")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, robert: String) {
    Text(text = "Hello $robert!", fontSize = 30.sp, color = Color.Blue, textAlign = TextAlign.Right)
}

@Composable
fun myButton (name: String) {
    Button(
        onClick = { println("Hello World") },

        contentPadding = PaddingValues(
            start = 20.dp,
            top = 20.dp,
            end = 20.dp,
            bottom = 12.dp
        )

    ) {
        Text("Hey") // fix error
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstJetpackAppTheme {
        Greeting("Android", "Robert")
    }
}

@Composable
fun printText() {
    println("Hello World")
}