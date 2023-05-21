package com.github.galcyurio.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.github.galcyurio.compose.sample.SampleData
import com.github.galcyurio.compose.ui.theme.TutAndroidComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TutAndroidComposeTheme {
                Conversation(SampleData.conversationSample)
            }
        }
    }
}
