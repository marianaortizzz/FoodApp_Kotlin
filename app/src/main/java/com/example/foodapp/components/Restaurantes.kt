package com.example.foodapp.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableTarget
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.foodapp.R
import com.example.foodapp.data_classes.Restaurant

@Composable
fun Restaurantes(restaurant: Restaurant){
    Column(
        modifier = Modifier
            .padding(10.dp)
        , horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier
                .size(90.dp)
        ){
            AsyncImage(
                model = restaurant.logoUrl,
                contentDescription = restaurant.name,
                modifier = Modifier.fillMaxSize(),
                placeholder = painterResource(R.drawable.ic_launcher_background),
                contentScale = ContentScale.Crop
            )
        }
        Text(text= restaurant.name)
    }
}