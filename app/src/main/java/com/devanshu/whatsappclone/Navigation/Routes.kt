package com.devanshu.whatsappclone.Navigation

import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

@Serializable
sealed class Routes{
    @Serializable
    data object SplashScreen : Routes()

    @Serializable
    data object WelcomeScreen : Routes()

    @Serializable
    data object UserRegistrationScreen :Routes()

    @Serializable
    data object HomeScreen : Routes()
    companion object {

    }

    @Serializable
    data object pulse : Routes()

    @Serializable
    data object NexusScreen : Routes()

    @Serializable
    data object Ring : Routes()

}