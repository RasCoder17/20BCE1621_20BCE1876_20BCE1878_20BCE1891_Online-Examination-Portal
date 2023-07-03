package com.example.receiver_sanjanaa

import android.os.Bundle
import android.widget.Toast
import androidx.compose.material3.OutlinedTextField
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.receiver_sanjanaa.ui.theme.Receiver_sanjanaaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Color.Transparent
                    )
                    .padding(all = 30.dp)

            ) {
                Text(
                    text = "Request for DONOR",
                    fontSize = 25.sp,
                    color = Color.Red,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier.padding(horizontal = 60.dp)
                )
                Spacer(modifier = Modifier.height(30.dp))
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .background(
                            Color.White
                        )
                        .padding(top = 10.dp)
                        .border(2.dp, color = Color.Black)
                        .height(170.dp)
                        .width(600.dp)

                ) {
                    Text(
                        text = "Sanjanaa Srinivasan",
                        modifier = Modifier.padding(all = 4.dp),
                        fontSize = 22.sp,
                        color = Color.Red,
                        fontWeight = FontWeight.Medium,
                        fontStyle = FontStyle.Italic,
                    )
                    Text(
                        text = "sanjanaa0112@gmail.com",
                        modifier = Modifier.padding(all = 4.dp),
                        fontSize = 22.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                    )
                    Text(
                        text = "9791193669",
                        modifier = Modifier.padding(all = 4.dp),
                        fontSize = 22.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                    )
                    Text(
                        text = "B+ve",
                        modifier = Modifier.padding(all = 4.dp),
                        fontSize = 22.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .background(
                            Color.White
                        )
                        .padding(top = 10.dp)
                        .border(2.dp, color = Color.Black)
                        .height(170.dp)
                        .width(600.dp)

                ) {
                    Text(
                        text = "R Srinivasan",
                        modifier = Modifier.padding(all = 4.dp),
                        fontSize = 22.sp,
                        color = Color.Red,
                        fontWeight = FontWeight.Medium,
                        fontStyle = FontStyle.Italic,
                    )
                    Text(
                        text = "rsrini@yahoo.co.in",
                        modifier = Modifier.padding(all = 4.dp),
                        fontSize = 22.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                    )
                    Text(
                        text = "+9840079812",
                        modifier = Modifier.padding(all = 4.dp),
                        fontSize = 22.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                    )
                    Text(
                        text = "O+ve",
                        modifier = Modifier.padding(all = 4.dp),
                        fontSize = 22.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .background(
                            Color.White
                        )
                        .padding(top = 10.dp)
                        .border(3.dp, color = Color.Black)
                        .height(170.dp)
                        .width(600.dp)

                ) {
                    Text(
                        text = "Bhama S",
                        modifier = Modifier.padding(all = 4.dp),
                        fontSize = 22.sp,
                        color = Color.Red,
                        fontWeight = FontWeight.Medium,
                        fontStyle = FontStyle.Italic,
                    )
                    Text(
                        text = "bhamas70@hotmail.com",
                        modifier = Modifier.padding(all = 4.dp),
                        fontSize = 22.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                    )
                    Text(
                        text = "9102293683",
                        modifier = Modifier.padding(all = 4.dp),
                        fontSize = 22.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                    )
                    Text(
                        text = "B-ve",
                        modifier = Modifier.padding(all = 4.dp),
                        fontSize = 22.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                    )
                }
            }
        }
    }
}

