package com.rikkeisoft.jetpackcompose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

val customModifier = Modifier
    .background(Color.Green)
    .fillMaxHeight(0.3f)
    .width(300.dp)
    .requiredWidth(500.dp) // set width 500 dp => phan thua ra khoi size man hinh se khong hien thi
    .padding(5.dp)
//    .clickable {  }
//    .border()
//    .offset()  // co ban giong margin

// De set khoang cach giua cac view dung Spacer