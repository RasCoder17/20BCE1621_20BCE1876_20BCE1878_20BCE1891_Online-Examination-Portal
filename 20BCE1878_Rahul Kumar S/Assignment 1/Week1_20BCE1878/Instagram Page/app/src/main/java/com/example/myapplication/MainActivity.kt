package com.example.myapplication
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.*;
import androidx.compose.material3.*;
import androidx.compose.ui.*;
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column (modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){

                Image(
                    painter = painterResource(R.drawable.images), // Replace with your image resource
                    contentDescription = "My Image",
                    modifier = Modifier
                        .height(100.dp)
                        .size(200.dp) // Adjust the size as needed
                )

                Text(text = "Sign up to see photos and videos",color = Color(0xFF959A9E),style = TextStyle(
                    fontWeight = FontWeight.Bold, fontSize = 22.sp))

                Text(text = "from your friends.",color = Color(0xFF959A9E),style = TextStyle(
                    fontWeight = FontWeight.Bold, fontSize = 22.sp))

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = { /* TODO: Handle sign-up button click */ },
                    colors = ButtonDefaults.buttonColors( Color(0xFF3897F0)),
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp).size(width = 50.dp, height = 48.dp)
                ) {
                    Text(text = "Log in with Facebook",style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),)
                }

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier.padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Divider(
                        color = Color.Black,
                        modifier = Modifier
                            .weight(1f)
                            .height(1.dp)
                            .padding(end = 8.dp)
                    )
                    Text(
                        text = "OR",color = Color.DarkGray,style = TextStyle(
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Divider(
                        color = Color.Black,
                        modifier = Modifier
                            .weight(1f)
                            .height(1.dp)
                            .padding(start = 8.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                var text1 by remember{ mutableStateOf(TextFieldValue("")) }
                TextField(
                    value = text1,
                    onValueChange = {newText -> text1 = newText},
                    label = { Text(text = "Mobile Number or Email") },
                    colors = TextFieldDefaults.textFieldColors(
                        unfocusedLabelColor = Color.DarkGray, // Set the background color inside the TextField to light gray
                    ),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
                )

                Spacer(modifier = Modifier.height(16.dp))
                var text2 by remember{ mutableStateOf(TextFieldValue("")) }
                TextField(
                    value = text2,
                    onValueChange = {newText -> text2 = newText},
                    label = { Text(text = "Full Name") },
                    colors = TextFieldDefaults.textFieldColors(
                        unfocusedLabelColor = Color.DarkGray, // Set the background color inside the TextField to light gray
                    ),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
                )

                Spacer(modifier = Modifier.height(16.dp))
                var text3 by remember{ mutableStateOf(TextFieldValue("")) }
                TextField(
                    value = text3,
                    onValueChange = {newText -> text3 = newText},
                    label = { Text(text = "Username") },
                    colors = TextFieldDefaults.textFieldColors(
                        unfocusedLabelColor = Color.DarkGray, // Set the background color inside the TextField to light gray
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                )

                Spacer(modifier = Modifier.height(16.dp))
                var text4 by remember{ mutableStateOf(TextFieldValue("")) }
                TextField(
                    value = text4,
                    onValueChange = {newText -> text4 = newText},
                    label = { Text(text = "Password") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                )

                Spacer(modifier = Modifier.height(32.dp))

                Button(
                    onClick = { /* TODO: Handle sign-up button click */ },
                    colors = ButtonDefaults.buttonColors( Color(0xFF3897F0)),
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(horizontal = 16.dp).size(width = 50.dp, height = 48.dp)
                ) {
                    val onClick = { /* TODO: Handle link click */ }
                    Text(text = "Sign Up", style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),modifier = Modifier.clickable(onClick = onClick))

                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(text = "By signing up, you agree to our",color = Color(0xFF959A9E), style = TextStyle(fontSize = 16.sp))
                Text(text = "Terms & Privacy Policy.",color = Color(0xFF959A9E),    style = TextStyle(
                    fontWeight = FontWeight.Bold, fontSize = 16.sp
                    ))
            }

        }
    }
}



@Composable
fun Greeting(name: String) {
    Text(
        text = ""
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
}

