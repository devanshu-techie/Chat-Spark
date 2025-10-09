package com.devanshu.whatsappclone.presentation.pulsestream

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devanshu.whatsappclone.R
import com.devanshu.whatsappclone.presentation.bottomnavigation.BottomNavigation

@Preview(showSystemUi = true, showBackground = true, device = "id:pixel_9")
@Composable
fun pulse() {

    val scrollState = rememberScrollState()
    val samplestream = listOf(
        StreamData(image = R.drawable.dpimage, name = "Android Developer", time = "12 min Ago"),
        StreamData(image = R.drawable.studentdpimage, name = "HR Manager", time = "3 min Ago"),
        StreamData(image = R.drawable.girldpimage, name = "Chief", time = "4 hrs Ago")
    )
    val sampleBroadCast = listOf(
        BroadCast(image = R.drawable.devoslogo,name = "DevOs" , Description = "Find Updates for Indian Software"),
        BroadCast(image = R.drawable.google_icon,name = "Google",Description = " Always Up to date with Google Technologies"),
        BroadCast(image = R.drawable.microsoft_icon,name = "Microsoft",Description = "All Updates of microsoft on Your Hand"),
        BroadCast(image = R.drawable.meta_icon,name = "Meta",Description ="Connect. Create. Evolve.")
    )
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {}, containerColor = colorResource(
                    R.color.white
                ), modifier = Modifier.size(65.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.camera_icon),
                    contentDescription = "Add pulse",
                    modifier = Modifier
                        .size(55.dp)
                        .clip(
                            RoundedCornerShape(20)
                        )
                        .clickable(onClick = {})
                )
            }
        },
        bottomBar = { BottomNavigation() },
        topBar = { topbar() }
    )
    { innerpadding ->
        Column(
            modifier = Modifier
                .padding(innerpadding)
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Text(
                "Stream",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = colorResource(R.color.magenta),
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )

            Mystream()


            samplestream.forEach { StreamItem(StreamData = it) }



            HorizontalDivider(
                thickness = 2.dp,
                modifier = Modifier.padding(12.dp),
                color = Color.Magenta
            )

            Text(
                "Welcome to Broadcast",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                color = colorResource(R.color.magenta)
            )

            Spacer(modifier = Modifier.height(8.dp))
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(
                    "Stay connected with the latest news, announcements, and exclusive content, straight from us to you. Your a part of our Community.",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.DarkGray
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    "Find BroadCast to Join",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            sampleBroadCast.forEach { BroadCastDesign(BroadCast = it) }
        }
    }
}