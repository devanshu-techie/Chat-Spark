package com.devanshu.whatsappclone.presentation.bottomnavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devanshu.whatsappclone.R

@Preview(showSystemUi = true)
@Composable
fun BottomNavigation() {
    BottomAppBar(tonalElevation = 12.dp, containerColor = Color.White)
    {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Column(
                modifier = Modifier.padding(top = 9.dp, bottom = 9.dp, start = 10.dp, end = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.chat_icon),
                    contentDescription = "ChatIcon",
                    modifier = Modifier.size(38.dp)
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    "Chats",
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 14.sp,
                    color = colorResource(R.color.purple_200)
                )
            }

            Column(
                modifier = Modifier.padding(top = 9.dp, bottom = 9.dp, start = 10.dp, end = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.pulsestream),
                    contentDescription = "Status",
                    modifier = Modifier.size(38.dp)
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    "PulseStream",
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.purple_200),
                    fontFamily = FontFamily.SansSerif
                )
            }

            Column(
                modifier = Modifier.padding(top = 9.dp, bottom = 9.dp, start = 10.dp, end = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.nexus),
                    contentDescription = "Community",
                    modifier = Modifier.size(38.dp)
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    "Nexus",
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 14.sp,
                    color = colorResource(R.color.purple_200)
                )
            }

            Column(
                modifier = Modifier.padding(top = 9.dp, bottom = 9.dp, start = 10.dp, end = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.phone),
                    contentDescription = "Telephone",
                    modifier = Modifier.size(38.dp)
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(
                    "Ring",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.purple_200)
                )
            }
        }

    }
}
