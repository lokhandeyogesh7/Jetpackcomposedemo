package com.example.androiddevchallenge.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.component.DetailsRound
import com.example.androiddevchallenge.model.Pets
import com.example.androiddevchallenge.ui.theme.typography

/*
@Preview
@Composable
class PetDetails(navController: NavHostController, string: String?) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme() {
                petDetailsScreen()
            }
        }
    }
*/
@Preview
@Composable
fun petDetailsScreen(navController: NavHostController, index: String?) {
    Surface(color = MaterialTheme.colors.background) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            val selectedPet = Pets.getPetsList()[index!!.toInt()]
            Image(
                painter = painterResource(id = selectedPet.photo),
                contentDescription = "Images",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
            )
            Row {
                Text(
                    text = "Details",
                    style = typography.h1,
                    modifier = Modifier.padding(
                        top = 10.dp,
                        start = 8.dp,
                        end = 8.dp,
                        bottom = 5.dp
                    )
                )
            }
            Text(
                text = stringResource(id = R.string.lorem),
                style = typography.body1,
                modifier = Modifier.padding(start = 8.dp, end = 8.dp, bottom = 5.dp)
            )
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                DetailsRound(textStr = selectedPet.age, heading = "Age")
                DetailsRound(textStr = selectedPet.weight, heading = "Weight")
                DetailsRound(textStr = selectedPet.color, heading = "Color")
            }
            Button(
                onClick = { /*TODO*/ }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                shape = RoundedCornerShape(8.dp),
            ) {
                Text(text = "Adopt me !!", style = typography.h2)

            }
        }
    }
}
//}