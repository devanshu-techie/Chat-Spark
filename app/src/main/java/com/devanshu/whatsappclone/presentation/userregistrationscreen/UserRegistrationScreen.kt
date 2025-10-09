package com.devanshu.whatsappclone.presentation.userregistrationscreen

import androidx.compose.ui.res.colorResource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.devanshu.whatsappclone.Navigation.Routes
import com.devanshu.whatsappclone.R

@Composable
fun UserRegistrationScreen(navHostController: NavHostController) {
    var expanded by remember { mutableStateOf(false) }
    var selectedCountry by remember { mutableStateOf("Germany") }
    var countryCode by remember { mutableStateOf("+49") }
    var phoneNumber by remember { mutableStateOf("") }
    Scaffold { innerpadding ->
        Column(
            modifier = Modifier
                .padding(innerpadding)
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Enter your Phone Number",
                fontSize = 20.sp,
                color = colorResource(R.color.purple_500),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                "ChatSpark will need to verify your phone number",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text("What's my number?", color = colorResource(R.color.purple_500))

            Spacer(modifier = Modifier.height(16.dp))

            TextButton(onClick = { expanded = true }, modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier.width(230.dp))
                {
                    Text(
                        text = selectedCountry, modifier = Modifier.align(Alignment.Center),
                        fontSize = 16.sp,
                        color = Color.Black
                    )

                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "DropDownArrow",
                        modifier = Modifier.align(Alignment.CenterEnd),
                        tint = colorResource(R.color.purple_200)
                    )
                }
                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    listOf(
                        "India",
                        "China",
                        "USA",
                        "Canada",
                        "Germany",
                        "Japan",
                        "Africa",
                        "Australia",
                        "Pakistan",
                        "Bangladesh"
                    ).forEach { country ->
                        DropdownMenuItem(text = { Text(text = country) }, onClick = {
                            selectedCountry = country
                            expanded = false
                        })

                    }
                }
            }
            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 66.dp),
                thickness = 2.dp,
                color = colorResource(R.color.purple_200)
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row {
                    TextField(
                        value = countryCode,
                        onValueChange = { countryCode = it },
                        modifier = Modifier.width(70.dp),
                        singleLine = true,
                        textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            unfocusedIndicatorColor = colorResource(R.color.purple_200),
                            focusedIndicatorColor = colorResource(R.color.purple_200)
                        )
                    )

                    Spacer(modifier = Modifier.width(6.dp))
                    TextField(
                        value = phoneNumber,
                        onValueChange = { phoneNumber = it },
                        placeholder = {
                            Text(
                                "phone Number",
                                fontWeight = FontWeight.SemiBold,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 18.sp
                            )
                        },
                        singleLine = true,
                        colors = TextFieldDefaults.colors(
                            unfocusedIndicatorColor = colorResource(R.color.purple_200),
                            focusedIndicatorColor = colorResource(R.color.purple_200),
                            unfocusedContainerColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent
                        )
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    "Your number we'll test, then put you to rest.",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                )
                Spacer(modifier = Modifier.height(26.dp))
                Button(
                    onClick = {navHostController.navigate(Routes.HomeScreen)
                    },
                    shape = RoundedCornerShape(6.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.purple_200))
                ) {
                    Text("Next", fontSize = 16.sp)
                }
            }

        }
    }
}
