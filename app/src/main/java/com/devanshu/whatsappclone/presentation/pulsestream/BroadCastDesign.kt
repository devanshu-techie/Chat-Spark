package com.devanshu.whatsappclone.presentation.pulsestream

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devanshu.whatsappclone.R

@Composable
fun BroadCastDesign(BroadCast : BroadCast) {

    var isJoin by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Image(
            painter = painterResource(BroadCast.image),
            contentDescription = "",
            modifier = Modifier
                .size(80.dp)
                .clip(
                    RoundedCornerShape(6.dp)
                )
                .padding(4.dp)
        )
        Spacer(modifier = Modifier.width(12.dp))

        Column (modifier = Modifier.weight(10f).padding(horizontal =8.dp)){
            Text(
                BroadCast.name,
                fontSize = 16.sp,
                fontFamily = androidx.compose.ui.text.font.FontFamily.SansSerif,
                fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold,
                color = colorResource(R.color.purple_700)
            )
            Text(
                BroadCast.Description,
                fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold,
                fontFamily = FontFamily.SansSerif,
                fontSize = 12.sp,
                color = colorResource(R.color.indigo)
            )
        }
        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = { isJoin = !isJoin }, colors = ButtonDefaults.buttonColors(
                containerColor = if (isJoin) {
                    Color.Gray
                } else {
                    colorResource(R.color.purple_200)
                }
            ),
            modifier = Modifier
                .padding(6.dp)
                .height(36.dp)
        ) {
            Text(
                if (isJoin) {
                    "Joined"
                } else {
                    "Join"
                }, color = if (isJoin) {
                    Color.Black
                } else {
                    Color.White
                },
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
            )
        }

    }
}
data class BroadCast(val image : Int,val name : String,val Description : String)