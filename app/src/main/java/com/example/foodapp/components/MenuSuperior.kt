package com.example.foodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodapp.ui.theme.orange

@Composable
fun MenuSuperior(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // Header con imagen de perfil, saludo y boton
        IconButton(
            onClick = {
                println("Perfil")
            }
        ) {
            Icon(
                imageVector = Icons.Default.Person,
                tint = Color.White,
                contentDescription = "Profile",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(orange)

            )
        }
        Text(text="Hola Mariana!", fontWeight = FontWeight.Bold, fontSize = 25.sp, modifier = Modifier.padding(end= 120.dp, top= 10.dp))
        IconButton(
            onClick = {
                println("Salida")
            }
        ) {
            Icon(
                imageVector = Icons.Default.ExitToApp,
                tint = orange,
                contentDescription = "Exit",
                modifier = Modifier
                    .size(40.dp)

            )
        }
    }
}