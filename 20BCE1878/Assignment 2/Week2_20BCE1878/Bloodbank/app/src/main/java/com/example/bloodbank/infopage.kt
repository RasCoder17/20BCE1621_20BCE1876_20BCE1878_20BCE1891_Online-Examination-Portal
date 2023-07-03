package com.example.bloodbank

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bloodbank.ui.theme.BloodBankTheme

class infopage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Image(
                painter = painterResource(R.drawable.bloodback), // Replace with your image resource
                contentDescription = "My Image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
                    .height(100.dp)
                    .size(200.dp) // Adjust the size as needed
            )
            val scrollState = rememberScrollState()

            Column() {
//                MyScreen()


            Column (modifier = Modifier
                .fillMaxSize()
                .verticalScroll(state = scrollState),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center)
            {

                Text(
                    text = "News Headlines",
                    textAlign = TextAlign.Justify,
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.padding(bottom = 16.dp)
                )


                PictureWithText1()

                Spacer(modifier = Modifier.height(100.dp))

                PictureWithText2()

                Spacer(modifier = Modifier.height(100.dp))

                PictureWithText3()

                Spacer(modifier = Modifier.height(100.dp))

                PictureWithText4()

               }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyScreen() {
    Box(modifier = Modifier) {
        Column(modifier = Modifier) {
            // Content of the screen
        }
        FloatingActionButton(
            onClick = { /* Handle FAB click */ },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .offset((-16).dp, (-16).dp)
        ) {
            Icon(Icons.Default.Add, contentDescription = "Add")
        }
    }
}







@Composable
fun PictureWithText1() {
    Box(
        modifier = Modifier
    ) {
        // Load your image using an Image composable
        Image(
            painter = painterResource(R.drawable.bb1), // Replace with your image resource
            contentDescription = "My Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.Center)
                .width(380.dp)
                .height(200.dp)
                // Adjust the size as needed
        )

        // Overlay a white background with low opacity
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .align(Alignment.BottomCenter)
                .offset(y = (-20).dp) // Adjust the offset as needed
                .background(Color.White.copy(alpha = 0.3f)), // Apply opacity to the background color
            contentAlignment = Alignment.TopStart // Align the text at the top left of the box
        ) {
            // Add your text content
            Text(
                text = "In a remarkable act of compassion and generosity, Rajesh stepped forward to donate blood, becoming a beacon of hope for those in need. This selfless act showcases the true spirit of humanity and the power of giving.",
                textAlign = TextAlign.Justify,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }

        // Add spacing at the bottom of the image
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
                .background(Color.Transparent)
                .align(Alignment.BottomCenter)
        )
    }
}


@Composable
fun PictureWithText2() {
    Box(
        modifier = Modifier
    ) {
        // Load your image using an Image composable
        Image(
            painter = painterResource(R.drawable.bb2), // Replace with your image resource
            contentDescription = "My Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.Center)
                .width(380.dp)
                .height(200.dp)
        )

        // Overlay a white background with low opacity
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .align(Alignment.BottomCenter)
                .offset(y = (-20).dp) // Adjust the offset as needed
                .background(Color.White.copy(alpha = 0.3f)), // Apply opacity to the background color
            contentAlignment = Alignment.TopStart // Align the text at the top left of the box
        ) {
            // Add your text content
            Text(
                text = "In a landmark development, the esteemed Rotary Blood Bank has announced its move to new, cutting-edge premises, ushering in a new era of advanced facilities and enhanced capabilities. This relocation comes as a significant milestone in the organization's ongoing mission to save lives and serve the community.",
                textAlign = TextAlign.Justify,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }

        // Add spacing at the bottom of the image
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
                .background(Color.Transparent)
                .align(Alignment.BottomCenter)
        )
    }
}

@Composable
fun PictureWithText3() {
    Box(
        modifier = Modifier
    ) {
        // Load your image using an Image composable
        Image(
            painter = painterResource(R.drawable.bb3), // Replace with your image resource
            contentDescription = "My Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.Center)
                .width(380.dp)
                .height(200.dp)
        )

        // Overlay a white background with low opacity
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .align(Alignment.BottomCenter)
                .offset(y = (-20).dp) // Adjust the offset as needed
                .background(Color.White.copy(alpha = 0.3f)), // Apply opacity to the background color
            contentAlignment = Alignment.TopStart // Align the text at the top left of the box
        ) {
            // Add your text content
            Text(
                text = "Uttar Pradesh Special Task Force (UPSTF) busted a gang of seven members who used to smuggle human blood units donated to a charitable institute in Rajasthan and sell them through blood banks in Lucknow and other parts of UP. Those arrested include owners of two blood banks in Lucknow along with five others. They were arrested from Thakurganj.",
                textAlign = TextAlign.Justify,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }

        // Add spacing at the bottom of the image
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
                .background(Color.Transparent)
                .align(Alignment.BottomCenter)
        )
    }
}

@Composable
fun PictureWithText4() {
    Box(
        modifier = Modifier
    ) {
        // Load your image using an Image composable
        Image(
            painter = painterResource(R.drawable.bb4), // Replace with your image resource
            contentDescription = "My Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.Center)
                .width(380.dp)
                .height(200.dp)
        )

        // Overlay a white background with low opacity
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .align(Alignment.BottomCenter)
                .offset(y = (-20).dp) // Adjust the offset as needed
                .background(Color.White.copy(alpha = 0.4f)), // Apply opacity to the background color
            contentAlignment = Alignment.TopStart // Align the text at the top left of the box
        ) {
            // Add your text content
            Text(
                text = "The members of the NCC unit of Union Christian College donated blood at the regional blood transfusion centre, district hospital, Aluva. Dr. N Vijayakumar, Medical Officer IMA BloodBank Aluva, Sri Victor, Blood Bank Counselor, Maj KS Narayanan, NCC Officer, UC College Aluva, and 12 NCC Cadets of UC College Aluva Participated in the program.",
                textAlign = TextAlign.Justify,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }

        // Add spacing at the bottom of the image
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
                .background(Color.Transparent)
                .align(Alignment.BottomCenter)
        )
    }
}




