package com.devanshu.whatsappclone.presentation.Ring

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.devanshu.whatsappclone.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Ring() {
    var isSearch by remember { mutableStateOf(false) }
    var search by remember { mutableStateOf("") }
    var showMenu by remember { mutableStateOf(false) }
    var ringitem = listOf(
        RingItem(image = R.drawable.studentdpimage,name = "Devloper", day = "Today",time = "3:00 P.M")
    )

    Scaffold(topBar = {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 26.dp, start = 12.dp)
        )
        {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (isSearch) {
                        TextField(
                            value = search, onValueChange = { search = it },
                            placeholder = {
                                Text(
                                    "Search Ring",
                                    fontSize = 16.sp,
                                    fontFamily = FontFamily.SansSerif,
                                    fontWeight = FontWeight.Bold,
                                    color = colorResource(R.color.purple_200)
                                )
                            },
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color.Transparent,
                                focusedContainerColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                focusedIndicatorColor = Color.Transparent
                            ), singleLine = true
                        )
                    } else {
                        Text(
                            "Ring",
                            fontWeight = FontWeight.Bold,
                            fontSize = 26.sp,
                            fontFamily = FontFamily.SansSerif,
                            color = colorResource(R.color.magenta)
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    if (isSearch) {
                        IconButton(onClick = {
                            isSearch = false
                            search = ""
                        }) {
                            Image(
                                painter = painterResource(R.drawable.nexus_cross),
                                contentDescription = "Cross", modifier = Modifier.size(40.dp)
                            )
                        }
                    } else {
                        IconButton(onClick = { isSearch = true }) {
                            Image(
                                painter = painterResource(R.drawable.search_icon1),
                                contentDescription = "Search_Icon",
                                modifier = Modifier.size(40.dp)
                            )
                        }
                        Box()
                        {
                            IconButton(onClick = { showMenu = true }) {
                                Image(
                                    painter = painterResource(R.drawable.menuliner),
                                    contentDescription = "Menu_Icon",
                                    modifier = Modifier.size(40.dp)
                                )
                            }
                            DropdownMenu(
                                expanded = showMenu,
                                onDismissRequest = { showMenu = false },
                                modifier = Modifier.width(180.dp)
                            ) {
                                DropdownMenuItem(
                                    text = { Text("Setting") },
                                    onClick = { showMenu = false })
                            }
                        }
                    }
                }
                HorizontalDivider(
                    modifier = Modifier.padding(start = 12.dp, end = 8.dp),
                    thickness = 2.dp,
                    color = colorResource(R.color.magenta)
                )
            }
        }

    }) {
        Column(modifier = Modifier.padding(it)) {
            Spacer(modifier = Modifier.height(12.dp))
            LovableSection()
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.magenta)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    "Ring to a new person",
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 16.sp,
                    color = colorResource(R.color.white)
                )
            }
            Text(
                "Recent Ring",
                fontFamily = FontFamily.SansSerif,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Red,
                modifier =Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )

        }
    }
}