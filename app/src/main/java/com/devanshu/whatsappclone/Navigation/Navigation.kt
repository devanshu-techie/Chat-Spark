package com.devanshu.whatsappclone.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.devanshu.whatsappclone.presentation.Nexus.NexusScreen
import com.devanshu.whatsappclone.presentation.Ring.Ring
import com.devanshu.whatsappclone.presentation.homescreen.HomeScreen
import com.devanshu.whatsappclone.presentation.pulsestream.pulse
import com.devanshu.whatsappclone.presentation.splashscreen.SplashScreen
import com.devanshu.whatsappclone.presentation.userregistrationscreen.UserRegistrationScreen
import com.devanshu.whatsappclone.presentation.welcomescreen.WelcomeScreen

@Composable
fun Navigation()
{
    ////////////Start Screen =======Splash Screen ===============////////////
    val navController = rememberNavController()
    NavHost(navController = navController , startDestination = Routes.SplashScreen)
{
        composable <Routes.SplashScreen>{
            SplashScreen(navController)
        }

    composable <Routes.WelcomeScreen>
    {
        WelcomeScreen(navController)
    }
    composable<Routes.UserRegistrationScreen>
    {
        UserRegistrationScreen(navHostController = navController)
    }

    composable <Routes.HomeScreen>
    { HomeScreen(navController) }

    composable < Routes.pulse >
    {
        pulse()
    }

    composable <Routes.NexusScreen>{
        NexusScreen()
    }

    composable <Routes.Ring>{
        Ring()
    }
}
    }

