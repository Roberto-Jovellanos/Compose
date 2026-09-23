package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.ComposeTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PantallaActividades()
                }
            }
        }
    }
}


@Composable
fun ActividadItem(
    nombre: String,
    categoria: String
){

    Column(
        modifier = Modifier.padding(16.dp),

    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "Imagen de la actividad",
            modifier = Modifier.size(200.dp)
        )
        Text(text = nombre)
        Text(text = categoria)

        Button(
            onClick = {
                //acción al pulsar
            }
        ) {
            Text("Continuar")
        }
    }
}



@Composable
fun PantallaActividades() {
    Column {
        ActividadItem(
            nombre = "Taller de Android",
            categoria = "Tecnología"
        )

        ActividadItem(
            nombre = "Ruta de senderismo",
            categoria = "Deporte"
        )
    }
}


