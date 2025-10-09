package com.devanshu.whatsappclone.presentation.Ring

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devanshu.whatsappclone.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LovableSection() {
    val LovableData = listOf(
        LovableContact(image = R.drawable.allrounderdev, name = "Devanshu"),
        LovableContact(image = R.drawable.studentdpimage, name = "Developer Guru"),
        LovableContact(image = R.drawable.radha_rani, name = "Shree Ji"),
        LovableContact(image = R.drawable.kanha , name = "Krishna"),
        LovableContact(image = R.drawable.kanhawithradha , name = "Kanha with Radha Rani")
    )
    Column(modifier = Modifier.padding(start = 12.dp, bottom = 8.dp)) {
        Text(
            "Lovable",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.SemiBold,
            color = colorResource(
                R.color.magenta
            ),
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())) {
                LovableData.forEach {
                    LoveableItem(LovableContact = it)
                }
        }
    }
}

