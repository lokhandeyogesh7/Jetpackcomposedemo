package com.example.androiddevchallenge.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androiddevchallenge.model.Pets
import com.example.androiddevchallenge.ui.theme.typography

@Preview
@Composable
fun ListItem(pets: Pets, navController: NavController, index: Int) {
   /* Card(
        elevation = 16.dp,
        shape = RoundedCornerShape(32.dp),
        modifier = Modifier
            .padding(8.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy((-15).dp),
        ) {
            Image(
                painter = painterResource(id = pets.photo),
                contentDescription = "Pets Pics",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color.Blue,
                        shape = RoundedCornerShape(16.dp),
                    )
                    .padding(16.dp)
            ) {
                Column {
                    Text(text = pets.name, style = typography.body1, fontWeight = FontWeight.Bold, color = Color.Cyan)
                    Text(text = pets.shortDescription, style = typography.overline, color = Color.Cyan)
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.padding(top = 4.dp)
                    ) {
                       *//* Chip(content = pets.age)
                        Chip(content = pets.gender)*//*
                    }
                }
            }
        }
    }*/
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 4.dp,
        modifier = Modifier.padding(start = 10.dp,end = 10.dp,top = 5.dp,bottom = 5.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
        )
        {
            Card(
                shape = CircleShape,
                modifier = Modifier
                    .width(125.dp)
                    .height(125.dp)
                    .padding(10.dp)
            ) {
                Image(
                    painter = painterResource(id = pets.photo),
                    contentDescription = "logo",
                    contentScale = ContentScale.Crop
                )
            }
            Column() {
                Text(
                    text = pets.name,
                    modifier = Modifier.padding(top = 10.dp, end = 10.dp, bottom = 5.dp),
                    style = typography.h1
                )
                Text(
                    text = pets.age,
                    modifier = Modifier.padding(end = 10.dp, bottom = 5.dp),
                    style = typography.body1
                )
                Text(
                    text = pets.shortDescription,
                    modifier = Modifier.padding(end = 10.dp, bottom = 16.dp),
                    style = typography.body1
                )
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    RoundCorner(textStr = pets.gender)
                    RoundCorner(textStr = pets.category)
                }
            }
        }
    }
}