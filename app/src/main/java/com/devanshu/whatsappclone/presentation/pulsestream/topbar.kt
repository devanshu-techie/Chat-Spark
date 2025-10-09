package com.devanshu.whatsappclone.presentation.pulsestream

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.IconButton
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
fun topbar() {
    var isSearching by remember { mutableStateOf(false) }
    var search by remember { mutableStateOf("") }
    var showMenu by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 26.dp)
    ) {
        Column() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (isSearching) {
                    TextField(
                        value = search,
                        onValueChange = { search = it },
                        placeholder = {
                            Text(
                                "Search",
                                color = colorResource(R.color.purple_200),
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            )
                        },
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ), singleLine = true
                    )
                } else {
                    Text(
                        "PulseStream",
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,
                        modifier = Modifier.padding(start = 12.dp, top = 4.dp),
                        color = colorResource(R.color.purple)
                    )
                }

                Spacer(modifier = Modifier.weight(1f))

                if (isSearching) {
                    IconButton(onClick = {
                        isSearching = false
                        search = ""
                    }) {
                        Image(
                            painter = painterResource(R.drawable.cross),
                            contentDescription = "Cross Icon",
                            modifier = Modifier.size(40.dp)
                        )
                    }
                } else {
                    IconButton(onClick = {}) {
                        Image(
                            painter = painterResource(R.drawable.camera_icon),
                            contentDescription = "Camera Icon",
                            modifier = Modifier.size(40.dp)
                        )

                    }
                    IconButton(onClick = { isSearching = true }) {
                        Image(
                            painter = painterResource(R.drawable.search_icon1),
                            contentDescription = "Search Icon",
                            modifier = Modifier.size(40.dp)
                        )
                    }
                    Box {
                        IconButton(onClick = { showMenu = true }) {
                            Image(
                                painter = painterResource(R.drawable.menuliner),
                                contentDescription = "menu icon",
                                modifier = Modifier.size(40.dp)
                            )
                        }
                        DropdownMenu(
                            expanded = showMenu,
                            onDismissRequest = { showMenu = false },
                            modifier = Modifier.width(180.dp)
                        )
                        {
                            DropdownMenuItem(
                                text = { Text("Status Privacy") },
                                onClick = { showMenu = false })
                            DropdownMenuItem(
                                text = { Text("Create Channel") },
                                onClick = { showMenu = false })
                            DropdownMenuItem(
                                text = { Text("Setting") },
                                onClick = { showMenu = false })
                        }
                    }
                }
            }
            HorizontalDivider(
                thickness = 2.dp,
                modifier = Modifier.padding(12.dp),
                color = Color.Magenta
            )
        }
    }
}