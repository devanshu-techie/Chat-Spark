package com.devanshu.whatsappclone.presentation.splashscreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.devanshu.whatsappclone.Navigation.Routes
import com.devanshu.whatsappclone.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navHostController: NavHostController) {
    LaunchedEffect(key1 = true){
        delay(1000L)
        navHostController.navigate(Routes.WelcomeScreen)
        {
            popUpTo(Routes.SplashScreen){inclusive = true}
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp, top = 22.dp, bottom = 22.dp)
    )
    {
        Image(
            painter = painterResource(R.drawable.chatsparklogo3), contentDescription = "AppLogo",
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.Center)
        )
        Column(modifier = Modifier.align(Alignment.BottomCenter), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                "From",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center
            )

            Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Image(
                    painter = painterResource(R.drawable.devoslogo),
                    contentDescription = "Devos logo",
                    modifier = Modifier
                        .size(26.dp)
                        .align(alignment = Alignment.Bottom)
                )
                Text(
                    text = "DevOs",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = colorResource(R.color.dark_green)
                )
            }
        }

    }


}


//@Composable
//@Preview(showSystemUi = true, showBackground = true)
//fun SplashScreenPrev() {
//    SplashScreen()
//}
