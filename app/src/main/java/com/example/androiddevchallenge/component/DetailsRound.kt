package com.example.androiddevchallenge.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.typography

@Preview
@Composable
fun DetailsRound(textStr: String, heading: String) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 4.dp,
        modifier = Modifier
            .padding(10.dp)
            .width(90.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.wrapContentWidth()
        ) {
            Text(
                text = heading,
                style = typography.h3,
                modifier = Modifier
                    .padding(top = 10.dp, end = 5.dp, bottom = 5.dp, start = 5.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(
                text = textStr,
                style = typography.h2,
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp, bottom = 10.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
    }
}