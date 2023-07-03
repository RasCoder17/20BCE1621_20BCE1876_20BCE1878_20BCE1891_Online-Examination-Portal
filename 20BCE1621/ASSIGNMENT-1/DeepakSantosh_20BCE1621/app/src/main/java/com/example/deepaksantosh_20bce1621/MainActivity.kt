package com.example.deepaksantosh_20bce1621

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
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Checkbox
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.deepaksantosh_20bce1621.ui.theme.DeepakSantosh_20BCE1621Theme

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
                        Color.White
                    )
                    .padding(all = 20.dp)

            )
            //Google Image and Login Image
            {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.g),
                        contentDescription = "Google",
                        modifier = Modifier.size(width = 300.dp, height = 120.dp),
                    )
                    Image(
                        painter = painterResource(id = R.drawable.login),
                        contentDescription = "Login",
                        modifier = Modifier.size(width = 150.dp, height = 180.dp),
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
                //Email
                Row {
                    OutlinedTextField(
                        value = input_username.value,
                        onValueChange = { input_username.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = {Text(text = "Email")}
                    )
                }
                Spacer(modifier = Modifier.height(18.dp))
                //Password
                Row {
                    OutlinedTextField(
                        value = input_password.value,
                        onValueChange = { input_password.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = {Text(text = "Password")}
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                //CheckBox
                val checkedState = remember { mutableStateOf(true) }
                Row {
                    Checkbox(
                        checked = checkedState.value,
                        onCheckedChange = { checkedState.value = it },
                    )
                    Text(text = "Stay signed in",fontSize = 16.sp, modifier = Modifier.padding(10.dp))
                }
                Spacer(modifier = Modifier.height(1.dp))
                //Login Button
                Row {
                    Button(
                        onClick = {
                            Toast.makeText(
                                applicationContext,
                                input_username.value.text + "\n" + input_password.value.text,
                                Toast.LENGTH_LONG
                            ).show()
                        },shape = RectangleShape,
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(Color.Blue)
                    ) {
                        Text(text = "Login", fontSize = 30.sp, color = Color.White)
                    }
                }

                Spacer(modifier = Modifier.height(4.dp))

                Row {
                    Text(text = input_username.value.text + "\n" + input_password.value.text)
                }
            }
        }
    }
}