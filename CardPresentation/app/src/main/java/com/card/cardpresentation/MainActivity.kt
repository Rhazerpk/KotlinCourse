package com.card.cardpresentation

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.layout.ContentScale
import com.card.cardpresentation.ui.theme.CardPresentationTheme
import androidx.compose.foundation.layout.size
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import com.card.cardpresentation.ui.theme.AverageGreen
import com.card.cardpresentation.ui.theme.DarkNavy
import com.card.cardpresentation.ui.theme.Green10


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardPresentationTheme {
                CardImage()
            }
        }
    }
}


@Composable
fun CardImage(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Green10),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
            Image(
                painter = painterResource(id = R.drawable.albert),
                contentDescription = "Card",
                modifier = Modifier
                    .size(250.dp)
                    .padding(bottom = 16.dp),
                contentScale = ContentScale.Fit,
                alignment = Alignment.TopCenter
            )

            Text(
                text = "Albert Delgado",
                fontSize = 50.sp,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 8.dp)
            )


            Text(
                text = "Android Developer",
                fontSize = 20.sp,
                color = AverageGreen,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
            .padding(top = 600.dp),

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "Contact Icon",
                modifier = Modifier.size(24.dp),
                tint = AverageGreen
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "+1 (849)-472-4882",
                fontSize = 16.sp,
                color = AverageGreen
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = "Share Icon",
                modifier = Modifier.size(24.dp),
                tint = AverageGreen
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "@Albert.dmm",
                fontSize = 16.sp,
                color = AverageGreen
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email Icon",
                modifier = Modifier.size(24.dp),
                tint = AverageGreen
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "adelgado@hptronics.com",
                fontSize = 16.sp,
                color = AverageGreen
            )
        }
    }
}

@Preview
@Composable
fun CardPreview() {
    CardPresentationTheme {
        CardImage()
    }
}





