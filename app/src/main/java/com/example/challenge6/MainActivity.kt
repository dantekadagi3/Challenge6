package com.example.challenge6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.challenge6.ui.theme.Challenge6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Challenge6Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                     interfaceFive()
                }
            }
        }
    }
}

@Composable
fun interfaceFive(){
    Column (modifier=Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.road)
            , contentDescription = null,
            )
        Text(text = "")
        Text(text = "")

        Button(onClick = { /*TODO*/ }) {
            //button content
        }
        Text(text = "")
    }
}