package com.example.VIT_20BCE1621

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vit_20bce1876.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //BackGround Box
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .wrapContentSize(align = Alignment.Center)

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentSize(align = Alignment.Center)
                ) {
                    Image(
                        painter = painterResource(R.drawable.bloodbank),
                        contentDescription = null,
                        modifier = Modifier.size(height = 250.dp,width = 300.dp)
                    )
                    Spacer(modifier = Modifier.height(80.dp))
                    Button(
                        onClick = { /* Handle login button click */ },
                        modifier = Modifier
                            .size(height = 65.dp,width = 300.dp),
                        colors = ButtonDefaults.buttonColors(Color.Red),
                        border = BorderStroke(2.dp,Color.White)
                    ) {
                        Text(text = "Donor", fontSize = 35.sp,color = Color.White)
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Button(
                        onClick = { /* Handle login button click */ },
                        modifier = Modifier
                            .size(height = 65.dp,width = 300.dp),
                        colors = ButtonDefaults.buttonColors(Color.White),
                        border = BorderStroke(2.dp,Color.Gray)
                    ) {
                        Text(text = "Receiver", fontSize = 32.sp,color = Color.Red)
                    }
                }

            }
        }
    }
}
