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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.ComposeTheme
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PantallaInscripcion(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTheme {
        Greeting("Android")
    }
}

@Composable
fun Titulo(texto: String) {
    Text(text = texto)
}

@Composable
fun ActividadItem(
    nombre: String,
    categoria: String
) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {

    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){

    }
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "Imagen de la actividad",
            modifier = Modifier.size(200.dp)
        )


        Text(text = nombre)
        Text(text = categoria)

        Button(
            onClick = { }
        ) {
            Text("Ver detalle")
        }
    }
}

@Composable
fun CampoNombre(
    nombre: String,
    onNombreChange: (String) -> Unit
) {
    TextField(
        value = nombre,
        onValueChange = onNombreChange,
        label = { Text("Nombre") }
    )
}

@Composable
fun CampoEmail(
    email: String,
    onEmailChange: (String) -> Unit
) {
    TextField(
        value = email,
        onValueChange = onEmailChange,
        label = { Text("Email") }
    )
}



@Composable
fun PantallaActividades() {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {




        Contador()



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


@Composable
fun Contador(modifier : Modifier = Modifier) {

    var contador by remember {
        mutableIntStateOf(0)
    }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {

        Text("Has pulsado $contador veces")

        Button(
            onClick = {
                contador+=2
            }
        ) {
            Text("Pulsar")
        }
    }
}