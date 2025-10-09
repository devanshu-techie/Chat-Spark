package com.devanshu.whatsappclone.presentation.Ring

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devanshu.whatsappclone.R

@Composable
fun LoveableItem(LovableContact : LovableContact) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(start = 4.dp, top =4.dp, end = 12.dp ))
    {
        Image(
            painter = painterResource(LovableContact.image),
            contentDescription = "All Rounder Developer",
            modifier = Modifier
                .size(60.dp)
                .clip(shape = RoundedCornerShape(6.dp)), contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            LovableContact.name,
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily.SansSerif,
            fontSize = 13.sp,
            color = colorResource(R.color.magenta)
        )
    }
}
data class LovableContact(val image: Int,val name: String)
