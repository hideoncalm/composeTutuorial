package com.rikkeisoft.jetpackcompose.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Column can scroll
 */

@Composable
fun ScrollColumn() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier.verticalScroll(state = scrollState)
    ) {
        for (i in 1..50) {
            Text(
                text = "Item $i",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 10.dp,
                        vertical = 5.dp
                    )
                    .background(Color.Green)
            )
        }
        Log.d("state", scrollState.value.toString())
    }
}


/**
 *  Lazy Column
 */

@Composable
fun LazyScrollColumn() {
    val state = rememberLazyListState()
    LazyColumn(
        state = state
    ) {
        itemsIndexed(
            listOf("This", "is", "Jetpack", "Compose")
        ){ index, string ->
            Text(
                text = string,
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 10.dp,
                        vertical = 5.dp
                    )
                    .background(Color.Green)
            )
        }
//        items(50) {
//            Text(
//                text = "Item $it",
//                fontSize = 20.sp,
//                color = Color.White,
//                fontWeight = FontWeight.Bold,
//                textAlign = TextAlign.Center,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(
//                        horizontal = 10.dp,
//                        vertical = 5.dp
//                    )
//                    .background(Color.Green)
//            )
//        }
        Log.d("state", state.firstVisibleItemIndex.toString())
    }
}