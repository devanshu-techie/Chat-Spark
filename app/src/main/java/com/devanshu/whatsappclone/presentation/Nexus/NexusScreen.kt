package com.devanshu.whatsappclone.presentation.Nexus

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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import com.devanshu.whatsappclone.presentation.bottomnavigation.BottomNavigation

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NexusScreen() {
    var isSearching by remember { mutableStateOf(false) }
    var search by remember { mutableStateOf("") }
    var showMenu by remember { mutableStateOf(false) }
    val sampleNexusData = listOf(
        NexusData(image = R.drawable.friend_grp,nexusName ="Always Blessed",memberCount = "4 members"),
        NexusData(image =R.drawable.kailash_grp , nexusName = "Trip to Kailash", memberCount = "Nothing to Know"),
        NexusData(image = R.drawable.developer,nexusName = "Developers", memberCount = " 1000 members")
    )

    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 26.dp, start = 12.dp)
            )
            {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        if (isSearching) {
                            TextField(
                                value = search, onValueChange = { search = it },
                                placeholder = {
                                    Text(
                                        "Search For Nexus",
                                        color = colorResource(R.color.purple_200),
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    )
                                },
                                colors = TextFieldDefaults.colors(
                                    unfocusedIndicatorColor = Color.Transparent,
                                    unfocusedContainerColor = Color.Transparent,
                                    focusedIndicatorColor = Color.Transparent,
                                    focusedContainerColor = Color.Transparent
                                ), singleLine = true
                            )
                        } else {
                            Text(
                                "Nexus",
                                fontSize = 26.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily.SansSerif,
                                color = colorResource(R.color.magenta)
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f))
                        if (isSearching) {
                            IconButton(
                                onClick = {
                                    isSearching = false
                                    search = ""
                                }
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.nexus_cross),
                                    contentDescription = "Cross Icon",
                                    modifier = Modifier.size(40.dp)
                                )
                            }
                        } else {
                            IconButton(onClick = { isSearching = true }) {
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
                        thickness = 2.dp,
                        modifier = Modifier.padding(end = 12.dp),
                        color = colorResource(R.color.magenta)
                    )
                }
            }
        },
        bottomBar = { BottomNavigation() }
    ) {
        Column(modifier = Modifier.padding(it)) {

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(colorResource(R.color.purple_200)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
            ) {
                Text(
                    "Making your own World",
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 16.sp,
                    color = colorResource(R.color.white)
                )
            }

            Spacer(modifier = Modifier.height(8.dp))
            Text(
                "Your Dream Nexus",
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.magenta),
                modifier = Modifier.padding(12.dp)
            )
            LazyColumn {
                items(sampleNexusData){
                    NexusDesign(NexusData = it)
                }
            }
        }
    }
}