package com.devanshu.whatsappclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.devanshu.whatsappclone.Navigation.Navigation
import com.devanshu.whatsappclone.presentation.pulsestream.Mystream
import com.devanshu.whatsappclone.presentation.pulsestream.pulse
import com.devanshu.whatsappclone.ui.theme.WhatsappCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WhatsappCloneTheme {
                Navigation()
                }
            }
        }
}

