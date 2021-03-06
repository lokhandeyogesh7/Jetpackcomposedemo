package com.example.androiddevchallenge.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.androiddevchallenge.component.ListItem
import com.example.androiddevchallenge.model.Pets

@OptIn(ExperimentalFoundationApi::class)
@Composable
@Preview
fun PetList(navController: NavController) {

    val pets = Pets.getPetsList()
    Surface(color = MaterialTheme.colors.background) {
        Column {
            LazyVerticalGrid(
                cells = GridCells.Fixed(1),
            ) {
                itemsIndexed(pets) { index, pet ->
                   ListItem(pet, navController, index)
                }
            }
        }

    }

}