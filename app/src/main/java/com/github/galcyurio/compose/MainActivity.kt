package com.github.galcyurio.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.github.galcyurio.compose.ui.theme.TutAndroidComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(name = "Hello, world!")
        }
    }
}

@Composable
fun MessageCard(name: String) {
    Text(text = name)
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(name = "Android")
}
