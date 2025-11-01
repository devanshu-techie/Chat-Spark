package com.devanshu.whatsappclone.presentation.homescreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.devanshu.whatsappclone.R
import com.devanshu.whatsappclone.presentation.ChatBox.ChatDesign
import com.devanshu.whatsappclone.presentation.ChatBox.ChatListModel
import com.devanshu.whatsappclone.presentation.bottomnavigation.BottomNavigation

//@Preview(showSystemUi = true)
@Composable
fun HomeScreen(navHostController: NavHostController) {
    var showMenu by remember { mutableStateOf(false) }
    val chatData = listOf(
        ChatListModel(
            R.drawable.person_icon,
            name = "No One Knows",
            time = "10:00 A.M",
            message = "Ready for Chat"
        ),
        ChatListModel(
            image = R.drawable.dpimage,
            name = "Developer Men",
            time = "10:00 A.M",
            message = "Aajao Coding Kaare"
        ),
        ChatListModel(
            image = R.drawable.girldpimage,
            name = " Developer girl",
            time = "10:00 A.M",
            message = "Talk on Coding"
        ),
        ChatListModel(
            image = R.drawable.studentdpimage,
            name = "Hacker Mind",
            time = "10:00 A.M",
            message = "Attacking on Device"
        )
    )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {}, containerColor = colorResource(R.color.white),
                modifier = Modifier.size(65.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.chat_icon), contentDescription = null,
                    modifier = Modifier
                        .size(55.dp)
                        .clip(RoundedCornerShape(20))
                )

            }
        },
        bottomBar = { BottomNavigation() }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Spacer(modifier = Modifier.height(16.dp))
            Box(modifier = Modifier.fillMaxWidth())
            {
                Text(
                    "ChatSpark",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = colorResource(R.color.purple_200),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 16.dp),
                    style = MaterialTheme.typography.titleLarge
                )

                Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                    IconButton(onClick = {}) {
                        Image(
                            painter = painterResource(R.drawable.camera_icon),
                            contentDescription = null,
                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(30))
                        )
                    }
                    IconButton(onClick = {}) {
                        Image(
                            painter = painterResource(R.drawable.search_icon1),
                            contentDescription = null,
                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(30))
                        )
                    }
                    IconButton(onClick = {showMenu  = true}) {
                        Image(
                            painter = painterResource(R.drawable.menu_icon),
                            contentDescription = null,
                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(30))
                        )
                    }
                    DropdownMenu(
                        expanded = showMenu,
                        onDismissRequest = { showMenu = false },
                        modifier = Modifier.width(180.dp)
                    ) {
                        DropdownMenuItem(text = {Text("Setting")}, onClick = {showMenu = false})
                    }
                }
            }
            HorizontalDivider(modifier = Modifier.fillMaxWidth())

            LazyColumn { items(chatData)
            {
                ChatDesign(ChatListModel = it )
            }
            }

        }
    }
}