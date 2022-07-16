package com.techhand.jetpackcomposelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.techhand.jetpackcomposelearning.ui.theme.JetpackComposeLearningTheme

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Column() or Row()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Green),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceBetween, // make the even space between the component/view
            /*
            Arrangement.SpaceEvenly // Make the same space between the all views in vertical
            Arrangement.SpaceAround //
             */
            ) {
                Text(text = "Hello")
                Text(text = "World")
                Text(text = "Nikunj")
            }
            
            Row(
                modifier = Modifier
                    .width(200.dp)
                    .fillMaxHeight()
                    .background(Color.Red),

                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Nikunj")
                Text(text = "Patel")
            }

        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeLearningTheme {
        Greeting("Android")
    }
}