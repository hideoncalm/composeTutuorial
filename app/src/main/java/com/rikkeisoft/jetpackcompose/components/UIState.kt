package com.rikkeisoft.jetpackcompose.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

/**
 *  State la trang thai cua UI => UI hien thi nhu the nao tai 1 thoi diem
 */

@Composable
fun ColorBox(modifier: Modifier = Modifier) {
    val color: MutableState<Color> = remember {
            mutableStateOf(Color.Yellow)   // tranh viec moi lan reCompose lai reset lai value
        }
    Box(modifier = modifier
        .background(color.value)
        .clickable {
            color.value = Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            )
        })
}