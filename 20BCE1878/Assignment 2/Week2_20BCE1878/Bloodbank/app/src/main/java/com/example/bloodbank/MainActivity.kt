package com.example.bloodbank
import android.content.Intent
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.layout.ContentScale
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

            Image(
                    painter = painterResource(R.drawable.bloodbank), // Replace with your image resource
                    contentDescription = "My Image",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxSize()
                        .height(100.dp)
                        .size(200.dp) // Adjust the size as needed
                )
            Column (modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){

//                Image(
//                    painter = painterResource(R.drawable.images), // Replace with your image resource
//                    contentDescription = "My Image",
//                    modifier = Modifier
//                        .height(100.dp)
//                        .size(200.dp) // Adjust the size as needed
//                )
                
                
                Row() {
                    Column( horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Top) {
                        Image(
                            painter = painterResource(R.drawable.blood), // Replace with your image resource
                            contentDescription = "My Image",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .height(50.dp)
                                .size(50.dp) // Adjust the size as needed
                        )
                    }
                    Column( horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center) {
                        Row {
                            Text(text = "Save ",color = Color(0xFF000000),style = TextStyle(
                                fontWeight = FontWeight.Bold, fontSize = 22.sp))

                            Text(text = "Lives",color = Color(0xFFFFFFFF),style = TextStyle(
                                fontWeight = FontWeight.Bold, fontSize = 22.sp))
                        }
                        Row{
                            Text(text = "Donate ",color = Color(0xFF000000),style = TextStyle(
                                fontWeight = FontWeight.Bold, fontSize = 22.sp))
                            Text(text = "Blood",color = Color(0xFFFFFFFF),style = TextStyle(
                                fontWeight = FontWeight.Bold, fontSize = 22.sp))
                        }
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

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
                    Image(
                        painter = painterResource(R.drawable.heart), // Replace with your image resource
                        contentDescription = "My Image",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .height(30.dp)
                            .size(30.dp) // Adjust the size as needed
                    )
                    Image(
                        painter = painterResource(R.drawable.heart), // Replace with your image resource
                        contentDescription = "My Image",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .height(30.dp)
                            .size(30.dp) // Adjust the size as needed
                    )
                    Image(
                        painter = painterResource(R.drawable.heart), // Replace with your image resource
                        contentDescription = "My Image",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .height(30.dp)
                            .size(30.dp) // Adjust the size as needed
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
                    onClick = { val navigate = Intent(this@MainActivity,infopage::class.java)
                              startActivity(navigate)
                              },
                    colors = ButtonDefaults.buttonColors( Color(0xFFC43B3B)),
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(horizontal = 16.dp)
                        .size(width = 50.dp, height = 48.dp)
                ) {
                    val onClick = { /* TODO: Handle link click */ }
                    Text(text = "Sign In", style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),modifier = Modifier.clickable(onClick = onClick))

                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(text = "You are one step away from",color = Color(0xFF000000), style = TextStyle(fontSize = 18.sp,fontWeight = FontWeight.Bold))

                Text(text = "Saving Lives !!",color = Color(0xFFFFFFFF),    style = TextStyle(
                    fontWeight = FontWeight.Bold, fontSize = 20.sp
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

class News {
}