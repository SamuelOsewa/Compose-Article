package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    // ComposeArticle()
                }
            }
        }
    }
}

@Composable
fun ComposeArticle(heading: String, intro: String, body: String) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column() {
        Image(painter = image, contentDescription = null,
            modifier = Modifier.padding(bottom = 24.dp))
        Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {
            Text(text = heading, modifier = Modifier.padding(bottom = 13.dp), fontSize = 20.sp)
            Text(text = intro, modifier = Modifier.padding(bottom = 16.dp), fontSize = 14.sp, textAlign = TextAlign.Justify)
            Text(text = body, fontSize = 14.sp, textAlign = TextAlign.Justify)
        }
    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ComposePreview() {
    ComposeArticleTheme {
        ComposeArticle(heading = stringResource(R.string.compose_heading),
                       intro = stringResource(id = R.string.compose_intro),
                       body = stringResource(id = R.string.compose_main))
    }
}