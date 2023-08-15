package com.kotlin.practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kotlin.practice.ui.theme.PracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeTheme {

            }
        }
    }
}
@Composable
fun GreetingImage(modifier: Modifier = Modifier) {


    Column {
        Image(
            painterResource(id = R.drawable.bg_compose_background),
            contentDescription = "Card"
        )
        Text(
            text = "Jetpack Compose Tutorial",
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI." +
                    " Compose simplifies and accelerates UI development on Android " +
                    "with less code, powerful tools, and intuitive Kotlin APIs.",
            modifier = Modifier.padding(16.dp)


            )
        Text(
            text = "In this tutorial, you build a simple UI component with " +
                    "declarative functions. You call Compose functions to say what " +
                    "elements you want and the Compose compiler does the rest. " +
                    "Compose is built around Composable functions. " +
                    "These functions let you define your app\\'s UI programmatically " +
                    "because they let you describe how it should look and provide data" +
                    " dependencies, rather than focus on the process of the UI\\'s " +
                    "construction, such as initializing an element and then attaching " +
                    "it to a parent. To create a Composable function, " +
                    "you add the @Composable annotation to the function name.",
            Modifier.padding(16.dp),

        )
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = "Completed",
            Modifier.align(CenterHorizontally)

        )

    }
}

//All task prueba

@Composable
fun Alltask() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = "Task Completed",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(200.dp)
                .align(CenterHorizontally)
        )
        Text(
            text = "All tasks completed",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
                .align(CenterHorizontally)
        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 8.dp)
                .align(CenterHorizontally)

        )
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(androidx.compose.material3.R.string.dialog),
                description = stringResource(androidx.compose.ui.R.string.selected),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.app_name),
                description = stringResource(androidx.compose.material3.R.string.collapsed),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            Modifier.weight(1f)
        ) {
            ComposableInfoCard(
                title = stringResource(androidx.compose.ui.R.string.default_error_message),
                description = stringResource(androidx.compose.ui.R.string.dropdown_menu),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(androidx.compose.material3.R.string.expanded),
                description = stringResource(androidx.compose.ui.R.string.indeterminate),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PracticeTheme {
//        Alltask()
       GreetingImage()
//        ComposeQuadrantApp()
    }
}