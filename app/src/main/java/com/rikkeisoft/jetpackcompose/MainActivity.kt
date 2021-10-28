package com.rikkeisoft.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rikkeisoft.jetpackcompose.components.CustomConstrainLayout
import com.rikkeisoft.jetpackcompose.components.ImageCardRounded
import com.rikkeisoft.jetpackcompose.components.StylingText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomConstrainLayout()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
//    ViewFollowColumn()
//    ViewFollowRow()
    }

    @Composable
    fun ImageViewFormat() {
        val painter = painterResource(id = R.drawable.jisoo)
        val description = "Le Ngoc Quyen"
        val title = "Le Ngoc Quyen"
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(15.dp)
            )
            {
                ImageCardRounded(painter = painter, contentDescription = description, title = title)

            }
            StylingText()
        }
    }
}