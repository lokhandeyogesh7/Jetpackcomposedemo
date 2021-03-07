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
fun RoundCorner(textStr: String) {
    Text(
        text = textStr,
        color = when (textStr) {
            "Male" -> {
                Color.Blue
            }
            "Dog" -> {
                Color.Red
            }
            "Cat" -> {
                Color.Black
            }
            else -> {
                Color(android.graphics.Color.parseColor("#FF1493"))
            }
        },
        modifier = Modifier
            .background(
                color = when (textStr) {
                    "Male" -> {
                        Color.Blue.copy(0.08f)
                    }
                    "Dog" -> {
                        Color.Red.copy(0.08f)
                    }
                    "Cat" -> {
                        Color.Black.copy(0.08f)
                    }
                    else -> {
                        Color(android.graphics.Color.parseColor("#FF1493")).copy(0.08f)
                    }
                }, shape = RoundedCornerShape(5.dp)
            )
            .padding(top = 6.dp, bottom = 6.dp, start = 12.dp, end = 12.dp),
    )
}