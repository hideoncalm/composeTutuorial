package com.rikkeisoft.jetpackcompose.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

@Composable
fun StylingText() {
    Text(text = buildAnnotatedString {
        withStyle(style = SpanStyle(
            color = Color.Green,
            fontSize = 50.sp
        )){
            append("Q")
        }
        append("uyen")
    })
}