package com.example.sanjanaasrinivasan_20bce1876

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sanjanaasrinivasan_20bce1876.ui.theme.SanjanaaSrinivasan_20BCE1876Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val input_username = remember { mutableStateOf(TextFieldValue()) }
            val input_password = remember { mutableStateOf(TextFieldValue()) }

            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Color.Transparent
                    )
                    .padding(all = 50.dp)

            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "Google",
                        modifier = Modifier.size(140.dp),
                    )
                }
                Spacer(modifier = Modifier.height(50.dp))
                Row {
                    Text(text = "Username", fontSize = 24.sp, color = Color.Black)
                }
                Spacer(modifier = Modifier.height(20.dp))

                Row {
                    TextField(
                        value = input_username.value,
                        onValueChange = { input_username.value = it },
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
                Spacer(modifier = Modifier.height(25.dp))

                //Password
                Row {
                    Text(text = "Password", fontSize = 24.sp, color = Color.Black)
                }
                Spacer(modifier = Modifier.height(20.dp))

                Row {
                    TextField(
                        value = input_password.value,
                        onValueChange = { input_password.value = it },
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
                Spacer(modifier = Modifier.height(30.dp))

                Row {
                    Button(
                        onClick = {
                            Toast.makeText(
                                applicationContext,
                                input_username.value.text + "\n" + input_password.value.text,
                                Toast.LENGTH_LONG
                            ).show()
                        },
                        modifier = Modifier.width(155.dp),
                        colors = ButtonDefaults.buttonColors(Color.DarkGray)
                    ) {
                        Text(text = "Signup", fontSize = 25.sp, color = Color.White)
                    }
                    Spacer(modifier = Modifier.width(1.dp))
                    Button(
                        onClick = {
                            Toast.makeText(
                                applicationContext,
                                input_username.value.text + "\n" + input_password.value.text,
                                Toast.LENGTH_LONG
                            ).show()
                        },
                        modifier = Modifier.width(175.dp),
                        colors = ButtonDefaults.buttonColors(Color.DarkGray)
                    ) {
                        Text(text = "Login", fontSize = 25.sp, color = Color.White)
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))




                Row {
                    Text(text = input_username.value.text + "\n" + input_password.value.text)
                }
            }
        }
    }
}

