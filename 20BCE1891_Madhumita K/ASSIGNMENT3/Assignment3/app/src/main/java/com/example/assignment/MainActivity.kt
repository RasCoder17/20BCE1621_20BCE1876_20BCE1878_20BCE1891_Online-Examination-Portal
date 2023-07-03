package com.example.assignment

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class YouTubeLink(val title: String, val url: String)

val youtubeLinks = listOf(
    YouTubeLink("Video 1", "https://www.youtube.com/watch?v=0lWGfN9XRwM"),
    YouTubeLink("Video 2", "https://www.youtube.com/watch?v=NxvS-Uzjueg"),
    YouTubeLink("Video 3", "https://www.youtube.com/watch?v=AgyTHzjBS-c")
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

        val linearLayout = LinearLayout(this)
        linearLayout.layoutParams = layoutParams
        linearLayout.orientation = LinearLayout.VERTICAL
        linearLayout.setPadding(16, 16, 16, 16)
        linearLayout.setBackgroundColor(0xFF0000) // Red color

        val textView = TextView(this)
        textView.layoutParams = layoutParams
        textView.setTextColor(0xFFFFFF) // White color

        linearLayout.addView(textView)

        setContent {
            MyApp {
                YouTubeLinkScreen()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    MaterialTheme {
        Surface {
            content()
        }
    }
}

@Composable
fun YouTubeLinkScreen() {
    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "YouTube Videos",
            modifier = Modifier.padding(bottom = 16.dp)
        )
        youtubeLinks.forEach { link ->
            YouTubeLinkItem(link)
        }
    }
}

@Composable
fun YouTubeLinkItem(link: YouTubeLink) {
    val context = LocalContext.current
    Text(
        text = link.title,
        modifier = Modifier
            .padding(bottom = 8.dp)
            .clickable { openVideo(context, link.url) }
    )
}

fun openVideo(context: Context, url: String) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    intent.setPackage("com.google.android.youtube")
    if (intent.resolveActivity(context.packageManager) != null) {
        context.startActivity(intent)
    } else {
        // If YouTube app is not available, open the link in a web browser
        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }
}