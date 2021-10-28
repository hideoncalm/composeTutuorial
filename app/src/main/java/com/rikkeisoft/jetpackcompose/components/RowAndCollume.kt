package com.rikkeisoft.jetpackcompose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ViewFollowColumn() {
    Column(
        modifier = Modifier
//            .fillMaxSize() // full size man hinh
//            .fillMaxSize(0.5f) // 50% man hinh
//            .fillMaxWidth(0.5f) //50% chieu rong
//            .fillMaxHeight(1f)
            .width(200.dp)
            .height(200.dp)
            .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Le Ngoc Quyen")
        Text(text = "Quyen Ngoc Le")
        Text(text = "Quyen Ngoc Le")
    }
}


@Composable
fun ViewFollowRow() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Le Ngoc Quyen")
        Text(text = "Quyen Ngoc Le")
        Text(text = "Quyen Ngoc Le")
    }
}