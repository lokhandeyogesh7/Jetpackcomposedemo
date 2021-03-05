package com.example.androiddevchallenge.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun RoundCorner(textStr:String){
    Text(text = textStr,
        color = Color.White,
    modifier = Modifier
        .background(color = Color.Magenta,shape = RoundedCornerShape(5.dp)).padding(top = 3.dp,bottom = 3.dp,start = 8.dp,end = 8.dp),
    )
}