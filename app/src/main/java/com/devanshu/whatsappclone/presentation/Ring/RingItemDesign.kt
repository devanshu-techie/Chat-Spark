package com.devanshu.whatsappclone.presentation.Ring

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.layout.Spacer
import com.devanshu.whatsappclone.R

@Composable
fun RingItemDesign(RingItem : RingItem) {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(12.dp)) {
        Image(
            painter = painterResource(RingItem.image),
            contentDescription = "Developer_Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(60.dp)
                .clip(shape = RoundedCornerShape(6.dp))
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                RingItem.name,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.SansSerif,
                color = colorResource(R.color.magenta)
            )
            Spacer(modifier = Modifier.size(4.dp))
            Row {
                Text(
                    RingItem.day,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 13.sp,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(
                    RingItem.time,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 13.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Gray
                )
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = {}) {
            Image(
                painter = painterResource(R.drawable.phone),
                contentDescription = "Phone",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(60.dp)
                    .clip(RoundedCornerShape(6.dp))
            )
        }
    }
}

data class RingItem(var image : Int , var name : String ,var day : String , var time : String)