package com.example.foodapp.data_classes

data class Food(
    val name : String,
    val rating: Float,
    val price : Float,
    val imageUrl : String,
    val restaurant: Restaurant
)
