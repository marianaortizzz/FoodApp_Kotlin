package com.example.foodapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.foodapp.data_classes.Category
import com.example.foodapp.data_classes.Food
import com.example.foodapp.data_classes.Restaurant
import com.example.foodapp.ui.theme.FoodAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }
}

@Composable
fun MainPage(){
    val categories = listOf<Category>(
        Category(name = "Fast food", imageUrl = "https://static.vecteezy.com/system/resources/previews/000/964/198/non_2x/fast-food-meal-set-vector.jpg"),
        Category(name = "Chinese", imageUrl = "https://cdn-icons-png.freepik.com/512/1046/1046791.png"),
        Category(name = "Italian", imageUrl = "https://cdn-icons-png.freepik.com/512/6045/6045709.png"),
        Category(name = "Mexican", imageUrl = "https://cdn-icons-png.flaticon.com/512/6045/6045803.png"),
        Category(name = "Breakfast", imageUrl = "https://cdn-icons-png.flaticon.com/512/9008/9008111.png"),
        Category(name = "Desserts", imageUrl = "https://cdn-icons-png.flaticon.com/512/5347/5347946.png"),
    )
    val restaurants = listOf<Restaurant>(
        Restaurant(name = "KFC", logoUrl = "https://upload.wikimedia.org/wikipedia/sco/thumb/b/bf/KFC_logo.svg/1200px-KFC_logo.svg.png", category = categories[0]),
        Restaurant(name = "Panda express", logoUrl = "https://logos-world.net/wp-content/uploads/2022/02/Panda-Express-Logo-1983.png", category = categories[1]),
        Restaurant(name = "Domino´s", logoUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Domino%27s_pizza_logo.svg/2036px-Domino%27s_pizza_logo.svg.png", category = categories[2]),
        Restaurant(name = "Tacos El Pata", logoUrl = "https://www.tacoselpataedomex.com/templates/yootheme/cache/logo_tacoselpata-1fb08e78.png", category = categories[3]),
        Restaurant(name = "VIPS", logoUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/VIPS_Logo_Mexico_01.2024.svg/1200px-VIPS_Logo_Mexico_01.2024.svg.png", category = categories[4]),
        Restaurant(name = "Krispy Kreme", logoUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Krispy_Kreme_logo.svg/1024px-Krispy_Kreme_logo.svg.png", category = categories[5]),
    )

    val foods = listOf<Food>(
        Food(name="Chicken Tenders", rating= 4.4f, price= 123.50f, imageUrl = "https://images.ctfassets.net/crbk84xktnsl/5bzyC5nU0EWLliOSuJf09e/282491b0e6b332fb36fc46f7398b62f8/J5416_23P02__8_Boxes_Original_Tenders_8.png", restaurant= restaurants[0]),
        Food(name="Orange Chicken", rating= 4.8f, price= 142.00f, imageUrl = "https://s3.us-east-1.amazonaws.com/PandaExpressWebsite/www/hoc25/wt/hoc-bowl.png", restaurant= restaurants[1]),
        Food(name="Pizza Pepperoni", rating= 3.5f, price= 230.50f, imageUrl = "https://pizzapub.com.mx/cdn/shop/products/44-pepperoni_fded72be-bee0-473f-8804-f837cbbe81e1_1024x1024.png?v=1619715093", restaurant= restaurants[2]),
        Food(name="Tacos de Pastor", rating= 4.1f, price= 98.00f, imageUrl = "https://static.vecteezy.com/system/resources/previews/048/928/341/non_2x/tacos-de-carnitas-isolated-on-transparent-background-free-png.png", restaurant= restaurants[3]),
        Food(name="Molletes", rating= 4.5f, price= 140.0f, imageUrl = "https://tofuu.getjusto.com/buckets-prod%2FT4BwpENc3kBe2QrBD-DESAYUNOS%20DE%20LA%20CASA.png", restaurant= restaurants[4]),
        Food(name="Glazed Dozen", rating= 5.0f, price= 220.0f, imageUrl = "https://www.pikpng.com/pngl/b/452-4523214_donut-png-tumblr.png", restaurant= restaurants[5]),
    )


}


@Preview(showBackground = true)
@Composable
fun MainPreview() {
    FoodAppTheme {

    }
}