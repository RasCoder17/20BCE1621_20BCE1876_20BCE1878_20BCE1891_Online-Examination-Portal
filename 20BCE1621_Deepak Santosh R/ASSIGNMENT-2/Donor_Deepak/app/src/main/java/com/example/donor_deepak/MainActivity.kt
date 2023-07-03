package com.example.donor_deepak

import android.os.Bundle
import android.widget.Toast
import androidx.compose.material3.OutlinedTextField
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import com.example.donor_deepak.ui.theme.Donor_DeepakTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val FirstName = remember { mutableStateOf(TextFieldValue()) }
            val LastName = remember { mutableStateOf(TextFieldValue()) }
            val MobileNumber = remember { mutableStateOf(TextFieldValue()) }
            val Email = remember { mutableStateOf(TextFieldValue()) }
            val BloodGroup = remember { mutableStateOf(TextFieldValue()) }

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
            {
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = "Register as DONOR", fontSize = 30.sp,color = Color.Red,modifier = Modifier.padding(horizontal = 55.dp),
                    fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
                Spacer(modifier = Modifier.height(15.dp))
                //FirstName
                Row {
                    OutlinedTextField(
                        value = FirstName.value,
                        onValueChange = { FirstName.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(text = "FirstName",fontSize = 20.sp,color = Color.Black, fontStyle = FontStyle.Italic) }
                    )
                }
                Spacer(modifier = Modifier.height(7.dp))
                //LastName
                Row {
                    OutlinedTextField(
                        value = LastName.value,
                        onValueChange = { LastName.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(text = "LastName",fontSize = 20.sp,color = Color.Black, fontStyle = FontStyle.Italic) }
                    )
                }
                Spacer(modifier = Modifier.height(7.dp))
                //MobileNumber
                Row {
                    OutlinedTextField(
                        value = MobileNumber.value,
                        onValueChange = { MobileNumber.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(text = "MobileNumber",fontSize = 20.sp,color = Color.Black, fontStyle = FontStyle.Italic) }
                    )
                }
                Spacer(modifier = Modifier.height(7.dp))
                //Email
                Row {
                    OutlinedTextField(
                        value = Email.value,
                        onValueChange = { Email.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(text = "Email",fontSize = 20.sp,color = Color.Black, fontStyle = FontStyle.Italic) }
                    )
                }
                Spacer(modifier = Modifier.height(7.dp))
                //BloodGroup
                Row {
                    OutlinedTextField(
                        value = BloodGroup.value,
                        onValueChange = { BloodGroup.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(text = "BloodGroup",fontSize = 20.sp,color = Color.Black, fontStyle = FontStyle.Italic) }
                    )
                }
                Spacer(modifier = Modifier.height(7.dp))
                //1st Question
                Row() {
                    Text(text = "Did you get tattoed in last 12 months?", fontSize = 20.sp)
                }
                Spacer(modifier = Modifier.height(1.dp))
                Row(){
                    val selectedvalue = remember{ mutableStateOf(false) }
                    val label = true
                    RadioButton(selected = selectedvalue.value, onClick = { selectedvalue.value = label }, enabled = true)
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(text = "Yes", fontSize = 20.sp,modifier = Modifier.padding(top = 9.dp))
                    Spacer(modifier = Modifier.width(10.dp))
                    val selected = remember{ mutableStateOf(false) }
                    val lab = true
                    RadioButton(selected = selected.value, onClick = {selected.value = lab}, enabled = true)
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(text = "No", fontSize = 20.sp,modifier = Modifier.padding(top = 9.dp),color = Color.Red)
                }
                Spacer(modifier = Modifier.height(7.dp))
                //2nd Question
                Row() {
                    Text(text = "Have you ever tested positive for HIV?", fontSize = 20.sp)
                }
                Spacer(modifier = Modifier.height(1.dp))
                Row(){
                    val selectedvalue = remember{ mutableStateOf(false) }
                    val label = true
                    RadioButton(selected = selectedvalue.value, onClick = { selectedvalue.value = label }, enabled = true)
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(text = "Yes", fontSize = 20.sp,modifier = Modifier.padding(top = 9.dp))
                    Spacer(modifier = Modifier.width(10.dp))
                    val selected = remember{ mutableStateOf(false) }
                    val lab = true
                    RadioButton(selected = selected.value, onClick = { selected.value = lab }, enabled = true)
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(text = "No", fontSize = 20.sp,modifier = Modifier.padding(top = 9.dp),color = Color.Red)
                }
                //Button
                Row {
                    Button(
                        onClick = {
                            Toast.makeText(
                                applicationContext,
                                "Thanks for registering " + FirstName.value.text,
                                Toast.LENGTH_LONG
                            ).show()
                        },
                        shape = RectangleShape,
                        modifier = Modifier.size(height = 50.dp, width = 400.dp)
                            .padding(horizontal = 20.dp),
                        colors = ButtonDefaults.buttonColors(Color.Red),

                        ) {
                        Text(text = "Register", fontSize = 25.sp, color = Color.White)
                    }
                }
            }
        }
    }
}

