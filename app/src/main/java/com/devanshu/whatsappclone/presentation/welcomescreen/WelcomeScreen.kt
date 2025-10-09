package com.devanshu.whatsappclone.presentation.welcomescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.devanshu.whatsappclone.Navigation.Routes
import com.devanshu.whatsappclone.R

@Composable
//@Preview(showBackground = true)
fun WelcomeScreen(navHostController: NavHostController) {
    Scaffold { innerpadding ->
        Column(
            modifier = Modifier
                .padding(innerpadding)
                .padding(start = 12.dp, end = 12.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.welcomesecurity),
                contentDescription = "welcome image",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(300.dp)
            )

            Text(
                "Welcome to ChatSpark",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.SemiBold,
                fontSize = 22.sp,
                color = colorResource(R.color.indigo)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Text("Read our", color = Color.Gray, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    "Privacy Policy",
                    color = colorResource(R.color.light_green),
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.clickable {}
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    "Tap Agree and continue to",
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                )
            }
            Spacer(modifier = Modifier.height(6.dp))
            Row {
                Text(
                    "accept the",
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    "Term of Services",
                    color = colorResource(R.color.light_green),
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.clickable {})
            }
            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { navHostController.navigate(Routes.UserRegistrationScreen) },
                modifier = Modifier.size(280.dp, 43.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.purple_200)
                )
            ) {
                Text(
                    "Agree and Continue",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
