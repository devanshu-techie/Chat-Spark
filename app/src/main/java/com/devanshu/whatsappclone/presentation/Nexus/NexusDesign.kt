package com.devanshu.whatsappclone.presentation.Nexus

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NexusDesign(NexusData :NexusData) {
    Row (verticalAlignment = Alignment.CenterVertically){
        Image(
            painter = painterResource(NexusData.image),
            contentDescription = "",
            modifier = Modifier
                .size(60.dp)
                .clip(shape = RoundedCornerShape(6.dp))
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column ( ){
            Text(
                NexusData.nexusName,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontSize = 16.sp,
                color = Color.DarkGray
            )
                Spacer(modifier = Modifier.height(4.dp))
            Text(
                NexusData.memberCount, color = Color.Gray, fontSize = 14.sp, fontFamily =
                    FontFamily.SansSerif, fontWeight = FontWeight.SemiBold
            )

        }
    }
    Spacer(modifier = Modifier.height(12.dp))
}
data class NexusData(
    val image:Int,val nexusName :String,val memberCount : String
)